package com.example.nataliia.task2_deshkonataliia;

import android.app.Application;
import android.content.res.Configuration;

import java.util.ArrayList;
import java.util.List;

public class ApplicationSubclass extends Application {

    private ArrayList<DataSet> mDataSet_in_progress, mDataSet_done, mDataSet_waiting;
    private RecyclerViewAdapter mAdapter_in_progress,mAdapter_done;
    private static ApplicationSubclass singleton;

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mAdapter_in_progress = new RecyclerViewAdapter(DataSet.setDataInProgress());
        mAdapter_done = new RecyclerViewAdapter(DataSet.setDataDone());

        this.mDataSet_in_progress = DataSet.setDataInProgress();
        this.mDataSet_done = DataSet.setDataDone();
        this.mDataSet_waiting = DataSet.setDataWaiting();
        singleton = this;
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

    }

    public ApplicationSubclass getInstance() {
        return singleton;
    }

    public ArrayList<DataSet> getmDataSet_in_progress() {
        return mDataSet_in_progress;
    }

    public ArrayList<DataSet> getmDataSet_waiting() {
        return mDataSet_waiting;
    }

    public ArrayList<DataSet> getmDataSet_done() {
        return mDataSet_done;
    }


    public RecyclerViewAdapter getmAdapter_done() {
        return mAdapter_done;
    }

    public RecyclerViewAdapter getmAdapter_in_progress() {
        return mAdapter_in_progress;
    }
}
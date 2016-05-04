package com.example.nataliia.task2_deshkonataliia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.shamanland.fab.FloatingActionButton;
import com.shamanland.fab.ShowHideOnScroll;

public class WaitingFragment extends Fragment {

    private ListViewAdapter mAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.waiting_tab_layout, null);
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mAdapter = new ListViewAdapter(getActivity(), DataSet.setDataWaiting(getActivity()));

        ListView listView = (ListView) getActivity().findViewById(R.id.list_view);
        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);
        if (listView != null) {
            listView.setAdapter(mAdapter);
            listView.setOnTouchListener(new ShowHideOnScroll(fab));
        }
    }
}

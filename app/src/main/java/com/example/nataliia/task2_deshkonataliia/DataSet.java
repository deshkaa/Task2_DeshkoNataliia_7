package com.example.nataliia.task2_deshkonataliia;

import android.app.Activity;

import java.io.Serializable;
import java.util.ArrayList;

public class DataSet implements Serializable {

    private String mDataTitle;
    private String mDataAddress;
    private String mDataDate;
    private String mDataDaysNumber;
    private int mDataLikesNumber;
    private int mDataImageResourceId;
    private String mData1, mData2;
    private String mMainText;
    private String mResponsible;
    private String mStatus;
    private String mTitleNumber;

    public DataSet(String title,
                   String address,
                   String date,
                   String daysNumber,
                   int likesNumber,
                   int imageResId,
                   String data1,
                   String data2,
                   String mainText,
                   String responsible,
                   String status,
                   String titleNumber) {

        mDataTitle = title;
        mDataAddress = address;
        mDataDate = date;
        mDataDaysNumber = daysNumber;
        mDataLikesNumber = likesNumber;
        mDataImageResourceId = imageResId;
        mData1 = data1;
        mData2 = data2;
        mMainText = mainText;
        mResponsible = responsible;
        mStatus = status;
        mTitleNumber = titleNumber;
    }

    public static ArrayList<DataSet> setDataInProgress(Activity activity) {
        ArrayList<DataSet> dataSet = new ArrayList<>();
        dataSet.add(new DataSet(activity.getResources().getString(R.string.in_progress_dismantling_title), activity.getString(R.string.in_progress_dismanting_address), activity.getString(R.string.in_progress_dismanting_date), activity.getString(R.string.in_progress_dismanting_days), Integer.parseInt(activity.getString(R.string.in_progress_dismanting_likes)), R.drawable.ic_menu_send, activity.getString(R.string.in_progress_dismanting_date1), activity.getString(R.string.in_progress_dismanting_date2), activity.getString(R.string.in_progress_dismanting_problem_description), activity.getString(R.string.in_progress_dismanting_responsible), activity.getString(R.string.in_progress_dismanting_state), activity.getString(R.string.in_progress_dismanting_number)));
        dataSet.add(new DataSet(activity.getString(R.string.in_progress_electricity_title), activity.getString(R.string.in_progress_electricity_address), activity.getString(R.string.in_progress_electricity_date), activity.getString(R.string.in_progress_electricity_days), Integer.parseInt(activity.getString(R.string.likes)), R.drawable.ic_menu_gallery, activity.getString(R.string.in_progress_electricity_date1), activity.getString(R.string.in_progress_electricity_date2), activity.getString(R.string.in_progress_electricity_problem_description), activity.getString(R.string.in_progress_electricity_responsible), activity.getString(R.string.in_progress_electricity_state), activity.getString(R.string.in_progress_electricity_number)));
        dataSet.add(new DataSet(activity.getString(R.string.in_progress_elevators_title), activity.getString(R.string.in_progress_elevators_address), activity.getString(R.string.in_progress_elevators_date), activity.getString(R.string.in_progress_elevators_days), Integer.parseInt(activity.getString(R.string.in_progress_elevators_likes)), R.drawable.ic_menu_camera, activity.getString(R.string.in_progress_elevators_date1), activity.getString(R.string.in_progress_elevators_date2), activity.getString(R.string.in_progress_elevators_problem_description), activity.getString(R.string.in_progress_elevators_responsible), activity.getString(R.string.in_progress_elevators_state), activity.getString(R.string.in_progress_elevators_number)));
        dataSet.add(new DataSet(activity.getString(R.string.in_progress_territory_title), activity.getString(R.string.in_progress_territory_address), activity.getString(R.string.in_progress_territory_date), activity.getString(R.string.in_progress_territory_days), Integer.parseInt(activity.getString(R.string.in_progress_territory_likes)), R.drawable.ic_menu_manage, activity.getString(R.string.in_progress_territory_date1), activity.getString(R.string.in_progress_territory_date2), activity.getString(R.string.in_progress_territory_problem_description), activity.getString(R.string.in_progress_territory_responsible), activity.getString(R.string.in_progress_territory_state), activity.getString(R.string.in_progress_territory_number)));
        dataSet.add(new DataSet(activity.getString(R.string.in_progress_municipal_economy_title), activity.getString(R.string.in_progress_municipal_economy_address), activity.getString(R.string.in_progress_municipal_economy_date), activity.getString(R.string.in_progress_municipal_economy_days), Integer.parseInt(activity.getString(R.string.in_progress_municipal_economy_likes)), R.drawable.ic_menu_share, activity.getString(R.string.in_progress_municipal_economy_date1), activity.getString(R.string.in_progress_municipal_economy_date2), activity.getString(R.string.in_progress_municipal_economy_problem_description), activity.getString(R.string.in_progress_municipal_economy_responsible), activity.getString(R.string.in_progress_municipal_economy_state), activity.getString(R.string.in_progress_municipal_economy_number)));
        dataSet.add(new DataSet(activity.getString(R.string.in_progress_building1_title), activity.getString(R.string.in_progress_building1_address), activity.getString(R.string.in_progress_building1_date), activity.getString(R.string.in_progress_building1_days), Integer.parseInt(activity.getString(R.string.in_progress_building1_likes)), R.drawable.ic_menu_slideshow, activity.getString(R.string.in_progress_building1_date1), activity.getString(R.string.in_progress_building1_date2), activity.getString(R.string.in_progress_building1_problem_description), activity.getString(R.string.in_progress_building1_responsible), activity.getString(R.string.in_progress_building1_state), activity.getString(R.string.in_progress_building1_number)));
        dataSet.add(new DataSet(activity.getString(R.string.in_progress_building2_title), activity.getString(R.string.in_progress_building2_address), activity.getString(R.string.in_progress_building2_date), activity.getString(R.string.in_progress_building2_days), Integer.parseInt(activity.getString(R.string.in_progress_building2_likes)), R.drawable.ic_plus, activity.getString(R.string.in_progress_building2_date1), activity.getString(R.string.in_progress_building2_date2), activity.getString(R.string.in_progress_building2_problem_description), activity.getString(R.string.in_progress_building2_responsible), activity.getString(R.string.in_progress_building2_state), activity.getString(R.string.in_progress_building2_number)));
        dataSet.add(new DataSet(activity.getString(R.string.in_progress_road_service_title), activity.getString(R.string.in_progress_road_service_address), activity.getString(R.string.in_progress_road_service_date), activity.getString(R.string.in_progress_road_service_days), Integer.parseInt(activity.getString(R.string.in_progress_road_service_likes)), R.drawable.ic_menu_applications_24dp, activity.getString(R.string.in_progress_road_service_date1), activity.getString(R.string.in_progress_road_service_date2), activity.getString(R.string.in_progress_road_service_problem_description), activity.getString(R.string.in_progress_road_service_responsible), activity.getString(R.string.in_progress_road_service_state), activity.getString(R.string.in_progress_road_service_number)));
        dataSet.add(new DataSet(activity.getString(R.string.in_progress_waterworks_title), activity.getString(R.string.in_progress_waterworks_address), activity.getString(R.string.in_progress_waterworks_date), activity.getString(R.string.in_progress_waterworks_days), Integer.parseInt(activity.getString(R.string.in_progress_waterworks_likes)), R.drawable.ic_menu_send, activity.getString(R.string.in_progress_waterworks_date1), activity.getString(R.string.in_progress_waterworks_date2), activity.getString(R.string.in_progress_waterworks_problem_description), activity.getString(R.string.in_progress_waterworks_responsible), activity.getString(R.string.in_progress_waterworks_state), activity.getString(R.string.in_progress_waterworks_number)));
        dataSet.add(new DataSet(activity.getString(R.string.in_progress_heightworks_title), activity.getString(R.string.in_progress_heightworks_address), activity.getString(R.string.in_progress_heightworks_date), activity.getString(R.string.in_progress_heightworks_days), Integer.parseInt(activity.getString(R.string.in_progress_heightworks_likes)), R.drawable.ic_menu_camera, activity.getString(R.string.in_progress_heightworks_date1), activity.getString(R.string.in_progress_heightworks_date2), activity.getString(R.string.in_progress_heightworks_problem_description), activity.getString(R.string.in_progress_heightworks_responsible), activity.getString(R.string.in_progress_heightworks_state), activity.getString(R.string.in_progress_heightworks_number)));

        return dataSet;
    }

    public static ArrayList<DataSet> setDataDone(Activity activity) {
        ArrayList<DataSet> dataSet = new ArrayList<>();
        dataSet.add(new DataSet(activity.getString(R.string.done_dismantling_title), activity.getString(R.string.done_dismanting_address), activity.getString(R.string.done_dismanting_date), activity.getString(R.string.done_dismanting_days), Integer.parseInt(activity.getString(R.string.done_dismanting_likes)), R.drawable.ic_menu_send, activity.getString(R.string.done_dismanting_date1), activity.getString(R.string.done_dismanting_date2), activity.getString(R.string.done_dismanting_problem_description), activity.getString(R.string.done_dismanting_responsible), activity.getString(R.string.done_dismanting_state), activity.getString(R.string.done_dismanting_number)));
        dataSet.add(new DataSet(activity.getString(R.string.done_electricity_title), activity.getString(R.string.done_electricity_address), activity.getString(R.string.done_electricity_date), activity.getString(R.string.done_electricity_days), Integer.parseInt(activity.getString(R.string.done_electricity_likes)), R.drawable.ic_menu_gallery, activity.getString(R.string.done_electricity_date1), activity.getString(R.string.done_electricity_date2), activity.getString(R.string.done_electricity_problem_description), activity.getString(R.string.done_electricity_responsible), activity.getString(R.string.done_electricity_state), activity.getString(R.string.done_electricity_number)));
        dataSet.add(new DataSet(activity.getString(R.string.done_elevators_title), activity.getString(R.string.done_elevators_address), activity.getString(R.string.done_elevators_date), activity.getString(R.string.done_elevators_days), Integer.parseInt(activity.getString(R.string.done_elevators_likes)), R.drawable.ic_menu_camera, activity.getString(R.string.done_elevators_date1), activity.getString(R.string.done_elevators_date2), activity.getString(R.string.done_elevators_problem_description), activity.getString(R.string.done_elevators_responsible), activity.getString(R.string.done_elevators_state), activity.getString(R.string.done_elevators_number)));
        dataSet.add(new DataSet(activity.getString(R.string.done_territory_title), activity.getString(R.string.done_territory_address), activity.getString(R.string.done_territory_date), activity.getString(R.string.done_territory_days), Integer.parseInt(activity.getString(R.string.done_territory_likes)), R.drawable.ic_menu_manage, activity.getString(R.string.done_territory_date1), activity.getString(R.string.done_territory_date2), activity.getString(R.string.done_territory_problem_description), activity.getString(R.string.done_territory_responsible), activity.getString(R.string.done_territory_state), activity.getString(R.string.done_territory_number)));
        dataSet.add(new DataSet(activity.getString(R.string.done_municipal_economy_title), activity.getString(R.string.done_municipal_economy_address), activity.getString(R.string.done_municipal_economy_date), activity.getString(R.string.done_municipal_economy_days), Integer.parseInt(activity.getString(R.string.done_municipal_economy_likes)), R.drawable.ic_menu_share, activity.getString(R.string.done_municipal_economy_date1), activity.getString(R.string.done_municipal_economy_date2), activity.getString(R.string.done_municipal_economy_problem_description), activity.getString(R.string.done_municipal_economy_responsible), activity.getString(R.string.done_municipal_economy_state), activity.getString(R.string.done_municipal_economy_number)));
        dataSet.add(new DataSet(activity.getString(R.string.done_building1_title), activity.getString(R.string.done_building1_address), activity.getString(R.string.done_building1_date), activity.getString(R.string.done_building1_days), Integer.parseInt(activity.getString(R.string.done_building1_likes)), R.drawable.ic_menu_slideshow, activity.getString(R.string.done_building1_date1), activity.getString(R.string.done_building1_date2), activity.getString(R.string.done_building1_problem_description), activity.getString(R.string.done_building1_responsible), activity.getString(R.string.done_building1_state), activity.getString(R.string.done_building1_numer)));
        dataSet.add(new DataSet(activity.getString(R.string.done_building2_title), activity.getString(R.string.done_building2_address), activity.getString(R.string.done_building2_date), activity.getString(R.string.done_building2_days), Integer.parseInt(activity.getString(R.string.done_building2_likes)), R.drawable.ic_plus, activity.getString(R.string.done_building2_date1), activity.getString(R.string.done_building2_date2), activity.getString(R.string.done_building2_problem_description), activity.getString(R.string.done_building2_responsible), activity.getString(R.string.done_building2_state), activity.getString(R.string.done_building2_number)));
        dataSet.add(new DataSet(activity.getString(R.string.done_road_service_title), activity.getString(R.string.done_road_service_address), activity.getString(R.string.done_road_service_date), activity.getString(R.string.done_road_service_days), Integer.parseInt(activity.getString(R.string.done_road_service_likes)), R.drawable.ic_menu_applications_24dp, activity.getString(R.string.done_road_service_date1), activity.getString(R.string.done_road_service_date2), activity.getString(R.string.done_road_service_problem_description), activity.getString(R.string.done_road_service_responsible), activity.getString(R.string.done_road_service_state), activity.getString(R.string.done_road_service_number)));
        dataSet.add(new DataSet(activity.getString(R.string.done_waterworks_title), activity.getString(R.string.done_waterworks_address), activity.getString(R.string.done_waterworks_date), activity.getString(R.string.done_waterworks_days), Integer.parseInt(activity.getString(R.string.done_waterworks_likes)), R.drawable.ic_menu_send, activity.getString(R.string.done_waterworks_date1), activity.getString(R.string.done_waterworks_date2), activity.getString(R.string.done_waterworks_problem_description), activity.getString(R.string.done_waterworks_responsible), activity.getString(R.string.done_waterworks_state), activity.getString(R.string.done_waterworks_number)));
        dataSet.add(new DataSet(activity.getString(R.string.done_heightworks_title), activity.getString(R.string.done_heightworks_address), activity.getString(R.string.done_heightworks_date), activity.getString(R.string.done_heightworks_days), Integer.parseInt(activity.getString(R.string.done_heightworks_likes)), R.drawable.ic_menu_camera, activity.getString(R.string.done_heightworks_date1), activity.getString(R.string.done_heightworks_date2), activity.getString(R.string.done_heightworks_problem_description), activity.getString(R.string.done_heightworks_responsible), activity.getString(R.string.done_heightworks_state), activity.getString(R.string.done_heightworks_number)));

        return dataSet;
    }

    public static ArrayList<DataSet> setDataWaiting(Activity activity) {
        ArrayList<DataSet> dataSet = new ArrayList<>();
        dataSet.add(new DataSet(activity.getString(R.string.waiting_dismantling_title), activity.getString(R.string.waiting_dismantling_address), activity.getString(R.string.waiting_dismantling_date), activity.getString(R.string.waiting_dismantling_days), Integer.parseInt(activity.getString(R.string.waiting_dismantling_likes)), R.drawable.ic_menu_send, activity.getString(R.string.waiting_dismantling_date1), activity.getString(R.string.waiting_dismantling_date2), activity.getString(R.string.waiting_dismantling_problem_description), activity.getString(R.string.waiting_dismantling_responsible), activity.getString(R.string.waiting_dismantling_waiting), activity.getString(R.string.waiting_dismantling_number)));
        dataSet.add(new DataSet(activity.getString(R.string.waiting_electricity_title), activity.getString(R.string.waiting_electricity_address), activity.getString(R.string.waiting_electricity_date), activity.getString(R.string.waiting_electricity_days), Integer.parseInt(activity.getString(R.string.waiting_electricity_likes)), R.drawable.ic_menu_gallery, activity.getString(R.string.waiting_electricity_date1), activity.getString(R.string.waiting_electricity_date2), activity.getString(R.string.waiting_electricity_problem_description), activity.getString(R.string.waiting_electricity_responsible), activity.getString(R.string.waiting_electricity_state), activity.getString(R.string.waiting_electricity_number)));
        dataSet.add(new DataSet(activity.getString(R.string.waiting_elevators_title), activity.getString(R.string.waitin_elevators_address), activity.getString(R.string.waitin_elevators_date), activity.getString(R.string.waitin_elevators_days), Integer.parseInt(activity.getString(R.string.waitin_elevators_likes)), R.drawable.ic_menu_camera, activity.getString(R.string.waitin_elevators_date1), activity.getString(R.string.waitin_elevators_date2), activity.getString(R.string.waitin_elevators_problem_description), activity.getString(R.string.waitin_elevators_responsible), activity.getString(R.string.waitin_elevators_state), activity.getString(R.string.waitin_elevators_number)));
        dataSet.add(new DataSet(activity.getString(R.string.waiting_territory_title), activity.getString(R.string.waiting_territory_address), activity.getString(R.string.waiting_territory_date), activity.getString(R.string.waiting_territory_days), Integer.parseInt(activity.getString(R.string.waiting_territory_likes)), R.drawable.ic_menu_manage, activity.getString(R.string.waiting_territory_date1), activity.getString(R.string.waiting_territory_date2), activity.getString(R.string.waiting_territory_problem_description), activity.getString(R.string.waiting_territory_responsible), activity.getString(R.string.waiting_territory_state), activity.getString(R.string.waiting_territory_number)));
        dataSet.add(new DataSet(activity.getString(R.string.waiting_municipal_economy_title), activity.getString(R.string.waiting_municipal_economy_address), activity.getString(R.string.waiting_municipal_economy_date), activity.getString(R.string.waiting_municipal_economy_days), Integer.parseInt(activity.getString(R.string.waiting_municipal_economy_likes)), R.drawable.ic_menu_share, activity.getString(R.string.waiting_municipal_economy_date1), activity.getString(R.string.waiting_municipal_economy_date2), activity.getString(R.string.waiting_municipal_economy_problem_description), activity.getString(R.string.waiting_municipal_economy_responsible), activity.getString(R.string.waiting_municipal_economy_state), activity.getString(R.string.waiting_municipal_economy_number)));
        dataSet.add(new DataSet(activity.getString(R.string.waiting_building1_title), activity.getString(R.string.waiting_building1_address), activity.getString(R.string.waiting_building1_date), activity.getString(R.string.waiting_building1_days), Integer.parseInt(activity.getString(R.string.waiting_building1_likes)), R.drawable.ic_menu_slideshow, activity.getString(R.string.waiting_building1_date1), activity.getString(R.string.waiting_building1_date2), activity.getString(R.string.waiting_building1_problem_description), activity.getString(R.string.waiting_building1_responsible), activity.getString(R.string.waiting_building1_state), activity.getString(R.string.waiting_building1_number)));
        dataSet.add(new DataSet(activity.getString(R.string.waiting_building2_title), activity.getString(R.string.waiting_building2_address), activity.getString(R.string.waiting_building2_date), activity.getString(R.string.waiting_building2_days), Integer.parseInt(activity.getString(R.string.waiting_building2_likes)), R.drawable.ic_plus, activity.getString(R.string.waiting_building2_date1), activity.getString(R.string.waiting_building2_date2), activity.getString(R.string.waiting_building2_problem_description), activity.getString(R.string.waiting_building2_responsible), activity.getString(R.string.waiting_building2_state), activity.getString(R.string.waiting_building2_number)));
        dataSet.add(new DataSet(activity.getString(R.string.waiting_road_service_title), activity.getString(R.string.waiting_road_service_address), activity.getString(R.string.waiting_road_service_date), activity.getString(R.string.waiting_road_service_days), Integer.parseInt(activity.getString(R.string.waiting_road_service_likes)), R.drawable.ic_menu_applications_24dp, activity.getString(R.string.waiting_road_service_date1), activity.getString(R.string.waiting_road_service_date2), activity.getString(R.string.waiting_road_service_problem_description), activity.getString(R.string.waiting_road_service_responsible), activity.getString(R.string.waiting_road_service_state), activity.getString(R.string.waiting_road_service_number)));
        dataSet.add(new DataSet(activity.getString(R.string.waiting_waterworks_title), activity.getString(R.string.waiting_waterworks_address), activity.getString(R.string.waiting_waterworks_date), activity.getString(R.string.waiting_waterworks_days), Integer.parseInt(activity.getString(R.string.waiting_waterworks_likes)), R.drawable.ic_menu_send, activity.getString(R.string.waiting_waterworks_date1), activity.getString(R.string.waiting_waterworks_date2), activity.getString(R.string.waiting_waterworks_problem_description), activity.getString(R.string.waiting_waterworks_responsible), activity.getString(R.string.waiting_waterworks_state), activity.getString(R.string.waiting_waterworks_number)));
        dataSet.add(new DataSet(activity.getString(R.string.waiting_heightworks_title), activity.getString(R.string.waiting_heightworks_address), activity.getString(R.string.waiting_heightworks_date), activity.getString(R.string.waiting_heightworks_days), Integer.parseInt(activity.getString(R.string.waiting_heightworks_likes)), R.drawable.ic_menu_camera, activity.getString(R.string.waiting_heightworks_date1), activity.getString(R.string.waiting_heightworks_date2), activity.getString(R.string.waiting_heightworks_problem_description), activity.getString(R.string.waiting_heightworks_responsible), activity.getString(R.string.waiting_heightworks_state), activity.getString(R.string.waiting_heightworks_number)));

        return dataSet;
    }

    public String getmDataTitle() {
        return mDataTitle;
    }

    public String getmDataAddress() {
        return mDataAddress;
    }

    public String getmDataDate() {
        return mDataDate;
    }

    public String getmDataDaysNumber() {
        return mDataDaysNumber;
    }

    public int getmDataLikesNumber() {
        return mDataLikesNumber;
    }

    public int getmDataImageResourceId() {
        return mDataImageResourceId;
    }

    public String getmStatus() {
        return mStatus;
    }

    public String getmResponsible() {
        return mResponsible;
    }

    public String getmData1() {
        return mData1;
    }

    public String getmData2() {
        return mData2;
    }

    public String getmTitleNumber() {
        return mTitleNumber;
    }

    public String getmMainText() {
        return mMainText;
    }
}

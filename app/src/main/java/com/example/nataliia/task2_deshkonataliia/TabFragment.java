package com.example.nataliia.task2_deshkonataliia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabFragment extends Fragment {

    private TabLayout mAllApplicationsTabLayout;
    private ViewPager mAllApplicationsViewPager;
    private String[] mTabTitles;

    public final int ALL_APPLICATIONS_TABS_COUNT = 3;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mTabTitles = getActivity().getResources().getStringArray(R.array.tab_titles_array);

        View view = inflater.inflate(R.layout.tab_layout, null);
        mAllApplicationsTabLayout = (TabLayout) view.findViewById(R.id.tabs);
        mAllApplicationsViewPager = (ViewPager) view.findViewById(R.id.viewpager);
        mAllApplicationsViewPager.setAdapter(new PagerAdapter(this, getChildFragmentManager(), mTabTitles, getActivity()));
        mAllApplicationsTabLayout.setupWithViewPager(mAllApplicationsViewPager);
        return view;
    }

}
package com.example.nataliia.task2_deshkonataliia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class TabFragment extends Fragment {

    public static TabLayout tabLayout;
    public static ViewPager viewPager;
    public static int tab_items_int = 3;

    private String[] mTabTitles;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View x = inflater.inflate(R.layout.tab_layout, null);
        tabLayout = (TabLayout) x.findViewById(R.id.tabs);
        viewPager = (ViewPager) x.findViewById(R.id.viewpager);
        viewPager.setAdapter(new Adapter(getChildFragmentManager()));

        mTabTitles = getActivity().getResources().getStringArray(R.array.tab_titles_array);
        tabLayout.post(new Runnable() {
            @Override
            public void run() {
                tabLayout.setupWithViewPager(viewPager);
            }
        });
        return x;
    }

    class Adapter extends FragmentPagerAdapter {

        public Adapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            Bundle bundle_in_progress = new Bundle();
            Bundle bundle_done = new Bundle();
            InProgressFragment inProgressTab = new InProgressFragment();
            InProgressFragment doneTab = new InProgressFragment();

            switch (position) {
                case 0:
                    bundle_in_progress.putSerializable("tab", "in progress");
                    inProgressTab.setArguments(bundle_in_progress);
                    return inProgressTab;
                case 1:
                    bundle_done.putSerializable("tab", "done");
                    doneTab.setArguments(bundle_done);
                    return doneTab;
                case 2:
                    return new WaitingFragment();
            }
            return null;
        }

        @Override
        public int getCount() {
            return tab_items_int;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTabTitles[position];
        }
    }

}
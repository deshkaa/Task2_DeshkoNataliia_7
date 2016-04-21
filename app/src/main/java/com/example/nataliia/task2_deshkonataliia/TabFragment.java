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
import android.widget.Toast;

import java.util.ArrayList;

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
            ApplicationSubclass applicationSubclass =
                    (ApplicationSubclass) getContext().getApplicationContext();

            InProgressFragment tab_in_progress = new InProgressFragment();
            Bundle args = new Bundle();
            //args.putSerializable("recyclerKey", applicationSubclass.getmAdapter_in_progress());
            args.putSerializable("recyclerKey", applicationSubclass.getmDataSet_in_progress());
            tab_in_progress.setArguments(args);

            InProgressFragment tab_done = new InProgressFragment();
            Bundle args2 = new Bundle();
            //args2.putSerializable("recyclerKey", applicationSubclass.getmAdapter_done());
            args.putSerializable("recyclerKey", applicationSubclass.getmDataSet_done());
            tab_done.setArguments(args2);

            WaitingFragment tab_waiting = new WaitingFragment();

            /////////

            Bundle bundle = new Bundle();
            InProgressFragment recyclerTab = new InProgressFragment();

            switch (position) {
                case 0:
                    return tab_in_progress;
                    //return InProgressFragment.newInstance(new RecyclerViewAdapter(DataSet.setDataInProgress()));
                            //applicationSubclass.getmAdapter_in_progress());
                    /*bundle.putSerializable(
                            "recyclerKey", applicationSubclass.getmAdapter_in_progress());
                    //recyclerTab = InProgressFragment.
                      //      newInstance(applicationSubclass.getmAdapter_done());
                    recyclerTab.setArguments(bundle);
                    return recyclerTab;*/
                case 1:
                    return tab_done;
                    /*.putSerializable(
                            "recyclerKey", applicationSubclass.getmAdapter_done());
                    //recyclerTab = InProgressFragment.
                    //      newInstance(applicationSubclass.getmAdapter_done());
                    recyclerTab.setArguments(bundle);
                    return recyclerTab;*/
                    //return new WaitingFragment();//InProgressFragment.newInstance(new RecyclerViewAdapter(DataSet.setDataDone()));
                            //applicationSubclass.getmAdapter_done());
                    /*bundle.putSerializable(
                            "recyclerKey", applicationSubclass.getmAdapter_done());
                    recyclerTab = InProgressFragment.
                            newInstance(applicationSubclass.getmAdapter_done());
                    recyclerTab.setArguments(bundle);
                    return recyclerTab;*/
                case 2:
                    return tab_waiting;//new WaitingFragment();
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
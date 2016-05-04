package com.example.nataliia.task2_deshkonataliia;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

class PagerAdapter extends FragmentPagerAdapter {

    private TabFragment mTabFragment;
    private String[] mTabTitles;
    private Activity mActivity;

    public PagerAdapter(TabFragment tabFragment,
                        FragmentManager fm,
                        String[] tabTitles,
                        Activity activity) {
        super(fm);
        this.mTabFragment = tabFragment;
        this.mTabTitles = tabTitles;
        this.mActivity = activity;
    }

    @Override
    public Fragment getItem(int position) {

        Bundle bundle_in_progress = new Bundle();
        Bundle bundle_done = new Bundle();
        InProgressFragment inProgressTab = new InProgressFragment();
        InProgressFragment doneTab = new InProgressFragment();

        switch (position) {
            case 0:
                bundle_in_progress.putSerializable(mActivity.getString(R.string.tab),
                        mActivity.getString(R.string.in_progress));
                inProgressTab.setArguments(bundle_in_progress);
                return inProgressTab;
            case 1:
                bundle_done.putSerializable(mActivity.getString(R.string.tab),
                        mActivity.getString(R.string.done));
                doneTab.setArguments(bundle_done);
                return doneTab;
            case 2:
                return new WaitingFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return mTabFragment.ALL_APPLICATIONS_TABS_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return mTabTitles[position];
    }
}

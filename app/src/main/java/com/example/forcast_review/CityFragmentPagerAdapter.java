package com.example.forcast_review;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class CityFragmentPagerAdapter extends FragmentStatePagerAdapter {

    List<Fragment> mFragmentList;

    public CityFragmentPagerAdapter(FragmentManager fm,  List<Fragment> mFragmentList) {
        super(fm);
        this.mFragmentList = mFragmentList;
    }

    @Override
    public Fragment getItem(int position) {
        return mFragmentList.get(position);
    }

    @Override
    public int getCount() {
        return mFragmentList.size();
    }

    int childCount = 0;

    @Override
    public int getItemPosition(@NonNull Object object) {
        if (childCount > 0){
            childCount--;
            return POSITION_NONE;
        }
        return super.getItemPosition(object);
    }

    @Override
    public void notifyDataSetChanged() {
        this.childCount = getCount();
        super.notifyDataSetChanged();
    }
}

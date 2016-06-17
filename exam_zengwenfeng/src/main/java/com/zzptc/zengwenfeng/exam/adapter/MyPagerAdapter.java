package com.zzptc.zengwenfeng.exam.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/6/17.
 */
public class MyPagerAdapter extends FragmentPagerAdapter {

    private List<Fragment> fragments = new ArrayList<Fragment>();
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    public MyPagerAdapter(FragmentManager fragmentManager, ArrayList<Fragment> fragments){
        super(fragmentManager);
        this.fragments = fragments;

    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }
}

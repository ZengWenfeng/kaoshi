package com.zzptc.zengwenfeng.exam.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.zzptc.zengwenfeng.exam.R;

/**
 * Created by Administrator on 2016/6/17.
 */
public class DisFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_dis,container,false);
        return view;
    }
}

package com.zzptc.zengwenfeng.exam;


import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.zzptc.zengwenfeng.exam.adapter.MyPagerAdapter;
import com.zzptc.zengwenfeng.exam.fragment.DisFragment;
import com.zzptc.zengwenfeng.exam.fragment.FriendsFragment;
import com.zzptc.zengwenfeng.exam.fragment.MusicFragment;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private ViewPager viewPager;
    private ArrayList<Fragment> fragments;
    private MyPagerAdapter myPagerAdapter;
    private ImageView iv_music;
    private ImageView iv_dis;
    private ImageView iv_friends;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        FragShixian();
       
    }
    private  void init(){
        viewPager= (ViewPager) findViewById(R.id.vp);
        iv_music= (ImageView) findViewById(R.id.iv_music);
        iv_dis= (ImageView) findViewById(R.id.iv_dis);
        iv_friends= (ImageView) findViewById(R.id.iv_friends);
        iv_music.setOnClickListener(this);
        iv_friends.setOnClickListener(this);
        iv_dis.setOnClickListener(this);
    }

    private void FragShixian(){
        fragments=new ArrayList<Fragment>();
        fragments.add(new MusicFragment());
        fragments.add(new DisFragment());
        fragments.add(new FriendsFragment());
        myPagerAdapter=new MyPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(myPagerAdapter);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.iv_music:

                iv_music.setImageResource(R.mipmap.actionbar_music_selected);
                iv_dis.setImageResource(R.mipmap.actionbar_discover_prs);
                iv_friends.setImageResource(R.mipmap.actionbar_friends_prs);

                viewPager.setCurrentItem(R.id.iv_music);

                break;

            case R.id.iv_dis:

                iv_dis.setImageResource(R.mipmap.actionbar_discover_selected);
                iv_music.setImageResource(R.mipmap.actionbar_music_prs);
                iv_friends.setImageResource(R.mipmap.actionbar_friends_prs);
                viewPager.setCurrentItem(R.id.iv_dis);

                break;

            case R.id.iv_friends:

                iv_music.setImageResource(R.mipmap.actionbar_music_prs);
                iv_dis.setImageResource(R.mipmap.actionbar_discover_prs);
                iv_friends.setImageResource(R.mipmap.actionbar_friends_selected);
                viewPager.setCurrentItem(R.id.iv_friends);

                break;
        }
    }
}

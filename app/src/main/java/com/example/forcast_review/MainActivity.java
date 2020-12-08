package com.example.forcast_review;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.example.forcast_review.DB.DBManger;
import com.example.forcast_review.city_manager.CityManagerActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView addCityIv, moreIv;
    LinearLayout pointLayout;
    ViewPager mainViewPager;

    List<Fragment> mFragmentList;
    List<String> provinceCityList;
    List<ImageView> points;
    CityFragmentPagerAdapter adapter;

    RelativeLayout outLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addCityIv = findViewById(R.id.main_iv_add);
        moreIv = findViewById(R.id.main_iv_more);
        pointLayout = findViewById(R.id.main_layout_point);
        mainViewPager = findViewById(R.id.main_vp);
        outLayout = findViewById(R.id.main_out_layout);

        addCityIv.setOnClickListener(this);
        moreIv.setOnClickListener(this);

        mFragmentList = new ArrayList<>();
        provinceCityList = DBManger.queryAllCityName();
        points = new ArrayList<>();

        //换壁纸参数
        exchangeBg();


        if (provinceCityList.size()==0){
            provinceCityList.add("北京");
        }

        //因为可能搜索界面点击跳转到此界面 传值 所以此处获取
        Intent intent = getIntent();
        String city = intent.getStringExtra("city");

        if (!provinceCityList.contains(city) && !TextUtils.isEmpty(city)){
            provinceCityList.add(city);
        }



        //初始化viewpager 页面
        initPager();
        adapter = new CityFragmentPagerAdapter(getSupportFragmentManager(), mFragmentList);
        mainViewPager.setAdapter(adapter);

        initPoint();

        mainViewPager.setCurrentItem(mFragmentList.size()-1);

        setPagerListener();


    }

    private void exchangeBg() {
        SharedPreferences shp = getSharedPreferences("SHP", MODE_PRIVATE);
        int bgNum = shp.getInt("bg", 2);
        switch (bgNum){
            case 0:
                outLayout.setBackgroundResource(R.mipmap.bg);
                break;
            case 1:
                outLayout.setBackgroundResource(R.mipmap.bg2);
                break;

            case 2:
                outLayout.setBackgroundResource(R.mipmap.bg3);
                break;
        }
    }

    private void setPagerListener() {

        mainViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                for (int i = 0; i<points.size(); i++){
                    points.get(i).setImageResource(R.mipmap.a1);
                }

                points.get(position).setImageResource(R.mipmap.a2);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

    private void initPoint() {
            for (int i = 0; i<mFragmentList.size(); i++){
                ImageView p = new ImageView(this);
                p.setImageResource(R.mipmap.a1);
                p.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT));
                LinearLayout.LayoutParams lp = (LinearLayout.LayoutParams) p.getLayoutParams();
                lp.setMargins(0,0,20,0);
                points.add(p);
                pointLayout.addView(p);
            }

            points.get(points.size()-1).setImageResource(R.mipmap.a2);


    }

    private void initPager() {
        for (int i = 0; i<provinceCityList.size(); i++){
            CityWeatherFragment fragment = new CityWeatherFragment();
            Bundle bundle = new Bundle();
            bundle.putString("city", provinceCityList.get(i));
            fragment.setArguments(bundle);
            mFragmentList.add(fragment);
        }

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent();
        switch(v.getId()){
            case R.id.main_iv_add:
                intent.setClass(this, CityManagerActivity.class);
                break;
            case R.id.main_iv_more:
                intent.setClass(this, MoreActivity.class);
                break;
        }

        startActivity(intent);
    }

    //
    @Override
    protected void onRestart() {
        super.onRestart();
        List<String> cityList = DBManger.queryAllCityName();
        if (cityList.size() == 0){
            cityList.add("北京");
        }
        provinceCityList.clear();
        provinceCityList.addAll(cityList);

        mFragmentList.clear();
        initPager();
        adapter.notifyDataSetChanged();
        points.clear();
        pointLayout.removeAllViews(); //将布局中所有元素全部移除
        initPoint();
        mainViewPager.setCurrentItem(mFragmentList.size()-1);

    }
}

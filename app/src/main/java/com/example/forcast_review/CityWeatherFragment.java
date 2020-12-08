package com.example.forcast_review;


import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.example.forcast_review.Bean.WeatherBean;
import com.example.forcast_review.DB.DBManger;
import com.example.forcast_review.base.BaseFragment;
import com.google.gson.Gson;

import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class CityWeatherFragment extends BaseFragment implements View.OnClickListener {

    TextView tempTv, cityTv, conditionTv, windTv, tempRangeTv, dateTv, clothIndexTv, carIndexTv, coldIndexTv, sportIndexTv, uvIndexTv;
    ImageView dayIv;
    LinearLayout futureLayout;
    String url1, url2;
    String city, province;
    WeatherBean.DataBean.IndexBean index;
    String province_city;
    ScrollView outLayout;


    public CityWeatherFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_city_weather, container, false);


        initView(view);

        //换壁纸参数
        exchangeBg();


        url1 = "https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h&province=";
        url2 = "&city=";

        // transfer data from activity to fragment:
        Bundle bundle = getArguments();
        province_city = bundle.getString("city");
        String[] provinceAndCity = province_city.split(" ");
        if(provinceAndCity.length > 1){
            province = provinceAndCity[0];
            city = provinceAndCity[1];
        }else{
            province = provinceAndCity[0];
            city = provinceAndCity[0];

        }
        String url = url1 + province + url2 + city;

        loadData(url);

        return view;
    }

    @Override
    public void onSuccess(String result) {
        try {
            parseShowData(result);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        int i = DBManger.updateInfoByCity(province_city, result);
        if (i <=0){
            //更新数据库失败
            DBManger.addCityInfo(province_city , result);
        }


    }

    private void exchangeBg() {
        SharedPreferences shp = getActivity().getSharedPreferences("SHP", Context.MODE_PRIVATE);
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


    @SuppressLint("SetTextI18n")
    private void parseShowData(String result) throws ParseException {
        WeatherBean weatherBean = new Gson().fromJson(result, WeatherBean.class);
        WeatherBean.DataBean resultsBean = weatherBean.getData();
        index = resultsBean.getIndex();
        WeatherBean.DataBean.ObserveBean todayDataBean = resultsBean.getObserve();
        WeatherBean.DataBean.Forecast24hBean futureWeatherBean = resultsBean.getForecast_24h();
        String time = changeTime(todayDataBean.getUpdate_time());
        dateTv.setText(time);
        cityTv.setText(city);
        conditionTv.setText(todayDataBean.getWeather_short());
        windTv.setText("湿度 "+ todayDataBean.getHumidity() + "%");
        tempRangeTv.setText(futureWeatherBean.get_$0().getMin_degree() +"℃ ~ " + futureWeatherBean.get_$0().getMax_degree() +"℃");
        tempTv.setText(todayDataBean.getDegree() + "℃");

        for (int i = 0; i<3; i++){
            View itemView = LayoutInflater.from(getActivity()).inflate(R.layout.item_main_center, null);
            itemView.setLayoutParams(new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,  LinearLayout.LayoutParams.WRAP_CONTENT));
            futureLayout.addView(itemView);
            TextView iDateTv = itemView.findViewById(R.id.item_center_tv_date);
            TextView iConditionTv = itemView.findViewById(R.id.item_center_tv_condition);
            TextView iTempRange = itemView.findViewById(R.id.item_center_tv_temp);
            if (i == 0){
                iDateTv.setText(futureWeatherBean.get_$2().getTime() + " 明天");
                iConditionTv.setText(futureWeatherBean.get_$2().getDay_weather_short());
                iTempRange.setText(futureWeatherBean.get_$2().getMin_degree() + " ~ " + futureWeatherBean.get_$2().getMax_degree() + "℃");
            }else if (i == 1){
                iDateTv.setText(futureWeatherBean.get_$3().getTime() + " 后天");
                iConditionTv.setText(futureWeatherBean.get_$3().getDay_weather_short());
                iTempRange.setText(futureWeatherBean.get_$3().getMin_degree() + " ~ " + futureWeatherBean.get_$3().getMax_degree() + "℃");
            }else{
                iDateTv.setText(futureWeatherBean.get_$4().getTime() + " 大后天");
                iConditionTv.setText(futureWeatherBean.get_$4().getDay_weather_short());
                iTempRange.setText(futureWeatherBean.get_$4().getMin_degree() + " ~ " + futureWeatherBean.get_$4().getMax_degree() + "℃");
            }
        }

    }

    private String changeTime(String update_time) throws ParseException {
        SimpleDateFormat sf1 = new SimpleDateFormat("yyyyMMddHHmm");
        SimpleDateFormat sf2 = new SimpleDateFormat(("yyyy-MM-dd HH:mm"));

        String res;
        res = sf2.format(sf1.parse(update_time));
        return res;


    }


    @Override
    public void onError(Throwable ex, boolean isOnCallback) {
        String cityInfo = DBManger.getCityInfo(city);
        if (!TextUtils.isEmpty(cityInfo)){
            try {
                parseShowData(cityInfo);
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }

    private void initView(View view) {
        tempTv = view.findViewById(R.id.fragment_tv_currentTemp);
        cityTv = view.findViewById(R.id.fragment_tv_city);
        conditionTv = view.findViewById(R.id.fragment_tv_condition);
        windTv = view.findViewById(R.id.fragment_tv_wind);
        tempRangeTv = view.findViewById(R.id.fragment_tv_temprange);
        dateTv = view.findViewById(R.id.fragment_tv_date);
        clothIndexTv = view.findViewById(R.id.fragment_index_tv_dress);
        carIndexTv = view.findViewById(R.id.fragment_index_tv_car);
        coldIndexTv = view.findViewById(R.id.fragment_index_tv_cold);
        sportIndexTv = view.findViewById(R.id.fragment_index_tv_sport);
        uvIndexTv = view.findViewById(R.id.fragment_index_tv_uv);
        dayIv = view.findViewById(R.id.fragment_iv_today);
        futureLayout = view.findViewById(R.id.fragment_center_layout);
        outLayout = view.findViewById(R.id.fragment_sv);

        clothIndexTv.setOnClickListener(this);
        carIndexTv.setOnClickListener(this);
        coldIndexTv.setOnClickListener(this);
        sportIndexTv.setOnClickListener(this);
        uvIndexTv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        switch(v.getId()){
            case R.id.fragment_index_tv_dress:
                builder.setTitle("穿衣指数");
                String msg = index.getClothes().getInfo() + "\n" + index.getClothes().getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
            case R.id.fragment_index_tv_car:
                builder.setTitle("洗车指数");
                msg = index.getCarwash().getInfo() + "\n" + index.getCarwash().getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;

            case R.id.fragment_index_tv_cold:
                builder.setTitle("感冒指数");
                msg = index.getCold().getInfo() + "\n" + index.getCold().getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;

            case R.id.fragment_index_tv_sport:
                builder.setTitle("运动指数");
                msg = index.getSports().getInfo() + "\n" + index.getSports().getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;

            case R.id.fragment_index_tv_uv:
                builder.setTitle("紫外线指数");
                msg = index.getUltraviolet().getInfo() + "\n" + index.getUltraviolet().getDetail();
                builder.setMessage(msg);
                builder.setPositiveButton("确定", null);
                break;
        }

        builder.create().show();
    }
}

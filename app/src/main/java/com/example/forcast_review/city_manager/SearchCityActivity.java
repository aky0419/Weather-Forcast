package com.example.forcast_review.city_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.forcast_review.Bean.WeatherBean;
import com.example.forcast_review.MainActivity;
import com.example.forcast_review.R;
import com.example.forcast_review.base.BaseActivity;
import com.google.gson.Gson;

public class SearchCityActivity extends BaseActivity implements View.OnClickListener {

    EditText searchEt;
    ImageView submitIv;
    GridView searchGv;
    String[] hotCities = new String[]{"北京", "上海", "广东 广州", "广东 深圳", "广东 珠海", "广东 佛山", "江苏 南京","江苏 苏州","福建 厦门","湖南 长沙","四川 成都",
            "福建 福州","浙江 杭州","湖北 武汉","山东 青岛", "陕西 西安", "山西 太原","重庆","天津", "广西 南宁"};
    String url1 = "https://wis.qq.com/weather/common?source=pc&weather_type=observe|index|rise|alarm|air|tips|forecast_24h&province=";
    String url2 = "&city=";
    String province_city, province, city;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_city);
        searchEt=findViewById(R.id.search_et);
        submitIv=findViewById(R.id.search_iv_submit);
        searchGv=findViewById(R.id.search_gv);
        submitIv.setOnClickListener(this);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.item_hotcity, hotCities);
        searchGv.setAdapter(adapter);

        searchGv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                province_city = hotCities[position];
                String[] provinceAndCity = province_city.split(" ");
                if (!TextUtils.isEmpty(province_city)) {
                    //判断是否能找到当前城市
                    if (provinceAndCity.length > 1) {
                        province = provinceAndCity[0];
                        city = provinceAndCity[1];
                    } else {
                        province = provinceAndCity[0];
                        city = provinceAndCity[0];

                    }
                    String url = url1 + province + url2 + city;
                    loadData(url);
                }

            }
        });

    }


    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.search_iv_submit:
                province_city = searchEt.getText().toString();
                String[] provinceAndCity = province_city.split(" ");
                if (!TextUtils.isEmpty(province_city)) {
                    //判断是否能找到当前城市
                    if(provinceAndCity.length > 1){
                        province = provinceAndCity[0];
                        city = provinceAndCity[1];
                    }else{
                        province = provinceAndCity[0];
                        city = provinceAndCity[0];

                    }
                    String url = url1 + province + url2 + city;

                    loadData(url);
                }else{
                    Toast.makeText(this, "输入内容不能为空", Toast.LENGTH_SHORT).show();
                }
                break;
        }
    }


    @Override
    public void onSuccess(String result) {
        WeatherBean weatherBean = new Gson().fromJson(result, WeatherBean.class);
        if (weatherBean.getData().getIndex().getClothes()!=null){
            Intent intent = new Intent(this, MainActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("city", province_city);
            startActivity(intent);
        }else{
            Toast.makeText(this, "暂时未收录此城市天气信息", Toast.LENGTH_SHORT).show();
        }
    }
}

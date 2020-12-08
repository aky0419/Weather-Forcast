package com.example.forcast_review.city_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.forcast_review.DB.DBManger;
import com.example.forcast_review.DB.DataBaseBean;
import com.example.forcast_review.R;

import java.util.ArrayList;
import java.util.List;

public class CityManagerActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView backIv, deleteIv, addIv;
    ListView cityLv;
    List<DataBaseBean> mData;
    CityManagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_manager);

        backIv = findViewById(R.id.city_iv_back);
        deleteIv = findViewById(R.id.city_iv_delete);
        addIv = findViewById(R.id.city_iv_add);
        cityLv = findViewById(R.id.city_lv);
        mData = new ArrayList<>();
        backIv.setOnClickListener(this);
        deleteIv.setOnClickListener(this);
        addIv.setOnClickListener(this);
        //设置适配器

        adapter = new CityManagerAdapter(this, mData);
        cityLv.setAdapter(adapter);

    }

    @Override
    protected void onResume() {
        super.onResume();
        //获取全部信息
        List<DataBaseBean> list = DBManger.queryAllInfo();
        mData.clear();
        mData.addAll(list);
        adapter.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {

        switch(v.getId()){
            case R.id.city_iv_add:
                int cityCount = DBManger.getCityCount();
                if(cityCount<5){
                    Intent intent = new Intent(this, SearchCityActivity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(this, "存储城市数量已达上限，请删除后再增加", Toast.LENGTH_SHORT).show();
                }
                break;

            case R.id.city_iv_back:
                finish();
                break;

            case R.id.city_iv_delete:
                Intent intent1 = new Intent(this, DeleteCityActivity.class);
                startActivity(intent1);
                break;


        }
    }
}

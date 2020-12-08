package com.example.forcast_review.city_manager;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.forcast_review.DB.DBManger;
import com.example.forcast_review.DeleteCityAdapter1;
import com.example.forcast_review.R;

import java.util.ArrayList;
import java.util.List;

public class DeleteCityActivity extends AppCompatActivity implements OnClickListener {

    ImageView errorIv, rightIv;

    ListView deleteLv;

    List<String> mData;
    List<String> deleteCities;
    DeleteCityAdapter1 adapter1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_city);

        errorIv = findViewById(R.id.delete_iv_error);
        rightIv = findViewById(R.id.delete_iv_right);
        deleteLv = findViewById(R.id.delete_lv);
        mData = new ArrayList<>();
        deleteCities = new ArrayList<>();
        errorIv.setOnClickListener(this);
        rightIv.setOnClickListener(this);
        adapter1 = new DeleteCityAdapter1(this, mData, deleteCities);
        deleteLv.setAdapter(adapter1);


    }

    @Override
    protected void onResume() {
        super.onResume();
        List<String> cities = DBManger.queryAllCityName();
        mData.addAll(cities);
        adapter1.notifyDataSetChanged();
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.delete_iv_error:
                AlertDialog.Builder builder = new AlertDialog.Builder(this);
                builder.setTitle("提示信息").setMessage("您确定要放弃更改吗").setPositiveButton("确定放弃", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish(); //关闭当前acvitivity
                    }
                });

                builder.setNegativeButton("取消", null);
                builder.create().show();
                break;

            case R.id.delete_iv_right:
                for (int i = 0; i<deleteCities.size(); i++){
                    DBManger.deleteCity(deleteCities.get(i));
                }
                finish();
                break;
        }
    }
}

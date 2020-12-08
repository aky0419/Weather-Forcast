package com.example.forcast_review;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.forcast_review.DB.DBManger;

import org.w3c.dom.Text;

public class MoreActivity extends AppCompatActivity implements View.OnClickListener {
    TextView bgTv, cacheTv, versionTv, shareTv;
    RadioGroup exbgRg;
    ImageView backIv;
    SharedPreferences SHP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_more);

        bgTv = findViewById(R.id.more_tv_changebg);
        cacheTv = findViewById(R.id.more_tv_cache);
        versionTv = findViewById(R.id.more_tv_version);
        shareTv = findViewById(R.id.more_tv_share);
        backIv = findViewById(R.id.more_iv_back);
        exbgRg = findViewById(R.id.more_rg);
        bgTv.setOnClickListener(this);
        cacheTv.setOnClickListener(this);
        shareTv.setOnClickListener(this);
        backIv.setOnClickListener(this);

        SHP = getSharedPreferences("SHP", MODE_PRIVATE);
        String versionName = getVersionName();
        versionTv.setText("当前版本：    v" + versionName);

        setRgListener();


    }

    private void setRgListener() {
        exbgRg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                int bg = SHP.getInt("bg", 0);
                SharedPreferences.Editor editor = SHP.edit();
                Intent intent = new Intent(MoreActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);


                switch (checkedId){
                    case R.id.more_rb_green:
                        if (bg == 0){
                            Toast.makeText(MoreActivity.this, "您选择的为当前背景，无需改变！", Toast.LENGTH_SHORT).show();
                        }
                        editor.putInt("bg", 0);
                        editor.commit();
                        break;
                    case R.id.more_rb_pink:
                        if (bg == 1){
                            Toast.makeText(MoreActivity.this, "您选择的为当前背景，无需改变！", Toast.LENGTH_SHORT).show();
                        }
                        editor.putInt("bg", 1);
                        editor.commit();
                        break;
                    case R.id.more_rb_blue:
                        if (bg == 2){
                            Toast.makeText(MoreActivity.this, "您选择的为当前背景，无需改变！", Toast.LENGTH_SHORT).show();
                        }
                        editor.putInt("bg", 2);
                        editor.commit();
                        break;
                }

                startActivity(intent);
            }
        });

    }

    private String getVersionName() {
        // get version name from gradle
        PackageManager packageManager = getPackageManager();
        String versionName = null;
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(getPackageName(), 0);
            versionName = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }

        return versionName;
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.more_tv_changebg:
                if(exbgRg.getVisibility() == View.VISIBLE){
                 exbgRg.setVisibility(View.GONE);
                }else{
                    exbgRg.setVisibility(View.VISIBLE);
                }
                break;
            case R.id.more_tv_cache:
                //删除数据库信息
                clearCache();
                break;

            case R.id.more_iv_back:
                finish();
                break;
            case R.id.more_tv_share:
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("text/plain");
                intent.putExtra(Intent.EXTRA_TEXT, "说天气app是一款超萌超可爱的天气预报软件，画面简约，播报天气情况非常精准，快来下载吧！");
                startActivity(Intent.createChooser(intent, "说天气"));
                break;

        }
    }

    private void clearCache() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("提示信息").setMessage("确定要删除缓存吗");
        builder.setPositiveButton("确定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                DBManger.deleteAllInfo();
                Toast.makeText(MoreActivity.this, "已清除全部缓存!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(MoreActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK|Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        });
        builder.setNegativeButton("取消", null);
        builder.create().show();

    }
}

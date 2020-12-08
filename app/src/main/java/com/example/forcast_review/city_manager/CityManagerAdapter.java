package com.example.forcast_review.city_manager;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.forcast_review.Bean.WeatherBean;
import com.example.forcast_review.DB.DataBaseBean;
import com.example.forcast_review.R;
import com.google.gson.Gson;

import java.util.List;

public class CityManagerAdapter extends BaseAdapter {

    Context context;
    List<DataBaseBean> mData;

    public CityManagerAdapter(Context context, List<DataBaseBean> data) {
        this.context = context;
        mData = data;
    }

    @Override
    public int getCount() {
        return mData.size();
    }

    @Override
    public Object getItem(int position) {
        return mData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.item_city_manager, null);
            holder = new ViewHolder(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();

        }
        DataBaseBean bean = mData.get(position);
        holder.cityTv.setText(bean.getCity());
        WeatherBean weatherBean = new Gson().fromJson(bean.getContent(), WeatherBean.class);
        WeatherBean.DataBean.ObserveBean observeBean = weatherBean.getData().getObserve();
        WeatherBean.DataBean.Forecast24hBean futureBean = weatherBean.getData().getForecast_24h();
        holder.conTv.setText("天气：" + observeBean.getWeather_short());
        holder.currTempTv.setText(observeBean.getDegree()+"℃");
        holder.tempRangetTv.setText(futureBean.get_$0().getMin_degree() + " ~ " + futureBean.get_$0().getMax_degree() + "℃");
        holder.windTv.setText("湿度：" + observeBean.getHumidity()+"%");
        return convertView;
    }


    class ViewHolder{

        TextView cityTv, conTv, currTempTv, windTv, tempRangetTv;
        public ViewHolder(View itemView){
            cityTv = itemView.findViewById(R.id.item_iv_city);
            conTv = itemView.findViewById(R.id.item_city_tv_cond);
            currTempTv = itemView.findViewById(R.id.city_iv_temp);
            windTv = itemView.findViewById(R.id.item_city_wind);
            tempRangetTv = itemView.findViewById(R.id.item_city_tempRange);
        }



    }
}

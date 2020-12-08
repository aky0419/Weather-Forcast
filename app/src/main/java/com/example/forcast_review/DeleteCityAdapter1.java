package com.example.forcast_review;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class DeleteCityAdapter1 extends BaseAdapter {

    Context mContext;
    List<String> cities;
    List<String> deletedCities;

    public DeleteCityAdapter1(Context context, List<String> cities, List<String> deletedCities) {
        mContext = context;
        this.cities = cities;
        this.deletedCities = deletedCities;
    }

    @Override
    public int getCount() {
        return cities.size();
    }

    @Override
    public Object getItem(int position) {
        return cities.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        ViewHoler holder = null;
        if (convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_delete_city, null);
            holder = new ViewHoler(convertView);
            convertView.setTag(holder);
        }else{
            holder = (ViewHoler) convertView.getTag();
        }

        holder.cityIv.setText(cities.get(position));
        holder.deleteIv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                deletedCities.add(cities.get(position));
                cities.remove(position);
                notifyDataSetChanged();

            }
        });
        return  convertView;


    }

    class ViewHoler{
        ImageView deleteIv;
        TextView cityIv;
        public ViewHoler(View itemView){
            deleteIv = itemView.findViewById(R.id.item_delete_iv);
            cityIv = itemView.findViewById(R.id.item_delete_tv);
        }
    }
}

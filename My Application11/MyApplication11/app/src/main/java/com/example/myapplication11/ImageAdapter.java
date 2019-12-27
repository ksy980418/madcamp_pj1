package com.example.myapplication11;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class ImageAdapter extends BaseAdapter {

    private Context mContext;
    public int[] imageArray ={
            R.drawable.image_1,R.drawable.image_2,R.drawable.image_3,R.drawable.image_4,R.drawable.image_5,
            R.drawable.image_6,R.drawable.image_7,R.drawable.image_8,R.drawable.image_9,R.drawable.image_10,
            R.drawable.image_11,R.drawable.image_12,R.drawable.image_13,R.drawable.image_14,R.drawable.image_15,
            R.drawable.image_16,R.drawable.image_17,R.drawable.image_18,R.drawable.image_19,R.drawable.image_20,

    };


    public ImageAdapter(Context mContext){
        this.mContext = mContext;
    }


    @Override
    public int getCount() {
        return imageArray.length;
    }

    @Override
    public Object getItem(int position) {
        return imageArray[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(imageArray[position]);
        imageView.setScaleType((ImageView.ScaleType.CENTER_CROP));
        imageView.setLayoutParams(new GridView.LayoutParams(340,350));


        return imageView;
    }
}

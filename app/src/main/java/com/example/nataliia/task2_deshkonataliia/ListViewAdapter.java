package com.example.nataliia.task2_deshkonataliia;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nataliia.task1.SubActivity;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    private List<DataSet> mDataset;
    Context context;
    private static LayoutInflater inflater = null;

    public ListViewAdapter(Activity activity, List<DataSet> dataSet) {
        mDataset = dataSet;
        context = activity;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return mDataset.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public class Holder {
        private ImageView mImage;
        private TextView mTitle;
        private TextView mAddress;
        private TextView mLikesNumber;
        private TextView mDate;
        private TextView mDaysNumber;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        Holder holder = new Holder();
        View rowView;
        rowView = inflater.inflate(R.layout.cardview_element, null);

        holder.mImage = (ImageView) rowView.findViewById(R.id.imageview);
        holder.mTitle = (TextView) rowView.findViewById(R.id.title);
        holder.mAddress = (TextView) rowView.findViewById(R.id.address);
        holder.mLikesNumber = (TextView) rowView.findViewById(R.id.likes_textview);
        holder.mDate = (TextView) rowView.findViewById(R.id.date);
        holder.mDaysNumber = (TextView) rowView.findViewById(R.id.days);

        Picasso.with(holder.mImage.getContext()).
                load(mDataset.get(position).dataImageResourceId).
                into(holder.mImage);
        holder.mTitle.setText(mDataset.get(position).dataTitle);
        holder.mLikesNumber.setText(String.valueOf(mDataset.get(position).dataLikesNumber));
        holder.mAddress.setText(mDataset.get(position).dataAddress);
        holder.mDate.setText(mDataset.get(position).dataDate);
        holder.mDaysNumber.setText(mDataset.get(position).dataDaysNumber);
        return rowView;
    }

}

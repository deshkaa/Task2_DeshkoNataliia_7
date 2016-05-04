package com.example.nataliia.task2_deshkonataliia;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {
    private ArrayList<DataSet> mDataset;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView mImage;
        private TextView mTitle;
        private TextView mAddress;
        private TextView mLikesNumber;
        private TextView mDate;
        private TextView mDaysNumber;
        private CardView mCardView;

        public ViewHolder(View v) {
            super(v);
            mImage = (ImageView) v.findViewById(R.id.imageview);
            mTitle = (TextView) v.findViewById(R.id.title);
            mAddress = (TextView) v.findViewById(R.id.address);
            mLikesNumber = (TextView) v.findViewById(R.id.likes_textview);
            mDate = (TextView) v.findViewById(R.id.date);
            mDaysNumber = (TextView) v.findViewById(R.id.days);
            mCardView = (CardView) v.findViewById(R.id.card_view);
        }

        public void setData(ArrayList<DataSet> dataset, int position) {
            Picasso.with(mImage.getContext()).
                    load(dataset.get(position).getmDataImageResourceId()).
                    into(mImage);
            mTitle.setText(dataset.get(position).getmDataTitle());
            mLikesNumber.setText(String.valueOf(dataset.get(position).getmDataLikesNumber()));
            mAddress.setText(dataset.get(position).getmDataAddress());
            mDate.setText(dataset.get(position).getmDataDate());
            mDaysNumber.setText(dataset.get(position).getmDataDaysNumber());
            mCardView.setTag(dataset.get(position));
        }
    }

    public RecyclerViewAdapter(ArrayList<DataSet> dataset, Context context) {
        mDataset = dataset;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        final View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.cardview_element, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        holder.setData(mDataset, position);
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}

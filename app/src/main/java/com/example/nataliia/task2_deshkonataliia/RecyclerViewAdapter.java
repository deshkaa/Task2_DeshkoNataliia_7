package com.example.nataliia.task2_deshkonataliia;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.Serializable;
import java.util.ArrayList;

public class RecyclerViewAdapter
        extends android.support.v7.widget.RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>
        implements Serializable {

    private ArrayList<DataSet> mDataset;
   // private View.OnClickListener onClickListener;

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
    }

    public RecyclerViewAdapter(ArrayList<DataSet> dataset) {
        mDataset = dataset;
    }

    @Override
    public RecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).
                inflate(R.layout.cardview_element, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        Picasso.with(holder.mImage.getContext()).
                load(mDataset.get(position).dataImageResourceId).
                into(holder.mImage);
        holder.mTitle.setText(mDataset.get(position).dataTitle);
        holder.mLikesNumber.setText(String.valueOf(mDataset.get(position).dataLikesNumber));
        holder.mAddress.setText(mDataset.get(position).dataAddress);
        holder.mDate.setText(mDataset.get(position).dataDate);
        holder.mDaysNumber.setText(mDataset.get(position).dataDaysNumber);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("data", mDataset.get(position).getArrayList());
                //Intent intent = new Intent(v.getContext(), SubActivity.class);
                //intent.putExtras(bundle);

            }
        });
    }

    @Override
    public int getItemCount() {
        return mDataset.size();
    }
}
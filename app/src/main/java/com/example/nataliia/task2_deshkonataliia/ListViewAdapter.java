package com.example.nataliia.task2_deshkonataliia;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class ListViewAdapter extends BaseAdapter {

    private List<DataSet> mDataset;
    private Context context;
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
        return mDataset.get(position);
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
        private CardView mCardView;

        public Holder(View view, int imageViewId, int titleTextViewId, int adressTextViewId,
                      int likesNumberTextViewId, int dateTextViewId, int daysNumberTextViewId) {
            mImage = (ImageView) view.findViewById(imageViewId);
            mTitle = (TextView) view.findViewById(titleTextViewId);
            mAddress = (TextView) view.findViewById(adressTextViewId);
            mLikesNumber = (TextView) view.findViewById(likesNumberTextViewId);
            mDate = (TextView) view.findViewById(dateTextViewId);
            mDaysNumber = (TextView) view.findViewById(daysNumberTextViewId);
            mCardView = (CardView) view.findViewById(R.id.card_view);
        }

        public void setData(int position) {
            Picasso.with(mImage.getContext()).
                    load(mDataset.get(position).getmDataImageResourceId()).
                    into(mImage);
            mTitle.setText(mDataset.get(position).getmDataTitle());
            mLikesNumber.setText(String.valueOf(mDataset.get(position).getmDataLikesNumber()));
            mAddress.setText(mDataset.get(position).getmDataAddress());
            mDate.setText(mDataset.get(position).getmDataDate());
            mDaysNumber.setText(mDataset.get(position).getmDataDaysNumber());
            mCardView.setTag(mDataset.get(position));
        }
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (convertView == null) convertView = inflater.inflate(R.layout.cardview_element, null);
        Holder holder = new Holder(convertView, R.id.imageview, R.id.title, R.id.address,
                R.id.likes_textview, R.id.date, R.id.days);
        holder.setData(position);
        return convertView;
    }
}

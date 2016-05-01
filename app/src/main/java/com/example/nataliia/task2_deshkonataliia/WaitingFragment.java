package com.example.nataliia.task2_deshkonataliia;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.nataliia.task1.SubActivity;
import com.shamanland.fab.FloatingActionButton;
import com.shamanland.fab.ShowHideOnScroll;

public class WaitingFragment extends Fragment {

    private ListViewAdapter mAdapter;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.waiting_tab_layout, null);
    }

    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        mAdapter = new ListViewAdapter(getActivity(), DataSet.setDataWaiting());

        ListView listView = (ListView) getActivity().findViewById(R.id.list_view);
        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);
        if (listView != null) {
            listView.setAdapter(mAdapter);
            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                    Bundle bundle = new Bundle();
                    bundle.putSerializable("data", DataSet.setDataWaiting().get(position)); //[Comment] Hardcode
                    Intent intent = new Intent(view.getContext(), SubActivity.class);
                    intent.putExtras(bundle);
                    getActivity().startActivityForResult(intent, 0);
                }
            });
            listView.setOnTouchListener(new ShowHideOnScroll(fab));
        }
    }
}

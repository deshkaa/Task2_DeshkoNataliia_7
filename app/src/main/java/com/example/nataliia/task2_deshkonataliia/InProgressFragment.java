package com.example.nataliia.task2_deshkonataliia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.shamanland.fab.FloatingActionButton;
import com.shamanland.fab.ShowHideOnScroll;

import java.util.ArrayList;

public class InProgressFragment extends Fragment {

    private RecyclerViewAdapter mAdapter;
    private static final String ADAPTER_KEY = "recyclerKey";

    public static InProgressFragment newInstance(ArrayList<DataSet> dataSet){
    //RecyclerViewAdapter adapter) {
        InProgressFragment fragment = new InProgressFragment();
        Bundle bundle = new Bundle();
        bundle.putSerializable(ADAPTER_KEY, dataSet);
        fragment.setArguments(bundle);
        return fragment;

        //return new InProgressFragment();
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        //if (this.getArguments() != null)
            //mAdapter = (RecyclerViewAdapter) this.getArguments().getSerializable(ADAPTER_KEY);
        //else
           // Toast.makeText(getContext(), "Null", Toast.LENGTH_LONG).show();

        mAdapter = new RecyclerViewAdapter((ArrayList<DataSet>)this.getArguments().getSerializable(ADAPTER_KEY));

        RecyclerView recyclerView = (RecyclerView) getActivity().findViewById(R.id.recycler_view);
        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);

        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(mAdapter);
            recyclerView.setOnTouchListener(new ShowHideOnScroll(fab));
        }

        return inflater.inflate(R.layout.in_progress_tab_layout, null);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}

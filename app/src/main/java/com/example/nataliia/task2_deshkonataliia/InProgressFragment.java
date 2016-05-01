package com.example.nataliia.task2_deshkonataliia;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shamanland.fab.FloatingActionButton;
import com.shamanland.fab.ShowHideOnScroll;

public class InProgressFragment extends Fragment {

    private RecyclerViewAdapter mAdapter;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.in_progress_tab_layout, container, false);
        Bundle bundle;
        if (this.getArguments() != null) {
            bundle = this.getArguments();
            String key = (String) bundle.get("tab"); //[Comment] Hardcode
            if (key.equals("in progress")) { //[Comment] Hardcode
                mAdapter = new RecyclerViewAdapter(DataSet.setDataInProgress(), this.getContext());
            }
            if (key.equals("done")) { //[Comment] Hardcode
                mAdapter = new RecyclerViewAdapter(DataSet.setDataDone(), this.getContext());
            }
        }

        RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.recycler_view);
        FloatingActionButton fab = (FloatingActionButton) getActivity().findViewById(R.id.fab);

        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
            recyclerView.setLayoutManager(layoutManager);
            recyclerView.setAdapter(mAdapter);
            recyclerView.setOnTouchListener(new ShowHideOnScroll(fab));
        }

        return rootView;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}

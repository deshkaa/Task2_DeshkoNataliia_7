package com.example.nataliia.task1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.nataliia.task2_deshkonataliia.DataSet;
import com.example.nataliia.task2_deshkonataliia.R;

public class SubActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_sub);
        Intent intent = this.getIntent();
        Bundle bundle = intent.getExtras();

        DataSet dataSet =
                (DataSet) bundle.getSerializable("data");

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        if (toolbar != null) {
            setSupportActionBar(toolbar);
            if (dataSet != null) toolbar.setTitle(dataSet.getmTitleNumber());
            toolbar.setNavigationOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onBackPressed();
                }
            });
        }

        if (getSupportActionBar() != null) {
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }


        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast viewToast = Toast.makeText(SubActivity.this,
                        v.getClass().getSimpleName().toString(),
                        Toast.LENGTH_SHORT);
                viewToast.show();
            }
        };

        setAllControlsOnClick(R.id.linear_sub_layout, onClickListener);

        int[] dataset = new int[]{R.drawable.img_1, R.drawable.img_2, R.drawable.img_3};

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);

            RecyclerView.Adapter adapter = new RecyclerViewAdapterSub(dataset, onClickListener);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            linearLayoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

            recyclerView.setLayoutManager(linearLayoutManager);
            recyclerView.setAdapter(adapter);
        }

        if (dataSet != null) {
            TextView title = (TextView) findViewById(R.id.title);
            if (title != null) title.setText(dataSet.getmDataTitle());

            TextView mainText = (TextView) findViewById(R.id.text);
            if (mainText != null) mainText.setText(dataSet.getmMainText());

            TextView data1 = (TextView) findViewById(R.id.text_view_1_2);
            if (data1 != null) data1.setText(dataSet.getmData1());

            TextView data2 = (TextView) findViewById(R.id.text_view_2_2);
            if (data2 != null) data2.setText(dataSet.getmData2());

            TextView data3 = (TextView) findViewById(R.id.text_view_3_2);
            if (data3 != null) data3.setText(dataSet.getmDataDate());

            TextView state = (TextView) findViewById(R.id.state);
            if (state != null) state.setText(dataSet.getmStatus());

            TextView responsible = (TextView) findViewById(R.id.text_view_4_2);
            if (responsible != null) responsible.setText(dataSet.getmResponsible());
        }
    }

    private void setAllControlsOnClick(int id, View.OnClickListener onClickListener) {
        ViewGroup tableViewGroup = (ViewGroup) findViewById(id);
        int mTableChildCount;
        if (tableViewGroup != null) {
            mTableChildCount = tableViewGroup.getChildCount();
            for (int i = 0; i < mTableChildCount; i++) {
                View currentView = tableViewGroup.getChildAt(i);
                Class viewClass = currentView.getClass();
                if (!viewClass.equals(TableRow.class) && !viewClass.equals(TableLayout.class)) {
                    currentView.setOnClickListener(onClickListener);
                } else {
                    setAllControlsOnClick(currentView.getId(), onClickListener);
                }
            }
        }
    }
}

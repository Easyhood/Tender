package com.rgk.qiguan.tenderagency.ui;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.rgk.qiguan.tenderagency.R;

public class MainActivity extends AppCompatActivity {

    private EditText etBidMoney;
    private EditText etBound;
    private Spinner spTitle;
    private TextView tvFinshMoney;//标准收费
    private RelativeLayout btCount;
    private TextView tvFinCouMoney;//优惠收费

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spTitle = (Spinner) findViewById(R.id.sp_title);
        etBidMoney = (EditText) findViewById(R.id.et_bidmoney);
        etBound = (EditText) findViewById(R.id.et_bound);
        tvFinshMoney = (TextView) findViewById(R.id.tv_finish_money);
        tvFinCouMoney = (TextView) findViewById(R.id.tv_finish_count_money);
        btCount = (RelativeLayout) findViewById(R.id.bt_count);
        spTitle.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int pos, long id) {

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        btCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               bidCount();
            }
        });
    }

    /**
     * 服务费的计算方法
     */
    private void bidCount() {

    }


}

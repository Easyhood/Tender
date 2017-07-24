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
import com.rgk.qiguan.tenderagency.utils.CountUtil;

public class MainActivity extends AppCompatActivity {

    private EditText etBidMoney;
    private EditText etBound;
    private Spinner spTitle;
    private TextView tvFinshMoney;//标准收费
    private RelativeLayout btCount;
    private TextView tvFinCouMoney;//优惠收费
    private int postion = 0;
    private double charge = 0;
    private double discount = 0;
    private double chargeAfter = 0;

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
                  postion = pos;
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
        String bidMoneyStr = etBidMoney.getText().toString();
        double bidMoney = Double.parseDouble(bidMoneyStr);

        String discountStr = etBound.getText().toString();
        double beforeDiscount = Double.parseDouble(discountStr);
        discount = beforeDiscount/100;

        switch (postion){
            case 0:
                charge = CountUtil.projectCount(bidMoney);
                chargeAfter = charge*discount;
                break;
            case 1:
                charge = CountUtil.goodsCount(bidMoney);
                chargeAfter = charge*discount;
                break;
            case 2:
                charge = CountUtil.serveCount(bidMoney);
                chargeAfter = charge*discount;
                break;
        }
        String standardDescribe = getResources().getString(R.string.standard_charge)+
                charge+getResources().getString(R.string.ten_thousand);
        String discountDescribe = getResources().getString(R.string.discount_charges)+
                chargeAfter+getResources().getString(R.string.ten_thousand);

        tvFinshMoney.setText(standardDescribe);
        tvFinCouMoney.setText(discountDescribe);
    }


}

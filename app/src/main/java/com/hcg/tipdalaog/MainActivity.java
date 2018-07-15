package com.hcg.tipdalaog;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.hcg.tipdialoglibrary.widget.TipLoadDialog;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Context mActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.mActivity = this;
        findViewById(R.id.b_loading1).setOnClickListener(this);
        findViewById(R.id.b_loading2).setOnClickListener(this);
        findViewById(R.id.success).setOnClickListener(this);
        findViewById(R.id.failed).setOnClickListener(this);
        findViewById(R.id.info).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            
            case R.id.b_loading1:
                final TipLoadDialog loading1 = new TipLoadDialog(mActivity, "加载中", TipLoadDialog
                        .ICON_TYPE_LOADING);
                loading1.show();
                //模拟耗时操作
                findViewById(R.id.b_loading1).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loading1.dismiss();
                    }
                }, 2000);
                break;
            case R.id.b_loading2:
                final TipLoadDialog loading2 = new TipLoadDialog(mActivity, "加载中", TipLoadDialog
                        .ICON_TYPE_LOADING2);
                loading2.show();
                //模拟耗时操作
                findViewById(R.id.b_loading1).postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        loading2.dismiss();
                    }
                }, 2000);
                break;
            case R.id.success:
                new TipLoadDialog(mActivity, "登录成功", TipLoadDialog.ICON_TYPE_SUCCESS)
                        .setTipTime(1000)
                        .show();
                break;
            case R.id.failed:
                new TipLoadDialog(mActivity, "登录失败", TipLoadDialog.ICON_TYPE_FAIL)
                        .show();
                break;
            case R.id.info:
                new TipLoadDialog(mActivity, "提示", TipLoadDialog.ICON_TYPE_INFO)
                        .show();
                break;
        }
    }
}

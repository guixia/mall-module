package com.fenlibao.mall;

import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.fenlibao.common.base.BaseActivity;
import com.fenlibao.common.base.RoutePath;

@Route(path = RoutePath.MALL_2_URL_MAIN)
public class MallSecondActivity extends BaseActivity {


    @Override
    public void init() {

    }

    @Override
    public void initViews() {
        Button bt_back = findViewById(R.id.bt_back);
        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                _activity.finish();
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.mall_activity_detail;
    }
}

package com.fenlibao.mall;

import android.view.View;
import android.widget.Button;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.fenlibao.common.base.BaseActivity;
import com.fenlibao.common.base.RoutePath;

@Route(path = RoutePath.MALL_1_URL_MAIN)
public class MainActivity extends BaseActivity {

    @Override
    public void init() {

    }

    @Override
    public void initViews() {
        Button bt_button1 = findViewById(R.id.bt_button1);
        Button bt_button2 = findViewById(R.id.bt_button2);
        bt_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(RoutePath.APP_URL_MAIN).navigation();
                _activity.finish();
//                BaseApplication application = BaseApplication.getInstance();
//                Log.e("caoliang", "MainActivity1----onClick()---->" + application.hashCode());
            }
        });
        bt_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ARouter.getInstance().build(RoutePath.MALL_2_URL_MAIN).navigation();
            }
        });
    }

    @Override
    public int getLayoutId() {
        return R.layout.activity_mall_home;
    }
}

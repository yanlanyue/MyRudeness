package com.cn.myrudeness.com.cn.myrudeness;

import android.app.Application;

import com.bulong.rudeness.RudenessScreenHelper;

/**
 * Created by yanjunlin on 2017/8/25 9:23.
 */

public class RudenessApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //设计图标注的宽度为750
        new RudenessScreenHelper(this, 750).activate();
//        new DensityHelper(this, 750).activate();
    }
}

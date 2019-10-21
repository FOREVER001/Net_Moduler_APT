package com.tianzhuan.net_moduler_apt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tianzhuan.annotation.ARouter;

@ARouter(path = "/app/OrderActivity")
public class OrderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        Log.e("netease >>>","--->OrderActivity");
    }

    //跳转personal
    public void jump(View view) {
        Class<?> targetClass = PersonalActivity$$ARouter.findTargetClass("/app/PersonalActivity");
        startActivity(new Intent(this,targetClass));
    }
}

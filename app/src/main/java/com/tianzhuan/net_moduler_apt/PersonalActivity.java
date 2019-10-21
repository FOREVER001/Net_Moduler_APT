package com.tianzhuan.net_moduler_apt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tianzhuan.annotation.ARouter;

@ARouter(path = "/app/PersonalActivity")
public class PersonalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);
        Log.e("netease >>>","--->PersonalActivity");
    }
    //跳转到页面
    public void jump(View view) {
        Class<?> targetClass = MainActivity$$ARouter.findTargetClass("/app/MainActivity");
        startActivity(new Intent(this,targetClass));
    }
}

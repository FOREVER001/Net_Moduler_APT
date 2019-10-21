package com.tianzhuan.net_moduler_apt;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.tianzhuan.annotation.ARouter;

@ARouter(path = "/app/MainActivity")
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("netease >>>","--->MainActivity");
    }

    //跳转到order
    public void jump(View view) {
        Class<?> targetClass = OrderActivity$$ARouter.findTargetClass("/app/OrderActivity");
        startActivity(new Intent(this,targetClass));
    }
}

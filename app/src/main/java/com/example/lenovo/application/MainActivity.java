package com.example.lenovo.application;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import fm.jiecao.jcvideoplayer_lib.JCVideoPlayerStandard;

public class MainActivity extends BaseActivity {
    @BindView(R.id.trans1)
    TextView textView;
    @BindView(R.id.trans2)
    TextView textView1;
    @BindView(R.id.trans3)
    TextView textView2;
    @BindView(R.id.trans4)
    TextView textView3;
    @BindView(R.id.images1)
    ImageView imageView;
    @Override
    protected Activity getContext() {
        return MainActivity.this;
    }

    @Override
    protected int getContentView() {
        return R.layout.activity_main;
    }

    @Override
    protected void onCreate() {
        ButterKnife.bind(this);
      /*  JCVideoPlayerStandard jcVideoPlayerStandard = (JCVideoPlayerStandard) findViewById(R.id.custom_videoplayer_standard);
        jcVideoPlayerStandard.setUp("rtmp://player.daniulive.com:1935/hls/stream123456"
                , "");*/
//        TextView textView=findViewById(R.id.trans1);
//        TextView textView1=findViewById(R.id.trans2);
//        TextView textView2=findViewById(R.id.trans3);
//        TextView textView3=findViewById(R.id.trans4);
//        ImageView imageView=findViewById(R.id.images1);
        Animation animation=new TranslateAnimation(0f,100f,0f,100f);
        animation.setDuration(1000);
        animation.setFillAfter(true);
        textView.startAnimation(animation);

        Animation animation1=new ScaleAnimation(1,2,1,2);
        animation1.setDuration(1000);
        animation1.setFillAfter(true);
        textView1.startAnimation(animation1);

        Animation animation2=new RotateAnimation(0f,180f,Animation.RELATIVE_TO_SELF, 0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        animation2.setDuration(1000);
        animation2.setInterpolator(new AccelerateInterpolator());
        animation2.setFillAfter(true);
        textView2.startAnimation(animation2);

        Animation animation3=new AlphaAnimation(0.1f,1.0f);
        animation3.setDuration(2000);
        animation3.setFillAfter(true);
        textView3.startAnimation(animation3);

        AnimationDrawable animationDrawable= (AnimationDrawable) imageView.getBackground();
        animationDrawable.start();
    }
}

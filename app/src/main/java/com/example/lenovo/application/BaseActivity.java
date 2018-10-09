package com.example.lenovo.application;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.example.lenovo.application.library.FloatingActionWidget;
import com.oguzdev.circularfloatingactionmenu.library.SubActionButton;

/**
 * Created by zhengzhihua on 2018/10/5.15:33
 * Update 2018/10/5 15:33
 * Describe
 */

public abstract class BaseActivity extends AppCompatActivity{
     Activity activity;
     Context context;
    protected abstract Activity getContext();
//    protected abstract void onCreate();
    protected abstract int getContentView();
    protected abstract void onCreate();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getContentView());
         activity=getContext();
 //       onCreate();
        addbutton();
        onCreate();

    }

    protected void addbutton(){
        FloatingActionWidget floatingActionWidget = new FloatingActionWidget(activity);
        SubActionButton button1 = floatingActionWidget.buildSubActionButton(android.R.drawable.ic_menu_edit, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "你点到我了1", Toast.LENGTH_LONG).show();
            }
        });
        floatingActionWidget.addSubButton(button1);
        SubActionButton button2 = floatingActionWidget.buildSubActionButton(android.R.drawable.ic_menu_edit, new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(activity, "你点到我了2", Toast.LENGTH_LONG).show();
            }
        });
        ;
        floatingActionWidget.addSubButton(button2);
        floatingActionWidget.setMainButtonIcon(R.mipmap.ic_launcher);
        floatingActionWidget.build();
    }
}

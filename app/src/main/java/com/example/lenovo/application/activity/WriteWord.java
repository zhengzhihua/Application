package com.example.lenovo.application.activity;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.lenovo.application.R;
import com.example.lenovo.application.view.CanvasView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by zhengzhihua on 2018/10/9.14:00
 * Update 2018/10/9 14:00
 * Describe
 */

public class WriteWord extends AppCompatActivity{
    @Nullable
    @BindView(R.id.canvasview)
    CanvasView canvasView;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.writeword);
        ButterKnife.bind(this);
      /*  CanvasView canvasView=findViewById(R.id.canvasview);*/
        canvasView.setPath(getPath());
        canvasView.start();
    }

    private Path getPath() {
        Path textPath = new Path();
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        paint.setColor(Color.RED);
        paint.setTextSize(120);
        paint.setTypeface(Typeface.defaultFromStyle(Typeface.BOLD_ITALIC));
        String s ="欢迎光临乐道智能科技";
        paint.getTextPath(s, 0, s.length(), 0, 200, textPath);
        textPath.close();
        return textPath;
    }
}

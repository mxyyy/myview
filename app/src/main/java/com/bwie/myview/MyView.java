package com.bwie.myview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {

    private int hmode;
    private int wmode;
    private int wsize;
    private int hsize;
    private Paint paint;
    private Paint mpain;


    public MyView(Context context) {
        super(context);
    }

    public MyView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        wmode = MeasureSpec.getMode(widthMeasureSpec);
        hmode = MeasureSpec.getMode(heightMeasureSpec);

        wsize = MeasureSpec.getSize(widthMeasureSpec);
        hsize = MeasureSpec.getSize(heightMeasureSpec);

        if (wmode == MeasureSpec.AT_MOST && hmode == MeasureSpec.AT_MOST){
            setMeasuredDimension(wsize,hsize);
        }else if (wsize ==MeasureSpec.AT_MOST){
            setMeasuredDimension(wsize,450);
        }else if (hmode == MeasureSpec.AT_MOST){
            setMeasuredDimension(450,hsize);
        }


    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);


        //        创建画笔
        mpain = new Paint();
//        图的
        paint = new Paint();

        paint.setColor(Color.RED);
        mpain.setColor(Color.BLUE);

        paint.setTextSize(20);
        canvas.drawText("2018年8月26日至9月2日平均2.5公里",100,440,paint);

//        计算高度
        int u = 400 / 50;
        for (int i = 0; i < u; i++) {
            // canvas.drawLine(0,100 * i,wsize,100 * i,mpain);
        }
        for (int i = 0; i < 6; i++) {
            canvas.drawLine(20,80 * i,wsize,80 * i,mpain);
        }

        for (int i = 0; i < 9; i++) {
            canvas.drawLine(20+(100 * i),0,20+(100 * i),400,mpain);
        }
        canvas.drawRect(40,360,100,400,paint);
        canvas.drawRect(140,100,200,400,paint);
        canvas.drawRect(240,120,300,400,paint);
        canvas.drawRect(340,200,400,400,paint);
        canvas.drawRect(440,270,500,400,paint);
        canvas.drawRect(540,240,600,400,paint);
        canvas.drawRect(640,180,700,400,paint);

        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(2);
        paint.setTextSize(20);
        canvas.drawText("500", 40, 300, paint);
        canvas.drawText("5800", 140, 100, paint);
        canvas.drawText("5500", 240, 110, paint);
        canvas.drawText("4800", 340, 170, paint);
        canvas.drawText("3600", 440, 240, paint);
        canvas.drawText("4000", 540, 200, paint);
        canvas.drawText("3800", 640, 150, paint);


        canvas.drawText("周一", 40, 420, paint);
        canvas.drawText("周二", 140, 420, paint);
        canvas.drawText("周三", 240, 420, paint);
        canvas.drawText("周四", 340, 420, paint);
        canvas.drawText("周无", 440, 420, paint);
        canvas.drawText("周流", 540, 420, paint);
        canvas.drawText("周天", 640, 420, paint);

        canvas.drawText("3000",0,320,paint);
        canvas.drawText("4000",0,240,paint);
        canvas.drawText("5000",0,160,paint);
       }
 }

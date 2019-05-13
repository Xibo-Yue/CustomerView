package com.xibo.customerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

/**
 * @author Xibo_Yue
 * @time 2019/5/13 9:46
 */
public class View1 extends View {

    public View1(Context context,AttributeSet attrs) {
        super(context, attrs);
    }


    Paint mPaint = new Paint();


    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawCircle(300,300,200,mPaint);
    }
}

package com.xibo.customerview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Build;
import android.support.annotation.RequiresApi;
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


    Paint mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
    Path path = new Path();

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        /*
        //画圆、矩形
        mPaint.setColor(Color.RED);  //设置颜色
        mPaint.setStyle(Paint.Style.STROKE);  //设置线条类型
        mPaint.setStrokeWidth(20); //设置线条宽度
        mPaint.setAntiAlias(true); //开启抗锯齿
        canvas.drawCircle(300,300,200,mPaint);//画圆
        canvas.drawRect(100,600,600,800,mPaint);//画矩形
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawRect(100,900,600,1100,mPaint);//画矩形
         */


        /*
        mPaint.setStrokeWidth(50);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoint(100,100,mPaint);
        mPaint.setStrokeCap(Paint.Cap.SQUARE);
        canvas.drawPoint(100,200,mPaint);
        */

        /*
        //画连续的点
        float[] points = {0, 0, 50, 50, 50, 100, 100, 50, 100, 100, 150, 50, 150, 100};
        // 绘制四个点：(50, 50) (50, 100) (100, 50) (100, 100)
        //跳过两个数，即前两个 0
        mPaint.setStrokeWidth(20);
        mPaint.setStrokeCap(Paint.Cap.ROUND);
        canvas.drawPoints(points, 2 , 8, mPaint);
       */

        /*
        //画椭圆
        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawOval(50,50,150,100,mPaint);
        */

        /*
        //画线
        mPaint.setStrokeWidth(10);
        //canvas.drawLine(200, 200, 800, 500, mPaint);
        float[] points = {
                20, 20,
                120, 20,
                70, 20,
                70, 120,
                20, 120,
                120, 120,
                150, 20,
                250, 20,
                150, 20,
                150, 120,
                250, 20,
                250, 120,
                150, 120,
                250, 120};
        canvas.drawLines(points, mPaint);
        */

        /*
        //画圆角矩形
        canvas.drawRoundRect(100, 100, 500, 300, 50, 80, mPaint);
        */

        /*
        //画扇形
        mPaint.setStyle(Paint.Style.FILL); // 填充模式
        canvas.drawArc(200, 100, 800, 500, -110, 100, true, mPaint); // 绘制扇形
        canvas.drawArc(200, 100, 800, 500, 20, 140, true, mPaint); // 绘制弧形
        mPaint.setStyle(Paint.Style.STROKE); // 画线模式
        canvas.drawArc(200, 100, 800, 500, 180, 60, false, mPaint); // 绘制不封口的弧形
        */

        /*
        //path画封闭图形
        //addOval(float left, float top, float right, float bottom, Direction dir)
        //addOval(RectF oval, Direction dir) 添加椭圆
        //addRect(float left, float top, float right, float bottom, Direction dir)
        //addRect(RectF rect, Direction dir) 添加矩形
        //addRoundRect(RectF rect, float rx, float ry, Direction dir)
        //addRoundRect(float left, float top, float right, float bottom, float rx, float ry, Direction dir)
        //addRoundRect(RectF rect, float[] radii, Direction dir)
        //addRoundRect(float left, float top, float right, float bottom, float[] radii, Direction dir) 添加圆角矩形
        //addPath(Path path) 添加另一个 Path
        path.addCircle(300, 300, 200, Path.Direction.CW);
        canvas.drawPath(path, mPaint);
        */

        /*
        //用path画线
        mPaint.setStyle(Paint.Style.STROKE);
        path.lineTo(100, 100); // 由当前位置 (0, 0) 向 (100, 100) 画一条直线
        path.rLineTo(100, 0); // 由当前位置 (100, 100) 向正右方 100 像素的位置画一条
        canvas.drawPath(path, mPaint);
        */

        /*
        quadTo(float x1, float y1, float x2, float y2)
        rQuadTo(float dx1, float dy1, float dx2, float dy2) //画二次贝塞尔曲线

        cubicTo(float x1, float y1, float x2, float y2, float x3, float y3)
        rCubicTo(float x1, float y1, float x2, float y2, float x3, float y3) //三次贝塞尔曲线
        */

        /*
        mPaint.setStyle(Paint.Style.STROKE);
        path.lineTo(100, 100); // 画斜线
        path.moveTo(200, 100); // 我移~~
        path.lineTo(200, 0); // 画竖线
        canvas.drawPath(path,mPaint);
         */

        /*
        //canvas.drawRect(100,100,300,300,mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        mPaint.setStrokeWidth(10);
        path.lineTo(100, 100);
        path.arcTo(100, 100, 300, 300, -90, 90, false); // 强制移动到弧形起点（无痕迹）
        canvas.drawPath(path,mPaint);
        */

        /*
        mPaint.setStyle(Paint.Style.STROKE);
        path.lineTo(100, 100);
        path.addArc(100, 100, 300, 300, -90, 90);
        canvas.drawPath(path,mPaint);
        */

        /*
        mPaint.setStyle(Paint.Style.FILL);
        path.moveTo(100, 100);
        path.lineTo(200, 100);
        path.lineTo(150, 150);
        path.close();
        canvas.drawPath(path,mPaint);
        */

        /*
        mPaint.setStyle(Paint.Style.FILL);
        path.setFillType(Path.FillType.WINDING);
        path.addCircle(300, 300, 200, Path.Direction.CW);
        path.addCircle(500, 300, 200, Path.Direction.CW);
        canvas.drawPath(path,mPaint);
        mPaint.setStyle(Paint.Style.STROKE);
        path.addCircle(300, 800, 200, Path.Direction.CW);
        path.addCircle(300, 800, 100, Path.Direction.CW);
        canvas.drawPath(path,mPaint);
        */

        /*
        //绘制图片
        @SuppressLint("DrawAllocation")
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher);
        canvas.drawBitmap(bitmap,100,100,mPaint);
        */


        String text = "Hello Word";
        mPaint.setTextSize(18);
        canvas.drawText(text, 100, 25, mPaint);
        mPaint.setTextSize(36);
        canvas.drawText(text, 100, 70, mPaint);
        mPaint.setTextSize(60);
        canvas.drawText(text, 100, 145, mPaint);
        mPaint.setTextSize(84);
        canvas.drawText(text, 100, 240, mPaint);
    }
}

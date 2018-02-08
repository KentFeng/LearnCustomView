package com.noon.drawview.views;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

import com.customview.andprac.R;

/**
 * Created by wu on 2018/1/3.
 */

public class DrawLine extends View {
    private Paint mPaint;
    public DrawLine(Context context) {
        this(context, null);
    }

    public DrawLine(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, -1);
    }

    public DrawLine(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

        initData();
    }

    private void initData() {
        mPaint = new Paint();
        mPaint.setAntiAlias(true);
        mPaint.setColor(getResources().getColor(R.color.colorPrimary));
        mPaint.setTextSize(getResources().getDimensionPixelSize(R.dimen.sp_15));
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawCircle(300,300,230,mPaint);
        canvas.drawText("I am ten",280,30,mPaint);
        // 画图
        canvas.drawBitmap(BitmapFactory.decodeResource(getResources(),R.mipmap.ic_launcher_round),430,20,mPaint);
    }
}

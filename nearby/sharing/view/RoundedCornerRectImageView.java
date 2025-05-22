package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import defpackage.ctwt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class RoundedCornerRectImageView extends AppCompatImageView {
    private final float a;
    private final Path b;
    private final Paint c;
    private final Paint d;
    private final Paint e;

    public RoundedCornerRectImageView(Context context) {
        super(context);
        Paint paint = new Paint(0);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(0);
        this.e = paint3;
        this.b = new Path();
        this.a = ctwt.f(context, 16.0f);
        paint.setColor(-1728053248);
        paint.setStyle(Paint.Style.FILL);
        paint3.setColor(ctwt.d(context));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(ctwt.f(context, 1.0f));
        paint2.setColor(-1);
        paint2.setTextSize(ctwt.f(context, 20.0f));
        paint2.setTextAlign(Paint.Align.CENTER);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        RectF rectF = new RectF(getPaddingLeft(), getPaddingTop(), (getWidth() - getPaddingRight()) - getPaddingLeft(), (getHeight() - getPaddingBottom()) - getPaddingTop());
        float f = this.a;
        Path.Direction direction = Path.Direction.CW;
        Path path = this.b;
        path.addRoundRect(rectF, new float[]{f, f, f, f, f, f, f, f}, direction);
        canvas.clipPath(path);
        super.onDraw(canvas);
        RectF rectF2 = new RectF();
        RectF rectF3 = new RectF();
        RectF rectF4 = new RectF();
        RectF rectF5 = new RectF();
        float f2 = f + f;
        rectF3.set(rectF.right - f2, rectF.top, rectF.right, rectF.top + f2);
        rectF5.set(rectF.right - f2, rectF.bottom - f2, rectF.right, rectF.bottom);
        rectF4.set(rectF.left, rectF.bottom - f2, rectF.left + f2, rectF.bottom);
        rectF2.set(rectF.left, rectF.top, rectF.left + f2, rectF.top + f2);
        canvas.drawRoundRect(rectF, f, f, this.e);
    }

    public RoundedCornerRectImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint(0);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(0);
        this.e = paint3;
        this.b = new Path();
        this.a = ctwt.f(context, 16.0f);
        paint.setColor(-1728053248);
        paint.setStyle(Paint.Style.FILL);
        paint3.setColor(ctwt.d(context));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(ctwt.f(context, 1.0f));
        paint2.setColor(-1);
        paint2.setTextSize(ctwt.f(context, 20.0f));
        paint2.setTextAlign(Paint.Align.CENTER);
    }

    public RoundedCornerRectImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Paint paint = new Paint(0);
        this.c = paint;
        Paint paint2 = new Paint(1);
        this.d = paint2;
        Paint paint3 = new Paint(0);
        this.e = paint3;
        this.b = new Path();
        this.a = ctwt.f(context, 16.0f);
        paint.setColor(-1728053248);
        paint.setStyle(Paint.Style.FILL);
        paint3.setColor(ctwt.d(context));
        paint3.setStyle(Paint.Style.STROKE);
        paint3.setStrokeWidth(ctwt.f(context, 1.0f));
        paint2.setColor(-1);
        paint2.setTextSize(ctwt.f(context, 20.0f));
        paint2.setTextAlign(Paint.Align.CENTER);
    }
}

package com.google.android.gms.wallet.dynamite.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import defpackage.tiy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class RoundedImageViewWithBorder extends AppCompatImageView {
    private int a;
    private int b;
    private int c;

    public RoundedImageViewWithBorder(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (getDrawable() == null || this.a <= 0) {
            super.onDraw(canvas);
            return;
        }
        int width = getWidth();
        float f = width;
        float height = getHeight();
        float f2 = this.b / 2.0f;
        RectF rectF = new RectF(f2, f2, f - f2, height - f2);
        canvas.saveLayer(0.0f, 0.0f, f, height, null);
        Paint paint = new Paint(1);
        paint.setColor(-1);
        float f3 = this.a;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        float f4 = this.b;
        canvas.saveLayer(f4, f4, width - r1, r7 - r1, paint);
        super.onDraw(canvas);
        canvas.restore();
        if (this.b > 0) {
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(this.b);
            paint2.setColor(this.c);
            float f5 = this.a;
            canvas.drawRoundRect(rectF, f5, f5, paint2);
        }
        canvas.restore();
    }

    public RoundedImageViewWithBorder(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageViewWithBorder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = 0;
        this.b = 0;
        this.c = 0;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tiy.o);
            try {
                this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
                this.b = obtainStyledAttributes.getDimensionPixelSize(2, 0);
                this.c = obtainStyledAttributes.getColor(1, 0);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}

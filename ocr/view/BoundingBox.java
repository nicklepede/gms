package com.google.android.gms.ocr.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.PaintDrawable;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.R;
import defpackage.tiy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class BoundingBox extends View {
    private final float a;
    private final float b;
    private final PaintDrawable c;
    private final Paint d;
    private float e;
    private final int f;
    private final Rect g;
    private final RectF h;
    private final RectF i;
    private final RectF j;
    private final RectF k;

    public BoundingBox(Context context) {
        this(context, null);
    }

    protected static final Paint e(int i, int i2) {
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(i2);
        paint.setStrokeCap(Paint.Cap.ROUND);
        return paint;
    }

    protected void a(Rect rect) {
        int i = this.f;
        rect.set(i, i, i, i);
    }

    public final void c() {
        PaintDrawable paintDrawable = this.c;
        paintDrawable.getPaint().setAntiAlias(false);
        paintDrawable.getPaint().setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        invalidate();
    }

    protected final boolean d() {
        return this.g.width() > 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (d()) {
            this.c.draw(canvas);
            Rect rect = this.g;
            float f = rect.left;
            float f2 = rect.top;
            float f3 = rect.right;
            float f4 = rect.bottom;
            float f5 = this.e;
            canvas.drawRoundRect(f, f2, f3, f4, f5, f5, this.d);
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Rect rect = this.g;
        a(rect);
        int measuredWidth = (getMeasuredWidth() - rect.left) - rect.right;
        int measuredHeight = (getMeasuredHeight() - rect.top) - rect.bottom;
        if (rect.width() == measuredWidth && rect.height() == measuredHeight) {
            return;
        }
        float f = this.a;
        if (f < 0.0f) {
            f = measuredWidth * this.b;
        }
        this.e = f;
        rect.set(rect.left, rect.top, measuredWidth + rect.width(), measuredHeight + rect.height());
        PaintDrawable paintDrawable = this.c;
        paintDrawable.setCornerRadius(this.e);
        paintDrawable.setBounds(rect);
        RectF rectF = this.h;
        float f2 = f + f;
        rectF.set(rect.left, rect.top, rect.left + f2, rect.top + f2);
        RectF rectF2 = this.i;
        rectF2.set(rect.right - f2, rect.top, rect.right, rect.top + f2);
        RectF rectF3 = this.j;
        rectF3.set(rect.right - f2, rect.bottom - f2, rect.right, rect.bottom);
        RectF rectF4 = this.k;
        rectF4.set(rect.left, rect.bottom - f2, rect.left + f2, rect.bottom);
        b(rect, rectF, rectF2, rectF3, rectF4, this.e);
    }

    public BoundingBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BoundingBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new PaintDrawable();
        new Path();
        this.g = new Rect();
        this.h = new RectF();
        this.i = new RectF();
        this.j = new RectF();
        this.k = new RectF();
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, tiy.a, 0, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, getResources().getDimensionPixelSize(R.dimen.ocr_bounding_box_line_width));
            this.f = dimensionPixelSize;
            this.d = e(obtainStyledAttributes.getColor(1, getResources().getColor(android.R.color.white)), dimensionPixelSize);
            this.b = obtainStyledAttributes.getFloat(0, 0.0406f);
            this.a = obtainStyledAttributes.getDimension(3, -1.0f);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    protected void b(Rect rect, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, float f) {
    }
}

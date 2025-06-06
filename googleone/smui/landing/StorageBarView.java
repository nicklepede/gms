package com.google.android.gms.googleone.smui.landing;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.gms.R;
import defpackage.bltv;
import defpackage.elgo;
import defpackage.elpg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class StorageBarView extends View {
    public boolean a;
    public elgo b;
    private final Context c;

    public StorageBarView(Context context) {
        this(context, null);
    }

    public final Paint a(int i, Paint.Cap cap) {
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(getResources().getDimensionPixelSize(R.dimen.progress_bar_height));
        paint.setStrokeCap(cap);
        paint.setColor(i);
        return paint;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        float f;
        super.onDraw(canvas);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.progress_bar_height);
        int dimensionPixelSize2 = getResources().getDimensionPixelSize(R.dimen.progress_bar_separator_width);
        int dimensionPixelSize3 = getResources().getDimensionPixelSize(R.dimen.progress_bar_min_width);
        float f2 = dimensionPixelSize;
        int width = getWidth() - dimensionPixelSize;
        Context context = this.c;
        float f3 = width;
        float f4 = f2 * 0.5f;
        canvas.drawLine(f4, f4, f3, f4, a(context.getColor(R.color.smui_bar_background), Paint.Cap.ROUND));
        float f5 = 0.0f;
        int i = 0;
        while (true) {
            elgo elgoVar = this.b;
            if (i >= ((elpg) elgoVar).c) {
                return;
            }
            bltv bltvVar = (bltv) elgoVar.get(i);
            float f6 = i == 0 ? f4 : f5;
            float f7 = bltvVar.b * f3;
            if (f7 - f6 < dimensionPixelSize3 + dimensionPixelSize) {
                f7 = f6 + dimensionPixelSize3 + f2;
            }
            int i2 = (((elpg) this.b).c - 1) - i;
            float min = Math.min(f7, f3 - ((r11 * i2) + (i2 * (dimensionPixelSize2 + dimensionPixelSize))));
            if (i == 0) {
                Paint paint = bltvVar.a;
                paint.setStrokeCap(Paint.Cap.ROUND);
                float f8 = f6 + ((min - f6) / 2.0f);
                canvas.drawLine(f6, f4, f8, f4, paint);
                if (((elpg) this.b).c == 1) {
                    paint.setStrokeCap(this.a ? Paint.Cap.ROUND : Paint.Cap.SQUARE);
                } else {
                    paint.setStrokeCap(Paint.Cap.SQUARE);
                }
                f = min;
                canvas.drawLine(f8, f4, f, f4, paint);
                i = 0;
            } else if (i == ((elpg) this.b).c - 1 && this.a) {
                Paint paint2 = bltvVar.a;
                float f9 = f6 + ((min - f6) / 2.0f);
                canvas.drawLine(f6, f4, f9, f4, paint2);
                paint2.setStrokeCap(Paint.Cap.ROUND);
                f = min;
                canvas.drawLine(f9, f4, f, f4, paint2);
            } else {
                f = min;
                canvas.drawLine(f6, f4, f, f4, bltvVar.a);
            }
            Paint a = a(context.getColor(R.color.smui_bar_separator), Paint.Cap.SQUARE);
            if (i != ((elpg) this.b).c - 1) {
                float f10 = f + f2;
                float f11 = f10 + dimensionPixelSize2;
                canvas.drawLine(f10, f4, f11, f4, a);
                f5 = f11;
            }
            i++;
        }
    }

    public StorageBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i = elgo.d;
        this.b = elpg.a;
        this.c = context;
    }
}

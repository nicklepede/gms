package com.google.android.gms.ocr.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.cast.JGCastService;
import defpackage.tiy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FixedAspectRatioFrameLayout extends FrameLayout {
    public float a;

    public FixedAspectRatioFrameLayout(Context context) {
        this(context, null);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.a <= 0.0f) {
            super.onMeasure(i, i2);
            return;
        }
        if (View.MeasureSpec.getMode(i) == 0) {
            View.MeasureSpec.makeMeasureSpec(0, JGCastService.FLAG_PRIVATE_DISPLAY);
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        int round = Math.round(size / this.a);
        if (mode == Integer.MIN_VALUE) {
            size2 = Math.min(round, size2);
        } else if (mode != 1073741824) {
            size2 = round;
        }
        setMeasuredDimension(size, size2);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_PRIVATE_DISPLAY);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2, JGCastService.FLAG_PRIVATE_DISPLAY);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec2);
        }
    }

    public FixedAspectRatioFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = 0.0f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tiy.l);
            try {
                this.a = obtainStyledAttributes.getFloat(0, this.a);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
    }
}

package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.google.android.cast.JGCastService;
import defpackage.tiy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class MaxHeightListView extends ListView {
    private int a;

    public MaxHeightListView(Context context) {
        super(context);
        a(context, null);
    }

    private final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tiy.k);
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 300);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.a > 0) {
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            i2 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.min(size, this.a), mode) : View.MeasureSpec.makeMeasureSpec(this.a, JGCastService.FLAG_USE_TDLS);
        }
        super.onMeasure(i, i2);
    }

    public MaxHeightListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        a(context, attributeSet);
    }

    public MaxHeightListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }
}

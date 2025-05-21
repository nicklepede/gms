package com.google.android.gms.wallet.common.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.cast.JGCastService;
import defpackage.asnb;
import defpackage.iuo;
import defpackage.rpq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IndeterminateMultiColorSpinner extends ViewGroup {
    ImageView a;
    asnb b;
    private int c;
    private int d;

    public IndeterminateMultiColorSpinner(Context context) {
        this(context, null);
    }

    private final void a(int i) {
        if (i != 0) {
            i = 1;
        }
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        if (i == 0) {
            int i2 = (int) (displayMetrics.density * 56.0f);
            this.c = i2;
            this.d = i2;
        } else {
            int i3 = (int) (displayMetrics.density * 40.0f);
            this.c = i3;
            this.d = i3;
        }
        this.a.setImageDrawable(null);
        this.b.c(i);
        this.a.setImageDrawable(this.b);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        int i5 = measuredWidth / 2;
        int measuredWidth2 = this.a.getMeasuredWidth() / 2;
        int i6 = measuredHeight / 2;
        int measuredHeight2 = this.a.getMeasuredHeight() / 2;
        this.a.layout(i5 - measuredWidth2, i6 - measuredHeight2, i5 + measuredWidth2, i6 + measuredHeight2);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.a.measure(View.MeasureSpec.makeMeasureSpec(this.c, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(this.d, JGCastService.FLAG_PRIVATE_DISPLAY));
        int i3 = this.c;
        int[] iArr = iuo.a;
        setMeasuredDimension(i3 + getPaddingStart() + getPaddingEnd(), this.d + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        int i2;
        if (i == 0) {
            i2 = 0;
            if (!this.b.isRunning()) {
                this.b.start();
                super.setVisibility(i2);
                this.a.setVisibility(i2);
            }
            i = 0;
        }
        if (i != 0 && this.b.isRunning()) {
            this.b.stop();
        }
        i2 = i;
        super.setVisibility(i2);
        this.a.setVisibility(i2);
    }

    public IndeterminateMultiColorSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setWillNotDraw(false);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.enabled});
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
        ImageView imageView = new ImageView(getContext());
        this.a = imageView;
        imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        asnb asnbVar = new asnb(getContext(), this);
        this.b = asnbVar;
        asnbVar.setAlpha(255);
        this.a.setImageDrawable(this.b);
        this.a.setVisibility(8);
        addView(this.a);
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, rpq.g);
        int i = obtainStyledAttributes2.getInt(2, 0);
        if (i == 0) {
            a(1);
        } else {
            if (i != 1) {
                throw new IllegalArgumentException("Unknown size for IndeterminateMulticolorSpinner");
            }
            a(0);
        }
        int resourceId = obtainStyledAttributes2.getResourceId(1, -1);
        if (resourceId != -1) {
            this.b.a(context.getResources().getIntArray(resourceId));
        }
        int i2 = obtainStyledAttributes2.getInt(0, 0);
        setVisibility(i2 != 0 ? i2 != 1 ? 8 : 4 : 0);
        obtainStyledAttributes2.recycle();
    }
}

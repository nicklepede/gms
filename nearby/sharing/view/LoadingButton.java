package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import com.google.android.material.button.MaterialButton;
import defpackage.cpcj;
import defpackage.ctwt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class LoadingButton extends MaterialButton {
    private cpcj b;

    public LoadingButton(Context context) {
        super(context);
        e(context);
    }

    private final void e(Context context) {
        getCurrentTextColor();
        cpcj cpcjVar = new cpcj(context, ctwt.l(context));
        this.b = cpcjVar;
        cpcjVar.setCallback(this);
    }

    @Override // android.widget.TextView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        invalidate();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        double min = Math.min(measuredWidth, measuredHeight);
        int paddingLeft = getPaddingLeft() + (measuredWidth / 2);
        int paddingTop = getPaddingTop() + (measuredHeight / 2);
        int i3 = (int) (min * 0.7d);
        int i4 = i3 / 2;
        int i5 = paddingLeft - i4;
        int i6 = paddingTop - i4;
        this.b.setBounds(i5, i6, i5 + i3, i3 + i6);
    }

    public LoadingButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        e(context);
    }

    public LoadingButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        e(context);
    }
}

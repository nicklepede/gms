package com.google.android.gms.accountsettings.mg.poc.ui.common;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FadeInImageView extends AppCompatImageView {
    public String a;

    public FadeInImageView(Context context) {
        super(context);
        this.a = null;
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    public FadeInImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
    }

    public FadeInImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = null;
    }
}

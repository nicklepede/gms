package com.google.android.gms.smartdevice.setup.ui;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.dgvv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ShapeVerificationView extends LinearLayout {
    public static final Typeface a = Typeface.create("google-sans", 0);
    public int[] b;
    public boolean c;
    public int d;

    public ShapeVerificationView(Context context) {
        super(context);
        b(context);
    }

    public static dgvv a(int i, int i2, int[] iArr) {
        int i3 = (i & AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PHONETIC) >> 6;
        return new dgvv(i3 != 0 ? i3 != 1 ? i3 != 2 ? 4 : 3 : 2 : 1, iArr[(i & 48) >> 4], String.valueOf(Math.abs(((i << 8) | i2) % 10)));
    }

    private final void b(Context context) {
        this.b = context.getResources().getIntArray(R.array.smartdevice_google_500_colors);
        this.d = getResources().getDimensionPixelSize(R.dimen.smartdevice_verification_shape_padding);
    }

    public ShapeVerificationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context);
    }

    public ShapeVerificationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b(context);
    }
}

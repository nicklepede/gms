package com.google.android.gms.common.widget.phone;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Window;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.asrs;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SnackbarLayout extends LinearLayout {
    private final int a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public SnackbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, asrs.a, 0, 0);
        this.a = obtainStyledAttributes.getInt(3, 0);
        this.b = obtainStyledAttributes.getInt(5, 0);
        this.c = obtainStyledAttributes.getInt(4, 0);
        this.d = (int) obtainStyledAttributes.getDimension(6, 0.0f);
        this.e = (int) obtainStyledAttributes.getDimension(7, 0.0f);
        obtainStyledAttributes.recycle();
    }

    public final void a(Window window) {
        WindowManager.LayoutParams attributes = window.getAttributes();
        int i = this.a;
        if (i != 0) {
            attributes.gravity = i;
        }
        int i2 = this.b;
        if (i2 != 0) {
            attributes.width = i2;
        }
        int i3 = this.c;
        if (i3 != 0) {
            attributes.height = i3;
        }
        int i4 = this.d;
        if (i4 != 0) {
            attributes.x = i4;
        }
        int i5 = this.e;
        if (i5 != 0) {
            attributes.y = i5;
        }
        attributes.flags |= AndroidInputTypeSignal.TYPE_TEXT_VARIATION_WEB_EDIT_TEXT;
        window.setAttributes(attributes);
    }

    public SnackbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, asrs.a, i, 0);
        this.a = obtainStyledAttributes.getInt(3, 0);
        this.b = obtainStyledAttributes.getInt(5, 0);
        this.c = obtainStyledAttributes.getInt(4, 0);
        this.d = (int) obtainStyledAttributes.getDimension(6, 0.0f);
        this.e = (int) obtainStyledAttributes.getDimension(7, 0.0f);
        obtainStyledAttributes.recycle();
    }
}

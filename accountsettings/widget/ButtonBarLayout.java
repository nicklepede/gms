package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import defpackage.usw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ButtonBarLayout extends LinearLayout {
    private final boolean a;
    private int b;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = -1;
        int i = context.getResources().getConfiguration().screenHeightDp;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, usw.c);
        this.a = obtainStyledAttributes.getBoolean(0, i >= 320);
        obtainStyledAttributes.recycle();
    }

    private final boolean b() {
        return getOrientation() == 1;
    }

    protected final void a(boolean z) {
        setOrientation(z ? 1 : 0);
        setGravity(true != z ? 80 : 8388613);
        View findViewById = findViewById(R.id.spacer);
        if (findViewById != null) {
            findViewById.setVisibility(true != z ? 4 : 8);
        }
        if (z) {
            bringChildToFront(findViewById(R.id.button_negative));
        } else {
            bringChildToFront(findViewById(R.id.button_positive));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        int size = View.MeasureSpec.getSize(i);
        boolean z = this.a;
        boolean z2 = false;
        if (z) {
            if (size > this.b && b()) {
                a(false);
            }
            this.b = size;
        }
        if (b() || View.MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
        } else {
            i3 = View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_USE_TDLS);
            z2 = true;
        }
        super.onMeasure(i3, i2);
        if (z && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            a(true);
        } else if (!z2) {
            return;
        }
        super.onMeasure(i, i2);
    }
}

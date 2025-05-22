package com.google.android.gms.wallet.paymentmethods;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.Spinner;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class InstrumentRankSpinner extends Spinner {
    private static int b;
    private static int c;
    public int a;

    public InstrumentRankSpinner(Context context) {
        super(context);
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (b == 0) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.dropdownListPreferredItemHeight});
            int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
            b = dimensionPixelOffset;
            c = (dimensionPixelOffset - getHeight()) / 2;
            obtainStyledAttributes.recycle();
        }
        setDropDownVerticalOffset(-((b * this.a) + c));
    }

    public InstrumentRankSpinner(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstrumentRankSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InstrumentRankSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

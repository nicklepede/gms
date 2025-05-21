package com.google.android.gms.wallet.ui.component.filter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import com.google.android.gms.R;
import defpackage.efwo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ManageFiltersChipButton extends AppCompatButton {
    public ManageFiltersChipButton(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        ColorStateList i = efwo.i(getContext(), R.attr.uicColorMaterialAccent);
        setTextColor(i);
        GradientDrawable gradientDrawable = (GradientDrawable) getBackground();
        gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.wallet_manage_filters_chip_button_stroke_width), i);
        setBackground(gradientDrawable);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        if (getBackground() != null) {
            getBackground().setAlpha(true != z ? 77 : 255);
        }
    }

    public ManageFiltersChipButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ManageFiltersChipButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

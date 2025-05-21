package com.google.android.gms.wallet.ui.component.filter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wallet.ui.common.ClickableImageView;
import defpackage.djgf;
import defpackage.efee;
import defpackage.efeh;
import defpackage.efei;
import defpackage.efwo;
import defpackage.faso;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class FilterCategoryChipButton extends LinearLayout implements View.OnClickListener, efee {
    public TextView a;
    public ClickableImageView b;
    public faso c;
    public efeh d;
    public djgf e;

    public FilterCategoryChipButton(Context context) {
        super(context);
    }

    @Override // defpackage.efee
    public final void ks() {
        efei.c(this.b, this.c.b, this.d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        djgf djgfVar = this.e;
        if (djgfVar == null) {
            throw new IllegalStateException("FilterCategoryClickedListener is not set in FilterCategoryChipButton");
        }
        djgfVar.b(this.c);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this);
        this.a = (TextView) findViewById(R.id.chip_button_text);
        ClickableImageView clickableImageView = (ClickableImageView) findViewById(R.id.remove_icon);
        this.b = clickableImageView;
        efwo.M(clickableImageView, ColorStateList.valueOf(efwo.b(getContext(), android.R.attr.colorBackground)));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        efwo.N(this, z);
    }

    public FilterCategoryChipButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FilterCategoryChipButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public FilterCategoryChipButton(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

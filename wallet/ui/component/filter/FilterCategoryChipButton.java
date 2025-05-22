package com.google.android.gms.wallet.ui.component.filter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.wallet.ui.common.ClickableImageView;
import defpackage.dlry;
import defpackage.ehrh;
import defpackage.ehrk;
import defpackage.ehrl;
import defpackage.eijr;
import defpackage.fdhd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class FilterCategoryChipButton extends LinearLayout implements View.OnClickListener, ehrh {
    public TextView a;
    public ClickableImageView b;
    public fdhd c;
    public ehrk d;
    public dlry e;

    public FilterCategoryChipButton(Context context) {
        super(context);
    }

    @Override // defpackage.ehrh
    public final void kH() {
        ehrl.c(this.b, this.c.b, this.d);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        dlry dlryVar = this.e;
        if (dlryVar == null) {
            throw new IllegalStateException("FilterCategoryClickedListener is not set in FilterCategoryChipButton");
        }
        dlryVar.b(this.c);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this);
        this.a = (TextView) findViewById(R.id.chip_button_text);
        ClickableImageView clickableImageView = (ClickableImageView) findViewById(R.id.remove_icon);
        this.b = clickableImageView;
        eijr.M(clickableImageView, ColorStateList.valueOf(eijr.b(getContext(), android.R.attr.colorBackground)));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        eijr.N(this, z);
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

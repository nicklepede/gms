package com.google.android.gms.wallet.ui.component.generic;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.efwb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SelectableUiFieldOptionView extends efwb {
    public TextView a;

    public SelectableUiFieldOptionView(Context context) {
        super(context);
    }

    @Override // defpackage.efwa
    public final CharSequence a() {
        return this.a.getText();
    }

    @Override // defpackage.efwb, defpackage.efwa
    public final void b(String str) {
        super.b(str);
        this.a.setTag(R.id.summary_expander_transition_name, str);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.k = (RadioButton) findViewById(R.id.radio_button);
        this.a = (TextView) findViewById(R.id.field_label);
        this.l = (ImageView) findViewById(R.id.expand_icon);
        this.m = findViewById(R.id.option_divider_line);
        setBackgroundResource(R.drawable.wallet_uic_ripple_background);
        p();
    }

    public SelectableUiFieldOptionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SelectableUiFieldOptionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SelectableUiFieldOptionView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

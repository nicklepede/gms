package com.google.android.gms.wallet.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import defpackage.efwo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CardActionBarView extends LinearLayout {
    public ViewGroup a;

    public CardActionBarView(Context context) {
        super(context);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ViewGroup) findViewById(R.id.actions_container);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        efwo.N(this, z);
    }

    public CardActionBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CardActionBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

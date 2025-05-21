package com.google.android.gms.wallet.embeddedlandingpage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import defpackage.efwo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class InstrumentDetailsView extends RelativeLayout {
    public ImageWithCaptionView a;
    public TextView b;

    public InstrumentDetailsView(Context context) {
        super(context);
    }

    public final void a(View view, int i) {
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) view.getLayoutParams();
        layoutParams.addRule(3, i);
        int i2 = efwo.b;
        layoutParams.addRule(17, this.a.getId());
        view.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.a = (ImageWithCaptionView) findViewById(R.id.image);
        this.b = (TextView) findViewById(R.id.label);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        efwo.N(this, z);
    }

    public InstrumentDetailsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstrumentDetailsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

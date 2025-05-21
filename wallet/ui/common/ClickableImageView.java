package com.google.android.gms.wallet.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import defpackage.efec;
import defpackage.efed;
import defpackage.efej;
import defpackage.efem;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ClickableImageView extends ImageView implements View.OnClickListener, efed {
    final efec a;

    public ClickableImageView(Context context) {
        super(context);
        this.a = new efec();
    }

    @Override // defpackage.efel
    public final efej a() {
        return null;
    }

    @Override // defpackage.efed
    public final efem b() {
        return this.a;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.a();
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        setOnClickListener(this);
    }

    public ClickableImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new efec();
    }

    public ClickableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new efec();
    }
}

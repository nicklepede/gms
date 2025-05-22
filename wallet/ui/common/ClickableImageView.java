package com.google.android.gms.wallet.ui.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import defpackage.ehrf;
import defpackage.ehrg;
import defpackage.ehrm;
import defpackage.ehrp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ClickableImageView extends ImageView implements View.OnClickListener, ehrg {
    final ehrf a;

    public ClickableImageView(Context context) {
        super(context);
        this.a = new ehrf();
    }

    @Override // defpackage.ehro
    public final ehrm a() {
        return null;
    }

    @Override // defpackage.ehrg
    public final ehrp b() {
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
        this.a = new ehrf();
    }

    public ClickableImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ehrf();
    }
}

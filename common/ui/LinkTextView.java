package com.google.android.gms.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import defpackage.asmo;
import defpackage.iuo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class LinkTextView extends TextView {
    private asmo a;

    public LinkTextView(Context context) {
        this(context, null);
    }

    @Override // android.view.View
    protected final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.a.s(motionEvent)) {
            return true;
        }
        return super.dispatchHoverEvent(motionEvent);
    }

    public LinkTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        asmo asmoVar = new asmo(this);
        this.a = asmoVar;
        iuo.q(this, asmoVar);
    }
}

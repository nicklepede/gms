package com.google.android.gms.common.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;
import defpackage.auqi;
import defpackage.iwe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class LinkTextView extends TextView {
    private auqi a;

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
        auqi auqiVar = new auqi(this);
        this.a = auqiVar;
        iwe.q(this, auqiVar);
    }
}

package com.google.android.gms.growth.uiflow.ui.widget.media;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import defpackage.bkvb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ScaledImageView extends AppCompatImageView {
    public bkvb a;

    public ScaledImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        bkvb bkvbVar;
        if (getDrawable() != null && (bkvbVar = this.a) != null) {
            bkvbVar.a();
        }
        return super.setFrame(i, i2, i3, i4);
    }

    public ScaledImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScaledImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

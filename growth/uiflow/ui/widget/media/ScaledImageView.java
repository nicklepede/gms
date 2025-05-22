package com.google.android.gms.growth.uiflow.ui.widget.media;

import android.content.Context;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import defpackage.bnbr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ScaledImageView extends AppCompatImageView {
    public bnbr a;

    public ScaledImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView
    protected final boolean setFrame(int i, int i2, int i3, int i4) {
        bnbr bnbrVar;
        if (getDrawable() != null && (bnbrVar = this.a) != null) {
            bnbrVar.a();
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

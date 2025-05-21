package com.google.android.gms.maps.model;

import defpackage.arwm;
import defpackage.ccdr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class CustomCap extends Cap {
    public final ccdr c;
    public final float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCap(ccdr ccdrVar, float f) {
        super(3, ccdrVar, Float.valueOf(f));
        arwm.t(ccdrVar, "bitmapDescriptor must not be null");
        if (f <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        this.c = ccdrVar;
        this.d = f;
    }

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.c) + " refWidth=" + this.d + "]";
    }
}

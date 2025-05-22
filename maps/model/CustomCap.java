package com.google.android.gms.maps.model;

import defpackage.atzb;
import defpackage.ceml;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CustomCap extends Cap {
    public final ceml c;
    public final float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCap(ceml cemlVar, float f) {
        super(3, cemlVar, Float.valueOf(f));
        atzb.t(cemlVar, "bitmapDescriptor must not be null");
        if (f <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        this.c = cemlVar;
        this.d = f;
    }

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.c) + " refWidth=" + this.d + "]";
    }
}

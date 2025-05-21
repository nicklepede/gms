package com.google.android.gms.maps.model;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class Gap extends PatternItem {
    public final float a;

    public Gap() {
        super(2, Float.valueOf(Math.max(30.0f, 0.0f)));
        this.a = Math.max(30.0f, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    public final String toString() {
        return "[Gap: length=" + this.a + "]";
    }
}

package com.google.android.gms.maps.model;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class Dash extends PatternItem {
    public final float a;

    public Dash() {
        super(0, Float.valueOf(Math.max(30.0f, 0.0f)));
        this.a = Math.max(30.0f, 0.0f);
    }

    @Override // com.google.android.gms.maps.model.PatternItem
    public final String toString() {
        return "[Dash: length=" + this.a + "]";
    }
}

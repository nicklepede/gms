package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahgm;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class HeadphoneStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahgm();
    public final int a;

    public HeadphoneStateImpl(int i) {
        this.a = i;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.c(parcel, a);
    }
}

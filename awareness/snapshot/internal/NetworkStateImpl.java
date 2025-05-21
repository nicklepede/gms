package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ahgn;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class NetworkStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ahgn();
    public final int a;
    public final int b;

    public NetworkStateImpl(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final String toString() {
        return "ConnectionState = " + Integer.toString(this.a) + " NetworkMeteredState = " + Integer.toString(this.b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 2, i2);
        arxc.o(parcel, 3, this.b);
        arxc.c(parcel, a);
    }
}

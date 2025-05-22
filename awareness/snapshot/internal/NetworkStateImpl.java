package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.ajhd;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class NetworkStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ajhd();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 2, i2);
        atzr.o(parcel, 3, this.b);
        atzr.c(parcel, a);
    }
}

package com.google.android.gms.wearable;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dlvm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ConnectionDelayConfig extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dlvm();
    public final long a;
    public final long b;

    public ConnectionDelayConfig(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.q(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}

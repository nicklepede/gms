package com.google.android.gms.car.diagnostics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.anaf;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ConnectionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new anaf();
    public final long a;
    public final int b;
    public final CriticalError c;
    public final long d;

    public ConnectionState(long j, int i, CriticalError criticalError, long j2) {
        this.a = j;
        this.b = i;
        this.c = criticalError;
        this.d = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.q(parcel, 4, this.d);
        atzr.c(parcel, a);
    }
}

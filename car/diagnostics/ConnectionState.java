package com.google.android.gms.car.diagnostics;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.akyu;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ConnectionState extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new akyu();
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
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, this.a);
        arxc.o(parcel, 2, this.b);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.q(parcel, 4, this.d);
        arxc.c(parcel, a);
    }
}

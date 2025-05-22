package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmya;
import j$.time.Duration;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class RequestConnectionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmya();
    public final String a;
    public final int b;
    public final long c;

    public RequestConnectionParcelable(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
    }

    public final String toString() {
        return "RequestConnection[" + this.a + "," + this.b + "," + String.valueOf(Duration.ofMillis(this.c)) + "]";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.q(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}

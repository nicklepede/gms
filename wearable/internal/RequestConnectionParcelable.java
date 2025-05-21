package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkmh;
import j$.time.Duration;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class RequestConnectionParcelable extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkmh();
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
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.o(parcel, 2, this.b);
        arxc.q(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}

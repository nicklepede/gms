package com.google.android.gms.telephonyspam;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dfbm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CallSpamOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dfbm();
    public final int a;
    public final String b;
    public final long c;
    public final int d;
    public final long e;

    public CallSpamOptions(int i, String str, long j, int i2, long j2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = i2;
        this.e = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.v(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}

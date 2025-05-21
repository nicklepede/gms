package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.dkks;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LogCounterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkks();
    public final String a;
    public final long b;
    public final byte[] c;
    public final long d;
    public final boolean e;

    public LogCounterRequest(String str, long j, byte[] bArr, long j2, boolean z) {
        this.a = str;
        this.b = j;
        this.c = bArr;
        this.d = j2;
        this.e = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.q(parcel, 2, this.b);
        arxc.i(parcel, 3, this.c, false);
        arxc.q(parcel, 4, this.d);
        arxc.e(parcel, 5, this.e);
        arxc.c(parcel, a);
    }
}

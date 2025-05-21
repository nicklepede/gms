package com.google.android.gms.auth.authzen.legacy.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.zus;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class OtpSecret extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new zus();
    final int a;
    public final String b;
    public final byte[] c;
    public final long d;

    public OtpSecret(int i, String str, byte[] bArr, long j) {
        this.a = i;
        this.b = str;
        this.c = bArr;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.b;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.i(parcel, 2, this.c, false);
        arxc.q(parcel, 3, this.d);
        arxc.o(parcel, 10000, this.a);
        arxc.c(parcel, a);
    }
}

package com.google.android.gms.auth.authzen.legacy.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abus;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class OtpSecret extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new abus();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.i(parcel, 2, this.c, false);
        atzr.q(parcel, 3, this.d);
        atzr.o(parcel, 10000, this.a);
        atzr.c(parcel, a);
    }
}

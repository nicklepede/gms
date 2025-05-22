package com.google.android.gms.instantapps.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bqoa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SharedLibInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bqoa();
    public final String a;
    public final int b;
    public final String c;
    public final String d;
    public final long e;
    public final byte[] f;

    public SharedLibInfo(String str, int i, String str2, String str3, long j, byte[] bArr) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
        this.e = j;
        this.f = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.o(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.q(parcel, 5, this.e);
        atzr.i(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }
}

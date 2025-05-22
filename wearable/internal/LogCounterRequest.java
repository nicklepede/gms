package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.dmwl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LogCounterRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dmwl();
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
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.q(parcel, 2, this.b);
        atzr.i(parcel, 3, this.c, false);
        atzr.q(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.c(parcel, a);
    }
}

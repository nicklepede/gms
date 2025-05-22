package com.google.android.gms.libs.gmscorelogger;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.btnk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LogEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new btnk();
    public final byte[] a;
    public final long b;
    public final byte[] c;
    public final byte[] d;

    public LogEvent(byte[] bArr, long j, byte[] bArr2, byte[] bArr3) {
        this.a = bArr;
        this.b = j;
        this.c = bArr2;
        this.d = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.q(parcel, 2, this.b);
        atzr.i(parcel, 3, this.c, false);
        atzr.i(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}

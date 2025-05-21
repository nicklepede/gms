package com.google.android.gms.libs.gmscorelogger;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.brft;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LogEvent extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new brft();
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
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.q(parcel, 2, this.b);
        arxc.i(parcel, 3, this.c, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}

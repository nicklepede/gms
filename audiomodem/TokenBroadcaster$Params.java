package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ulr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class TokenBroadcaster$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ulr();
    public final byte[] a;
    public final int b;
    public final Encoding[] c;
    public final int d;

    public TokenBroadcaster$Params(byte[] bArr, int i, Encoding[] encodingArr, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = encodingArr;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 2, bArr, false);
        arxc.o(parcel, 3, this.b);
        arxc.J(parcel, 4, this.c, i);
        arxc.o(parcel, 5, this.d);
        arxc.c(parcel, a);
    }

    public TokenBroadcaster$Params(byte[] bArr, int i, Encoding[] encodingArr) {
        this(bArr, i, encodingArr, -1);
    }
}

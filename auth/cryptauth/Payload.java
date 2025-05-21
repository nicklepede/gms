package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaqh;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class Payload extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaqh();
    final int a;
    public final byte[] b;
    public final byte[] c;
    public final byte[] d;

    public Payload(int i, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.a = i;
        this.b = bArr;
        this.c = bArr2;
        this.d = bArr3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.i(parcel, 2, this.b, false);
        arxc.i(parcel, 3, this.c, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public Payload(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(1, bArr, bArr2, bArr3);
    }
}

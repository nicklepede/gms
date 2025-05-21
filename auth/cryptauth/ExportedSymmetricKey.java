package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aaqa;
import defpackage.arxc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ExportedSymmetricKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aaqa();
    final int a;
    public final byte[] b;
    public final long c;

    public ExportedSymmetricKey(int i, byte[] bArr, long j) {
        this.a = i;
        this.b = bArr;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, this.a);
        arxc.i(parcel, 2, this.b, false);
        arxc.q(parcel, 3, this.c);
        arxc.c(parcel, a);
    }

    public ExportedSymmetricKey(byte[] bArr, long j) {
        this(1, bArr, j);
    }
}

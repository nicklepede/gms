package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acqa;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ExportedSymmetricKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acqa();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.i(parcel, 2, this.b, false);
        atzr.q(parcel, 3, this.c);
        atzr.c(parcel, a);
    }

    public ExportedSymmetricKey(byte[] bArr, long j) {
        this(1, bArr, j);
    }
}

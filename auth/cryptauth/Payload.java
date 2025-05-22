package com.google.android.gms.auth.cryptauth;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.acqh;
import defpackage.atzr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class Payload extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new acqh();
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
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, this.a);
        atzr.i(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.i(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public Payload(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this(1, bArr, bArr2, bArr3);
    }
}

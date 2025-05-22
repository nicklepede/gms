package com.google.android.gms.audiomodem;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.whq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class TokenBroadcaster$Params extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new whq();
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
        int a = atzr.a(parcel);
        atzr.i(parcel, 2, bArr, false);
        atzr.o(parcel, 3, this.b);
        atzr.J(parcel, 4, this.c, i);
        atzr.o(parcel, 5, this.d);
        atzr.c(parcel, a);
    }

    public TokenBroadcaster$Params(byte[] bArr, int i, Encoding[] encodingArr) {
        this(bArr, i, encodingArr, -1);
    }
}

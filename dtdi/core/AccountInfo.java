package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ayci;
import defpackage.fvbo;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class AccountInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayci();
    public final byte[] a;
    public final int b;
    public final List c;
    public final byte[] d;

    public AccountInfo(byte[] bArr, int i, List list, byte[] bArr2) {
        fvbo.f(bArr, "hashedAccountId");
        fvbo.f(list, "supportedIntentActions");
        fvbo.f(bArr2, "additionalMetadata");
        this.a = bArr;
        this.b = i;
        this.c = list;
        this.d = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AccountInfo)) {
            return false;
        }
        AccountInfo accountInfo = (AccountInfo) obj;
        return Arrays.equals(this.a, accountInfo.a) && this.b == accountInfo.b && fvbo.n(this.c, accountInfo.c) && Arrays.equals(this.d, accountInfo.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, bArr, false);
        arxc.o(parcel, 2, this.b);
        arxc.x(parcel, 3, this.c, false);
        arxc.i(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }
}

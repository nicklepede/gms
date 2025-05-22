package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bagi;
import defpackage.fxxm;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AccountInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bagi();
    public final byte[] a;
    public final int b;
    public final List c;
    public final byte[] d;

    public AccountInfo(byte[] bArr, int i, List list, byte[] bArr2) {
        fxxm.f(bArr, "hashedAccountId");
        fxxm.f(list, "supportedIntentActions");
        fxxm.f(bArr2, "additionalMetadata");
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
        return Arrays.equals(this.a, accountInfo.a) && this.b == accountInfo.b && fxxm.n(this.c, accountInfo.c) && Arrays.equals(this.d, accountInfo.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.o(parcel, 2, this.b);
        atzr.x(parcel, 3, this.c, false);
        atzr.i(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }
}

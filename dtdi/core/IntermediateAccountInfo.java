package com.google.android.gms.dtdi.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bagv;
import defpackage.fxxm;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class IntermediateAccountInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bagv();
    public final byte[] a;
    public final List b;
    public final byte[] c;

    public IntermediateAccountInfo(byte[] bArr, List list, byte[] bArr2) {
        fxxm.f(bArr, "accountId");
        fxxm.f(list, "supportedIntentActions");
        fxxm.f(bArr2, "additionalMetadata");
        this.a = bArr;
        this.b = list;
        this.c = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof IntermediateAccountInfo)) {
            return false;
        }
        IntermediateAccountInfo intermediateAccountInfo = (IntermediateAccountInfo) obj;
        return Arrays.equals(this.a, intermediateAccountInfo.a) && fxxm.n(this.b, intermediateAccountInfo.b) && Arrays.equals(this.c, intermediateAccountInfo.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        byte[] bArr = this.a;
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, bArr, false);
        atzr.x(parcel, 3, this.b, false);
        atzr.i(parcel, 4, this.c, false);
        atzr.c(parcel, a);
    }
}

package com.google.android.gms.wallet.idcredit;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.diri;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IdCreditResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new diri();
    public final byte[] a;

    public IdCreditResult(byte[] bArr) {
        this.a = bArr;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.a);
    }
}

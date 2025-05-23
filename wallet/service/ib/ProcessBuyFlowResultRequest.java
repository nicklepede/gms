package com.google.android.gms.wallet.service.ib;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dlka;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ProcessBuyFlowResultRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dlka();
    public final byte[] a;
    public final byte[] b;
    public final IbBuyFlowInput c;
    public final IbMerchantParameters d;
    public final int e;

    public ProcessBuyFlowResultRequest(IbBuyFlowInput ibBuyFlowInput, IbMerchantParameters ibMerchantParameters, byte[] bArr, byte[] bArr2, int i) {
        this.c = ibBuyFlowInput;
        this.d = ibMerchantParameters;
        this.a = bArr;
        this.b = bArr2;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.c, i);
        parcel.writeParcelable(this.d, i);
        parcel.writeByteArray(this.a);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.e);
    }
}

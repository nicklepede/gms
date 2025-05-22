package com.google.android.gms.wallet.service.ib;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dlkf;
import defpackage.dlpo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class RefreshUserSpecificDataResponse implements Parcelable, dlpo {
    public static final Parcelable.Creator CREATOR = new dlkf();
    public final IbBuyFlowInput a;
    public final int b;
    public final int c;

    public RefreshUserSpecificDataResponse(IbBuyFlowInput ibBuyFlowInput, int i, int i2) {
        this.a = ibBuyFlowInput;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.dlpo
    public final boolean a() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        int i2 = this.c;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2 - 1);
    }
}

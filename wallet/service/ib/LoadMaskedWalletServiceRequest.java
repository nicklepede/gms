package com.google.android.gms.wallet.service.ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.MaskedWalletRequest;
import defpackage.dixv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LoadMaskedWalletServiceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dixv();
    public final Bundle a;
    public final MaskedWalletRequest b;

    public LoadMaskedWalletServiceRequest(Bundle bundle, MaskedWalletRequest maskedWalletRequest) {
        this.a = bundle;
        this.b = maskedWalletRequest;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}

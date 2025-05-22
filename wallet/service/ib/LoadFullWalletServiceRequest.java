package com.google.android.gms.wallet.service.ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.FullWalletRequest;
import defpackage.dljl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LoadFullWalletServiceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dljl();
    public final Bundle a;
    public final FullWalletRequest b;
    public final boolean c;

    public LoadFullWalletServiceRequest(Bundle bundle, FullWalletRequest fullWalletRequest, boolean z) {
        this.a = bundle;
        this.b = fullWalletRequest;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
    }
}

package com.google.android.gms.wallet.service.ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.FullWallet;
import defpackage.dljm;
import defpackage.dlpo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LoadFullWalletServiceResponse implements Parcelable, dlpo {
    public static final Parcelable.Creator CREATOR = new dljm();
    public final Bundle a;
    public final FullWallet b;
    public final int c;

    public LoadFullWalletServiceResponse(Bundle bundle, FullWallet fullWallet, int i) {
        this.b = fullWallet;
        this.a = bundle;
        this.c = i;
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
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c);
    }
}

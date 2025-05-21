package com.google.android.gms.wallet.service.ib;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wallet.FullWallet;
import defpackage.dixt;
import defpackage.djdv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LoadFullWalletServiceResponse implements Parcelable, djdv {
    public static final Parcelable.Creator CREATOR = new dixt();
    public final Bundle a;
    public final FullWallet b;
    public final int c;

    public LoadFullWalletServiceResponse(Bundle bundle, FullWallet fullWallet, int i) {
        this.b = fullWallet;
        this.a = bundle;
        this.c = i;
    }

    @Override // defpackage.djdv
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

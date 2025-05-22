package com.google.android.gms.wallet.service.ow;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dlns;
import defpackage.exbg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CreateWalletObjectsServiceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dlns();
    public final Account a;
    public exbg b;
    public byte[] c;

    public CreateWalletObjectsServiceRequest(Account account, exbg exbgVar) {
        this.a = account;
        this.b = exbgVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        if (this.c == null) {
            this.c = this.b.r();
        }
        parcel.writeByteArray(this.c);
    }

    public CreateWalletObjectsServiceRequest(Account account, byte[] bArr) {
        this.a = account;
        this.c = bArr;
    }
}

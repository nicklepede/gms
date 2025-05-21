package com.google.android.gms.wallet.service.ow;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.djbz;
import defpackage.euln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CreateWalletObjectsServiceRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new djbz();
    public final Account a;
    public euln b;
    public byte[] c;

    public CreateWalletObjectsServiceRequest(Account account, euln eulnVar) {
        this.a = account;
        this.b = eulnVar;
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

package com.google.android.gms.wallet.service.reauth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.djcu;
import defpackage.djdv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ReauthProofTokenRequest implements Parcelable, djdv {
    public static final Parcelable.Creator CREATOR = new djcu();
    public final Account a;
    public final String b;
    public final int c;
    public final int d;

    public ReauthProofTokenRequest(Account account, String str, int i, int i2) {
        this.a = account;
        this.b = str;
        this.d = i;
        this.c = i2;
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
        this.a.writeToParcel(parcel, i);
        parcel.writeString(this.b);
        int i2 = this.d;
        if (i2 == 0) {
            throw null;
        }
        parcel.writeInt(i2 - 1);
        parcel.writeInt(this.c);
    }
}

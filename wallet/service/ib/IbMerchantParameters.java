package com.google.android.gms.wallet.service.ib;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dlik;
import defpackage.ehqn;
import defpackage.eoso;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class IbMerchantParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dlik();
    public final int a;
    public String b;
    public boolean c;
    public eoso d;

    public IbMerchantParameters() {
        this.a = 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeByte(this.c ? (byte) 1 : (byte) 0);
        ehqn.o(this.d, parcel);
    }

    public IbMerchantParameters(int i, String str, boolean z, eoso eosoVar) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = eosoVar;
    }
}

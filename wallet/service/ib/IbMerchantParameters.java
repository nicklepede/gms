package com.google.android.gms.wallet.service.ib;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.diwv;
import defpackage.efdk;
import defpackage.emfa;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class IbMerchantParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR = new diwv();
    public final int a;
    public String b;
    public boolean c;
    public emfa d;

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
        efdk.o(this.d, parcel);
    }

    public IbMerchantParameters(int i, String str, boolean z, emfa emfaVar) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = emfaVar;
    }
}

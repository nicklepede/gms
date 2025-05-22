package com.google.android.gms.wallet.buyflow;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dkvb;
import defpackage.dkvc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class BuyFlowResult implements Parcelable {
    public String b;
    public String c;
    public byte[] d;
    public byte[] e;
    public int f;
    public byte[] g;
    public static final BuyFlowResult a = a().a;
    public static final Parcelable.Creator CREATOR = new dkvb();

    private BuyFlowResult() {
    }

    public static dkvc a() {
        return new dkvc(new BuyFlowResult());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.b);
        parcel.writeByteArray(this.d);
        parcel.writeByteArray(this.e);
        parcel.writeInt(this.f);
        parcel.writeByteArray(this.g);
    }

    public BuyFlowResult(Parcel parcel) {
        this.c = parcel.readString();
        this.b = parcel.readString();
        this.d = parcel.createByteArray();
        this.e = parcel.createByteArray();
        this.f = parcel.readInt();
        this.g = parcel.createByteArray();
    }
}

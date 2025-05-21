package com.google.android.gms.wallet.selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.ditp;
import defpackage.ditq;
import defpackage.feay;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class GenericSelectorResult implements Parcelable {
    public UserAddress b;
    public long c;
    public boolean d;
    public feay e;
    public byte[] f;
    public static final GenericSelectorResult a = a().a;
    public static final Parcelable.Creator CREATOR = new ditp();

    private GenericSelectorResult() {
    }

    public static ditq a() {
        return new ditq(new GenericSelectorResult());
    }

    public final boolean b() {
        return this.f != null;
    }

    public final boolean c() {
        return this.b != null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, 0);
        parcel.writeLong(this.c);
        parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        feay feayVar = this.e;
        if (feayVar != null) {
            parcel.writeByteArray(feayVar.M());
        } else {
            parcel.writeByteArray(null);
        }
        parcel.writeByteArray(this.f);
    }

    public GenericSelectorResult(UserAddress userAddress, long j, boolean z, feay feayVar, byte[] bArr) {
        this.b = userAddress;
        this.c = j;
        this.d = z;
        this.e = feayVar;
        this.f = bArr;
    }
}

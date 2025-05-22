package com.google.android.gms.wallet.selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.identity.intents.model.UserAddress;
import defpackage.dlfa;
import defpackage.dlfb;
import defpackage.fgpr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class GenericSelectorResult implements Parcelable {
    public UserAddress b;
    public long c;
    public boolean d;
    public fgpr e;
    public byte[] f;
    public static final GenericSelectorResult a = a().a;
    public static final Parcelable.Creator CREATOR = new dlfa();

    private GenericSelectorResult() {
    }

    public static dlfb a() {
        return new dlfb(new GenericSelectorResult());
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
        fgpr fgprVar = this.e;
        if (fgprVar != null) {
            parcel.writeByteArray(fgprVar.M());
        } else {
            parcel.writeByteArray(null);
        }
        parcel.writeByteArray(this.f);
    }

    public GenericSelectorResult(UserAddress userAddress, long j, boolean z, fgpr fgprVar, byte[] bArr) {
        this.b = userAddress;
        this.c = j;
        this.d = z;
        this.e = fgprVar;
        this.f = bArr;
    }
}

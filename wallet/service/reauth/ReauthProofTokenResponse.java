package com.google.android.gms.wallet.service.reauth;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dloo;
import defpackage.dlpo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ReauthProofTokenResponse implements Parcelable, dlpo {
    public static final Parcelable.Creator CREATOR = new dloo();
    public final String a;
    public final int b;
    public final long c;

    public ReauthProofTokenResponse(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
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
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
    }
}

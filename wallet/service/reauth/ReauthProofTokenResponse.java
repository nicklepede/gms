package com.google.android.gms.wallet.service.reauth;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.djcv;
import defpackage.djdv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class ReauthProofTokenResponse implements Parcelable, djdv {
    public static final Parcelable.Creator CREATOR = new djcv();
    public final String a;
    public final int b;
    public final long c;

    public ReauthProofTokenResponse(String str, int i, long j) {
        this.a = str;
        this.b = i;
        this.c = j;
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
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeLong(this.c);
    }
}

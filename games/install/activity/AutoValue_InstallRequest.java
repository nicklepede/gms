package com.google.android.gms.games.install.activity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bhnf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class AutoValue_InstallRequest extends C$AutoValue_InstallRequest {
    public static final Parcelable.Creator CREATOR = new bhnf();

    public AutoValue_InstallRequest(String str, String str2) {
        super(str, str2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}

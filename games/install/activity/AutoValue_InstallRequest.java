package com.google.android.gms.games.install.activity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bjru;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AutoValue_InstallRequest extends C$AutoValue_InstallRequest {
    public static final Parcelable.Creator CREATOR = new bjru();

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

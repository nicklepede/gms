package com.google.android.gms.wearable.node.accountmatching.ui;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dnpc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class AutoValue_GoogleAccountInfo extends C$AutoValue_GoogleAccountInfo {
    public static final Parcelable.Creator CREATOR = new dnpc();

    public AutoValue_GoogleAccountInfo(String str, boolean z) {
        super(str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}

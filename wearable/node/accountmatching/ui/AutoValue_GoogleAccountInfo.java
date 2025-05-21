package com.google.android.gms.wearable.node.accountmatching.ui;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dldi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class AutoValue_GoogleAccountInfo extends C$AutoValue_GoogleAccountInfo {
    public static final Parcelable.Creator CREATOR = new dldi();

    public AutoValue_GoogleAccountInfo(String str, boolean z) {
        super(str, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
    }
}

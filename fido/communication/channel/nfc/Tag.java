package com.google.android.gms.fido.communication.channel.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bdqa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class Tag implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bdqa();
    public final android.nfc.Tag a;

    public Tag(android.nfc.Tag tag) {
        this.a = tag;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
    }
}

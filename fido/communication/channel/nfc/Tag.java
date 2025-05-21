package com.google.android.gms.fido.communication.channel.nfc;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bbmj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class Tag implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bbmj();
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

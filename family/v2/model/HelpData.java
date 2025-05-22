package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bcgd;
import defpackage.esiv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class HelpData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bcgd();
    public final String a;
    public final String b;

    public HelpData(esiv esivVar) {
        this.a = esivVar.d;
        this.b = esivVar.c;
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

    public HelpData(Parcel parcel) {
        this.a = parcel.readString();
        this.b = parcel.readString();
    }
}

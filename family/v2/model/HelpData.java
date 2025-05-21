package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bach;
import defpackage.epuw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class HelpData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bach();
    public final String a;
    public final String b;

    public HelpData(epuw epuwVar) {
        this.a = epuwVar.d;
        this.b = epuwVar.c;
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

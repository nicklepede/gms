package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.tlu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class Command implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator CREATOR = new tlu();
    public String a;
    public String b;
    private String c;

    @Deprecated
    public Command() {
    }

    @Override // android.os.Parcelable
    @Deprecated
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    @Deprecated
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
    }

    @Deprecated
    public Command(Parcel parcel) {
        this.a = parcel.readString();
        this.c = parcel.readString();
        this.b = parcel.readString();
    }
}

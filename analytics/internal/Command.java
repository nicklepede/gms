package com.google.android.gms.analytics.internal;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.vhu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class Command implements Parcelable {

    @Deprecated
    public static final Parcelable.Creator CREATOR = new vhu();
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

package com.google.android.gms.accountsettings.utils;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.uuc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ButtonConfig implements Parcelable {
    public static final Parcelable.Creator CREATOR = new uuc();
    public final String a;
    public final int b;
    private final Bundle c;

    public ButtonConfig(String str, int i, Bundle bundle) {
        this.a = str;
        this.b = i;
        this.c = bundle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b);
        parcel.writeBundle(this.c);
    }

    public ButtonConfig(String str, int i) {
        this(str, i, null);
    }
}

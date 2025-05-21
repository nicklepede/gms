package com.google.android.gms.carsetup.fsm.impl;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.alvb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class FsmController$StackEntry implements Parcelable {
    public static final Parcelable.Creator CREATOR = new alvb();
    public final Class a;
    public final Parcelable b;
    public final boolean c;
    public final int d;

    public FsmController$StackEntry(Class cls, Parcelable parcelable, int i) {
        this.a = cls;
        this.b = parcelable;
        this.c = true;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "StackEntry{clazz=" + String.valueOf(this.a) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.getName());
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d);
    }

    public FsmController$StackEntry(Parcel parcel) {
        try {
            this.a = Class.forName(parcel.readString());
            this.b = parcel.readParcelable(getClass().getClassLoader());
            this.c = parcel.readInt() != 0;
            this.d = parcel.readInt();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

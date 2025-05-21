package com.google.android.gms.carsetup.fsm.impl;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aluw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ActivityResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aluw();
    public final int a;
    public final Intent b;

    public ActivityResult(int i, Intent intent) {
        this.a = i;
        this.b = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        Intent intent = this.b;
        if (intent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            intent.writeToParcel(parcel, i);
        }
    }

    public ActivityResult(Parcel parcel) {
        this.a = parcel.readInt();
        if (parcel.readInt() == 0) {
            this.b = null;
        } else {
            this.b = (Intent) Intent.CREATOR.createFromParcel(parcel);
        }
    }
}

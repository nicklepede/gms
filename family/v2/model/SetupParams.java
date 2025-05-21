package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bacl;
import defpackage.eptz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SetupParams implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bacl();
    public final BillingSignupData a;
    public final String b;

    public SetupParams(eptz eptzVar) {
        this.a = new BillingSignupData(eptzVar.c, eptzVar.d);
        this.b = eptzVar.e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
    }

    public SetupParams(Parcel parcel) {
        this.a = (BillingSignupData) parcel.readParcelable(BillingSignupData.class.getClassLoader());
        this.b = parcel.readString();
    }
}

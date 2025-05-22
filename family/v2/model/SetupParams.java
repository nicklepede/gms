package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bcgh;
import defpackage.eshy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SetupParams implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bcgh();
    public final BillingSignupData a;
    public final String b;

    public SetupParams(eshy eshyVar) {
        this.a = new BillingSignupData(eshyVar.c, eshyVar.d);
        this.b = eshyVar.e;
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

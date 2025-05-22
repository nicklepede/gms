package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bcgi;
import defpackage.esia;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class UpgradeParams implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bcgi();
    public final BillingSignupData a;

    public UpgradeParams(esia esiaVar) {
        this.a = new BillingSignupData(esiaVar.c, esiaVar.d);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    public UpgradeParams(Parcel parcel) {
        this.a = (BillingSignupData) parcel.readParcelable(BillingSignupData.class.getClassLoader());
    }
}

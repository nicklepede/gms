package com.google.android.gms.family.v2.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import defpackage.bacm;
import defpackage.epub;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class UpgradeParams implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new bacm();
    public final BillingSignupData a;

    public UpgradeParams(epub epubVar) {
        this.a = new BillingSignupData(epubVar.c, epubVar.d);
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

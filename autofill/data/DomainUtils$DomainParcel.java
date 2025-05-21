package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.adsv;
import defpackage.adsx;
import defpackage.adsy;
import defpackage.eiig;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class DomainUtils$DomainParcel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new adsx();
    public final adsv a;

    public DomainUtils$DomainParcel(adsv adsvVar) {
        eiig.x(adsvVar);
        this.a = adsvVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        adsy.c(this.a, parcel);
    }
}

package com.google.android.gms.autofill.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.aftc;
import defpackage.afte;
import defpackage.aftf;
import defpackage.ekvl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class DomainUtils$DomainParcel implements Parcelable {
    public static final Parcelable.Creator CREATOR = new afte();
    public final aftc a;

    public DomainUtils$DomainParcel(aftc aftcVar) {
        ekvl.y(aftcVar);
        this.a = aftcVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        aftf.c(this.a, parcel);
    }
}

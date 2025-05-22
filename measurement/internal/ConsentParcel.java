package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.cfqx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class ConsentParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cfqx();
    public final Bundle a;

    public ConsentParcel(Bundle bundle) {
        this.a = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.a;
        int a = atzr.a(parcel);
        atzr.g(parcel, 1, bundle, false);
        atzr.c(parcel, a);
    }
}

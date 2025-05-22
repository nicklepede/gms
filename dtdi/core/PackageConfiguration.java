package com.google.android.gms.dtdi.core;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bagy;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PackageConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bagy();
    public final Bundle a;
    public final boolean b;
    public final Integer c;

    public PackageConfiguration(Bundle bundle, boolean z, Integer num) {
        fxxm.f(bundle, "loggingAvailability");
        this.a = bundle;
        this.b = z;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        Bundle bundle = this.a;
        int a = atzr.a(parcel);
        atzr.g(parcel, 1, bundle, false);
        atzr.e(parcel, 2, this.b);
        atzr.F(parcel, 3, this.c);
        atzr.c(parcel, a);
    }
}

package com.google.android.gms.dtdi.core;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.aycy;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PackageConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aycy();
    public final Bundle a;
    public final boolean b;
    public final Integer c;

    public PackageConfiguration(Bundle bundle, boolean z, Integer num) {
        fvbo.f(bundle, "loggingAvailability");
        this.a = bundle;
        this.b = z;
        this.c = num;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        Bundle bundle = this.a;
        int a = arxc.a(parcel);
        arxc.g(parcel, 1, bundle, false);
        arxc.e(parcel, 2, this.b);
        arxc.F(parcel, 3, this.c);
        arxc.c(parcel, a);
    }
}

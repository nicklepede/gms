package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.ayxb;
import defpackage.fvbo;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PackageConfigurationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ayxb();
    public final ArrayList a;
    public final IBinder b;

    public PackageConfigurationParams(ArrayList arrayList, IBinder iBinder) {
        fvbo.f(arrayList, "apiSurfaces");
        fvbo.f(iBinder, "callback");
        this.a = arrayList;
        this.b = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fvbo.f(parcel, "dest");
        ArrayList arrayList = this.a;
        int a = arxc.a(parcel);
        arxc.E(parcel, 1, arrayList);
        arxc.D(parcel, 2, this.b);
        arxc.c(parcel, a);
    }
}

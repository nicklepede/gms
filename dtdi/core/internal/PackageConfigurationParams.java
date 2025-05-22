package com.google.android.gms.dtdi.core.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bbav;
import defpackage.fxxm;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PackageConfigurationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bbav();
    public final ArrayList a;
    public final IBinder b;

    public PackageConfigurationParams(ArrayList arrayList, IBinder iBinder) {
        fxxm.f(arrayList, "apiSurfaces");
        fxxm.f(iBinder, "callback");
        this.a = arrayList;
        this.b = iBinder;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "dest");
        ArrayList arrayList = this.a;
        int a = atzr.a(parcel);
        atzr.E(parcel, 1, arrayList);
        atzr.D(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}

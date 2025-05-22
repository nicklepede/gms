package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.bbln;
import defpackage.bblp;
import defpackage.ceml;
import defpackage.ceni;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ceni();
    protected final ceml a;

    public StampStyle(IBinder iBinder) {
        bblp bblnVar;
        if (iBinder == null) {
            bblnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            bblnVar = queryLocalInterface instanceof bblp ? (bblp) queryLocalInterface : new bbln(iBinder);
        }
        this.a = new ceml(bblnVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.D(parcel, 2, this.a.a.asBinder());
        atzr.c(parcel, a);
    }
}

package com.google.android.gms.maps.model;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.azhr;
import defpackage.azht;
import defpackage.ccdr;
import defpackage.cceo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class StampStyle extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cceo();
    protected final ccdr a;

    public StampStyle(IBinder iBinder) {
        azht azhrVar;
        if (iBinder == null) {
            azhrVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            azhrVar = queryLocalInterface instanceof azht ? (azht) queryLocalInterface : new azhr(iBinder);
        }
        this.a = new ccdr(azhrVar);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 2, this.a.a.asBinder());
        arxc.c(parcel, a);
    }
}

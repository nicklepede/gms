package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bzic;
import defpackage.bzie;
import defpackage.bzif;
import defpackage.bzih;
import defpackage.bzzd;
import defpackage.bzzf;
import defpackage.cack;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cack();
    public final int a;
    public final LocationRequestInternal b;
    public final bzih c;
    public final bzie d;
    public final PendingIntent e;
    public final bzzf f;
    public final String g;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        bzih bzihVar;
        bzie bzieVar;
        this.a = i;
        this.b = locationRequestInternal;
        bzzf bzzfVar = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            bzihVar = queryLocalInterface instanceof bzih ? (bzih) queryLocalInterface : new bzif(iBinder);
        } else {
            bzihVar = null;
        }
        this.c = bzihVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            bzieVar = queryLocalInterface2 instanceof bzie ? (bzie) queryLocalInterface2 : new bzic(iBinder2);
        } else {
            bzieVar = null;
        }
        this.d = bzieVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            bzzfVar = queryLocalInterface3 instanceof bzzf ? (bzzf) queryLocalInterface3 : new bzzd(iBinder3);
        }
        this.f = bzzfVar;
        this.g = str;
    }

    public final PendingIntent a() {
        PendingIntent pendingIntent = this.e;
        arwm.s(pendingIntent);
        return pendingIntent;
    }

    public final bzie b() {
        bzie bzieVar = this.d;
        arwm.s(bzieVar);
        return bzieVar;
    }

    public final bzih c() {
        bzih bzihVar = this.c;
        arwm.s(bzihVar);
        return bzihVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.t(parcel, 2, this.b, i, false);
        bzih bzihVar = this.c;
        arxc.D(parcel, 3, bzihVar == null ? null : bzihVar.asBinder());
        arxc.t(parcel, 4, this.e, i, false);
        bzie bzieVar = this.d;
        arxc.D(parcel, 5, bzieVar == null ? null : bzieVar.asBinder());
        bzzf bzzfVar = this.f;
        arxc.D(parcel, 6, bzzfVar != null ? bzzfVar.asBinder() : null);
        arxc.v(parcel, 8, this.g, false);
        arxc.c(parcel, a);
    }
}

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
import defpackage.bzzp;
import defpackage.bzzr;
import defpackage.caci;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class LocationReceiver extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new caci();
    public final int a;
    public final IBinder b;
    public final IBinder c;
    public final PendingIntent d;
    public final String e;

    public LocationReceiver(int i, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, String str) {
        this.a = i;
        this.b = iBinder;
        this.c = iBinder2;
        this.d = pendingIntent;
        this.e = str;
    }

    public static LocationReceiver e(PendingIntent pendingIntent) {
        return new LocationReceiver(3, null, null, pendingIntent, "PendingIntent@" + pendingIntent.hashCode());
    }

    public static LocationReceiver f(bzie bzieVar) {
        return i(null, bzieVar, "ILocationCallback@" + System.identityHashCode(bzieVar.asBinder()));
    }

    public static LocationReceiver g(bzih bzihVar) {
        return j(null, bzihVar, "ILocationListener@" + System.identityHashCode(bzihVar.asBinder()));
    }

    public static LocationReceiver h(bzzr bzzrVar) {
        return new LocationReceiver(4, null, bzzrVar.asBinder(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    public static LocationReceiver i(IInterface iInterface, bzie bzieVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new LocationReceiver(2, iInterface, bzieVar.asBinder(), null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    public static LocationReceiver j(IInterface iInterface, bzih bzihVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new LocationReceiver(1, iInterface, bzihVar.asBinder(), null, str);
    }

    public final PendingIntent a() {
        arwm.l(this.a == 3);
        return (PendingIntent) Objects.requireNonNull(this.d);
    }

    public final bzie b() {
        arwm.l(this.a == 2);
        IBinder iBinder = (IBinder) Objects.requireNonNull(this.c);
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof bzie ? (bzie) queryLocalInterface : new bzic(iBinder);
    }

    public final bzih c() {
        arwm.l(this.a == 1);
        IBinder iBinder = (IBinder) Objects.requireNonNull(this.c);
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof bzih ? (bzih) queryLocalInterface : new bzif(iBinder);
    }

    public final bzzr d() {
        arwm.l(this.a == 4);
        IBinder iBinder = (IBinder) Objects.requireNonNull(this.c);
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.ILocationStatusCallback");
        return queryLocalInterface instanceof bzzr ? (bzzr) queryLocalInterface : new bzzp(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.D(parcel, 2, this.b);
        arxc.D(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.v(parcel, 6, this.e, false);
        arxc.c(parcel, a);
    }
}

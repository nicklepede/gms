package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.cbqt;
import defpackage.cbqv;
import defpackage.cbqw;
import defpackage.cbqy;
import defpackage.ccig;
import defpackage.ccii;
import defpackage.cckz;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class LocationReceiver extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cckz();
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

    public static LocationReceiver f(cbqv cbqvVar) {
        return i(null, cbqvVar, "ILocationCallback@" + System.identityHashCode(cbqvVar.asBinder()));
    }

    public static LocationReceiver g(cbqy cbqyVar) {
        return j(null, cbqyVar, "ILocationListener@" + System.identityHashCode(cbqyVar.asBinder()));
    }

    public static LocationReceiver h(ccii cciiVar) {
        return new LocationReceiver(4, null, cciiVar.asBinder(), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    public static LocationReceiver i(IInterface iInterface, cbqv cbqvVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new LocationReceiver(2, iInterface, cbqvVar.asBinder(), null, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.os.IBinder] */
    public static LocationReceiver j(IInterface iInterface, cbqy cbqyVar, String str) {
        if (iInterface == null) {
            iInterface = null;
        }
        return new LocationReceiver(1, iInterface, cbqyVar.asBinder(), null, str);
    }

    public final PendingIntent a() {
        atzb.l(this.a == 3);
        return (PendingIntent) Objects.requireNonNull(this.d);
    }

    public final cbqv b() {
        atzb.l(this.a == 2);
        IBinder iBinder = (IBinder) Objects.requireNonNull(this.c);
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        return queryLocalInterface instanceof cbqv ? (cbqv) queryLocalInterface : new cbqt(iBinder);
    }

    public final cbqy c() {
        atzb.l(this.a == 1);
        IBinder iBinder = (IBinder) Objects.requireNonNull(this.c);
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        return queryLocalInterface instanceof cbqy ? (cbqy) queryLocalInterface : new cbqw(iBinder);
    }

    public final ccii d() {
        atzb.l(this.a == 4);
        IBinder iBinder = (IBinder) Objects.requireNonNull(this.c);
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.ILocationStatusCallback");
        return queryLocalInterface instanceof ccii ? (ccii) queryLocalInterface : new ccig(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.D(parcel, 2, this.b);
        atzr.D(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.v(parcel, 6, this.e, false);
        atzr.c(parcel, a);
    }
}

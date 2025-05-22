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
import defpackage.cchu;
import defpackage.cchw;
import defpackage.cclb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public class LocationRequestUpdateData extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cclb();
    public final int a;
    public final LocationRequestInternal b;
    public final cbqy c;
    public final cbqv d;
    public final PendingIntent e;
    public final cchw f;
    public final String g;

    public LocationRequestUpdateData(int i, LocationRequestInternal locationRequestInternal, IBinder iBinder, IBinder iBinder2, PendingIntent pendingIntent, IBinder iBinder3, String str) {
        cbqy cbqyVar;
        cbqv cbqvVar;
        this.a = i;
        this.b = locationRequestInternal;
        cchw cchwVar = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            cbqyVar = queryLocalInterface instanceof cbqy ? (cbqy) queryLocalInterface : new cbqw(iBinder);
        } else {
            cbqyVar = null;
        }
        this.c = cbqyVar;
        this.e = pendingIntent;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            cbqvVar = queryLocalInterface2 instanceof cbqv ? (cbqv) queryLocalInterface2 : new cbqt(iBinder2);
        } else {
            cbqvVar = null;
        }
        this.d = cbqvVar;
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            cchwVar = queryLocalInterface3 instanceof cchw ? (cchw) queryLocalInterface3 : new cchu(iBinder3);
        }
        this.f = cchwVar;
        this.g = str;
    }

    public final PendingIntent a() {
        PendingIntent pendingIntent = this.e;
        atzb.s(pendingIntent);
        return pendingIntent;
    }

    public final cbqv b() {
        cbqv cbqvVar = this.d;
        atzb.s(cbqvVar);
        return cbqvVar;
    }

    public final cbqy c() {
        cbqy cbqyVar = this.c;
        atzb.s(cbqyVar);
        return cbqyVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.t(parcel, 2, this.b, i, false);
        cbqy cbqyVar = this.c;
        atzr.D(parcel, 3, cbqyVar == null ? null : cbqyVar.asBinder());
        atzr.t(parcel, 4, this.e, i, false);
        cbqv cbqvVar = this.d;
        atzr.D(parcel, 5, cbqvVar == null ? null : cbqvVar.asBinder());
        cchw cchwVar = this.f;
        atzr.D(parcel, 6, cchwVar != null ? cchwVar.asBinder() : null);
        atzr.v(parcel, 8, this.g, false);
        atzr.c(parcel, a);
    }
}

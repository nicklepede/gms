package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cljc;
import defpackage.clje;
import defpackage.cljf;
import defpackage.cljh;
import defpackage.cljs;
import defpackage.clju;
import defpackage.clmb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class StartDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clmb();
    public clju a;
    public clje b;
    public String c;
    public long d;
    public DiscoveryOptions e;
    public cljh f;
    public String g;

    public StartDiscoveryParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartDiscoveryParams) {
            StartDiscoveryParams startDiscoveryParams = (StartDiscoveryParams) obj;
            if (atyq.b(this.a, startDiscoveryParams.a) && atyq.b(this.b, startDiscoveryParams.b) && atyq.b(this.c, startDiscoveryParams.c) && atyq.b(Long.valueOf(this.d), Long.valueOf(startDiscoveryParams.d)) && atyq.b(this.e, startDiscoveryParams.e) && atyq.b(this.f, startDiscoveryParams.f) && atyq.b(this.g, startDiscoveryParams.g)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, Long.valueOf(this.d), this.e, this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        clje cljeVar = this.b;
        atzr.D(parcel, 2, cljeVar == null ? null : cljeVar.asBinder());
        atzr.v(parcel, 3, this.c, false);
        atzr.q(parcel, 4, this.d);
        atzr.t(parcel, 5, this.e, i, false);
        cljh cljhVar = this.f;
        atzr.D(parcel, 6, cljhVar != null ? cljhVar.asBinder() : null);
        atzr.v(parcel, 7, this.g, false);
        atzr.c(parcel, a);
    }

    public StartDiscoveryParams(IBinder iBinder, IBinder iBinder2, String str, long j, DiscoveryOptions discoveryOptions, IBinder iBinder3, String str2) {
        clju cljsVar;
        clje cljcVar;
        cljh cljhVar = null;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        if (iBinder2 == null) {
            cljcVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
            cljcVar = queryLocalInterface2 instanceof clje ? (clje) queryLocalInterface2 : new cljc(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            cljhVar = queryLocalInterface3 instanceof cljh ? (cljh) queryLocalInterface3 : new cljf(iBinder3);
        }
        this.a = cljsVar;
        this.b = cljcVar;
        this.c = str;
        this.d = j;
        this.e = discoveryOptions;
        this.f = cljhVar;
        this.g = str2;
    }
}

package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjax;
import defpackage.cjaz;
import defpackage.cjba;
import defpackage.cjbc;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjdw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class StartDiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdw();
    public cjbp a;
    public cjaz b;
    public String c;
    public long d;
    public DiscoveryOptions e;
    public cjbc f;
    public String g;

    public StartDiscoveryParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartDiscoveryParams) {
            StartDiscoveryParams startDiscoveryParams = (StartDiscoveryParams) obj;
            if (arwb.b(this.a, startDiscoveryParams.a) && arwb.b(this.b, startDiscoveryParams.b) && arwb.b(this.c, startDiscoveryParams.c) && arwb.b(Long.valueOf(this.d), Long.valueOf(startDiscoveryParams.d)) && arwb.b(this.e, startDiscoveryParams.e) && arwb.b(this.f, startDiscoveryParams.f) && arwb.b(this.g, startDiscoveryParams.g)) {
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
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        cjaz cjazVar = this.b;
        arxc.D(parcel, 2, cjazVar == null ? null : cjazVar.asBinder());
        arxc.v(parcel, 3, this.c, false);
        arxc.q(parcel, 4, this.d);
        arxc.t(parcel, 5, this.e, i, false);
        cjbc cjbcVar = this.f;
        arxc.D(parcel, 6, cjbcVar != null ? cjbcVar.asBinder() : null);
        arxc.v(parcel, 7, this.g, false);
        arxc.c(parcel, a);
    }

    public StartDiscoveryParams(IBinder iBinder, IBinder iBinder2, String str, long j, DiscoveryOptions discoveryOptions, IBinder iBinder3, String str2) {
        cjbp cjbnVar;
        cjaz cjaxVar;
        cjbc cjbcVar = null;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        if (iBinder2 == null) {
            cjaxVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryCallback");
            cjaxVar = queryLocalInterface2 instanceof cjaz ? (cjaz) queryLocalInterface2 : new cjax(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            cjbcVar = queryLocalInterface3 instanceof cjbc ? (cjbc) queryLocalInterface3 : new cjba(iBinder3);
        }
        this.a = cjbnVar;
        this.b = cjaxVar;
        this.c = str;
        this.d = j;
        this.e = discoveryOptions;
        this.f = cjbcVar;
        this.g = str2;
    }
}

package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.clib;
import defpackage.clid;
import defpackage.cliq;
import defpackage.clis;
import defpackage.cljv;
import defpackage.cljx;
import defpackage.cllz;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class StartAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cllz();
    public cljx a;
    public clid b;
    public String c;
    public String d;
    public long e;
    public AdvertisingOptions f;
    public clis g;
    public byte[] h;
    public String i;

    public StartAdvertisingParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartAdvertisingParams) {
            StartAdvertisingParams startAdvertisingParams = (StartAdvertisingParams) obj;
            if (atyq.b(this.a, startAdvertisingParams.a) && atyq.b(this.b, startAdvertisingParams.b) && atyq.b(this.c, startAdvertisingParams.c) && atyq.b(this.d, startAdvertisingParams.d) && atyq.b(Long.valueOf(this.e), Long.valueOf(startAdvertisingParams.e)) && atyq.b(this.f, startAdvertisingParams.f) && atyq.b(this.g, startAdvertisingParams.g) && Arrays.equals(this.h, startAdvertisingParams.h) && atyq.b(this.i, startAdvertisingParams.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Long.valueOf(this.e), this.f, this.g, Integer.valueOf(Arrays.hashCode(this.h)), this.i});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        cljx cljxVar = this.a;
        atzr.D(parcel, 1, cljxVar == null ? null : cljxVar.asBinder());
        clid clidVar = this.b;
        atzr.D(parcel, 2, clidVar == null ? null : clidVar.asBinder());
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.q(parcel, 5, this.e);
        atzr.t(parcel, 6, this.f, i, false);
        clis clisVar = this.g;
        atzr.D(parcel, 7, clisVar != null ? clisVar.asBinder() : null);
        atzr.i(parcel, 8, this.h, false);
        atzr.v(parcel, 9, this.i, false);
        atzr.c(parcel, a);
    }

    public StartAdvertisingParams(IBinder iBinder, IBinder iBinder2, String str, String str2, long j, AdvertisingOptions advertisingOptions, IBinder iBinder3, byte[] bArr, String str3) {
        cljx cljvVar;
        clid clibVar;
        clis clisVar = null;
        if (iBinder == null) {
            cljvVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
            cljvVar = queryLocalInterface instanceof cljx ? (cljx) queryLocalInterface : new cljv(iBinder);
        }
        if (iBinder2 == null) {
            clibVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
            clibVar = queryLocalInterface2 instanceof clid ? (clid) queryLocalInterface2 : new clib(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            clisVar = queryLocalInterface3 instanceof clis ? (clis) queryLocalInterface3 : new cliq(iBinder3);
        }
        this.a = cljvVar;
        this.b = clibVar;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = advertisingOptions;
        this.g = clisVar;
        this.h = bArr;
        this.i = str3;
    }
}

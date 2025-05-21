package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cizw;
import defpackage.cizy;
import defpackage.cjal;
import defpackage.cjan;
import defpackage.cjbq;
import defpackage.cjbs;
import defpackage.cjdu;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class StartAdvertisingParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdu();
    public cjbs a;
    public cizy b;
    public String c;
    public String d;
    public long e;
    public AdvertisingOptions f;
    public cjan g;
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
            if (arwb.b(this.a, startAdvertisingParams.a) && arwb.b(this.b, startAdvertisingParams.b) && arwb.b(this.c, startAdvertisingParams.c) && arwb.b(this.d, startAdvertisingParams.d) && arwb.b(Long.valueOf(this.e), Long.valueOf(startAdvertisingParams.e)) && arwb.b(this.f, startAdvertisingParams.f) && arwb.b(this.g, startAdvertisingParams.g) && Arrays.equals(this.h, startAdvertisingParams.h) && arwb.b(this.i, startAdvertisingParams.i)) {
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
        int a = arxc.a(parcel);
        cjbs cjbsVar = this.a;
        arxc.D(parcel, 1, cjbsVar == null ? null : cjbsVar.asBinder());
        cizy cizyVar = this.b;
        arxc.D(parcel, 2, cizyVar == null ? null : cizyVar.asBinder());
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.q(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        cjan cjanVar = this.g;
        arxc.D(parcel, 7, cjanVar != null ? cjanVar.asBinder() : null);
        arxc.i(parcel, 8, this.h, false);
        arxc.v(parcel, 9, this.i, false);
        arxc.c(parcel, a);
    }

    public StartAdvertisingParams(IBinder iBinder, IBinder iBinder2, String str, String str2, long j, AdvertisingOptions advertisingOptions, IBinder iBinder3, byte[] bArr, String str3) {
        cjbs cjbqVar;
        cizy cizwVar;
        cjan cjanVar = null;
        if (iBinder == null) {
            cjbqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
            cjbqVar = queryLocalInterface instanceof cjbs ? (cjbs) queryLocalInterface : new cjbq(iBinder);
        }
        if (iBinder2 == null) {
            cizwVar = null;
        } else {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IAdvertisingCallback");
            cizwVar = queryLocalInterface2 instanceof cizy ? (cizy) queryLocalInterface2 : new cizw(iBinder2);
        }
        if (iBinder3 != null) {
            IInterface queryLocalInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            cjanVar = queryLocalInterface3 instanceof cjan ? (cjan) queryLocalInterface3 : new cjal(iBinder3);
        }
        this.a = cjbqVar;
        this.b = cizwVar;
        this.c = str;
        this.d = str2;
        this.e = j;
        this.f = advertisingOptions;
        this.g = cjanVar;
        this.h = bArr;
        this.i = str3;
    }
}

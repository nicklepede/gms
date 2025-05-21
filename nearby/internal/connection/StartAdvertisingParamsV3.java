package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjal;
import defpackage.cjan;
import defpackage.cjbq;
import defpackage.cjbs;
import defpackage.cjdv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class StartAdvertisingParamsV3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdv();
    public cjbs a;
    public String b;
    public com.google.android.gms.nearby.connection.v3.AdvertisingOptions c;
    public cjan d;
    public byte[] e;
    public String f;

    private StartAdvertisingParamsV3() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartAdvertisingParamsV3) {
            StartAdvertisingParamsV3 startAdvertisingParamsV3 = (StartAdvertisingParamsV3) obj;
            if (arwb.b(this.a, startAdvertisingParamsV3.a) && arwb.b(this.b, startAdvertisingParamsV3.b) && arwb.b(this.c, startAdvertisingParamsV3.c) && arwb.b(this.d, startAdvertisingParamsV3.d) && Arrays.equals(this.e, startAdvertisingParamsV3.e) && arwb.b(this.f, startAdvertisingParamsV3.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(Arrays.hashCode(this.e)), this.f});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.D(parcel, 4, this.d.asBinder());
        arxc.i(parcel, 5, this.e, false);
        arxc.v(parcel, 6, this.f, false);
        arxc.c(parcel, a);
    }

    public StartAdvertisingParamsV3(IBinder iBinder, String str, com.google.android.gms.nearby.connection.v3.AdvertisingOptions advertisingOptions, IBinder iBinder2, byte[] bArr, String str2) {
        cjbs cjbqVar;
        cjan cjanVar = null;
        if (iBinder == null) {
            cjbqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
            cjbqVar = queryLocalInterface instanceof cjbs ? (cjbs) queryLocalInterface : new cjbq(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            cjanVar = queryLocalInterface2 instanceof cjan ? (cjan) queryLocalInterface2 : new cjal(iBinder2);
        }
        this.a = cjbqVar;
        this.b = str;
        this.c = advertisingOptions;
        this.d = cjanVar;
        this.e = bArr;
        this.f = str2;
    }
}

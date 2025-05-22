package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cliq;
import defpackage.clis;
import defpackage.cljv;
import defpackage.cljx;
import defpackage.clma;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class StartAdvertisingParamsV3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clma();
    public cljx a;
    public String b;
    public com.google.android.gms.nearby.connection.v3.AdvertisingOptions c;
    public clis d;
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
            if (atyq.b(this.a, startAdvertisingParamsV3.a) && atyq.b(this.b, startAdvertisingParamsV3.b) && atyq.b(this.c, startAdvertisingParamsV3.c) && atyq.b(this.d, startAdvertisingParamsV3.d) && Arrays.equals(this.e, startAdvertisingParamsV3.e) && atyq.b(this.f, startAdvertisingParamsV3.f)) {
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
        int a = atzr.a(parcel);
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.D(parcel, 4, this.d.asBinder());
        atzr.i(parcel, 5, this.e, false);
        atzr.v(parcel, 6, this.f, false);
        atzr.c(parcel, a);
    }

    public StartAdvertisingParamsV3(IBinder iBinder, String str, com.google.android.gms.nearby.connection.v3.AdvertisingOptions advertisingOptions, IBinder iBinder2, byte[] bArr, String str2) {
        cljx cljvVar;
        clis clisVar = null;
        if (iBinder == null) {
            cljvVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IStartAdvertisingResultListener");
            cljvVar = queryLocalInterface instanceof cljx ? (cljx) queryLocalInterface : new cljv(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IConnectionLifecycleListener");
            clisVar = queryLocalInterface2 instanceof clis ? (clis) queryLocalInterface2 : new cliq(iBinder2);
        }
        this.a = cljvVar;
        this.b = str;
        this.c = advertisingOptions;
        this.d = clisVar;
        this.e = bArr;
        this.f = str2;
    }
}

package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjba;
import defpackage.cjbc;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjdx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class StartDiscoveryParamsV3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjdx();
    public cjbp a;
    public String b;
    public com.google.android.gms.nearby.connection.v3.DiscoveryOptions c;
    public cjbc d;
    public String e;

    private StartDiscoveryParamsV3() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartDiscoveryParamsV3) {
            StartDiscoveryParamsV3 startDiscoveryParamsV3 = (StartDiscoveryParamsV3) obj;
            if (arwb.b(this.a, startDiscoveryParamsV3.a) && arwb.b(this.b, startDiscoveryParamsV3.b) && arwb.b(this.c, startDiscoveryParamsV3.c) && arwb.b(this.d, startDiscoveryParamsV3.d) && arwb.b(this.e, startDiscoveryParamsV3.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        cjbc cjbcVar = this.d;
        arxc.D(parcel, 4, cjbcVar != null ? cjbcVar.asBinder() : null);
        arxc.v(parcel, 5, this.e, false);
        arxc.c(parcel, a);
    }

    public StartDiscoveryParamsV3(IBinder iBinder, String str, com.google.android.gms.nearby.connection.v3.DiscoveryOptions discoveryOptions, IBinder iBinder2, String str2) {
        cjbp cjbnVar;
        cjbc cjbcVar = null;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            cjbcVar = queryLocalInterface2 instanceof cjbc ? (cjbc) queryLocalInterface2 : new cjba(iBinder2);
        }
        this.a = cjbnVar;
        this.b = str;
        this.c = discoveryOptions;
        this.d = cjbcVar;
        this.e = str2;
    }
}

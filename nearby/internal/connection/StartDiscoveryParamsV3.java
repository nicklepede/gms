package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cljf;
import defpackage.cljh;
import defpackage.cljs;
import defpackage.clju;
import defpackage.clmc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class StartDiscoveryParamsV3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clmc();
    public clju a;
    public String b;
    public com.google.android.gms.nearby.connection.v3.DiscoveryOptions c;
    public cljh d;
    public String e;

    private StartDiscoveryParamsV3() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StartDiscoveryParamsV3) {
            StartDiscoveryParamsV3 startDiscoveryParamsV3 = (StartDiscoveryParamsV3) obj;
            if (atyq.b(this.a, startDiscoveryParamsV3.a) && atyq.b(this.b, startDiscoveryParamsV3.b) && atyq.b(this.c, startDiscoveryParamsV3.c) && atyq.b(this.d, startDiscoveryParamsV3.d) && atyq.b(this.e, startDiscoveryParamsV3.e)) {
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
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        cljh cljhVar = this.d;
        atzr.D(parcel, 4, cljhVar != null ? cljhVar.asBinder() : null);
        atzr.v(parcel, 5, this.e, false);
        atzr.c(parcel, a);
    }

    public StartDiscoveryParamsV3(IBinder iBinder, String str, com.google.android.gms.nearby.connection.v3.DiscoveryOptions discoveryOptions, IBinder iBinder2, String str2) {
        clju cljsVar;
        cljh cljhVar = null;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IDiscoveryListener");
            cljhVar = queryLocalInterface2 instanceof cljh ? (cljh) queryLocalInterface2 : new cljf(iBinder2);
        }
        this.a = cljsVar;
        this.b = str;
        this.c = discoveryOptions;
        this.d = cljhVar;
        this.e = str2;
    }
}

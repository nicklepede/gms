package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cljs;
import defpackage.clju;
import defpackage.clmq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class UpdateDiscoveryOptionsParamsV3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clmq();
    public clju a;
    public String b;
    public com.google.android.gms.nearby.connection.v3.DiscoveryOptions c;
    public String d;

    private UpdateDiscoveryOptionsParamsV3() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof UpdateDiscoveryOptionsParamsV3) {
            UpdateDiscoveryOptionsParamsV3 updateDiscoveryOptionsParamsV3 = (UpdateDiscoveryOptionsParamsV3) obj;
            if (atyq.b(this.a, updateDiscoveryOptionsParamsV3.a) && atyq.b(this.b, updateDiscoveryOptionsParamsV3.b) && atyq.b(this.c, updateDiscoveryOptionsParamsV3.c) && atyq.b(this.d, updateDiscoveryOptionsParamsV3.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        clju cljuVar = this.a;
        atzr.D(parcel, 1, cljuVar == null ? null : cljuVar.asBinder());
        atzr.v(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public UpdateDiscoveryOptionsParamsV3(IBinder iBinder, String str, com.google.android.gms.nearby.connection.v3.DiscoveryOptions discoveryOptions, String str2) {
        clju cljsVar;
        if (iBinder == null) {
            cljsVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cljsVar = queryLocalInterface instanceof clju ? (clju) queryLocalInterface : new cljs(iBinder);
        }
        this.a = cljsVar;
        this.b = str;
        this.c = discoveryOptions;
        this.d = str2;
    }
}

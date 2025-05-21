package com.google.android.gms.nearby.internal.connection;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.cjbn;
import defpackage.cjbp;
import defpackage.cjel;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class UpdateDiscoveryOptionsParamsV3 extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cjel();
    public cjbp a;
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
            if (arwb.b(this.a, updateDiscoveryOptionsParamsV3.a) && arwb.b(this.b, updateDiscoveryOptionsParamsV3.b) && arwb.b(this.c, updateDiscoveryOptionsParamsV3.c) && arwb.b(this.d, updateDiscoveryOptionsParamsV3.d)) {
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
        int a = arxc.a(parcel);
        cjbp cjbpVar = this.a;
        arxc.D(parcel, 1, cjbpVar == null ? null : cjbpVar.asBinder());
        arxc.v(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public UpdateDiscoveryOptionsParamsV3(IBinder iBinder, String str, com.google.android.gms.nearby.connection.v3.DiscoveryOptions discoveryOptions, String str2) {
        cjbp cjbnVar;
        if (iBinder == null) {
            cjbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.nearby.internal.connection.IResultListener");
            cjbnVar = queryLocalInterface instanceof cjbp ? (cjbp) queryLocalInterface : new cjbn(iBinder);
        }
        this.a = cjbnVar;
        this.b = str;
        this.c = discoveryOptions;
        this.d = str2;
    }
}

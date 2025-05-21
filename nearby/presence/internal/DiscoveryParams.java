package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import com.google.android.gms.nearby.presence.DiscoveryOptions;
import defpackage.arbn;
import defpackage.arbp;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.ckrg;
import defpackage.ckrq;
import defpackage.ckrs;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class DiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckrg();
    public arbp a;
    public ckrs b;
    public DiscoveryFilter c;
    public DiscoveryOptions d;

    private DiscoveryParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryParams) {
            DiscoveryParams discoveryParams = (DiscoveryParams) obj;
            if (arwb.b(this.a, discoveryParams.a) && arwb.b(this.b, discoveryParams.b) && arwb.b(this.c, discoveryParams.c) && arwb.b(this.d, discoveryParams.d)) {
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
        arxc.D(parcel, 1, this.a.asBinder());
        arxc.D(parcel, 2, this.b.asBinder());
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }

    public DiscoveryParams(IBinder iBinder, IBinder iBinder2, DiscoveryFilter discoveryFilter, DiscoveryOptions discoveryOptions) {
        arbp arbnVar;
        ckrs ckrsVar = null;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IDiscoveryCallback");
            ckrsVar = queryLocalInterface2 instanceof ckrs ? (ckrs) queryLocalInterface2 : new ckrq(iBinder2);
        }
        this.a = arbnVar;
        this.b = ckrsVar;
        this.c = discoveryFilter;
        this.d = discoveryOptions;
    }
}

package com.google.android.gms.nearby.presence.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.DiscoveryFilter;
import com.google.android.gms.nearby.presence.DiscoveryOptions;
import defpackage.atec;
import defpackage.atee;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cmzl;
import defpackage.cmzv;
import defpackage.cmzx;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DiscoveryParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmzl();
    public atee a;
    public cmzx b;
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
            if (atyq.b(this.a, discoveryParams.a) && atyq.b(this.b, discoveryParams.b) && atyq.b(this.c, discoveryParams.c) && atyq.b(this.d, discoveryParams.d)) {
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
        atzr.D(parcel, 1, this.a.asBinder());
        atzr.D(parcel, 2, this.b.asBinder());
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    public DiscoveryParams(IBinder iBinder, IBinder iBinder2, DiscoveryFilter discoveryFilter, DiscoveryOptions discoveryOptions) {
        atee atecVar;
        cmzx cmzxVar = null;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.nearby.presence.internal.IDiscoveryCallback");
            cmzxVar = queryLocalInterface2 instanceof cmzx ? (cmzx) queryLocalInterface2 : new cmzv(iBinder2);
        }
        this.a = atecVar;
        this.b = cmzxVar;
        this.c = discoveryFilter;
        this.d = discoveryOptions;
    }
}

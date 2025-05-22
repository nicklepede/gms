package com.google.android.gms.nearby.presence.internal;

import android.app.PendingIntent;
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
import defpackage.cmzn;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class DiscoveryWithIntentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmzn();
    public atee a;
    public PendingIntent b;
    public DiscoveryFilter c;
    public DiscoveryOptions d;

    private DiscoveryWithIntentParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DiscoveryWithIntentParams) {
            DiscoveryWithIntentParams discoveryWithIntentParams = (DiscoveryWithIntentParams) obj;
            if (atyq.b(this.a, discoveryWithIntentParams.a) && atyq.b(this.b, discoveryWithIntentParams.b) && atyq.b(this.c, discoveryWithIntentParams.c) && atyq.b(this.d, discoveryWithIntentParams.d)) {
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
        atzr.t(parcel, 2, this.b, i, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.t(parcel, 4, this.d, i, false);
        atzr.c(parcel, a);
    }

    public DiscoveryWithIntentParams(IBinder iBinder, PendingIntent pendingIntent, DiscoveryFilter discoveryFilter, DiscoveryOptions discoveryOptions) {
        atee atecVar;
        if (iBinder == null) {
            atecVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            atecVar = queryLocalInterface instanceof atee ? (atee) queryLocalInterface : new atec(iBinder);
        }
        this.a = atecVar;
        this.b = pendingIntent;
        this.c = discoveryFilter;
        this.d = discoveryOptions;
    }
}

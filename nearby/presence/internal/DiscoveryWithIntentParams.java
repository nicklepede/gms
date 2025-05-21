package com.google.android.gms.nearby.presence.internal;

import android.app.PendingIntent;
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
import defpackage.ckri;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class DiscoveryWithIntentParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckri();
    public arbp a;
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
            if (arwb.b(this.a, discoveryWithIntentParams.a) && arwb.b(this.b, discoveryWithIntentParams.b) && arwb.b(this.c, discoveryWithIntentParams.c) && arwb.b(this.d, discoveryWithIntentParams.d)) {
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
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.t(parcel, 4, this.d, i, false);
        arxc.c(parcel, a);
    }

    public DiscoveryWithIntentParams(IBinder iBinder, PendingIntent pendingIntent, DiscoveryFilter discoveryFilter, DiscoveryOptions discoveryOptions) {
        arbp arbnVar;
        if (iBinder == null) {
            arbnVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            arbnVar = queryLocalInterface instanceof arbp ? (arbp) queryLocalInterface : new arbn(iBinder);
        }
        this.a = arbnVar;
        this.b = pendingIntent;
        this.c = discoveryFilter;
        this.d = discoveryOptions;
    }
}

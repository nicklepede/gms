package com.google.android.gms.nearby.presence.log;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.clep;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class NearbyPresenceDiscoveryRequestAttribution extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new clep();
    public DtdiAttribution a;

    private NearbyPresenceDiscoveryRequestAttribution() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NearbyPresenceDiscoveryRequestAttribution) {
            return arwb.b(this.a, ((NearbyPresenceDiscoveryRequestAttribution) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, this.a, i, false);
        arxc.c(parcel, a);
    }

    public NearbyPresenceDiscoveryRequestAttribution(DtdiAttribution dtdiAttribution) {
        this.a = dtdiAttribution;
    }
}

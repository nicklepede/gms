package com.google.android.gms.nearby.presence;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.nearby.presence.log.NearbyPresenceDiscoveryRequestAttribution;
import defpackage.atzr;
import defpackage.cmrw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class DiscoveryRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cmrw();
    public final boolean a;
    public final long b;
    public final boolean c;
    public final DiscoveryFilter d;
    public final NearbyPresenceDiscoveryRequestAttribution e;
    public final long f;
    public final WorkSource g;
    private final int[] h;

    public DiscoveryRequest(boolean z, long j, boolean z2, int[] iArr, DiscoveryFilter discoveryFilter, NearbyPresenceDiscoveryRequestAttribution nearbyPresenceDiscoveryRequestAttribution, long j2, WorkSource workSource) {
        this.a = z;
        this.b = j;
        this.c = z2;
        this.h = iArr;
        this.d = discoveryFilter;
        this.e = nearbyPresenceDiscoveryRequestAttribution;
        this.f = j2;
        if (workSource == null) {
            this.g = new WorkSource();
        } else {
            this.g = workSource;
        }
    }

    public final int[] a() {
        int[] iArr = this.h;
        if (iArr == null) {
            return null;
        }
        return (int[]) iArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoveryRequest)) {
            return false;
        }
        DiscoveryRequest discoveryRequest = (DiscoveryRequest) obj;
        return this.a == discoveryRequest.a && this.b == discoveryRequest.b && this.c == discoveryRequest.c && Arrays.equals(this.h, discoveryRequest.h) && this.d.equals(discoveryRequest.d) && this.e.equals(discoveryRequest.e) && this.f == discoveryRequest.f && this.g.equals(discoveryRequest.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Boolean.valueOf(this.c), Integer.valueOf(Arrays.hashCode(this.h)), this.d, this.e, Long.valueOf(this.f), this.g});
    }

    public final String toString() {
        WorkSource workSource = this.g;
        DiscoveryFilter discoveryFilter = this.d;
        return "DiscoveryRequest{localWifiOnly=" + this.a + ", rangingReportingIntervalMillis=" + this.b + ", requestAllMotions=" + this.c + ", discoveryMediums=" + Arrays.toString(this.h) + ", discoveryFilter=" + String.valueOf(discoveryFilter) + ", expirationDateMillis=" + this.f + ", workSource=" + workSource.toString() + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.q(parcel, 2, this.b);
        atzr.e(parcel, 3, this.c);
        atzr.p(parcel, 4, a(), false);
        atzr.t(parcel, 5, this.d, i, false);
        atzr.t(parcel, 6, this.e, i, false);
        atzr.q(parcel, 7, this.f);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.c(parcel, a);
    }
}

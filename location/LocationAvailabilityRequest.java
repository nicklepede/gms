package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bzik;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class LocationAvailabilityRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bzik();
    public final boolean a;
    public final ClientIdentity b;

    public LocationAvailabilityRequest(boolean z, ClientIdentity clientIdentity) {
        this.a = z;
        this.b = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LocationAvailabilityRequest)) {
            return false;
        }
        LocationAvailabilityRequest locationAvailabilityRequest = (LocationAvailabilityRequest) obj;
        return this.a == locationAvailabilityRequest.a && arwb.b(this.b, locationAvailabilityRequest.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LocationAvailabilityRequest[");
        if (this.a) {
            sb.append("bypass, ");
        }
        ClientIdentity clientIdentity = this.b;
        if (clientIdentity != null) {
            sb.append("impersonation=");
            sb.append(clientIdentity);
            sb.append(", ");
        }
        sb.setLength(sb.length() - 2);
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}

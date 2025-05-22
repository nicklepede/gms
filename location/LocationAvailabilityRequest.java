package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cbrb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class LocationAvailabilityRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cbrb();
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
        return this.a == locationAvailabilityRequest.a && atyq.b(this.b, locationAvailabilityRequest.b);
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
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}

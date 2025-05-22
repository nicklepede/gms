package com.google.android.gms.significantplaces;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.atzr;
import defpackage.deqx;
import defpackage.fxqp;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class SignificantPlacesRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new deqx();
    public final ClientIdentity a;

    @fxqp
    public SignificantPlacesRequest(ClientIdentity clientIdentity) {
        this.a = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignificantPlacesRequest) {
            return fxxm.n(this.a, ((SignificantPlacesRequest) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        ClientIdentity clientIdentity = this.a;
        if (clientIdentity != null) {
            return clientIdentity.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Request[");
        ClientIdentity clientIdentity = this.a;
        if (clientIdentity != null) {
            sb.append(" ");
            sb.append(clientIdentity);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        fxxm.f(parcel, "parcel");
        ClientIdentity clientIdentity = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, clientIdentity, i, false);
        atzr.c(parcel, a);
    }
}

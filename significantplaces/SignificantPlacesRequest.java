package com.google.android.gms.significantplaces;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.arxc;
import defpackage.dcgr;
import defpackage.fuur;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class SignificantPlacesRequest extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new dcgr();
    public final ClientIdentity a;

    @fuur
    public SignificantPlacesRequest(ClientIdentity clientIdentity) {
        this.a = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SignificantPlacesRequest) {
            return fvbo.n(this.a, ((SignificantPlacesRequest) obj).a);
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
        fvbo.f(parcel, "parcel");
        ClientIdentity clientIdentity = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, clientIdentity, i, false);
        arxc.c(parcel, a);
    }
}

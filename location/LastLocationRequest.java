package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bzhx;
import defpackage.bzii;
import defpackage.canl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class LastLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bzii();
    public final long a;
    public final int b;
    public final boolean c;
    public final ClientIdentity d;

    public LastLocationRequest(long j, int i, boolean z, ClientIdentity clientIdentity) {
        this.a = j;
        this.b = i;
        this.c = z;
        this.d = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof LastLocationRequest)) {
            return false;
        }
        LastLocationRequest lastLocationRequest = (LastLocationRequest) obj;
        return this.a == lastLocationRequest.a && this.b == lastLocationRequest.b && this.c == lastLocationRequest.c && arwb.b(this.d, lastLocationRequest.d);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Boolean.valueOf(this.c)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("LastLocationRequest[");
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            sb.append("maxAge=");
            canl.e(j, sb);
        }
        int i = this.b;
        if (i != 0) {
            sb.append(", ");
            sb.append(bzhx.a(i));
        }
        if (this.c) {
            sb.append(", bypass");
        }
        ClientIdentity clientIdentity = this.d;
        if (clientIdentity != null) {
            sb.append(", impersonation=");
            sb.append(clientIdentity);
        }
        sb.append(']');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.o(parcel, 2, this.b);
        arxc.e(parcel, 3, this.c);
        arxc.t(parcel, 5, this.d, i, false);
        arxc.c(parcel, a);
    }
}

package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.libs.identity.ClientIdentity;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.auvd;
import defpackage.cbqb;
import defpackage.cbqo;
import defpackage.cbrp;
import defpackage.cbrt;
import defpackage.ccwb;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class CurrentLocationRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new cbqb();
    public final long a;
    public final int b;
    public final int c;
    public final long d;
    public final boolean e;
    public final int f;
    public final WorkSource g;
    public final ClientIdentity h;

    public CurrentLocationRequest(long j, int i, int i2, long j2, boolean z, int i3, WorkSource workSource, ClientIdentity clientIdentity) {
        this.a = j;
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = z;
        this.f = i3;
        this.g = workSource;
        this.h = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof CurrentLocationRequest)) {
            return false;
        }
        CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) obj;
        return this.a == currentLocationRequest.a && this.b == currentLocationRequest.b && this.c == currentLocationRequest.c && this.d == currentLocationRequest.d && this.e == currentLocationRequest.e && this.f == currentLocationRequest.f && atyq.b(this.g, currentLocationRequest.g) && atyq.b(this.h, currentLocationRequest.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Long.valueOf(this.d)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CurrentLocationRequest[");
        sb.append(cbrp.a(this.c));
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            sb.append(", maxAge=");
            ccwb.e(j, sb);
        }
        long j2 = this.d;
        if (j2 != Long.MAX_VALUE) {
            sb.append(", duration=");
            sb.append(j2);
            sb.append("ms");
        }
        int i = this.b;
        if (i != 0) {
            sb.append(", ");
            sb.append(cbqo.a(i));
        }
        if (this.e) {
            sb.append(", bypass");
        }
        int i2 = this.f;
        if (i2 != 0) {
            sb.append(", ");
            sb.append(cbrt.a(i2));
        }
        WorkSource workSource = this.g;
        if (!auvd.g(workSource)) {
            sb.append(", workSource=");
            sb.append(workSource);
        }
        ClientIdentity clientIdentity = this.h;
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
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.o(parcel, 2, this.b);
        atzr.o(parcel, 3, this.c);
        atzr.q(parcel, 4, this.d);
        atzr.e(parcel, 5, this.e);
        atzr.t(parcel, 6, this.g, i, false);
        atzr.o(parcel, 7, this.f);
        atzr.t(parcel, 9, this.h, i, false);
        atzr.c(parcel, a);
    }
}

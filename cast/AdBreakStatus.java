package com.google.android.gms.cast;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aobo;
import defpackage.aozc;
import defpackage.aozp;
import defpackage.atzr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class AdBreakStatus extends AbstractSafeParcelable {
    public final long b;
    public final long c;
    public final String d;
    public final String e;
    public final long f;
    public static final aozp a = new aozp("AdBreakStatus");
    public static final Parcelable.Creator CREATOR = new aobo();

    public AdBreakStatus(long j, long j2, String str, String str2, long j3) {
        this.b = j;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = j3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdBreakStatus)) {
            return false;
        }
        AdBreakStatus adBreakStatus = (AdBreakStatus) obj;
        return this.b == adBreakStatus.b && this.c == adBreakStatus.c && aozc.u(this.d, adBreakStatus.d) && aozc.u(this.e, adBreakStatus.e) && this.f == adBreakStatus.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.b), Long.valueOf(this.c), this.d, this.e, Long.valueOf(this.f)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.b;
        int a2 = atzr.a(parcel);
        atzr.q(parcel, 2, j);
        atzr.q(parcel, 3, this.c);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.q(parcel, 6, this.f);
        atzr.c(parcel, a2);
    }
}

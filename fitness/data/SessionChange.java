package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgee;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SessionChange extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgee();
    public final long a;
    public final Session b;
    public final Session c;

    public SessionChange(long j, Session session, Session session2) {
        this.a = j;
        this.b = session;
        this.c = session2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionChange)) {
            return false;
        }
        SessionChange sessionChange = (SessionChange) obj;
        return this.a == sessionChange.a && arwb.b(this.b, sessionChange.b) && arwb.b(this.c, sessionChange.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}

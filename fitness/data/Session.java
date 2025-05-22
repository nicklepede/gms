package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biiv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class Session extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biiv();
    public final long a;
    public final long b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final Application g;
    public final Long h;

    public Session(long j, long j2, String str, String str2, String str3, int i, Application application, Long l) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = i;
        this.g = application;
        this.h = l;
    }

    public final long a(TimeUnit timeUnit) {
        return timeUnit.convert(this.a, TimeUnit.MILLISECONDS);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Session)) {
            return false;
        }
        Session session = (Session) obj;
        return this.a == session.a && this.b == session.b && atyq.b(this.c, session.c) && atyq.b(this.d, session.d) && atyq.b(this.e, session.e) && atyq.b(this.g, session.g) && this.f == session.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("startTime", Long.valueOf(this.a), arrayList);
        atyp.b("endTime", Long.valueOf(this.b), arrayList);
        atyp.b("name", this.c, arrayList);
        atyp.b("identifier", this.d, arrayList);
        atyp.b("description", this.e, arrayList);
        atyp.b("activity", Integer.valueOf(this.f), arrayList);
        atyp.b("application", this.g, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = atzr.a(parcel);
        atzr.q(parcel, 1, j);
        atzr.q(parcel, 2, this.b);
        atzr.v(parcel, 3, this.c, false);
        atzr.v(parcel, 4, this.d, false);
        atzr.v(parcel, 5, this.e, false);
        atzr.o(parcel, 7, this.f);
        atzr.t(parcel, 8, this.g, i, false);
        atzr.I(parcel, 9, this.h);
        atzr.c(parcel, a);
    }
}

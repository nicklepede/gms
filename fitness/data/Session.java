package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgef;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class Session extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgef();
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
        return this.a == session.a && this.b == session.b && arwb.b(this.c, session.c) && arwb.b(this.d, session.d) && arwb.b(this.e, session.e) && arwb.b(this.g, session.g) && this.f == session.f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), Long.valueOf(this.b), this.d});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("startTime", Long.valueOf(this.a), arrayList);
        arwa.b("endTime", Long.valueOf(this.b), arrayList);
        arwa.b("name", this.c, arrayList);
        arwa.b("identifier", this.d, arrayList);
        arwa.b("description", this.e, arrayList);
        arwa.b("activity", Integer.valueOf(this.f), arrayList);
        arwa.b("application", this.g, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        long j = this.a;
        int a = arxc.a(parcel);
        arxc.q(parcel, 1, j);
        arxc.q(parcel, 2, this.b);
        arxc.v(parcel, 3, this.c, false);
        arxc.v(parcel, 4, this.d, false);
        arxc.v(parcel, 5, this.e, false);
        arxc.o(parcel, 7, this.f);
        arxc.t(parcel, 8, this.g, i, false);
        arxc.I(parcel, 9, this.h);
        arxc.c(parcel, a);
    }
}

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgml;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SessionReadResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new bgml();
    public final List a;
    public final List b;
    public final Status c;

    public SessionReadResult(List list, List list2, Status status) {
        this.a = list;
        this.b = DesugarCollections.unmodifiableList(list2);
        this.c = status;
    }

    public static SessionReadResult b(Status status) {
        return new SessionReadResult(new ArrayList(), new ArrayList(), status);
    }

    @Override // defpackage.aqyf
    public final Status a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionReadResult)) {
            return false;
        }
        SessionReadResult sessionReadResult = (SessionReadResult) obj;
        return this.c.equals(sessionReadResult.c) && arwb.b(this.a, sessionReadResult.a) && arwb.b(this.b, sessionReadResult.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("status", this.c, arrayList);
        arwa.b("sessions", this.a, arrayList);
        arwa.b("sessionDataSets", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = arxc.a(parcel);
        arxc.y(parcel, 1, list, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.t(parcel, 3, this.c, i, false);
        arxc.c(parcel, a);
    }
}

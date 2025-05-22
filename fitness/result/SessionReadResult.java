package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.birb;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SessionReadResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new birb();
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

    @Override // defpackage.atau
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
        return this.c.equals(sessionReadResult.c) && atyq.b(this.a, sessionReadResult.a) && atyq.b(this.b, sessionReadResult.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.c, this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("status", this.c, arrayList);
        atyp.b("sessions", this.a, arrayList);
        atyp.b("sessionDataSets", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int a = atzr.a(parcel);
        atzr.y(parcel, 1, list, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.t(parcel, 3, this.c, i, false);
        atzr.c(parcel, a);
    }
}

package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atau;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.birc;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SessionStopResult extends AbstractSafeParcelable implements atau {
    public static final Parcelable.Creator CREATOR = new birc();
    public final Status a;
    public final List b;

    public SessionStopResult(Status status, List list) {
        this.a = status;
        this.b = DesugarCollections.unmodifiableList(list);
    }

    public static SessionStopResult b(Status status) {
        return new SessionStopResult(status, Collections.EMPTY_LIST);
    }

    @Override // defpackage.atau
    public final Status a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SessionStopResult)) {
            return false;
        }
        SessionStopResult sessionStopResult = (SessionStopResult) obj;
        return this.a.equals(sessionStopResult.a) && atyq.b(this.b, sessionStopResult.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("status", this.a, arrayList);
        atyp.b("sessions", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 2, status, i, false);
        atzr.y(parcel, 3, this.b, false);
        atzr.c(parcel, a);
    }
}

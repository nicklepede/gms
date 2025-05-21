package com.google.android.gms.fitness.result;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqyf;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgmm;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SessionStopResult extends AbstractSafeParcelable implements aqyf {
    public static final Parcelable.Creator CREATOR = new bgmm();
    public final Status a;
    public final List b;

    public SessionStopResult(Status status, List list) {
        this.a = status;
        this.b = DesugarCollections.unmodifiableList(list);
    }

    public static SessionStopResult b(Status status) {
        return new SessionStopResult(status, Collections.EMPTY_LIST);
    }

    @Override // defpackage.aqyf
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
        return this.a.equals(sessionStopResult.a) && arwb.b(this.b, sessionStopResult.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("status", this.a, arrayList);
        arwa.b("sessions", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Status status = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 2, status, i, false);
        arxc.y(parcel, 3, this.b, false);
        arxc.c(parcel, a);
    }
}

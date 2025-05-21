package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bgll;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SessionInsertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgll();
    public final Session a;
    public final List b;
    public final List c;
    public final bgiw d;

    public SessionInsertRequest(Session session, List list, List list2, IBinder iBinder) {
        bgiw bgiuVar;
        this.a = session;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.d = bgiuVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SessionInsertRequest) {
            SessionInsertRequest sessionInsertRequest = (SessionInsertRequest) obj;
            if (arwb.b(this.a, sessionInsertRequest.a) && arwb.b(this.b, sessionInsertRequest.b) && arwb.b(this.c, sessionInsertRequest.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("session", this.a, arrayList);
        arwa.b("dataSets", this.b, arrayList);
        arwa.b("aggregateDataPoints", this.c, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Session session = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, session, i, false);
        arxc.y(parcel, 2, this.b, false);
        arxc.y(parcel, 3, this.c, false);
        bgiw bgiwVar = this.d;
        arxc.D(parcel, 4, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.c(parcel, a);
    }

    public SessionInsertRequest(Session session, List list, List list2, bgiw bgiwVar) {
        this.a = session;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = bgiwVar;
    }
}

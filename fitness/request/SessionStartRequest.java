package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.bgiu;
import defpackage.bgiw;
import defpackage.bglo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SessionStartRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglo();
    public final Session a;
    public final bgiw b;

    public SessionStartRequest(Session session, IBinder iBinder) {
        bgiw bgiuVar;
        this.a = session;
        if (iBinder == null) {
            bgiuVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            bgiuVar = queryLocalInterface instanceof bgiw ? (bgiw) queryLocalInterface : new bgiu(iBinder);
        }
        this.b = bgiuVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof SessionStartRequest) && arwb.b(this.a, ((SessionStartRequest) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("session", this.a, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Session session = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, session, i, false);
        bgiw bgiwVar = this.b;
        arxc.D(parcel, 2, bgiwVar == null ? null : bgiwVar.asBinder());
        arxc.c(parcel, a);
    }

    public SessionStartRequest(Session session, bgiw bgiwVar) {
        arwm.c(session.a(TimeUnit.MILLISECONDS) <= System.currentTimeMillis(), "Cannot start a session in the future");
        arwm.c(session.b == 0, "Cannot start a session which has already ended");
        this.a = session;
        this.b = bgiwVar;
    }
}

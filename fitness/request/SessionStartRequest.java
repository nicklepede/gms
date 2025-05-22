package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.biqe;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SessionStartRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biqe();
    public final Session a;
    public final binm b;

    public SessionStartRequest(Session session, IBinder iBinder) {
        binm binkVar;
        this.a = session;
        if (iBinder == null) {
            binkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binkVar = queryLocalInterface instanceof binm ? (binm) queryLocalInterface : new bink(iBinder);
        }
        this.b = binkVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            return (obj instanceof SessionStartRequest) && atyq.b(this.a, ((SessionStartRequest) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("session", this.a, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Session session = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, session, i, false);
        binm binmVar = this.b;
        atzr.D(parcel, 2, binmVar == null ? null : binmVar.asBinder());
        atzr.c(parcel, a);
    }

    public SessionStartRequest(Session session, binm binmVar) {
        atzb.c(session.a(TimeUnit.MILLISECONDS) <= System.currentTimeMillis(), "Cannot start a session in the future");
        atzb.c(session.b == 0, "Cannot start a session which has already ended");
        this.a = session;
        this.b = binmVar;
    }
}

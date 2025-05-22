package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.fitness.data.Session;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bink;
import defpackage.binm;
import defpackage.biqb;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SessionInsertRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biqb();
    public final Session a;
    public final List b;
    public final List c;
    public final binm d;

    public SessionInsertRequest(Session session, List list, List list2, IBinder iBinder) {
        binm binkVar;
        this.a = session;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        if (iBinder == null) {
            binkVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IStatusCallback");
            binkVar = queryLocalInterface instanceof binm ? (binm) queryLocalInterface : new bink(iBinder);
        }
        this.d = binkVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SessionInsertRequest) {
            SessionInsertRequest sessionInsertRequest = (SessionInsertRequest) obj;
            if (atyq.b(this.a, sessionInsertRequest.a) && atyq.b(this.b, sessionInsertRequest.b) && atyq.b(this.c, sessionInsertRequest.c)) {
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
        atyp.b("session", this.a, arrayList);
        atyp.b("dataSets", this.b, arrayList);
        atyp.b("aggregateDataPoints", this.c, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Session session = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, session, i, false);
        atzr.y(parcel, 2, this.b, false);
        atzr.y(parcel, 3, this.c, false);
        binm binmVar = this.d;
        atzr.D(parcel, 4, binmVar == null ? null : binmVar.asBinder());
        atzr.c(parcel, a);
    }

    public SessionInsertRequest(Session session, List list, List list2, binm binmVar) {
        this.a = session;
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
        this.d = binmVar;
    }
}

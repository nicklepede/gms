package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.biiw;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class SessionDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new biiw();
    public final Session a;
    public final DataSet b;

    public SessionDataSet(Session session, DataSet dataSet) {
        this.a = session;
        this.b = dataSet;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SessionDataSet)) {
            return false;
        }
        SessionDataSet sessionDataSet = (SessionDataSet) obj;
        return atyq.b(this.a, sessionDataSet.a) && atyq.b(this.b, sessionDataSet.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("session", this.a, arrayList);
        atyp.b("dataSet", this.b, arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Session session = this.a;
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, session, i, false);
        atzr.t(parcel, 2, this.b, i, false);
        atzr.c(parcel, a);
    }
}

package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bgeg;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class SessionDataSet extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bgeg();
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
        return arwb.b(this.a, sessionDataSet.a) && arwb.b(this.b, sessionDataSet.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("session", this.a, arrayList);
        arwa.b("dataSet", this.b, arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Session session = this.a;
        int a = arxc.a(parcel);
        arxc.t(parcel, 1, session, i, false);
        arxc.t(parcel, 2, this.b, i, false);
        arxc.c(parcel, a);
    }
}

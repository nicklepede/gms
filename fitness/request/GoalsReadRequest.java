package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwa;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.bghq;
import defpackage.bglb;
import defpackage.fhrd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GoalsReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bglb();
    public final List a;
    public final List b;
    public final List c;
    public final bghq d;

    public GoalsReadRequest(IBinder iBinder, List list, List list2, List list3) {
        bghq bghqVar;
        if (iBinder == null) {
            bghqVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoalsReadCallback");
            bghqVar = queryLocalInterface instanceof bghq ? (bghq) queryLocalInterface : new bghq(iBinder);
        }
        this.d = bghqVar;
        this.a = list;
        this.b = list2;
        this.c = list3;
    }

    public final List a() {
        List list = this.c;
        if (list.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(fhrd.c(((Integer) it.next()).intValue()));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GoalsReadRequest)) {
            return false;
        }
        GoalsReadRequest goalsReadRequest = (GoalsReadRequest) obj;
        return arwb.b(this.a, goalsReadRequest.a) && arwb.b(this.b, goalsReadRequest.b) && arwb.b(this.c, goalsReadRequest.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, a()});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        arwa.b("dataTypes", this.a, arrayList);
        arwa.b("objectiveTypes", this.b, arrayList);
        arwa.b("activities", a(), arrayList);
        return arwa.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        bghq bghqVar = this.d;
        arxc.D(parcel, 1, bghqVar == null ? null : bghqVar.a);
        arxc.G(parcel, 2, this.a);
        arxc.G(parcel, 3, this.b);
        arxc.G(parcel, 4, this.c);
        arxc.c(parcel, a);
    }
}

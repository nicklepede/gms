package com.google.android.gms.fitness.request;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyp;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.bimg;
import defpackage.bipr;
import defpackage.fkha;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GoalsReadRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new bipr();
    public final List a;
    public final List b;
    public final List c;
    public final bimg d;

    public GoalsReadRequest(IBinder iBinder, List list, List list2, List list3) {
        bimg bimgVar;
        if (iBinder == null) {
            bimgVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoalsReadCallback");
            bimgVar = queryLocalInterface instanceof bimg ? (bimg) queryLocalInterface : new bimg(iBinder);
        }
        this.d = bimgVar;
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
            arrayList.add(fkha.c(((Integer) it.next()).intValue()));
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
        return atyq.b(this.a, goalsReadRequest.a) && atyq.b(this.b, goalsReadRequest.b) && atyq.b(this.c, goalsReadRequest.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, a()});
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        atyp.b("dataTypes", this.a, arrayList);
        atyp.b("objectiveTypes", this.b, arrayList);
        atyp.b("activities", a(), arrayList);
        return atyp.a(arrayList, this);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        bimg bimgVar = this.d;
        atzr.D(parcel, 1, bimgVar == null ? null : bimgVar.a);
        atzr.G(parcel, 2, this.a);
        atzr.G(parcel, 3, this.b);
        atzr.G(parcel, 4, this.c);
        atzr.c(parcel, a);
    }
}

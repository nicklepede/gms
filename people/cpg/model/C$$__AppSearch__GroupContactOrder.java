package com.google.android.gms.people.cpg.model;

import defpackage.adc;
import defpackage.adj;
import defpackage.adm;
import defpackage.ado;
import defpackage.adp;
import defpackage.adr;
import defpackage.adt;
import defpackage.adu;
import defpackage.elgo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* renamed from: com.google.android.gms.people.cpg.model.$$__AppSearch__GroupContactOrder, reason: invalid class name */
/* loaded from: classes6.dex */
public final class C$$__AppSearch__GroupContactOrder implements adp {
    @Override // defpackage.adp
    public final ado a() {
        adc adcVar = new adc("cpg:GroupContactOrder");
        adj adjVar = new adj("order");
        adjVar.b(1);
        adjVar.c(0);
        adcVar.c(adjVar.a());
        adm admVar = new adm("dirty");
        admVar.b(2);
        admVar.e(1);
        admVar.c(1);
        admVar.d(0);
        adcVar.c(admVar.a());
        adj adjVar2 = new adj("docVersion");
        adjVar2.b(2);
        adjVar2.c(0);
        adcVar.c(adjVar2.a());
        return adcVar.a();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ adu b(Object obj) {
        GroupContactOrder groupContactOrder = (GroupContactOrder) obj;
        adt adtVar = new adt(groupContactOrder.a, groupContactOrder.b, "cpg:GroupContactOrder");
        elgo b = groupContactOrder.b();
        if (b != null) {
            long[] jArr = new long[b.size()];
            int size = b.size();
            int i = 0;
            int i2 = 0;
            while (i < size) {
                jArr[i2] = ((Long) b.get(i)).longValue();
                i++;
                i2++;
            }
            adtVar.j("order", jArr);
        }
        String str = groupContactOrder.d;
        if (str != null) {
            adtVar.b("dirty", str);
        }
        long a = groupContactOrder.a();
        Long.valueOf(a).getClass();
        adtVar.j("docVersion", a);
        return adtVar.e();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ Object c(adu aduVar, adr adrVar) {
        ArrayList arrayList;
        String l = aduVar.l();
        String k = aduVar.k();
        long[] r = aduVar.r("order");
        Long l2 = null;
        if (r != null) {
            arrayList = new ArrayList(r.length);
            for (long j : r) {
                arrayList.add(Long.valueOf(j));
            }
        } else {
            arrayList = null;
        }
        String[] t = aduVar.t("dirty");
        String str = (t == null || t.length == 0) ? null : t[0];
        long[] r2 = aduVar.r("docVersion");
        if (r2 != null && r2.length != 0) {
            l2 = Long.valueOf(r2[0]);
        }
        return new GroupContactOrder(k, l, arrayList, str, l2);
    }

    @Override // defpackage.adp
    public final String d() {
        return "cpg:GroupContactOrder";
    }

    @Override // defpackage.adp
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}

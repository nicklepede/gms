package com.google.android.gms.people.cpg.model;

import defpackage.acx;
import defpackage.ade;
import defpackage.adh;
import defpackage.adj;
import defpackage.adk;
import defpackage.adm;
import defpackage.ado;
import defpackage.adp;
import defpackage.eitj;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.people.cpg.model.$$__AppSearch__GroupContactOrder, reason: invalid class name */
/* loaded from: classes6.dex */
public final class C$$__AppSearch__GroupContactOrder implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("cpg:GroupContactOrder");
        ade adeVar = new ade("order");
        adeVar.b(1);
        adeVar.c(0);
        acxVar.c(adeVar.a());
        adh adhVar = new adh("dirty");
        adhVar.b(2);
        adhVar.e(1);
        adhVar.c(1);
        adhVar.d(0);
        acxVar.c(adhVar.a());
        ade adeVar2 = new ade("docVersion");
        adeVar2.b(2);
        adeVar2.c(0);
        acxVar.c(adeVar2.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        GroupContactOrder groupContactOrder = (GroupContactOrder) obj;
        ado adoVar = new ado(groupContactOrder.a, groupContactOrder.b, "cpg:GroupContactOrder");
        eitj b = groupContactOrder.b();
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
            adoVar.j("order", jArr);
        }
        String str = groupContactOrder.d;
        if (str != null) {
            adoVar.b("dirty", str);
        }
        long a = groupContactOrder.a();
        Long.valueOf(a).getClass();
        adoVar.j("docVersion", a);
        return adoVar.e();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ Object c(adp adpVar, adm admVar) {
        ArrayList arrayList;
        String l = adpVar.l();
        String k = adpVar.k();
        long[] r = adpVar.r("order");
        Long l2 = null;
        if (r != null) {
            arrayList = new ArrayList(r.length);
            for (long j : r) {
                arrayList.add(Long.valueOf(j));
            }
        } else {
            arrayList = null;
        }
        String[] t = adpVar.t("dirty");
        String str = (t == null || t.length == 0) ? null : t[0];
        long[] r2 = adpVar.r("docVersion");
        if (r2 != null && r2.length != 0) {
            l2 = Long.valueOf(r2[0]);
        }
        return new GroupContactOrder(k, l, arrayList, str, l2);
    }

    @Override // defpackage.adk
    public final String d() {
        return "cpg:GroupContactOrder";
    }

    @Override // defpackage.adk
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}

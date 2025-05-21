package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.acx;
import defpackage.ada;
import defpackage.adh;
import defpackage.adj;
import defpackage.adk;
import defpackage.adm;
import defpackage.ado;
import defpackage.adp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__ContactPoint, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__ContactPoint implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("ContactPoint");
        adh adhVar = new adh("name");
        adhVar.b(2);
        adhVar.e(1);
        adhVar.c(2);
        adhVar.d(0);
        acxVar.c(adhVar.a());
        adh adhVar2 = new adh("keywords");
        adhVar2.b(1);
        adhVar2.e(1);
        adhVar2.c(2);
        adhVar2.d(0);
        acxVar.c(adhVar2.a());
        adh adhVar3 = new adh("alternateName");
        adhVar3.b(1);
        adhVar3.e(1);
        adhVar3.c(2);
        adhVar3.d(0);
        acxVar.c(adhVar3.a());
        ada adaVar = new ada("g3attrinfo", "G3AttributionInfo");
        adaVar.c(2);
        adaVar.a = true;
        acxVar.c(adaVar.a());
        adh adhVar4 = new adh("address");
        adhVar4.b(1);
        adhVar4.e(1);
        adhVar4.c(2);
        adhVar4.d(0);
        acxVar.c(adhVar4.a());
        adh adhVar5 = new adh("email");
        adhVar5.b(1);
        adhVar5.e(3);
        adhVar5.c(2);
        adhVar5.d(0);
        acxVar.c(adhVar5.a());
        adh adhVar6 = new adh("telephone");
        adhVar6.b(1);
        adhVar6.e(1);
        adhVar6.c(2);
        adhVar6.d(0);
        acxVar.c(adhVar6.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        ContactPoint contactPoint = (ContactPoint) obj;
        ado adoVar = new ado(contactPoint.q, contactPoint.p, "ContactPoint");
        adoVar.b("name", contactPoint.r);
        List b = contactPoint.b();
        if (b != null) {
            adoVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = contactPoint.a();
        if (a != null) {
            adoVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adoVar.a("g3attrinfo", adp.e(contactPoint.s));
        List list = contactPoint.a;
        if (list != null) {
            adoVar.b("address", (String[]) list.toArray(new String[0]));
        }
        List list2 = contactPoint.b;
        if (list2 != null) {
            adoVar.b("email", (String[]) list2.toArray(new String[0]));
        }
        List list3 = contactPoint.c;
        if (list3 != null) {
            adoVar.b("telephone", (String[]) list3.toArray(new String[0]));
        }
        return adoVar.e();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ Object c(adp adpVar, adm admVar) {
        String k = adpVar.k();
        String l = adpVar.l();
        String[] t = adpVar.t("name");
        String str = (t == null || t.length == 0) ? null : t[0];
        String[] t2 = adpVar.t("keywords");
        List asList = t2 != null ? Arrays.asList(t2) : null;
        String[] t3 = adpVar.t("alternateName");
        List asList2 = t3 != null ? Arrays.asList(t3) : null;
        adp f = adpVar.f("g3attrinfo");
        G3AttributionInfo g3AttributionInfo = f != null ? (G3AttributionInfo) f.j(G3AttributionInfo.class, admVar) : null;
        String[] t4 = adpVar.t("address");
        List asList3 = t4 != null ? Arrays.asList(t4) : null;
        String[] t5 = adpVar.t("email");
        List asList4 = t5 != null ? Arrays.asList(t5) : null;
        String[] t6 = adpVar.t("telephone");
        return new ContactPoint(l, k, str, asList, asList2, asList3, asList4, t6 != null ? Arrays.asList(t6) : null, g3AttributionInfo);
    }

    @Override // defpackage.adk
    public final String d() {
        return "ContactPoint";
    }

    @Override // defpackage.adk
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        return arrayList;
    }
}

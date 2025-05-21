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
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__PostalAddress, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__PostalAddress implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("PostalAddress");
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
        adh adhVar4 = new adh("streetAddress");
        adhVar4.b(2);
        adhVar4.e(1);
        adhVar4.c(2);
        adhVar4.d(0);
        acxVar.c(adhVar4.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        PostalAddress postalAddress = (PostalAddress) obj;
        ado adoVar = new ado(postalAddress.q, postalAddress.p, "PostalAddress");
        adoVar.b("name", postalAddress.r);
        List b = postalAddress.b();
        if (b != null) {
            adoVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = postalAddress.a();
        if (a != null) {
            adoVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adoVar.a("g3attrinfo", adp.e(postalAddress.s));
        adoVar.b("streetAddress", postalAddress.a);
        return adoVar.e();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ Object c(adp adpVar, adm admVar) {
        String k = adpVar.k();
        String l = adpVar.l();
        String[] t = adpVar.t("name");
        String str = null;
        String str2 = (t == null || t.length == 0) ? null : t[0];
        String[] t2 = adpVar.t("keywords");
        List asList = t2 != null ? Arrays.asList(t2) : null;
        String[] t3 = adpVar.t("alternateName");
        List asList2 = t3 != null ? Arrays.asList(t3) : null;
        adp f = adpVar.f("g3attrinfo");
        G3AttributionInfo g3AttributionInfo = f != null ? (G3AttributionInfo) f.j(G3AttributionInfo.class, admVar) : null;
        String[] t4 = adpVar.t("streetAddress");
        if (t4 != null && t4.length != 0) {
            str = t4[0];
        }
        return new PostalAddress(l, k, str2, asList, asList2, str, g3AttributionInfo);
    }

    @Override // defpackage.adk
    public final String d() {
        return "PostalAddress";
    }

    @Override // defpackage.adk
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        return arrayList;
    }
}

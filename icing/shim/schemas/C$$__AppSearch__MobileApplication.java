package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.acx;
import defpackage.ada;
import defpackage.ade;
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
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__MobileApplication, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__MobileApplication implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("MobileApplication");
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
        adh adhVar4 = new adh("image");
        adhVar4.b(2);
        adhVar4.e(0);
        adhVar4.c(0);
        adhVar4.d(0);
        acxVar.c(adhVar4.a());
        ade adeVar = new ade("dateModified");
        adeVar.b(2);
        adeVar.c(0);
        acxVar.c(adeVar.a());
        adh adhVar5 = new adh("identifier");
        adhVar5.b(2);
        adhVar5.e(0);
        adhVar5.c(0);
        adhVar5.d(0);
        acxVar.c(adhVar5.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        MobileApplication mobileApplication = (MobileApplication) obj;
        ado adoVar = new ado(mobileApplication.q, mobileApplication.p, "MobileApplication");
        adoVar.b("name", mobileApplication.r);
        List b = mobileApplication.b();
        if (b != null) {
            adoVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = mobileApplication.a();
        if (a != null) {
            adoVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adoVar.a("g3attrinfo", adp.e(mobileApplication.s));
        adoVar.b("image", mobileApplication.a);
        adoVar.j("dateModified", mobileApplication.b);
        adoVar.b("identifier", mobileApplication.c);
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
        String[] t4 = adpVar.t("image");
        String str3 = (t4 == null || t4.length == 0) ? null : t4[0];
        long c = adpVar.c("dateModified");
        String[] t5 = adpVar.t("identifier");
        if (t5 != null && t5.length != 0) {
            str = t5[0];
        }
        return new MobileApplication(l, k, str2, asList, asList2, str3, c, str, g3AttributionInfo);
    }

    @Override // defpackage.adk
    public final String d() {
        return "MobileApplication";
    }

    @Override // defpackage.adk
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        return arrayList;
    }
}

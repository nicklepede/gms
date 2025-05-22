package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.adc;
import defpackage.adf;
import defpackage.adj;
import defpackage.adm;
import defpackage.ado;
import defpackage.adp;
import defpackage.adr;
import defpackage.adt;
import defpackage.adu;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__MobileApplication, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__MobileApplication implements adp {
    @Override // defpackage.adp
    public final ado a() {
        adc adcVar = new adc("MobileApplication");
        adm admVar = new adm("name");
        admVar.b(2);
        admVar.e(1);
        admVar.c(2);
        admVar.d(0);
        adcVar.c(admVar.a());
        adm admVar2 = new adm("keywords");
        admVar2.b(1);
        admVar2.e(1);
        admVar2.c(2);
        admVar2.d(0);
        adcVar.c(admVar2.a());
        adm admVar3 = new adm("alternateName");
        admVar3.b(1);
        admVar3.e(1);
        admVar3.c(2);
        admVar3.d(0);
        adcVar.c(admVar3.a());
        adf adfVar = new adf("g3attrinfo", "G3AttributionInfo");
        adfVar.c(2);
        adfVar.a = true;
        adcVar.c(adfVar.a());
        adm admVar4 = new adm("image");
        admVar4.b(2);
        admVar4.e(0);
        admVar4.c(0);
        admVar4.d(0);
        adcVar.c(admVar4.a());
        adj adjVar = new adj("dateModified");
        adjVar.b(2);
        adjVar.c(0);
        adcVar.c(adjVar.a());
        adm admVar5 = new adm("identifier");
        admVar5.b(2);
        admVar5.e(0);
        admVar5.c(0);
        admVar5.d(0);
        adcVar.c(admVar5.a());
        return adcVar.a();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ adu b(Object obj) {
        MobileApplication mobileApplication = (MobileApplication) obj;
        adt adtVar = new adt(mobileApplication.q, mobileApplication.p, "MobileApplication");
        adtVar.b("name", mobileApplication.r);
        List b = mobileApplication.b();
        if (b != null) {
            adtVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = mobileApplication.a();
        if (a != null) {
            adtVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adtVar.a("g3attrinfo", adu.e(mobileApplication.s));
        adtVar.b("image", mobileApplication.a);
        adtVar.j("dateModified", mobileApplication.b);
        adtVar.b("identifier", mobileApplication.c);
        return adtVar.e();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ Object c(adu aduVar, adr adrVar) {
        String k = aduVar.k();
        String l = aduVar.l();
        String[] t = aduVar.t("name");
        String str = null;
        String str2 = (t == null || t.length == 0) ? null : t[0];
        String[] t2 = aduVar.t("keywords");
        List asList = t2 != null ? Arrays.asList(t2) : null;
        String[] t3 = aduVar.t("alternateName");
        List asList2 = t3 != null ? Arrays.asList(t3) : null;
        adu f = aduVar.f("g3attrinfo");
        G3AttributionInfo g3AttributionInfo = f != null ? (G3AttributionInfo) f.j(G3AttributionInfo.class, adrVar) : null;
        String[] t4 = aduVar.t("image");
        String str3 = (t4 == null || t4.length == 0) ? null : t4[0];
        long c = aduVar.c("dateModified");
        String[] t5 = aduVar.t("identifier");
        if (t5 != null && t5.length != 0) {
            str = t5[0];
        }
        return new MobileApplication(l, k, str2, asList, asList2, str3, c, str, g3AttributionInfo);
    }

    @Override // defpackage.adp
    public final String d() {
        return "MobileApplication";
    }

    @Override // defpackage.adp
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        return arrayList;
    }
}

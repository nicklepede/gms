package com.google.android.gms.people.cpg.model;

import defpackage.adc;
import defpackage.adj;
import defpackage.adm;
import defpackage.ado;
import defpackage.adp;
import defpackage.adr;
import defpackage.adt;
import defpackage.adu;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* renamed from: com.google.android.gms.people.cpg.model.$$__AppSearch__ActionPreferenceDocument, reason: invalid class name */
/* loaded from: classes6.dex */
public final class C$$__AppSearch__ActionPreferenceDocument implements adp {
    @Override // defpackage.adp
    public final ado a() {
        adc adcVar = new adc("cpg:ActionPreference");
        adm admVar = new adm("identifier");
        admVar.b(2);
        admVar.e(1);
        admVar.c(2);
        admVar.d(0);
        adcVar.c(admVar.a());
        adj adjVar = new adj("identifierType");
        adjVar.b(2);
        adjVar.c(0);
        adcVar.c(adjVar.a());
        adj adjVar2 = new adj("actionType");
        adjVar2.b(2);
        adjVar2.c(0);
        adcVar.c(adjVar2.a());
        adm admVar2 = new adm("dataOne");
        admVar2.b(2);
        admVar2.e(1);
        admVar2.c(2);
        admVar2.d(0);
        adcVar.c(admVar2.a());
        adm admVar3 = new adm("mimetype");
        admVar3.b(2);
        admVar3.e(1);
        admVar3.c(2);
        admVar3.d(0);
        adcVar.c(admVar3.a());
        adj adjVar3 = new adj("appType");
        adjVar3.b(2);
        adjVar3.c(0);
        adcVar.c(adjVar3.a());
        adm admVar4 = new adm("dirty");
        admVar4.b(2);
        admVar4.e(1);
        admVar4.c(1);
        admVar4.d(0);
        adcVar.c(admVar4.a());
        adj adjVar4 = new adj("docVersion");
        adjVar4.b(2);
        adjVar4.c(0);
        adcVar.c(adjVar4.a());
        return adcVar.a();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ adu b(Object obj) {
        ActionPreferenceDocument actionPreferenceDocument = (ActionPreferenceDocument) obj;
        adt adtVar = new adt(actionPreferenceDocument.a, actionPreferenceDocument.b, "cpg:ActionPreference");
        String str = actionPreferenceDocument.c;
        if (str != null) {
            adtVar.b("identifier", str);
        }
        adtVar.j("identifierType", actionPreferenceDocument.d);
        adtVar.j("actionType", actionPreferenceDocument.e);
        String str2 = actionPreferenceDocument.f;
        if (str2 != null) {
            adtVar.b("dataOne", str2);
        }
        String str3 = actionPreferenceDocument.g;
        if (str3 != null) {
            adtVar.b("mimetype", str3);
        }
        adtVar.j("appType", actionPreferenceDocument.h);
        String str4 = actionPreferenceDocument.i;
        if (str4 != null) {
            adtVar.b("dirty", str4);
        }
        adtVar.j("docVersion", actionPreferenceDocument.j);
        return adtVar.e();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ Object c(adu aduVar, adr adrVar) {
        String l = aduVar.l();
        String k = aduVar.k();
        String[] t = aduVar.t("identifier");
        String str = null;
        String str2 = (t == null || t.length == 0) ? null : t[0];
        int c = (int) aduVar.c("identifierType");
        int c2 = (int) aduVar.c("actionType");
        String[] t2 = aduVar.t("dataOne");
        String str3 = (t2 == null || t2.length == 0) ? null : t2[0];
        String[] t3 = aduVar.t("mimetype");
        String str4 = (t3 == null || t3.length == 0) ? null : t3[0];
        int c3 = (int) aduVar.c("appType");
        String[] t4 = aduVar.t("dirty");
        if (t4 != null && t4.length != 0) {
            str = t4[0];
        }
        return new ActionPreferenceDocument(k, l, str2, c, c2, str3, str4, c3, str, aduVar.c("docVersion"));
    }

    @Override // defpackage.adp
    public final String d() {
        return "cpg:ActionPreference";
    }

    @Override // defpackage.adp
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}

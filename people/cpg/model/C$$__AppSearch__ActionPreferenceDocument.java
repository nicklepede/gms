package com.google.android.gms.people.cpg.model;

import defpackage.acx;
import defpackage.ade;
import defpackage.adh;
import defpackage.adj;
import defpackage.adk;
import defpackage.adm;
import defpackage.ado;
import defpackage.adp;
import java.util.Collections;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.people.cpg.model.$$__AppSearch__ActionPreferenceDocument, reason: invalid class name */
/* loaded from: classes6.dex */
public final class C$$__AppSearch__ActionPreferenceDocument implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("cpg:ActionPreference");
        adh adhVar = new adh("identifier");
        adhVar.b(2);
        adhVar.e(1);
        adhVar.c(2);
        adhVar.d(0);
        acxVar.c(adhVar.a());
        ade adeVar = new ade("identifierType");
        adeVar.b(2);
        adeVar.c(0);
        acxVar.c(adeVar.a());
        ade adeVar2 = new ade("actionType");
        adeVar2.b(2);
        adeVar2.c(0);
        acxVar.c(adeVar2.a());
        adh adhVar2 = new adh("dataOne");
        adhVar2.b(2);
        adhVar2.e(1);
        adhVar2.c(2);
        adhVar2.d(0);
        acxVar.c(adhVar2.a());
        adh adhVar3 = new adh("mimetype");
        adhVar3.b(2);
        adhVar3.e(1);
        adhVar3.c(2);
        adhVar3.d(0);
        acxVar.c(adhVar3.a());
        ade adeVar3 = new ade("appType");
        adeVar3.b(2);
        adeVar3.c(0);
        acxVar.c(adeVar3.a());
        adh adhVar4 = new adh("dirty");
        adhVar4.b(2);
        adhVar4.e(1);
        adhVar4.c(1);
        adhVar4.d(0);
        acxVar.c(adhVar4.a());
        ade adeVar4 = new ade("docVersion");
        adeVar4.b(2);
        adeVar4.c(0);
        acxVar.c(adeVar4.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        ActionPreferenceDocument actionPreferenceDocument = (ActionPreferenceDocument) obj;
        ado adoVar = new ado(actionPreferenceDocument.a, actionPreferenceDocument.b, "cpg:ActionPreference");
        String str = actionPreferenceDocument.c;
        if (str != null) {
            adoVar.b("identifier", str);
        }
        adoVar.j("identifierType", actionPreferenceDocument.d);
        adoVar.j("actionType", actionPreferenceDocument.e);
        String str2 = actionPreferenceDocument.f;
        if (str2 != null) {
            adoVar.b("dataOne", str2);
        }
        String str3 = actionPreferenceDocument.g;
        if (str3 != null) {
            adoVar.b("mimetype", str3);
        }
        adoVar.j("appType", actionPreferenceDocument.h);
        String str4 = actionPreferenceDocument.i;
        if (str4 != null) {
            adoVar.b("dirty", str4);
        }
        adoVar.j("docVersion", actionPreferenceDocument.j);
        return adoVar.e();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ Object c(adp adpVar, adm admVar) {
        String l = adpVar.l();
        String k = adpVar.k();
        String[] t = adpVar.t("identifier");
        String str = null;
        String str2 = (t == null || t.length == 0) ? null : t[0];
        int c = (int) adpVar.c("identifierType");
        int c2 = (int) adpVar.c("actionType");
        String[] t2 = adpVar.t("dataOne");
        String str3 = (t2 == null || t2.length == 0) ? null : t2[0];
        String[] t3 = adpVar.t("mimetype");
        String str4 = (t3 == null || t3.length == 0) ? null : t3[0];
        int c3 = (int) adpVar.c("appType");
        String[] t4 = adpVar.t("dirty");
        if (t4 != null && t4.length != 0) {
            str = t4[0];
        }
        return new ActionPreferenceDocument(k, l, str2, c, c2, str3, str4, c3, str, adpVar.c("docVersion"));
    }

    @Override // defpackage.adk
    public final String d() {
        return "cpg:ActionPreference";
    }

    @Override // defpackage.adk
    public final List e() {
        return Collections.EMPTY_LIST;
    }
}

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
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__NoteDigitalDocument, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__NoteDigitalDocument implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("NoteDigitalDocument");
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
        ada adaVar2 = new ada("isPartOf", "Conversation");
        adaVar2.c(2);
        adaVar2.a = false;
        adaVar2.d("id");
        acxVar.c(adaVar2.a());
        adh adhVar4 = new adh("text");
        adhVar4.b(2);
        adhVar4.e(1);
        adhVar4.c(2);
        adhVar4.d(0);
        acxVar.c(adhVar4.a());
        ada adaVar3 = new ada("author", "Person");
        adaVar3.c(2);
        adaVar3.a = false;
        adaVar3.d("email");
        adaVar3.d("name");
        acxVar.c(adaVar3.a());
        adh adhVar5 = new adh("annotationId");
        adhVar5.b(2);
        adhVar5.e(0);
        adhVar5.c(0);
        adhVar5.d(0);
        acxVar.c(adhVar5.a());
        adh adhVar6 = new adh("messageId");
        adhVar6.b(2);
        adhVar6.e(0);
        adhVar6.c(0);
        adhVar6.d(0);
        acxVar.c(adhVar6.a());
        adh adhVar7 = new adh("conversationId");
        adhVar7.b(2);
        adhVar7.e(0);
        adhVar7.c(0);
        adhVar7.d(0);
        acxVar.c(adhVar7.a());
        ade adeVar = new ade("dateCreated");
        adeVar.b(2);
        adeVar.c(0);
        acxVar.c(adeVar.a());
        ade adeVar2 = new ade("dateModified");
        adeVar2.b(2);
        adeVar2.c(0);
        acxVar.c(adeVar2.a());
        adh adhVar8 = new adh("annotations");
        adhVar8.b(1);
        adhVar8.e(0);
        adhVar8.c(0);
        adhVar8.d(0);
        acxVar.c(adhVar8.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        NoteDigitalDocument noteDigitalDocument = (NoteDigitalDocument) obj;
        ado adoVar = new ado(noteDigitalDocument.q, noteDigitalDocument.p, "NoteDigitalDocument");
        adoVar.b("name", noteDigitalDocument.r);
        List b = noteDigitalDocument.b();
        if (b != null) {
            adoVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = noteDigitalDocument.a();
        if (a != null) {
            adoVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adoVar.a("g3attrinfo", adp.e(noteDigitalDocument.s));
        Conversation conversation = ((DigitalDocument) noteDigitalDocument).a;
        if (conversation != null) {
            adoVar.a("isPartOf", adp.e(conversation));
        }
        adoVar.b("text", ((DigitalDocument) noteDigitalDocument).b);
        Person person = noteDigitalDocument.c;
        if (person != null) {
            adoVar.a("author", adp.e(person));
        }
        adoVar.b("annotationId", noteDigitalDocument.d);
        adoVar.b("messageId", noteDigitalDocument.e);
        adoVar.b("conversationId", noteDigitalDocument.f);
        adoVar.j("dateCreated", noteDigitalDocument.g);
        adoVar.j("dateModified", noteDigitalDocument.h);
        List list = noteDigitalDocument.i;
        if (list != null) {
            adoVar.b("annotations", (String[]) list.toArray(new String[0]));
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
        adp f2 = adpVar.f("isPartOf");
        Conversation conversation = f2 != null ? (Conversation) f2.j(Conversation.class, admVar) : null;
        String[] t4 = adpVar.t("text");
        String str2 = (t4 == null || t4.length == 0) ? null : t4[0];
        adp f3 = adpVar.f("author");
        Person person = f3 != null ? (Person) f3.j(Person.class, admVar) : null;
        String[] t5 = adpVar.t("annotationId");
        String str3 = (t5 == null || t5.length == 0) ? null : t5[0];
        String[] t6 = adpVar.t("messageId");
        String str4 = (t6 == null || t6.length == 0) ? null : t6[0];
        String[] t7 = adpVar.t("conversationId");
        String str5 = (t7 == null || t7.length == 0) ? null : t7[0];
        long c = adpVar.c("dateCreated");
        long c2 = adpVar.c("dateModified");
        String[] t8 = adpVar.t("annotations");
        return new NoteDigitalDocument(l, k, str, asList, asList2, conversation, str2, person, str3, str4, str5, c, c2, t8 != null ? Arrays.asList(t8) : null, g3AttributionInfo);
    }

    @Override // defpackage.adk
    public final String d() {
        return "NoteDigitalDocument";
    }

    @Override // defpackage.adk
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        arrayList.add(Conversation.class);
        arrayList.add(Person.class);
        return arrayList;
    }
}

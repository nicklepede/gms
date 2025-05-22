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
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__NoteDigitalDocument, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__NoteDigitalDocument implements adp {
    @Override // defpackage.adp
    public final ado a() {
        adc adcVar = new adc("NoteDigitalDocument");
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
        adf adfVar2 = new adf("isPartOf", "Conversation");
        adfVar2.c(2);
        adfVar2.a = false;
        adfVar2.d("id");
        adcVar.c(adfVar2.a());
        adm admVar4 = new adm("text");
        admVar4.b(2);
        admVar4.e(1);
        admVar4.c(2);
        admVar4.d(0);
        adcVar.c(admVar4.a());
        adf adfVar3 = new adf("author", "Person");
        adfVar3.c(2);
        adfVar3.a = false;
        adfVar3.d("email");
        adfVar3.d("name");
        adcVar.c(adfVar3.a());
        adm admVar5 = new adm("annotationId");
        admVar5.b(2);
        admVar5.e(0);
        admVar5.c(0);
        admVar5.d(0);
        adcVar.c(admVar5.a());
        adm admVar6 = new adm("messageId");
        admVar6.b(2);
        admVar6.e(0);
        admVar6.c(0);
        admVar6.d(0);
        adcVar.c(admVar6.a());
        adm admVar7 = new adm("conversationId");
        admVar7.b(2);
        admVar7.e(0);
        admVar7.c(0);
        admVar7.d(0);
        adcVar.c(admVar7.a());
        adj adjVar = new adj("dateCreated");
        adjVar.b(2);
        adjVar.c(0);
        adcVar.c(adjVar.a());
        adj adjVar2 = new adj("dateModified");
        adjVar2.b(2);
        adjVar2.c(0);
        adcVar.c(adjVar2.a());
        adm admVar8 = new adm("annotations");
        admVar8.b(1);
        admVar8.e(0);
        admVar8.c(0);
        admVar8.d(0);
        adcVar.c(admVar8.a());
        return adcVar.a();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ adu b(Object obj) {
        NoteDigitalDocument noteDigitalDocument = (NoteDigitalDocument) obj;
        adt adtVar = new adt(noteDigitalDocument.q, noteDigitalDocument.p, "NoteDigitalDocument");
        adtVar.b("name", noteDigitalDocument.r);
        List b = noteDigitalDocument.b();
        if (b != null) {
            adtVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = noteDigitalDocument.a();
        if (a != null) {
            adtVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adtVar.a("g3attrinfo", adu.e(noteDigitalDocument.s));
        Conversation conversation = ((DigitalDocument) noteDigitalDocument).a;
        if (conversation != null) {
            adtVar.a("isPartOf", adu.e(conversation));
        }
        adtVar.b("text", ((DigitalDocument) noteDigitalDocument).b);
        Person person = noteDigitalDocument.c;
        if (person != null) {
            adtVar.a("author", adu.e(person));
        }
        adtVar.b("annotationId", noteDigitalDocument.d);
        adtVar.b("messageId", noteDigitalDocument.e);
        adtVar.b("conversationId", noteDigitalDocument.f);
        adtVar.j("dateCreated", noteDigitalDocument.g);
        adtVar.j("dateModified", noteDigitalDocument.h);
        List list = noteDigitalDocument.i;
        if (list != null) {
            adtVar.b("annotations", (String[]) list.toArray(new String[0]));
        }
        return adtVar.e();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ Object c(adu aduVar, adr adrVar) {
        String k = aduVar.k();
        String l = aduVar.l();
        String[] t = aduVar.t("name");
        String str = (t == null || t.length == 0) ? null : t[0];
        String[] t2 = aduVar.t("keywords");
        List asList = t2 != null ? Arrays.asList(t2) : null;
        String[] t3 = aduVar.t("alternateName");
        List asList2 = t3 != null ? Arrays.asList(t3) : null;
        adu f = aduVar.f("g3attrinfo");
        G3AttributionInfo g3AttributionInfo = f != null ? (G3AttributionInfo) f.j(G3AttributionInfo.class, adrVar) : null;
        adu f2 = aduVar.f("isPartOf");
        Conversation conversation = f2 != null ? (Conversation) f2.j(Conversation.class, adrVar) : null;
        String[] t4 = aduVar.t("text");
        String str2 = (t4 == null || t4.length == 0) ? null : t4[0];
        adu f3 = aduVar.f("author");
        Person person = f3 != null ? (Person) f3.j(Person.class, adrVar) : null;
        String[] t5 = aduVar.t("annotationId");
        String str3 = (t5 == null || t5.length == 0) ? null : t5[0];
        String[] t6 = aduVar.t("messageId");
        String str4 = (t6 == null || t6.length == 0) ? null : t6[0];
        String[] t7 = aduVar.t("conversationId");
        String str5 = (t7 == null || t7.length == 0) ? null : t7[0];
        long c = aduVar.c("dateCreated");
        long c2 = aduVar.c("dateModified");
        String[] t8 = aduVar.t("annotations");
        return new NoteDigitalDocument(l, k, str, asList, asList2, conversation, str2, person, str3, str4, str5, c, c2, t8 != null ? Arrays.asList(t8) : null, g3AttributionInfo);
    }

    @Override // defpackage.adp
    public final String d() {
        return "NoteDigitalDocument";
    }

    @Override // defpackage.adp
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        arrayList.add(Conversation.class);
        arrayList.add(Person.class);
        return arrayList;
    }
}

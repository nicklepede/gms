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
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__Message, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__Message implements adp {
    @Override // defpackage.adp
    public final ado a() {
        adc adcVar = new adc("Message");
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
        adf adfVar2 = new adf("sender", "Person");
        adfVar2.c(2);
        adfVar2.a = false;
        adfVar2.d("email");
        adfVar2.d("name");
        adfVar2.d("telephone");
        adcVar.c(adfVar2.a());
        adf adfVar3 = new adf("recipient", "Person");
        adfVar3.c(2);
        adfVar3.a = false;
        adfVar3.d("email");
        adfVar3.d("name");
        adfVar3.d("telephone");
        adcVar.c(adfVar3.a());
        adm admVar4 = new adm("conversationId");
        admVar4.b(2);
        admVar4.e(0);
        admVar4.c(0);
        admVar4.d(1);
        adcVar.c(admVar4.a());
        adf adfVar4 = new adf("isPartOf", "Conversation");
        adfVar4.c(2);
        adfVar4.a = false;
        adfVar4.d("id");
        adcVar.c(adfVar4.a());
        adm admVar5 = new adm("text");
        admVar5.b(2);
        admVar5.e(1);
        admVar5.c(2);
        admVar5.d(0);
        adcVar.c(admVar5.a());
        adf adfVar5 = new adf("messageAttachment", "DigitalDocument");
        adfVar5.c(1);
        adfVar5.a = false;
        adfVar5.d("name");
        adcVar.c(adfVar5.a());
        adm admVar6 = new adm("labels");
        admVar6.b(1);
        admVar6.e(2);
        admVar6.c(1);
        admVar6.d(0);
        adcVar.c(admVar6.a());
        adj adjVar = new adj("dateReceived");
        adjVar.b(2);
        adjVar.c(1);
        adcVar.c(adjVar.a());
        adm admVar7 = new adm("image");
        admVar7.b(2);
        admVar7.e(2);
        admVar7.c(1);
        admVar7.d(0);
        adcVar.c(admVar7.a());
        adm admVar8 = new adm("participantId");
        admVar8.b(2);
        admVar8.e(0);
        admVar8.c(0);
        admVar8.d(1);
        adcVar.c(admVar8.a());
        return adcVar.a();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ adu b(Object obj) {
        Message message = (Message) obj;
        adt adtVar = new adt(message.q, message.p, "Message");
        adtVar.b("name", message.r);
        List b = message.b();
        if (b != null) {
            adtVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = message.a();
        if (a != null) {
            adtVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adtVar.a("g3attrinfo", adu.e(message.s));
        Person person = message.a;
        if (person != null) {
            adtVar.a("sender", adu.e(person));
        }
        Person person2 = message.b;
        if (person2 != null) {
            adtVar.a("recipient", adu.e(person2));
        }
        adtVar.b("conversationId", message.c);
        Conversation conversation = message.d;
        if (conversation != null) {
            adtVar.a("isPartOf", adu.e(conversation));
        }
        adtVar.b("text", message.e);
        List list = message.f;
        if (list != null) {
            adu[] aduVarArr = new adu[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                aduVarArr[i] = adu.e((DigitalDocument) it.next());
                i++;
            }
            adtVar.a("messageAttachment", aduVarArr);
        }
        List list2 = message.g;
        if (list2 != null) {
            adtVar.b("labels", (String[]) list2.toArray(new String[0]));
        }
        adtVar.j("dateReceived", message.h);
        adtVar.b("image", message.i);
        adtVar.b("participantId", message.j);
        return adtVar.e();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ Object c(adu aduVar, adr adrVar) {
        char c;
        ArrayList arrayList;
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
        adu f2 = aduVar.f("sender");
        Person person = f2 != null ? (Person) f2.j(Person.class, adrVar) : null;
        adu f3 = aduVar.f("recipient");
        Person person2 = f3 != null ? (Person) f3.j(Person.class, adrVar) : null;
        String[] t4 = aduVar.t("conversationId");
        String str2 = (t4 == null || t4.length == 0) ? null : t4[0];
        adu f4 = aduVar.f("isPartOf");
        Conversation conversation = f4 != null ? (Conversation) f4.j(Conversation.class, adrVar) : null;
        String[] t5 = aduVar.t("text");
        String str3 = (t5 == null || t5.length == 0) ? null : t5[0];
        adu[] s = aduVar.s("messageAttachment");
        if (s != null) {
            c = 0;
            arrayList = new ArrayList(s.length);
            int i = 0;
            while (i < s.length) {
                arrayList.add((DigitalDocument) s[i].j(DigitalDocument.class, adrVar));
                i++;
                k = k;
            }
        } else {
            c = 0;
            arrayList = null;
        }
        String str4 = k;
        String[] t6 = aduVar.t("labels");
        List asList3 = t6 != null ? Arrays.asList(t6) : null;
        long c2 = aduVar.c("dateReceived");
        String[] t7 = aduVar.t("image");
        String str5 = (t7 == null || t7.length == 0) ? null : t7[c];
        String[] t8 = aduVar.t("participantId");
        return new Message(l, str4, str, asList, asList2, person, person2, str2, conversation, str3, arrayList, asList3, c2, str5, (t8 == null || t8.length == 0) ? null : t8[c], g3AttributionInfo);
    }

    @Override // defpackage.adp
    public final String d() {
        return "Message";
    }

    @Override // defpackage.adp
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        arrayList.add(Person.class);
        arrayList.add(Conversation.class);
        arrayList.add(DigitalDocument.class);
        return arrayList;
    }
}

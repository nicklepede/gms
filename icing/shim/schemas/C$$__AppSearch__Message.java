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
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__Message, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__Message implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("Message");
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
        ada adaVar2 = new ada("sender", "Person");
        adaVar2.c(2);
        adaVar2.a = false;
        adaVar2.d("email");
        adaVar2.d("name");
        adaVar2.d("telephone");
        acxVar.c(adaVar2.a());
        ada adaVar3 = new ada("recipient", "Person");
        adaVar3.c(2);
        adaVar3.a = false;
        adaVar3.d("email");
        adaVar3.d("name");
        adaVar3.d("telephone");
        acxVar.c(adaVar3.a());
        adh adhVar4 = new adh("conversationId");
        adhVar4.b(2);
        adhVar4.e(0);
        adhVar4.c(0);
        adhVar4.d(1);
        acxVar.c(adhVar4.a());
        ada adaVar4 = new ada("isPartOf", "Conversation");
        adaVar4.c(2);
        adaVar4.a = false;
        adaVar4.d("id");
        acxVar.c(adaVar4.a());
        adh adhVar5 = new adh("text");
        adhVar5.b(2);
        adhVar5.e(1);
        adhVar5.c(2);
        adhVar5.d(0);
        acxVar.c(adhVar5.a());
        ada adaVar5 = new ada("messageAttachment", "DigitalDocument");
        adaVar5.c(1);
        adaVar5.a = false;
        adaVar5.d("name");
        acxVar.c(adaVar5.a());
        adh adhVar6 = new adh("labels");
        adhVar6.b(1);
        adhVar6.e(2);
        adhVar6.c(1);
        adhVar6.d(0);
        acxVar.c(adhVar6.a());
        ade adeVar = new ade("dateReceived");
        adeVar.b(2);
        adeVar.c(1);
        acxVar.c(adeVar.a());
        adh adhVar7 = new adh("image");
        adhVar7.b(2);
        adhVar7.e(2);
        adhVar7.c(1);
        adhVar7.d(0);
        acxVar.c(adhVar7.a());
        adh adhVar8 = new adh("participantId");
        adhVar8.b(2);
        adhVar8.e(0);
        adhVar8.c(0);
        adhVar8.d(1);
        acxVar.c(adhVar8.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        Message message = (Message) obj;
        ado adoVar = new ado(message.q, message.p, "Message");
        adoVar.b("name", message.r);
        List b = message.b();
        if (b != null) {
            adoVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = message.a();
        if (a != null) {
            adoVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adoVar.a("g3attrinfo", adp.e(message.s));
        Person person = message.a;
        if (person != null) {
            adoVar.a("sender", adp.e(person));
        }
        Person person2 = message.b;
        if (person2 != null) {
            adoVar.a("recipient", adp.e(person2));
        }
        adoVar.b("conversationId", message.c);
        Conversation conversation = message.d;
        if (conversation != null) {
            adoVar.a("isPartOf", adp.e(conversation));
        }
        adoVar.b("text", message.e);
        List list = message.f;
        if (list != null) {
            adp[] adpVarArr = new adp[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                adpVarArr[i] = adp.e((DigitalDocument) it.next());
                i++;
            }
            adoVar.a("messageAttachment", adpVarArr);
        }
        List list2 = message.g;
        if (list2 != null) {
            adoVar.b("labels", (String[]) list2.toArray(new String[0]));
        }
        adoVar.j("dateReceived", message.h);
        adoVar.b("image", message.i);
        adoVar.b("participantId", message.j);
        return adoVar.e();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ Object c(adp adpVar, adm admVar) {
        char c;
        ArrayList arrayList;
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
        adp f2 = adpVar.f("sender");
        Person person = f2 != null ? (Person) f2.j(Person.class, admVar) : null;
        adp f3 = adpVar.f("recipient");
        Person person2 = f3 != null ? (Person) f3.j(Person.class, admVar) : null;
        String[] t4 = adpVar.t("conversationId");
        String str2 = (t4 == null || t4.length == 0) ? null : t4[0];
        adp f4 = adpVar.f("isPartOf");
        Conversation conversation = f4 != null ? (Conversation) f4.j(Conversation.class, admVar) : null;
        String[] t5 = adpVar.t("text");
        String str3 = (t5 == null || t5.length == 0) ? null : t5[0];
        adp[] s = adpVar.s("messageAttachment");
        if (s != null) {
            c = 0;
            arrayList = new ArrayList(s.length);
            int i = 0;
            while (i < s.length) {
                arrayList.add((DigitalDocument) s[i].j(DigitalDocument.class, admVar));
                i++;
                k = k;
            }
        } else {
            c = 0;
            arrayList = null;
        }
        String str4 = k;
        String[] t6 = adpVar.t("labels");
        List asList3 = t6 != null ? Arrays.asList(t6) : null;
        long c2 = adpVar.c("dateReceived");
        String[] t7 = adpVar.t("image");
        String str5 = (t7 == null || t7.length == 0) ? null : t7[c];
        String[] t8 = adpVar.t("participantId");
        return new Message(l, str4, str, asList, asList2, person, person2, str2, conversation, str3, arrayList, asList3, c2, str5, (t8 == null || t8.length == 0) ? null : t8[c], g3AttributionInfo);
    }

    @Override // defpackage.adk
    public final String d() {
        return "Message";
    }

    @Override // defpackage.adk
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        arrayList.add(Person.class);
        arrayList.add(Conversation.class);
        arrayList.add(DigitalDocument.class);
        return arrayList;
    }
}

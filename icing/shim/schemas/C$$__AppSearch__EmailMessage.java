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
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__EmailMessage, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__EmailMessage implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("EmailMessage");
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
        adh adhVar4 = new adh("text");
        adhVar4.b(2);
        adhVar4.e(1);
        adhVar4.c(2);
        adhVar4.d(0);
        acxVar.c(adhVar4.a());
        ada adaVar2 = new ada("sender", "Person");
        adaVar2.c(2);
        adaVar2.a = false;
        adaVar2.d("email");
        adaVar2.d("name");
        acxVar.c(adaVar2.a());
        ada adaVar3 = new ada("recipient", "Person");
        adaVar3.c(1);
        adaVar3.a = false;
        adaVar3.d("email");
        adaVar3.d("name");
        acxVar.c(adaVar3.a());
        ada adaVar4 = new ada("cc", "Person");
        adaVar4.c(1);
        adaVar4.a = false;
        adaVar4.d("email");
        adaVar4.d("name");
        acxVar.c(adaVar4.a());
        ada adaVar5 = new ada("bcc", "Person");
        adaVar5.c(1);
        adaVar5.a = false;
        adaVar5.d("email");
        adaVar5.d("name");
        acxVar.c(adaVar5.a());
        ada adaVar6 = new ada("isPartOf", "Conversation");
        adaVar6.c(2);
        adaVar6.a = false;
        adaVar6.d("id");
        acxVar.c(adaVar6.a());
        ade adeVar = new ade("dateReceived");
        adeVar.b(2);
        adeVar.c(0);
        acxVar.c(adeVar.a());
        ada adaVar7 = new ada("messageAttachment", "DigitalDocument");
        adaVar7.c(1);
        adaVar7.a = false;
        adaVar7.d("name");
        acxVar.c(adaVar7.a());
        adh adhVar5 = new adh("labels");
        adhVar5.b(1);
        adhVar5.e(2);
        adhVar5.c(1);
        adhVar5.d(0);
        acxVar.c(adhVar5.a());
        ada adaVar8 = new ada("about", "ExtractedEntity");
        adaVar8.c(1);
        adaVar8.a = true;
        acxVar.c(adaVar8.a());
        adh adhVar6 = new adh("messageLabels");
        adhVar6.b(1);
        adhVar6.e(0);
        adhVar6.c(0);
        adhVar6.d(0);
        acxVar.c(adhVar6.a());
        adh adhVar7 = new adh("bodyHtml");
        adhVar7.b(2);
        adhVar7.e(0);
        adhVar7.c(0);
        adhVar7.d(0);
        acxVar.c(adhVar7.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        EmailMessage emailMessage = (EmailMessage) obj;
        ado adoVar = new ado(emailMessage.q, emailMessage.p, "EmailMessage");
        adoVar.b("name", emailMessage.r);
        List b = emailMessage.b();
        if (b != null) {
            adoVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = emailMessage.a();
        if (a != null) {
            adoVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adoVar.a("g3attrinfo", adp.e(emailMessage.s));
        adoVar.b("text", emailMessage.a);
        Person person = emailMessage.b;
        if (person != null) {
            adoVar.a("sender", adp.e(person));
        }
        List list = emailMessage.c;
        if (list != null) {
            adp[] adpVarArr = new adp[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                adpVarArr[i] = adp.e((Person) it.next());
                i++;
            }
            adoVar.a("recipient", adpVarArr);
        }
        List list2 = emailMessage.d;
        if (list2 != null) {
            adp[] adpVarArr2 = new adp[list2.size()];
            Iterator it2 = list2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                adpVarArr2[i2] = adp.e((Person) it2.next());
                i2++;
            }
            adoVar.a("cc", adpVarArr2);
        }
        List list3 = emailMessage.e;
        if (list3 != null) {
            adp[] adpVarArr3 = new adp[list3.size()];
            Iterator it3 = list3.iterator();
            int i3 = 0;
            while (it3.hasNext()) {
                adpVarArr3[i3] = adp.e((Person) it3.next());
                i3++;
            }
            adoVar.a("bcc", adpVarArr3);
        }
        Conversation conversation = emailMessage.f;
        if (conversation != null) {
            adoVar.a("isPartOf", adp.e(conversation));
        }
        adoVar.j("dateReceived", emailMessage.g);
        List list4 = emailMessage.h;
        if (list4 != null) {
            adp[] adpVarArr4 = new adp[list4.size()];
            Iterator it4 = list4.iterator();
            int i4 = 0;
            while (it4.hasNext()) {
                adpVarArr4[i4] = adp.e((DigitalDocument) it4.next());
                i4++;
            }
            adoVar.a("messageAttachment", adpVarArr4);
        }
        List list5 = emailMessage.i;
        if (list5 != null) {
            adoVar.b("labels", (String[]) list5.toArray(new String[0]));
        }
        List list6 = emailMessage.j;
        if (list6 != null) {
            adp[] adpVarArr5 = new adp[list6.size()];
            Iterator it5 = list6.iterator();
            int i5 = 0;
            while (it5.hasNext()) {
                adpVarArr5[i5] = adp.e((ExtractedEntity) it5.next());
                i5++;
            }
            adoVar.a("about", adpVarArr5);
        }
        List list7 = emailMessage.k;
        if (list7 != null) {
            adoVar.b("messageLabels", (String[]) list7.toArray(new String[0]));
        }
        adoVar.b("bodyHtml", emailMessage.l);
        return adoVar.e();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ Object c(adp adpVar, adm admVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        String str;
        String str2;
        String str3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        List list;
        ArrayList arrayList6;
        String k = adpVar.k();
        String l = adpVar.l();
        String[] t = adpVar.t("name");
        int i = 0;
        String str4 = (t == null || t.length == 0) ? null : t[0];
        String[] t2 = adpVar.t("keywords");
        List asList = t2 != null ? Arrays.asList(t2) : null;
        String[] t3 = adpVar.t("alternateName");
        List asList2 = t3 != null ? Arrays.asList(t3) : null;
        adp f = adpVar.f("g3attrinfo");
        G3AttributionInfo g3AttributionInfo = f != null ? (G3AttributionInfo) f.j(G3AttributionInfo.class, admVar) : null;
        String[] t4 = adpVar.t("text");
        String str5 = (t4 == null || t4.length == 0) ? null : t4[0];
        adp f2 = adpVar.f("sender");
        Person person = f2 != null ? (Person) f2.j(Person.class, admVar) : null;
        adp[] s = adpVar.s("recipient");
        if (s != null) {
            arrayList = new ArrayList(s.length);
            for (adp adpVar2 : s) {
                arrayList.add((Person) adpVar2.j(Person.class, admVar));
            }
        } else {
            arrayList = null;
        }
        adp[] s2 = adpVar.s("cc");
        if (s2 != null) {
            arrayList2 = new ArrayList(s2.length);
            int i2 = 0;
            while (i2 < s2.length) {
                arrayList2.add((Person) s2[i2].j(Person.class, admVar));
                i2++;
                i = i;
            }
        } else {
            arrayList2 = null;
        }
        int i3 = i;
        adp[] s3 = adpVar.s("bcc");
        if (s3 != null) {
            arrayList3 = new ArrayList(s3.length);
            for (int i4 = i3; i4 < s3.length; i4++) {
                arrayList3.add((Person) s3[i4].j(Person.class, admVar));
            }
        } else {
            arrayList3 = null;
        }
        adp f3 = adpVar.f("isPartOf");
        Conversation conversation = f3 != null ? (Conversation) f3.j(Conversation.class, admVar) : null;
        long c = adpVar.c("dateReceived");
        adp[] s4 = adpVar.s("messageAttachment");
        if (s4 != null) {
            str = k;
            str2 = l;
            arrayList4 = new ArrayList(s4.length);
            str3 = str4;
            for (int i5 = i3; i5 < s4.length; i5++) {
                arrayList4.add((DigitalDocument) s4[i5].j(DigitalDocument.class, admVar));
            }
        } else {
            str = k;
            str2 = l;
            str3 = str4;
            arrayList4 = null;
        }
        String[] t5 = adpVar.t("labels");
        List asList3 = t5 != null ? Arrays.asList(t5) : null;
        adp[] s5 = adpVar.s("about");
        if (s5 != null) {
            arrayList5 = arrayList4;
            arrayList6 = new ArrayList(s5.length);
            list = asList3;
            for (int i6 = i3; i6 < s5.length; i6++) {
                arrayList6.add((ExtractedEntity) s5[i6].j(ExtractedEntity.class, admVar));
            }
        } else {
            arrayList5 = arrayList4;
            list = asList3;
            arrayList6 = null;
        }
        String[] t6 = adpVar.t("messageLabels");
        List asList4 = t6 != null ? Arrays.asList(t6) : null;
        String[] t7 = adpVar.t("bodyHtml");
        return new EmailMessage(str2, str, str3, asList, asList2, str5, person, arrayList, arrayList2, arrayList3, conversation, c, arrayList5, list, arrayList6, asList4, (t7 == null || t7.length == 0) ? null : t7[i3], g3AttributionInfo);
    }

    @Override // defpackage.adk
    public final String d() {
        return "EmailMessage";
    }

    @Override // defpackage.adk
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        arrayList.add(Person.class);
        arrayList.add(Conversation.class);
        arrayList.add(DigitalDocument.class);
        arrayList.add(ExtractedEntity.class);
        return arrayList;
    }
}

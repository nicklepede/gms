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
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__EmailMessage, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__EmailMessage implements adp {
    @Override // defpackage.adp
    public final ado a() {
        adc adcVar = new adc("EmailMessage");
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
        adm admVar4 = new adm("text");
        admVar4.b(2);
        admVar4.e(1);
        admVar4.c(2);
        admVar4.d(0);
        adcVar.c(admVar4.a());
        adf adfVar2 = new adf("sender", "Person");
        adfVar2.c(2);
        adfVar2.a = false;
        adfVar2.d("email");
        adfVar2.d("name");
        adcVar.c(adfVar2.a());
        adf adfVar3 = new adf("recipient", "Person");
        adfVar3.c(1);
        adfVar3.a = false;
        adfVar3.d("email");
        adfVar3.d("name");
        adcVar.c(adfVar3.a());
        adf adfVar4 = new adf("cc", "Person");
        adfVar4.c(1);
        adfVar4.a = false;
        adfVar4.d("email");
        adfVar4.d("name");
        adcVar.c(adfVar4.a());
        adf adfVar5 = new adf("bcc", "Person");
        adfVar5.c(1);
        adfVar5.a = false;
        adfVar5.d("email");
        adfVar5.d("name");
        adcVar.c(adfVar5.a());
        adf adfVar6 = new adf("isPartOf", "Conversation");
        adfVar6.c(2);
        adfVar6.a = false;
        adfVar6.d("id");
        adcVar.c(adfVar6.a());
        adj adjVar = new adj("dateReceived");
        adjVar.b(2);
        adjVar.c(0);
        adcVar.c(adjVar.a());
        adf adfVar7 = new adf("messageAttachment", "DigitalDocument");
        adfVar7.c(1);
        adfVar7.a = false;
        adfVar7.d("name");
        adcVar.c(adfVar7.a());
        adm admVar5 = new adm("labels");
        admVar5.b(1);
        admVar5.e(2);
        admVar5.c(1);
        admVar5.d(0);
        adcVar.c(admVar5.a());
        adf adfVar8 = new adf("about", "ExtractedEntity");
        adfVar8.c(1);
        adfVar8.a = true;
        adcVar.c(adfVar8.a());
        adm admVar6 = new adm("messageLabels");
        admVar6.b(1);
        admVar6.e(0);
        admVar6.c(0);
        admVar6.d(0);
        adcVar.c(admVar6.a());
        adm admVar7 = new adm("bodyHtml");
        admVar7.b(2);
        admVar7.e(0);
        admVar7.c(0);
        admVar7.d(0);
        adcVar.c(admVar7.a());
        return adcVar.a();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ adu b(Object obj) {
        EmailMessage emailMessage = (EmailMessage) obj;
        adt adtVar = new adt(emailMessage.q, emailMessage.p, "EmailMessage");
        adtVar.b("name", emailMessage.r);
        List b = emailMessage.b();
        if (b != null) {
            adtVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = emailMessage.a();
        if (a != null) {
            adtVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adtVar.a("g3attrinfo", adu.e(emailMessage.s));
        adtVar.b("text", emailMessage.a);
        Person person = emailMessage.b;
        if (person != null) {
            adtVar.a("sender", adu.e(person));
        }
        List list = emailMessage.c;
        if (list != null) {
            adu[] aduVarArr = new adu[list.size()];
            Iterator it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                aduVarArr[i] = adu.e((Person) it.next());
                i++;
            }
            adtVar.a("recipient", aduVarArr);
        }
        List list2 = emailMessage.d;
        if (list2 != null) {
            adu[] aduVarArr2 = new adu[list2.size()];
            Iterator it2 = list2.iterator();
            int i2 = 0;
            while (it2.hasNext()) {
                aduVarArr2[i2] = adu.e((Person) it2.next());
                i2++;
            }
            adtVar.a("cc", aduVarArr2);
        }
        List list3 = emailMessage.e;
        if (list3 != null) {
            adu[] aduVarArr3 = new adu[list3.size()];
            Iterator it3 = list3.iterator();
            int i3 = 0;
            while (it3.hasNext()) {
                aduVarArr3[i3] = adu.e((Person) it3.next());
                i3++;
            }
            adtVar.a("bcc", aduVarArr3);
        }
        Conversation conversation = emailMessage.f;
        if (conversation != null) {
            adtVar.a("isPartOf", adu.e(conversation));
        }
        adtVar.j("dateReceived", emailMessage.g);
        List list4 = emailMessage.h;
        if (list4 != null) {
            adu[] aduVarArr4 = new adu[list4.size()];
            Iterator it4 = list4.iterator();
            int i4 = 0;
            while (it4.hasNext()) {
                aduVarArr4[i4] = adu.e((DigitalDocument) it4.next());
                i4++;
            }
            adtVar.a("messageAttachment", aduVarArr4);
        }
        List list5 = emailMessage.i;
        if (list5 != null) {
            adtVar.b("labels", (String[]) list5.toArray(new String[0]));
        }
        List list6 = emailMessage.j;
        if (list6 != null) {
            adu[] aduVarArr5 = new adu[list6.size()];
            Iterator it5 = list6.iterator();
            int i5 = 0;
            while (it5.hasNext()) {
                aduVarArr5[i5] = adu.e((ExtractedEntity) it5.next());
                i5++;
            }
            adtVar.a("about", aduVarArr5);
        }
        List list7 = emailMessage.k;
        if (list7 != null) {
            adtVar.b("messageLabels", (String[]) list7.toArray(new String[0]));
        }
        adtVar.b("bodyHtml", emailMessage.l);
        return adtVar.e();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ Object c(adu aduVar, adr adrVar) {
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
        String k = aduVar.k();
        String l = aduVar.l();
        String[] t = aduVar.t("name");
        int i = 0;
        String str4 = (t == null || t.length == 0) ? null : t[0];
        String[] t2 = aduVar.t("keywords");
        List asList = t2 != null ? Arrays.asList(t2) : null;
        String[] t3 = aduVar.t("alternateName");
        List asList2 = t3 != null ? Arrays.asList(t3) : null;
        adu f = aduVar.f("g3attrinfo");
        G3AttributionInfo g3AttributionInfo = f != null ? (G3AttributionInfo) f.j(G3AttributionInfo.class, adrVar) : null;
        String[] t4 = aduVar.t("text");
        String str5 = (t4 == null || t4.length == 0) ? null : t4[0];
        adu f2 = aduVar.f("sender");
        Person person = f2 != null ? (Person) f2.j(Person.class, adrVar) : null;
        adu[] s = aduVar.s("recipient");
        if (s != null) {
            arrayList = new ArrayList(s.length);
            for (adu aduVar2 : s) {
                arrayList.add((Person) aduVar2.j(Person.class, adrVar));
            }
        } else {
            arrayList = null;
        }
        adu[] s2 = aduVar.s("cc");
        if (s2 != null) {
            arrayList2 = new ArrayList(s2.length);
            int i2 = 0;
            while (i2 < s2.length) {
                arrayList2.add((Person) s2[i2].j(Person.class, adrVar));
                i2++;
                i = i;
            }
        } else {
            arrayList2 = null;
        }
        int i3 = i;
        adu[] s3 = aduVar.s("bcc");
        if (s3 != null) {
            arrayList3 = new ArrayList(s3.length);
            for (int i4 = i3; i4 < s3.length; i4++) {
                arrayList3.add((Person) s3[i4].j(Person.class, adrVar));
            }
        } else {
            arrayList3 = null;
        }
        adu f3 = aduVar.f("isPartOf");
        Conversation conversation = f3 != null ? (Conversation) f3.j(Conversation.class, adrVar) : null;
        long c = aduVar.c("dateReceived");
        adu[] s4 = aduVar.s("messageAttachment");
        if (s4 != null) {
            str = k;
            str2 = l;
            arrayList4 = new ArrayList(s4.length);
            str3 = str4;
            for (int i5 = i3; i5 < s4.length; i5++) {
                arrayList4.add((DigitalDocument) s4[i5].j(DigitalDocument.class, adrVar));
            }
        } else {
            str = k;
            str2 = l;
            str3 = str4;
            arrayList4 = null;
        }
        String[] t5 = aduVar.t("labels");
        List asList3 = t5 != null ? Arrays.asList(t5) : null;
        adu[] s5 = aduVar.s("about");
        if (s5 != null) {
            arrayList5 = arrayList4;
            arrayList6 = new ArrayList(s5.length);
            list = asList3;
            for (int i6 = i3; i6 < s5.length; i6++) {
                arrayList6.add((ExtractedEntity) s5[i6].j(ExtractedEntity.class, adrVar));
            }
        } else {
            arrayList5 = arrayList4;
            list = asList3;
            arrayList6 = null;
        }
        String[] t6 = aduVar.t("messageLabels");
        List asList4 = t6 != null ? Arrays.asList(t6) : null;
        String[] t7 = aduVar.t("bodyHtml");
        return new EmailMessage(str2, str, str3, asList, asList2, str5, person, arrayList, arrayList2, arrayList3, conversation, c, arrayList5, list, arrayList6, asList4, (t7 == null || t7.length == 0) ? null : t7[i3], g3AttributionInfo);
    }

    @Override // defpackage.adp
    public final String d() {
        return "EmailMessage";
    }

    @Override // defpackage.adp
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

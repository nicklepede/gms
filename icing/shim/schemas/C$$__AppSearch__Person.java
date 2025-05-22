package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.ada;
import defpackage.adc;
import defpackage.adf;
import defpackage.adm;
import defpackage.ado;
import defpackage.adp;
import defpackage.adt;
import defpackage.adu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__Person, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__Person implements adp {
    @Override // defpackage.adp
    public final ado a() {
        adc adcVar = new adc("Person");
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
        adm admVar4 = new adm("email");
        admVar4.b(2);
        admVar4.e(3);
        admVar4.c(2);
        admVar4.d(0);
        adcVar.c(admVar4.a());
        adm admVar5 = new adm("additionalName");
        admVar5.b(1);
        admVar5.e(1);
        admVar5.c(2);
        admVar5.d(0);
        adcVar.c(admVar5.a());
        adf adfVar2 = new adf("contactPoint", "ContactPoint");
        adfVar2.c(1);
        adfVar2.a = false;
        adfVar2.d("address");
        adfVar2.d("email");
        adfVar2.d("telephone");
        adcVar.c(adfVar2.a());
        adm admVar6 = new adm("identifier");
        admVar6.b(2);
        admVar6.e(2);
        admVar6.c(1);
        admVar6.d(0);
        adcVar.c(admVar6.a());
        adm admVar7 = new adm("image");
        admVar7.b(2);
        admVar7.e(0);
        admVar7.c(0);
        admVar7.d(0);
        adcVar.c(admVar7.a());
        adm admVar8 = new adm("givenName");
        admVar8.b(2);
        admVar8.e(0);
        admVar8.c(0);
        admVar8.d(0);
        adcVar.c(admVar8.a());
        adm admVar9 = new adm("middleName");
        admVar9.b(2);
        admVar9.e(0);
        admVar9.c(0);
        admVar9.d(0);
        adcVar.c(admVar9.a());
        adm admVar10 = new adm("familyName");
        admVar10.b(2);
        admVar10.e(0);
        admVar10.c(0);
        admVar10.d(0);
        adcVar.c(admVar10.a());
        adm admVar11 = new adm("organization");
        admVar11.b(2);
        admVar11.e(0);
        admVar11.c(0);
        admVar11.d(0);
        adcVar.c(admVar11.a());
        adm admVar12 = new adm("note");
        admVar12.b(2);
        admVar12.e(0);
        admVar12.c(0);
        admVar12.d(0);
        adcVar.c(admVar12.a());
        ada adaVar = new ada("isStarred");
        adaVar.b(2);
        adcVar.c(adaVar.a());
        adm admVar13 = new adm("telephone");
        admVar13.b(2);
        admVar13.e(0);
        admVar13.c(0);
        admVar13.d(0);
        adcVar.c(admVar13.a());
        adm admVar14 = new adm("participantId");
        admVar14.b(2);
        admVar14.e(0);
        admVar14.c(0);
        admVar14.d(0);
        adcVar.c(admVar14.a());
        adm admVar15 = new adm("normalizedDestination");
        admVar15.b(2);
        admVar15.e(0);
        admVar15.c(0);
        admVar15.d(0);
        adcVar.c(admVar15.a());
        adm admVar16 = new adm("lookupKey");
        admVar16.b(2);
        admVar16.e(0);
        admVar16.c(0);
        admVar16.d(0);
        adcVar.c(admVar16.a());
        return adcVar.a();
    }

    @Override // defpackage.adp
    public final /* bridge */ /* synthetic */ adu b(Object obj) {
        Person person = (Person) obj;
        adt adtVar = new adt(person.q, person.p, "Person");
        adtVar.b("name", person.r);
        List b = person.b();
        if (b != null) {
            adtVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = person.a();
        if (a != null) {
            adtVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adtVar.a("g3attrinfo", adu.e(person.s));
        adtVar.b("email", person.a);
        List list = person.b;
        if (list != null) {
            adtVar.b("additionalName", (String[]) list.toArray(new String[0]));
        }
        List list2 = person.c;
        if (list2 != null) {
            adu[] aduVarArr = new adu[list2.size()];
            Iterator it = list2.iterator();
            int i = 0;
            while (it.hasNext()) {
                aduVarArr[i] = adu.e((ContactPoint) it.next());
                i++;
            }
            adtVar.a("contactPoint", aduVarArr);
        }
        adtVar.b("identifier", person.d);
        adtVar.b("image", person.e);
        adtVar.b("givenName", person.f);
        adtVar.b("middleName", person.g);
        adtVar.b("familyName", person.h);
        adtVar.b("organization", person.i);
        adtVar.b("note", person.j);
        adtVar.g("isStarred", person.k);
        adtVar.b("telephone", person.l);
        adtVar.b("participantId", person.m);
        adtVar.b("normalizedDestination", person.n);
        adtVar.b("lookupKey", person.o);
        return adtVar.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0142  */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6 */
    @Override // defpackage.adp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object c(defpackage.adu r24, defpackage.adr r25) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.shim.schemas.C$$__AppSearch__Person.c(adu, adr):java.lang.Object");
    }

    @Override // defpackage.adp
    public final String d() {
        return "Person";
    }

    @Override // defpackage.adp
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        arrayList.add(ContactPoint.class);
        return arrayList;
    }
}

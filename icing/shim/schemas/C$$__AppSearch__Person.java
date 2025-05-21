package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.acv;
import defpackage.acx;
import defpackage.ada;
import defpackage.adh;
import defpackage.adj;
import defpackage.adk;
import defpackage.ado;
import defpackage.adp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* renamed from: com.google.android.gms.icing.shim.schemas.$$__AppSearch__Person, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C$$__AppSearch__Person implements adk {
    @Override // defpackage.adk
    public final adj a() {
        acx acxVar = new acx("Person");
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
        adh adhVar4 = new adh("email");
        adhVar4.b(2);
        adhVar4.e(3);
        adhVar4.c(2);
        adhVar4.d(0);
        acxVar.c(adhVar4.a());
        adh adhVar5 = new adh("additionalName");
        adhVar5.b(1);
        adhVar5.e(1);
        adhVar5.c(2);
        adhVar5.d(0);
        acxVar.c(adhVar5.a());
        ada adaVar2 = new ada("contactPoint", "ContactPoint");
        adaVar2.c(1);
        adaVar2.a = false;
        adaVar2.d("address");
        adaVar2.d("email");
        adaVar2.d("telephone");
        acxVar.c(adaVar2.a());
        adh adhVar6 = new adh("identifier");
        adhVar6.b(2);
        adhVar6.e(2);
        adhVar6.c(1);
        adhVar6.d(0);
        acxVar.c(adhVar6.a());
        adh adhVar7 = new adh("image");
        adhVar7.b(2);
        adhVar7.e(0);
        adhVar7.c(0);
        adhVar7.d(0);
        acxVar.c(adhVar7.a());
        adh adhVar8 = new adh("givenName");
        adhVar8.b(2);
        adhVar8.e(0);
        adhVar8.c(0);
        adhVar8.d(0);
        acxVar.c(adhVar8.a());
        adh adhVar9 = new adh("middleName");
        adhVar9.b(2);
        adhVar9.e(0);
        adhVar9.c(0);
        adhVar9.d(0);
        acxVar.c(adhVar9.a());
        adh adhVar10 = new adh("familyName");
        adhVar10.b(2);
        adhVar10.e(0);
        adhVar10.c(0);
        adhVar10.d(0);
        acxVar.c(adhVar10.a());
        adh adhVar11 = new adh("organization");
        adhVar11.b(2);
        adhVar11.e(0);
        adhVar11.c(0);
        adhVar11.d(0);
        acxVar.c(adhVar11.a());
        adh adhVar12 = new adh("note");
        adhVar12.b(2);
        adhVar12.e(0);
        adhVar12.c(0);
        adhVar12.d(0);
        acxVar.c(adhVar12.a());
        acv acvVar = new acv("isStarred");
        acvVar.b(2);
        acxVar.c(acvVar.a());
        adh adhVar13 = new adh("telephone");
        adhVar13.b(2);
        adhVar13.e(0);
        adhVar13.c(0);
        adhVar13.d(0);
        acxVar.c(adhVar13.a());
        adh adhVar14 = new adh("participantId");
        adhVar14.b(2);
        adhVar14.e(0);
        adhVar14.c(0);
        adhVar14.d(0);
        acxVar.c(adhVar14.a());
        adh adhVar15 = new adh("normalizedDestination");
        adhVar15.b(2);
        adhVar15.e(0);
        adhVar15.c(0);
        adhVar15.d(0);
        acxVar.c(adhVar15.a());
        adh adhVar16 = new adh("lookupKey");
        adhVar16.b(2);
        adhVar16.e(0);
        adhVar16.c(0);
        adhVar16.d(0);
        acxVar.c(adhVar16.a());
        return acxVar.a();
    }

    @Override // defpackage.adk
    public final /* bridge */ /* synthetic */ adp b(Object obj) {
        Person person = (Person) obj;
        ado adoVar = new ado(person.q, person.p, "Person");
        adoVar.b("name", person.r);
        List b = person.b();
        if (b != null) {
            adoVar.b("keywords", (String[]) b.toArray(new String[0]));
        }
        List a = person.a();
        if (a != null) {
            adoVar.b("alternateName", (String[]) a.toArray(new String[0]));
        }
        adoVar.a("g3attrinfo", adp.e(person.s));
        adoVar.b("email", person.a);
        List list = person.b;
        if (list != null) {
            adoVar.b("additionalName", (String[]) list.toArray(new String[0]));
        }
        List list2 = person.c;
        if (list2 != null) {
            adp[] adpVarArr = new adp[list2.size()];
            Iterator it = list2.iterator();
            int i = 0;
            while (it.hasNext()) {
                adpVarArr[i] = adp.e((ContactPoint) it.next());
                i++;
            }
            adoVar.a("contactPoint", adpVarArr);
        }
        adoVar.b("identifier", person.d);
        adoVar.b("image", person.e);
        adoVar.b("givenName", person.f);
        adoVar.b("middleName", person.g);
        adoVar.b("familyName", person.h);
        adoVar.b("organization", person.i);
        adoVar.b("note", person.j);
        adoVar.g("isStarred", person.k);
        adoVar.b("telephone", person.l);
        adoVar.b("participantId", person.m);
        adoVar.b("normalizedDestination", person.n);
        adoVar.b("lookupKey", person.o);
        return adoVar.e();
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
    @Override // defpackage.adk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ java.lang.Object c(defpackage.adp r24, defpackage.adm r25) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.icing.shim.schemas.C$$__AppSearch__Person.c(adp, adm):java.lang.Object");
    }

    @Override // defpackage.adk
    public final String d() {
        return "Person";
    }

    @Override // defpackage.adk
    public final List e() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(G3AttributionInfo.class);
        arrayList.add(ContactPoint.class);
        return arrayList;
    }
}

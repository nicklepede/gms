package com.google.android.gms.icing.shim.schemas;

import com.google.android.libraries.mdi.search.g3appsearch.app.G3AttributionInfo;
import defpackage.ekvk;
import defpackage.elgo;
import defpackage.elpg;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class Person extends Thing {
    public final String a;
    public final List b;
    public final List c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final String l;
    public final String m;
    public final String n;
    public final String o;

    public Person(String str, String str2, String str3, List list, List list2, String str4, List list3, List list4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, boolean z, String str12, String str13, String str14, String str15, G3AttributionInfo g3AttributionInfo) {
        super(str, str2, str3, list, list2, g3AttributionInfo);
        List list5;
        List list6;
        this.a = ekvk.b(str4);
        if (list3 != null) {
            list5 = DesugarCollections.unmodifiableList(list3);
        } else {
            int i = elgo.d;
            list5 = elpg.a;
        }
        this.b = list5;
        if (list4 != null) {
            list6 = DesugarCollections.unmodifiableList(list4);
        } else {
            int i2 = elgo.d;
            list6 = elpg.a;
        }
        this.c = list6;
        this.d = ekvk.b(str5);
        this.e = ekvk.b(str6);
        this.f = ekvk.b(str7);
        this.g = ekvk.b(str8);
        this.h = ekvk.b(str9);
        this.i = ekvk.b(str10);
        this.j = ekvk.b(str11);
        this.k = z;
        this.l = ekvk.b(str12);
        this.m = ekvk.b(str13);
        this.n = ekvk.b(str14);
        this.o = ekvk.b(str15);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final boolean equals(Object obj) {
        if (!(obj instanceof Person) || !super.equals(obj)) {
            return false;
        }
        Person person = (Person) obj;
        return this.k == person.k && Objects.equals(this.a, person.a) && Objects.equals(this.b, person.b) && Objects.equals(this.c, person.c) && Objects.equals(this.d, person.d) && Objects.equals(this.e, person.e) && Objects.equals(this.f, person.f) && Objects.equals(this.g, person.g) && Objects.equals(this.h, person.h) && Objects.equals(this.i, person.i) && Objects.equals(this.j, person.j) && Objects.equals(this.l, person.l) && Objects.equals(this.m, person.m) && Objects.equals(this.n, person.n) && Objects.equals(this.o, person.o);
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Boolean.valueOf(this.k), this.l, this.m, this.n, this.o, Integer.valueOf(super.hashCode()));
    }

    @Override // com.google.android.gms.icing.shim.schemas.Thing
    public final String toString() {
        List list = this.c;
        List list2 = this.b;
        return "Person{'" + super.toString() + "', email='" + this.a + "', additionalNames=" + String.valueOf(list2) + ", contactPoints=" + String.valueOf(list) + ", identifier='" + this.d + "', image='" + this.e + "', givenName='" + this.f + "', middleName='" + this.g + "', familyName='" + this.h + "', organization='" + this.i + "', note='" + this.j + "', isStarred=" + this.k + "', telephone=" + this.l + "', participantId=" + this.m + "', normalizedDestination=" + this.n + "', lookupKey=" + this.o + "'}";
    }
}

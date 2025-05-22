package com.google.android.gms.people.protomodel;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.cwpr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PersonEntity extends AbstractSafeParcelable implements Person {
    public static final Parcelable.Creator CREATOR = new cwpr();
    public final String a;
    private final List b;
    private final List c;
    private final List d;
    private final List e;
    private final List f;
    private final List g;
    private List h;
    private List i;
    private List j;
    private List k;
    private List l;
    private List m;

    public PersonEntity(String str, List list, List list2, List list3, List list4, List list5, List list6) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final String a() {
        return this.a;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List b() {
        List list;
        if (this.m == null && (list = this.g) != null) {
            this.m = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.m.add((Photo) it.next());
            }
        }
        return this.m;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List c() {
        List list;
        if (this.l == null && (list = this.f) != null) {
            this.l = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.l.add((Birthday) it.next());
            }
        }
        return this.l;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List d() {
        List list;
        if (this.j == null && (list = this.d) != null) {
            this.j = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.j.add((Email) it.next());
            }
        }
        return this.j;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List e() {
        List list;
        if (this.h == null && (list = this.b) != null) {
            this.h = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.h.add((Name) it.next());
            }
        }
        return this.h;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Person person = (Person) obj;
        return atyq.b(a(), person.a()) && atyq.b(e(), person.e()) && atyq.b(g(), person.g()) && atyq.b(d(), person.d()) && atyq.b(f(), person.f()) && atyq.b(c(), person.c()) && atyq.b(b(), person.b());
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List f() {
        List list;
        if (this.k == null && (list = this.e) != null) {
            this.k = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.k.add((Phone) it.next());
            }
        }
        return this.k;
    }

    @Override // com.google.android.gms.people.protomodel.Person
    public final List g() {
        List list;
        if (this.i == null && (list = this.c) != null) {
            this.i = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.i.add((Photo) it.next());
            }
        }
        return this.i;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{a(), e(), g(), d(), f(), c(), b()});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 2, str, false);
        atzr.y(parcel, 4, e(), false);
        atzr.y(parcel, 5, g(), false);
        atzr.y(parcel, 9, c(), false);
        atzr.y(parcel, 11, d(), false);
        atzr.y(parcel, 13, f(), false);
        atzr.y(parcel, 148, b(), false);
        atzr.c(parcel, a);
    }

    public PersonEntity(List list, List list2, List list3, List list4, List list5) {
        this.a = null;
        this.h = list;
        if (list != null) {
            this.b = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                this.b.add((NameEntity) ((Name) it.next()));
            }
        } else {
            this.b = null;
        }
        this.i = list2;
        if (list2 != null) {
            this.c = new ArrayList(list2.size());
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                this.c.add((PhotoEntity) ((Photo) it2.next()));
            }
        } else {
            this.c = null;
        }
        this.j = list3;
        if (list3 != null) {
            this.d = new ArrayList(list3.size());
            Iterator it3 = list3.iterator();
            while (it3.hasNext()) {
                this.d.add((EmailEntity) ((Email) it3.next()));
            }
        } else {
            this.d = null;
        }
        this.k = list4;
        if (list4 != null) {
            this.e = new ArrayList(list4.size());
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                this.e.add((PhoneEntity) ((Phone) it4.next()));
            }
        } else {
            this.e = null;
        }
        this.l = list5;
        if (list5 != null) {
            this.f = new ArrayList(list5.size());
            Iterator it5 = list5.iterator();
            while (it5.hasNext()) {
                this.f.add((BirthdayEntity) ((Birthday) it5.next()));
            }
        } else {
            this.f = null;
        }
        this.m = null;
        this.g = null;
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}

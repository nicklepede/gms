package com.google.android.gms.plus.service.v2whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.cwjs;
import defpackage.cwjt;
import defpackage.cwju;
import defpackage.cwjv;
import defpackage.cwjw;
import defpackage.cwjx;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class Mergedpeoplefieldacl extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new cwjs();
    private static final HashMap d;
    final Set a;
    List b;
    List c;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class Entries extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cwjt();
        private static final HashMap d;
        final Set a;
        String b;
        Scope c;

        /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
        public final class Scope extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new cwju();
            private static final HashMap f;
            final Set a;
            boolean b;
            boolean c;
            Membership d;
            Person e;

            /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
            public final class Membership extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new cwjv();
                private static final HashMap c;
                final Set a;
                Circle b;

                /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
                public final class Circle extends FastSafeParcelableJsonResponse {
                    public static final Parcelable.Creator CREATOR = new cwjw();
                    private static final HashMap d;
                    final Set a;
                    String b;
                    String c;

                    static {
                        HashMap hashMap = new HashMap();
                        d = hashMap;
                        hashMap.put("circleId", new FastJsonResponse$Field(7, false, 7, false, "circleId", 2, null));
                        hashMap.put("circleSet", new FastJsonResponse$Field(7, false, 7, false, "circleSet", 3, null));
                    }

                    public Circle(Set set, String str, String str2) {
                        this.a = set;
                        this.b = str;
                        this.c = str2;
                    }

                    @Override // defpackage.ashs
                    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
                        int i = fastJsonResponse$Field.g;
                        if (i == 2) {
                            return this.b;
                        }
                        if (i == 3) {
                            return this.c;
                        }
                        throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
                    }

                    @Override // defpackage.ashs
                    public final /* synthetic */ Map b() {
                        return d;
                    }

                    @Override // defpackage.ashs
                    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
                        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                    }

                    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
                    public final boolean equals(Object obj) {
                        if (!(obj instanceof Circle)) {
                            return false;
                        }
                        if (this == obj) {
                            return true;
                        }
                        Circle circle = (Circle) obj;
                        for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                            if (e(fastJsonResponse$Field)) {
                                if (!circle.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(circle.a(fastJsonResponse$Field))) {
                                    return false;
                                }
                            } else if (circle.e(fastJsonResponse$Field)) {
                                return false;
                            }
                        }
                        return true;
                    }

                    @Override // defpackage.ashs
                    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                        int i = fastJsonResponse$Field.g;
                        if (i == 2) {
                            this.b = str2;
                        } else {
                            if (i != 3) {
                                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                            }
                            this.c = str2;
                        }
                        this.a.add(Integer.valueOf(i));
                    }

                    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
                    public final int hashCode() {
                        int i = 0;
                        for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                            if (e(fastJsonResponse$Field)) {
                                i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                            }
                        }
                        return i;
                    }

                    @Override // android.os.Parcelable
                    public final void writeToParcel(Parcel parcel, int i) {
                        Set set = this.a;
                        int a = arxc.a(parcel);
                        if (set.contains(2)) {
                            arxc.v(parcel, 2, this.b, true);
                        }
                        if (set.contains(3)) {
                            arxc.v(parcel, 3, this.c, true);
                        }
                        arxc.c(parcel, a);
                    }

                    public Circle() {
                        this.a = new HashSet();
                    }
                }

                static {
                    HashMap hashMap = new HashMap();
                    c = hashMap;
                    hashMap.put("circle", new FastJsonResponse$Field(11, false, 11, false, "circle", 2, Circle.class));
                }

                public Membership(Set set, Circle circle) {
                    this.a = set;
                    this.b = circle;
                }

                @Override // defpackage.ashs
                protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        return this.b;
                    }
                    throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
                }

                @Override // defpackage.ashs
                public final /* synthetic */ Map b() {
                    return c;
                }

                @Override // defpackage.ashs
                protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                }

                @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
                public final boolean equals(Object obj) {
                    if (!(obj instanceof Membership)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    Membership membership = (Membership) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                        if (e(fastJsonResponse$Field)) {
                            if (!membership.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(membership.a(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (membership.e(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // defpackage.ashs
                public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
                    int i = fastJsonResponse$Field.g;
                    if (i != 2) {
                        throw new IllegalArgumentException(a.ag(i, ashsVar, " is not a known custom type.  Found "));
                    }
                    this.b = (Circle) ashsVar;
                    this.a.add(Integer.valueOf(i));
                }

                @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                        if (e(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    Set set = this.a;
                    int a = arxc.a(parcel);
                    if (set.contains(2)) {
                        arxc.t(parcel, 2, this.b, i, true);
                    }
                    arxc.c(parcel, a);
                }

                public Membership() {
                    this.a = new HashSet();
                }
            }

            /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
            public final class Person extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new cwjx();
                private static final HashMap c;
                final Set a;
                String b;

                static {
                    HashMap hashMap = new HashMap();
                    c = hashMap;
                    hashMap.put("personId", new FastJsonResponse$Field(7, false, 7, false, "personId", 2, null));
                }

                public Person(Set set, String str) {
                    this.a = set;
                    this.b = str;
                }

                @Override // defpackage.ashs
                protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        return this.b;
                    }
                    throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
                }

                @Override // defpackage.ashs
                public final /* synthetic */ Map b() {
                    return c;
                }

                @Override // defpackage.ashs
                protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                }

                @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
                public final boolean equals(Object obj) {
                    if (!(obj instanceof Person)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    Person person = (Person) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                        if (e(fastJsonResponse$Field)) {
                            if (!person.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(person.a(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (person.e(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // defpackage.ashs
                protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.g;
                    if (i != 2) {
                        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                    }
                    this.b = str2;
                    this.a.add(Integer.valueOf(i));
                }

                @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                        if (e(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    Set set = this.a;
                    int a = arxc.a(parcel);
                    if (set.contains(2)) {
                        arxc.v(parcel, 2, this.b, true);
                    }
                    arxc.c(parcel, a);
                }

                public Person() {
                    this.a = new HashSet();
                }
            }

            static {
                HashMap hashMap = new HashMap();
                f = hashMap;
                hashMap.put("allUsers", new FastJsonResponse$Field(6, false, 6, false, "allUsers", 2, null));
                hashMap.put("domainUsers", new FastJsonResponse$Field(6, false, 6, false, "domainUsers", 3, null));
                hashMap.put("membership", new FastJsonResponse$Field(11, false, 11, false, "membership", 4, Membership.class));
                hashMap.put("person", new FastJsonResponse$Field(11, false, 11, false, "person", 5, Person.class));
            }

            public Scope(Set set, boolean z, boolean z2, Membership membership, Person person) {
                this.a = set;
                this.b = z;
                this.c = z2;
                this.d = membership;
                this.e = person;
            }

            @Override // defpackage.ashs
            protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    return Boolean.valueOf(this.b);
                }
                if (i == 3) {
                    return Boolean.valueOf(this.c);
                }
                if (i == 4) {
                    return this.d;
                }
                if (i == 5) {
                    return this.e;
                }
                throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
            }

            @Override // defpackage.ashs
            public final /* synthetic */ Map b() {
                return f;
            }

            @Override // defpackage.ashs
            protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
            }

            @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
            public final boolean equals(Object obj) {
                if (!(obj instanceof Scope)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                Scope scope = (Scope) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (e(fastJsonResponse$Field)) {
                        if (!scope.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(scope.a(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (scope.e(fastJsonResponse$Field)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // defpackage.ashs
            protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    this.b = z;
                } else {
                    if (i != 3) {
                        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
                    }
                    this.c = z;
                }
                this.a.add(Integer.valueOf(i));
            }

            @Override // defpackage.ashs
            public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
                int i = fastJsonResponse$Field.g;
                if (i == 4) {
                    this.d = (Membership) ashsVar;
                } else {
                    if (i != 5) {
                        throw new IllegalArgumentException(a.ag(i, ashsVar, " is not a known custom type.  Found "));
                    }
                    this.e = (Person) ashsVar;
                }
                this.a.add(Integer.valueOf(i));
            }

            @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                    if (e(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Set set = this.a;
                int a = arxc.a(parcel);
                if (set.contains(2)) {
                    arxc.e(parcel, 2, this.b);
                }
                if (set.contains(3)) {
                    arxc.e(parcel, 3, this.c);
                }
                if (set.contains(4)) {
                    arxc.t(parcel, 4, this.d, i, true);
                }
                if (set.contains(5)) {
                    arxc.t(parcel, 5, this.e, i, true);
                }
                arxc.c(parcel, a);
            }

            public Scope() {
                this.a = new HashSet();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("role", new FastJsonResponse$Field(7, false, 7, false, "role", 2, null));
            hashMap.put("scope", new FastJsonResponse$Field(11, false, 11, false, "scope", 3, Scope.class));
        }

        public Entries(Set set, String str, Scope scope) {
            this.a = set;
            this.b = str;
            this.c = scope;
        }

        @Override // defpackage.ashs
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.ashs
        public final /* synthetic */ Map b() {
            return d;
        }

        @Override // defpackage.ashs
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Entries)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Entries entries = (Entries) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!entries.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(entries.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (entries.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.ashs
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.b = str2;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.ashs
        public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.ag(i, ashsVar, " is not a known custom type.  Found "));
            }
            this.c = (Scope) ashsVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = arxc.a(parcel);
            if (set.contains(2)) {
                arxc.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                arxc.t(parcel, 3, this.c, i, true);
            }
            arxc.c(parcel, a);
        }

        public Entries() {
            this.a = new HashSet();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("entries", new FastJsonResponse$Field(11, true, 11, true, "entries", 2, Entries.class));
        hashMap.put("predefinedEntries", new FastJsonResponse$Field(7, true, 7, true, "predefinedEntries", 3, null));
    }

    public Mergedpeoplefieldacl(Set set, List list, List list2) {
        this.a = set;
        this.b = list;
        this.c = list2;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return d;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof Mergedpeoplefieldacl)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Mergedpeoplefieldacl mergedpeoplefieldacl = (Mergedpeoplefieldacl) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!mergedpeoplefieldacl.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(mergedpeoplefieldacl.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (mergedpeoplefieldacl.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ashs
    public final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(a.F(arrayList != null ? arrayList.getClass().getCanonicalName() : "null", i, "Field with id=", " is not a known array of custom type.  Found ", "."));
        }
        this.b = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gy(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 3) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be an array of String."));
        }
        this.c = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
            if (e(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.y(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            arxc.x(parcel, 3, this.c, true);
        }
        arxc.c(parcel, a);
    }

    public Mergedpeoplefieldacl() {
        this.a = new HashSet();
    }
}

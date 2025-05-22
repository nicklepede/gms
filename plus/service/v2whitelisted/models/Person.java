package com.google.android.gms.plus.service.v2whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.atzr;
import defpackage.aulm;
import defpackage.cytx;
import defpackage.cyty;
import defpackage.cytz;
import defpackage.cyua;
import defpackage.cyub;
import defpackage.cyuc;
import defpackage.cyud;
import defpackage.cyue;
import defpackage.cyuf;
import defpackage.cyug;
import defpackage.cyuh;
import defpackage.cyui;
import defpackage.cyuj;
import defpackage.cyuk;
import defpackage.cyul;
import defpackage.cyum;
import defpackage.cyun;
import defpackage.cyuo;
import defpackage.cyup;
import defpackage.cyuq;
import defpackage.cyur;
import defpackage.cyus;
import defpackage.cyut;
import defpackage.cyuu;
import defpackage.cyuv;
import defpackage.cyuw;
import defpackage.cyux;
import defpackage.cyuy;
import defpackage.cyuz;
import defpackage.cyva;
import defpackage.cyvb;
import defpackage.cyvc;
import defpackage.cyvd;
import defpackage.cyve;
import defpackage.cyvf;
import defpackage.cyvg;
import defpackage.cyvh;
import defpackage.cyvi;
import defpackage.cyvj;
import defpackage.cyvk;
import defpackage.fywe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class Person extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new cytx();
    private static final HashMap M;
    List A;
    List B;
    List C;
    public List D;
    List E;
    String F;
    List G;
    List H;
    List I;
    SortKeys J;
    List K;
    List L;
    final Set a;
    List b;
    List c;
    List d;
    List e;
    List f;
    List g;
    List h;
    List i;
    public List j;
    String k;
    List l;
    ExtendedData m;
    List n;
    List o;
    public String p;
    public List q;
    List r;
    List s;
    String t;
    List u;
    LegacyFields v;
    List w;
    Metadata x;
    public List y;
    List z;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Abouts extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyty();
        private static final HashMap e;
        final Set a;
        Mergedpeoplemetadata b;
        String c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 2, Mergedpeoplemetadata.class));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 3, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 4, null));
        }

        public Abouts(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return e;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Abouts)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Abouts abouts = (Abouts) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!abouts.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(abouts.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (abouts.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = str2;
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.d = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.b = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.t(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            atzr.c(parcel, a);
        }

        public Abouts() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Addresses extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cytz();
        private static final HashMap l;
        final Set a;
        String b;
        String c;
        String d;
        Mergedpeoplemetadata e;
        String f;
        String g;
        String h;
        String i;
        String j;
        String k;

        static {
            HashMap hashMap = new HashMap();
            l = hashMap;
            hashMap.put("city", new FastJsonResponse$Field(7, false, 7, false, "city", 2, null));
            hashMap.put("country", new FastJsonResponse$Field(7, false, 7, false, "country", 3, null));
            hashMap.put("extendedAddress", new FastJsonResponse$Field(7, false, 7, false, "extendedAddress", 5, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 7, Mergedpeoplemetadata.class));
            hashMap.put("poBox", new FastJsonResponse$Field(7, false, 7, false, "poBox", 8, null));
            hashMap.put("postalCode", new FastJsonResponse$Field(7, false, 7, false, "postalCode", 9, null));
            hashMap.put("region", new FastJsonResponse$Field(7, false, 7, false, "region", 10, null));
            hashMap.put("streetAddress", new FastJsonResponse$Field(7, false, 7, false, "streetAddress", 11, null));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 12, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 13, null));
        }

        public Addresses(Set set, String str, String str2, String str3, Mergedpeoplemetadata mergedpeoplemetadata, String str4, String str5, String str6, String str7, String str8, String str9) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = mergedpeoplemetadata;
            this.f = str4;
            this.g = str5;
            this.h = str6;
            this.i = str7;
            this.j = str8;
            this.k = str9;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            switch (i) {
                case 2:
                    return this.b;
                case 3:
                    return this.c;
                case 4:
                case 6:
                default:
                    throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
                case 5:
                    return this.d;
                case 7:
                    return this.e;
                case 8:
                    return this.f;
                case 9:
                    return this.g;
                case 10:
                    return this.h;
                case 11:
                    return this.i;
                case 12:
                    return this.j;
                case 13:
                    return this.k;
            }
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return l;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Addresses)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Addresses addresses = (Addresses) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : l.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!addresses.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(addresses.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (addresses.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 3) {
                this.c = str2;
            } else if (i != 5) {
                switch (i) {
                    case 8:
                        this.f = str2;
                        break;
                    case 9:
                        this.g = str2;
                        break;
                    case 10:
                        this.h = str2;
                        break;
                    case 11:
                        this.i = str2;
                        break;
                    case 12:
                        this.j = str2;
                        break;
                    case 13:
                        this.k = str2;
                        break;
                    default:
                        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
            } else {
                this.d = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 7) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.e = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : l.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.d, true);
            }
            if (set.contains(7)) {
                atzr.t(parcel, 7, this.e, i, true);
            }
            if (set.contains(8)) {
                atzr.v(parcel, 8, this.f, true);
            }
            if (set.contains(9)) {
                atzr.v(parcel, 9, this.g, true);
            }
            if (set.contains(10)) {
                atzr.v(parcel, 10, this.h, true);
            }
            if (set.contains(11)) {
                atzr.v(parcel, 11, this.i, true);
            }
            if (set.contains(12)) {
                atzr.v(parcel, 12, this.j, true);
            }
            if (set.contains(13)) {
                atzr.v(parcel, 13, this.k, true);
            }
            atzr.c(parcel, a);
        }

        public Addresses() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Birthdays extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyua();
        private static final HashMap d;
        final Set a;
        String b;
        Mergedpeoplemetadata c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("date", new FastJsonResponse$Field(7, false, 7, false, "date", 2, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 3, Mergedpeoplemetadata.class));
        }

        public Birthdays(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
        }

        @Override // defpackage.aulm
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

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return d;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Birthdays)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Birthdays birthdays = (Birthdays) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!birthdays.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(birthdays.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (birthdays.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.b = str2;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.c = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.t(parcel, 3, this.c, i, true);
            }
            atzr.c(parcel, a);
        }

        public Birthdays() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class BraggingRights extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyub();
        private static final HashMap d;
        final Set a;
        Mergedpeoplemetadata b;
        String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 2, Mergedpeoplemetadata.class));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 3, null));
        }

        public BraggingRights(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        @Override // defpackage.aulm
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

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return d;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof BraggingRights)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            BraggingRights braggingRights = (BraggingRights) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!braggingRights.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(braggingRights.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (braggingRights.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.c = str2;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.b = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.t(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            atzr.c(parcel, a);
        }

        public BraggingRights() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Calendars extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyuc();
        private static final HashMap f;
        final Set a;
        String b;
        Mergedpeoplemetadata c;
        String d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("formattedType", new FastJsonResponse$Field(7, false, 7, false, "formattedType", 2, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 3, Mergedpeoplemetadata.class));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 4, null));
            hashMap.put("url", new FastJsonResponse$Field(7, false, 7, false, "url", 5, null));
        }

        public Calendars(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
            this.e = str3;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            if (i == 5) {
                return this.e;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return f;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Calendars)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Calendars calendars = (Calendars) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!calendars.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(calendars.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (calendars.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 4) {
                this.d = str2;
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.e = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.c = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.t(parcel, 3, this.c, i, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.e, true);
            }
            atzr.c(parcel, a);
        }

        public Calendars() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class ClientData extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyud();
        private static final HashMap f;
        final Set a;
        String b;
        Mergedpeoplemetadata c;
        String d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("key", new FastJsonResponse$Field(7, false, 7, false, "key", 2, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 3, Mergedpeoplemetadata.class));
            hashMap.put("namespace", new FastJsonResponse$Field(7, false, 7, false, "namespace", 4, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 5, null));
        }

        public ClientData(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
            this.e = str3;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            if (i == 5) {
                return this.e;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return f;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof ClientData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ClientData clientData = (ClientData) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!clientData.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(clientData.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (clientData.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 4) {
                this.d = str2;
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.e = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.c = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.t(parcel, 3, this.c, i, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.e, true);
            }
            atzr.c(parcel, a);
        }

        public ClientData() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class CoverPhotos extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyue();
        private static final HashMap h;
        final Set a;
        int b;
        String c;
        boolean d;
        Mergedpeoplemetadata e;
        String f;
        int g;

        static {
            HashMap hashMap = new HashMap();
            h = hashMap;
            hashMap.put("height", new FastJsonResponse$Field(0, false, 0, false, "height", 2, null));
            hashMap.put("id", new FastJsonResponse$Field(7, false, 7, false, "id", 3, null));
            hashMap.put("isDefault", new FastJsonResponse$Field(6, false, 6, false, "isDefault", 5, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 6, Mergedpeoplemetadata.class));
            hashMap.put("url", new FastJsonResponse$Field(7, false, 7, false, "url", 7, null));
            hashMap.put("width", new FastJsonResponse$Field(0, false, 0, false, "width", 8, null));
        }

        public CoverPhotos(Set set, int i, String str, boolean z, Mergedpeoplemetadata mergedpeoplemetadata, String str2, int i2) {
            this.a = set;
            this.b = i;
            this.c = str;
            this.d = z;
            this.e = mergedpeoplemetadata;
            this.f = str2;
            this.g = i2;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return Integer.valueOf(this.b);
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 5) {
                return Boolean.valueOf(this.d);
            }
            if (i == 6) {
                return this.e;
            }
            if (i == 7) {
                return this.f;
            }
            if (i == 8) {
                return Integer.valueOf(this.g);
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return h;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof CoverPhotos)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            CoverPhotos coverPhotos = (CoverPhotos) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!coverPhotos.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(coverPhotos.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (coverPhotos.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = str2;
            } else {
                if (i != 7) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.f = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 6) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.e = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
            int i2 = fastJsonResponse$Field.g;
            if (i2 == 2) {
                this.b = i;
            } else {
                if (i2 != 8) {
                    throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
                }
                this.g = i;
            }
            this.a.add(Integer.valueOf(i2));
        }

        @Override // defpackage.aulm
        protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.g;
            if (i != 5) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
            }
            this.d = z;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.o(parcel, 2, this.b);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(5)) {
                atzr.e(parcel, 5, this.d);
            }
            if (set.contains(6)) {
                atzr.t(parcel, 6, this.e, i, true);
            }
            if (set.contains(7)) {
                atzr.v(parcel, 7, this.f, true);
            }
            if (set.contains(8)) {
                atzr.o(parcel, 8, this.g);
            }
            atzr.c(parcel, a);
        }

        public CoverPhotos() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class CustomFields extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyuf();
        private static final HashMap e;
        final Set a;
        String b;
        Mergedpeoplemetadata c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("key", new FastJsonResponse$Field(7, false, 7, false, "key", 2, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 3, Mergedpeoplemetadata.class));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 4, null));
        }

        public CustomFields(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return e;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof CustomFields)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            CustomFields customFields = (CustomFields) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!customFields.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(customFields.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (customFields.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.d = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.c = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.t(parcel, 3, this.c, i, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            atzr.c(parcel, a);
        }

        public CustomFields() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Emails extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyug();
        private static final HashMap g;
        final Set a;
        List b;
        String c;
        Mergedpeoplemetadata d;
        String e;
        public String f;

        /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
        public final class Certificates extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new cyuh();
            private static final HashMap d;
            final Set a;
            Mergedpeoplemetadata b;
            Status c;

            /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
            public final class Status extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new cyui();
                private static final HashMap e;
                final Set a;
                String b;
                String c;
                long d;

                static {
                    HashMap hashMap = new HashMap();
                    e = hashMap;
                    hashMap.put("code", new FastJsonResponse$Field(7, false, 7, false, "code", 2, null));
                    hashMap.put("expiration", new FastJsonResponse$Field(7, false, 7, false, "expiration", 3, null));
                    hashMap.put("expirationSeconds", new FastJsonResponse$Field(2, false, 2, false, "expirationSeconds", 4, null));
                }

                public Status(Set set, String str, String str2, long j) {
                    this.a = set;
                    this.b = str;
                    this.c = str2;
                    this.d = j;
                }

                @Override // defpackage.aulm
                protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        return this.b;
                    }
                    if (i == 3) {
                        return this.c;
                    }
                    if (i == 4) {
                        return Long.valueOf(this.d);
                    }
                    throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
                }

                @Override // defpackage.aulm
                public final /* synthetic */ Map b() {
                    return e;
                }

                @Override // defpackage.aulm
                protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                }

                @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
                public final boolean equals(Object obj) {
                    if (!(obj instanceof Status)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    Status status = (Status) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                        if (e(fastJsonResponse$Field)) {
                            if (!status.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(status.a(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (status.e(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // defpackage.aulm
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
                    for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                        if (e(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                @Override // defpackage.aulm
                protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
                    int i = fastJsonResponse$Field.g;
                    if (i != 4) {
                        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a long."));
                    }
                    this.d = j;
                    this.a.add(Integer.valueOf(i));
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    Set set = this.a;
                    int a = atzr.a(parcel);
                    if (set.contains(2)) {
                        atzr.v(parcel, 2, this.b, true);
                    }
                    if (set.contains(3)) {
                        atzr.v(parcel, 3, this.c, true);
                    }
                    if (set.contains(4)) {
                        atzr.q(parcel, 4, this.d);
                    }
                    atzr.c(parcel, a);
                }

                public Status() {
                    this.a = new HashSet();
                }
            }

            static {
                HashMap hashMap = new HashMap();
                d = hashMap;
                hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 3, Mergedpeoplemetadata.class));
                hashMap.put("status", new FastJsonResponse$Field(11, false, 11, false, "status", 4, Status.class));
            }

            public Certificates(Set set, Mergedpeoplemetadata mergedpeoplemetadata, Status status) {
                this.a = set;
                this.b = mergedpeoplemetadata;
                this.c = status;
            }

            @Override // defpackage.aulm
            protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.g;
                if (i == 3) {
                    return this.b;
                }
                if (i == 4) {
                    return this.c;
                }
                throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
            }

            @Override // defpackage.aulm
            public final /* synthetic */ Map b() {
                return d;
            }

            @Override // defpackage.aulm
            protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
            }

            @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
            public final boolean equals(Object obj) {
                if (!(obj instanceof Certificates)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                Certificates certificates = (Certificates) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (e(fastJsonResponse$Field)) {
                        if (!certificates.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(certificates.a(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (certificates.e(fastJsonResponse$Field)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // defpackage.aulm
            public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
                int i = fastJsonResponse$Field.g;
                if (i == 3) {
                    this.b = (Mergedpeoplemetadata) aulmVar;
                } else {
                    if (i != 4) {
                        throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
                    }
                    this.c = (Status) aulmVar;
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
                int a = atzr.a(parcel);
                if (set.contains(3)) {
                    atzr.t(parcel, 3, this.b, i, true);
                }
                if (set.contains(4)) {
                    atzr.t(parcel, 4, this.c, i, true);
                }
                atzr.c(parcel, a);
            }

            public Certificates() {
                this.a = new HashSet();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            g = hashMap;
            hashMap.put("certificates", new FastJsonResponse$Field(11, true, 11, true, "certificates", 2, Certificates.class));
            hashMap.put("formattedType", new FastJsonResponse$Field(7, false, 7, false, "formattedType", 4, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 5, Mergedpeoplemetadata.class));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 6, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 7, null));
        }

        public Emails(Set set, List list, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = list;
            this.c = str;
            this.d = mergedpeoplemetadata;
            this.e = str2;
            this.f = str3;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 4) {
                return this.c;
            }
            if (i == 5) {
                return this.d;
            }
            if (i == 6) {
                return this.e;
            }
            if (i == 7) {
                return this.f;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return g;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Emails)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Emails emails = (Emails) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!emails.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(emails.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (emails.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.c = str2;
            } else if (i == 6) {
                this.e = str2;
            } else {
                if (i != 7) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.f = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.I(arrayList != null ? arrayList.getClass().getCanonicalName() : "null", i, "Field with id=", " is not a known array of custom type.  Found ", "."));
            }
            this.b = arrayList;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 5) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.d = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.y(parcel, 2, this.b, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.c, true);
            }
            if (set.contains(5)) {
                atzr.t(parcel, 5, this.d, i, true);
            }
            if (set.contains(6)) {
                atzr.v(parcel, 6, this.e, true);
            }
            if (set.contains(7)) {
                atzr.v(parcel, 7, this.f, true);
            }
            atzr.c(parcel, a);
        }

        public Emails() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Events extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyuj();
        private static final HashMap f;
        final Set a;
        String b;
        String c;
        Mergedpeoplemetadata d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("date", new FastJsonResponse$Field(7, false, 7, false, "date", 2, null));
            hashMap.put("formattedType", new FastJsonResponse$Field(7, false, 7, false, "formattedType", 3, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 4, Mergedpeoplemetadata.class));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 5, null));
        }

        public Events(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = mergedpeoplemetadata;
            this.e = str3;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            if (i == 5) {
                return this.e;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return f;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Events)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Events events = (Events) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!events.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(events.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (events.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 3) {
                this.c = str2;
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.e = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 4) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.d = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                atzr.t(parcel, 4, this.d, i, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.e, true);
            }
            atzr.c(parcel, a);
        }

        public Events() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class ExtendedData extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyuk();
        private static final HashMap d;
        final Set a;
        HangoutsExtendedData b;
        List c;

        /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
        public final class HangoutsExtendedData extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new cyul();
            private static final HashMap g;
            final Set a;
            String b;
            String c;
            boolean d;
            boolean e;
            boolean f;

            static {
                HashMap hashMap = new HashMap();
                g = hashMap;
                hashMap.put("hadPastHangoutState", new FastJsonResponse$Field(7, false, 7, false, "hadPastHangoutState", 2, null));
                hashMap.put("invitationStatus", new FastJsonResponse$Field(7, false, 7, false, "invitationStatus", 3, null));
                hashMap.put("isDismissed", new FastJsonResponse$Field(6, false, 6, false, "isDismissed", 4, null));
                hashMap.put("isFavorite", new FastJsonResponse$Field(6, false, 6, false, "isFavorite", 5, null));
                hashMap.put("isPinned", new FastJsonResponse$Field(6, false, 6, false, "isPinned", 6, null));
            }

            public HangoutsExtendedData(Set set, String str, String str2, boolean z, boolean z2, boolean z3) {
                this.a = set;
                this.b = str;
                this.c = str2;
                this.d = z;
                this.e = z2;
                this.f = z3;
            }

            @Override // defpackage.aulm
            protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    return this.b;
                }
                if (i == 3) {
                    return this.c;
                }
                if (i == 4) {
                    return Boolean.valueOf(this.d);
                }
                if (i == 5) {
                    return Boolean.valueOf(this.e);
                }
                if (i == 6) {
                    return Boolean.valueOf(this.f);
                }
                throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
            }

            @Override // defpackage.aulm
            public final /* synthetic */ Map b() {
                return g;
            }

            @Override // defpackage.aulm
            protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
            }

            @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
            public final boolean equals(Object obj) {
                if (!(obj instanceof HangoutsExtendedData)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                HangoutsExtendedData hangoutsExtendedData = (HangoutsExtendedData) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                    if (e(fastJsonResponse$Field)) {
                        if (!hangoutsExtendedData.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(hangoutsExtendedData.a(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (hangoutsExtendedData.e(fastJsonResponse$Field)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // defpackage.aulm
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

            @Override // defpackage.aulm
            protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
                int i = fastJsonResponse$Field.g;
                if (i == 4) {
                    this.d = z;
                } else if (i == 5) {
                    this.e = z;
                } else {
                    if (i != 6) {
                        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
                    }
                    this.f = z;
                }
                this.a.add(Integer.valueOf(i));
            }

            @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
            public final int hashCode() {
                int i = 0;
                for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                    if (e(fastJsonResponse$Field)) {
                        i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                    }
                }
                return i;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Set set = this.a;
                int a = atzr.a(parcel);
                if (set.contains(2)) {
                    atzr.v(parcel, 2, this.b, true);
                }
                if (set.contains(3)) {
                    atzr.v(parcel, 3, this.c, true);
                }
                if (set.contains(4)) {
                    atzr.e(parcel, 4, this.d);
                }
                if (set.contains(5)) {
                    atzr.e(parcel, 5, this.e);
                }
                if (set.contains(6)) {
                    atzr.e(parcel, 6, this.f);
                }
                atzr.c(parcel, a);
            }

            public HangoutsExtendedData() {
                this.a = new HashSet();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("hangoutsExtendedData", new FastJsonResponse$Field(11, false, 11, false, "hangoutsExtendedData", 2, HangoutsExtendedData.class));
            hashMap.put("hd", new FastJsonResponse$Field(7, true, 7, true, "hd", 3, null));
        }

        public ExtendedData(Set set, HangoutsExtendedData hangoutsExtendedData, List list) {
            this.a = set;
            this.b = hangoutsExtendedData;
            this.c = list;
        }

        @Override // defpackage.aulm
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

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return d;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof ExtendedData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ExtendedData extendedData = (ExtendedData) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!extendedData.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(extendedData.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (extendedData.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.b = (HangoutsExtendedData) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        protected final void gN(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.t(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                atzr.x(parcel, 3, this.c, true);
            }
            atzr.c(parcel, a);
        }

        public ExtendedData() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class ExternalIds extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyum();
        private static final HashMap f;
        final Set a;
        String b;
        Mergedpeoplemetadata c;
        String d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("formattedType", new FastJsonResponse$Field(7, false, 7, false, "formattedType", 2, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 3, Mergedpeoplemetadata.class));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 4, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 5, null));
        }

        public ExternalIds(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
            this.e = str3;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            if (i == 5) {
                return this.e;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return f;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof ExternalIds)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            ExternalIds externalIds = (ExternalIds) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!externalIds.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(externalIds.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (externalIds.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 4) {
                this.d = str2;
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.e = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.c = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.t(parcel, 3, this.c, i, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.e, true);
            }
            atzr.c(parcel, a);
        }

        public ExternalIds() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Genders extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyun();
        private static final HashMap e;
        final Set a;
        String b;
        Mergedpeoplemetadata c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("formattedValue", new FastJsonResponse$Field(7, false, 7, false, "formattedValue", 3, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 4, Mergedpeoplemetadata.class));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 5, null));
        }

        public Genders(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                return this.b;
            }
            if (i == 4) {
                return this.c;
            }
            if (i == 5) {
                return this.d;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return e;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Genders)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Genders genders = (Genders) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!genders.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(genders.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (genders.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.b = str2;
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.d = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 4) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.c = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.b, true);
            }
            if (set.contains(4)) {
                atzr.t(parcel, 4, this.c, i, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.d, true);
            }
            atzr.c(parcel, a);
        }

        public Genders() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Images extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyuo();
        private static final HashMap f;
        final Set a;
        boolean b;
        public Mergedpeoplemetadata c;
        String d;
        public String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("isDefault", new FastJsonResponse$Field(6, false, 6, false, "isDefault", 2, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 3, Mergedpeoplemetadata.class));
            hashMap.put("photoToken", new FastJsonResponse$Field(7, false, 7, false, "photoToken", 4, null));
            hashMap.put("url", new FastJsonResponse$Field(7, false, 7, false, "url", 5, null));
        }

        public Images(Set set, boolean z, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.a = set;
            this.b = z;
            this.c = mergedpeoplemetadata;
            this.d = str;
            this.e = str2;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return Boolean.valueOf(this.b);
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            if (i == 5) {
                return this.e;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return f;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Images)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Images images = (Images) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!images.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(images.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (images.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 4) {
                this.d = str2;
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.e = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.c = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
            }
            this.b = z;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.e(parcel, 2, this.b);
            }
            if (set.contains(3)) {
                atzr.t(parcel, 3, this.c, i, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.e, true);
            }
            atzr.c(parcel, a);
        }

        public Images() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class InstantMessaging extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyup();
        private static final HashMap h;
        final Set a;
        String b;
        String c;
        Mergedpeoplemetadata d;
        String e;
        String f;
        String g;

        static {
            HashMap hashMap = new HashMap();
            h = hashMap;
            hashMap.put("formattedProtocol", new FastJsonResponse$Field(7, false, 7, false, "formattedProtocol", 2, null));
            hashMap.put("formattedType", new FastJsonResponse$Field(7, false, 7, false, "formattedType", 3, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 4, Mergedpeoplemetadata.class));
            hashMap.put("protocol", new FastJsonResponse$Field(7, false, 7, false, "protocol", 5, null));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 6, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 7, null));
        }

        public InstantMessaging(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3, String str4, String str5) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = mergedpeoplemetadata;
            this.e = str3;
            this.f = str4;
            this.g = str5;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            switch (i) {
                case 2:
                    return this.b;
                case 3:
                    return this.c;
                case 4:
                    return this.d;
                case 5:
                    return this.e;
                case 6:
                    return this.f;
                case 7:
                    return this.g;
                default:
                    throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
            }
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return h;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof InstantMessaging)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            InstantMessaging instantMessaging = (InstantMessaging) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!instantMessaging.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(instantMessaging.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (instantMessaging.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 3) {
                this.c = str2;
            } else if (i == 5) {
                this.e = str2;
            } else if (i == 6) {
                this.f = str2;
            } else {
                if (i != 7) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.g = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 4) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.d = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                atzr.t(parcel, 4, this.d, i, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                atzr.v(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                atzr.v(parcel, 7, this.g, true);
            }
            atzr.c(parcel, a);
        }

        public InstantMessaging() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Interests extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyuq();
        private static final HashMap d;
        final Set a;
        Mergedpeoplemetadata b;
        String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 2, Mergedpeoplemetadata.class));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 3, null));
        }

        public Interests(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        @Override // defpackage.aulm
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

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return d;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Interests)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Interests interests = (Interests) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!interests.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(interests.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (interests.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.c = str2;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.b = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.t(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            atzr.c(parcel, a);
        }

        public Interests() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Languages extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyur();
        private static final HashMap d;
        final Set a;
        Mergedpeoplemetadata b;
        String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 2, Mergedpeoplemetadata.class));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 3, null));
        }

        public Languages(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        @Override // defpackage.aulm
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

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return d;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Languages)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Languages languages = (Languages) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!languages.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(languages.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (languages.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.c = str2;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.b = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.t(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            atzr.c(parcel, a);
        }

        public Languages() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class LegacyFields extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyus();
        private static final HashMap c;
        final Set a;
        String b;

        static {
            HashMap hashMap = new HashMap();
            c = hashMap;
            hashMap.put("mobileOwnerId", new FastJsonResponse$Field(7, false, 7, false, "mobileOwnerId", 2, null));
        }

        public LegacyFields(Set set, String str) {
            this.a = set;
            this.b = str;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return c;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof LegacyFields)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            LegacyFields legacyFields = (LegacyFields) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : c.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!legacyFields.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(legacyFields.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (legacyFields.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            atzr.c(parcel, a);
        }

        public LegacyFields() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Memberships extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyut();
        private static final HashMap f;
        final Set a;
        String b;
        String c;
        Mergedpeoplemetadata d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("circle", new FastJsonResponse$Field(7, false, 7, false, "circle", 2, null));
            hashMap.put("contactGroup", new FastJsonResponse$Field(7, false, 7, false, "contactGroup", 3, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 4, Mergedpeoplemetadata.class));
            hashMap.put("systemContactGroup", new FastJsonResponse$Field(7, false, 7, false, "systemContactGroup", 5, null));
        }

        public Memberships(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = mergedpeoplemetadata;
            this.e = str3;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            if (i == 5) {
                return this.e;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return f;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Memberships)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Memberships memberships = (Memberships) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!memberships.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(memberships.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (memberships.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 3) {
                this.c = str2;
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.e = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 4) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.d = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                atzr.t(parcel, 4, this.d, i, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.e, true);
            }
            atzr.c(parcel, a);
        }

        public Memberships() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Metadata extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyuu();
        private static final HashMap t;
        final Set a;
        List b;
        List c;
        List d;
        boolean e;
        List f;
        List g;
        String h;
        boolean i;
        List j;
        IdentityInfo k;
        boolean l;
        List m;
        long n;
        String o;
        String p;
        List q;
        String r;
        ProfileOwnerStats s;

        /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
        public final class IdentityInfo extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new cyuv();
            private static final HashMap d;
            final Set a;
            List b;
            List c;

            /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
            public final class SourceIds extends FastSafeParcelableJsonResponse {
                public static final Parcelable.Creator CREATOR = new cyuw();
                private static final HashMap h;
                final Set a;
                String b;
                boolean c;
                String d;
                String e;
                String f;
                long g;

                static {
                    HashMap hashMap = new HashMap();
                    h = hashMap;
                    hashMap.put("container", new FastJsonResponse$Field(7, false, 7, false, "container", 2, null));
                    hashMap.put("deleted", new FastJsonResponse$Field(6, false, 6, false, "deleted", 3, null));
                    hashMap.put("etag", new FastJsonResponse$Field(7, false, 7, false, "etag", 4, null));
                    hashMap.put("id", new FastJsonResponse$Field(7, false, 7, false, "id", 5, null));
                    hashMap.put("lastUpdated", new FastJsonResponse$Field(7, false, 7, false, "lastUpdated", 6, null));
                    hashMap.put("lastUpdatedMicros", new FastJsonResponse$Field(2, false, 2, false, "lastUpdatedMicros", 7, null));
                }

                public SourceIds(Set set, String str, boolean z, String str2, String str3, String str4, long j) {
                    this.a = set;
                    this.b = str;
                    this.c = z;
                    this.d = str2;
                    this.e = str3;
                    this.f = str4;
                    this.g = j;
                }

                @Override // defpackage.aulm
                protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
                    int i = fastJsonResponse$Field.g;
                    switch (i) {
                        case 2:
                            return this.b;
                        case 3:
                            return Boolean.valueOf(this.c);
                        case 4:
                            return this.d;
                        case 5:
                            return this.e;
                        case 6:
                            return this.f;
                        case 7:
                            return Long.valueOf(this.g);
                        default:
                            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
                    }
                }

                @Override // defpackage.aulm
                public final /* synthetic */ Map b() {
                    return h;
                }

                @Override // defpackage.aulm
                protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
                    return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
                }

                @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
                public final boolean equals(Object obj) {
                    if (!(obj instanceof SourceIds)) {
                        return false;
                    }
                    if (this == obj) {
                        return true;
                    }
                    SourceIds sourceIds = (SourceIds) obj;
                    for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                        if (e(fastJsonResponse$Field)) {
                            if (!sourceIds.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(sourceIds.a(fastJsonResponse$Field))) {
                                return false;
                            }
                        } else if (sourceIds.e(fastJsonResponse$Field)) {
                            return false;
                        }
                    }
                    return true;
                }

                @Override // defpackage.aulm
                protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
                    int i = fastJsonResponse$Field.g;
                    if (i == 2) {
                        this.b = str2;
                    } else if (i == 4) {
                        this.d = str2;
                    } else if (i == 5) {
                        this.e = str2;
                    } else {
                        if (i != 6) {
                            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                        }
                        this.f = str2;
                    }
                    this.a.add(Integer.valueOf(i));
                }

                @Override // defpackage.aulm
                protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
                    int i = fastJsonResponse$Field.g;
                    if (i != 3) {
                        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
                    }
                    this.c = z;
                    this.a.add(Integer.valueOf(i));
                }

                @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
                public final int hashCode() {
                    int i = 0;
                    for (FastJsonResponse$Field fastJsonResponse$Field : h.values()) {
                        if (e(fastJsonResponse$Field)) {
                            i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                        }
                    }
                    return i;
                }

                @Override // defpackage.aulm
                protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
                    int i = fastJsonResponse$Field.g;
                    if (i != 7) {
                        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a long."));
                    }
                    this.g = j;
                    this.a.add(Integer.valueOf(i));
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
                    Set set = this.a;
                    int a = atzr.a(parcel);
                    if (set.contains(2)) {
                        atzr.v(parcel, 2, this.b, true);
                    }
                    if (set.contains(3)) {
                        atzr.e(parcel, 3, this.c);
                    }
                    if (set.contains(4)) {
                        atzr.v(parcel, 4, this.d, true);
                    }
                    if (set.contains(5)) {
                        atzr.v(parcel, 5, this.e, true);
                    }
                    if (set.contains(6)) {
                        atzr.v(parcel, 6, this.f, true);
                    }
                    if (set.contains(7)) {
                        atzr.q(parcel, 7, this.g);
                    }
                    atzr.c(parcel, a);
                }

                public SourceIds() {
                    this.a = new HashSet();
                }
            }

            static {
                HashMap hashMap = new HashMap();
                d = hashMap;
                hashMap.put("originalLookupToken", new FastJsonResponse$Field(7, true, 7, true, "originalLookupToken", 2, null));
                hashMap.put("sourceIds", new FastJsonResponse$Field(11, true, 11, true, "sourceIds", 3, SourceIds.class));
            }

            public IdentityInfo(Set set, List list, List list2) {
                this.a = set;
                this.b = list;
                this.c = list2;
            }

            @Override // defpackage.aulm
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

            @Override // defpackage.aulm
            public final /* synthetic */ Map b() {
                return d;
            }

            @Override // defpackage.aulm
            protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
            }

            @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
            public final boolean equals(Object obj) {
                if (!(obj instanceof IdentityInfo)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                IdentityInfo identityInfo = (IdentityInfo) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (e(fastJsonResponse$Field)) {
                        if (!identityInfo.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(identityInfo.a(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (identityInfo.e(fastJsonResponse$Field)) {
                        return false;
                    }
                }
                return true;
            }

            @Override // defpackage.aulm
            public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
                int i = fastJsonResponse$Field.g;
                if (i != 3) {
                    throw new IllegalArgumentException(a.I(arrayList != null ? arrayList.getClass().getCanonicalName() : "null", i, "Field with id=", " is not a known array of custom type.  Found ", "."));
                }
                this.c = arrayList;
                this.a.add(Integer.valueOf(i));
            }

            @Override // defpackage.aulm
            protected final void gN(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
                int i = fastJsonResponse$Field.g;
                if (i != 2) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be an array of String."));
                }
                this.b = arrayList;
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
                int a = atzr.a(parcel);
                if (set.contains(2)) {
                    atzr.x(parcel, 2, this.b, true);
                }
                if (set.contains(3)) {
                    atzr.y(parcel, 3, this.c, true);
                }
                atzr.c(parcel, a);
            }

            public IdentityInfo() {
                this.a = new HashSet();
            }
        }

        /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
        public final class ProfileOwnerStats extends FastSafeParcelableJsonResponse {
            public static final Parcelable.Creator CREATOR = new cyux();
            private static final HashMap d;
            final Set a;
            long b;
            long c;

            static {
                HashMap hashMap = new HashMap();
                d = hashMap;
                hashMap.put("incomingAnyCircleCount", new FastJsonResponse$Field(2, false, 2, false, "incomingAnyCircleCount", 2, null));
                hashMap.put("viewCount", new FastJsonResponse$Field(2, false, 2, false, "viewCount", 3, null));
            }

            public ProfileOwnerStats(Set set, long j, long j2) {
                this.a = set;
                this.b = j;
                this.c = j2;
            }

            @Override // defpackage.aulm
            protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    return Long.valueOf(this.b);
                }
                if (i == 3) {
                    return Long.valueOf(this.c);
                }
                throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
            }

            @Override // defpackage.aulm
            public final /* synthetic */ Map b() {
                return d;
            }

            @Override // defpackage.aulm
            protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
                return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
            }

            @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
            public final boolean equals(Object obj) {
                if (!(obj instanceof ProfileOwnerStats)) {
                    return false;
                }
                if (this == obj) {
                    return true;
                }
                ProfileOwnerStats profileOwnerStats = (ProfileOwnerStats) obj;
                for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                    if (e(fastJsonResponse$Field)) {
                        if (!profileOwnerStats.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(profileOwnerStats.a(fastJsonResponse$Field))) {
                            return false;
                        }
                    } else if (profileOwnerStats.e(fastJsonResponse$Field)) {
                        return false;
                    }
                }
                return true;
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

            @Override // defpackage.aulm
            protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
                int i = fastJsonResponse$Field.g;
                if (i == 2) {
                    this.b = j;
                } else {
                    if (i != 3) {
                        throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a long."));
                    }
                    this.c = j;
                }
                this.a.add(Integer.valueOf(i));
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                Set set = this.a;
                int a = atzr.a(parcel);
                if (set.contains(2)) {
                    atzr.q(parcel, 2, this.b);
                }
                if (set.contains(3)) {
                    atzr.q(parcel, 3, this.c);
                }
                atzr.c(parcel, a);
            }

            public ProfileOwnerStats() {
                this.a = new HashSet();
            }
        }

        static {
            HashMap hashMap = new HashMap();
            t = hashMap;
            hashMap.put("affinities", new FastJsonResponse$Field(11, true, 11, true, "affinities", 2, Mergedpeopleaffinities.class));
            hashMap.put("attributions", new FastJsonResponse$Field(7, true, 7, true, "attributions", 3, null));
            hashMap.put("blockTypes", new FastJsonResponse$Field(7, true, 7, true, "blockTypes", 4, null));
            hashMap.put("blocked", new FastJsonResponse$Field(6, false, 6, false, "blocked", 5, null));
            hashMap.put("circles", new FastJsonResponse$Field(7, true, 7, true, "circles", 6, null));
            hashMap.put("contacts", new FastJsonResponse$Field(7, true, 7, true, "contacts", 7, null));
            hashMap.put("customResponseMaskingType", new FastJsonResponse$Field(7, false, 7, false, "customResponseMaskingType", 8, null));
            hashMap.put("deleted", new FastJsonResponse$Field(6, false, 6, false, "deleted", 9, null));
            hashMap.put("groups", new FastJsonResponse$Field(7, true, 7, true, "groups", 10, null));
            hashMap.put("identityInfo", new FastJsonResponse$Field(11, false, 11, false, "identityInfo", 11, IdentityInfo.class));
            hashMap.put("inViewerDomain", new FastJsonResponse$Field(6, false, 6, false, "inViewerDomain", 12, null));
            hashMap.put("incomingBlockTypes", new FastJsonResponse$Field(7, true, 7, true, "incomingBlockTypes", 13, null));
            hashMap.put("lastUpdateTimeMicros", new FastJsonResponse$Field(2, false, 2, false, "lastUpdateTimeMicros", 14, null));
            hashMap.put("objectType", new FastJsonResponse$Field(7, false, 7, false, "objectType", 15, null));
            hashMap.put("ownerId", new FastJsonResponse$Field(7, false, 7, false, "ownerId", 16, null));
            hashMap.put("ownerUserTypes", new FastJsonResponse$Field(7, true, 7, true, "ownerUserTypes", 17, null));
            hashMap.put("plusPageType", new FastJsonResponse$Field(7, false, 7, false, "plusPageType", 18, null));
            hashMap.put("profileOwnerStats", new FastJsonResponse$Field(11, false, 11, false, "profileOwnerStats", 19, ProfileOwnerStats.class));
        }

        public Metadata(Set set, List list, List list2, List list3, boolean z, List list4, List list5, String str, boolean z2, List list6, IdentityInfo identityInfo, boolean z3, List list7, long j, String str2, String str3, List list8, String str4, ProfileOwnerStats profileOwnerStats) {
            this.a = set;
            this.b = list;
            this.c = list2;
            this.d = list3;
            this.e = z;
            this.f = list4;
            this.g = list5;
            this.h = str;
            this.i = z2;
            this.j = list6;
            this.k = identityInfo;
            this.l = z3;
            this.m = list7;
            this.n = j;
            this.o = str2;
            this.p = str3;
            this.q = list8;
            this.r = str4;
            this.s = profileOwnerStats;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            switch (i) {
                case 2:
                    return this.b;
                case 3:
                    return this.c;
                case 4:
                    return this.d;
                case 5:
                    return Boolean.valueOf(this.e);
                case 6:
                    return this.f;
                case 7:
                    return this.g;
                case 8:
                    return this.h;
                case 9:
                    return Boolean.valueOf(this.i);
                case 10:
                    return this.j;
                case 11:
                    return this.k;
                case 12:
                    return Boolean.valueOf(this.l);
                case 13:
                    return this.m;
                case 14:
                    return Long.valueOf(this.n);
                case 15:
                    return this.o;
                case 16:
                    return this.p;
                case fywe.q /* 17 */:
                    return this.q;
                case 18:
                    return this.r;
                case 19:
                    return this.s;
                default:
                    throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
            }
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return t;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Metadata)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Metadata metadata = (Metadata) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : t.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!metadata.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(metadata.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (metadata.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 8) {
                this.h = str2;
            } else if (i == 18) {
                this.r = str2;
            } else if (i == 15) {
                this.o = str2;
            } else {
                if (i != 16) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.p = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.I(arrayList != null ? arrayList.getClass().getCanonicalName() : "null", i, "Field with id=", " is not a known array of custom type.  Found ", "."));
            }
            this.b = arrayList;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i == 11) {
                this.k = (IdentityInfo) aulmVar;
            } else {
                if (i != 19) {
                    throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
                }
                this.s = (ProfileOwnerStats) aulmVar;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        protected final void gN(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = arrayList;
            } else if (i == 4) {
                this.d = arrayList;
            } else if (i == 6) {
                this.f = arrayList;
            } else if (i == 7) {
                this.g = arrayList;
            } else if (i == 10) {
                this.j = arrayList;
            } else if (i == 13) {
                this.m = arrayList;
            } else {
                if (i != 17) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be an array of String."));
                }
                this.q = arrayList;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.g;
            if (i == 5) {
                this.e = z;
            } else if (i == 9) {
                this.i = z;
            } else {
                if (i != 12) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
                }
                this.l = z;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : t.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // defpackage.aulm
        protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
            int i = fastJsonResponse$Field.g;
            if (i != 14) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a long."));
            }
            this.n = j;
            this.a.add(Integer.valueOf(i));
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.y(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.x(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                atzr.x(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                atzr.e(parcel, 5, this.e);
            }
            if (set.contains(6)) {
                atzr.x(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                atzr.x(parcel, 7, this.g, true);
            }
            if (set.contains(8)) {
                atzr.v(parcel, 8, this.h, true);
            }
            if (set.contains(9)) {
                atzr.e(parcel, 9, this.i);
            }
            if (set.contains(10)) {
                atzr.x(parcel, 10, this.j, true);
            }
            if (set.contains(11)) {
                atzr.t(parcel, 11, this.k, i, true);
            }
            if (set.contains(12)) {
                atzr.e(parcel, 12, this.l);
            }
            if (set.contains(13)) {
                atzr.x(parcel, 13, this.m, true);
            }
            if (set.contains(14)) {
                atzr.q(parcel, 14, this.n);
            }
            if (set.contains(15)) {
                atzr.v(parcel, 15, this.o, true);
            }
            if (set.contains(16)) {
                atzr.v(parcel, 16, this.p, true);
            }
            if (set.contains(17)) {
                atzr.x(parcel, 17, this.q, true);
            }
            if (set.contains(18)) {
                atzr.v(parcel, 18, this.r, true);
            }
            if (set.contains(19)) {
                atzr.t(parcel, 19, this.s, i, true);
            }
            atzr.c(parcel, a);
        }

        public Metadata() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Names extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyuy();
        private static final HashMap o;
        final Set a;
        public String b;
        String c;
        String d;
        String e;
        String f;
        String g;
        public Mergedpeoplemetadata h;
        String i;
        String j;
        String k;
        String l;
        String m;
        String n;

        static {
            HashMap hashMap = new HashMap();
            o = hashMap;
            hashMap.put("displayName", new FastJsonResponse$Field(7, false, 7, false, "displayName", 2, null));
            hashMap.put("familyName", new FastJsonResponse$Field(7, false, 7, false, "familyName", 3, null));
            hashMap.put("formatted", new FastJsonResponse$Field(7, false, 7, false, "formatted", 4, null));
            hashMap.put("givenName", new FastJsonResponse$Field(7, false, 7, false, "givenName", 5, null));
            hashMap.put("honorificPrefix", new FastJsonResponse$Field(7, false, 7, false, "honorificPrefix", 6, null));
            hashMap.put("honorificSuffix", new FastJsonResponse$Field(7, false, 7, false, "honorificSuffix", 7, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 8, Mergedpeoplemetadata.class));
            hashMap.put("middleName", new FastJsonResponse$Field(7, false, 7, false, "middleName", 9, null));
            hashMap.put("phoneticFamilyName", new FastJsonResponse$Field(7, false, 7, false, "phoneticFamilyName", 10, null));
            hashMap.put("phoneticGivenName", new FastJsonResponse$Field(7, false, 7, false, "phoneticGivenName", 11, null));
            hashMap.put("phoneticHonorificPrefix", new FastJsonResponse$Field(7, false, 7, false, "phoneticHonorificPrefix", 12, null));
            hashMap.put("phoneticHonorificSuffix", new FastJsonResponse$Field(7, false, 7, false, "phoneticHonorificSuffix", 13, null));
            hashMap.put("phoneticMiddleName", new FastJsonResponse$Field(7, false, 7, false, "phoneticMiddleName", 14, null));
        }

        public Names(Set set, String str, String str2, String str3, String str4, String str5, String str6, Mergedpeoplemetadata mergedpeoplemetadata, String str7, String str8, String str9, String str10, String str11, String str12) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = str5;
            this.g = str6;
            this.h = mergedpeoplemetadata;
            this.i = str7;
            this.j = str8;
            this.k = str9;
            this.l = str10;
            this.m = str11;
            this.n = str12;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            switch (i) {
                case 2:
                    return this.b;
                case 3:
                    return this.c;
                case 4:
                    return this.d;
                case 5:
                    return this.e;
                case 6:
                    return this.f;
                case 7:
                    return this.g;
                case 8:
                    return this.h;
                case 9:
                    return this.i;
                case 10:
                    return this.j;
                case 11:
                    return this.k;
                case 12:
                    return this.l;
                case 13:
                    return this.m;
                case 14:
                    return this.n;
                default:
                    throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
            }
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return o;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Names)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Names names = (Names) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : o.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!names.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(names.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (names.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            switch (i) {
                case 2:
                    this.b = str2;
                    break;
                case 3:
                    this.c = str2;
                    break;
                case 4:
                    this.d = str2;
                    break;
                case 5:
                    this.e = str2;
                    break;
                case 6:
                    this.f = str2;
                    break;
                case 7:
                    this.g = str2;
                    break;
                case 8:
                default:
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                case 9:
                    this.i = str2;
                    break;
                case 10:
                    this.j = str2;
                    break;
                case 11:
                    this.k = str2;
                    break;
                case 12:
                    this.l = str2;
                    break;
                case 13:
                    this.m = str2;
                    break;
                case 14:
                    this.n = str2;
                    break;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 8) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.h = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : o.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                atzr.v(parcel, 6, this.f, true);
            }
            if (set.contains(7)) {
                atzr.v(parcel, 7, this.g, true);
            }
            if (set.contains(8)) {
                atzr.t(parcel, 8, this.h, i, true);
            }
            if (set.contains(9)) {
                atzr.v(parcel, 9, this.i, true);
            }
            if (set.contains(10)) {
                atzr.v(parcel, 10, this.j, true);
            }
            if (set.contains(11)) {
                atzr.v(parcel, 11, this.k, true);
            }
            if (set.contains(12)) {
                atzr.v(parcel, 12, this.l, true);
            }
            if (set.contains(13)) {
                atzr.v(parcel, 13, this.m, true);
            }
            if (set.contains(14)) {
                atzr.v(parcel, 14, this.n, true);
            }
            atzr.c(parcel, a);
        }

        public Names() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Nicknames extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyuz();
        private static final HashMap e;
        final Set a;
        Mergedpeoplemetadata b;
        String c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 2, Mergedpeoplemetadata.class));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 3, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 4, null));
        }

        public Nicknames(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return e;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Nicknames)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Nicknames nicknames = (Nicknames) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!nicknames.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(nicknames.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (nicknames.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = str2;
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.d = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.b = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.t(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            atzr.c(parcel, a);
        }

        public Nicknames() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Occupations extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyva();
        private static final HashMap d;
        final Set a;
        Mergedpeoplemetadata b;
        String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 2, Mergedpeoplemetadata.class));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 3, null));
        }

        public Occupations(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        @Override // defpackage.aulm
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

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return d;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Occupations)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Occupations occupations = (Occupations) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!occupations.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(occupations.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (occupations.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.c = str2;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.b = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.t(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            atzr.c(parcel, a);
        }

        public Occupations() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Organizations extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyvb();
        private static final HashMap o;
        final Set a;
        boolean b;
        String c;
        String d;
        String e;
        String f;
        String g;
        Mergedpeoplemetadata h;
        String i;
        String j;
        String k;
        String l;
        String m;
        String n;

        static {
            HashMap hashMap = new HashMap();
            o = hashMap;
            hashMap.put("current", new FastJsonResponse$Field(6, false, 6, false, "current", 2, null));
            hashMap.put("department", new FastJsonResponse$Field(7, false, 7, false, "department", 3, null));
            hashMap.put("description", new FastJsonResponse$Field(7, false, 7, false, "description", 4, null));
            hashMap.put("domain", new FastJsonResponse$Field(7, false, 7, false, "domain", 5, null));
            hashMap.put("endDate", new FastJsonResponse$Field(7, false, 7, false, "endDate", 6, null));
            hashMap.put("location", new FastJsonResponse$Field(7, false, 7, false, "location", 8, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 9, Mergedpeoplemetadata.class));
            hashMap.put("name", new FastJsonResponse$Field(7, false, 7, false, "name", 10, null));
            hashMap.put("phoneticName", new FastJsonResponse$Field(7, false, 7, false, "phoneticName", 11, null));
            hashMap.put("startDate", new FastJsonResponse$Field(7, false, 7, false, "startDate", 12, null));
            hashMap.put("symbol", new FastJsonResponse$Field(7, false, 7, false, "symbol", 14, null));
            hashMap.put("title", new FastJsonResponse$Field(7, false, 7, false, "title", 15, null));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 16, null));
        }

        public Organizations(Set set, boolean z, String str, String str2, String str3, String str4, String str5, Mergedpeoplemetadata mergedpeoplemetadata, String str6, String str7, String str8, String str9, String str10, String str11) {
            this.a = set;
            this.b = z;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
            this.g = str5;
            this.h = mergedpeoplemetadata;
            this.i = str6;
            this.j = str7;
            this.k = str8;
            this.l = str9;
            this.m = str10;
            this.n = str11;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            switch (i) {
                case 2:
                    return Boolean.valueOf(this.b);
                case 3:
                    return this.c;
                case 4:
                    return this.d;
                case 5:
                    return this.e;
                case 6:
                    return this.f;
                case 7:
                case 13:
                default:
                    throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
                case 8:
                    return this.g;
                case 9:
                    return this.h;
                case 10:
                    return this.i;
                case 11:
                    return this.j;
                case 12:
                    return this.k;
                case 14:
                    return this.l;
                case 15:
                    return this.m;
                case 16:
                    return this.n;
            }
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return o;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Organizations)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Organizations organizations = (Organizations) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : o.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!organizations.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(organizations.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (organizations.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            switch (i) {
                case 3:
                    this.c = str2;
                    break;
                case 4:
                    this.d = str2;
                    break;
                case 5:
                    this.e = str2;
                    break;
                case 6:
                    this.f = str2;
                    break;
                case 7:
                case 9:
                case 13:
                default:
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                case 8:
                    this.g = str2;
                    break;
                case 10:
                    this.i = str2;
                    break;
                case 11:
                    this.j = str2;
                    break;
                case 12:
                    this.k = str2;
                    break;
                case 14:
                    this.l = str2;
                    break;
                case 15:
                    this.m = str2;
                    break;
                case 16:
                    this.n = str2;
                    break;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 9) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.h = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
            }
            this.b = z;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : o.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.e(parcel, 2, this.b);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                atzr.v(parcel, 6, this.f, true);
            }
            if (set.contains(8)) {
                atzr.v(parcel, 8, this.g, true);
            }
            if (set.contains(9)) {
                atzr.t(parcel, 9, this.h, i, true);
            }
            if (set.contains(10)) {
                atzr.v(parcel, 10, this.i, true);
            }
            if (set.contains(11)) {
                atzr.v(parcel, 11, this.j, true);
            }
            if (set.contains(12)) {
                atzr.v(parcel, 12, this.k, true);
            }
            if (set.contains(14)) {
                atzr.v(parcel, 14, this.l, true);
            }
            if (set.contains(15)) {
                atzr.v(parcel, 15, this.m, true);
            }
            if (set.contains(16)) {
                atzr.v(parcel, 16, this.n, true);
            }
            atzr.c(parcel, a);
        }

        public Organizations() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class OtherKeywords extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyvc();
        private static final HashMap e;
        final Set a;
        Mergedpeoplemetadata b;
        String c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 2, Mergedpeoplemetadata.class));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 3, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 4, null));
        }

        public OtherKeywords(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return e;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof OtherKeywords)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            OtherKeywords otherKeywords = (OtherKeywords) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!otherKeywords.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(otherKeywords.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (otherKeywords.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = str2;
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.d = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.b = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.t(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            atzr.c(parcel, a);
        }

        public OtherKeywords() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class PhoneNumbers extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyvd();
        private static final HashMap g;
        final Set a;
        String b;
        String c;
        Mergedpeoplemetadata d;
        String e;
        public String f;

        static {
            HashMap hashMap = new HashMap();
            g = hashMap;
            hashMap.put("canonicalizedForm", new FastJsonResponse$Field(7, false, 7, false, "canonicalizedForm", 2, null));
            hashMap.put("formattedType", new FastJsonResponse$Field(7, false, 7, false, "formattedType", 4, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 5, Mergedpeoplemetadata.class));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 6, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 8, null));
        }

        public PhoneNumbers(Set set, String str, String str2, Mergedpeoplemetadata mergedpeoplemetadata, String str3, String str4) {
            this.a = set;
            this.b = str;
            this.c = str2;
            this.d = mergedpeoplemetadata;
            this.e = str3;
            this.f = str4;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 8) {
                return this.f;
            }
            if (i == 4) {
                return this.c;
            }
            if (i == 5) {
                return this.d;
            }
            if (i == 6) {
                return this.e;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return g;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof PhoneNumbers)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            PhoneNumbers phoneNumbers = (PhoneNumbers) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!phoneNumbers.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(phoneNumbers.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (phoneNumbers.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 4) {
                this.c = str2;
            } else if (i == 6) {
                this.e = str2;
            } else {
                if (i != 8) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.f = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 5) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.d = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.c, true);
            }
            if (set.contains(5)) {
                atzr.t(parcel, 5, this.d, i, true);
            }
            if (set.contains(6)) {
                atzr.v(parcel, 6, this.e, true);
            }
            if (set.contains(8)) {
                atzr.v(parcel, 8, this.f, true);
            }
            atzr.c(parcel, a);
        }

        public PhoneNumbers() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class PlacesLived extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyve();
        private static final HashMap e;
        final Set a;
        boolean b;
        Mergedpeoplemetadata c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("current", new FastJsonResponse$Field(6, false, 6, false, "current", 2, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 3, Mergedpeoplemetadata.class));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 4, null));
        }

        public PlacesLived(Set set, boolean z, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = z;
            this.c = mergedpeoplemetadata;
            this.d = str;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return Boolean.valueOf(this.b);
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return e;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof PlacesLived)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            PlacesLived placesLived = (PlacesLived) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!placesLived.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(placesLived.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (placesLived.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i != 4) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.d = str2;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.c = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
            }
            this.b = z;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.e(parcel, 2, this.b);
            }
            if (set.contains(3)) {
                atzr.t(parcel, 3, this.c, i, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            atzr.c(parcel, a);
        }

        public PlacesLived() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Relations extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyvf();
        private static final HashMap f;
        final Set a;
        String b;
        Mergedpeoplemetadata c;
        String d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("formattedType", new FastJsonResponse$Field(7, false, 7, false, "formattedType", 2, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 3, Mergedpeoplemetadata.class));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 4, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 5, null));
        }

        public Relations(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
            this.e = str3;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            if (i == 5) {
                return this.e;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return f;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Relations)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Relations relations = (Relations) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!relations.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(relations.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (relations.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 4) {
                this.d = str2;
            } else {
                if (i != 5) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.e = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.c = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.t(parcel, 3, this.c, i, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.e, true);
            }
            atzr.c(parcel, a);
        }

        public Relations() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class SipAddress extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyvg();
        private static final HashMap e;
        final Set a;
        Mergedpeoplemetadata b;
        String c;
        String d;

        static {
            HashMap hashMap = new HashMap();
            e = hashMap;
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 2, Mergedpeoplemetadata.class));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 3, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 4, null));
        }

        public SipAddress(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str, String str2) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
            this.d = str2;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return e;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof SipAddress)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            SipAddress sipAddress = (SipAddress) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!sipAddress.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(sipAddress.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (sipAddress.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = str2;
            } else {
                if (i != 4) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.d = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.b = (Mergedpeoplemetadata) aulmVar;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.t(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            atzr.c(parcel, a);
        }

        public SipAddress() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Skills extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyvh();
        private static final HashMap d;
        final Set a;
        Mergedpeoplemetadata b;
        String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 2, Mergedpeoplemetadata.class));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 3, null));
        }

        public Skills(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        @Override // defpackage.aulm
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

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return d;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Skills)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Skills skills = (Skills) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!skills.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(skills.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (skills.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.c = str2;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.b = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.t(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            atzr.c(parcel, a);
        }

        public Skills() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class SortKeys extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyvi();
        private static final HashMap g;
        final Set a;
        List b;
        String c;
        String d;
        String e;
        String f;

        static {
            HashMap hashMap = new HashMap();
            g = hashMap;
            hashMap.put("affinities", new FastJsonResponse$Field(11, true, 11, true, "affinities", 2, Mergedpeopleaffinities.class));
            hashMap.put("firstName", new FastJsonResponse$Field(7, false, 7, false, "firstName", 3, null));
            hashMap.put("interactionRank", new FastJsonResponse$Field(7, false, 7, false, "interactionRank", 4, null));
            hashMap.put("lastName", new FastJsonResponse$Field(7, false, 7, false, "lastName", 5, null));
            hashMap.put("name", new FastJsonResponse$Field(7, false, 7, false, "name", 6, null));
        }

        public SortKeys(Set set, List list, String str, String str2, String str3, String str4) {
            this.a = set;
            this.b = list;
            this.c = str;
            this.d = str2;
            this.e = str3;
            this.f = str4;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 4) {
                return this.d;
            }
            if (i == 5) {
                return this.e;
            }
            if (i == 6) {
                return this.f;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return g;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof SortKeys)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            SortKeys sortKeys = (SortKeys) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!sortKeys.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(sortKeys.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (sortKeys.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 3) {
                this.c = str2;
            } else if (i == 4) {
                this.d = str2;
            } else if (i == 5) {
                this.e = str2;
            } else {
                if (i != 6) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.f = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.I(arrayList != null ? arrayList.getClass().getCanonicalName() : "null", i, "Field with id=", " is not a known array of custom type.  Found ", "."));
            }
            this.b = arrayList;
            this.a.add(Integer.valueOf(i));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : g.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Set set = this.a;
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.y(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            if (set.contains(4)) {
                atzr.v(parcel, 4, this.d, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.e, true);
            }
            if (set.contains(6)) {
                atzr.v(parcel, 6, this.f, true);
            }
            atzr.c(parcel, a);
        }

        public SortKeys() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Taglines extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyvj();
        private static final HashMap d;
        final Set a;
        Mergedpeoplemetadata b;
        String c;

        static {
            HashMap hashMap = new HashMap();
            d = hashMap;
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 2, Mergedpeoplemetadata.class));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 3, null));
        }

        public Taglines(Set set, Mergedpeoplemetadata mergedpeoplemetadata, String str) {
            this.a = set;
            this.b = mergedpeoplemetadata;
            this.c = str;
        }

        @Override // defpackage.aulm
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

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return d;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Taglines)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Taglines taglines = (Taglines) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : d.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!taglines.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(taglines.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (taglines.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.c = str2;
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 2) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.b = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.t(parcel, 2, this.b, i, true);
            }
            if (set.contains(3)) {
                atzr.v(parcel, 3, this.c, true);
            }
            atzr.c(parcel, a);
        }

        public Taglines() {
            this.a = new HashSet();
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class Urls extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cyvk();
        private static final HashMap f;
        final Set a;
        String b;
        Mergedpeoplemetadata c;
        String d;
        String e;

        static {
            HashMap hashMap = new HashMap();
            f = hashMap;
            hashMap.put("formattedType", new FastJsonResponse$Field(7, false, 7, false, "formattedType", 2, null));
            hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 3, Mergedpeoplemetadata.class));
            hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 5, null));
            hashMap.put("value", new FastJsonResponse$Field(7, false, 7, false, "value", 6, null));
        }

        public Urls(Set set, String str, Mergedpeoplemetadata mergedpeoplemetadata, String str2, String str3) {
            this.a = set;
            this.b = str;
            this.c = mergedpeoplemetadata;
            this.d = str2;
            this.e = str3;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                return this.b;
            }
            if (i == 3) {
                return this.c;
            }
            if (i == 5) {
                return this.d;
            }
            if (i == 6) {
                return this.e;
            }
            throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return f;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof Urls)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            Urls urls = (Urls) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!urls.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(urls.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (urls.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // defpackage.aulm
        protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
            int i = fastJsonResponse$Field.g;
            if (i == 2) {
                this.b = str2;
            } else if (i == 5) {
                this.d = str2;
            } else {
                if (i != 6) {
                    throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
                }
                this.e = str2;
            }
            this.a.add(Integer.valueOf(i));
        }

        @Override // defpackage.aulm
        public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
            int i = fastJsonResponse$Field.g;
            if (i != 3) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.c = (Mergedpeoplemetadata) aulmVar;
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
            int a = atzr.a(parcel);
            if (set.contains(2)) {
                atzr.v(parcel, 2, this.b, true);
            }
            if (set.contains(3)) {
                atzr.t(parcel, 3, this.c, i, true);
            }
            if (set.contains(5)) {
                atzr.v(parcel, 5, this.d, true);
            }
            if (set.contains(6)) {
                atzr.v(parcel, 6, this.e, true);
            }
            atzr.c(parcel, a);
        }

        public Urls() {
            this.a = new HashSet();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        M = hashMap;
        hashMap.put("abouts", new FastJsonResponse$Field(11, true, 11, true, "abouts", 2, Abouts.class));
        hashMap.put("addresses", new FastJsonResponse$Field(11, true, 11, true, "addresses", 3, Addresses.class));
        hashMap.put("birthdays", new FastJsonResponse$Field(11, true, 11, true, "birthdays", 5, Birthdays.class));
        hashMap.put("braggingRights", new FastJsonResponse$Field(11, true, 11, true, "braggingRights", 6, BraggingRights.class));
        hashMap.put("calendars", new FastJsonResponse$Field(11, true, 11, true, "calendars", 7, Calendars.class));
        hashMap.put("clientData", new FastJsonResponse$Field(11, true, 11, true, "clientData", 8, ClientData.class));
        hashMap.put("coverPhotos", new FastJsonResponse$Field(11, true, 11, true, "coverPhotos", 9, CoverPhotos.class));
        hashMap.put("customFields", new FastJsonResponse$Field(11, true, 11, true, "customFields", 10, CustomFields.class));
        hashMap.put("emails", new FastJsonResponse$Field(11, true, 11, true, "emails", 11, Emails.class));
        hashMap.put("etag", new FastJsonResponse$Field(7, false, 7, false, "etag", 12, null));
        hashMap.put("events", new FastJsonResponse$Field(11, true, 11, true, "events", 13, Events.class));
        hashMap.put("extendedData", new FastJsonResponse$Field(11, false, 11, false, "extendedData", 14, ExtendedData.class));
        hashMap.put("externalIds", new FastJsonResponse$Field(11, true, 11, true, "externalIds", 15, ExternalIds.class));
        hashMap.put("genders", new FastJsonResponse$Field(11, true, 11, true, "genders", 17, Genders.class));
        hashMap.put("id", new FastJsonResponse$Field(7, false, 7, false, "id", 18, null));
        hashMap.put("images", new FastJsonResponse$Field(11, true, 11, true, "images", 19, Images.class));
        hashMap.put("instantMessaging", new FastJsonResponse$Field(11, true, 11, true, "instantMessaging", 21, InstantMessaging.class));
        hashMap.put("interests", new FastJsonResponse$Field(11, true, 11, true, "interests", 22, Interests.class));
        hashMap.put("language", new FastJsonResponse$Field(7, false, 7, false, "language", 24, null));
        hashMap.put("languages", new FastJsonResponse$Field(11, true, 11, true, "languages", 25, Languages.class));
        hashMap.put("legacyFields", new FastJsonResponse$Field(11, false, 11, false, "legacyFields", 26, LegacyFields.class));
        hashMap.put("memberships", new FastJsonResponse$Field(11, true, 11, true, "memberships", 28, Memberships.class));
        hashMap.put("metadata", new FastJsonResponse$Field(11, false, 11, false, "metadata", 29, Metadata.class));
        hashMap.put("names", new FastJsonResponse$Field(11, true, 11, true, "names", 30, Names.class));
        hashMap.put("nicknames", new FastJsonResponse$Field(11, true, 11, true, "nicknames", 31, Nicknames.class));
        hashMap.put("occupations", new FastJsonResponse$Field(11, true, 11, true, "occupations", 32, Occupations.class));
        hashMap.put("organizations", new FastJsonResponse$Field(11, true, 11, true, "organizations", 33, Organizations.class));
        hashMap.put("otherKeywords", new FastJsonResponse$Field(11, true, 11, true, "otherKeywords", 34, OtherKeywords.class));
        hashMap.put("phoneNumbers", new FastJsonResponse$Field(11, true, 11, true, "phoneNumbers", 36, PhoneNumbers.class));
        hashMap.put("placesLived", new FastJsonResponse$Field(11, true, 11, true, "placesLived", 38, PlacesLived.class));
        hashMap.put("profileUrl", new FastJsonResponse$Field(7, false, 7, false, "profileUrl", 39, null));
        hashMap.put("relations", new FastJsonResponse$Field(11, true, 11, true, "relations", 40, Relations.class));
        hashMap.put("sipAddress", new FastJsonResponse$Field(11, true, 11, true, "sipAddress", 43, SipAddress.class));
        hashMap.put("skills", new FastJsonResponse$Field(11, true, 11, true, "skills", 44, Skills.class));
        hashMap.put("sortKeys", new FastJsonResponse$Field(11, false, 11, false, "sortKeys", 45, SortKeys.class));
        hashMap.put("taglines", new FastJsonResponse$Field(11, true, 11, true, "taglines", 46, Taglines.class));
        hashMap.put("urls", new FastJsonResponse$Field(11, true, 11, true, "urls", 47, Urls.class));
    }

    public Person(Set set, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, String str, List list10, ExtendedData extendedData, List list11, List list12, String str2, List list13, List list14, List list15, String str3, List list16, LegacyFields legacyFields, List list17, Metadata metadata, List list18, List list19, List list20, List list21, List list22, List list23, List list24, String str4, List list25, List list26, List list27, SortKeys sortKeys, List list28, List list29) {
        this.a = set;
        this.b = list;
        this.c = list2;
        this.d = list3;
        this.e = list4;
        this.f = list5;
        this.g = list6;
        this.h = list7;
        this.i = list8;
        this.j = list9;
        this.k = str;
        this.l = list10;
        this.m = extendedData;
        this.n = list11;
        this.o = list12;
        this.p = str2;
        this.q = list13;
        this.r = list14;
        this.s = list15;
        this.t = str3;
        this.u = list16;
        this.v = legacyFields;
        this.w = list17;
        this.x = metadata;
        this.y = list18;
        this.z = list19;
        this.A = list20;
        this.B = list21;
        this.C = list22;
        this.D = list23;
        this.E = list24;
        this.F = str4;
        this.G = list25;
        this.H = list26;
        this.I = list27;
        this.J = sortKeys;
        this.K = list28;
        this.L = list29;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 2:
                return this.b;
            case 3:
                return this.c;
            case 4:
            case 16:
            case fywe.t /* 20 */:
            case fywe.w /* 23 */:
            case fywe.A /* 27 */:
            case fywe.I /* 35 */:
            case fywe.K /* 37 */:
            case 41:
            case 42:
            default:
                throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
            case 5:
                return this.d;
            case 6:
                return this.e;
            case 7:
                return this.f;
            case 8:
                return this.g;
            case 9:
                return this.h;
            case 10:
                return this.i;
            case 11:
                return this.j;
            case 12:
                return this.k;
            case 13:
                return this.l;
            case 14:
                return this.m;
            case 15:
                return this.n;
            case fywe.q /* 17 */:
                return this.o;
            case 18:
                return this.p;
            case 19:
                return this.q;
            case fywe.u /* 21 */:
                return this.r;
            case fywe.v /* 22 */:
                return this.s;
            case fywe.x /* 24 */:
                return this.t;
            case fywe.y /* 25 */:
                return this.u;
            case 26:
                return this.v;
            case fywe.B /* 28 */:
                return this.w;
            case fywe.C /* 29 */:
                return this.x;
            case fywe.D /* 30 */:
                return this.y;
            case fywe.E /* 31 */:
                return this.z;
            case 32:
                return this.A;
            case fywe.G /* 33 */:
                return this.B;
            case fywe.H /* 34 */:
                return this.C;
            case fywe.J /* 36 */:
                return this.D;
            case fywe.L /* 38 */:
                return this.E;
            case fywe.M /* 39 */:
                return this.F;
            case 40:
                return this.G;
            case 43:
                return this.H;
            case 44:
                return this.I;
            case 45:
                return this.J;
            case 46:
                return this.K;
            case 47:
                return this.L;
        }
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return M;
    }

    @Override // defpackage.aulm
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
        for (FastJsonResponse$Field fastJsonResponse$Field : M.values()) {
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

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 12) {
            this.k = str2;
        } else if (i == 18) {
            this.p = str2;
        } else if (i == 24) {
            this.t = str2;
        } else {
            if (i != 39) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.F = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 2:
                this.b = arrayList;
                break;
            case 3:
                this.c = arrayList;
                break;
            case 4:
            case 12:
            case 14:
            case 16:
            case 18:
            case fywe.t /* 20 */:
            case fywe.w /* 23 */:
            case fywe.x /* 24 */:
            case 26:
            case fywe.A /* 27 */:
            case fywe.C /* 29 */:
            case fywe.I /* 35 */:
            case fywe.K /* 37 */:
            case fywe.M /* 39 */:
            case 41:
            case 42:
            case 45:
            default:
                throw new IllegalArgumentException(a.I(arrayList != null ? arrayList.getClass().getCanonicalName() : "null", i, "Field with id=", " is not a known array of custom type.  Found ", "."));
            case 5:
                this.d = arrayList;
                break;
            case 6:
                this.e = arrayList;
                break;
            case 7:
                this.f = arrayList;
                break;
            case 8:
                this.g = arrayList;
                break;
            case 9:
                this.h = arrayList;
                break;
            case 10:
                this.i = arrayList;
                break;
            case 11:
                this.j = arrayList;
                break;
            case 13:
                this.l = arrayList;
                break;
            case 15:
                this.n = arrayList;
                break;
            case fywe.q /* 17 */:
                this.o = arrayList;
                break;
            case 19:
                this.q = arrayList;
                break;
            case fywe.u /* 21 */:
                this.r = arrayList;
                break;
            case fywe.v /* 22 */:
                this.s = arrayList;
                break;
            case fywe.y /* 25 */:
                this.u = arrayList;
                break;
            case fywe.B /* 28 */:
                this.w = arrayList;
                break;
            case fywe.D /* 30 */:
                this.y = arrayList;
                break;
            case fywe.E /* 31 */:
                this.z = arrayList;
                break;
            case 32:
                this.A = arrayList;
                break;
            case fywe.G /* 33 */:
                this.B = arrayList;
                break;
            case fywe.H /* 34 */:
                this.C = arrayList;
                break;
            case fywe.J /* 36 */:
                this.D = arrayList;
                break;
            case fywe.L /* 38 */:
                this.E = arrayList;
                break;
            case 40:
                this.G = arrayList;
                break;
            case 43:
                this.H = arrayList;
                break;
            case 44:
                this.I = arrayList;
                break;
            case 46:
                this.K = arrayList;
                break;
            case 47:
                this.L = arrayList;
                break;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
        int i = fastJsonResponse$Field.g;
        if (i == 14) {
            this.m = (ExtendedData) aulmVar;
        } else if (i == 26) {
            this.v = (LegacyFields) aulmVar;
        } else if (i == 29) {
            this.x = (Metadata) aulmVar;
        } else {
            if (i != 45) {
                throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
            }
            this.J = (SortKeys) aulmVar;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : M.values()) {
            if (e(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.y(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.y(parcel, 3, this.c, true);
        }
        if (set.contains(5)) {
            atzr.y(parcel, 5, this.d, true);
        }
        if (set.contains(6)) {
            atzr.y(parcel, 6, this.e, true);
        }
        if (set.contains(7)) {
            atzr.y(parcel, 7, this.f, true);
        }
        if (set.contains(8)) {
            atzr.y(parcel, 8, this.g, true);
        }
        if (set.contains(9)) {
            atzr.y(parcel, 9, this.h, true);
        }
        if (set.contains(10)) {
            atzr.y(parcel, 10, this.i, true);
        }
        if (set.contains(11)) {
            atzr.y(parcel, 11, this.j, true);
        }
        if (set.contains(12)) {
            atzr.v(parcel, 12, this.k, true);
        }
        if (set.contains(13)) {
            atzr.y(parcel, 13, this.l, true);
        }
        if (set.contains(14)) {
            atzr.t(parcel, 14, this.m, i, true);
        }
        if (set.contains(15)) {
            atzr.y(parcel, 15, this.n, true);
        }
        if (set.contains(17)) {
            atzr.y(parcel, 17, this.o, true);
        }
        if (set.contains(18)) {
            atzr.v(parcel, 18, this.p, true);
        }
        if (set.contains(19)) {
            atzr.y(parcel, 19, this.q, true);
        }
        if (set.contains(21)) {
            atzr.y(parcel, 21, this.r, true);
        }
        if (set.contains(22)) {
            atzr.y(parcel, 22, this.s, true);
        }
        if (set.contains(24)) {
            atzr.v(parcel, 24, this.t, true);
        }
        if (set.contains(25)) {
            atzr.y(parcel, 25, this.u, true);
        }
        if (set.contains(26)) {
            atzr.t(parcel, 26, this.v, i, true);
        }
        if (set.contains(28)) {
            atzr.y(parcel, 28, this.w, true);
        }
        if (set.contains(29)) {
            atzr.t(parcel, 29, this.x, i, true);
        }
        if (set.contains(30)) {
            atzr.y(parcel, 30, this.y, true);
        }
        if (set.contains(31)) {
            atzr.y(parcel, 31, this.z, true);
        }
        if (set.contains(32)) {
            atzr.y(parcel, 32, this.A, true);
        }
        if (set.contains(33)) {
            atzr.y(parcel, 33, this.B, true);
        }
        if (set.contains(34)) {
            atzr.y(parcel, 34, this.C, true);
        }
        if (set.contains(36)) {
            atzr.y(parcel, 36, this.D, true);
        }
        if (set.contains(38)) {
            atzr.y(parcel, 38, this.E, true);
        }
        if (set.contains(39)) {
            atzr.v(parcel, 39, this.F, true);
        }
        if (set.contains(40)) {
            atzr.y(parcel, 40, this.G, true);
        }
        if (set.contains(43)) {
            atzr.y(parcel, 43, this.H, true);
        }
        if (set.contains(44)) {
            atzr.y(parcel, 44, this.I, true);
        }
        if (set.contains(45)) {
            atzr.t(parcel, 45, this.J, i, true);
        }
        if (set.contains(46)) {
            atzr.y(parcel, 46, this.K, true);
        }
        if (set.contains(47)) {
            atzr.y(parcel, 47, this.L, true);
        }
        atzr.c(parcel, a);
    }

    public Person() {
        this.a = new HashSet();
    }
}

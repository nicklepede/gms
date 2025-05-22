package com.google.android.gms.plus.service.v2whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.atzr;
import defpackage.aulm;
import defpackage.cytv;
import defpackage.cytw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class Mergedpeoplemetadata extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new cytv();
    private static final HashMap n;
    final Set a;
    List b;
    String c;
    String d;
    String e;
    boolean f;
    boolean g;
    List h;
    Mergedpeoplefieldacl i;
    public boolean j;
    boolean k;
    String l;
    boolean m;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class EdgeKeyInfo extends FastSafeParcelableJsonResponse {
        public static final Parcelable.Creator CREATOR = new cytw();
        private static final HashMap b = new HashMap();
        final Set a;

        public EdgeKeyInfo(Set set) {
            this.a = set;
        }

        @Override // defpackage.aulm
        protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
            throw new IllegalStateException("Unknown safe parcelable id=" + fastJsonResponse$Field.g);
        }

        @Override // defpackage.aulm
        public final /* synthetic */ Map b() {
            return b;
        }

        @Override // defpackage.aulm
        protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
            return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final boolean equals(Object obj) {
            if (!(obj instanceof EdgeKeyInfo)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            EdgeKeyInfo edgeKeyInfo = (EdgeKeyInfo) obj;
            for (FastJsonResponse$Field fastJsonResponse$Field : b.values()) {
                if (e(fastJsonResponse$Field)) {
                    if (!edgeKeyInfo.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(edgeKeyInfo.a(fastJsonResponse$Field))) {
                        return false;
                    }
                } else if (edgeKeyInfo.e(fastJsonResponse$Field)) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
        public final int hashCode() {
            int i = 0;
            for (FastJsonResponse$Field fastJsonResponse$Field : b.values()) {
                if (e(fastJsonResponse$Field)) {
                    i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
                }
            }
            return i;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            atzr.c(parcel, atzr.a(parcel));
        }

        public EdgeKeyInfo() {
            this.a = new HashSet();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        n = hashMap;
        hashMap.put("affinities", new FastJsonResponse$Field(11, true, 11, true, "affinities", 2, Mergedpeopleaffinities.class));
        hashMap.put("container", new FastJsonResponse$Field(7, false, 7, false, "container", 3, null));
        hashMap.put("containerContactId", new FastJsonResponse$Field(7, false, 7, false, "containerContactId", 4, null));
        hashMap.put("containerId", new FastJsonResponse$Field(7, false, 7, false, "containerId", 5, null));
        hashMap.put("container_primary", new FastJsonResponse$Field(6, false, 6, false, "container_primary", 6, null));
        hashMap.put("edgeKey", new FastJsonResponse$Field(6, false, 6, false, "edgeKey", 7, null));
        hashMap.put("edgeKeyInfo", new FastJsonResponse$Field(11, true, 11, true, "edgeKeyInfo", 8, EdgeKeyInfo.class));
        hashMap.put("fieldAcl", new FastJsonResponse$Field(11, false, 11, false, "fieldAcl", 9, Mergedpeoplefieldacl.class));
        hashMap.put("primary", new FastJsonResponse$Field(6, false, 6, false, "primary", 10, null));
        hashMap.put("verified", new FastJsonResponse$Field(6, false, 6, false, "verified", 11, null));
        hashMap.put("visibility", new FastJsonResponse$Field(7, false, 7, false, "visibility", 12, null));
        hashMap.put("writeable", new FastJsonResponse$Field(6, false, 6, false, "writeable", 13, null));
    }

    public Mergedpeoplemetadata(Set set, List list, String str, String str2, String str3, boolean z, boolean z2, List list2, Mergedpeoplefieldacl mergedpeoplefieldacl, boolean z3, boolean z4, String str4, boolean z5) {
        this.a = set;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = z;
        this.g = z2;
        this.h = list2;
        this.i = mergedpeoplefieldacl;
        this.j = z3;
        this.k = z4;
        this.l = str4;
        this.m = z5;
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
                return Boolean.valueOf(this.f);
            case 7:
                return Boolean.valueOf(this.g);
            case 8:
                return this.h;
            case 9:
                return this.i;
            case 10:
                return Boolean.valueOf(this.j);
            case 11:
                return Boolean.valueOf(this.k);
            case 12:
                return this.l;
            case 13:
                return Boolean.valueOf(this.m);
            default:
                throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return n;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof Mergedpeoplemetadata)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Mergedpeoplemetadata mergedpeoplemetadata = (Mergedpeoplemetadata) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : n.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!mergedpeoplemetadata.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(mergedpeoplemetadata.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (mergedpeoplemetadata.e(fastJsonResponse$Field)) {
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
            if (i != 12) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.l = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gK(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = arrayList;
        } else {
            if (i != 8) {
                throw new IllegalArgumentException(a.I(arrayList != null ? arrayList.getClass().getCanonicalName() : "null", i, "Field with id=", " is not a known array of custom type.  Found ", "."));
            }
            this.h = arrayList;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    public final void gL(FastJsonResponse$Field fastJsonResponse$Field, String str, aulm aulmVar) {
        int i = fastJsonResponse$Field.g;
        if (i != 9) {
            throw new IllegalArgumentException(a.ah(i, aulmVar, " is not a known custom type.  Found "));
        }
        this.i = (Mergedpeoplefieldacl) aulmVar;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 6) {
            this.f = z;
        } else if (i == 7) {
            this.g = z;
        } else if (i == 10) {
            this.j = z;
        } else if (i == 11) {
            this.k = z;
        } else {
            if (i != 13) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
            }
            this.m = z;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : n.values()) {
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
            atzr.e(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            atzr.e(parcel, 7, this.g);
        }
        if (set.contains(8)) {
            atzr.y(parcel, 8, this.h, true);
        }
        if (set.contains(9)) {
            atzr.t(parcel, 9, this.i, i, true);
        }
        if (set.contains(10)) {
            atzr.e(parcel, 10, this.j);
        }
        if (set.contains(11)) {
            atzr.e(parcel, 11, this.k);
        }
        if (set.contains(12)) {
            atzr.v(parcel, 12, this.l, true);
        }
        if (set.contains(13)) {
            atzr.e(parcel, 13, this.m);
        }
        atzr.c(parcel, a);
    }

    public Mergedpeoplemetadata() {
        this.a = new HashSet();
    }
}

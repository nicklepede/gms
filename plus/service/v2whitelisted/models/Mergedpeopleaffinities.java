package com.google.android.gms.plus.service.v2whitelisted.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.atzr;
import defpackage.cyto;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class Mergedpeopleaffinities extends FastSafeParcelableJsonResponse {
    public static final Parcelable.Creator CREATOR = new cyto();
    private static final HashMap e;
    final Set a;
    String b;
    String c;
    double d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("loggingId", new FastJsonResponse$Field(7, false, 7, false, "loggingId", 2, null));
        hashMap.put("type", new FastJsonResponse$Field(7, false, 7, false, "type", 3, null));
        hashMap.put("value", new FastJsonResponse$Field(4, false, 4, false, "value", 4, null));
    }

    public Mergedpeopleaffinities(Set set, String str, String str2, double d) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = d;
    }

    @Override // defpackage.aulm
    protected final void P(FastJsonResponse$Field fastJsonResponse$Field, String str, double d) {
        int i = fastJsonResponse$Field.g;
        if (i != 4) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a double."));
        }
        this.d = d;
        this.a.add(Integer.valueOf(i));
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
            return Double.valueOf(this.d);
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
        if (!(obj instanceof Mergedpeopleaffinities)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        Mergedpeopleaffinities mergedpeopleaffinities = (Mergedpeopleaffinities) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!mergedpeopleaffinities.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(mergedpeopleaffinities.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (mergedpeopleaffinities.e(fastJsonResponse$Field)) {
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
            atzr.j(parcel, 4, this.d);
        }
        atzr.c(parcel, a);
    }

    public Mergedpeopleaffinities() {
        this.a = new HashSet();
    }
}

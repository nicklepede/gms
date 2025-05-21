package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.acon;
import defpackage.acoo;
import defpackage.arxc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class BeaconSeedEntity extends FastSafeParcelableJsonResponse implements acon {
    public static final Parcelable.Creator CREATOR = new acoo();
    private static final HashMap e;
    final Set a;
    String b;
    long c;
    long d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("data", new FastJsonResponse$Field(7, false, 7, false, "data", 2, null));
        hashMap.put("endTimeMillis", new FastJsonResponse$Field(2, false, 2, false, "endTimeMillis", 3, null));
        hashMap.put("startTimeMillis", new FastJsonResponse$Field(2, false, 2, false, "startTimeMillis", 4, null));
    }

    public BeaconSeedEntity(Set set, String str, long j, long j2) {
        this.a = set;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return Long.valueOf(this.c);
        }
        if (i == 4) {
            return Long.valueOf(this.d);
        }
        throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return e;
    }

    @Override // defpackage.acon
    public final long c() {
        return this.c;
    }

    @Override // defpackage.acon
    public final long d() {
        return this.d;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof BeaconSeedEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        BeaconSeedEntity beaconSeedEntity = (BeaconSeedEntity) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : e.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!beaconSeedEntity.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(beaconSeedEntity.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (beaconSeedEntity.e(fastJsonResponse$Field)) {
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

    @Override // defpackage.acon
    public final String g() {
        return this.b;
    }

    @Override // defpackage.acon
    public final boolean h() {
        return this.a.contains(2);
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

    @Override // defpackage.acon
    public final boolean i() {
        return this.a.contains(3);
    }

    @Override // defpackage.acon
    public final boolean j() {
        return this.a.contains(4);
    }

    @Override // defpackage.ashs
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = j;
        } else {
            if (i != 4) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a long."));
            }
            this.d = j;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            arxc.q(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            arxc.q(parcel, 4, this.d);
        }
        arxc.c(parcel, a);
    }

    public BeaconSeedEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}

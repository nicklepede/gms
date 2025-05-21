package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.acop;
import defpackage.acoq;
import defpackage.arxc;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class DeviceClassifierEntity extends FastSafeParcelableJsonResponse implements acop {
    public static final Parcelable.Creator CREATOR = new acoq();
    private static final HashMap f;
    final Set a;
    long b;
    String c;
    long d;
    String e;

    static {
        HashMap hashMap = new HashMap();
        f = hashMap;
        hashMap.put("deviceOsVersionCode", new FastJsonResponse$Field(2, false, 2, false, "deviceOsVersionCode", 2, null));
        hashMap.put("deviceSoftwarePackage", new FastJsonResponse$Field(7, false, 7, false, "deviceSoftwarePackage", 3, null));
        hashMap.put("deviceSoftwareVersionCode", new FastJsonResponse$Field(2, false, 2, false, "deviceSoftwareVersionCode", 4, null));
        hashMap.put("deviceType", new FastJsonResponse$Field(7, false, 7, false, "deviceType", 5, null));
    }

    public DeviceClassifierEntity(Set set, long j, String str, long j2, String str2) {
        this.a = set;
        this.b = j;
        this.c = str;
        this.d = j2;
        this.e = str2;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return Long.valueOf(this.b);
        }
        if (i == 3) {
            return this.c;
        }
        if (i == 4) {
            return Long.valueOf(this.d);
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
        if (!(obj instanceof DeviceClassifierEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        DeviceClassifierEntity deviceClassifierEntity = (DeviceClassifierEntity) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : f.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!deviceClassifierEntity.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(deviceClassifierEntity.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (deviceClassifierEntity.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = str2;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.e = str2;
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

    @Override // defpackage.ashs
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = j;
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
            arxc.q(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            arxc.v(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            arxc.q(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            arxc.v(parcel, 5, this.e, true);
        }
        arxc.c(parcel, a);
    }

    public DeviceClassifierEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}

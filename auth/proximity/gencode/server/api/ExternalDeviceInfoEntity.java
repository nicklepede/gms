package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.acos;
import defpackage.acot;
import defpackage.arxc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class ExternalDeviceInfoEntity extends FastSafeParcelableJsonResponse implements acos {
    public static final Parcelable.Creator CREATOR = new acot();
    private static final HashMap p;
    final Set a;
    boolean b;
    List c;
    String d;
    String e;
    List f;
    String g;
    long h;
    boolean i;
    String j;
    boolean k;
    String l;
    List m;
    boolean n;
    boolean o;

    static {
        HashMap hashMap = new HashMap();
        p = hashMap;
        hashMap.put("arcPlusPlus", new FastJsonResponse$Field(6, false, 6, false, "arcPlusPlus", 2, null));
        hashMap.put("beaconSeeds", new FastJsonResponse$Field(11, true, 11, true, "beaconSeeds", 3, BeaconSeedEntity.class));
        hashMap.put("bluetoothAddress", new FastJsonResponse$Field(7, false, 7, false, "bluetoothAddress", 4, null));
        hashMap.put("deviceType", new FastJsonResponse$Field(7, false, 7, false, "deviceType", 5, null));
        hashMap.put("enabledSoftwareFeatures", new FastJsonResponse$Field(7, true, 7, true, "enabledSoftwareFeatures", 6, null));
        hashMap.put("friendlyDeviceName", new FastJsonResponse$Field(7, false, 7, false, "friendlyDeviceName", 7, null));
        hashMap.put("lastUpdateTimeMillis", new FastJsonResponse$Field(2, false, 2, false, "lastUpdateTimeMillis", 8, null));
        hashMap.put("mobileHotspotSupported", new FastJsonResponse$Field(6, false, 6, false, "mobileHotspotSupported", 9, null));
        hashMap.put("noPiiDeviceName", new FastJsonResponse$Field(7, false, 7, false, "noPiiDeviceName", 10, null));
        hashMap.put("pixelPhone", new FastJsonResponse$Field(6, false, 6, false, "pixelPhone", 11, null));
        hashMap.put("publicKey", new FastJsonResponse$Field(7, false, 7, false, "publicKey", 12, null));
        hashMap.put("supportedSoftwareFeatures", new FastJsonResponse$Field(7, true, 7, true, "supportedSoftwareFeatures", 13, null));
        hashMap.put("unlockKey", new FastJsonResponse$Field(6, false, 6, false, "unlockKey", 14, null));
        hashMap.put("unlockable", new FastJsonResponse$Field(6, false, 6, false, "unlockable", 15, null));
    }

    public ExternalDeviceInfoEntity(Set set, boolean z, List list, String str, String str2, List list2, String str3, long j, boolean z2, String str4, boolean z3, String str5, List list3, boolean z4, boolean z5) {
        this.a = set;
        this.b = z;
        this.c = list;
        this.d = str;
        this.e = str2;
        this.f = list2;
        this.g = str3;
        this.h = j;
        this.i = z2;
        this.j = str4;
        this.k = z3;
        this.l = str5;
        this.m = list3;
        this.n = z4;
        this.o = z5;
    }

    @Override // defpackage.ashs
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
                return this.g;
            case 8:
                return Long.valueOf(this.h);
            case 9:
                return Boolean.valueOf(this.i);
            case 10:
                return this.j;
            case 11:
                return Boolean.valueOf(this.k);
            case 12:
                return this.l;
            case 13:
                return this.m;
            case 14:
                return Boolean.valueOf(this.n);
            case 15:
                return Boolean.valueOf(this.o);
            default:
                throw new IllegalStateException(a.j(i, "Unknown safe parcelable id="));
        }
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return p;
    }

    @Override // defpackage.acos
    public final long d() {
        return this.h;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (!(obj instanceof ExternalDeviceInfoEntity)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        ExternalDeviceInfoEntity externalDeviceInfoEntity = (ExternalDeviceInfoEntity) obj;
        for (FastJsonResponse$Field fastJsonResponse$Field : p.values()) {
            if (e(fastJsonResponse$Field)) {
                if (!externalDeviceInfoEntity.e(fastJsonResponse$Field) || !a(fastJsonResponse$Field).equals(externalDeviceInfoEntity.a(fastJsonResponse$Field))) {
                    return false;
                }
            } else if (externalDeviceInfoEntity.e(fastJsonResponse$Field)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.d = str2;
        } else if (i == 5) {
            this.e = str2;
        } else if (i == 7) {
            this.g = str2;
        } else if (i == 10) {
            this.j = str2;
        } else {
            if (i != 12) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a String."));
            }
            this.l = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.acos
    public final String g() {
        return this.d;
    }

    @Override // defpackage.ashs
    protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = z;
        } else if (i == 9) {
            this.i = z;
        } else if (i == 11) {
            this.k = z;
        } else if (i == 14) {
            this.n = z;
        } else {
            if (i != 15) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
            }
            this.o = z;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    public final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i != 3) {
            throw new IllegalArgumentException(a.F(arrayList != null ? arrayList.getClass().getCanonicalName() : "null", i, "Field with id=", " is not a known array of custom type.  Found ", "."));
        }
        this.c = arrayList;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gy(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i = fastJsonResponse$Field.g;
        if (i == 6) {
            this.f = arrayList;
        } else {
            if (i != 13) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be an array of String."));
            }
            this.m = arrayList;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        int i = 0;
        for (FastJsonResponse$Field fastJsonResponse$Field : p.values()) {
            if (e(fastJsonResponse$Field)) {
                i = i + fastJsonResponse$Field.g + a(fastJsonResponse$Field).hashCode();
            }
        }
        return i;
    }

    @Override // defpackage.acos
    public final String i() {
        return this.e;
    }

    @Override // defpackage.ashs
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i != 8) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a long."));
        }
        this.h = j;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.acos
    public final String m() {
        return this.g;
    }

    @Override // defpackage.acos
    public final String n() {
        return this.l;
    }

    @Override // defpackage.acos
    public final List o() {
        return this.c;
    }

    @Override // defpackage.acos
    public final List p() {
        return this.f;
    }

    @Override // defpackage.acos
    public final List q() {
        return this.m;
    }

    @Override // defpackage.acos
    public final boolean r() {
        return this.a.contains(6);
    }

    @Override // defpackage.acos
    public final boolean s() {
        return this.a.contains(12);
    }

    @Override // defpackage.acos
    public final boolean t() {
        return this.a.contains(13);
    }

    @Override // defpackage.acos
    public final boolean u() {
        return this.b;
    }

    @Override // defpackage.acos
    public final boolean v() {
        return this.i;
    }

    @Override // defpackage.acos
    public final boolean w() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.e(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            arxc.y(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            arxc.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            arxc.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            arxc.x(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            arxc.v(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            arxc.q(parcel, 8, this.h);
        }
        if (set.contains(9)) {
            arxc.e(parcel, 9, this.i);
        }
        if (set.contains(10)) {
            arxc.v(parcel, 10, this.j, true);
        }
        if (set.contains(11)) {
            arxc.e(parcel, 11, this.k);
        }
        if (set.contains(12)) {
            arxc.v(parcel, 12, this.l, true);
        }
        if (set.contains(13)) {
            arxc.x(parcel, 13, this.m, true);
        }
        if (set.contains(14)) {
            arxc.e(parcel, 14, this.n);
        }
        if (set.contains(15)) {
            arxc.e(parcel, 15, this.o);
        }
        arxc.c(parcel, a);
    }

    @Override // defpackage.acos
    public final boolean x() {
        return this.n;
    }

    @Override // defpackage.acos
    public final boolean y() {
        return this.o;
    }

    public ExternalDeviceInfoEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.arod
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}

package com.google.android.gms.auth.proximity.gencode.server.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import defpackage.a;
import defpackage.aeos;
import defpackage.aeot;
import defpackage.atzr;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class ExternalDeviceInfoEntity extends FastSafeParcelableJsonResponse implements aeos {
    public static final Parcelable.Creator CREATOR = new aeot();
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

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return p;
    }

    @Override // defpackage.aeos
    public final long d() {
        return this.h;
    }

    @Override // defpackage.aulm
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

    @Override // defpackage.aulm
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

    @Override // defpackage.aeos
    public final String g() {
        return this.d;
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

    @Override // defpackage.aulm
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
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

    @Override // defpackage.aeos
    public final String i() {
        return this.e;
    }

    @Override // defpackage.aulm
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i != 8) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a long."));
        }
        this.h = j;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aeos
    public final String m() {
        return this.g;
    }

    @Override // defpackage.aeos
    public final String n() {
        return this.l;
    }

    @Override // defpackage.aeos
    public final List o() {
        return this.c;
    }

    @Override // defpackage.aeos
    public final List p() {
        return this.f;
    }

    @Override // defpackage.aeos
    public final List q() {
        return this.m;
    }

    @Override // defpackage.aeos
    public final boolean r() {
        return this.a.contains(6);
    }

    @Override // defpackage.aeos
    public final boolean s() {
        return this.a.contains(12);
    }

    @Override // defpackage.aeos
    public final boolean t() {
        return this.a.contains(13);
    }

    @Override // defpackage.aeos
    public final boolean u() {
        return this.b;
    }

    @Override // defpackage.aeos
    public final boolean v() {
        return this.i;
    }

    @Override // defpackage.aeos
    public final boolean w() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.e(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            atzr.y(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            atzr.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            atzr.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            atzr.x(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            atzr.v(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            atzr.q(parcel, 8, this.h);
        }
        if (set.contains(9)) {
            atzr.e(parcel, 9, this.i);
        }
        if (set.contains(10)) {
            atzr.v(parcel, 10, this.j, true);
        }
        if (set.contains(11)) {
            atzr.e(parcel, 11, this.k);
        }
        if (set.contains(12)) {
            atzr.v(parcel, 12, this.l, true);
        }
        if (set.contains(13)) {
            atzr.x(parcel, 13, this.m, true);
        }
        if (set.contains(14)) {
            atzr.e(parcel, 14, this.n);
        }
        if (set.contains(15)) {
            atzr.e(parcel, 15, this.o);
        }
        atzr.c(parcel, a);
    }

    @Override // defpackage.aeos
    public final boolean x() {
        return this.n;
    }

    @Override // defpackage.aeos
    public final boolean y() {
        return this.o;
    }

    public ExternalDeviceInfoEntity() {
        this.a = new HashSet();
    }

    @Override // defpackage.atqs
    public final /* bridge */ /* synthetic */ Object l() {
        return this;
    }
}

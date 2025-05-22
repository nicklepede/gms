package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.atzr;
import defpackage.bsj;
import defpackage.dfin;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DeviceDetails extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfin();
    private static final Map l;
    public final Set a;
    public long b;
    public int c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public String h;
    public byte i;
    public String j;
    public String k;

    static {
        bsj bsjVar = new bsj();
        bsjVar.put("androidId", new FastJsonResponse$Field(2, false, 2, false, "androidId", 2, null));
        bsjVar.put("gmsVersion", new FastJsonResponse$Field(0, false, 0, false, "gmsVersion", 3, null));
        bsjVar.put("isSourceIos", new FastJsonResponse$Field(6, false, 6, false, "isSourceIos", 4, null));
        bsjVar.put("useEnrollment2", new FastJsonResponse$Field(6, false, 6, false, "useEnrollment2", 5, null));
        bsjVar.put("hasConnectivity", new FastJsonResponse$Field(6, false, 6, false, "hasConnectivity", 6, null));
        bsjVar.put("hasLockscreen", new FastJsonResponse$Field(6, false, 6, false, "hasLockscreen", 7, null));
        bsjVar.put("model", new FastJsonResponse$Field(7, false, 7, false, "model", 8, null));
        bsjVar.put("deviceType", new FastJsonResponse$Field(0, false, 0, false, "deviceType", 9, null));
        bsjVar.put("deviceFingerprint", new FastJsonResponse$Field(7, false, 7, false, "deviceFingerprint", 10, null));
        bsjVar.put("instanceId", new FastJsonResponse$Field(7, false, 7, false, "instanceId", 11, null));
        l = DesugarCollections.unmodifiableMap(bsjVar);
    }

    public DeviceDetails(Set set, long j, int i, boolean z, boolean z2, boolean z3, boolean z4, String str, byte b, String str2, String str3) {
        this.a = set;
        this.b = j;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str;
        this.i = b;
        this.j = str2;
        this.k = str3;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        switch (fastJsonResponse$Field.g) {
            case 2:
                return Long.valueOf(this.b);
            case 3:
                return Integer.valueOf(this.c);
            case 4:
                return Boolean.valueOf(this.d);
            case 5:
                return Boolean.valueOf(this.e);
            case 6:
                return Boolean.valueOf(this.f);
            case 7:
                return Boolean.valueOf(this.g);
            case 8:
                return this.h;
            case 9:
                return Byte.valueOf(this.i);
            case 10:
                return this.j;
            case 11:
                return this.k;
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // defpackage.aulm
    public final Map b() {
        return l;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i == 8) {
            this.h = str2;
        } else if (i == 10) {
            this.j = str2;
        } else {
            if (i != 11) {
                throw new IllegalArgumentException(String.format("Invalid id %s", Integer.valueOf(i)));
            }
            this.k = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = i;
        } else {
            if (i2 != 9) {
                throw new IllegalArgumentException(String.format("Invalid id %s", Integer.valueOf(i2)));
            }
            this.i = (byte) i;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.aulm
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.d = z;
        } else if (i == 5) {
            this.e = z;
        } else if (i == 6) {
            this.f = z;
        } else {
            if (i != 7) {
                throw new IllegalArgumentException(String.format("Invalid id %s", Integer.valueOf(i)));
            }
            this.g = z;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Invalid id %s", Integer.valueOf(i)));
        }
        this.b = j;
        this.a.add(Integer.valueOf(i));
    }

    public final void p(String str) {
        this.j = str;
        this.a.add(10);
    }

    public final void q(byte b) {
        this.i = b;
        this.a.add(9);
    }

    public final void r(boolean z) {
        this.f = z;
        this.a.add(6);
    }

    public final void s(boolean z) {
        this.g = z;
        this.a.add(7);
    }

    public final void t(String str) {
        this.h = str;
        this.a.add(8);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.q(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            atzr.o(parcel, 3, this.c);
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
        if (set.contains(7)) {
            atzr.e(parcel, 7, this.g);
        }
        if (set.contains(8)) {
            atzr.v(parcel, 8, this.h, true);
        }
        if (set.contains(9)) {
            atzr.h(parcel, 9, this.i);
        }
        if (set.contains(10)) {
            atzr.v(parcel, 10, this.j, true);
        }
        if (set.contains(11)) {
            atzr.v(parcel, 11, this.k, true);
        }
        atzr.c(parcel, a);
    }

    public DeviceDetails() {
        this.a = new HashSet();
    }

    public DeviceDetails(long j, int i) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = j;
        hashSet.add(2);
        this.c = i;
        hashSet.add(3);
        this.d = false;
        hashSet.add(4);
        this.e = true;
        hashSet.add(5);
    }
}

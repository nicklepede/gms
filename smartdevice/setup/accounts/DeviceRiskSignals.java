package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.decu;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DeviceRiskSignals extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new decu();
    private static final HashMap j;
    final Set a;
    public int b;
    public long c;
    public String d;
    public String e;
    public long f;
    public long g;
    public ScreenlockState h;
    public StarguardData i;

    static {
        HashMap hashMap = new HashMap();
        j = hashMap;
        hashMap.put("deviceType", new FastJsonResponse$Field(0, false, 0, false, "deviceType", 2, null));
        hashMap.put("androidDeviceId", new FastJsonResponse$Field(2, false, 2, false, "androidDeviceId", 3, null));
        hashMap.put("deviceModel", new FastJsonResponse$Field(7, false, 7, false, "deviceModel", 4, null));
        hashMap.put("deviceManufacturer", new FastJsonResponse$Field(7, false, 7, false, "deviceManufacturer", 5, null));
        hashMap.put("osMajorVersionCode", new FastJsonResponse$Field(2, false, 2, false, "osMajorVersionCode", 6, null));
        hashMap.put("softwareMajorVersionCode", new FastJsonResponse$Field(2, false, 2, false, "softwareMajorVersionCode", 7, null));
        hashMap.put("screenlockState", new FastJsonResponse$Field(11, false, 11, false, "screenlockState", 8, ScreenlockState.class));
        hashMap.put("starguardData", new FastJsonResponse$Field(11, false, 11, false, "starguardData", 9, StarguardData.class));
    }

    public DeviceRiskSignals(Set set, int i, long j2, String str, String str2, long j3, long j4, ScreenlockState screenlockState, StarguardData starguardData) {
        this.a = set;
        this.b = i;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = j3;
        this.g = j4;
        this.h = screenlockState;
        this.i = starguardData;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 2:
                return Integer.valueOf(this.b);
            case 3:
                return Long.valueOf(this.c);
            case 4:
                return this.d;
            case 5:
                return this.e;
            case 6:
                return Long.valueOf(this.f);
            case 7:
                return Long.valueOf(this.g);
            case 8:
                return this.h;
            case 9:
                return this.i;
            default:
                throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return j;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        if (str2 == null) {
            return;
        }
        int i = fastJsonResponse$Field.g;
        if (i == 4) {
            this.d = str2;
        } else {
            if (i != 5) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            this.e = str2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        int i = fastJsonResponse$Field.g;
        if (i == 8) {
            this.h = (ScreenlockState) ashsVar;
        } else {
            if (i != 9) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), ashsVar.getClass().getCanonicalName()));
            }
            this.i = (StarguardData) ashsVar;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 2) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
        }
        this.b = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j2) {
        int i = fastJsonResponse$Field.g;
        if (i == 3) {
            this.c = j2;
        } else if (i == 6) {
            this.f = j2;
        } else {
            if (i != 7) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be an long."));
            }
            this.g = j2;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.o(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            arxc.q(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            arxc.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            arxc.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            arxc.q(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            arxc.q(parcel, 7, this.g);
        }
        if (set.contains(8)) {
            arxc.t(parcel, 8, this.h, i, true);
        }
        if (set.contains(9)) {
            arxc.t(parcel, 9, this.i, i, true);
        }
        arxc.c(parcel, a);
    }

    public DeviceRiskSignals() {
        this.a = new HashSet();
    }

    public DeviceRiskSignals(long j2, String str, String str2, long j3, ScreenlockState screenlockState, StarguardData starguardData) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = 1;
        this.c = j2;
        this.d = str;
        this.e = str2;
        this.f = j3;
        this.g = 251661004L;
        this.h = screenlockState;
        this.i = starguardData;
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(4);
        hashSet.add(5);
        hashSet.add(6);
        hashSet.add(7);
        hashSet.add(8);
        hashSet.add(9);
    }
}

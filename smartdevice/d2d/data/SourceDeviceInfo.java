package com.google.android.gms.smartdevice.d2d.data;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ddgd;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SourceDeviceInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddgd();
    private static final HashMap k;
    public final Set a;
    public String b;
    public String c;
    public String d;
    public String e;
    public int f;
    public String g;
    public String h;
    public String i;
    public String j;

    static {
        HashMap hashMap = new HashMap();
        k = hashMap;
        hashMap.put("androidId", new FastJsonResponse$Field(7, false, 7, false, "androidId", 1, null));
        hashMap.put("manufacturer", new FastJsonResponse$Field(7, false, 7, false, "manufacturer", 2, null));
        hashMap.put("deviceModel", new FastJsonResponse$Field(7, false, 7, false, "deviceModel", 3, null));
        hashMap.put("deviceFingerprint", new FastJsonResponse$Field(7, false, 7, false, "deviceFingerprint", 4, null));
        hashMap.put("sdkVersion", new FastJsonResponse$Field(0, false, 0, false, "sdkVersion", 5, null));
        hashMap.put("iosAppId", new FastJsonResponse$Field(7, false, 7, false, "iosAppId", 6, null));
        hashMap.put("iosAppVersion", new FastJsonResponse$Field(7, false, 7, false, "iosAppVersion", 7, null));
        hashMap.put("iosVersion", new FastJsonResponse$Field(7, false, 7, false, "iosVersion", 8, null));
        hashMap.put("accountGivenName", new FastJsonResponse$Field(7, false, 7, false, "accountGivenName", 9, null));
    }

    public SourceDeviceInfo(Set set, String str, String str2, String str3, String str4, int i, String str5, String str6, String str7, String str8) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 1:
                return this.b;
            case 2:
                return this.c;
            case 3:
                return this.d;
            case 4:
                return this.e;
            case 5:
                return Integer.valueOf(this.f);
            case 6:
                return this.g;
            case 7:
                return this.h;
            case 8:
                return this.i;
            case 9:
                return this.j;
            default:
                throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.ashs
    public final Map b() {
        return k;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 1:
                if (str2 == null) {
                    this.b = "";
                    break;
                } else {
                    this.b = str2;
                    break;
                }
            case 2:
                if (str2 == null) {
                    this.c = Build.MANUFACTURER;
                    break;
                } else {
                    this.c = str2;
                    break;
                }
            case 3:
                if (str2 == null) {
                    this.d = Build.MODEL;
                    break;
                } else {
                    this.d = str2;
                    break;
                }
            case 4:
                if (str2 == null) {
                    this.e = Build.FINGERPRINT;
                    break;
                } else {
                    this.e = str2;
                    break;
                }
            case 5:
            default:
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            case 6:
                if (str2 != null) {
                    this.g = str2;
                    break;
                }
                break;
            case 7:
                if (str2 != null) {
                    this.h = str2;
                    break;
                }
                break;
            case 8:
                if (str2 != null) {
                    this.i = str2;
                    break;
                }
                break;
            case 9:
                if (str2 != null) {
                    this.j = str2;
                    break;
                }
                break;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 5) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be a int."));
        }
        this.f = i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(1)) {
            arxc.v(parcel, 1, this.b, true);
        }
        if (set.contains(2)) {
            arxc.v(parcel, 2, this.c, true);
        }
        if (set.contains(3)) {
            arxc.v(parcel, 3, this.d, true);
        }
        if (set.contains(4)) {
            arxc.v(parcel, 4, this.e, true);
        }
        if (set.contains(5)) {
            arxc.o(parcel, 5, this.f);
        }
        if (set.contains(6)) {
            arxc.v(parcel, 6, this.g, true);
        }
        if (set.contains(7)) {
            arxc.v(parcel, 7, this.h, true);
        }
        if (set.contains(8)) {
            arxc.v(parcel, 8, this.i, true);
        }
        if (set.contains(9)) {
            arxc.v(parcel, 9, this.j, true);
        }
        arxc.c(parcel, a);
    }

    public SourceDeviceInfo() {
        this.a = new HashSet();
    }
}

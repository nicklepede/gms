package com.google.android.gms.smartdevice.setup.accounts;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.decv;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes7.dex */
public class DeviceSignals extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new decv();
    private static final HashMap i;
    final Set a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;
    public UserPresence h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("deviceId", new FastJsonResponse$Field(7, false, 7, false, "deviceId", 2, null));
        hashMap.put("deviceName", new FastJsonResponse$Field(7, false, 7, false, "deviceName", 3, null));
        hashMap.put("deviceModel", new FastJsonResponse$Field(7, false, 7, false, "deviceModel", 4, null));
        hashMap.put("sdkVersion", new FastJsonResponse$Field(7, false, 7, false, "sdkVersion", 5, null));
        hashMap.put("googlePlayServicesVersion", new FastJsonResponse$Field(7, false, 7, false, "googlePlayServicesVersion", 6, null));
        hashMap.put("droidGuardResults", new FastJsonResponse$Field(7, false, 7, false, "droidGuardResults", 7, null));
        hashMap.put("userPresence", new FastJsonResponse$Field(11, false, 11, false, "userPresence", 8, UserPresence.class));
    }

    public DeviceSignals(Set set, String str, String str2, String str3, String str4, String str5, String str6, UserPresence userPresence) {
        this.a = set;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = userPresence;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
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
            default:
                throw new IllegalStateException(a.j(i2, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return i;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
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
            default:
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i2)));
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 8) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i2), ashsVar.getClass().getCanonicalName()));
        }
        this.h = (UserPresence) ashsVar;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            arxc.v(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            arxc.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            arxc.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            arxc.v(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            arxc.v(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            arxc.t(parcel, 8, this.h, i2, true);
        }
        arxc.c(parcel, a);
    }

    public DeviceSignals() {
        this.a = new HashSet();
    }

    public DeviceSignals(String str, String str2, String str3, String str4, String str5) {
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        this.b = str;
        hashSet.add(2);
        this.c = str2;
        hashSet.add(3);
        this.d = str3;
        hashSet.add(4);
        this.e = str4;
        hashSet.add(5);
        this.f = "251661004";
        hashSet.add(6);
        this.g = str5;
        hashSet.add(7);
        this.h = null;
        hashSet.add(8);
    }
}

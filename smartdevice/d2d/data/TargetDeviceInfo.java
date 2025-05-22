package com.google.android.gms.smartdevice.d2d.data;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.dfrk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TargetDeviceInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfrk();
    private static final HashMap h;
    public final Set a;
    public String b;
    public byte c;
    public int d;
    public int e;
    public int f;
    public String g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("deviceModel", new FastJsonResponse$Field(7, false, 7, false, "deviceModel", 1, null));
        hashMap.put("deviceType", new FastJsonResponse$Field(0, false, 0, false, "deviceType", 2, null));
        hashMap.put("preferredUserVerificationMethod", new FastJsonResponse$Field(0, false, 0, false, "preferredUserVerificationMethod", 3, null));
        hashMap.put("protocolVersion", new FastJsonResponse$Field(0, false, 0, false, "protocolVersion", 4, null));
        hashMap.put("gmsVersion", new FastJsonResponse$Field(0, false, 0, false, "gmsVersion", 5, null));
        hashMap.put("backupBtRfcommServerUuid", new FastJsonResponse$Field(7, false, 7, false, "backupBtRfcommServerUuid", 6, null));
    }

    public TargetDeviceInfo(Set set, String str, byte b, int i, int i2, int i3, String str2) {
        this.a = set;
        this.b = str;
        this.c = b;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = str2;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        switch (i) {
            case 1:
                return this.b;
            case 2:
                return Byte.valueOf(this.c);
            case 3:
                return Integer.valueOf(this.d);
            case 4:
                return Integer.valueOf(this.e);
            case 5:
                return Integer.valueOf(this.f);
            case 6:
                return this.g;
            default:
                throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.aulm
    public final Map b() {
        return h;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i = fastJsonResponse$Field.g;
        if (i != 1) {
            if (i != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
            }
            if (str2 != null) {
                this.g = str2;
            }
        } else if (str2 != null) {
            this.b = str2;
        } else {
            this.b = Build.MODEL;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.c = (byte) i;
        } else if (i2 == 3) {
            this.d = i;
        } else if (i2 == 4) {
            this.e = i;
        } else {
            if (i2 != 5) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a int.", Integer.valueOf(i2)));
            }
            this.f = i;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(1)) {
            atzr.v(parcel, 1, this.b, true);
        }
        if (set.contains(2)) {
            atzr.h(parcel, 2, this.c);
        }
        if (set.contains(3)) {
            atzr.o(parcel, 3, this.d);
        }
        if (set.contains(4)) {
            atzr.o(parcel, 4, this.e);
        }
        if (set.contains(5)) {
            atzr.o(parcel, 5, this.f);
        }
        if (set.contains(6)) {
            atzr.v(parcel, 6, this.g, true);
        }
        atzr.c(parcel, a);
    }

    public TargetDeviceInfo() {
        this.a = new HashSet();
    }
}

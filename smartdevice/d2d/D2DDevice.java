package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.dcxg;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class D2DDevice extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dcxg();
    private static final HashMap i;
    public final Set a;
    public int b;
    public String c;
    public String d;
    public byte e;

    @Deprecated
    public String f;

    @Deprecated
    public byte[] g;
    public int h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("protocol", new FastJsonResponse$Field(0, false, 0, false, "protocol", 2, null));
        hashMap.put("name", new FastJsonResponse$Field(7, false, 7, false, "name", 3, null));
        hashMap.put("deviceId", new FastJsonResponse$Field(7, false, 7, false, "deviceId", 4, null));
        hashMap.put("deviceType", new FastJsonResponse$Field(0, false, 0, false, "deviceType", 5, null));
        hashMap.put("btUuid", new FastJsonResponse$Field(7, false, 7, false, "btUuid", 6, null));
        hashMap.put("cryptAuthHello", new FastJsonResponse$Field(8, false, 8, false, "cryptAuthHello", 7, null));
        hashMap.put("bluetoothMacAddr", new FastJsonResponse$Field(7, false, 7, false, "bluetoothMacAddr", 8, null));
        hashMap.put("verificationStyle", new FastJsonResponse$Field(0, false, 0, false, "verificationStyle", 9, null));
    }

    public D2DDevice(Set set, int i2, String str, String str2, byte b, String str3, byte[] bArr, int i3) {
        this.a = set;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = b;
        this.f = str3;
        this.g = bArr;
        this.h = i3;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return Integer.valueOf(this.b);
            case 3:
                return this.c;
            case 4:
                return this.d;
            case 5:
                return Byte.valueOf(this.e);
            case 6:
                return this.f;
            case 7:
                return this.g;
            case 8:
            default:
                throw new IllegalStateException(a.j(i2, "Unknown SafeParcelable id="));
            case 9:
                return Integer.valueOf(this.h);
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

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        D2DDevice d2DDevice = (D2DDevice) obj;
        String str = this.c;
        if (str == null ? d2DDevice.c != null : !str.equals(d2DDevice.c)) {
            return false;
        }
        String str2 = this.d;
        return str2 != null ? str2.equals(d2DDevice.d) : d2DDevice.d == null;
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        if (str2 == null) {
            return;
        }
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = str2;
        } else if (i2 == 4) {
            this.d = str2;
        } else if (i2 == 6) {
            this.f = str2;
        } else if (i2 != 8) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i2)));
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    protected final void gf(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 7) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be a byte array."));
        }
        this.g = bArr;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 == 2) {
            this.b = i2;
        } else if (i3 == 5) {
            this.e = (byte) i2;
        } else {
            if (i3 != 9) {
                throw new IllegalArgumentException(a.l(i3, "Field with id=", " is not known to be an int."));
            }
            this.h = i2;
        }
        this.a.add(Integer.valueOf(i3));
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse
    public final int hashCode() {
        String str = this.c;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.d;
        return (hashCode * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.o(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            arxc.v(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            arxc.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            arxc.h(parcel, 5, this.e);
        }
        if (set.contains(6)) {
            arxc.v(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            arxc.i(parcel, 7, this.g, true);
        }
        if (set.contains(9)) {
            arxc.o(parcel, 9, this.h);
        }
        arxc.c(parcel, a);
    }

    public D2DDevice() {
        this.a = new HashSet();
    }

    public D2DDevice(String str, String str2, byte b, int i2) {
        this();
        this.b = 2;
        this.c = str;
        this.d = str2;
        this.e = b;
        this.f = null;
        this.g = null;
        this.h = i2;
        this.a.add(2);
        this.a.add(3);
        this.a.add(4);
        this.a.add(5);
        this.a.add(6);
        this.a.add(7);
        this.a.add(9);
    }
}

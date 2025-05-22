package com.google.android.gms.smartdevice.postsetup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.dgen;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class ConnectionHint extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dgen();
    private static final HashMap i;
    public final Set a;
    public String b;
    public byte[] c;
    public String d;
    public String e;
    public String f;
    public byte[] g;
    public int h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("hint", new FastJsonResponse$Field(7, false, 7, false, "hint", 2, null));
        hashMap.put("sharedSecret", new FastJsonResponse$Field(8, false, 8, false, "sharedSecret", 3, null));
        hashMap.put("wifiDirectMacAddress", new FastJsonResponse$Field(7, false, 7, false, "wifiDirectMacAddress", 4, null));
        hashMap.put("oemRestorePkg", new FastJsonResponse$Field(7, false, 7, false, "oemRestorePkg", 5, null));
        hashMap.put("oemRestorePkgVersion", new FastJsonResponse$Field(7, false, 7, false, "oemRestorePkgVersion", 6, null));
        hashMap.put("targetBtMacAddress", new FastJsonResponse$Field(8, false, 8, false, "targetBtMacAddress", 7, null));
        hashMap.put("userVerificationStatus", new FastJsonResponse$Field(0, false, 0, false, "userVerificationStatus", 8, null));
    }

    public ConnectionHint(Set set, String str, byte[] bArr, String str2, String str3, String str4, byte[] bArr2, int i2) {
        this.a = set;
        this.b = str;
        this.c = bArr;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = bArr2;
        this.h = i2;
    }

    @Override // defpackage.aulm
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
                return Integer.valueOf(this.h);
            default:
                throw new IllegalStateException(a.j(i2, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return i;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.b = str2;
        } else if (i2 == 4) {
            this.d = str2;
        } else if (i2 == 5) {
            this.e = str2;
        } else {
            if (i2 != 6) {
                throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be a String."));
            }
            this.f = str2;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 != 8) {
            throw new IllegalArgumentException(a.l(i3, "Field with id=", " is not known to be an int."));
        }
        this.h = i2;
        this.a.add(Integer.valueOf(i3));
    }

    @Override // defpackage.aulm
    protected final void gu(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 3) {
            this.c = bArr;
        } else {
            if (i2 != 7) {
                throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be a byte array."));
            }
            this.g = bArr;
        }
        this.a.add(Integer.valueOf(i2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.i(parcel, 3, this.c, true);
        }
        if (set.contains(4)) {
            atzr.v(parcel, 4, this.d, true);
        }
        if (set.contains(5)) {
            atzr.v(parcel, 5, this.e, true);
        }
        if (set.contains(6)) {
            atzr.v(parcel, 6, this.f, true);
        }
        if (set.contains(7)) {
            atzr.i(parcel, 7, this.g, true);
        }
        if (set.contains(8)) {
            atzr.o(parcel, 8, this.h);
        }
        atzr.c(parcel, a);
    }

    public ConnectionHint() {
        this.a = new HashSet();
    }
}

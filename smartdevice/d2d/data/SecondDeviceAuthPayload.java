package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.d2d.BootstrapAccount;
import com.google.android.gms.smartdevice.setup.auth.StartSessionResponse;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ddgc;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SecondDeviceAuthPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddgc();
    private static final HashMap i;
    public List a;

    @Deprecated
    public int b;
    public byte[] c;
    public String d;
    public String e;
    public boolean f;
    public List g;
    public final Set h;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put("startSessionResponses", new FastJsonResponse$Field(11, true, 11, true, "startSessionResponses", 2, StartSessionResponse.class));
        hashMap.put("sourceFallbackStatus", new FastJsonResponse$Field(0, false, 0, false, "sourceFallbackStatus", 3, null));
        hashMap.put("fidoMessage", new FastJsonResponse$Field(8, false, 8, false, "fidoMessage", 4, null));
        hashMap.put("sourceBackupAccountId", new FastJsonResponse$Field(7, false, 7, false, "fidoMessage", 5, null));
        hashMap.put("sourceAndroidDeviceId", new FastJsonResponse$Field(7, false, 7, false, "fidoMessage", 6, null));
        hashMap.put("isTransferUnicorn", new FastJsonResponse$Field(6, false, 6, false, "isTransferUnicorn", 7, null));
        hashMap.put("bootstrapAccounts", new FastJsonResponse$Field(11, true, 11, true, "bootstrapAccounts", 8, BootstrapAccount.class));
    }

    public SecondDeviceAuthPayload(Set set, List list, int i2, byte[] bArr, String str, String str2, boolean z, List list2) {
        this.h = set;
        this.a = list;
        this.b = i2;
        this.c = bArr;
        this.d = str;
        this.e = str2;
        this.f = z;
        this.g = list2;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i2 = fastJsonResponse$Field.g;
        switch (i2) {
            case 2:
                return this.a;
            case 3:
                return Integer.valueOf(this.b);
            case 4:
                return this.c;
            case 5:
                return this.d;
            case 6:
                return this.e;
            case 7:
                return Boolean.valueOf(this.f);
            case 8:
                return this.g;
            default:
                throw new IllegalStateException(a.j(i2, "Unknown SafeParcelable id="));
        }
    }

    @Override // defpackage.ashs
    public final Map b() {
        return i;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.h.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 5) {
            this.d = str2;
        } else {
            if (i2 != 6) {
                throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i2)));
            }
            this.e = str2;
        }
        this.h.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    protected final void gf(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 4) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be a byte array"));
        }
        this.c = bArr;
        this.h.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 7) {
            throw new IllegalArgumentException(String.format("Invalid id %s", Integer.valueOf(i2)));
        }
        this.f = z;
        this.h.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    public final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 == 2) {
            this.a = arrayList;
        } else {
            if (i2 != 8) {
                throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not a known array of custom type."));
            }
            this.g = arrayList;
        }
        this.h.add(Integer.valueOf(i2));
    }

    @Override // defpackage.ashs
    protected final void gx(FastJsonResponse$Field fastJsonResponse$Field, String str, int i2) {
        int i3 = fastJsonResponse$Field.g;
        if (i3 != 3) {
            throw new IllegalArgumentException(a.l(i3, "Field with id=", " is not known to be an int."));
        }
        this.b = i2;
        this.h.add(Integer.valueOf(i3));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Set set = this.h;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.y(parcel, 2, this.a, true);
        }
        if (set.contains(3)) {
            arxc.o(parcel, 3, this.b);
        }
        if (set.contains(4)) {
            arxc.i(parcel, 4, this.c, true);
        }
        if (set.contains(5)) {
            arxc.v(parcel, 5, this.d, true);
        }
        if (set.contains(6)) {
            arxc.v(parcel, 6, this.e, true);
        }
        if (set.contains(7)) {
            arxc.e(parcel, 7, this.f);
        }
        if (set.contains(8)) {
            arxc.y(parcel, 8, this.g, true);
        }
        arxc.c(parcel, a);
    }

    public SecondDeviceAuthPayload() {
        this.h = new HashSet();
    }

    public SecondDeviceAuthPayload(boolean z) {
        this();
        this.h.add(7);
        this.f = z;
    }

    public SecondDeviceAuthPayload(String str, String str2) {
        this();
        this.h.add(5);
        this.h.add(6);
        this.d = str;
        this.e = str2;
    }

    public SecondDeviceAuthPayload(List list) {
        this();
        this.h.add(2);
        this.a = list;
    }
}

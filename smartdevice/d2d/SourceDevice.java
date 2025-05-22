package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.dfkr;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SourceDevice extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfkr();
    private static final HashMap e;
    final Set a;
    public String b;
    public byte c;
    public boolean d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("name", new FastJsonResponse$Field(7, false, 7, false, "name", 2, null));
        hashMap.put("deviceType", new FastJsonResponse$Field(0, false, 0, false, "deviceType", 3, null));
        hashMap.put("isNetworkConnected", new FastJsonResponse$Field(6, false, 6, false, "isNetworkConnected", 4, null));
    }

    public SourceDevice(Set set, String str, byte b, boolean z) {
        this.a = set;
        this.b = str;
        this.c = b;
        this.d = z;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return Byte.valueOf(this.c);
        }
        if (i == 4) {
            return Boolean.valueOf(this.d);
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return e;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void f(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
        if (str2 == null) {
            return;
        }
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not known to be a string.", Integer.valueOf(i)));
        }
        this.b = str2;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void gM(FastJsonResponse$Field fastJsonResponse$Field, String str, int i) {
        int i2 = fastJsonResponse$Field.g;
        if (i2 != 3) {
            throw new IllegalArgumentException(a.l(i2, "Field with id=", " is not known to be an int."));
        }
        this.c = (byte) i;
        this.a.add(Integer.valueOf(i2));
    }

    @Override // defpackage.aulm
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i != 4) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a boolean."));
        }
        this.d = z;
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.v(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.h(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            atzr.e(parcel, 4, this.d);
        }
        atzr.c(parcel, a);
    }

    public SourceDevice() {
        this.a = new HashSet();
    }
}

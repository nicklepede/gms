package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.atzr;
import defpackage.dfra;
import defpackage.elgt;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DeviceStatus extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dfra();
    private static final Map e;
    public int a;
    public int b;
    public int c;
    public final Set d;

    static {
        elgt elgtVar = new elgt();
        elgtVar.i("errorCode", new FastJsonResponse$Field(0, false, 0, false, "errorCode", 1, null));
        elgtVar.i("errorSource", new FastJsonResponse$Field(0, false, 0, false, "errorSource", 2, null));
        elgtVar.i("errorCodeFromSource", new FastJsonResponse$Field(0, false, 0, false, "errorCodeFromSource", 3, null));
        e = elgtVar.b();
    }

    public DeviceStatus(Set set, int i, int i2, int i3) {
        this.d = set;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.aulm
    protected final void W(String str, int i) {
        if (str.equals("errorCode")) {
            p(i);
        } else if (str.equals("errorSource")) {
            r(i);
        } else if (str.equals("errorCodeFromSource")) {
            q(i);
        }
    }

    @Override // defpackage.aulm
    public final Map b() {
        return e;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.d.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    public final void p(int i) {
        this.a = i;
        this.d.add(1);
    }

    public final void q(int i) {
        this.c = i;
        this.d.add(3);
    }

    public final void r(int i) {
        this.b = i;
        this.d.add(2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.d;
        int a = atzr.a(parcel);
        if (set.contains(1)) {
            atzr.o(parcel, 1, this.a);
        }
        if (set.contains(2)) {
            atzr.o(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            atzr.o(parcel, 3, this.c);
        }
        atzr.c(parcel, a);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, defpackage.aulm
    public final Object z(String str) {
        if (str.equals("errorCode")) {
            return Integer.valueOf(this.a);
        }
        if (str.equals("errorSource")) {
            return Integer.valueOf(this.b);
        }
        if (str.equals("errorCodeFromSource")) {
            return Integer.valueOf(this.c);
        }
        throw new IllegalArgumentException("No value for key ".concat(String.valueOf(str)));
    }

    public DeviceStatus() {
        this.d = new HashSet();
    }
}

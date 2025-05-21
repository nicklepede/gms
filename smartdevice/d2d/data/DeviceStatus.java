package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.arxc;
import defpackage.ddfv;
import defpackage.eito;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DeviceStatus extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddfv();
    private static final Map e;
    public int a;
    public int b;
    public int c;
    public final Set d;

    static {
        eito eitoVar = new eito();
        eitoVar.i("errorCode", new FastJsonResponse$Field(0, false, 0, false, "errorCode", 1, null));
        eitoVar.i("errorSource", new FastJsonResponse$Field(0, false, 0, false, "errorSource", 2, null));
        eitoVar.i("errorCodeFromSource", new FastJsonResponse$Field(0, false, 0, false, "errorCodeFromSource", 3, null));
        e = eitoVar.b();
    }

    public DeviceStatus(Set set, int i, int i2, int i3) {
        this.d = set;
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // defpackage.ashs
    protected final void W(String str, int i) {
        if (str.equals("errorCode")) {
            p(i);
        } else if (str.equals("errorSource")) {
            r(i);
        } else if (str.equals("errorCodeFromSource")) {
            q(i);
        }
    }

    @Override // defpackage.ashs
    public final Map b() {
        return e;
    }

    @Override // defpackage.ashs
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
        int a = arxc.a(parcel);
        if (set.contains(1)) {
            arxc.o(parcel, 1, this.a);
        }
        if (set.contains(2)) {
            arxc.o(parcel, 2, this.b);
        }
        if (set.contains(3)) {
            arxc.o(parcel, 3, this.c);
        }
        arxc.c(parcel, a);
    }

    @Override // com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse, defpackage.ashs
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

package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.util.BinarySerializableFastSafeParcelableJson;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import defpackage.a;
import defpackage.atzr;
import defpackage.xkw;
import defpackage.xkx;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DeviceAuthInfo extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new xkx();
    private static final HashMap e;
    final Set a;
    final int b;
    public boolean c;
    public long d;

    static {
        HashMap hashMap = new HashMap();
        e = hashMap;
        hashMap.put("solved", new FastJsonResponse$Field(6, false, 6, false, "solved", 2, null));
        hashMap.put("age", new FastJsonResponse$Field(2, false, 2, false, "age", 3, null));
    }

    public DeviceAuthInfo(Set set, int i, boolean z, long j) {
        this.a = set;
        this.b = i;
        this.c = z;
        this.d = j;
    }

    @Override // defpackage.aulm
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Integer.valueOf(this.b);
        }
        if (i == 2) {
            return Boolean.valueOf(this.c);
        }
        if (i == 3) {
            return Long.valueOf(this.d);
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
    protected final void gv(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be an int."));
        }
        this.c = z;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.aulm
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i != 3) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be an int."));
        }
        this.d = j;
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(1)) {
            atzr.o(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            atzr.e(parcel, 2, this.c);
        }
        if (set.contains(3)) {
            atzr.q(parcel, 3, this.d);
        }
        atzr.c(parcel, a);
    }

    public DeviceAuthInfo() {
        this.a = new HashSet(1);
        this.b = 1;
    }

    public DeviceAuthInfo(xkw xkwVar) {
        this(xkwVar.c, 1, xkwVar.a, xkwVar.b);
    }
}

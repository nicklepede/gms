package com.google.android.gms.smartdevice.quickstart;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ddwa;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class QuickStartHandshakeOptionFlags extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddwa();
    private static final HashMap c;
    final Set a;
    public long b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("flagValues", new FastJsonResponse$Field(2, false, 2, false, "flagValues", 1, null));
    }

    public QuickStartHandshakeOptionFlags(Set set, long j) {
        this.a = set;
        this.b = j;
    }

    static long p(int i) {
        return 1 << (i - 1);
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Long.valueOf(this.b);
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final Map b() {
        return c;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void k(FastJsonResponse$Field fastJsonResponse$Field, String str, long j) {
        int i = fastJsonResponse$Field.g;
        if (i != 1) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a long."));
        }
        this.b = j;
        this.a.add(Integer.valueOf(i));
    }

    public final boolean q(int i) {
        return (this.b & p(i)) > 0;
    }

    public final void r(int i) {
        this.b |= p(i);
        this.a.add(1);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(1)) {
            arxc.q(parcel, 1, this.b);
        }
        arxc.c(parcel, a);
    }

    public QuickStartHandshakeOptionFlags() {
        this.a = new HashSet();
        this.b = 0L;
    }
}

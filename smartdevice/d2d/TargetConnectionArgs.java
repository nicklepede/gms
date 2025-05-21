package com.google.android.gms.smartdevice.d2d;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.ddcb;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TargetConnectionArgs extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddcb();
    private static final HashMap h;
    public final Set a;
    public SourceDevice b;

    @Deprecated
    public boolean c;
    public int d;
    public int e;
    public int f;
    public int g;

    static {
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("sourceDevice", new FastJsonResponse$Field(11, false, 11, false, "sourceDevice", 2, SourceDevice.class));
        hashMap.put("preferTargetUserVerification", new FastJsonResponse$Field(6, false, 6, false, "preferTargetUserVerification", 3, null));
        hashMap.put("userVerificationMethod", new FastJsonResponse$Field(0, false, 0, false, "userVerificationMethod", 4, null));
        hashMap.put("preferredUserVerificationMethod", new FastJsonResponse$Field(0, false, 0, false, "preferredUserVerificationMethod", 5, null));
        hashMap.put("targetProtocolVersion", new FastJsonResponse$Field(0, false, 0, false, "targetProtocolVersion", 7, null));
    }

    public TargetConnectionArgs(Set set, SourceDevice sourceDevice, boolean z, int i, int i2, int i3, int i4) {
        this.a = set;
        this.b = sourceDevice;
        this.c = z;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return Boolean.valueOf(this.c);
        }
        if (i == 4) {
            return Integer.valueOf(this.d);
        }
        if (i == 5) {
            return Integer.valueOf(this.e);
        }
        if (i == 7) {
            return Integer.valueOf(this.g);
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return h;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), ashsVar.getClass().getCanonicalName()));
        }
        this.b = (SourceDevice) ashsVar;
        this.a.add(Integer.valueOf(i));
    }

    public final void p(int i) {
        this.g = i;
        this.a.add(7);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.t(parcel, 2, this.b, i, true);
        }
        if (set.contains(3)) {
            arxc.e(parcel, 3, this.c);
        }
        if (set.contains(4)) {
            arxc.o(parcel, 4, this.d);
        }
        if (set.contains(5)) {
            arxc.o(parcel, 5, this.e);
        }
        if (set.contains(6)) {
            arxc.o(parcel, 6, this.f);
        }
        if (set.contains(7)) {
            arxc.o(parcel, 7, this.g);
        }
        arxc.c(parcel, a);
    }

    public TargetConnectionArgs() {
        this.a = new HashSet();
    }

    public TargetConnectionArgs(int i, int i2) {
        this();
        this.e = i;
        this.f = i2;
        this.a.add(5);
        this.a.add(6);
    }
}

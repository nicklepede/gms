package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ddga;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PinFallbackPayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddga();
    private static final HashMap d;
    public final Set a;
    public boolean b;
    public boolean c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("triggered", new FastJsonResponse$Field(6, false, 6, false, "triggered", 1, null));
        hashMap.put("confirmed", new FastJsonResponse$Field(6, false, 6, false, "confirmed", 2, null));
    }

    public PinFallbackPayload(Set set, boolean z, boolean z2) {
        this.a = set;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            return Boolean.valueOf(this.b);
        }
        if (i == 2) {
            return Boolean.valueOf(this.c);
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final Map b() {
        return d;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void gg(FastJsonResponse$Field fastJsonResponse$Field, String str, boolean z) {
        int i = fastJsonResponse$Field.g;
        if (i == 1) {
            this.b = z;
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(String.format("Invalid id %s", Integer.valueOf(i)));
            }
            this.c = z;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(1)) {
            arxc.e(parcel, 1, this.b);
        }
        if (set.contains(2)) {
            arxc.e(parcel, 2, this.c);
        }
        arxc.c(parcel, a);
    }

    public PinFallbackPayload() {
        this.a = new HashSet();
    }
}

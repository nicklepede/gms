package com.google.android.gms.smartdevice.d2d.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ddfq;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BlockstorePayload extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddfq();
    private static final HashMap c;
    final Set a;
    public byte[] b;

    static {
        HashMap hashMap = new HashMap();
        c = hashMap;
        hashMap.put("blockstoreData", new FastJsonResponse$Field(8, false, 8, false, "blockstoreData", 2, null));
    }

    public BlockstorePayload(Set set, byte[] bArr) {
        this.a = set;
        this.b = bArr;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
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
    protected final void gf(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a byte array"));
        }
        if (bArr != null) {
            this.b = bArr;
            this.a.add(Integer.valueOf(i));
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.i(parcel, 2, this.b, true);
        }
        arxc.c(parcel, a);
    }

    public BlockstorePayload() {
        this.a = new HashSet();
    }

    public BlockstorePayload(byte[] bArr) {
        this();
        this.b = bArr;
        this.a.add(2);
    }
}

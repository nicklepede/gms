package com.google.android.gms.smartdevice.postsetup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.arxc;
import defpackage.ashs;
import defpackage.ddtk;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PostSetupAuthData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new ddtk();
    private static final HashMap d;
    public final Set a;
    public byte[] b;
    public HandshakeData c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("key", new FastJsonResponse$Field(8, false, 8, false, "key", 2, null));
        hashMap.put("handshake", new FastJsonResponse$Field(11, false, 11, false, "handshake", 3, HandshakeData.class));
    }

    public PostSetupAuthData(Set set, byte[] bArr, HandshakeData handshakeData) {
        this.a = set;
        this.b = bArr;
        this.c = handshakeData;
    }

    @Override // defpackage.ashs
    protected final Object a(FastJsonResponse$Field fastJsonResponse$Field) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            return this.b;
        }
        if (i == 3) {
            return this.c;
        }
        throw new IllegalStateException(a.j(i, "Unknown SafeParcelable id="));
    }

    @Override // defpackage.ashs
    public final /* synthetic */ Map b() {
        return d;
    }

    @Override // defpackage.ashs
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.ashs
    protected final void gf(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i != 2) {
            throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a byte array."));
        }
        this.b = bArr;
        this.a.add(Integer.valueOf(i));
    }

    @Override // defpackage.ashs
    public final void gw(FastJsonResponse$Field fastJsonResponse$Field, String str, ashs ashsVar) {
        int i = fastJsonResponse$Field.g;
        if (i != 3) {
            throw new IllegalArgumentException(String.format("Field with id=%d is not a known custom type. Found %s", Integer.valueOf(i), ashsVar.getClass().getCanonicalName()));
        }
        this.c = (HandshakeData) ashsVar;
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = arxc.a(parcel);
        if (set.contains(2)) {
            arxc.i(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            arxc.t(parcel, 3, this.c, i, true);
        }
        arxc.c(parcel, a);
    }

    public PostSetupAuthData() {
        this.a = new HashSet();
    }

    public PostSetupAuthData(byte[] bArr) {
        this();
        this.b = bArr;
        this.a.add(2);
    }
}

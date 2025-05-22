package com.google.android.gms.smartdevice.postsetup;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.smartdevice.utils.BinarySerializableFastSafeParcelableJson;
import defpackage.a;
import defpackage.atzr;
import defpackage.dgeo;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class HandshakeData extends BinarySerializableFastSafeParcelableJson {
    public static final Parcelable.Creator CREATOR = new dgeo();
    private static final HashMap d;
    final Set a;
    public byte[] b;
    public byte[] c;

    static {
        HashMap hashMap = new HashMap();
        d = hashMap;
        hashMap.put("message", new FastJsonResponse$Field(8, false, 8, false, "message", 2, null));
        hashMap.put("hmac", new FastJsonResponse$Field(8, false, 8, false, "hmac", 3, null));
    }

    public HandshakeData(Set set, byte[] bArr, byte[] bArr2) {
        this.a = set;
        this.b = bArr;
        this.c = bArr2;
    }

    @Override // defpackage.aulm
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

    @Override // defpackage.aulm
    public final /* synthetic */ Map b() {
        return d;
    }

    @Override // defpackage.aulm
    protected final boolean e(FastJsonResponse$Field fastJsonResponse$Field) {
        return this.a.contains(Integer.valueOf(fastJsonResponse$Field.g));
    }

    @Override // defpackage.aulm
    protected final void gu(FastJsonResponse$Field fastJsonResponse$Field, String str, byte[] bArr) {
        int i = fastJsonResponse$Field.g;
        if (i == 2) {
            this.b = bArr;
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(a.l(i, "Field with id=", " is not known to be a byte array."));
            }
            this.c = bArr;
        }
        this.a.add(Integer.valueOf(i));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Set set = this.a;
        int a = atzr.a(parcel);
        if (set.contains(2)) {
            atzr.i(parcel, 2, this.b, true);
        }
        if (set.contains(3)) {
            atzr.i(parcel, 3, this.c, true);
        }
        atzr.c(parcel, a);
    }

    public HandshakeData() {
        this.a = new HashSet();
    }

    public HandshakeData(byte[] bArr) {
        this();
        this.b = bArr;
        this.a.add(2);
    }

    public HandshakeData(byte[] bArr, byte[] bArr2) {
        this();
        this.c = bArr2;
        this.b = bArr;
        this.a.add(2);
        this.a.add(3);
    }
}

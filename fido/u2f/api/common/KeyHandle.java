package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.asnj;
import defpackage.bbji;
import defpackage.bcqo;
import defpackage.bcqq;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes4.dex */
public class KeyHandle extends AbstractSafeParcelable implements bbji {
    public static final Parcelable.Creator CREATOR = new bcqo();
    public final int a;
    public final byte[] b;
    public final ProtocolVersion c;
    public final List d;

    public KeyHandle(byte[] bArr, ProtocolVersion protocolVersion, List list) {
        this.a = 1;
        this.b = bArr;
        this.c = protocolVersion;
        this.d = list;
    }

    @Override // defpackage.bbji
    public final JSONObject a() {
        throw null;
    }

    public final boolean equals(Object obj) {
        List list;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyHandle)) {
            return false;
        }
        KeyHandle keyHandle = (KeyHandle) obj;
        if (!Arrays.equals(this.b, keyHandle.b) || !this.c.equals(keyHandle.c)) {
            return false;
        }
        List list2 = this.d;
        if (list2 == null && keyHandle.d == null) {
            return true;
        }
        return list2 != null && (list = keyHandle.d) != null && list2.containsAll(list) && list.containsAll(list2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.b)), this.c, this.d});
    }

    public final String toString() {
        List list = this.d;
        return String.format("{keyHandle: %s, version: %s, transports: %s}", asnj.a(this.b), this.c, list == null ? "null" : list.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.i(parcel, 2, this.b, false);
        arxc.v(parcel, 3, this.c.d, false);
        arxc.y(parcel, 4, this.d, false);
        arxc.c(parcel, a);
    }

    public KeyHandle(int i, byte[] bArr, String str, List list) {
        this.a = i;
        this.b = bArr;
        try {
            this.c = ProtocolVersion.b(str);
            this.d = list;
        } catch (bcqq e) {
            throw new IllegalArgumentException(e);
        }
    }
}

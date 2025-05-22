package com.google.android.gms.fido.u2f.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atzr;
import defpackage.aurd;
import defpackage.bdnf;
import defpackage.besb;
import defpackage.besd;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes4.dex */
public class KeyHandle extends AbstractSafeParcelable implements bdnf {
    public static final Parcelable.Creator CREATOR = new besb();
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

    @Override // defpackage.bdnf
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
        return String.format("{keyHandle: %s, version: %s, transports: %s}", aurd.a(this.b), this.c, list == null ? "null" : list.toString());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = atzr.a(parcel);
        atzr.o(parcel, 1, i2);
        atzr.i(parcel, 2, this.b, false);
        atzr.v(parcel, 3, this.c.d, false);
        atzr.y(parcel, 4, this.d, false);
        atzr.c(parcel, a);
    }

    public KeyHandle(int i, byte[] bArr, String str, List list) {
        this.a = i;
        this.b = bArr;
        try {
            this.c = ProtocolVersion.b(str);
            this.d = list;
        } catch (besd e) {
            throw new IllegalArgumentException(e);
        }
    }
}

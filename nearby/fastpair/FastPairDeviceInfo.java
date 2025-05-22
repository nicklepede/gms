package com.google.android.gms.nearby.fastpair;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.ckhe;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class FastPairDeviceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ckhe();
    public final String a;
    final long b;

    public FastPairDeviceInfo(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            FastPairDeviceInfo fastPairDeviceInfo = (FastPairDeviceInfo) obj;
            if (atyq.b(this.a, fastPairDeviceInfo.a) && this.b == fastPairDeviceInfo.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Long.valueOf(this.b)});
    }

    public final String toString() {
        return "FastPairDeviceInfo {modelId=" + this.a + ", bondedTimeMillis=" + this.b + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.q(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}

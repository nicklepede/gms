package com.google.android.gms.auth.folsom;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.abbq;
import defpackage.arwm;
import defpackage.arxc;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SharedKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new abbq();
    public final int a;
    public final byte[] b;

    public SharedKey(int i, byte[] bArr) {
        arwm.t(bArr, "keyMaterial cannot be null");
        this.a = i;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SharedKey) {
            SharedKey sharedKey = (SharedKey) obj;
            if (this.a == sharedKey.a && Arrays.equals(this.b, sharedKey.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), this.b});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.a;
        int a = arxc.a(parcel);
        arxc.o(parcel, 1, i2);
        arxc.i(parcel, 2, this.b, false);
        arxc.c(parcel, a);
    }
}

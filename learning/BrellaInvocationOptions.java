package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.atzr;
import defpackage.bsmb;
import defpackage.ekus;
import defpackage.ekvl;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class BrellaInvocationOptions extends BaseOptions {
    public static final Parcelable.Creator CREATOR = new bsmb();
    public final String a;
    public final String b;
    public final int c;
    public final InAppTrainingConstraints d;
    private final byte[] e;

    public BrellaInvocationOptions(String str, String str2, int i, InAppTrainingConstraints inAppTrainingConstraints, byte[] bArr) {
        ekvl.a(!str.isEmpty());
        ekvl.a(!str2.isEmpty());
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = inAppTrainingConstraints;
        this.e = bArr == null ? new byte[0] : bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BrellaInvocationOptions)) {
            return false;
        }
        BrellaInvocationOptions brellaInvocationOptions = (BrellaInvocationOptions) obj;
        return ekus.a(this.a, brellaInvocationOptions.a) && ekus.a(this.b, brellaInvocationOptions.b) && this.c == brellaInvocationOptions.c && ekus.a(this.d, brellaInvocationOptions.d) && Arrays.equals(this.e, brellaInvocationOptions.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = atzr.a(parcel);
        atzr.v(parcel, 1, str, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.t(parcel, 4, this.d, i, false);
        byte[] bArr = this.e;
        atzr.i(parcel, 5, Arrays.copyOf(bArr, bArr.length), false);
        atzr.c(parcel, a);
    }
}

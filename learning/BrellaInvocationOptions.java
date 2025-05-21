package com.google.android.gms.learning;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.arxc;
import defpackage.bqel;
import defpackage.eihn;
import defpackage.eiig;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class BrellaInvocationOptions extends BaseOptions {
    public static final Parcelable.Creator CREATOR = new bqel();
    public final String a;
    public final String b;
    public final int c;
    public final InAppTrainingConstraints d;
    private final byte[] e;

    public BrellaInvocationOptions(String str, String str2, int i, InAppTrainingConstraints inAppTrainingConstraints, byte[] bArr) {
        eiig.a(!str.isEmpty());
        eiig.a(!str2.isEmpty());
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
        return eihn.a(this.a, brellaInvocationOptions.a) && eihn.a(this.b, brellaInvocationOptions.b) && this.c == brellaInvocationOptions.c && eihn.a(this.d, brellaInvocationOptions.d) && Arrays.equals(this.e, brellaInvocationOptions.e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, Integer.valueOf(Arrays.hashCode(this.e))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.a;
        int a = arxc.a(parcel);
        arxc.v(parcel, 1, str, false);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.t(parcel, 4, this.d, i, false);
        byte[] bArr = this.e;
        arxc.i(parcel, 5, Arrays.copyOf(bArr, bArr.length), false);
        arxc.c(parcel, a);
    }
}

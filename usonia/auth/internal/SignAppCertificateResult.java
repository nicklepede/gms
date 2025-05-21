package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arwb;
import defpackage.arxc;
import defpackage.dhvj;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class SignAppCertificateResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dhvj();
    public byte[] a;
    public boolean b;

    private SignAppCertificateResult() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignAppCertificateResult) {
            SignAppCertificateResult signAppCertificateResult = (SignAppCertificateResult) obj;
            if (Arrays.equals(this.a, signAppCertificateResult.a) && arwb.b(Boolean.valueOf(this.b), Boolean.valueOf(signAppCertificateResult.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a)), Boolean.valueOf(this.b)});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = arxc.a(parcel);
        arxc.i(parcel, 1, this.a, false);
        arxc.e(parcel, 2, this.b);
        arxc.c(parcel, a);
    }

    public SignAppCertificateResult(byte[] bArr, boolean z) {
        this.a = bArr;
        this.b = z;
    }
}

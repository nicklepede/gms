package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkgq;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class SignAppCertificateParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkgq();
    public CertificateRequestInformation a;
    public String b;
    public byte[] c;

    public SignAppCertificateParams() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SignAppCertificateParams) {
            SignAppCertificateParams signAppCertificateParams = (SignAppCertificateParams) obj;
            if (atyq.b(this.a, signAppCertificateParams.a) && atyq.b(this.b, signAppCertificateParams.b) && Arrays.equals(this.c, signAppCertificateParams.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.t(parcel, 1, this.a, i, false);
        atzr.v(parcel, 2, this.b, false);
        atzr.i(parcel, 3, this.c, false);
        atzr.c(parcel, a);
    }

    public SignAppCertificateParams(CertificateRequestInformation certificateRequestInformation, String str, byte[] bArr) {
        this.a = certificateRequestInformation;
        this.b = str;
        this.c = bArr;
    }
}

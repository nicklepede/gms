package com.google.android.gms.usonia.auth.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.atyq;
import defpackage.atzr;
import defpackage.dkgr;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class SignAppCertificateResult extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new dkgr();
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
            if (Arrays.equals(this.a, signAppCertificateResult.a) && atyq.b(Boolean.valueOf(this.b), Boolean.valueOf(signAppCertificateResult.b))) {
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
        int a = atzr.a(parcel);
        atzr.i(parcel, 1, this.a, false);
        atzr.e(parcel, 2, this.b);
        atzr.c(parcel, a);
    }

    public SignAppCertificateResult(byte[] bArr, boolean z) {
        this.a = bArr;
        this.b = z;
    }
}

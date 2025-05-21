package com.google.android.gms.auth.api.identity;

import android.content.pm.Signature;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.arxc;
import defpackage.zdn;
import j$.util.Objects;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SigningInfoCompat extends AbstractSafeParcelable {
    public final boolean b;
    public final boolean c;
    public final Signature[] d;
    public final Signature[] e;
    public static final SigningInfoCompat a = new SigningInfoCompat(false, false, null, null);
    public static final Parcelable.Creator CREATOR = new zdn();

    public SigningInfoCompat(boolean z, boolean z2, Signature[] signatureArr, Signature[] signatureArr2) {
        this.b = z;
        this.c = z2;
        this.d = signatureArr;
        this.e = signatureArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SigningInfoCompat)) {
            return false;
        }
        SigningInfoCompat signingInfoCompat = (SigningInfoCompat) obj;
        return this.b == signingInfoCompat.b && this.c == signingInfoCompat.c && Arrays.equals(this.d, signingInfoCompat.d) && Arrays.equals(this.e, signingInfoCompat.e);
    }

    public final int hashCode() {
        return (((Objects.hash(Boolean.valueOf(this.b), Boolean.valueOf(this.c)) * 31) + Arrays.hashCode(this.d)) * 31) + Arrays.hashCode(this.e);
    }

    public final String toString() {
        return "SigningInfoCompat{hasMultipleSigners=" + this.b + ", hasPastSigningCertificates=" + this.c + ", signingCertificateHistory=" + Arrays.toString(this.d) + ", apkContentsSigners=" + Arrays.toString(this.e) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.b;
        int a2 = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.e(parcel, 2, this.c);
        arxc.J(parcel, 3, this.d, i);
        arxc.J(parcel, 4, this.e, i);
        arxc.c(parcel, a2);
    }
}

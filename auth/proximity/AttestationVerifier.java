package com.google.android.gms.auth.proximity;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.a;
import defpackage.aecd;
import defpackage.aece;
import defpackage.atzr;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AttestationVerifier extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aece();
    public final byte[][] a;
    public final int b;
    public final aecd c;
    public int d = 1;

    public AttestationVerifier(byte[][] bArr, int i) {
        this.a = bArr;
        this.b = i;
        if (aecd.a == null) {
            aecd.a = new aecd();
        }
        this.c = aecd.a;
    }

    public static final boolean b(boolean[] zArr, int i) {
        for (int i2 = 0; i2 < zArr.length; i2++) {
            if (i2 == i) {
                if (!zArr[i2]) {
                    Log.e("AttestationVerifier", a.l(i2, "Key usage index ", " should be set to true and was not"));
                    return false;
                }
            } else if (zArr[i2]) {
                Log.e("AttestationVerifier", a.l(i2, "Key usage index ", " should be set to false and was not"));
                return false;
            }
        }
        return true;
    }

    public final boolean a() {
        int i = 0;
        while (true) {
            byte[][] bArr = this.a;
            if (i >= bArr.length) {
                return true;
            }
            X509Certificate a = this.c.a(bArr[i]);
            if (a == null) {
                Log.e("AttestationVerifier", "Could not convert the attestation data to a set of valid certificates");
                return false;
            }
            try {
                a.checkValidity();
                i++;
            } catch (CertificateExpiredException | CertificateNotYetValidException e) {
                Log.e("AttestationVerifier", "Certificate is outside of the validity period", e);
                return false;
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AttestationVerifier) {
            return Arrays.equals(this.a, ((AttestationVerifier) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = atzr.a(parcel);
        atzr.A(parcel, 1, this.a);
        atzr.o(parcel, 2, this.b);
        atzr.c(parcel, a);
    }
}

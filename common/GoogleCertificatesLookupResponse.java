package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.aqti;
import defpackage.aquf;
import defpackage.aqul;
import defpackage.aquu;
import defpackage.arve;
import defpackage.arwm;
import defpackage.arxc;
import defpackage.asnh;
import defpackage.aspj;
import defpackage.eitj;
import defpackage.ejcb;
import java.security.MessageDigest;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aquf();
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;
    public final GoogleCertificatesLookupResponse f;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2, long j, GoogleCertificatesLookupResponse googleCertificatesLookupResponse, byte[] bArr) {
        this.a = z;
        this.b = str;
        this.c = i - 1;
        this.d = i2 - 1;
        this.e = j;
        this.f = googleCertificatesLookupResponse;
    }

    public static GoogleCertificatesLookupResponse a(String str, String str2, eitj eitjVar, boolean z, boolean z2) {
        return new GoogleCertificatesLookupResponse(false, b(str, str2, eitjVar, z, z2), 5, 1);
    }

    public static String b(String str, String str2, eitj eitjVar, boolean z, boolean z2) {
        if (str2 == null) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        if (!z2 && eitjVar != null) {
            for (int i = 0; i < ((ejcb) eitjVar).c; i++) {
                arrayList.add(((arve) eitjVar.get(i)).c());
            }
        }
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str, str2, arrayList, Boolean.valueOf(z), "251661004.true");
    }

    public static String e(String str, aquu aquuVar, boolean z) {
        if (aquuVar == null) {
            return String.format("%s: pkg=%s", "source stamp could not be verified", str);
        }
        if (!aquuVar.b()) {
            return String.format("%s: pkg=%s error=\"%s\"", "source stamp could not be verified", str, aquuVar.a());
        }
        ArrayList arrayList = new ArrayList();
        if (!z) {
            eitj eitjVar = aquuVar.b;
            int size = eitjVar.size();
            for (int i = 0; i < size; i++) {
                try {
                    byte[] encoded = ((X509Certificate) eitjVar.get(i)).getEncoded();
                    MessageDigest e = asnh.e("SHA-256");
                    arwm.s(e);
                    arrayList.add(aspj.b(e.digest(encoded)));
                } catch (CertificateEncodingException unused) {
                    arrayList.add("<failed to encode>");
                }
            }
        }
        return String.format("%s: pkg=%s error=\"%s\" stamp=%s", "source stamp could not be verified", str, aquuVar.a(), arrayList);
    }

    public static GoogleCertificatesLookupResponse f(String str, eitj eitjVar, boolean z) {
        return new GoogleCertificatesLookupResponse(false, b("debug cert rejected", str, eitjVar, false, z), 3, 1);
    }

    public final int c() {
        return aqti.b(this.d);
    }

    public final int d() {
        return aqul.a(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = arxc.a(parcel);
        arxc.e(parcel, 1, z);
        arxc.v(parcel, 2, this.b, false);
        arxc.o(parcel, 3, this.c);
        arxc.o(parcel, 4, this.d);
        arxc.q(parcel, 5, this.e);
        arxc.t(parcel, 6, this.f, i, false);
        arxc.c(parcel, a);
    }

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2, long j, GoogleCertificatesLookupResponse googleCertificatesLookupResponse) {
        this.a = z;
        this.b = str;
        this.c = aqul.a(i) - 1;
        this.d = aqti.b(i2) - 1;
        this.e = j;
        this.f = googleCertificatesLookupResponse;
    }

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2) {
        this(z, str, i, i2, -1L, null, null);
    }
}

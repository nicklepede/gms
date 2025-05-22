package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import defpackage.asvx;
import defpackage.aswu;
import defpackage.asxa;
import defpackage.asxj;
import defpackage.atxt;
import defpackage.atzb;
import defpackage.atzr;
import defpackage.aurb;
import defpackage.autd;
import defpackage.elgo;
import defpackage.elpg;
import java.security.MessageDigest;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class GoogleCertificatesLookupResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new aswu();
    public final boolean a;
    public final String b;
    public final int c;
    public final int d;
    public final long e;

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2, long j, byte[] bArr) {
        this.a = z;
        this.b = str;
        this.c = i - 1;
        this.d = i2 - 1;
        this.e = j;
    }

    public static GoogleCertificatesLookupResponse a(String str, String str2, elgo elgoVar, boolean z, boolean z2) {
        return new GoogleCertificatesLookupResponse(false, b(str, str2, elgoVar, z, z2), 5, 1);
    }

    public static String b(String str, String str2, elgo elgoVar, boolean z, boolean z2) {
        if (str2 == null) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        if (!z2 && elgoVar != null) {
            for (int i = 0; i < ((elpg) elgoVar).c; i++) {
                arrayList.add(((atxt) elgoVar.get(i)).c());
            }
        }
        return String.format("%s: pkg=%s, sha256=%s, atk=%s, ver=%s", str, str2, arrayList, Boolean.valueOf(z), "251864004.true");
    }

    public static String e(String str, asxj asxjVar, boolean z) {
        if (asxjVar == null) {
            return String.format("%s: pkg=%s", "source stamp could not be verified", str);
        }
        if (!asxjVar.b()) {
            return String.format("%s: pkg=%s error=\"%s\"", "source stamp could not be verified", str, asxjVar.a());
        }
        ArrayList arrayList = new ArrayList();
        if (!z) {
            elgo elgoVar = asxjVar.b;
            int size = elgoVar.size();
            for (int i = 0; i < size; i++) {
                try {
                    byte[] encoded = ((X509Certificate) elgoVar.get(i)).getEncoded();
                    MessageDigest e = aurb.e("SHA-256");
                    atzb.s(e);
                    arrayList.add(autd.b(e.digest(encoded)));
                } catch (CertificateEncodingException unused) {
                    arrayList.add("<failed to encode>");
                }
            }
        }
        return String.format("%s: pkg=%s error=\"%s\" stamp=%s", "source stamp could not be verified", str, asxjVar.a(), arrayList);
    }

    public static GoogleCertificatesLookupResponse f(String str, elgo elgoVar, boolean z) {
        return new GoogleCertificatesLookupResponse(false, b("debug cert rejected", str, elgoVar, false, z), 3, 1);
    }

    public final int c() {
        return asvx.b(this.d);
    }

    public final int d() {
        return asxa.a(this.c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.a;
        int a = atzr.a(parcel);
        atzr.e(parcel, 1, z);
        atzr.v(parcel, 2, this.b, false);
        atzr.o(parcel, 3, this.c);
        atzr.o(parcel, 4, this.d);
        atzr.q(parcel, 5, this.e);
        atzr.c(parcel, a);
    }

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2, long j) {
        this.a = z;
        this.b = str;
        this.c = asxa.a(i) - 1;
        this.d = asvx.b(i2) - 1;
        this.e = j;
    }

    public GoogleCertificatesLookupResponse(boolean z, String str, int i, int i2) {
        this(z, str, i, i2, -1L, null);
    }
}

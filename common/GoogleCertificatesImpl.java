package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.GoogleCertificatesLookupQuery;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.anxp;
import defpackage.aqta;
import defpackage.aqtc;
import defpackage.aqtd;
import defpackage.aqtf;
import defpackage.aqtx;
import defpackage.aqub;
import defpackage.aquc;
import defpackage.aqud;
import defpackage.aqvd;
import defpackage.aqvf;
import defpackage.arve;
import defpackage.arvn;
import defpackage.azht;
import defpackage.dvni;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.fmwh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class GoogleCertificatesImpl extends arvn {
    public static Context a() {
        Context context = anxp.a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Missing DynamiteApplicationContext.");
    }

    public static final aqub c(aqvf aqvfVar) {
        if (g(aqvfVar)) {
            return new aqub(false, 1);
        }
        aqtc aqtcVar = aqtd.a;
        if (aqvfVar.c == null) {
            aqvfVar.c = aqvf.a(aqvfVar.b, "*");
        }
        boolean a = aqtcVar.a(aqvfVar.c);
        return new aqub(a || aqvfVar.c(aqtd.c()), a || aqtd.a().a(aqvfVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.aqub d(defpackage.aqvf r6, defpackage.aqvd r7) {
        /*
            java.lang.String r0 = "PlatCertificateHelper"
            boolean r1 = g(r6)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L10
            aqub r6 = new aqub
            r6.<init>(r3, r2)
            return r6
        L10:
            java.lang.String r1 = r6.a
            arve r4 = r6.d
            if (r7 == 0) goto L58
            if (r4 == 0) goto L58
            boolean r5 = r7.b
            if (r5 == 0) goto L58
            java.util.Set r5 = defpackage.aqvd.a
            boolean r1 = r5.contains(r1)
            if (r1 != 0) goto L25
            goto L58
        L25:
            android.content.pm.PackageManager r7 = r7.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            java.lang.String r1 = "android"
            r5 = 64
            android.content.pm.PackageInfo r7 = r7.getPackageInfo(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            android.content.pm.Signature[] r1 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            int r1 = r1.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            if (r1 != r2) goto L48
            aqtx r1 = new aqtx     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            android.content.pm.Signature[] r7 = r7.signatures     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            r7 = r7[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            byte[] r7 = r7.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            r1.<init>(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
            goto L4e
        L42:
            r7 = move-exception
            java.lang.String r1 = "Unexpected exception looking up android"
            android.util.Log.w(r0, r1, r7)
        L48:
            java.lang.String r7 = "Could not determine the platform key"
            android.util.Log.w(r0, r7)
            r1 = 0
        L4e:
            if (r1 == 0) goto L58
            boolean r7 = r1.equals(r4)
            if (r7 == 0) goto L58
            r7 = r2
            goto L59
        L58:
            r7 = r3
        L59:
            if (r7 != 0) goto L68
            aqtc r0 = defpackage.aqtd.d()
            boolean r0 = r6.c(r0)
            if (r0 == 0) goto L66
            goto L68
        L66:
            r0 = r3
            goto L69
        L68:
            r0 = r2
        L69:
            if (r7 != 0) goto L77
            aqvb r7 = defpackage.aqtd.b()
            boolean r6 = r7.a(r6)
            if (r6 == 0) goto L76
            goto L77
        L76:
            r2 = r3
        L77:
            aqub r6 = new aqub
            r6.<init>(r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleCertificatesImpl.d(aqvf, aqvd):aqub");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.aqud e(java.lang.String r9, defpackage.aqvf r10, com.google.android.gms.common.GoogleCertificatesLookupQuery.ClientSourceStampRequest r11) {
        /*
            java.lang.String r0 = "GoogleCertificatesImpl"
            boolean r1 = f(r11)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L10
            boolean r1 = r11.b
            if (r1 == 0) goto L10
            r1 = r3
            goto L11
        L10:
            r1 = r2
        L11:
            if (r11 == 0) goto L29
            boolean r4 = f(r11)
            if (r4 == 0) goto L1a
            goto L29
        L1a:
            int r10 = r11.a()
            r4 = 3
            if (r10 != r4) goto L27
            boolean r10 = r11.b
            if (r10 == 0) goto L27
            r10 = r3
            goto L37
        L27:
            r10 = r2
            goto L37
        L29:
            aqvb r4 = defpackage.aqtd.b()
            aqtc r5 = r4.a
            int r10 = r10.b(r5)
            boolean r10 = r4.b(r3, r10)
        L37:
            boolean r11 = f(r11)
            r4 = 0
            if (r10 != 0) goto L47
            if (r1 == 0) goto L41
            goto L47
        L41:
            aqud r9 = new aqud
            r9.<init>(r3, r4, r4)
            return r9
        L47:
            aqus r5 = new aqus     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            android.content.Context r6 = a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            r7 = 0
            r5.<init>(r6, r9, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            aquu r5 = r5.a()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            boolean r6 = r5.c()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            if (r6 != 0) goto L6e
            java.lang.String r6 = "Source stamp verification failed, package: %s status: %s"
            aqut r7 = r5.a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            r8[r2] = r9     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            r8[r3] = r7     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            java.lang.String r9 = java.lang.String.format(r6, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            android.util.Log.w(r0, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
        L6e:
            if (r11 == 0) goto L87
            aqud r9 = new aqud     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            boolean r6 = r5.c()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            if (r6 != 0) goto L7d
            if (r1 != 0) goto L7b
            goto L7d
        L7b:
            r6 = r2
            goto L7e
        L7d:
            r6 = r3
        L7e:
            if (r3 == r1) goto L82
            r7 = r4
            goto L83
        L82:
            r7 = r5
        L83:
            r9.<init>(r6, r7, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            goto L88
        L87:
            r9 = r4
        L88:
            aqud r6 = new aqud     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            boolean r7 = r5.c()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            if (r7 != 0) goto L92
            if (r10 != 0) goto L93
        L92:
            r2 = r3
        L93:
            if (r3 == r10) goto L96
            r5 = r4
        L96:
            r6.<init>(r2, r5, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9a
            return r6
        L9a:
            r9 = move-exception
            java.lang.String r2 = "Could not verify source stamp"
            android.util.Log.w(r0, r2, r9)
            if (r11 == 0) goto Laa
            r9 = r1 ^ 1
            aqud r11 = new aqud
            r11.<init>(r9, r4, r4)
            goto Lab
        Laa:
            r11 = r4
        Lab:
            r9 = r10 ^ 1
            aqud r10 = new aqud
            r10.<init>(r9, r4, r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleCertificatesImpl.e(java.lang.String, aqvf, com.google.android.gms.common.GoogleCertificatesLookupQuery$ClientSourceStampRequest):aqud");
    }

    private static final boolean f(GoogleCertificatesLookupQuery.ClientSourceStampRequest clientSourceStampRequest) {
        return clientSourceStampRequest != null && clientSourceStampRequest.a() == 2;
    }

    private static final boolean g(aqvf aqvfVar) {
        if (aqvfVar.a.equals("com.google.android.instantapps.supervisor") && aqta.a(a())) {
            dvni.f(a());
            try {
                return fmwh.a.a().d();
            } catch (SecurityException e) {
                Log.w("GoogleCertificatesImpl", "Flags cannot be read", e);
            }
        }
        return false;
    }

    @Deprecated
    private static final eiuu h() {
        Log.w("GoogleCertificatesImpl", "App has 2016 GMS Core SDK; yielding empty certs");
        return ejck.a;
    }

    private static final boolean i(aqvf aqvfVar) {
        return c(aqvfVar).a();
    }

    private static final boolean j(aqvf aqvfVar, aqvd aqvdVar) {
        return d(aqvfVar, aqvdVar).a();
    }

    private static final aqud k(String str, aqvf aqvfVar) {
        return e(str, aqvfVar, null);
    }

    @Override // defpackage.arvo
    @Deprecated
    public azht getGoogleCertificates() {
        return new ObjectWrapper((arve[]) h().toArray(new arve[0]));
    }

    @Override // defpackage.arvo
    @Deprecated
    public azht getGoogleReleaseCertificates() {
        return new ObjectWrapper((arve[]) h().toArray(new arve[0]));
    }

    @Override // defpackage.arvo
    public boolean isFineGrainedPackageVerificationAvailable() {
        return true;
    }

    @Override // defpackage.arvo
    @Deprecated
    public boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, azht azhtVar) {
        arve arveVar = googleCertificatesQuery.d;
        if (arveVar == null) {
            return false;
        }
        aqvd aqvdVar = azhtVar != null ? new aqvd((PackageManager) ObjectWrapper.a(azhtVar)) : null;
        String str = googleCertificatesQuery.a;
        aqvf aqvfVar = new aqvf(str, arveVar);
        if (j(aqvfVar, aqvdVar) && k(str, aqvfVar).a) {
            return true;
        }
        if (!i(aqvfVar)) {
            return false;
        }
        if (googleCertificatesQuery.b) {
            return true;
        }
        if (googleCertificatesQuery.c || !aqtf.a(a(), str)) {
            return false;
        }
        Log.w("GoogleCertificatesImpl", String.valueOf(str).concat(" is signed with test keys"));
        return true;
    }

    @Override // defpackage.arvo
    @Deprecated
    public boolean isGoogleReleaseSigned(String str, azht azhtVar) {
        aqvf aqvfVar = new aqvf(str, new aqtx((byte[]) ObjectWrapper.a(azhtVar)));
        return j(aqvfVar, null) && k(str, aqvfVar).a;
    }

    @Override // defpackage.arvo
    @Deprecated
    public boolean isGoogleSigned(String str, azht azhtVar) {
        aqvf aqvfVar = new aqvf(str, new aqtx((byte[]) ObjectWrapper.a(azhtVar)));
        return (j(aqvfVar, null) && k(str, aqvfVar).a) || i(aqvfVar);
    }

    @Override // defpackage.arvo
    public GoogleCertificatesLookupResponse isPackageGoogleOrPlatformSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery) {
        return new aquc(googleCertificatesLookupQuery, true).a();
    }

    @Override // defpackage.arvo
    public boolean isPackageGoogleOrPlatformSignedAvailable() {
        return true;
    }

    @Override // defpackage.arvo
    public GoogleCertificatesLookupResponse queryPackageSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery) {
        return new aquc(googleCertificatesLookupQuery, false).a();
    }
}

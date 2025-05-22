package com.google.android.gms.common;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.dynamic.ObjectWrapper;
import defpackage.apzh;
import defpackage.asvq;
import defpackage.asvr;
import defpackage.asvs;
import defpackage.asvu;
import defpackage.aswm;
import defpackage.aswq;
import defpackage.aswr;
import defpackage.asws;
import defpackage.asxh;
import defpackage.asxj;
import defpackage.asxq;
import defpackage.asxs;
import defpackage.asxu;
import defpackage.atxt;
import defpackage.atyc;
import defpackage.bblp;
import defpackage.dxyi;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.fpog;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class GoogleCertificatesImpl extends atyc {
    public static Context a() {
        Context context = apzh.a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Missing DynamiteApplicationContext.");
    }

    public static final asws c(String str, asxu asxuVar, boolean z) {
        asxq b = asvs.b();
        boolean b2 = b.b(1, asxuVar.b(b.a));
        if (!b2 && !z) {
            return new asws(true, null);
        }
        try {
            asxj a = new asxh(a(), str, 0L, false).a();
            if (!a.c()) {
                Log.w("GoogleCertificatesImpl", String.format("Source stamp verification failed, package: %s status: %s", str, a.a));
            }
            return new asws(a.c() || !b2, a);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("GoogleCertificatesImpl", "Could not verify source stamp", e);
            return new asws(!b2, null);
        }
    }

    public static final aswq d(asxu asxuVar) {
        if (f(asxuVar)) {
            return new aswq(false, 1);
        }
        asvr asvrVar = asvs.a;
        if (asxuVar.c == null) {
            asxuVar.c = asxu.a(asxuVar.b, "*");
        }
        boolean a = asvrVar.a(asxuVar.c);
        return new aswq(a || asxuVar.c(asvs.c()), a || asvs.a().a(asxuVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.aswq e(defpackage.asxu r6, defpackage.asxs r7) {
        /*
            java.lang.String r0 = "PlatCertificateHelper"
            boolean r1 = f(r6)
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L10
            aswq r6 = new aswq
            r6.<init>(r3, r2)
            return r6
        L10:
            java.lang.String r1 = r6.a
            atxt r4 = r6.d
            if (r7 == 0) goto L58
            if (r4 == 0) goto L58
            boolean r5 = r7.b
            if (r5 == 0) goto L58
            java.util.Set r5 = defpackage.asxs.a
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
            aswm r1 = new aswm     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L42
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
            asvr r0 = defpackage.asvs.d()
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
            asxq r7 = defpackage.asvs.b()
            boolean r6 = r7.a(r6)
            if (r6 == 0) goto L76
            goto L77
        L76:
            r2 = r3
        L77:
            aswq r6 = new aswq
            r6.<init>(r0, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GoogleCertificatesImpl.e(asxu, asxs):aswq");
    }

    private static final boolean f(asxu asxuVar) {
        if (asxuVar.a.equals("com.google.android.instantapps.supervisor") && asvq.a(a())) {
            dxyi.f(a());
            try {
                return fpog.a.lK().d();
            } catch (SecurityException e) {
                Log.w("GoogleCertificatesImpl", "Flags cannot be read", e);
            }
        }
        return false;
    }

    @Deprecated
    private static final elhz g() {
        Log.w("GoogleCertificatesImpl", "App has 2016 GMS Core SDK; yielding empty certs");
        return elpp.a;
    }

    private static final asws h(String str, asxu asxuVar) {
        return c(str, asxuVar, false);
    }

    private static final boolean i(asxu asxuVar) {
        return d(asxuVar).a();
    }

    private static final boolean j(asxu asxuVar, asxs asxsVar) {
        return e(asxuVar, asxsVar).a();
    }

    @Override // defpackage.atyd
    @Deprecated
    public bblp getGoogleCertificates() {
        return new ObjectWrapper((atxt[]) g().toArray(new atxt[0]));
    }

    @Override // defpackage.atyd
    @Deprecated
    public bblp getGoogleReleaseCertificates() {
        return new ObjectWrapper((atxt[]) g().toArray(new atxt[0]));
    }

    @Override // defpackage.atyd
    public boolean isFineGrainedPackageVerificationAvailable() {
        return true;
    }

    @Override // defpackage.atyd
    @Deprecated
    public boolean isGoogleOrPlatformSigned(GoogleCertificatesQuery googleCertificatesQuery, bblp bblpVar) {
        atxt atxtVar = googleCertificatesQuery.d;
        if (atxtVar == null) {
            return false;
        }
        asxs asxsVar = bblpVar != null ? new asxs((PackageManager) ObjectWrapper.a(bblpVar)) : null;
        String str = googleCertificatesQuery.a;
        asxu asxuVar = new asxu(str, atxtVar);
        if (j(asxuVar, asxsVar) && h(str, asxuVar).a) {
            return true;
        }
        if (!i(asxuVar)) {
            return false;
        }
        if (googleCertificatesQuery.b) {
            return true;
        }
        if (googleCertificatesQuery.c || !asvu.a(a(), str)) {
            return false;
        }
        Log.w("GoogleCertificatesImpl", String.valueOf(str).concat(" is signed with test keys"));
        return true;
    }

    @Override // defpackage.atyd
    @Deprecated
    public boolean isGoogleReleaseSigned(String str, bblp bblpVar) {
        asxu asxuVar = new asxu(str, new aswm((byte[]) ObjectWrapper.a(bblpVar)));
        return j(asxuVar, null) && h(str, asxuVar).a;
    }

    @Override // defpackage.atyd
    @Deprecated
    public boolean isGoogleSigned(String str, bblp bblpVar) {
        asxu asxuVar = new asxu(str, new aswm((byte[]) ObjectWrapper.a(bblpVar)));
        return (j(asxuVar, null) && h(str, asxuVar).a) || i(asxuVar);
    }

    @Override // defpackage.atyd
    public GoogleCertificatesLookupResponse isPackageGoogleOrPlatformSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery) {
        return new aswr(googleCertificatesLookupQuery, true).a();
    }

    @Override // defpackage.atyd
    public boolean isPackageGoogleOrPlatformSignedAvailable() {
        return true;
    }

    @Override // defpackage.atyd
    public GoogleCertificatesLookupResponse queryPackageSigned(GoogleCertificatesLookupQuery googleCertificatesLookupQuery) {
        return new aswr(googleCertificatesLookupQuery, false).a();
    }
}

package com.google.android.gms.providerinstaller;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.org.conscrypt.Conscrypt;
import defpackage.a;
import defpackage.apsr;
import defpackage.apsz;
import defpackage.apta;
import defpackage.asfh;
import defpackage.asfl;
import defpackage.asfp;
import defpackage.asnh;
import defpackage.asow;
import defpackage.aspe;
import defpackage.cwvv;
import defpackage.cwvw;
import defpackage.cwwe;
import defpackage.cwwf;
import defpackage.dnmt;
import defpackage.eifw;
import defpackage.eijm;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fief;
import defpackage.fiwf;
import defpackage.frpv;
import defpackage.frpy;
import defpackage.frqb;
import java.lang.reflect.Field;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ProviderInstallerImpl {
    private static final Object a = new Object();
    private static Provider b;

    private static SSLContext a() {
        SSLContext sSLContext;
        for (int i = 0; i < 2; i++) {
            try {
                sSLContext = SSLContext.getInstance("Default");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (sSLContext != null) {
                return sSLContext;
            }
        }
        throw new SecurityException("Failed to find SSLContext.Default provider");
    }

    private static void b(Context context) {
        int i = FlagRegistrar.c;
        cwwe.a.a(context);
        if ("com.google.android.gms".equals(context.getPackageName())) {
            try {
                context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                if (!asow.g(context, "conscrypt_gmscore_jni")) {
                    throw new SecurityException("loadLibrary failed");
                }
                int b2 = aspe.b(asnh.a(context));
                try {
                    int nativeCodeVersion = getNativeCodeVersion();
                    if (b2 != nativeCodeVersion) {
                        throw new SecurityException(String.format("libgmscore version mismatch (%d vs. %d)", Integer.valueOf(b2), Integer.valueOf(nativeCodeVersion)));
                    }
                } catch (UnsatisfiedLinkError e) {
                    throw new SecurityException(e);
                }
            } catch (PackageManager.NameNotFoundException e2) {
                throw new SecurityException("Failed to find ApplicationInfo", e2);
            }
        } else {
            System.loadLibrary("conscrypt_gmscore_jni");
        }
        Conscrypt.ProviderBuilder newProviderBuilder = Conscrypt.newProviderBuilder();
        newProviderBuilder.setName("GmsCore_OpenSSL");
        newProviderBuilder.defaultTlsProtocol(true != frpy.a.a().b() ? "TLSv1.2" : "TLSv1.3");
        newProviderBuilder.isTlsV1Deprecated(frqb.a.a().b());
        newProviderBuilder.isTlsV1Enabled(!r0.a().a());
        b = newProviderBuilder.build();
    }

    private static void c() {
        try {
            SSLContext a2 = a();
            Field declaredField = SSLSocketFactory.class.getDeclaredField("defaultSocketFactory");
            declaredField.setAccessible(true);
            declaredField.set(null, a2.getSocketFactory());
            Field declaredField2 = SSLServerSocketFactory.class.getDeclaredField("defaultServerSocketFactory");
            declaredField2.setAccessible(true);
            declaredField2.set(null, a2.getServerSocketFactory());
        } catch (IllegalAccessException e) {
            Log.e("ProviderInstaller", "Failed to set socket factory via reflection");
            throw new SecurityException(e);
        } catch (NoSuchFieldError e2) {
            e = e2;
            Log.e("ProviderInstaller", "Failed to set socket factory via reflection");
            throw new SecurityException(e);
        } catch (NoSuchFieldException e3) {
            e = e3;
            Log.e("ProviderInstaller", "Failed to set socket factory via reflection");
            throw new SecurityException(e);
        }
    }

    private static void d(apta aptaVar, Context context, int i, eijm eijmVar) {
        if (frpv.a.a().a()) {
            if (aptaVar == null) {
                apsr m = apta.m(context, "CLEARCUT_PROVIDERINSTALLER");
                m.d(fief.UNMETERED_OR_DAILY);
                aptaVar = m.a();
            }
            cwvw cwvwVar = new cwvw();
            fecj v = cwvv.a.v();
            if (!v.b.L()) {
                v.U();
            }
            cwvv cwvvVar = (cwvv) v.b;
            cwvvVar.c = i - 1;
            cwvvVar.b |= 1;
            long millis = eijmVar.d().toMillis();
            if (!v.b.L()) {
                v.U();
            }
            cwvv cwvvVar2 = (cwvv) v.b;
            cwvvVar2.b |= 2;
            cwvvVar2.d = millis;
            apsz j = aptaVar.j((cwvv) v.Q(), dnmt.b(context, cwvwVar));
            fecj v2 = asfh.a.v();
            asfp asfpVar = asfp.USE_CASE_CLEARCUT_DEFAULT;
            if (!v2.b.L()) {
                v2.U();
            }
            ((asfh) v2.b).b = asfpVar.a();
            if (!v2.b.L()) {
                v2.U();
            }
            fecp fecpVar = v2.b;
            ((asfh) fecpVar).c = 1;
            asfl asflVar = asfl.INITIATOR_CATEGORY_1;
            if (!fecpVar.L()) {
                v2.U();
            }
            ((asfh) v2.b).d = asflVar.a();
            j.m = (asfh) v2.Q();
            j.d();
        }
    }

    private static native int getNativeCodeVersion();

    public static void insertProvider(Context context) {
        insertProvider(null, new cwwf(context));
    }

    public static void insertProvider(apta aptaVar, Context context) {
        eijm c = eijm.c(eifw.a);
        synchronized (a) {
            if (b == null) {
                Provider provider = Security.getProvider("GmsCore_OpenSSL");
                if (provider != null) {
                    b = provider;
                    return;
                }
                b(context);
            }
            int insertProviderAt = Security.insertProviderAt(b, 1);
            if (insertProviderAt == 1) {
                Conscrypt.setUseEngineSocketByDefault(frpy.a.a().a());
                if (Build.VERSION.SDK_INT < 28) {
                    c();
                }
                Security.setProperty("ssl.SocketFactory.provider", "com.google.android.gms.org.conscrypt.OpenSSLSocketFactoryImpl");
                Security.setProperty("ssl.ServerSocketFactory.provider", "com.google.android.gms.org.conscrypt.OpenSSLServerSocketFactoryImpl");
                SSLContext a2 = a();
                SSLContext.setDefault(a2);
                HttpsURLConnection.setDefaultSSLSocketFactory(a2.getSocketFactory());
                HttpsURLConnection.setDefaultHostnameVerifier(fiwf.a);
                d(aptaVar, context, 2, c);
                Log.i("ProviderInstaller", "Installed default security provider GmsCore_OpenSSL");
            } else if (insertProviderAt != -1) {
                d(aptaVar, context, 1, c);
                throw new SecurityException(a.j(insertProviderAt, "Failed to install security provider GmsCore_OpenSSL, result: "));
            }
            d(aptaVar, context, 3, c);
        }
    }
}

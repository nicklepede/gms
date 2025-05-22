package com.google.android.gms.providerinstaller;

import android.content.Context;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.org.conscrypt.Conscrypt;
import defpackage.a;
import defpackage.arvi;
import defpackage.arvq;
import defpackage.arvr;
import defpackage.aujb;
import defpackage.aujf;
import defpackage.aujj;
import defpackage.czfs;
import defpackage.czft;
import defpackage.czgd;
import defpackage.dpxc;
import defpackage.ektc;
import defpackage.ekwr;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fkuc;
import defpackage.flmc;
import defpackage.fukb;
import defpackage.fuke;
import java.lang.reflect.Field;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLServerSocketFactory;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ProviderInstallerImpl {
    private static final Object a = new Object();
    private static Provider b;

    private ProviderInstallerImpl() {
    }

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

    private static void b() {
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

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0046, code lost:
    
        if (r5 >= r0.lK().b()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        if (java.security.Security.getProvider("GmsCore_OpenSSL") != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        defpackage.ekvl.r(r9, "GmsCore Provider already installed");
        r9 = java.security.Security.getProvider("AndroidOpenSSL");
        r0 = new defpackage.czgc();
        r0.putAll(r9);
        java.security.Security.insertProviderAt(r0, 1);
        com.google.android.gms.providerinstaller.ProviderInstallerImpl.b = r0;
        android.util.Log.i("ProviderInstaller", "Installed default security provider AndroidOpenSSL");
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0080, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0062, code lost:
    
        r9 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < defpackage.fuke.a.lK().a()) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean c(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.providerinstaller.ProviderInstallerImpl.c(android.content.Context):boolean");
    }

    private static void d(arvr arvrVar, Context context, int i, ekwr ekwrVar) {
        if (fukb.a.lK().a()) {
            if (arvrVar == null) {
                arvi m = arvr.m(context, "CLEARCUT_PROVIDERINSTALLER");
                m.d(fkuc.UNMETERED_OR_DAILY);
                arvrVar = m.a();
            }
            czft czftVar = new czft();
            fgrc v = czfs.a.v();
            if (!v.b.L()) {
                v.U();
            }
            czfs czfsVar = (czfs) v.b;
            czfsVar.c = i - 1;
            czfsVar.b |= 1;
            long millis = ekwrVar.d().toMillis();
            if (!v.b.L()) {
                v.U();
            }
            czfs czfsVar2 = (czfs) v.b;
            czfsVar2.b |= 2;
            czfsVar2.d = millis;
            arvq j = arvrVar.j((czfs) v.Q(), dpxc.b(context, czftVar));
            fgrc v2 = aujb.a.v();
            aujj aujjVar = aujj.USE_CASE_CLEARCUT_DEFAULT;
            if (!v2.b.L()) {
                v2.U();
            }
            ((aujb) v2.b).b = aujjVar.a();
            if (!v2.b.L()) {
                v2.U();
            }
            fgri fgriVar = v2.b;
            ((aujb) fgriVar).c = 1;
            aujf aujfVar = aujf.INITIATOR_CATEGORY_1;
            if (!fgriVar.L()) {
                v2.U();
            }
            ((aujb) v2.b).d = aujfVar.a();
            j.m = (aujb) v2.Q();
            j.d();
        }
    }

    private static native int getNativeCodeVersion();

    public static void insertProvider(Context context) {
        insertProvider(null, new czgd(context));
    }

    public static void insertProvider(arvr arvrVar, Context context) {
        ekwr c = ekwr.c(ektc.a);
        synchronized (a) {
            if (b == null) {
                Provider provider = Security.getProvider("GmsCore_OpenSSL");
                if (provider != null) {
                    b = provider;
                    return;
                } else if (!c(context)) {
                    return;
                }
            }
            int insertProviderAt = Security.insertProviderAt(b, 1);
            if (insertProviderAt == 1) {
                Conscrypt.setUseEngineSocketByDefault(fuke.a.lK().c());
                if (Build.VERSION.SDK_INT < 28) {
                    b();
                }
                Security.setProperty("ssl.SocketFactory.provider", "com.google.android.gms.org.conscrypt.OpenSSLSocketFactoryImpl");
                Security.setProperty("ssl.ServerSocketFactory.provider", "com.google.android.gms.org.conscrypt.OpenSSLServerSocketFactoryImpl");
                SSLContext a2 = a();
                SSLContext.setDefault(a2);
                HttpsURLConnection.setDefaultSSLSocketFactory(a2.getSocketFactory());
                HttpsURLConnection.setDefaultHostnameVerifier(flmc.a);
                d(arvrVar, context, 2, c);
                Log.i("ProviderInstaller", "Installed default security provider GmsCore_OpenSSL");
            } else if (insertProviderAt != -1) {
                d(arvrVar, context, 1, c);
                throw new SecurityException(a.j(insertProviderAt, "Failed to install security provider GmsCore_OpenSSL, result: "));
            }
            d(arvrVar, context, 3, c);
        }
    }
}

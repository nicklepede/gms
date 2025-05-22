package com.google.android.gms.semanticlocationhistory.isolation;

import android.content.Context;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ausq;
import defpackage.autr;
import defpackage.ddji;
import defpackage.ddjj;
import defpackage.ddjk;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.fpqh;
import java.lang.Thread;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class OdlhJniLoader {
    private boolean d;
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "OdlhJniLoader");
    public static final OdlhJniLoader a = new OdlhJniLoader();
    private String c = null;
    private Exception e = null;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class NullNativeProxyReferenceError extends UnsatisfiedLinkError {
        private NullNativeProxyReferenceError() {
        }
    }

    private static native boolean nativeConnect();

    private static native void nativeDisconnect();

    public final Object a(ddjk ddjkVar) {
        try {
            return ddjkVar.a();
        } catch (NullNativeProxyReferenceError e) {
            Exception exc = this.e;
            if (exc != null) {
                e.addSuppressed(exc);
            }
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), e);
            }
            throw e;
        }
    }

    public final void b() {
        synchronized (this) {
            this.e = new Exception();
            ekvl.q(this.c != null);
            if (this.d) {
                nativeDisconnect();
            }
        }
    }

    public final boolean c() {
        synchronized (this) {
            this.e = null;
            ekvl.q(this.c != null);
            if (this.d) {
                return nativeConnect();
            }
            return true;
        }
    }

    public final synchronized boolean d(Context context) {
        String str = this.c;
        if (str != null) {
            ((eluo) b.h()).B("%s already loaded", str);
            return true;
        }
        if (fpqh.a.lK().b()) {
            int i = autr.a;
            if (ausq.g(context, "odlh_proxy_jni")) {
                this.c = "odlh_proxy_jni";
                this.d = true;
                ddjj.d(context);
                ((eluo) b.h()).B("Loaded remote proxy library %s", "odlh_proxy_jni");
                return true;
            }
        } else {
            boolean c = fpqh.c();
            if (c || fpqh.d()) {
                String a2 = ddji.a(context);
                if (c && a2 != null) {
                    try {
                        System.load(a2);
                        this.c = a2;
                        this.d = false;
                        ((eluo) b.h()).B("Loaded ODLH WASM library %s", a2);
                        return true;
                    } catch (UnsatisfiedLinkError e) {
                        ((eluo) ((eluo) b.j()).s(e)).B("Failed to load ODLH WASM library %s", a2);
                        return false;
                    }
                }
            }
            int i2 = autr.a;
            if (ausq.g(context, "odlh_jni")) {
                this.c = "odlh_jni";
                this.d = false;
                ((eluo) b.h()).B("Loaded %s library", "odlh_jni");
                return true;
            }
        }
        return false;
    }
}

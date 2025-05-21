package com.google.android.gms.semanticlocationhistory.isolation;

import android.content.Context;
import defpackage.asej;
import defpackage.asot;
import defpackage.asow;
import defpackage.aspx;
import defpackage.daza;
import defpackage.dazb;
import defpackage.dazc;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.fmyi;
import java.lang.Thread;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class OdlhJniLoader {
    private boolean d;
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "OdlhJniLoader");
    public static final OdlhJniLoader a = new OdlhJniLoader();
    private String c = null;
    private Exception e = null;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class NullNativeProxyReferenceError extends UnsatisfiedLinkError {
        private NullNativeProxyReferenceError() {
        }
    }

    private static native boolean nativeConnect();

    private static native void nativeDisconnect();

    public final Object a(dazc dazcVar) {
        try {
            return dazcVar.a();
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
            eiig.p(this.c != null);
            if (this.d) {
                nativeDisconnect();
            }
        }
    }

    public final boolean c() {
        synchronized (this) {
            this.e = null;
            eiig.p(this.c != null);
            if (this.d) {
                return nativeConnect();
            }
            return true;
        }
    }

    public final synchronized boolean d(Context context) {
        String str = this.c;
        if (str != null) {
            ((ejhf) b.h()).B("%s already loaded", str);
            return true;
        }
        if (fmyi.a.a().b()) {
            int i = aspx.a;
            if (asow.g(context, "odlh_proxy_jni")) {
                this.c = "odlh_proxy_jni";
                this.d = true;
                dazb.d(context);
                ((ejhf) b.h()).B("Loaded remote proxy library %s", "odlh_proxy_jni");
                return true;
            }
        } else {
            boolean c = fmyi.c();
            if (c || fmyi.d()) {
                String a2 = daza.a(context);
                if (c && a2 != null) {
                    try {
                        System.load(a2);
                        this.c = a2;
                        this.d = false;
                        ((ejhf) b.h()).B("Loaded ODLH WASM library %s", a2);
                        return true;
                    } catch (UnsatisfiedLinkError e) {
                        ((ejhf) ((ejhf) b.j()).s(e)).B("Failed to load ODLH WASM library %s", a2);
                        return false;
                    }
                }
            }
            int i2 = aspx.a;
            if (asow.g(context, "odlh_jni")) {
                this.c = "odlh_jni";
                this.d = false;
                ((ejhf) b.h()).B("Loaded %s library", "odlh_jni");
                return true;
            }
        }
        return false;
    }
}

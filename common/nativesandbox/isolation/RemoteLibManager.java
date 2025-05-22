package com.google.android.gms.common.nativesandbox.isolation;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import defpackage.aucx;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzip;
import defpackage.eluo;
import defpackage.fxxm;
import java.lang.reflect.Constructor;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class RemoteLibManager extends bzip {
    private static final ausn a = ausn.b("RemoteLibMgr", auid.NATIVE_SANDBOX);
    private final Context b;
    private final Map c;

    public RemoteLibManager(Context context) {
        fxxm.f(context, "appContext");
        this.b = context;
        this.c = new LinkedHashMap();
    }

    private static final Binder e(ClassLoader classLoader, String str) {
        try {
            Class<? extends U> asSubclass = classLoader.loadClass(str).asSubclass(Binder.class);
            fxxm.e(asSubclass, "asSubclass(...)");
            Constructor constructor = asSubclass.getConstructor(null);
            fxxm.e(constructor, "getConstructor(...)");
            return (Binder) constructor.newInstance(null);
        } catch (ClassCastException e) {
            ((eluo) ((eluo) a.i()).s(e)).B("Failed to instantiate Binder class %s", str);
            return null;
        } catch (LinkageError e2) {
            ((eluo) ((eluo) a.i()).s(e2)).B("Failed to instantiate Binder class %s", str);
            return null;
        } catch (ReflectiveOperationException e3) {
            ((eluo) ((eluo) a.i()).s(e3)).B("Failed to instantiate Binder class %s", str);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00cf A[Catch: all -> 0x0107, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0019, B:7:0x002b, B:23:0x0036, B:25:0x004a, B:28:0x00cf, B:30:0x0059, B:32:0x006a, B:33:0x0078, B:35:0x007e, B:36:0x008c, B:38:0x0096, B:39:0x00a4, B:11:0x00d8, B:15:0x00e7, B:17:0x00ef, B:20:0x00ff, B:21:0x0106, B:42:0x00c0), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d5  */
    @Override // defpackage.bziq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized android.os.IBinder a(final java.lang.String r10, android.os.ParcelFileDescriptor r11, java.lang.String r12, java.lang.String r13, final android.os.IBinder r14) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.nativesandbox.isolation.RemoteLibManager.a(java.lang.String, android.os.ParcelFileDescriptor, java.lang.String, java.lang.String, android.os.IBinder):android.os.IBinder");
    }

    @Override // defpackage.bziq
    public final synchronized void c(String str, IBinder iBinder) {
        fxxm.f(str, "libPath");
        fxxm.f(iBinder, "client");
        Map map = this.c;
        aucx aucxVar = (aucx) map.get(str);
        if (aucxVar == null) {
            ((eluo) a.i()).B("library %s is not connected", str);
            return;
        }
        Map map2 = aucxVar.d;
        Object remove = map2.remove(iBinder);
        if (remove == null) {
            throw new IllegalStateException("client is not connected to library ".concat(String.valueOf(str)));
        }
        iBinder.unlinkToDeath((IBinder.DeathRecipient) remove, 0);
        if (map2.isEmpty()) {
            aucxVar.b.close();
            unload(aucxVar.c);
            aucxVar.a.c.b();
            map.remove(str);
        }
    }

    @Override // defpackage.bziq
    public final void d() {
        System.loadLibrary("isolation_mgr_jni");
    }

    public final native long load(String str);

    public final native void unload(long j);
}

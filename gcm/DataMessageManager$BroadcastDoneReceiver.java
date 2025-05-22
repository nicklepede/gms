package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.gcm.DataMessageManager$BroadcastDoneReceiver;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bkbd;
import defpackage.bker;
import defpackage.dhbt;
import defpackage.dhbu;
import defpackage.dhma;
import defpackage.ejhz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class DataMessageManager$BroadcastDoneReceiver extends TracingBroadcastReceiver {
    public final dhma a;
    boolean b;
    private final bkbd c;
    private final Intent d;
    private final ejhz e;
    private final long f;
    private final dhbu g;
    private final boolean h;
    private final dhbt i;

    public DataMessageManager$BroadcastDoneReceiver(bkbd bkbdVar, Intent intent, ejhz ejhzVar, long j, dhbt dhbtVar) {
        super("gcm");
        this.a = new dhma();
        this.b = true;
        this.c = bkbdVar;
        this.d = intent;
        this.e = ejhzVar;
        this.f = j;
        this.g = null;
        this.i = dhbtVar;
        this.h = true;
    }

    public final boolean b() {
        boolean z = true;
        if (this.h) {
            dhbt dhbtVar = this.i;
            if (dhbtVar != null) {
                dhbtVar.a();
            }
            return true;
        }
        synchronized (this) {
            if (this.b) {
                dhbu dhbuVar = this.g;
                if (dhbuVar != null) {
                    dhbuVar.g();
                } else {
                    this.c.m();
                }
            } else {
                z = false;
            }
            this.b = false;
        }
        return z;
    }

    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
    public final void jP(Context context, Intent intent) {
        int resultCode = getResultCode();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f;
        bkbd bkbdVar = this.c;
        ejhz ejhzVar = this.e;
        if (resultCode == -1) {
            GcmChimeraService.b("Successful broadcast to %s (id=%s time=%dms priority=%s)", ejhzVar.f, ejhzVar.i, Long.valueOf(elapsedRealtime), bkbdVar.e(ejhzVar.r));
        } else if (resultCode == 0) {
            Intent intent2 = this.d;
            Log.w("GCM", "broadcast intent callback: result=CANCELLED for".concat(String.valueOf(String.valueOf(intent2))));
            String str = intent2.getPackage();
            if (str == null) {
                GcmChimeraService.b("Broadcast sent to %s missing Intent package (id=%s time=%dms priority=%s)", ejhzVar.f, ejhzVar.i, Long.valueOf(elapsedRealtime), bkbdVar.e(ejhzVar.r));
            } else {
                bker bkerVar = new bker(intent2.getPackage(), (int) ejhzVar.l);
                if (bkbdVar.g.c(bkerVar)) {
                    try {
                        if ((bkerVar.a(bkbdVar.q, 8192).flags & 2097152) != 0) {
                            GcmChimeraService.b("Failed to broadcast to stopped app %s (id=%s time=%dms priority=%s)", ejhzVar.f, ejhzVar.i, Long.valueOf(elapsedRealtime), bkbdVar.e(ejhzVar.r));
                            bkbdVar.o.c(new bker(ejhzVar.f, (int) ejhzVar.l), ejhzVar.i, ejhzVar.r, (ejhzVar.b & 268435456) != 0 ? Integer.valueOf(ejhzVar.s) : null, 7);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    GcmChimeraService.b("No response to broadcast from %s (id=%s time=%dms priority=%s)", ejhzVar.f, ejhzVar.i, Long.valueOf(elapsedRealtime), bkbdVar.e(ejhzVar.r));
                } else if (bkbdVar.g.b.p(bkerVar) == 2) {
                    GcmChimeraService.b("Failed to broadcast to %s, it may be updating (id=%s time=%dms priority=%s)", str, ejhzVar.i, Long.valueOf(elapsedRealtime), bkbdVar.e(ejhzVar.r));
                    bkbdVar.u.c(ejhzVar);
                } else {
                    GcmChimeraService.b("Failed to broadcast to uninstalled app %s (id=%s time=%dms priority=%s)", str, ejhzVar.i, Long.valueOf(elapsedRealtime), bkbdVar.e(ejhzVar.r));
                    bkbdVar.o.c(bkerVar, ejhzVar.i, ejhzVar.r, (ejhzVar.b & 268435456) != 0 ? Integer.valueOf(ejhzVar.s) : null, 5);
                    bkbdVar.o(bkerVar);
                }
            }
        } else {
            GcmChimeraService.b("%s returned error code=%d to broadcast (id=%s time=%dms priority=%s)", ejhzVar.f, Integer.valueOf(resultCode), ejhzVar.i, Long.valueOf(elapsedRealtime), bkbdVar.e(ejhzVar.r));
        }
        this.a.c(null);
        this.c.c.execute(new Runnable() { // from class: bkbc
            @Override // java.lang.Runnable
            public final void run() {
                DataMessageManager$BroadcastDoneReceiver.this.b();
            }
        });
    }

    public DataMessageManager$BroadcastDoneReceiver(bkbd bkbdVar, Intent intent, ejhz ejhzVar, long j, dhbu dhbuVar) {
        super("gcm");
        this.a = new dhma();
        this.b = true;
        this.c = bkbdVar;
        this.d = intent;
        this.e = ejhzVar;
        this.f = j;
        this.g = dhbuVar;
        this.i = null;
        this.h = false;
    }
}

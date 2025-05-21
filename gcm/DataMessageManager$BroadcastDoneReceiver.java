package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.gcm.DataMessageManager$BroadcastDoneReceiver;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.bhwo;
import defpackage.biac;
import defpackage.deqq;
import defpackage.deqr;
import defpackage.dfau;
import defpackage.eguu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DataMessageManager$BroadcastDoneReceiver extends TracingBroadcastReceiver {
    public final dfau a;
    boolean b;
    private final bhwo c;
    private final Intent d;
    private final eguu e;
    private final long f;
    private final deqr g;
    private final boolean h;
    private final deqq i;

    public DataMessageManager$BroadcastDoneReceiver(bhwo bhwoVar, Intent intent, eguu eguuVar, long j, deqq deqqVar) {
        super("gcm");
        this.a = new dfau();
        this.b = true;
        this.c = bhwoVar;
        this.d = intent;
        this.e = eguuVar;
        this.f = j;
        this.g = null;
        this.i = deqqVar;
        this.h = true;
    }

    public final boolean b() {
        boolean z = true;
        if (this.h) {
            deqq deqqVar = this.i;
            if (deqqVar != null) {
                deqqVar.a();
            }
            return true;
        }
        synchronized (this) {
            if (this.b) {
                deqr deqrVar = this.g;
                if (deqrVar != null) {
                    deqrVar.g();
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
    public final void jz(Context context, Intent intent) {
        int resultCode = getResultCode();
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.f;
        bhwo bhwoVar = this.c;
        eguu eguuVar = this.e;
        if (resultCode == -1) {
            GcmChimeraService.b("Successful broadcast to %s (id=%s time=%dms priority=%s)", eguuVar.f, eguuVar.i, Long.valueOf(elapsedRealtime), bhwoVar.e(eguuVar.r));
        } else if (resultCode == 0) {
            Intent intent2 = this.d;
            Log.w("GCM", "broadcast intent callback: result=CANCELLED for".concat(String.valueOf(String.valueOf(intent2))));
            String str = intent2.getPackage();
            if (str == null) {
                GcmChimeraService.b("Broadcast sent to %s missing Intent package (id=%s time=%dms priority=%s)", eguuVar.f, eguuVar.i, Long.valueOf(elapsedRealtime), bhwoVar.e(eguuVar.r));
            } else {
                biac biacVar = new biac(intent2.getPackage(), (int) eguuVar.l);
                if (bhwoVar.g.c(biacVar)) {
                    try {
                        if ((biacVar.a(bhwoVar.q, 8192).flags & 2097152) != 0) {
                            GcmChimeraService.b("Failed to broadcast to stopped app %s (id=%s time=%dms priority=%s)", eguuVar.f, eguuVar.i, Long.valueOf(elapsedRealtime), bhwoVar.e(eguuVar.r));
                            bhwoVar.o.c(new biac(eguuVar.f, (int) eguuVar.l), eguuVar.i, eguuVar.r, (eguuVar.b & 268435456) != 0 ? Integer.valueOf(eguuVar.s) : null, 7);
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                    }
                    GcmChimeraService.b("No response to broadcast from %s (id=%s time=%dms priority=%s)", eguuVar.f, eguuVar.i, Long.valueOf(elapsedRealtime), bhwoVar.e(eguuVar.r));
                } else if (bhwoVar.g.b.p(biacVar) == 2) {
                    GcmChimeraService.b("Failed to broadcast to %s, it may be updating (id=%s time=%dms priority=%s)", str, eguuVar.i, Long.valueOf(elapsedRealtime), bhwoVar.e(eguuVar.r));
                    bhwoVar.u.c(eguuVar);
                } else {
                    GcmChimeraService.b("Failed to broadcast to uninstalled app %s (id=%s time=%dms priority=%s)", str, eguuVar.i, Long.valueOf(elapsedRealtime), bhwoVar.e(eguuVar.r));
                    bhwoVar.o.c(biacVar, eguuVar.i, eguuVar.r, (eguuVar.b & 268435456) != 0 ? Integer.valueOf(eguuVar.s) : null, 5);
                    bhwoVar.o(biacVar);
                }
            }
        } else {
            GcmChimeraService.b("%s returned error code=%d to broadcast (id=%s time=%dms priority=%s)", eguuVar.f, Integer.valueOf(resultCode), eguuVar.i, Long.valueOf(elapsedRealtime), bhwoVar.e(eguuVar.r));
        }
        this.a.c(null);
        this.c.c.execute(new Runnable() { // from class: bhwn
            @Override // java.lang.Runnable
            public final void run() {
                DataMessageManager$BroadcastDoneReceiver.this.b();
            }
        });
    }

    public DataMessageManager$BroadcastDoneReceiver(bhwo bhwoVar, Intent intent, eguu eguuVar, long j, deqr deqrVar) {
        super("gcm");
        this.a = new dfau();
        this.b = true;
        this.c = bhwoVar;
        this.d = intent;
        this.e = eguuVar;
        this.f = j;
        this.g = deqrVar;
        this.i = null;
        this.h = false;
    }
}

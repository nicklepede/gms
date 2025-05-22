package com.google.android.gms.stats.eastworld;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.stats.AppContextProvider;
import defpackage.arvi;
import defpackage.arvr;
import defpackage.arwu;
import defpackage.auid;
import defpackage.aumn;
import defpackage.aura;
import defpackage.ausn;
import defpackage.dhdf;
import defpackage.dhdi;
import defpackage.dhfa;
import defpackage.ekvl;
import defpackage.fvcv;
import defpackage.fvdx;
import defpackage.fved;
import defpackage.fvfg;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class EastworldAlarmOperation extends IntentOperation {
    private static final ausn c = ausn.b("EastworldAlarmOperation", auid.STATS);
    arwu a;
    dhdf b;
    private arvr d;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.arwu r10) {
        /*
            java.lang.String r1 = "ConsentApiEastworldFailure"
            android.content.Context r0 = com.google.android.gms.chimera.modules.stats.AppContextProvider.a()
            dkbk r2 = new dkbk
            r2.<init>()
            aszs r3 = defpackage.dkbl.a
            atad r3 = new atad
            r3.<init>(r0, r2)
            java.lang.String r0 = "EASTWORLD_STATS"
            dhlw r2 = r3.aI(r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L20 java.util.concurrent.TimeoutException -> L4a java.util.concurrent.ExecutionException -> L4c
            r3 = 10000(0x2710, double:4.9407E-320)
            defpackage.dhmr.o(r2, r3, r0)     // Catch: java.lang.InterruptedException -> L20 java.util.concurrent.TimeoutException -> L4a java.util.concurrent.ExecutionException -> L4c
            goto L6e
        L20:
            r0 = move-exception
            boolean r3 = defpackage.fvdx.c()
            if (r3 != 0) goto L35
            arwm r4 = r10.d(r1)
            r7 = 1
            arwn r9 = defpackage.arwu.b
            r5 = 0
            r4.a(r5, r7, r9)
            goto L42
        L35:
            ausn r10 = com.google.android.gms.stats.eastworld.EastworldAlarmOperation.c
            eltz r10 = r10.j()
            java.lang.String r1 = "consentapi interrupted"
            r3 = 10948(0x2ac4, float:1.5341E-41)
            defpackage.a.ad(r10, r1, r3, r0)
        L42:
            java.lang.Thread r10 = java.lang.Thread.currentThread()
            r10.interrupt()
            goto L6e
        L4a:
            r0 = move-exception
            goto L4d
        L4c:
            r0 = move-exception
        L4d:
            boolean r3 = defpackage.fvdx.c()
            if (r3 != 0) goto L61
            arwm r4 = r10.d(r1)
            r7 = 1
            arwn r9 = defpackage.arwu.b
            r5 = 0
            r4.a(r5, r7, r9)
            goto L6e
        L61:
            ausn r10 = com.google.android.gms.stats.eastworld.EastworldAlarmOperation.c
            eltz r10 = r10.j()
            java.lang.String r1 = "consentapi failure"
            r3 = 10947(0x2ac3, float:1.534E-41)
            defpackage.a.ad(r10, r1, r3, r0)
        L6e:
            boolean r10 = r2.m()
            if (r10 == 0) goto L88
            java.lang.Object r10 = r2.i()
            if (r10 == 0) goto L88
            java.lang.Object r10 = r2.i()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L88
            r10 = 1
            return r10
        L88:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.eastworld.EastworldAlarmOperation.a(arwu):boolean");
    }

    private final void b(Context context, long j) {
        long b = fved.b();
        aumn aumnVar = new aumn(context);
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, EastworldAlarmOperation.class, new Intent("com.google.android.gms.stats.eastworld.action.EASTWORLD_ALARM"), 0, 134217728);
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        ekvl.y(pendingIntent);
        aumnVar.n("EastworldAlarmOperation", 3, elapsedRealtime, b, pendingIntent);
        if (fvdx.c()) {
            return;
        }
        this.a.d("EastworldPeriodicAlarmSetup").a(0L, 1L, arwu.b);
        this.a.h();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        List list = arvr.n;
        this.d = new arvi(this, "PLATFORM_STATS_COUNTERS").a();
        this.a = new arwu(this.d, 1024);
        this.b = dhdf.a();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Context a = AppContextProvider.a();
        if (!fvdx.c()) {
            this.a.d("EastworldPeridicAlarmFire").a(0L, 1L, arwu.b);
        }
        if (!fvcv.c() && !dhfa.a()) {
            if (fvdx.c()) {
                return;
            }
            this.a.d("CancellNonDeviceOwnerTasksForEastworldAlarmOperation").a(0L, 1L, arwu.b);
            this.a.h();
            return;
        }
        fvfg.a.lK().G();
        if (!a(this.a)) {
            if (!fvdx.c()) {
                this.a.d("EastworldNotOptIn").a(0L, 1L, arwu.b);
                this.a.h();
            }
            b(a, fvdx.a.lK().d());
            return;
        }
        Context a2 = AppContextProvider.a();
        aura.H(a2, "com.google.android.gms.stats.eastworld.EastworldService", true);
        Intent intent2 = new Intent();
        intent2.setClassName(a2, "com.google.android.gms.stats.eastworld.EastworldService");
        a2.startService(intent2);
        if (!fvdx.c()) {
            this.a.d("EastworldChimeraServiceStart").a(0L, 1L, arwu.b);
        }
        if (dhfa.a()) {
            long currentTimeMillis = System.currentTimeMillis();
            long b = fved.b();
            long a3 = dhdi.a(a);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeZone(DesugarTimeZone.getTimeZone("America/Los_Angeles"));
            calendar.set(11, 0);
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.add(5, 1);
            b(a, ((calendar.getTimeInMillis() + a3) - currentTimeMillis) % b);
            if (!intent.getBooleanExtra("extra_for_init_intent", false)) {
                this.b.b(intent);
            }
            this.a.h();
        }
    }
}

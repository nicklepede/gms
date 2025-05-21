package com.google.android.gms.stats.eastworld;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.stats.AppContextProvider;
import defpackage.apsr;
import defpackage.apta;
import defpackage.apud;
import defpackage.asej;
import defpackage.asit;
import defpackage.asng;
import defpackage.asot;
import defpackage.desc;
import defpackage.desf;
import defpackage.detx;
import defpackage.eiig;
import defpackage.fshx;
import defpackage.fsiz;
import defpackage.fsjf;
import defpackage.fski;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class EastworldAlarmOperation extends IntentOperation {
    private static final asot c = asot.b("EastworldAlarmOperation", asej.STATS);
    apud a;
    desc b;
    private apta d;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(defpackage.apud r10) {
        /*
            java.lang.String r1 = "ConsentApiEastworldFailure"
            android.content.Context r0 = com.google.android.gms.chimera.modules.stats.AppContextProvider.a()
            dhqe r2 = new dhqe
            r2.<init>()
            aqxd r3 = defpackage.dhqf.a
            aqxo r3 = new aqxo
            r3.<init>(r0, r2)
            java.lang.String r0 = "EASTWORLD_STATS"
            dfaq r2 = r3.aJ(r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L20 java.util.concurrent.TimeoutException -> L4a java.util.concurrent.ExecutionException -> L4c
            r3 = 10000(0x2710, double:4.9407E-320)
            defpackage.dfbl.o(r2, r3, r0)     // Catch: java.lang.InterruptedException -> L20 java.util.concurrent.TimeoutException -> L4a java.util.concurrent.ExecutionException -> L4c
            goto L6e
        L20:
            r0 = move-exception
            boolean r3 = defpackage.fsiz.c()
            if (r3 != 0) goto L35
            aptv r4 = r10.d(r1)
            r7 = 1
            aptw r9 = defpackage.apud.b
            r5 = 0
            r4.a(r5, r7, r9)
            goto L42
        L35:
            asot r10 = com.google.android.gms.stats.eastworld.EastworldAlarmOperation.c
            ejgq r10 = r10.j()
            java.lang.String r1 = "consentapi interrupted"
            r3 = 10945(0x2ac1, float:1.5337E-41)
            defpackage.a.ac(r10, r1, r3, r0)
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
            boolean r3 = defpackage.fsiz.c()
            if (r3 != 0) goto L61
            aptv r4 = r10.d(r1)
            r7 = 1
            aptw r9 = defpackage.apud.b
            r5 = 0
            r4.a(r5, r7, r9)
            goto L6e
        L61:
            asot r10 = com.google.android.gms.stats.eastworld.EastworldAlarmOperation.c
            ejgq r10 = r10.j()
            java.lang.String r1 = "consentapi failure"
            r3 = 10944(0x2ac0, float:1.5336E-41)
            defpackage.a.ac(r10, r1, r3, r0)
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.stats.eastworld.EastworldAlarmOperation.a(apud):boolean");
    }

    private final void b(Context context, long j) {
        long b = fsjf.b();
        asit asitVar = new asit(context);
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, EastworldAlarmOperation.class, new Intent("com.google.android.gms.stats.eastworld.action.EASTWORLD_ALARM"), 0, 134217728);
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        eiig.x(pendingIntent);
        asitVar.n("EastworldAlarmOperation", 3, elapsedRealtime, b, pendingIntent);
        if (fsiz.c()) {
            return;
        }
        this.a.d("EastworldPeriodicAlarmSetup").a(0L, 1L, apud.b);
        this.a.h();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        List list = apta.n;
        this.d = new apsr(this, "PLATFORM_STATS_COUNTERS").a();
        this.a = new apud(this.d, 1024);
        this.b = desc.a();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Context a = AppContextProvider.a();
        if (!fsiz.c()) {
            this.a.d("EastworldPeridicAlarmFire").a(0L, 1L, apud.b);
        }
        if (!fshx.c() && !detx.a()) {
            if (fsiz.c()) {
                return;
            }
            this.a.d("CancellNonDeviceOwnerTasksForEastworldAlarmOperation").a(0L, 1L, apud.b);
            this.a.h();
            return;
        }
        fski.a.a().G();
        if (!a(this.a)) {
            if (!fsiz.c()) {
                this.a.d("EastworldNotOptIn").a(0L, 1L, apud.b);
                this.a.h();
            }
            b(a, fsiz.a.a().d());
            return;
        }
        Context a2 = AppContextProvider.a();
        asng.H(a2, "com.google.android.gms.stats.eastworld.EastworldService", true);
        Intent intent2 = new Intent();
        intent2.setClassName(a2, "com.google.android.gms.stats.eastworld.EastworldService");
        a2.startService(intent2);
        if (!fsiz.c()) {
            this.a.d("EastworldChimeraServiceStart").a(0L, 1L, apud.b);
        }
        if (detx.a()) {
            long currentTimeMillis = System.currentTimeMillis();
            long b = fsjf.b();
            long a3 = desf.a(a);
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

package com.google.android.gms.gcm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.SystemClock;
import android.text.format.DateUtils;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.chimera.Service;
import com.google.android.gms.gcm.connection.HeartbeatChimeraAlarm;
import defpackage.a;
import defpackage.aupz;
import defpackage.aurp;
import defpackage.bkad;
import defpackage.bkbd;
import defpackage.bkbo;
import defpackage.bkcb;
import defpackage.bkcc;
import defpackage.bkch;
import defpackage.bkcr;
import defpackage.bkcw;
import defpackage.bkdr;
import defpackage.bkei;
import defpackage.bkez;
import defpackage.bkfa;
import defpackage.bkfd;
import defpackage.bkfk;
import defpackage.bkfr;
import defpackage.bkft;
import defpackage.bkgb;
import defpackage.bkgj;
import defpackage.bkhb;
import defpackage.bkib;
import defpackage.bkic;
import defpackage.bkil;
import defpackage.buy;
import defpackage.dpya;
import defpackage.ekvi;
import defpackage.elel;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.eqgo;
import defpackage.frbe;
import defpackage.frbn;
import defpackage.frbt;
import defpackage.frbw;
import defpackage.ind;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmChimeraService extends Service {
    public static volatile GcmChimeraService a;
    public static final Semaphore b = new Semaphore(0);
    private static final Collection i = new elel(e());
    HeartbeatChimeraAlarm c;
    public bkgj d;
    bkcw e;
    final eqgo f = new aupz(1, 10);
    public bkei g;
    public bkic h;
    private bkcr j;
    private bkbd k;
    private bkch l;

    public static elgo a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        elgj elgjVar = new elgj();
        Collection<bkcc> collection = i;
        synchronized (collection) {
            for (bkcc bkccVar : collection) {
                elgjVar.i(simpleDateFormat.format(Long.valueOf(bkccVar.a)) + " net=" + bkccVar.b + ": " + String.format(bkccVar.c, bkccVar.d));
            }
        }
        return elgjVar.g();
    }

    public static void b(String str, Object... objArr) {
        bkic bkicVar;
        if (e() <= 0) {
            return;
        }
        GcmChimeraService gcmChimeraService = a;
        int i2 = -2;
        if (gcmChimeraService != null && (bkicVar = gcmChimeraService.h) != null) {
            i2 = bkicVar.b();
        }
        Collection collection = i;
        synchronized (collection) {
            collection.add(new bkcc(i2, str, objArr));
        }
    }

    private static int e() {
        return (int) frbe.a.lK().a();
    }

    public final void c(PrintWriter printWriter) {
        if (dpya.h(this)) {
            printWriter.println("Direct boot mode (DeviceID not available");
        } else {
            printWriter.println("DeviceID: ".concat(String.valueOf(this.e.c())));
        }
        if (this.d.f().a() == -1) {
            printWriter.println("Disabled");
            return;
        }
        if (this.d.s()) {
            printWriter.println(this.d.toString());
            HeartbeatChimeraAlarm heartbeatChimeraAlarm = this.c;
            if (((bkgj) heartbeatChimeraAlarm.e.a()).r()) {
                printWriter.println("Heartbeat waiting ack ".concat(String.valueOf(String.valueOf(heartbeatChimeraAlarm.f))));
            } else {
                printWriter.println("Heartbeat: ".concat(String.valueOf(String.valueOf(heartbeatChimeraAlarm.f))));
            }
            aurp aurpVar = heartbeatChimeraAlarm.q;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = heartbeatChimeraAlarm.g;
            if (j > 0) {
                printWriter.println(a.a(DateUtils.formatElapsedTime((elapsedRealtime - j) / 1000), "Last heartbeat reset connection ", " ago"));
            }
            long j2 = heartbeatChimeraAlarm.l;
            if (j2 > 0) {
                printWriter.println(a.C(j2, "Last ping: "));
            }
            SparseArray a2 = heartbeatChimeraAlarm.d.a();
            for (int i2 = 0; i2 < a2.size(); i2++) {
                bkft bkftVar = (bkft) a2.valueAt(i2);
                boolean k = HeartbeatChimeraAlarm.k(a2.keyAt(i2));
                printWriter.println("Adaptive Heartbeat type " + bkftVar.c + ": " + k);
                int i3 = bkftVar.d;
                StringBuilder sb = new StringBuilder("connectionsLimit: ");
                sb.append(i3);
                printWriter.println(sb.toString());
                printWriter.println();
                printWriter.println("All stored connections: ");
                int i4 = 0;
                while (true) {
                    buy buyVar = bkftVar.b;
                    if (i4 < buyVar.d) {
                        printWriter.println(buyVar.i(i4));
                        i4++;
                    }
                }
                printWriter.println();
            }
            printWriter.println();
            bkfr bkfrVar = heartbeatChimeraAlarm.i;
            if (bkfrVar != null) {
                printWriter.println("Last connected: ".concat(bkfrVar.toString()));
                printWriter.println("Seen good heartbeat in last connection? " + heartbeatChimeraAlarm.k);
                printWriter.println();
            }
            this.h.e(printWriter);
        } else if (this.d.t()) {
            printWriter.println("Connecting");
            printWriter.println(this.d.toString());
            this.h.e(printWriter);
        } else {
            printWriter.println("Not connected");
            if (frbt.B()) {
                printWriter.println(this.d.toString());
            }
            this.h.e(printWriter);
        }
        printWriter.println();
    }

    public final synchronized void d() {
        this.d.f().c.a = frbt.n();
        this.d.f().c.b = (int) frbt.g();
        this.d.m(this);
        if (this.l.a()) {
            this.h.g();
        }
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        bkdr bkdrVar;
        TreeMap treeMap;
        if (!bkad.p()) {
            printWriter.println("Not dumping stats for secondary user GcmService");
            return;
        }
        c(printWriter);
        elgo a2 = a();
        int i2 = ((elpg) a2).c;
        for (int i3 = 0; i3 < i2; i3++) {
            printWriter.println((String) a2.get(i3));
        }
        bkbd bkbdVar = this.k;
        bkfd bkfdVar = bkbdVar.h;
        if (bkfdVar.a) {
            bkfa bkfaVar = bkfdVar.c;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm", Locale.US);
            synchronized (bkfaVar) {
                treeMap = new TreeMap(bkfaVar.b);
            }
            printWriter.println("\nApps supporting client queue:");
            for (Map.Entry entry : treeMap.entrySet()) {
                ekvi ekviVar = ((bkez) entry.getValue()).b;
                if (ekviVar.h()) {
                    printWriter.print(entry.getKey());
                    printWriter.print(" v");
                    printWriter.println(ekviVar.c());
                }
            }
            printWriter.println("\nAffinity Scores:");
            for (Map.Entry entry2 : treeMap.entrySet()) {
                ekvi ekviVar2 = ((bkez) entry2.getValue()).c;
                if (ekviVar2.h()) {
                    printWriter.printf("%s %4.3f\n", entry2.getKey(), ekviVar2.c());
                }
            }
            printWriter.println("\nHigh priority quota usage:");
            for (Map.Entry entry3 : treeMap.entrySet()) {
                if (((bkez) entry3.getValue()).a != bkfk.a) {
                    bkfk bkfkVar = ((bkez) entry3.getValue()).a;
                    printWriter.printf("%s used %d since %s\n", entry3.getKey(), Integer.valueOf(bkfkVar.c), simpleDateFormat.format(Long.valueOf(bkfkVar.b)));
                }
            }
            bkfdVar.d.i(printWriter);
        }
        if (frbt.C() && (bkdrVar = bkbdVar.n) != null) {
            bkdrVar.a(printWriter);
        }
        printWriter.println("For scheduler stats see SchedulerService dump.");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        bkbo b2 = bkbo.b();
        if (bkad.p()) {
            this.e = b2.f();
            this.h = b2.p();
            this.c = b2.l();
            this.k = b2.a();
            this.d = b2.k();
            this.l = b2.d();
            a = this;
            bkcr bkcrVar = new bkcr(this.c, this.h, this.k, this.l, this);
            this.j = bkcrVar;
            final bkic bkicVar = bkcrVar.f;
            Runnable runnable = new Runnable() { // from class: bkia
                @Override // java.lang.Runnable
                public final void run() {
                    bkic.this.f();
                }
            };
            bkil bkilVar = bkicVar.e;
            bkilVar.c.i(runnable);
            frbn frbnVar = frbn.a;
            bkicVar.i = bkic.m(frbnVar.lK().b());
            bkicVar.j = bkic.m(frbnVar.lK().a());
            bkicVar.g = (bkhb) bkicVar.f.b().f();
            bkic.k(null, bkicVar.g);
            if (bkicVar.g != null) {
                bkicVar.h = bkicVar.c.b();
            }
            bkicVar.a.a(bkicVar);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.intent.action.GCM_RECONNECT");
            ind.b(bkicVar.k, bkicVar.d, intentFilter, 2);
            bkilVar.i();
            bkicVar.l.b.add(new bkib(bkicVar));
            BroadcastReceiver broadcastReceiver = bkcrVar.d.p;
            if (broadcastReceiver != null) {
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.USER_ADDED");
                intentFilter2.addAction("android.intent.action.USER_REMOVED");
                intentFilter2.addAction("android.intent.action.USER_STARTING");
                intentFilter2.addAction("android.intent.action.USER_STOPPED");
                intentFilter2.addAction("android.intent.action.USER_STOPPING");
                intentFilter2.addAction("android.intent.action.USER_SWITCHED");
                ind.b(bkcrVar.b, broadcastReceiver, intentFilter2, 2);
            }
            IntentFilter intentFilter3 = new IntentFilter("android.provider.Telephony.SECRET_CODE");
            intentFilter3.addDataScheme("android_secret_code");
            intentFilter3.addDataAuthority("426", null);
            Context context = bkcrVar.b;
            ind.b(context, bkcrVar.a, intentFilter3, 2);
            if (frbw.f() > 0) {
                IntentFilter intentFilter4 = new IntentFilter();
                if (frbw.a.lK().r()) {
                    intentFilter4.addAction("com.google.android.intent.action.MCS_HEARTBEAT");
                    intentFilter4.addAction("com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW");
                } else {
                    intentFilter4.addAction("android.intent.action.USER_PRESENT");
                    intentFilter4.addAction("android.intent.action.SCREEN_OFF");
                }
                ind.b(context, bkcrVar.c, intentFilter4, 2);
            }
            ind.c(context, bkcrVar.c, new IntentFilter("com.google.android.gms.gcm.HEARTBEAT_ALARM"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, true == frbt.a.lK().an() ? 4 : 2);
            bkgb bkgbVar = bkcrVar.e.d;
            d();
            b.release();
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        BroadcastReceiver broadcastReceiver;
        super.onDestroy();
        if (bkad.p()) {
            bkbo.b().e().b(3);
            a = null;
            bkcr bkcrVar = this.j;
            HeartbeatChimeraAlarm heartbeatChimeraAlarm = bkcrVar.c;
            if (heartbeatChimeraAlarm != null) {
                bkcrVar.b.unregisterReceiver(heartbeatChimeraAlarm);
                heartbeatChimeraAlarm.f.f();
                heartbeatChimeraAlarm.d.c();
            }
            bkbd bkbdVar = bkcrVar.d;
            if (bkbdVar != null && (broadcastReceiver = bkbdVar.p) != null) {
                bkcrVar.b.unregisterReceiver(broadcastReceiver);
            }
            bkcrVar.b.unregisterReceiver(bkcrVar.a);
            boolean z = bkcrVar.e.c;
            bkgj bkgjVar = this.d;
            if (bkgjVar != null) {
                bkgjVar.y(15, null);
            }
            eqgo eqgoVar = this.f;
            if (eqgoVar != null) {
                eqgoVar.shutdownNow();
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        if (intent != null) {
            intent.getAction();
        }
        if (bkad.p()) {
            this.f.execute(new bkcb(this, intent));
            return 1;
        }
        Log.e("GCM", "Unexpected GcmService started as secondary user !");
        stopSelf(i3);
        return 2;
    }
}

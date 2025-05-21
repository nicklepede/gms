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
import defpackage.asmf;
import defpackage.asnv;
import defpackage.bhvo;
import defpackage.bhwo;
import defpackage.bhwz;
import defpackage.bhxm;
import defpackage.bhxn;
import defpackage.bhxs;
import defpackage.bhyc;
import defpackage.bhyh;
import defpackage.bhzc;
import defpackage.bhzt;
import defpackage.biak;
import defpackage.bial;
import defpackage.biao;
import defpackage.biav;
import defpackage.bibc;
import defpackage.bibe;
import defpackage.bibm;
import defpackage.bibu;
import defpackage.bicm;
import defpackage.bidm;
import defpackage.bidn;
import defpackage.bidw;
import defpackage.bul;
import defpackage.dnnr;
import defpackage.eiid;
import defpackage.eirg;
import defpackage.eite;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ensv;
import defpackage.foin;
import defpackage.foiw;
import defpackage.fojc;
import defpackage.fojf;
import defpackage.iln;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.Semaphore;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmChimeraService extends Service {
    public static volatile GcmChimeraService a;
    public static final Semaphore b = new Semaphore(0);
    private static final Collection i = new eirg(e());
    HeartbeatChimeraAlarm c;
    public bibu d;
    bhyh e;
    final ensv f = new asmf(1, 10);
    public bhzt g;
    public bidn h;
    private bhyc j;
    private bhwo k;
    private bhxs l;

    public static eitj a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm:ss.SSS", Locale.US);
        eite eiteVar = new eite();
        Collection<bhxn> collection = i;
        synchronized (collection) {
            for (bhxn bhxnVar : collection) {
                eiteVar.i(simpleDateFormat.format(Long.valueOf(bhxnVar.a)) + " net=" + bhxnVar.b + ": " + String.format(bhxnVar.c, bhxnVar.d));
            }
        }
        return eiteVar.g();
    }

    public static void b(String str, Object... objArr) {
        bidn bidnVar;
        if (e() <= 0) {
            return;
        }
        GcmChimeraService gcmChimeraService = a;
        int i2 = -2;
        if (gcmChimeraService != null && (bidnVar = gcmChimeraService.h) != null) {
            i2 = bidnVar.b();
        }
        Collection collection = i;
        synchronized (collection) {
            collection.add(new bhxn(i2, str, objArr));
        }
    }

    private static int e() {
        return (int) foin.a.a().a();
    }

    public final void c(PrintWriter printWriter) {
        if (dnnr.h(this)) {
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
            if (((bibu) heartbeatChimeraAlarm.e.a()).r()) {
                printWriter.println("Heartbeat waiting ack ".concat(String.valueOf(String.valueOf(heartbeatChimeraAlarm.f))));
            } else {
                printWriter.println("Heartbeat: ".concat(String.valueOf(String.valueOf(heartbeatChimeraAlarm.f))));
            }
            asnv asnvVar = heartbeatChimeraAlarm.q;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = heartbeatChimeraAlarm.g;
            if (j > 0) {
                printWriter.println(a.a(DateUtils.formatElapsedTime((elapsedRealtime - j) / 1000), "Last heartbeat reset connection ", " ago"));
            }
            long j2 = heartbeatChimeraAlarm.l;
            if (j2 > 0) {
                printWriter.println(a.D(j2, "Last ping: "));
            }
            SparseArray a2 = heartbeatChimeraAlarm.d.a();
            for (int i2 = 0; i2 < a2.size(); i2++) {
                bibe bibeVar = (bibe) a2.valueAt(i2);
                boolean k = HeartbeatChimeraAlarm.k(a2.keyAt(i2));
                printWriter.println("Adaptive Heartbeat type " + bibeVar.c + ": " + k);
                int i3 = bibeVar.d;
                StringBuilder sb = new StringBuilder("connectionsLimit: ");
                sb.append(i3);
                printWriter.println(sb.toString());
                printWriter.println();
                printWriter.println("All stored connections: ");
                int i4 = 0;
                while (true) {
                    bul bulVar = bibeVar.b;
                    if (i4 < bulVar.d) {
                        printWriter.println(bulVar.i(i4));
                        i4++;
                    }
                }
                printWriter.println();
            }
            printWriter.println();
            bibc bibcVar = heartbeatChimeraAlarm.i;
            if (bibcVar != null) {
                printWriter.println("Last connected: ".concat(bibcVar.toString()));
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
            if (fojc.C()) {
                printWriter.println(this.d.toString());
            }
            this.h.e(printWriter);
        }
        printWriter.println();
    }

    public final synchronized void d() {
        this.d.f().c.a = fojc.n();
        this.d.f().c.b = (int) fojc.g();
        this.d.m(this);
        if (this.l.a()) {
            this.h.g();
        }
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        bhzc bhzcVar;
        TreeMap treeMap;
        if (!bhvo.p()) {
            printWriter.println("Not dumping stats for secondary user GcmService");
            return;
        }
        c(printWriter);
        eitj a2 = a();
        int i2 = ((ejcb) a2).c;
        for (int i3 = 0; i3 < i2; i3++) {
            printWriter.println((String) a2.get(i3));
        }
        bhwo bhwoVar = this.k;
        biao biaoVar = bhwoVar.h;
        if (biaoVar.a) {
            bial bialVar = biaoVar.c;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd HH:mm", Locale.US);
            synchronized (bialVar) {
                treeMap = new TreeMap(bialVar.b);
            }
            printWriter.println("\nApps supporting client queue:");
            for (Map.Entry entry : treeMap.entrySet()) {
                eiid eiidVar = ((biak) entry.getValue()).b;
                if (eiidVar.h()) {
                    printWriter.print(entry.getKey());
                    printWriter.print(" v");
                    printWriter.println(eiidVar.c());
                }
            }
            printWriter.println("\nAffinity Scores:");
            for (Map.Entry entry2 : treeMap.entrySet()) {
                eiid eiidVar2 = ((biak) entry2.getValue()).c;
                if (eiidVar2.h()) {
                    printWriter.printf("%s %4.3f\n", entry2.getKey(), eiidVar2.c());
                }
            }
            printWriter.println("\nHigh priority quota usage:");
            for (Map.Entry entry3 : treeMap.entrySet()) {
                if (((biak) entry3.getValue()).a != biav.a) {
                    biav biavVar = ((biak) entry3.getValue()).a;
                    printWriter.printf("%s used %d since %s\n", entry3.getKey(), Integer.valueOf(biavVar.c), simpleDateFormat.format(Long.valueOf(biavVar.b)));
                }
            }
            biaoVar.d.i(printWriter);
        }
        if (fojc.D() && (bhzcVar = bhwoVar.n) != null) {
            bhzcVar.a(printWriter);
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
        bhwz b2 = bhwz.b();
        if (bhvo.p()) {
            this.e = b2.f();
            this.h = b2.p();
            this.c = b2.l();
            this.k = b2.a();
            this.d = b2.k();
            this.l = b2.d();
            a = this;
            bhyc bhycVar = new bhyc(this.c, this.h, this.k, this.l, this);
            this.j = bhycVar;
            final bidn bidnVar = bhycVar.f;
            Runnable runnable = new Runnable() { // from class: bidl
                @Override // java.lang.Runnable
                public final void run() {
                    bidn.this.f();
                }
            };
            bidw bidwVar = bidnVar.e;
            bidwVar.b.i(runnable);
            bidnVar.i = bidn.m(foiw.a.a().b());
            bidnVar.j = bidn.m(foiw.a.a().a());
            bidnVar.g = (bicm) bidnVar.f.b().f();
            bidn.k(null, bidnVar.g);
            if (bidnVar.g != null) {
                bidnVar.h = fojc.o() ? bidnVar.c.b() : bidnVar.g;
            }
            bidnVar.a.a(bidnVar);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.google.android.intent.action.GCM_RECONNECT");
            iln.b(bidnVar.k, bidnVar.d, intentFilter, 2);
            bidwVar.j();
            bidnVar.l.b.add(new bidm(bidnVar));
            BroadcastReceiver broadcastReceiver = bhycVar.d.p;
            if (broadcastReceiver != null) {
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.USER_ADDED");
                intentFilter2.addAction("android.intent.action.USER_REMOVED");
                intentFilter2.addAction("android.intent.action.USER_STARTING");
                intentFilter2.addAction("android.intent.action.USER_STOPPED");
                intentFilter2.addAction("android.intent.action.USER_STOPPING");
                intentFilter2.addAction("android.intent.action.USER_SWITCHED");
                iln.b(bhycVar.b, broadcastReceiver, intentFilter2, 2);
            }
            IntentFilter intentFilter3 = new IntentFilter("android.provider.Telephony.SECRET_CODE");
            intentFilter3.addDataScheme("android_secret_code");
            intentFilter3.addDataAuthority("426", null);
            Context context = bhycVar.b;
            iln.b(context, bhycVar.a, intentFilter3, 2);
            if (fojf.f() > 0) {
                IntentFilter intentFilter4 = new IntentFilter();
                if (fojf.a.a().r()) {
                    intentFilter4.addAction("com.google.android.intent.action.MCS_HEARTBEAT");
                    intentFilter4.addAction("com.google.android.gms.gcm.ACTION_HEARTBEAT_NOW");
                } else {
                    intentFilter4.addAction("android.intent.action.USER_PRESENT");
                    intentFilter4.addAction("android.intent.action.SCREEN_OFF");
                }
                iln.b(context, bhycVar.c, intentFilter4, 2);
            }
            iln.c(context, bhycVar.c, new IntentFilter("com.google.android.gms.gcm.HEARTBEAT_ALARM"), "com.google.android.gms.permission.INTERNAL_BROADCAST", null, 2);
            bibm bibmVar = bhycVar.e.d;
            d();
            b.release();
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        BroadcastReceiver broadcastReceiver;
        super.onDestroy();
        if (bhvo.p()) {
            bhwz.b().e().b(3);
            a = null;
            bhyc bhycVar = this.j;
            HeartbeatChimeraAlarm heartbeatChimeraAlarm = bhycVar.c;
            if (heartbeatChimeraAlarm != null) {
                bhycVar.b.unregisterReceiver(heartbeatChimeraAlarm);
                heartbeatChimeraAlarm.f.f();
                heartbeatChimeraAlarm.d.c();
            }
            bhwo bhwoVar = bhycVar.d;
            if (bhwoVar != null && (broadcastReceiver = bhwoVar.p) != null) {
                bhycVar.b.unregisterReceiver(broadcastReceiver);
            }
            bhycVar.b.unregisterReceiver(bhycVar.a);
            boolean z = bhycVar.e.c;
            bibu bibuVar = this.d;
            if (bibuVar != null) {
                bibuVar.y(15, null);
            }
            ensv ensvVar = this.f;
            if (ensvVar != null) {
                ensvVar.shutdownNow();
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        if (intent != null) {
            intent.getAction();
        }
        if (bhvo.p()) {
            this.f.execute(new bhxm(this, intent));
            return 1;
        }
        Log.e("GCM", "Unexpected GcmService started as secondary user !");
        stopSelf(i3);
        return 2;
    }
}

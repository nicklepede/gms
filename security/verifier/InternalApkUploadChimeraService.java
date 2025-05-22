package com.google.android.gms.security.verifier;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import com.google.android.chimera.Service;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.aula;
import defpackage.aura;
import defpackage.ausn;
import defpackage.btco;
import defpackage.dajo;
import defpackage.dbbr;
import defpackage.dboe;
import defpackage.dbof;
import defpackage.dboi;
import defpackage.dbon;
import defpackage.dbop;
import defpackage.dboq;
import defpackage.dbor;
import defpackage.dbot;
import defpackage.dbow;
import defpackage.dbox;
import defpackage.dboy;
import defpackage.dbpa;
import defpackage.dbpb;
import defpackage.dbpc;
import defpackage.dbpd;
import defpackage.eluo;
import defpackage.fgpr;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fpmr;
import defpackage.fuoj;
import defpackage.fuoo;
import defpackage.ind;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class InternalApkUploadChimeraService extends Service {
    protected dboy e;
    public dbon f;
    protected HandlerThread g;
    public dbox h;
    protected dbpa i;
    private boolean l = false;
    private final BroadcastReceiver m = new NetworkChangeBroadcastReceiver();
    private final BroadcastReceiver n = new PackageChangeBroadcastReceiver();
    private final Object o = new Object();
    private dajo p;
    public static final int a = dbpc.a(1);
    public static final int b = dbpc.b(15);
    private static final long j = 86400000;
    private static final int k = dbpc.a(20);
    public static final int c = 86400000;
    public static final int d = 7200000;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class NetworkChangeBroadcastReceiver extends TracingBroadcastReceiver {
        public NetworkChangeBroadcastReceiver() {
            super("security");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            InternalApkUploadChimeraService.this.e.a(context);
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    class PackageChangeBroadcastReceiver extends TracingBroadcastReceiver {
        public PackageChangeBroadcastReceiver() {
            super("security");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            InternalApkUploadChimeraService.b(context, InternalApkUploadChimeraService.b);
        }
    }

    public static void b(Context context, long j2) {
        Intent b2 = dbbr.b(context, InternalApkUploadChimeraService.class);
        b2.setAction("com.google.android.gms.security.verifyapps.PROCESS_QUEUE");
        b2.putExtra("delay", j2);
        context.startService(b2);
    }

    public static boolean d(ApkUploadEntry apkUploadEntry) {
        int i;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = apkUploadEntry.f;
        long j3 = currentTimeMillis - j2;
        int i2 = apkUploadEntry.g;
        if (i2 == 0) {
            i = d;
        } else {
            if (i2 != 1) {
                dbpd.a("Invalid entry state for entry id=%d: %d.", Long.valueOf(apkUploadEntry.a), Integer.valueOf(i2));
                return true;
            }
            i = c;
        }
        boolean z = j3 > ((long) i) || j2 - System.currentTimeMillis() > j;
        Boolean.toString(z);
        long j4 = apkUploadEntry.a;
        String str = apkUploadEntry.b;
        int i3 = dbpc.a;
        ausn ausnVar = dbpd.a;
        return z;
    }

    public final synchronized void a(boolean z) {
        if (!z) {
            if (!this.l) {
                ausn ausnVar = dbpd.a;
                return;
            }
            ausn ausnVar2 = dbpd.a;
            unregisterReceiver(this.m);
            unregisterReceiver(this.n);
            this.l = false;
            return;
        }
        if (this.l) {
            ausn ausnVar3 = dbpd.a;
            return;
        }
        ausn ausnVar4 = dbpd.a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.conn.BACKGROUND_DATA_SETTING_CHANGED");
        ind.b(this, this.m, intentFilter, 2);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter2.addDataScheme("package");
        ind.b(this, this.n, intentFilter2, 2);
        this.l = true;
    }

    protected final boolean c() {
        return this.p.j();
    }

    public final boolean e(PackageInfo packageInfo, byte[] bArr) {
        if (packageInfo.applicationInfo.sourceDir.equals(packageInfo.applicationInfo.publicSourceDir)) {
            try {
                byte[] a2 = this.i.a(packageInfo.packageName, packageInfo.lastUpdateTime, fpmr.i() ? new File(btco.a.a(packageInfo.applicationInfo.sourceDir)) : new File(packageInfo.applicationInfo.sourceDir));
                if (a2 == null) {
                    ausn ausnVar = dbpd.a;
                    return false;
                }
                boolean equals = Arrays.equals(a2, bArr);
                ausn ausnVar2 = dbpd.a;
                return equals;
            } catch (IOException e) {
                dbpd.b(e, "exception while reading apk", new Object[0]);
            }
        }
        return false;
    }

    public final boolean f() {
        if (!c()) {
            ausn ausnVar = dbpd.a;
            return false;
        }
        if (!fuoo.d()) {
            ausn ausnVar2 = dbpd.a;
            return false;
        }
        if (this.e.b()) {
            return true;
        }
        ausn ausnVar3 = dbpd.a;
        return false;
    }

    public final boolean g(int i) {
        if (!c() || !fuoo.d()) {
            stopSelf(i);
            return true;
        }
        synchronized (this.o) {
            if (!this.f.g()) {
                ausn ausnVar = dbpd.a;
                return false;
            }
            ausn ausnVar2 = dbpd.a;
            stopSelf(i);
            return true;
        }
    }

    public final int h(File file, byte[] bArr, byte[] bArr2, int i) {
        long nanoTime;
        long nanoTime2;
        int i2;
        dboi dboiVar = new dboi(this, file, bArr, bArr2, i);
        File file2 = dboiVar.b;
        long length = file2.length();
        int i3 = 0;
        if (length == 0 || length > fuoo.b()) {
            dboiVar.e.add(1);
        } else {
            dboiVar.i = (int) length;
            try {
                dboiVar.j = new FileInputStream(file2);
                dboiVar.k = 0;
                fgrc v = dbop.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                dbop dbopVar = (dbop) v.b;
                dbopVar.c = 0;
                dbopVar.b |= 1;
                fgrc v2 = dbor.a.v();
                dboq dboqVar = dboq.a;
                if (!v2.b.L()) {
                    v2.U();
                }
                fgri fgriVar = v2.b;
                dbor dborVar = (dbor) fgriVar;
                dboqVar.getClass();
                dborVar.d = dboqVar;
                dborVar.b |= 2;
                if (!fgriVar.L()) {
                    v2.U();
                }
                fgri fgriVar2 = v2.b;
                dbor dborVar2 = (dbor) fgriVar2;
                dborVar2.b |= 1;
                dborVar2.c = "";
                long j2 = dboiVar.i;
                if (!fgriVar2.L()) {
                    v2.U();
                }
                dbor dborVar3 = (dbor) v2.b;
                dborVar3.b |= 4;
                dborVar3.e = j2;
                fgrc v3 = dboqVar.v();
                fgpr w = fgpr.w(dboiVar.c);
                if (!v3.b.L()) {
                    v3.U();
                }
                dboq dboqVar2 = (dboq) v3.b;
                dboqVar2.b |= 1;
                dboqVar2.c = w;
                dboq dboqVar3 = (dboq) v3.Q();
                if (!v2.b.L()) {
                    v2.U();
                }
                dbor dborVar4 = (dbor) v2.b;
                dboqVar3.getClass();
                dborVar4.d = dboqVar3;
                dborVar4.b |= 2;
                long e = aura.e(dboiVar.a);
                if (!v2.b.L()) {
                    v2.U();
                }
                dbor dborVar5 = (dbor) v2.b;
                dborVar5.b |= 8;
                dborVar5.f = e;
                if (fuoj.v() && (i2 = dboiVar.l) != 0) {
                    if (!v.b.L()) {
                        v.U();
                    }
                    dbop dbopVar2 = (dbop) v.b;
                    dbopVar2.f = i2 - 1;
                    dbopVar2.b |= 8;
                }
                if (!v.b.L()) {
                    v.U();
                }
                dbop dbopVar3 = (dbop) v.b;
                dbor dborVar6 = (dbor) v2.Q();
                dborVar6.getClass();
                dbopVar3.d = dborVar6;
                dbopVar3.b |= 2;
                fgrc v4 = dbot.a.v();
                if (!v4.b.L()) {
                    v4.U();
                }
                dbot dbotVar = (dbot) v4.b;
                dbotVar.c = 0;
                dbotVar.b |= 1;
                fgpr w2 = fgpr.w(dboiVar.d);
                if (!v4.b.L()) {
                    v4.U();
                }
                dbot dbotVar2 = (dbot) v4.b;
                dbotVar2.b |= 2;
                dbotVar2.d = w2;
                dbot dbotVar3 = (dbot) v4.Q();
                if (!v.b.L()) {
                    v.U();
                }
                dbop dbopVar4 = (dbop) v.b;
                dbotVar3.getClass();
                dbopVar4.e = dbotVar3;
                dbopVar4.b |= 4;
                dboiVar.g = aula.b();
                dboiVar.g.add(new dbpb(new dboe(dboiVar), new dbof(dboiVar), (dbop) v.Q(), dboiVar.i));
            } catch (IOException unused) {
                dboiVar.e.add(1);
            }
        }
        try {
            try {
                nanoTime = System.nanoTime() + (k * 1000000);
                while (true) {
                    try {
                        nanoTime2 = System.nanoTime();
                        break;
                    } catch (InterruptedException unused2) {
                    }
                }
            } catch (TimeoutException unused3) {
                dbpd.c("Upload timed out. Canceling upload", new Object[0]);
                dboiVar.f = true;
            }
            if (nanoTime2 > nanoTime) {
                throw new TimeoutException();
            }
            Integer num = (Integer) dboiVar.e.poll(nanoTime - nanoTime2, TimeUnit.NANOSECONDS);
            if (num == null) {
                throw new TimeoutException();
            }
            int intValue = num.intValue();
            ausn ausnVar = dbpd.a;
            i3 = intValue;
            dboiVar.a();
            return i3;
        } catch (Throwable th) {
            dboiVar.a();
            throw th;
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.e = new dboy((ConnectivityManager) getSystemService("connectivity"));
        this.i = new dbpa();
        this.p = new dajo(this);
        HandlerThread handlerThread = new HandlerThread("apk_upload_thread");
        this.g = handlerThread;
        handlerThread.start();
        this.h = new dbox(this, this.g.getLooper());
        this.f = new dbon(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        a(false);
        this.g.quit();
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (intent != null) {
            intent.getAction();
        }
        ausn ausnVar = dbpd.a;
        if (!c()) {
            stopSelf(i2);
            return 2;
        }
        if (!fuoo.d()) {
            stopSelf(i2);
            return 2;
        }
        if (!dajo.e(this)) {
            stopSelf(i2);
            return 2;
        }
        String action = intent == null ? null : intent.getAction();
        if (action == null) {
            this.h.sendMessage(this.h.obtainMessage(1, i2, 0));
            return 1;
        }
        if (action.equals("com.google.android.gms.security.verifyapps.UPLOAD_APK")) {
            new dbow(this, intent, i2).execute(new Void[0]);
        } else if (action.equals("com.google.android.gms.security.verifyapps.PROCESS_QUEUE")) {
            Message obtainMessage = this.h.obtainMessage(0, i2, 0);
            long longExtra = intent.getLongExtra("delay", -1L);
            this.h.removeMessages(0);
            if (longExtra != -1) {
                this.h.sendMessageDelayed(obtainMessage, longExtra);
            } else {
                this.h.sendMessage(obtainMessage);
            }
        } else if (action.equals("com.google.android.gms.security.verifyapps.BOOT_COMPLETE")) {
            this.h.sendMessage(this.h.obtainMessage(1, i2, 0));
        } else {
            ((eluo) ((eluo) dbpd.a.j()).ai(9600)).aa("Unknown action: %s", new Object[]{action});
            this.h.sendMessage(this.h.obtainMessage(2, i2, 0));
        }
        return 1;
    }
}

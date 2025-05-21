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
import defpackage.ashg;
import defpackage.asng;
import defpackage.asot;
import defpackage.bqux;
import defpackage.cxzr;
import defpackage.cyrt;
import defpackage.czeg;
import defpackage.czeh;
import defpackage.czek;
import defpackage.czep;
import defpackage.czer;
import defpackage.czes;
import defpackage.czet;
import defpackage.czev;
import defpackage.czey;
import defpackage.czez;
import defpackage.czfa;
import defpackage.czfc;
import defpackage.czfd;
import defpackage.czfe;
import defpackage.czff;
import defpackage.ejhf;
import defpackage.feay;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fmut;
import defpackage.frtq;
import defpackage.frtv;
import defpackage.iln;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class InternalApkUploadChimeraService extends Service {
    protected czfa e;
    public czep f;
    protected HandlerThread g;
    public czez h;
    protected czfc i;
    private boolean l = false;
    private final BroadcastReceiver m = new NetworkChangeBroadcastReceiver();
    private final BroadcastReceiver n = new PackageChangeBroadcastReceiver();
    private final Object o = new Object();
    private cxzr p;
    public static final int a = czfe.a(1);
    public static final int b = czfe.b(15);
    private static final long j = 86400000;
    private static final int k = czfe.a(20);
    public static final int c = 86400000;
    public static final int d = 7200000;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class NetworkChangeBroadcastReceiver extends TracingBroadcastReceiver {
        public NetworkChangeBroadcastReceiver() {
            super("security");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            InternalApkUploadChimeraService.this.e.a(context);
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    class PackageChangeBroadcastReceiver extends TracingBroadcastReceiver {
        public PackageChangeBroadcastReceiver() {
            super("security");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            InternalApkUploadChimeraService.b(context, InternalApkUploadChimeraService.b);
        }
    }

    public static void b(Context context, long j2) {
        Intent b2 = cyrt.b(context, InternalApkUploadChimeraService.class);
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
                czff.a("Invalid entry state for entry id=%d: %d.", Long.valueOf(apkUploadEntry.a), Integer.valueOf(i2));
                return true;
            }
            i = c;
        }
        boolean z = j3 > ((long) i) || j2 - System.currentTimeMillis() > j;
        Boolean.toString(z);
        long j4 = apkUploadEntry.a;
        String str = apkUploadEntry.b;
        int i3 = czfe.a;
        asot asotVar = czff.a;
        return z;
    }

    public final synchronized void a(boolean z) {
        if (!z) {
            if (!this.l) {
                asot asotVar = czff.a;
                return;
            }
            asot asotVar2 = czff.a;
            unregisterReceiver(this.m);
            unregisterReceiver(this.n);
            this.l = false;
            return;
        }
        if (this.l) {
            asot asotVar3 = czff.a;
            return;
        }
        asot asotVar4 = czff.a;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        intentFilter.addAction("android.net.conn.BACKGROUND_DATA_SETTING_CHANGED");
        iln.b(this, this.m, intentFilter, 2);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REPLACED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter2.addDataScheme("package");
        iln.b(this, this.n, intentFilter2, 2);
        this.l = true;
    }

    protected final boolean c() {
        return this.p.j();
    }

    public final boolean e(PackageInfo packageInfo, byte[] bArr) {
        if (packageInfo.applicationInfo.sourceDir.equals(packageInfo.applicationInfo.publicSourceDir)) {
            try {
                byte[] a2 = this.i.a(packageInfo.packageName, packageInfo.lastUpdateTime, fmut.i() ? new File(bqux.a.a(packageInfo.applicationInfo.sourceDir)) : new File(packageInfo.applicationInfo.sourceDir));
                if (a2 == null) {
                    asot asotVar = czff.a;
                    return false;
                }
                boolean equals = Arrays.equals(a2, bArr);
                asot asotVar2 = czff.a;
                return equals;
            } catch (IOException e) {
                czff.b(e, "exception while reading apk", new Object[0]);
            }
        }
        return false;
    }

    public final boolean f() {
        if (!c()) {
            asot asotVar = czff.a;
            return false;
        }
        if (!frtv.d()) {
            asot asotVar2 = czff.a;
            return false;
        }
        if (this.e.b()) {
            return true;
        }
        asot asotVar3 = czff.a;
        return false;
    }

    public final boolean g(int i) {
        if (!c() || !frtv.d()) {
            stopSelf(i);
            return true;
        }
        synchronized (this.o) {
            if (!this.f.g()) {
                asot asotVar = czff.a;
                return false;
            }
            asot asotVar2 = czff.a;
            stopSelf(i);
            return true;
        }
    }

    public final int h(File file, byte[] bArr, byte[] bArr2, int i) {
        long nanoTime;
        long nanoTime2;
        int i2;
        czek czekVar = new czek(this, file, bArr, bArr2, i);
        File file2 = czekVar.b;
        long length = file2.length();
        int i3 = 0;
        if (length == 0 || length > frtv.b()) {
            czekVar.e.add(1);
        } else {
            czekVar.i = (int) length;
            try {
                czekVar.j = new FileInputStream(file2);
                czekVar.k = 0;
                fecj v = czer.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                czer czerVar = (czer) v.b;
                czerVar.c = 0;
                czerVar.b |= 1;
                fecj v2 = czet.a.v();
                czes czesVar = czes.a;
                if (!v2.b.L()) {
                    v2.U();
                }
                fecp fecpVar = v2.b;
                czet czetVar = (czet) fecpVar;
                czesVar.getClass();
                czetVar.d = czesVar;
                czetVar.b |= 2;
                if (!fecpVar.L()) {
                    v2.U();
                }
                fecp fecpVar2 = v2.b;
                czet czetVar2 = (czet) fecpVar2;
                czetVar2.b |= 1;
                czetVar2.c = "";
                long j2 = czekVar.i;
                if (!fecpVar2.L()) {
                    v2.U();
                }
                czet czetVar3 = (czet) v2.b;
                czetVar3.b |= 4;
                czetVar3.e = j2;
                fecj v3 = czes.a.v();
                feay w = feay.w(czekVar.c);
                if (!v3.b.L()) {
                    v3.U();
                }
                czes czesVar2 = (czes) v3.b;
                czesVar2.b |= 1;
                czesVar2.c = w;
                czes czesVar3 = (czes) v3.Q();
                if (!v2.b.L()) {
                    v2.U();
                }
                czet czetVar4 = (czet) v2.b;
                czesVar3.getClass();
                czetVar4.d = czesVar3;
                czetVar4.b |= 2;
                long e = asng.e(czekVar.a);
                if (!v2.b.L()) {
                    v2.U();
                }
                czet czetVar5 = (czet) v2.b;
                czetVar5.b |= 8;
                czetVar5.f = e;
                if (frtq.v() && (i2 = czekVar.l) != 0) {
                    if (!v.b.L()) {
                        v.U();
                    }
                    czer czerVar2 = (czer) v.b;
                    czerVar2.f = i2 - 1;
                    czerVar2.b |= 8;
                }
                if (!v.b.L()) {
                    v.U();
                }
                czer czerVar3 = (czer) v.b;
                czet czetVar6 = (czet) v2.Q();
                czetVar6.getClass();
                czerVar3.d = czetVar6;
                czerVar3.b |= 2;
                fecj v4 = czev.a.v();
                if (!v4.b.L()) {
                    v4.U();
                }
                czev czevVar = (czev) v4.b;
                czevVar.c = 0;
                czevVar.b |= 1;
                feay w2 = feay.w(czekVar.d);
                if (!v4.b.L()) {
                    v4.U();
                }
                czev czevVar2 = (czev) v4.b;
                czevVar2.b |= 2;
                czevVar2.d = w2;
                czev czevVar3 = (czev) v4.Q();
                if (!v.b.L()) {
                    v.U();
                }
                czer czerVar4 = (czer) v.b;
                czevVar3.getClass();
                czerVar4.e = czevVar3;
                czerVar4.b |= 4;
                czekVar.g = ashg.b();
                czekVar.g.add(new czfd(new czeg(czekVar), new czeh(czekVar), (czer) v.Q(), czekVar.i));
            } catch (IOException unused) {
                czekVar.e.add(1);
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
            } catch (Throwable th) {
                czekVar.a();
                throw th;
            }
        } catch (TimeoutException unused3) {
            czff.c("Upload timed out. Canceling upload", new Object[0]);
            czekVar.f = true;
        }
        if (nanoTime2 > nanoTime) {
            throw new TimeoutException();
        }
        Integer num = (Integer) czekVar.e.poll(nanoTime - nanoTime2, TimeUnit.NANOSECONDS);
        if (num == null) {
            throw new TimeoutException();
        }
        int intValue = num.intValue();
        asot asotVar = czff.a;
        i3 = intValue;
        czekVar.a();
        return i3;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.e = new czfa((ConnectivityManager) getSystemService("connectivity"));
        this.i = new czfc();
        this.p = new cxzr(this);
        HandlerThread handlerThread = new HandlerThread("apk_upload_thread");
        this.g = handlerThread;
        handlerThread.start();
        this.h = new czez(this, this.g.getLooper());
        this.f = new czep(this);
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
        asot asotVar = czff.a;
        if (!c()) {
            stopSelf(i2);
            return 2;
        }
        if (!frtv.d()) {
            stopSelf(i2);
            return 2;
        }
        if (!cxzr.e(this)) {
            stopSelf(i2);
            return 2;
        }
        String action = intent == null ? null : intent.getAction();
        if (action == null) {
            this.h.sendMessage(this.h.obtainMessage(1, i2, 0));
            return 1;
        }
        if (action.equals("com.google.android.gms.security.verifyapps.UPLOAD_APK")) {
            new czey(this, intent, i2).execute(new Void[0]);
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
            ((ejhf) ((ejhf) czff.a.j()).ah(9598)).aa("Unknown action: %s", new Object[]{action});
            this.h.sendMessage(this.h.obtainMessage(2, i2, 0));
        }
        return 1;
    }
}

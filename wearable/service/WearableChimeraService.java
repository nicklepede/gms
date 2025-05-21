package com.google.android.gms.wearable.service;

import android.accounts.Account;
import android.accounts.OnAccountsUpdateListener;
import android.app.usage.UsageStatsManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.provider.Settings;
import android.telecom.TelecomManager;
import android.util.Log;
import com.google.android.chimera.Service;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.wearable.consent.ConsentSyncTaskService;
import com.google.android.gms.wearable.service.WearableChimeraService;
import defpackage.a;
import defpackage.aqup;
import defpackage.armu;
import defpackage.arxo;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.asmf;
import defpackage.aspo;
import defpackage.bqna;
import defpackage.bxhk;
import defpackage.bxhl;
import defpackage.byhr;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.cewl;
import defpackage.deqr;
import defpackage.djjq;
import defpackage.djks;
import defpackage.djku;
import defpackage.djkv;
import defpackage.djkw;
import defpackage.djla;
import defpackage.djqs;
import defpackage.djra;
import defpackage.dkbe;
import defpackage.dkbf;
import defpackage.dkbi;
import defpackage.dkdw;
import defpackage.dkdz;
import defpackage.dkny;
import defpackage.dkpx;
import defpackage.dkqm;
import defpackage.dkqo;
import defpackage.dkrl;
import defpackage.dkry;
import defpackage.dksj;
import defpackage.dkvr;
import defpackage.dkvs;
import defpackage.dkvu;
import defpackage.dkvv;
import defpackage.dkwp;
import defpackage.dkxi;
import defpackage.dkxm;
import defpackage.dkyr;
import defpackage.dkyy;
import defpackage.dkzt;
import defpackage.dkzz;
import defpackage.dlan;
import defpackage.dlbj;
import defpackage.dlbl;
import defpackage.dlfh;
import defpackage.dlfj;
import defpackage.dlfy;
import defpackage.dllv;
import defpackage.dlmg;
import defpackage.dlmm;
import defpackage.dlot;
import defpackage.dlou;
import defpackage.dluo;
import defpackage.dlva;
import defpackage.dlxs;
import defpackage.dlxx;
import defpackage.dmai;
import defpackage.dmak;
import defpackage.dmao;
import defpackage.dmau;
import defpackage.dmaw;
import defpackage.dmbc;
import defpackage.dmbe;
import defpackage.dmbf;
import defpackage.dmbg;
import defpackage.dmbl;
import defpackage.dmbs;
import defpackage.dmbv;
import defpackage.dmbw;
import defpackage.dmca;
import defpackage.dmcb;
import defpackage.dmce;
import defpackage.dmcf;
import defpackage.dmci;
import defpackage.dmcj;
import defpackage.dmck;
import defpackage.dmcl;
import defpackage.dmcn;
import defpackage.dmcr;
import defpackage.dmct;
import defpackage.dmcv;
import defpackage.dmcw;
import defpackage.dmcy;
import defpackage.dmda;
import defpackage.dmdc;
import defpackage.dmdg;
import defpackage.dmdh;
import defpackage.dmdj;
import defpackage.dmig;
import defpackage.dmio;
import defpackage.dmiu;
import defpackage.dmiw;
import defpackage.dmja;
import defpackage.dmjb;
import defpackage.eigd;
import defpackage.eitj;
import defpackage.eius;
import defpackage.eiuu;
import defpackage.ejcb;
import defpackage.ejck;
import defpackage.ejfg;
import defpackage.ejvy;
import defpackage.ensj;
import defpackage.ensm;
import defpackage.enss;
import defpackage.ensv;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.ftga;
import defpackage.ftgt;
import defpackage.fthu;
import defpackage.ftjj;
import defpackage.ftki;
import defpackage.ftkr;
import defpackage.ftkv;
import defpackage.ftld;
import defpackage.ftlq;
import defpackage.iln;
import defpackage.ips;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WearableChimeraService extends Service implements dmiu {
    private static final Map N = new TreeMap();
    public static final List a = new ArrayList();
    public static dkqm b;
    public dmbe A;
    public dmbs B;
    public dmbf C;
    long D;
    public final Object E;
    boolean F;
    public dkyr G;
    dmda H;
    dmcy I;
    dmcn J;
    dmcl K;
    dmck L;
    dmcv M;
    private dksj Q;
    private HandlerThread R;
    private HandlerThread S;
    private dmbc T;
    private final Random U;
    private dmak V;
    private djkw W;
    private dkdw X;
    private dkpx Y;
    private djra Z;
    private final EmulatorBroadcastReceiver aa;
    public final Lock i;
    public final Condition j;
    public boolean k;
    public aslw l;
    Handler m;
    volatile dmce n;
    volatile dmcf o;
    dkvs p;
    dmcr q;
    djjq r;
    public boolean s;
    BroadcastReceiver t;
    public Set u;
    public final Object v;
    public String w;
    public Set x;
    public volatile dmau y;
    public dmbg z;
    private final ConcurrentHashMap O = new ConcurrentHashMap();
    private final AtomicBoolean P = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final Set e = new HashSet();
    public final Object f = new Object();
    public Set g = null;
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public final class PackageBroadcastReceiver extends TracingBroadcastReceiver {
        private final ensv b;

        public PackageBroadcastReceiver() {
            super("wearable");
            this.b = new asmf(1, 9);
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, final Intent intent) {
            String action = intent.getAction();
            if (Objects.equals(action, "android.intent.action.PACKAGE_ADDED") || Objects.equals(action, "android.intent.action.PACKAGE_CHANGED") || Objects.equals(action, "android.intent.action.PACKAGE_REMOVED")) {
                final BroadcastReceiver.PendingResult goAsync = goAsync();
                this.b.execute(new Runnable() { // from class: dmch
                    @Override // java.lang.Runnable
                    public final void run() {
                        String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                        WearableChimeraService.PackageBroadcastReceiver packageBroadcastReceiver = WearableChimeraService.PackageBroadcastReceiver.this;
                        WearableChimeraService wearableChimeraService = WearableChimeraService.this;
                        dmci dmciVar = (dmci) wearableChimeraService.d.remove(schemeSpecificPart);
                        Set set = wearableChimeraService.e;
                        synchronized (set) {
                            set.remove(schemeSpecificPart);
                        }
                        if (dmciVar != null) {
                            dmciVar.b(wearableChimeraService);
                            if (Log.isLoggable("WearableService", 2)) {
                                Log.v("WearableService", "Removed package record: ".concat(String.valueOf(dmja.b(schemeSpecificPart, dmciVar.d))));
                            }
                        }
                        WearableChimeraService wearableChimeraService2 = WearableChimeraService.this;
                        synchronized (wearableChimeraService2.f) {
                            wearableChimeraService2.g = null;
                        }
                        BroadcastReceiver.PendingResult pendingResult = goAsync;
                        WearableChimeraService wearableChimeraService3 = WearableChimeraService.this;
                        wearableChimeraService3.C.a(wearableChimeraService3.getApplicationContext().getPackageManager(), schemeSpecificPart);
                        pendingResult.finish();
                    }
                });
            }
        }
    }

    public WearableChimeraService() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.i = reentrantLock;
        this.j = reentrantLock.newCondition();
        this.k = false;
        this.U = new Random();
        this.v = new Object();
        this.w = "";
        this.x = Collections.EMPTY_SET;
        this.aa = new EmulatorBroadcastReceiver();
        this.E = new Object();
    }

    public static void f(dmio dmioVar) {
        a.add(dmioVar);
    }

    public static void g(String str, dmiu dmiuVar) {
        N.put(str, new WeakReference(dmiuVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean l(android.content.Context r5, java.lang.String r6, boolean r7) {
        /*
            r0 = 1
            android.content.pm.PackageManager r1 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L1c
            android.content.res.Resources r1 = r1.getResourcesForApplication(r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = defpackage.dmiz.a(r1, r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "android_wear_is_multi_node_aware"
            java.lang.String r4 = "bool"
            int r2 = r1.getIdentifier(r3, r4, r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1c
            boolean r1 = r1.getBoolean(r2)     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
            r1 = r0
        L1d:
            int r5 = defpackage.asnp.b(r5, r6)
            java.lang.String r2 = "WearableService"
            if (r5 > 0) goto L3d
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L3d
            java.lang.String r3 = defpackage.dmja.b(r6, r7)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "package or google-play-services version not found: "
            java.lang.String r3 = r4.concat(r3)
            android.util.Log.d(r2, r3)
        L3d:
            boolean r5 = defpackage.aspd.b(r5)
            r3 = 0
            if (r5 == 0) goto L47
            if (r1 == 0) goto L47
            r3 = r0
        L47:
            r5 = 2
            boolean r5 = android.util.Log.isLoggable(r2, r5)
            if (r5 == 0) goto L72
            if (r0 == r3) goto L53
            java.lang.String r5 = "not "
            goto L55
        L53:
            java.lang.String r5 = ""
        L55:
            java.lang.String r6 = defpackage.dmja.b(r6, r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "package is "
            r7.<init>(r0)
            r7.append(r5)
            java.lang.String r5 = "multi-node aware: "
            r7.append(r5)
            r7.append(r6)
            java.lang.String r5 = r7.toString()
            android.util.Log.v(r2, r5)
        L72:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.service.WearableChimeraService.l(android.content.Context, java.lang.String, boolean):boolean");
    }

    private final boolean o(dkqm dkqmVar, dmdh dmdhVar) {
        WeakReference weakReference = (WeakReference) this.h.get(dkqmVar);
        dmig dmigVar = weakReference != null ? (dmig) weakReference.get() : null;
        dmcf dmcfVar = this.o;
        if (dmigVar == null || dmcfVar == null) {
            return false;
        }
        dmigVar.c.add(dmdhVar);
        Message obtainMessage = dmcfVar.obtainMessage(1);
        obtainMessage.obj = dmigVar;
        obtainMessage.sendToTarget();
        return true;
    }

    private final boolean p(dkqm dkqmVar, dmdh dmdhVar) {
        dmci b2 = b(dkqmVar);
        dmce dmceVar = this.n;
        boolean z = false;
        if (b2 != null && dmceVar != null) {
            int Y = (int) ftkr.a.a().Y();
            if (this.A.b) {
                dmdhVar.h.setPackage(dkqmVar.b);
            }
            Intent intent = dmdhVar.h;
            for (dmcj dmcjVar : b2.a(intent)) {
                ArrayDeque arrayDeque = dmcjVar.f;
                synchronized (arrayDeque) {
                    arrayDeque.add(dmdhVar);
                }
                Message obtainMessage = dmceVar.obtainMessage(1);
                obtainMessage.obj = dmcjVar;
                if (intent.getPackage() != null && !Objects.equals(intent.getAction(), "com.google.android.gms.wearable.CAPABILITY_CHANGED")) {
                    obtainMessage.sendToTarget();
                } else if (!dmceVar.hasMessages(obtainMessage.what, obtainMessage.obj)) {
                    dmceVar.sendMessageDelayed(obtainMessage, this.U.nextInt(Y));
                }
                z = true;
            }
        }
        return z;
    }

    private final boolean q(int i, dmci dmciVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return true;
        }
        if (i2 != 1) {
            return i2 != 2 ? dmciVar.a : !dmciVar.a;
        }
        dkqm dkqmVar = dmciVar.c;
        ConcurrentHashMap concurrentHashMap = this.O;
        String str = dkqmVar.b;
        Boolean bool = (Boolean) concurrentHashMap.get(str);
        if (bool == null) {
            synchronized (dkqmVar) {
                bool = (Boolean) concurrentHashMap.get(str);
                if (bool == null) {
                    bool = Boolean.valueOf(aqup.d(this).h(str));
                    concurrentHashMap.put(str, bool);
                }
            }
        }
        return bool.booleanValue();
    }

    public final dkyr a() {
        dkyr dkyrVar;
        synchronized (this.E) {
            if (!this.F) {
                Iterator it = dkyy.l().b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    dkzt dkztVar = (dkzt) it.next();
                    if (this.s != dkztVar.f) {
                        dkyr dkyrVar2 = dkztVar.a;
                        if (!Objects.equals(dkyrVar2.a, "cloud") && this.G == null) {
                            this.G = dkyrVar2;
                            break;
                        }
                    }
                }
                this.F = true;
            }
            dkyrVar = this.G;
        }
        return dkyrVar;
    }

    public final dmci b(dkqm dkqmVar) {
        dmci c = c(dkqmVar.b);
        if (c == null) {
            return null;
        }
        if (dkqmVar.equals(c.c)) {
            return c;
        }
        Log.w("WearableService", "Mismatched certificate: ".concat(String.valueOf(String.valueOf(dkqmVar))));
        synchronized (this) {
            this.D++;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
    
        if (r4.metaData.containsKey("com.google.android.wearable.version") != false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dmci c(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Didn't find package "
            boolean r1 = defpackage.dmdj.k()
            if (r1 == 0) goto L1d
            java.lang.String r1 = "com.google.android.wearable.app.cn"
            boolean r1 = r9.equals(r1)
            if (r1 != 0) goto L18
            java.lang.String r1 = "com.google.android.wearable.app"
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L1d
        L18:
            java.lang.String r1 = "com.google.android.wearable.app.cn"
            java.lang.String r2 = "com.google.android.wearable.app"
            goto L1f
        L1d:
            r1 = r9
            r2 = r1
        L1f:
            j$.util.concurrent.ConcurrentHashMap r3 = r8.d
            java.lang.Object r3 = r3.get(r2)
            dmci r3 = (defpackage.dmci) r3
            if (r3 == 0) goto L2a
            return r3
        L2a:
            java.util.Set r3 = r8.e
            monitor-enter(r3)
            boolean r4 = r3.contains(r1)     // Catch: java.lang.Throwable -> Lc6
            r5 = 0
            if (r4 == 0) goto L36
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc6
            return r5
        L36:
            boolean r4 = defpackage.dmdj.k()     // Catch: java.lang.Throwable -> Lc6
            if (r4 == 0) goto L81
            android.content.pm.PackageManager r4 = r8.getPackageManager()     // Catch: java.lang.Throwable -> Lc6
            r6 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r4 = r4.getApplicationInfo(r1, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62 java.lang.Throwable -> Lc6
            android.os.Bundle r6 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62 java.lang.Throwable -> Lc6
            if (r6 == 0) goto L7a
            android.os.Bundle r6 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62 java.lang.Throwable -> Lc6
            java.lang.String r7 = "com.google.android.gms.version"
            int r6 = r6.getInt(r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62 java.lang.Throwable -> Lc6
            r7 = 10200000(0x9ba3c0, float:1.4293244E-38)
            if (r6 >= r7) goto L81
            android.os.Bundle r4 = r4.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62 java.lang.Throwable -> Lc6
            java.lang.String r6 = "com.google.android.wearable.version"
            boolean r4 = r4.containsKey(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L62 java.lang.Throwable -> Lc6
            if (r4 == 0) goto L7a
            goto L81
        L62:
            java.lang.String r9 = "WearableService"
            r0 = 3
            boolean r9 = android.util.Log.isLoggable(r9, r0)     // Catch: java.lang.Throwable -> Lc6
            if (r9 == 0) goto L7a
            java.lang.String r9 = "WearableService"
            java.lang.String r0 = defpackage.dmix.a(r1)     // Catch: java.lang.Throwable -> Lc6
            java.lang.String r2 = "Could not resolve package: "
            java.lang.String r0 = r2.concat(r0)     // Catch: java.lang.Throwable -> Lc6
            android.util.Log.d(r9, r0)     // Catch: java.lang.Throwable -> Lc6
        L7a:
            java.util.Set r9 = r8.e     // Catch: java.lang.Throwable -> Lc6
            r9.add(r1)     // Catch: java.lang.Throwable -> Lc6
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc6
            return r5
        L81:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc6
            j$.util.concurrent.ConcurrentHashMap r4 = r8.d
            monitor-enter(r4)
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> Lc3
            dmci r3 = (defpackage.dmci) r3     // Catch: java.lang.Throwable -> Lc3
            if (r3 != 0) goto Lc1
            dkqm r5 = defpackage.dkqo.a(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9e java.lang.Throwable -> Lc3
            dmci r6 = new dmci     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9e java.lang.Throwable -> Lc3
            dmce r7 = r8.n     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9e java.lang.Throwable -> Lc3
            r6.<init>(r8, r7, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9e java.lang.Throwable -> Lc3
            r4.put(r2, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9d java.lang.Throwable -> Lc3
            r3 = r6
            goto Lc1
        L9d:
            r3 = r6
        L9e:
            dkoi r2 = defpackage.dkoi.a     // Catch: java.lang.Throwable -> Lc3
            defpackage.dkpy.b(r2, r9)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = "WearableService"
            r2 = 2
            boolean r9 = android.util.Log.isLoggable(r9, r2)     // Catch: java.lang.Throwable -> Lc3
            if (r9 == 0) goto Lc1
            java.lang.String r9 = "WearableService"
            java.lang.String r1 = defpackage.dmix.a(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lc3
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lc3
            r2.append(r1)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> Lc3
            android.util.Log.v(r9, r0)     // Catch: java.lang.Throwable -> Lc3
        Lc1:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc3
            return r3
        Lc3:
            r9 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lc3
            throw r9
        Lc6:
            r9 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lc6
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.service.WearableChimeraService.c(java.lang.String):dmci");
    }

    public final dmig d(dmci dmciVar, dkqm dkqmVar, WeakReference weakReference) {
        TelecomManager telecomManager;
        if (Log.isLoggable("WearableService", 3)) {
            String obj = dkqmVar.toString();
            StringBuilder sb = new StringBuilder("Creating stub for AppKey: ");
            sb.append(obj);
            sb.append(weakReference == null ? " (no stubRef)" : " (stubRef expired)");
            Log.d("WearableService", sb.toString());
        }
        try {
            telecomManager = (TelecomManager) getSystemService("telecom");
        } catch (NoClassDefFoundError unused) {
            Log.w("WearableService", "Could not get TELECOM_SERVICE in SDK " + Build.VERSION.SDK_INT);
            telecomManager = null;
        }
        return new dmig(getApplicationContext(), getPackageManager(), dkwp.m(), dkyy.l(), dkrl.m(), dkqmVar, this.T, dmdj.f(), this.Q, dkzz.c(), telecomManager, (dlbj) dlbj.a.get(), djkv.a(), dlfj.b, dlfh.b, this, dmdj.b(), this.s ? null : cewl.b(this), aqup.d(this), dkny.a(this), dmciVar.a, dmciVar.b, this.y, this.z, this.C, this.A, this.V, this.W, djla.a, this.X, this.Y, this.Z, dmdj.f, (dlmm) dmdj.i.get());
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            boolean z = Objects.equals(Build.TYPE, "user") && !((Boolean) armu.b.i()).booleanValue();
            boolean z2 = false;
            String str = null;
            for (String str2 : strArr) {
                if (!eigd.e("verbose", str2) && !eigd.e("-v", str2)) {
                    str = str2;
                }
                z2 = true;
            }
            String lowerCase = str != null ? str.toLowerCase(Locale.US) : null;
            aspo aspoVar = new aspo(printWriter, "  ");
            for (Map.Entry entry : N.entrySet()) {
                String lowerCase2 = ((String) entry.getKey()).toLowerCase(Locale.US);
                if (lowerCase == null || lowerCase2.contains(lowerCase)) {
                    dmiu dmiuVar = (dmiu) ((WeakReference) entry.getValue()).get();
                    if (dmiuVar != null) {
                        aspoVar.println("#####################################");
                        aspoVar.println((String) entry.getKey());
                        dmiuVar.lf(aspoVar, z, z2);
                    }
                    aspoVar.println();
                }
            }
            aspoVar.flush();
        } catch (Exception e) {
            Log.e("WearableService", "caught exception while dumping", e);
            printWriter.println("caught exception while dumping".concat(String.valueOf(e.getMessage())));
        }
    }

    public final void h() {
        dlxx dlxxVar;
        enss o;
        AtomicReference atomicReference = dmjb.a.b;
        Context applicationContext = getApplicationContext();
        Context context = (Context) atomicReference.getAndSet(applicationContext);
        if (context != null && context != applicationContext) {
            Log.e("WearableService", "PackageRecordCache: appContext was already set " + context.toString() + " -> " + String.valueOf(applicationContext));
        }
        dmdc.f();
        if (!dmdc.e(this)) {
            Log.i("WearableService", "onCreate: Wearable Services not starting. Wear is not available on this device.");
            dmdg.a(getApplicationContext(), false);
            stopSelf();
            return;
        }
        if (fthu.a.a().a()) {
            EmulatorBroadcastReceiver emulatorBroadcastReceiver = this.aa;
            Context applicationContext2 = getApplicationContext();
            emulatorBroadcastReceiver.b = applicationContext2;
            emulatorBroadcastReceiver.a = new dmaw(emulatorBroadcastReceiver);
            applicationContext2.getContentResolver().registerContentObserver(Settings.Global.getUriFor("development_settings_enabled"), false, emulatorBroadcastReceiver.a);
            emulatorBroadcastReceiver.b();
        }
        Log.i("WearableService", "onCreate: Wearable Services starting.");
        dmdj.j(getApplicationContext());
        this.P.set(true);
        this.z = new dmbg(dmdj.b, dmdj.a);
        this.C = new dmbf(getApplicationContext());
        try {
            b = dkqo.a(this, "com.google.android.wearable.app");
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("WearableService", "Failed to create home appkey: ".concat(String.valueOf(e.getMessage())));
        }
        boolean m = dmdj.m();
        this.s = m;
        if (!m) {
            this.V = new dmak(getApplicationContext());
        }
        this.A = dmbe.b();
        dmjb dmjbVar = dmjb.a;
        String c = this.A.c();
        if (c != null) {
            dmjbVar.c.put(c, false);
        }
        this.y = new dmau((UsageStatsManager) getSystemService("usagestats"));
        deqr deqrVar = ftlq.a.a().b() ? new deqr(this, 1, "WearableService", null, "com.google.android.wearable.app") : null;
        HandlerThread handlerThread = new HandlerThread("WearableServiceEventHandler", -2);
        handlerThread.start();
        this.n = new dmce(this, handlerThread.getLooper(), deqrVar);
        HandlerThread handlerThread2 = new HandlerThread("WearableServiceLiveListener", -2);
        handlerThread2.start();
        this.o = new dmcf(handlerThread2.getLooper(), deqrVar);
        this.T = new dmbc();
        this.p = new dmcw(this);
        dkwp.m().D(this.p);
        this.H = new dmda(this);
        dkzz c2 = dkzz.c();
        dmda dmdaVar = this.H;
        synchronized (c2.h) {
            c2.k = dmdaVar;
        }
        this.q = new dmcr(this);
        dkyy.l().c(this.q);
        this.I = new dmcy(this);
        dkwp.m().m.add(this.I);
        this.J = new dmcn(this);
        dkrl.m().i.add(this.J);
        this.K = new dmcl(this);
        djkv.a().b = this.K;
        this.L = new dmck();
        djku.a().b = this.L;
        final dkdw dkdwVar = dkdw.a;
        this.X = dkdwVar;
        if (dkdwVar != null) {
            dmbv dmbvVar = new dmbv(this);
            asmf asmfVar = new asmf(Integer.MAX_VALUE, 9);
            dkdwVar.d = asmfVar;
            dkdwVar.n = dmbvVar;
            asmfVar.execute(new Runnable() { // from class: dkdc
                @Override // java.lang.Runnable
                public final void run() {
                    dmdj.m();
                    dkdw dkdwVar2 = dkdw.this;
                    if (!dkdx.a()) {
                        if (Log.isLoggable("wearable.Consents", 4)) {
                            Log.i("wearable.Consents", "ConsentPerWatch feature is not enabled, removing capability from local node");
                        }
                        if (!ftgt.f()) {
                            dmjl.b(dkdwVar2.o.aW("consents_per_watch").b(new dezt() { // from class: dmjh
                                @Override // defpackage.dezt
                                public final Object a(dfaq dfaqVar) {
                                    if (dfaqVar.m()) {
                                        return true;
                                    }
                                    Exception h = dfaqVar.h();
                                    arwm.s(h);
                                    if (!(h instanceof aqxe)) {
                                        throw h;
                                    }
                                    if (((aqxe) h).a() == 4007) {
                                        return false;
                                    }
                                    throw h;
                                }
                            }).f(new dfap() { // from class: dkdq
                                @Override // defpackage.dfap
                                public final dfaq a(Object obj) {
                                    return dfbl.d(true != ((Boolean) obj).booleanValue() ? "already set" : "updated");
                                }
                            }));
                            return;
                        }
                        int b2 = dkdwVar2.l.b(dkdwVar2.e, dkrj.STATIC, "consents_per_watch");
                        if (Log.isLoggable("wearable.Consents", 4)) {
                            Log.i("wearable.Consents", "ConsentPerWatch feature is not enabled, status of removing capability from local node: ".concat(djkt.a(b2)));
                            return;
                        }
                        return;
                    }
                    if (Log.isLoggable("wearable.Consents", 4)) {
                        Log.i("wearable.Consents", "ConsentPerWatch feature is enabled, adding capability to local node");
                    }
                    if (!ftgt.f()) {
                        dmjl.b(dkdwVar2.o.aU("consents_per_watch").b(new dezt() { // from class: dmjf
                            @Override // defpackage.dezt
                            public final Object a(dfaq dfaqVar) {
                                if (dfaqVar.m()) {
                                    return true;
                                }
                                Exception h = dfaqVar.h();
                                arwm.s(h);
                                if (!(h instanceof aqxe)) {
                                    throw h;
                                }
                                if (((aqxe) h).a() == 4006) {
                                    return false;
                                }
                                throw h;
                            }
                        }).f(new dfap() { // from class: dkdp
                            @Override // defpackage.dfap
                            public final dfaq a(Object obj) {
                                return dfbl.d(true != ((Boolean) obj).booleanValue() ? "already set" : "updated");
                            }
                        }));
                        return;
                    }
                    int a2 = dkdwVar2.l.a(dkdwVar2.e, dkrj.STATIC, "consents_per_watch");
                    if (Log.isLoggable("wearable.Consents", 4)) {
                        Log.i("wearable.Consents", "ConsentsPerWatchFeature feature is enabled. Added local capability: " + djkt.a(a2) + " (" + a2 + ")");
                    }
                }
            });
            if (ftgt.e() && dmdj.m()) {
                Context context2 = dkdwVar.i;
                int i = ConsentSyncTaskService.a;
                Log.i("wearable.ConsentsSync", "Scheduling task for consent sync");
                byjl a2 = byjl.a(context2);
                bykm bykmVar = new bykm();
                bykmVar.t("wear_consent_opt_in_sync_tag");
                bykmVar.p = true;
                bykmVar.v(2);
                bykmVar.w(ConsentSyncTaskService.class.getName());
                bykmVar.j(byki.EVERY_DAY);
                a2.f(bykmVar.b());
            }
            if (!dmdj.m() && ftki.c()) {
                OnAccountsUpdateListener onAccountsUpdateListener = new OnAccountsUpdateListener() { // from class: dkdd
                    @Override // android.accounts.OnAccountsUpdateListener
                    public final void onAccountsUpdated(Account[] accountArr) {
                        if (Log.isLoggable("wearable.Consents", 4)) {
                            Log.i("wearable.Consents", "Accounts updated. There are " + accountArr.length + " accounts");
                        }
                        dkdw dkdwVar2 = dkdw.this;
                        dkdwVar2.p();
                        int i2 = eitj.d;
                        eite eiteVar = new eite();
                        for (Account account : accountArr) {
                            if (account.type.equals("com.google")) {
                                eiteVar.i(account);
                            }
                        }
                        eitj g = eiteVar.g();
                        Iterator it = dkdwVar2.k.iterator();
                        while (it.hasNext()) {
                            ((dkou) it.next()).c(g);
                        }
                    }
                };
                dkdwVar.g = onAccountsUpdateListener;
                if (dkdwVar.h == null) {
                    dkdwVar.h = bqna.b(dkdwVar.i);
                }
                dkdwVar.h.f(onAccountsUpdateListener, dkdwVar.c, false);
                if (Log.isLoggable("wearable.Consents", 4)) {
                    Log.i("wearable.Consents", "Registering receiver");
                }
                dkdwVar.j = new TracingBroadcastReceiver() { // from class: com.google.android.gms.wearable.consent.ConsentService$SWAADLUpdateReceiver
                    {
                        super("wearable");
                    }

                    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                    public final void jz(Context context3, Intent intent) {
                        if (ftki.c() && Objects.equals(intent.getAction(), "com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT")) {
                            if (Log.isLoggable("wearable.Consents", 4)) {
                                Log.i("wearable.Consents", "FACS cache update broadcast received");
                            }
                            enss a3 = dkdz.a(context3).a(intent);
                            final dkdw dkdwVar2 = dkdw.this;
                            Objects.requireNonNull(dkdwVar2);
                            a3.hn(new Runnable() { // from class: dkdv
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dkdw.this.p();
                                }
                            }, dkdwVar2.d);
                        }
                    }
                };
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT");
                iln.b(dkdwVar.i, dkdwVar.j, intentFilter, 2);
            }
        }
        this.Y = dkpx.a(getApplicationContext());
        this.W = djkw.a;
        this.r = new dmct(this);
        dkbi.a().a.add(this.r);
        if (!this.s) {
            arxo arxoVar = djra.a;
            Context applicationContext3 = getApplicationContext();
            this.Z = new djra(djks.a(applicationContext3), djqs.b(applicationContext3));
            dmcv dmcvVar = new dmcv(this);
            this.M = dmcvVar;
            this.Z.b.add(dmcvVar);
        }
        HandlerThread handlerThread3 = new HandlerThread("ChannelManager", -2);
        this.R = handlerThread3;
        handlerThread3.start();
        dmca dmcaVar = new dmca(new deqr(this, 1, "wearChannelApiRetransmissionQueue", null, "com.google.android.wearable.app"));
        HandlerThread handlerThread4 = new HandlerThread("ChannelRetransmissionQueue", -2);
        this.S = handlerThread4;
        handlerThread4.start();
        dkxm dkxmVar = new dkxm(new dkxi(new byhr(this.S.getLooper())), new dlbl(dkzz.c()), dmcaVar);
        dmbl dmblVar = new dmbl(new dmbw(this));
        dmcb dmcbVar = new dmcb(this);
        this.B = dmbs.c();
        dksj dksjVar = new dksj(dkyy.l(), this.B, new byhr(this.R.getLooper()), new dmai(), new SecureRandom(), dkxmVar, dmcbVar);
        this.Q = dksjVar;
        dksjVar.c(dlva.ORIGIN_CHANNEL_API, dmblVar);
        dksj dksjVar2 = this.Q;
        if (dksjVar2.g.getAndSet(true)) {
            throw new IllegalStateException("Called start() twice");
        }
        dksjVar2.f.c(dksjVar2.i);
        dkzz.c().l = this.Q;
        this.n.postDelayed(new Runnable() { // from class: dmbx
            @Override // java.lang.Runnable
            public final void run() {
                WearableChimeraService wearableChimeraService = WearableChimeraService.this;
                List<PackageInfo> installedPackages = wearableChimeraService.getPackageManager().getInstalledPackages(0);
                HashSet hashSet = new HashSet();
                Iterator<PackageInfo> it = installedPackages.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().packageName);
                }
                if (dmdj.k()) {
                    hashSet.add("com.google.android.wearable.app");
                    hashSet.add("com.google.android.gms");
                }
                String c3 = wearableChimeraService.A.c();
                if (c3 != null) {
                    hashSet.add(c3);
                }
                dmbs dmbsVar = wearableChimeraService.B;
                HashSet hashSet2 = new HashSet();
                Iterator it2 = dmbsVar.i.values().iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((Set) it2.next()).iterator();
                    while (it3.hasNext()) {
                        hashSet2.add(((dkqm) it3.next()).b);
                    }
                }
                hashSet.addAll(hashSet2);
                dkwp m2 = dkwp.m();
                SQLiteDatabase writableDatabase = m2.c.getWritableDatabase();
                HashSet hashSet3 = new HashSet(hashSet);
                Cursor query = writableDatabase.query(true, "dataItemsAndAssets", new String[]{"packageName"}, "deleted=0", null, null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        String string = query.getString(0);
                        arwm.s(string);
                        hashSet3.add(string);
                    } finally {
                    }
                }
                if (query != null) {
                    query.close();
                }
                hashSet3.removeAll(hashSet);
                Iterator it4 = hashSet3.iterator();
                while (it4.hasNext()) {
                    m2.H((String) it4.next());
                }
            }
        }, TimeUnit.MINUTES.toMillis(15L));
        g("WearableChimeraService", this);
        IntentFilter intentFilter2 = new IntentFilter();
        intentFilter2.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter2.addAction("android.intent.action.PACKAGE_CHANGED");
        intentFilter2.addAction("android.intent.action.PACKAGE_REMOVED");
        intentFilter2.addDataScheme("package");
        PackageBroadcastReceiver packageBroadcastReceiver = new PackageBroadcastReceiver();
        this.t = packageBroadcastReceiver;
        iln.b(this, packageBroadcastReceiver, intentFilter2, 2);
        final dlmg f = dmdj.f();
        boolean c3 = ftga.c();
        dlmg.a = c3;
        if (f.y) {
            Context context3 = f.c;
            boolean z = Settings.Global.getInt(context3.getApplicationContext().getContentResolver(), "device_supports_ble_mode_key", -1) == 1;
            f.D = z;
            boolean z2 = z & dlmg.a;
            dlmg.a = z2;
            if (!z2) {
                Settings.Global.putInt(context3.getContentResolver(), "wear_connectivity_runtime_type", 0);
            }
            dlfy dlfyVar = f.m;
            boolean z3 = dlmg.a;
            dmiw.a("BleSupportService", "updateLocalBleServerSupport: %b", Boolean.valueOf(z3));
            if (z3 || ftga.a.a().a()) {
                dkvr dkvrVar = new dkvr(dlfyVar.e.a().a, "/ble_support");
                fecj v = dluo.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                dluo dluoVar = (dluo) v.b;
                dluoVar.b |= 1;
                dluoVar.c = z3;
                dkvrVar.e = ((dluo) v.Q()).r();
                o = dlfyVar.b.o(dlfyVar.c, dkvrVar);
            } else {
                dmiw.a("BleSupportService", "Not updating BLE support data item", new Object[0]);
                o = ensm.a;
            }
            ejvy.d(o, Level.WARNING, "Failed to update local BLE server capability");
        } else if (c3) {
            dlfy dlfyVar2 = f.m;
            dlfyVar2.d = f;
            dkwp dkwpVar = dlfyVar2.b;
            dkwpVar.D(dlfyVar2);
            Cursor c4 = dkwpVar.c(dlfyVar2.c, dlfy.a);
            try {
                c4.moveToFirst();
                while (!c4.isAfterLast()) {
                    dlfyVar2.a(dkvv.f(c4));
                }
                if (c4 != null) {
                    c4.close();
                }
            } finally {
            }
        }
        if (ftjj.d()) {
            if (!f.y) {
                AtomicReference atomicReference2 = f.q;
                dkyy dkyyVar = f.h;
                dkwp dkwpVar2 = f.g;
                dlou dlouVar = new dlou(f, dkyyVar, dkwpVar2, dmdj.i());
                dkwpVar2.D(dlouVar);
                eitj a3 = dlouVar.a();
                int i2 = ((ejcb) a3).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    dkvu dkvuVar = (dkvu) a3.get(i3);
                    try {
                        byte[] c5 = dkvuVar.b.c();
                        fecp y = fecp.y(dlxx.a, c5, 0, c5.length, febw.a());
                        fecp.M(y);
                        dlxxVar = (dlxx) y;
                    } catch (fedk unused) {
                        dmiw.f("OffloadSetupClientMgr", "Could not parse existing offload setup request from the data item", new Object[0]);
                    }
                    if (dlxxVar.b != 1) {
                        dmiw.f("OffloadSetupClientMgr", "The proto does not have a setup request message. Data item was %s", dkvuVar);
                        break;
                    }
                    dlxs dlxsVar = (dlxs) dlxxVar.c;
                    if (ftjj.a.a().b()) {
                        dkqm dkqmVar = dkvuVar.a;
                        String str = dkvuVar.e;
                        ensj.t(dlouVar.b(dlxsVar, dkqmVar, str), new dlot(str), dlouVar.a);
                    } else {
                        dlouVar.c(dkvuVar.e, dlxsVar);
                    }
                }
                atomicReference2.set(dlouVar);
            } else if (ftjj.e()) {
                int i4 = ips.a;
            }
        }
        Handler handler = f.i;
        handler.post(new Runnable() { // from class: dllb
            @Override // java.lang.Runnable
            public final void run() {
                dlmg dlmgVar = dlmg.this;
                dlkr.a(dlmgVar.c, dlmgVar.t, dlmgVar.v, dlmgVar.d);
            }
        });
        dmao dmaoVar = f.d;
        if (dmaoVar.h().isEmpty()) {
            SharedPreferences sharedPreferences = f.e;
            dkbe a4 = dkbf.a();
            a4.a = sharedPreferences.getString("paired_bt_name", null);
            a4.b = sharedPreferences.getString("paired_bt_address", null);
            a4.m(sharedPreferences.getInt("connection_type", 0));
            a4.k(sharedPreferences.getInt("side", 0));
            a4.c(sharedPreferences.getBoolean("connection_desired", false));
            dkbf a5 = a4.a();
            if (a5.d != 0) {
                dmaoVar.i(a5);
            }
        }
        if (dlmg.a) {
            dmaoVar.b = f;
        }
        synchronized (f.j) {
            handler.post(new dllv(f));
            Iterator it = dmaoVar.h().iterator();
            while (it.hasNext()) {
                f.d((dkbf) it.next());
            }
        }
        iln.b(f.c, f.E, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"), 2);
        int i5 = ips.a;
        f.F.a("Successfully initialized");
        this.c.set(true);
        Log.i("WearableService", "onCreate: Wearable Services started.");
        dmdg.a(getApplicationContext(), true);
    }

    public final void i(dkqm dkqmVar, dmdh dmdhVar) {
        j(dkqmVar, dmdhVar, false);
    }

    public final void j(dkqm dkqmVar, dmdh dmdhVar, boolean z) {
        eiuu eiuuVar;
        dkqm dkqmVar2;
        if (Log.isLoggable("WearableService", 2)) {
            String valueOf = String.valueOf(dkqmVar);
            String str = true != z ? " " : " liveListenersOnly ";
            Log.v("WearableService", "queueEventAndNotify: " + valueOf + str + dmdhVar.toString());
        }
        dmbe dmbeVar = this.A;
        if (dmbeVar.b) {
            if (dmdhVar.c() && (dkqmVar2 = dmbeVar.e) != null && dkqmVar.b.equals("com.google.android.wearable.app") && !dkqmVar2.b.equals("com.google.android.wearable.app")) {
                if (Log.isLoggable("WearableService", 3)) {
                    Log.d("WearableService", "Dropping companion event ".concat(dmdhVar.toString()));
                    return;
                }
                return;
            }
            if (this.A.i(dkqmVar)) {
                dmbe dmbeVar2 = this.A;
                Uri data = dmdhVar.h.getData();
                if (dmbeVar2.i(dkqmVar)) {
                    dmbeVar2.g.incrementAndGet();
                    eius eiusVar = new eius();
                    if (data == null || data.equals(dlan.a) || data.getPathSegments().isEmpty()) {
                        eiusVar.k(dmbeVar2.c);
                        eiusVar.k(dmbeVar2.d);
                        eiuu g = eiusVar.g();
                        dmbeVar2.h.addAndGet(g.size());
                        eiuuVar = g;
                    } else {
                        eiusVar.k(dmbeVar2.c);
                        Set set = (Set) dmbeVar2.f.get(data.getPathSegments().get(0));
                        if (set != null) {
                            eiusVar.k(set);
                        }
                        eiuu g2 = eiusVar.g();
                        if (g2.isEmpty()) {
                            dmbeVar2.i.incrementAndGet();
                            dmbe.d("No home app found as receiver of the message, URI=".concat(data.toString()));
                        }
                        dmbeVar2.h.addAndGet(g2.size());
                        eiuuVar = g2;
                    }
                } else {
                    eiuuVar = ejck.a;
                }
                ejfg listIterator = eiuuVar.listIterator();
                while (listIterator.hasNext()) {
                    dmci c = c((String) listIterator.next());
                    if (c != null) {
                        if (!z) {
                            r5 |= p(c.c, dmdhVar);
                        }
                        r5 |= o(c.c, dmdhVar);
                    }
                }
                if (r5) {
                    return;
                }
                Log.w("WearableService", a.P(dkqmVar, dmdhVar, "Failed to deliver message to ", "; "));
                return;
            }
        }
        if (!o(dkqmVar, dmdhVar) && !(z ? false : p(dkqmVar, dmdhVar))) {
            Log.w("WearableService", a.P(dkqmVar, dmdhVar, "Failed to deliver message to ", "; "));
        }
    }

    public final void k() {
        this.i.lock();
        try {
            this.k = true;
            this.j.signalAll();
        } finally {
            this.i.unlock();
        }
    }

    @Override // defpackage.dmiu
    public final void lf(aspo aspoVar, boolean z, boolean z2) {
        aspoVar.b();
        aspoVar.println(a.Z(ftld.c(), "Wearable service async onCreate enabled: "));
        aspoVar.println("Wearable service is running: " + this.c.get());
        this.T.lf(aspoVar, z, z2);
        aspoVar.a();
        aspoVar.println("EventHandler:");
        aspoVar.b();
        this.n.dump(aspoVar, "");
        aspoVar.a();
        aspoVar.println("LiveListenerEventHandler:");
        aspoVar.b();
        this.o.dump(aspoVar, "");
        aspoVar.a();
        aspoVar.println("OemCompanionVerifier:");
        aspoVar.b();
        dmbf dmbfVar = this.C;
        aspoVar.println(a.Z(ftkv.e(), "OemCompanionVerifier enabled= "));
        aspoVar.println("OemCompanionVerifier enableDebugSignatureDigests= " + ftkv.d());
        aspoVar.println("AllowListed Companions: ");
        aspoVar.b();
        for (Map.Entry entry : dmbfVar.a.w()) {
            aspoVar.println("package digest: ".concat(String.valueOf((String) entry.getKey())));
            aspoVar.println("signature digest: ".concat(String.valueOf((String) entry.getValue())));
        }
        aspoVar.a();
        aspoVar.println("Installed Oem Companions: ".concat(String.valueOf(String.valueOf(dmbfVar.c.values()))));
        aspoVar.a();
        aspoVar.println("MessageReroutingManager:");
        aspoVar.b();
        this.A.lf(aspoVar, z, z2);
        aspoVar.a();
        aspoVar.println("Stubs:");
        aspoVar.b();
        for (Map.Entry entry2 : this.h.entrySet()) {
            dmig dmigVar = (dmig) ((WeakReference) entry2.getValue()).get();
            if (dmigVar != null) {
                aspoVar.println(entry2.getKey());
                aspoVar.b();
                dmigVar.lf(aspoVar, z, z2);
                aspoVar.a();
            }
        }
        aspoVar.a();
    }

    public final boolean m(String str) {
        return this.x.contains(str);
    }

    public final Set n(int i) {
        Set set;
        HashSet hashSet = new HashSet();
        synchronized (this.f) {
            if (this.g == null) {
                this.g = new HashSet();
                List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("com.google.android.gms.wearable.BIND_LISTENER"), 0);
                if (queryIntentServices != null) {
                    Iterator<ResolveInfo> it = queryIntentServices.iterator();
                    while (it.hasNext()) {
                        this.g.add(it.next().serviceInfo.packageName);
                    }
                }
                String[] strArr = {"com.google.android.gms.wearable.NODE_CHANGED", "com.google.android.gms.wearable.ANCS_NOTIFICATION", "com.google.android.gms.wearable.AMS_UPDATE"};
                for (int i2 = 0; i2 < 3; i2++) {
                    List<ResolveInfo> queryIntentServices2 = getPackageManager().queryIntentServices(new Intent(strArr[i2], dlan.a), 0);
                    if (queryIntentServices2 != null) {
                        Iterator<ResolveInfo> it2 = queryIntentServices2.iterator();
                        while (it2.hasNext()) {
                            this.g.add(it2.next().serviceInfo.packageName);
                        }
                    }
                }
            }
            set = this.g;
        }
        Iterator it3 = set.iterator();
        while (it3.hasNext()) {
            dmci c = c((String) it3.next());
            if (c != null) {
                boolean z = c.f;
                dkqm dkqmVar = c.c;
                if (z) {
                    if (Log.isLoggable("WearableService", 2)) {
                        Log.v("WearableService", "ignoring stopped listener: ".concat(String.valueOf(dmja.a(dkqmVar.b))));
                    }
                } else if (q(i, c)) {
                    hashSet.add(dkqmVar);
                }
            }
        }
        for (Map.Entry entry : this.h.entrySet()) {
            dmig dmigVar = (dmig) ((WeakReference) entry.getValue()).get();
            dmci c2 = c(((dkqm) entry.getKey()).b);
            if (dmigVar != null && c2 != null && q(i, c2)) {
                hashSet.add((dkqm) entry.getKey());
            }
        }
        if (Log.isLoggable("WearableService", 2)) {
            Log.v("WearableService", "getListeningPackages: count=" + hashSet.size());
        }
        return hashSet;
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.wearable.BIND")) {
            return new bxhl(this, 14, ejck.a, 3, new bxhk() { // from class: dmby
                @Override // defpackage.bxhk
                public final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
                    WearableChimeraService wearableChimeraService = WearableChimeraService.this;
                    if (wearableChimeraService.l != null) {
                        wearableChimeraService.i.lock();
                        while (!wearableChimeraService.k) {
                            try {
                                Log.d("WearableService", "onGetService: waiting for onCreate to be completed.");
                                long a2 = ftld.a.a().a();
                                if (!wearableChimeraService.j.await(a2, TimeUnit.SECONDS)) {
                                    Log.e("WearableService", a.w(a2, "onGetService: Wearable service onCreate timed out after ", " seconds."));
                                    bxgjVar.a(8, null);
                                    new byhr(wearableChimeraService.getApplicationContext().getMainLooper()).post(new Runnable() { // from class: dmbu
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            List list = WearableChimeraService.a;
                                            throw new IllegalStateException("Wearable service startup timed out. Restarting GMS Core.");
                                        }
                                    });
                                    return;
                                }
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                                Log.w("WearableService", "onGetService: interrupted while waiting for onCreate to be completed.", e);
                                bxgjVar.a(8, null);
                                return;
                            } finally {
                                wearableChimeraService.i.unlock();
                            }
                        }
                    }
                    if (!wearableChimeraService.c.get()) {
                        Log.w("WearableService", "onGetService: Wear is not available on this device.");
                        bxgjVar.a(16, null);
                        wearableChimeraService.stopSelf();
                        return;
                    }
                    dmci c = wearableChimeraService.c(getServiceRequest.f);
                    if (c == null) {
                        bxgjVar.a(8, null);
                        return;
                    }
                    ConcurrentHashMap concurrentHashMap = wearableChimeraService.h;
                    dkqm dkqmVar = c.c;
                    WeakReference weakReference = (WeakReference) concurrentHashMap.get(dkqmVar);
                    dmig dmigVar = weakReference != null ? (dmig) weakReference.get() : null;
                    if (dmigVar == null) {
                        synchronized (dkqmVar) {
                            WeakReference weakReference2 = (WeakReference) concurrentHashMap.get(dkqmVar);
                            dmig dmigVar2 = weakReference2 != null ? (dmig) weakReference2.get() : null;
                            if (dmigVar2 == null) {
                                dmig d = wearableChimeraService.d(c, dkqmVar, weakReference2);
                                concurrentHashMap.put(dkqmVar, new WeakReference(d));
                                dmigVar = d;
                            } else {
                                dmigVar = dmigVar2;
                            }
                        }
                    }
                    bxgjVar.c(dmigVar);
                }
            });
        }
        Log.w("WearableService", "incompatible service action: ".concat(String.valueOf(intent.getAction())));
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        this.i.lock();
        try {
            this.k = false;
            this.i.unlock();
            if (!ftld.c()) {
                h();
                k();
                return;
            }
            Log.d("WearableService", "Creating wearable service asynchronously.");
            aslw aslwVar = new aslw("WearableChimeraService", 0);
            this.l = aslwVar;
            aslwVar.start();
            aslv aslvVar = new aslv(this.l);
            this.m = aslvVar;
            aslvVar.post(new Runnable() { // from class: dmbz
                @Override // java.lang.Runnable
                public final void run() {
                    WearableChimeraService wearableChimeraService = WearableChimeraService.this;
                    wearableChimeraService.h();
                    wearableChimeraService.k();
                }
            });
        } catch (Throwable th) {
            this.i.unlock();
            throw th;
        }
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        djra djraVar;
        OnAccountsUpdateListener onAccountsUpdateListener;
        super.onDestroy();
        if (this.l != null) {
            this.i.lock();
            while (!this.k) {
                try {
                    Log.d("WearableService", "onDestroy: waiting for onCreate to be completed.");
                    this.j.await();
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    Log.w("WearableService", "onDestroy: interrupted while waiting for onCreate to be completed.", e);
                    return;
                } finally {
                    this.i.unlock();
                }
            }
        }
        this.c.set(false);
        if (this.P.get()) {
            EmulatorBroadcastReceiver emulatorBroadcastReceiver = this.aa;
            Context context = emulatorBroadcastReceiver.b;
            if (context != null) {
                context.getContentResolver().unregisterContentObserver(emulatorBroadcastReceiver.a);
                emulatorBroadcastReceiver.d();
            }
            djkv.a().b = null;
            this.K = null;
            djku.a().b = null;
            this.L = null;
            if (this.r != null) {
                dkbi.a().a.remove(this.r);
                this.r = null;
            }
            if (this.J != null) {
                dkrl.m().i.remove(this.J);
            }
            this.J = null;
            if (this.q != null) {
                dkyy.l().d(this.q);
            }
            this.q = null;
            dkzz c = dkzz.c();
            synchronized (c.h) {
                c.k = null;
            }
            this.H = null;
            if (this.p != null) {
                dkwp.m().l.remove(this.p);
            }
            this.p = null;
            if (this.I != null) {
                dkwp.m().m.remove(this.I);
            }
            this.I = null;
            dkdw dkdwVar = this.X;
            if (dkdwVar != null) {
                dkdwVar.n = null;
                bqna bqnaVar = dkdwVar.h;
                if (bqnaVar != null && (onAccountsUpdateListener = dkdwVar.g) != null) {
                    bqnaVar.i(onAccountsUpdateListener);
                }
                dkdwVar.b.quitSafely();
                dkdwVar.h = null;
                dkdwVar.g = null;
                TracingBroadcastReceiver tracingBroadcastReceiver = dkdwVar.j;
                if (tracingBroadcastReceiver != null) {
                    dkdwVar.i.unregisterReceiver(tracingBroadcastReceiver);
                    dkdwVar.j = null;
                }
            }
            if (this.n != null) {
                dmce dmceVar = this.n;
                dmceVar.b = true;
                dmceVar.removeCallbacksAndMessages(null);
                dmceVar.getLooper().quitSafely();
                WearableChimeraService wearableChimeraService = dmceVar.c;
                Iterator it = wearableChimeraService.d.values().iterator();
                while (it.hasNext()) {
                    ((dmci) it.next()).b(wearableChimeraService);
                }
            }
            this.n = null;
            if (this.o != null) {
                this.o.getLooper().quitSafely();
            }
            this.o = null;
            dkzz.c().l = null;
            dksj dksjVar = this.Q;
            if (dksjVar != null) {
                if (!dksjVar.g.getAndSet(false)) {
                    throw new IllegalStateException("Called stop() on stopped channel manager");
                }
                dksjVar.a.post(new dkry(dksjVar));
                dksjVar.b.f();
                dksjVar.f.d(dksjVar.i);
                this.Q.c(dlva.ORIGIN_CHANNEL_API, null);
                this.R.quitSafely();
                this.S.interrupt();
                this.S.quit();
            }
            dmbc dmbcVar = this.T;
            if (dmbcVar != null) {
                dmbcVar.c.shutdown();
            }
            BroadcastReceiver broadcastReceiver = this.t;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
            }
            dmcv dmcvVar = this.M;
            if (dmcvVar != null && (djraVar = this.Z) != null) {
                djraVar.b.remove(dmcvVar);
            }
            this.Z = null;
            this.M = null;
            aslw aslwVar = this.l;
            if (aslwVar != null) {
                aslwVar.quitSafely();
                this.l = null;
            }
            this.m = null;
        }
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 1;
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        return false;
    }
}

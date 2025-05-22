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
import defpackage.asxe;
import defpackage.atpj;
import defpackage.auad;
import defpackage.aupp;
import defpackage.aupq;
import defpackage.aupz;
import defpackage.auti;
import defpackage.bsup;
import defpackage.bzqa;
import defpackage.bzqb;
import defpackage.caqj;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.chdw;
import defpackage.dhbu;
import defpackage.dlvj;
import defpackage.dlwl;
import defpackage.dlwn;
import defpackage.dlwo;
import defpackage.dlwp;
import defpackage.dlwt;
import defpackage.dmcl;
import defpackage.dmct;
import defpackage.dmmx;
import defpackage.dmmy;
import defpackage.dmnb;
import defpackage.dmpp;
import defpackage.dmps;
import defpackage.dmzr;
import defpackage.dnbq;
import defpackage.dncf;
import defpackage.dnch;
import defpackage.dnde;
import defpackage.dndr;
import defpackage.dnec;
import defpackage.dnhk;
import defpackage.dnhl;
import defpackage.dnhn;
import defpackage.dnho;
import defpackage.dnii;
import defpackage.dnjb;
import defpackage.dnjf;
import defpackage.dnkk;
import defpackage.dnkr;
import defpackage.dnlm;
import defpackage.dnls;
import defpackage.dnmh;
import defpackage.dnnd;
import defpackage.dnnf;
import defpackage.dnrb;
import defpackage.dnrd;
import defpackage.dnrs;
import defpackage.dnxm;
import defpackage.dnxx;
import defpackage.dnyd;
import defpackage.doak;
import defpackage.doal;
import defpackage.dogf;
import defpackage.dogr;
import defpackage.dojj;
import defpackage.dojo;
import defpackage.dolu;
import defpackage.dolw;
import defpackage.doma;
import defpackage.domg;
import defpackage.domi;
import defpackage.domo;
import defpackage.domq;
import defpackage.domr;
import defpackage.doms;
import defpackage.domx;
import defpackage.done;
import defpackage.donh;
import defpackage.doni;
import defpackage.donm;
import defpackage.donn;
import defpackage.donq;
import defpackage.donr;
import defpackage.donu;
import defpackage.donv;
import defpackage.donw;
import defpackage.donx;
import defpackage.donz;
import defpackage.dood;
import defpackage.doof;
import defpackage.dooh;
import defpackage.dooi;
import defpackage.dook;
import defpackage.doom;
import defpackage.dooo;
import defpackage.doos;
import defpackage.doot;
import defpackage.doov;
import defpackage.dots;
import defpackage.doua;
import defpackage.doug;
import defpackage.douk;
import defpackage.douo;
import defpackage.doup;
import defpackage.ekti;
import defpackage.elgo;
import defpackage.elhx;
import defpackage.elhz;
import defpackage.elpg;
import defpackage.elpp;
import defpackage.elsn;
import defpackage.emjh;
import defpackage.eqgc;
import defpackage.eqgf;
import defpackage.eqgl;
import defpackage.eqgo;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fwbp;
import defpackage.fwci;
import defpackage.fwdj;
import defpackage.fwfb;
import defpackage.fwga;
import defpackage.fwgj;
import defpackage.fwgn;
import defpackage.fwgv;
import defpackage.fwhi;
import defpackage.ind;
import defpackage.iri;
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

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WearableChimeraService extends Service implements doug {
    private static final Map N = new TreeMap();
    public static final List a = new ArrayList();
    public static dncf b;
    public domq A;
    public done B;
    public domr C;
    long D;
    public final Object E;
    boolean F;
    public dnkk G;
    doom H;
    dook I;
    donz J;
    donx K;
    donw L;
    dooh M;
    private dnec Q;
    private HandlerThread R;
    private HandlerThread S;
    private domo T;
    private final Random U;
    private dolw V;
    private dlwp W;
    private dmpp X;
    private dnbq Y;
    private dmct Z;
    private final EmulatorBroadcastReceiver aa;
    public final Lock i;
    public final Condition j;
    public boolean k;
    public aupq l;
    Handler m;
    volatile donq n;
    volatile donr o;
    dnhl p;
    dood q;
    dlvj r;
    public boolean s;
    BroadcastReceiver t;
    public Set u;
    public final Object v;
    public String w;
    public Set x;
    public volatile domg y;
    public doms z;
    private final ConcurrentHashMap O = new ConcurrentHashMap();
    private final AtomicBoolean P = new AtomicBoolean(false);
    public final AtomicBoolean c = new AtomicBoolean(false);
    public final ConcurrentHashMap d = new ConcurrentHashMap();
    public final Set e = new HashSet();
    public final Object f = new Object();
    public Set g = null;
    public final ConcurrentHashMap h = new ConcurrentHashMap();

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public final class PackageBroadcastReceiver extends TracingBroadcastReceiver {
        private final eqgo b;

        public PackageBroadcastReceiver() {
            super("wearable");
            this.b = new aupz(1, 9);
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, final Intent intent) {
            String action = intent.getAction();
            if (Objects.equals(action, "android.intent.action.PACKAGE_ADDED") || Objects.equals(action, "android.intent.action.PACKAGE_CHANGED") || Objects.equals(action, "android.intent.action.PACKAGE_REMOVED")) {
                final BroadcastReceiver.PendingResult goAsync = goAsync();
                this.b.execute(new Runnable() { // from class: dont
                    @Override // java.lang.Runnable
                    public final void run() {
                        String schemeSpecificPart = intent.getData().getSchemeSpecificPart();
                        WearableChimeraService.PackageBroadcastReceiver packageBroadcastReceiver = WearableChimeraService.PackageBroadcastReceiver.this;
                        WearableChimeraService wearableChimeraService = WearableChimeraService.this;
                        donu donuVar = (donu) wearableChimeraService.d.remove(schemeSpecificPart);
                        Set set = wearableChimeraService.e;
                        synchronized (set) {
                            set.remove(schemeSpecificPart);
                        }
                        if (donuVar != null) {
                            donuVar.b(wearableChimeraService);
                            if (Log.isLoggable("WearableService", 2)) {
                                Log.v("WearableService", "Removed package record: ".concat(String.valueOf(douo.b(schemeSpecificPart, donuVar.c))));
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

    public static void f(doua douaVar) {
        a.add(douaVar);
    }

    public static void g(String str, doug dougVar) {
        N.put(str, new WeakReference(dougVar));
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
            java.lang.String r2 = defpackage.doun.a(r1, r6)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "android_wear_is_multi_node_aware"
            java.lang.String r4 = "bool"
            int r2 = r1.getIdentifier(r3, r4, r2)     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1c
            boolean r1 = r1.getBoolean(r2)     // Catch: java.lang.Throwable -> L1c
            goto L1d
        L1c:
            r1 = r0
        L1d:
            int r5 = defpackage.aurj.b(r5, r6)
            java.lang.String r2 = "WearableService"
            if (r5 > 0) goto L3d
            r3 = 3
            boolean r3 = android.util.Log.isLoggable(r2, r3)
            if (r3 == 0) goto L3d
            java.lang.String r3 = defpackage.douo.b(r6, r7)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "package or google-play-services version not found: "
            java.lang.String r3 = r4.concat(r3)
            android.util.Log.d(r2, r3)
        L3d:
            boolean r5 = defpackage.ausx.b(r5)
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
            java.lang.String r6 = defpackage.douo.b(r6, r7)
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

    private final boolean o(dncf dncfVar, doot dootVar) {
        WeakReference weakReference = (WeakReference) this.h.get(dncfVar);
        dots dotsVar = weakReference != null ? (dots) weakReference.get() : null;
        donr donrVar = this.o;
        if (dotsVar == null || donrVar == null) {
            return false;
        }
        dotsVar.c.add(dootVar);
        Message obtainMessage = donrVar.obtainMessage(1);
        obtainMessage.obj = dotsVar;
        obtainMessage.sendToTarget();
        return true;
    }

    private final boolean p(dncf dncfVar, doot dootVar) {
        donu b2 = b(dncfVar);
        donq donqVar = this.n;
        boolean z = false;
        if (b2 != null && donqVar != null) {
            int Y = (int) fwgj.a.lK().Y();
            if (this.A.b) {
                dootVar.h.setPackage(dncfVar.b);
            }
            Intent intent = dootVar.h;
            for (donv donvVar : b2.a(intent)) {
                ArrayDeque arrayDeque = donvVar.f;
                synchronized (arrayDeque) {
                    arrayDeque.add(dootVar);
                }
                Message obtainMessage = donqVar.obtainMessage(1);
                obtainMessage.obj = donvVar;
                if (intent.getPackage() != null && !Objects.equals(intent.getAction(), "com.google.android.gms.wearable.CAPABILITY_CHANGED")) {
                    obtainMessage.sendToTarget();
                } else if (!donqVar.hasMessages(obtainMessage.what, obtainMessage.obj)) {
                    donqVar.sendMessageDelayed(obtainMessage, this.U.nextInt(Y));
                }
                z = true;
            }
        }
        return z;
    }

    private final boolean q(int i, donu donuVar) {
        int i2 = i - 1;
        if (i2 == 0) {
            return true;
        }
        if (i2 != 1) {
            return i2 != 2 ? donuVar.a : !donuVar.a;
        }
        dncf dncfVar = donuVar.b;
        ConcurrentHashMap concurrentHashMap = this.O;
        String str = dncfVar.b;
        Boolean bool = (Boolean) concurrentHashMap.get(str);
        if (bool == null) {
            synchronized (dncfVar) {
                bool = (Boolean) concurrentHashMap.get(str);
                if (bool == null) {
                    bool = Boolean.valueOf(asxe.d(this).h(str));
                    concurrentHashMap.put(str, bool);
                }
            }
        }
        return bool.booleanValue();
    }

    public final dnkk a() {
        dnkk dnkkVar;
        synchronized (this.E) {
            if (!this.F) {
                Iterator it = dnkr.l().b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    dnlm dnlmVar = (dnlm) it.next();
                    if (this.s != dnlmVar.f) {
                        dnkk dnkkVar2 = dnlmVar.a;
                        if (!Objects.equals(dnkkVar2.a, "cloud") && this.G == null) {
                            this.G = dnkkVar2;
                            break;
                        }
                    }
                }
                this.F = true;
            }
            dnkkVar = this.G;
        }
        return dnkkVar;
    }

    public final donu b(dncf dncfVar) {
        donu c = c(dncfVar.b);
        if (c == null) {
            return null;
        }
        if (dncfVar.equals(c.b)) {
            return c;
        }
        Log.w("WearableService", "Mismatched certificate: ".concat(String.valueOf(String.valueOf(dncfVar))));
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
    public final defpackage.donu c(java.lang.String r9) {
        /*
            r8 = this;
            java.lang.String r0 = "Didn't find package "
            boolean r1 = defpackage.doov.k()
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
            donu r3 = (defpackage.donu) r3
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
            boolean r4 = defpackage.doov.k()     // Catch: java.lang.Throwable -> Lc6
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
            java.lang.String r0 = defpackage.doul.a(r1)     // Catch: java.lang.Throwable -> Lc6
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
            donu r3 = (defpackage.donu) r3     // Catch: java.lang.Throwable -> Lc3
            if (r3 != 0) goto Lc1
            dncf r5 = defpackage.dnch.a(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9e java.lang.Throwable -> Lc3
            donu r6 = new donu     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9e java.lang.Throwable -> Lc3
            donq r7 = r8.n     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9e java.lang.Throwable -> Lc3
            r6.<init>(r8, r7, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9e java.lang.Throwable -> Lc3
            r4.put(r2, r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L9d java.lang.Throwable -> Lc3
            r3 = r6
            goto Lc1
        L9d:
            r3 = r6
        L9e:
            dnab r2 = defpackage.dnab.a     // Catch: java.lang.Throwable -> Lc3
            defpackage.dnbr.b(r2, r9)     // Catch: java.lang.Throwable -> Lc3
            java.lang.String r9 = "WearableService"
            r2 = 2
            boolean r9 = android.util.Log.isLoggable(r9, r2)     // Catch: java.lang.Throwable -> Lc3
            if (r9 == 0) goto Lc1
            java.lang.String r9 = "WearableService"
            java.lang.String r1 = defpackage.doul.a(r1)     // Catch: java.lang.Throwable -> Lc3
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.service.WearableChimeraService.c(java.lang.String):donu");
    }

    public final dots d(donu donuVar, dncf dncfVar, WeakReference weakReference) {
        TelecomManager telecomManager;
        if (Log.isLoggable("WearableService", 3)) {
            String obj = dncfVar.toString();
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
        return new dots(getApplicationContext(), getPackageManager(), dnii.m(), dnkr.l(), dnde.m(), dncfVar, this.T, doov.f(), this.Q, dnls.c(), telecomManager, (dnnd) dnnd.a.get(), dlwo.a(), dnrd.b, dnrb.b, this, doov.b(), this.s ? null : chdw.b(this), asxe.d(this), dmzr.a(this), donuVar.a, this.y, this.z, this.C, this.A, this.V, this.W, dlwt.a, this.X, this.Y, this.Z, doov.f, (dnyd) doov.i.get());
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        try {
            boolean z = Objects.equals(Build.TYPE, "user") && !((Boolean) atpj.b.i()).booleanValue();
            boolean z2 = false;
            String str = null;
            for (String str2 : strArr) {
                if (!ekti.e("verbose", str2) && !ekti.e("-v", str2)) {
                    str = str2;
                }
                z2 = true;
            }
            String lowerCase = str != null ? str.toLowerCase(Locale.US) : null;
            auti autiVar = new auti(printWriter, "  ");
            for (Map.Entry entry : N.entrySet()) {
                String lowerCase2 = ((String) entry.getKey()).toLowerCase(Locale.US);
                if (lowerCase == null || lowerCase2.contains(lowerCase)) {
                    doug dougVar = (doug) ((WeakReference) entry.getValue()).get();
                    if (dougVar != null) {
                        autiVar.println("#####################################");
                        autiVar.println((String) entry.getKey());
                        dougVar.lv(autiVar, z, z2);
                    }
                    autiVar.println();
                }
            }
            autiVar.flush();
        } catch (Exception e) {
            Log.e("WearableService", "caught exception while dumping", e);
            printWriter.println("caught exception while dumping".concat(String.valueOf(e.getMessage())));
        }
    }

    public final void h() {
        eqgl o;
        dojo dojoVar;
        AtomicReference atomicReference = doup.a.b;
        Context applicationContext = getApplicationContext();
        Context context = (Context) atomicReference.getAndSet(applicationContext);
        if (context != null && context != applicationContext) {
            Log.e("WearableService", "PackageRecordCache: appContext was already set " + context.toString() + " -> " + String.valueOf(applicationContext));
        }
        dooo.f();
        if (!dooo.e(this)) {
            Log.i("WearableService", "onCreate: Wearable Services not starting. Wear is not available on this device.");
            doos.a(getApplicationContext(), false);
            stopSelf();
            return;
        }
        if (fwdj.a.lK().a()) {
            EmulatorBroadcastReceiver emulatorBroadcastReceiver = this.aa;
            Context applicationContext2 = getApplicationContext();
            emulatorBroadcastReceiver.b = applicationContext2;
            emulatorBroadcastReceiver.a = new domi(emulatorBroadcastReceiver);
            applicationContext2.getContentResolver().registerContentObserver(Settings.Global.getUriFor("development_settings_enabled"), false, emulatorBroadcastReceiver.a);
            emulatorBroadcastReceiver.b();
        }
        Log.i("WearableService", "onCreate: Wearable Services starting.");
        doov.j(getApplicationContext());
        this.P.set(true);
        this.z = new doms(doov.b, doov.a);
        this.C = new domr(getApplicationContext());
        try {
            b = dnch.a(this, "com.google.android.wearable.app");
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("WearableService", "Failed to create home appkey: ".concat(String.valueOf(e.getMessage())));
        }
        boolean m = doov.m();
        this.s = m;
        if (!m) {
            this.V = new dolw(getApplicationContext());
        }
        this.A = domq.b();
        doup doupVar = doup.a;
        String c = this.A.c();
        if (c != null) {
            doupVar.c.put(c, false);
        }
        this.y = new domg((UsageStatsManager) getSystemService("usagestats"));
        dhbu dhbuVar = fwhi.a.lK().b() ? new dhbu(this, 1, "WearableService", null, "com.google.android.wearable.app") : null;
        HandlerThread handlerThread = new HandlerThread("WearableServiceEventHandler", -2);
        handlerThread.start();
        this.n = new donq(this, handlerThread.getLooper(), dhbuVar);
        HandlerThread handlerThread2 = new HandlerThread("WearableServiceLiveListener", -2);
        handlerThread2.start();
        this.o = new donr(handlerThread2.getLooper(), dhbuVar);
        this.T = new domo();
        this.p = new dooi(this);
        dnii.m().D(this.p);
        this.H = new doom(this);
        dnls c2 = dnls.c();
        doom doomVar = this.H;
        synchronized (c2.h) {
            c2.k = doomVar;
        }
        this.q = new dood(this);
        dnkr.l().c(this.q);
        this.I = new dook(this);
        dnii.m().m.add(this.I);
        this.J = new donz(this);
        dnde.m().i.add(this.J);
        this.K = new donx(this);
        dlwo.a().b = this.K;
        this.L = new donw();
        dlwn.a().b = this.L;
        final dmpp dmppVar = dmpp.a;
        this.X = dmppVar;
        if (dmppVar != null) {
            donh donhVar = new donh(this);
            aupz aupzVar = new aupz(Integer.MAX_VALUE, 9);
            dmppVar.d = aupzVar;
            dmppVar.n = donhVar;
            aupzVar.execute(new Runnable() { // from class: dmov
                @Override // java.lang.Runnable
                public final void run() {
                    doov.m();
                    dmpp dmppVar2 = dmpp.this;
                    if (!dmpq.a()) {
                        if (Log.isLoggable("wearable.Consents", 4)) {
                            Log.i("wearable.Consents", "ConsentPerWatch feature is not enabled, removing capability from local node");
                        }
                        if (!fwci.f()) {
                            douz.b(dmppVar2.o.aV("consents_per_watch").b(new dhkz() { // from class: douv
                                @Override // defpackage.dhkz
                                public final Object a(dhlw dhlwVar) {
                                    if (dhlwVar.m()) {
                                        return true;
                                    }
                                    Exception h = dhlwVar.h();
                                    atzb.s(h);
                                    if (!(h instanceof aszt)) {
                                        throw h;
                                    }
                                    if (((aszt) h).a() == 4007) {
                                        return false;
                                    }
                                    throw h;
                                }
                            }).f(new dhlv() { // from class: dmpj
                                @Override // defpackage.dhlv
                                public final dhlw a(Object obj) {
                                    return dhmr.d(true != ((Boolean) obj).booleanValue() ? "already set" : "updated");
                                }
                            }));
                            return;
                        }
                        int b2 = dmppVar2.l.b(dmppVar2.e, dndc.STATIC, "consents_per_watch");
                        if (Log.isLoggable("wearable.Consents", 4)) {
                            Log.i("wearable.Consents", "ConsentPerWatch feature is not enabled, status of removing capability from local node: ".concat(dlwm.a(b2)));
                            return;
                        }
                        return;
                    }
                    if (Log.isLoggable("wearable.Consents", 4)) {
                        Log.i("wearable.Consents", "ConsentPerWatch feature is enabled, adding capability to local node");
                    }
                    if (!fwci.f()) {
                        douz.b(dmppVar2.o.aT("consents_per_watch").b(new dhkz() { // from class: dout
                            @Override // defpackage.dhkz
                            public final Object a(dhlw dhlwVar) {
                                if (dhlwVar.m()) {
                                    return true;
                                }
                                Exception h = dhlwVar.h();
                                atzb.s(h);
                                if (!(h instanceof aszt)) {
                                    throw h;
                                }
                                if (((aszt) h).a() == 4006) {
                                    return false;
                                }
                                throw h;
                            }
                        }).f(new dhlv() { // from class: dmpi
                            @Override // defpackage.dhlv
                            public final dhlw a(Object obj) {
                                return dhmr.d(true != ((Boolean) obj).booleanValue() ? "already set" : "updated");
                            }
                        }));
                        return;
                    }
                    int a2 = dmppVar2.l.a(dmppVar2.e, dndc.STATIC, "consents_per_watch");
                    if (Log.isLoggable("wearable.Consents", 4)) {
                        Log.i("wearable.Consents", "ConsentsPerWatchFeature feature is enabled. Added local capability: " + dlwm.a(a2) + " (" + a2 + ")");
                    }
                }
            });
            if (fwci.e() && doov.m()) {
                Context context2 = dmppVar.i;
                int i = ConsentSyncTaskService.a;
                Log.i("wearable.ConsentsSync", "Scheduling task for consent sync");
                casd a2 = casd.a(context2);
                cate cateVar = new cate();
                cateVar.t("wear_consent_opt_in_sync_tag");
                cateVar.p = true;
                cateVar.v(2);
                cateVar.w(ConsentSyncTaskService.class.getName());
                cateVar.j(cata.EVERY_DAY);
                a2.f(cateVar.b());
            }
            if (!doov.m() && fwga.c()) {
                OnAccountsUpdateListener onAccountsUpdateListener = new OnAccountsUpdateListener() { // from class: dmow
                    @Override // android.accounts.OnAccountsUpdateListener
                    public final void onAccountsUpdated(Account[] accountArr) {
                        if (Log.isLoggable("wearable.Consents", 4)) {
                            Log.i("wearable.Consents", "Accounts updated. There are " + accountArr.length + " accounts");
                        }
                        dmpp dmppVar2 = dmpp.this;
                        dmppVar2.p();
                        int i2 = elgo.d;
                        elgj elgjVar = new elgj();
                        for (Account account : accountArr) {
                            if (account.type.equals("com.google")) {
                                elgjVar.i(account);
                            }
                        }
                        elgo g = elgjVar.g();
                        Iterator it = dmppVar2.k.iterator();
                        while (it.hasNext()) {
                            ((dnan) it.next()).c(g);
                        }
                    }
                };
                dmppVar.g = onAccountsUpdateListener;
                if (dmppVar.h == null) {
                    dmppVar.h = bsup.b(dmppVar.i);
                }
                dmppVar.h.f(onAccountsUpdateListener, dmppVar.c, false);
                if (Log.isLoggable("wearable.Consents", 4)) {
                    Log.i("wearable.Consents", "Registering receiver");
                }
                dmppVar.j = new TracingBroadcastReceiver() { // from class: com.google.android.gms.wearable.consent.ConsentService$SWAADLUpdateReceiver
                    {
                        super("wearable");
                    }

                    @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
                    public final void jP(Context context3, Intent intent) {
                        if (fwga.c() && Objects.equals(intent.getAction(), "com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT")) {
                            if (Log.isLoggable("wearable.Consents", 4)) {
                                Log.i("wearable.Consents", "FACS cache update broadcast received");
                            }
                            eqgl a3 = dmps.a(context3).a(intent);
                            final dmpp dmppVar2 = dmpp.this;
                            Objects.requireNonNull(dmppVar2);
                            a3.hD(new Runnable() { // from class: dmpo
                                @Override // java.lang.Runnable
                                public final void run() {
                                    dmpp.this.p();
                                }
                            }, dmppVar2.d);
                        }
                    }
                };
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.google.android.gms.udc.action.FACS_CACHE_UPDATED_EXPLICIT");
                ind.b(dmppVar.i, dmppVar.j, intentFilter, 2);
            }
        }
        this.Y = dnbq.a(getApplicationContext());
        this.W = dlwp.a;
        this.r = new doof(this);
        dmnb.a().a.add(this.r);
        if (!this.s) {
            auad auadVar = dmct.a;
            Context applicationContext3 = getApplicationContext();
            this.Z = new dmct(dlwl.a(applicationContext3), dmcl.b(applicationContext3));
            dooh doohVar = new dooh(this);
            this.M = doohVar;
            this.Z.b.add(doohVar);
        }
        HandlerThread handlerThread3 = new HandlerThread("ChannelManager", -2);
        this.R = handlerThread3;
        handlerThread3.start();
        donm donmVar = new donm(new dhbu(this, 1, "wearChannelApiRetransmissionQueue", null, "com.google.android.wearable.app"));
        HandlerThread handlerThread4 = new HandlerThread("ChannelRetransmissionQueue", -2);
        this.S = handlerThread4;
        handlerThread4.start();
        dnjf dnjfVar = new dnjf(new dnjb(new caqj(this.S.getLooper())), new dnnf(dnls.c()), donmVar);
        domx domxVar = new domx(new doni(this));
        donn donnVar = new donn(this);
        this.B = done.c();
        dnec dnecVar = new dnec(dnkr.l(), this.B, new caqj(this.R.getLooper()), new dolu(), new SecureRandom(), dnjfVar, donnVar);
        this.Q = dnecVar;
        dnecVar.c(dogr.ORIGIN_CHANNEL_API, domxVar);
        dnec dnecVar2 = this.Q;
        if (dnecVar2.g.getAndSet(true)) {
            throw new IllegalStateException("Called start() twice");
        }
        dnecVar2.f.c(dnecVar2.i);
        dnls.c().l = this.Q;
        this.n.postDelayed(new Runnable() { // from class: donj
            @Override // java.lang.Runnable
            public final void run() {
                WearableChimeraService wearableChimeraService = WearableChimeraService.this;
                List<PackageInfo> installedPackages = wearableChimeraService.getPackageManager().getInstalledPackages(0);
                HashSet hashSet = new HashSet();
                Iterator<PackageInfo> it = installedPackages.iterator();
                while (it.hasNext()) {
                    hashSet.add(it.next().packageName);
                }
                if (doov.k()) {
                    hashSet.add("com.google.android.wearable.app");
                    hashSet.add("com.google.android.gms");
                }
                String c3 = wearableChimeraService.A.c();
                if (c3 != null) {
                    hashSet.add(c3);
                }
                done doneVar = wearableChimeraService.B;
                HashSet hashSet2 = new HashSet();
                Iterator it2 = doneVar.i.values().iterator();
                while (it2.hasNext()) {
                    Iterator it3 = ((Set) it2.next()).iterator();
                    while (it3.hasNext()) {
                        hashSet2.add(((dncf) it3.next()).b);
                    }
                }
                hashSet.addAll(hashSet2);
                dnii m2 = dnii.m();
                SQLiteDatabase writableDatabase = m2.c.getWritableDatabase();
                HashSet hashSet3 = new HashSet(hashSet);
                Cursor query = writableDatabase.query(true, "dataItemsAndAssets", new String[]{"packageName"}, "deleted=0", null, null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        String string = query.getString(0);
                        atzb.s(string);
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
        ind.b(this, packageBroadcastReceiver, intentFilter2, 2);
        final dnxx f = doov.f();
        dnxx.a = fwbp.c();
        if (f.x) {
            Context context3 = f.c;
            boolean z = Settings.Global.getInt(context3.getApplicationContext().getContentResolver(), "device_supports_ble_mode_key", -1) == 1;
            f.C = z;
            boolean z2 = z & dnxx.a;
            dnxx.a = z2;
            if (!z2) {
                Settings.Global.putInt(context3.getContentResolver(), "wear_connectivity_runtime_type", 0);
            }
        }
        dnrs dnrsVar = f.m;
        boolean z3 = dnxx.a;
        douk.a("BleSupportService", "updateLocalBleSupport: %b", Boolean.valueOf(z3));
        if (z3 || fwbp.a.lK().a()) {
            dnhk dnhkVar = new dnhk(dnrsVar.e.a().a, "/ble_support");
            fgrc v = dogf.a.v();
            if (!v.b.L()) {
                v.U();
            }
            dogf dogfVar = (dogf) v.b;
            dogfVar.b |= 1;
            dogfVar.c = z3;
            dnhkVar.e = ((dogf) v.Q()).r();
            o = dnrsVar.b.o(dnrsVar.c, dnhkVar);
        } else {
            douk.a("BleSupportService", "Not updating BLE support data item", new Object[0]);
            o = eqgf.a;
        }
        emjh.d(o, Level.WARNING, "Failed to update local BLE server capability");
        if (dnxx.a) {
            dnrsVar.d = f;
            dnii dniiVar = dnrsVar.b;
            dniiVar.D(dnrsVar);
            Cursor c3 = dniiVar.c(dnrsVar.c, dnrs.a);
            try {
                c3.moveToFirst();
                while (!c3.isAfterLast()) {
                    dnrsVar.a(dnho.f(c3));
                }
                if (c3 != null) {
                    c3.close();
                }
            } finally {
            }
        }
        if (fwfb.d()) {
            if (!f.x) {
                AtomicReference atomicReference2 = f.q;
                dnkr dnkrVar = f.h;
                dnii dniiVar2 = f.g;
                doal doalVar = new doal(f, dnkrVar, dniiVar2, doov.i());
                dniiVar2.D(doalVar);
                elgo a3 = doalVar.a();
                int i2 = ((elpg) a3).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    dnhn dnhnVar = (dnhn) a3.get(i3);
                    try {
                        byte[] c4 = dnhnVar.b.c();
                        fgri y = fgri.y(dojo.a, c4, 0, c4.length, fgqp.a());
                        fgri.M(y);
                        dojoVar = (dojo) y;
                    } catch (fgsd unused) {
                        douk.f("OffloadSetupClientMgr", "Could not parse existing offload setup request from the data item", new Object[0]);
                    }
                    if (dojoVar.b != 1) {
                        douk.f("OffloadSetupClientMgr", "The proto does not have a setup request message. Data item was %s", dnhnVar);
                        break;
                    }
                    dojj dojjVar = (dojj) dojoVar.c;
                    if (fwfb.a.lK().b()) {
                        dncf dncfVar = dnhnVar.a;
                        String str = dnhnVar.e;
                        eqgc.t(doalVar.b(dojjVar, dncfVar, str), new doak(str), doalVar.a);
                    } else {
                        doalVar.c(dnhnVar.e, dojjVar);
                    }
                }
                atomicReference2.set(doalVar);
            } else if (fwfb.e()) {
                int i4 = iri.a;
            }
        }
        Handler handler = f.i;
        handler.post(new Runnable() { // from class: dnws
            @Override // java.lang.Runnable
            public final void run() {
                dnxx dnxxVar = dnxx.this;
                dnwi.a(dnxxVar.c, dnxxVar.t, dnxxVar.d);
            }
        });
        doma domaVar = f.d;
        if (domaVar.h().isEmpty()) {
            SharedPreferences sharedPreferences = f.e;
            dmmx a4 = dmmy.a();
            a4.a = sharedPreferences.getString("paired_bt_name", null);
            a4.b = sharedPreferences.getString("paired_bt_address", null);
            a4.m(sharedPreferences.getInt("connection_type", 0));
            a4.k(sharedPreferences.getInt("side", 0));
            a4.c(sharedPreferences.getBoolean("connection_desired", false));
            dmmy a5 = a4.a();
            if (a5.d != 0) {
                domaVar.i(a5);
            }
        }
        if (dnxx.a) {
            domaVar.b = f;
        }
        synchronized (f.j) {
            handler.post(new dnxm(f));
            Iterator it = domaVar.h().iterator();
            while (it.hasNext()) {
                f.d((dmmy) it.next());
            }
        }
        ind.b(f.c, f.D, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"), 2);
        int i5 = iri.a;
        f.E.a("Successfully initialized");
        this.c.set(true);
        Log.i("WearableService", "onCreate: Wearable Services started.");
        doos.a(getApplicationContext(), true);
    }

    public final void i(dncf dncfVar, doot dootVar) {
        j(dncfVar, dootVar, false);
    }

    public final void j(dncf dncfVar, doot dootVar, boolean z) {
        elhz elhzVar;
        dncf dncfVar2;
        if (Log.isLoggable("WearableService", 2)) {
            String valueOf = String.valueOf(dncfVar);
            String str = true != z ? " " : " liveListenersOnly ";
            Log.v("WearableService", "queueEventAndNotify: " + valueOf + str + dootVar.toString());
        }
        domq domqVar = this.A;
        if (domqVar.b) {
            if (dootVar.c() && (dncfVar2 = domqVar.e) != null && dncfVar.b.equals("com.google.android.wearable.app") && !dncfVar2.b.equals("com.google.android.wearable.app")) {
                if (Log.isLoggable("WearableService", 3)) {
                    Log.d("WearableService", "Dropping companion event ".concat(dootVar.toString()));
                    return;
                }
                return;
            }
            if (this.A.i(dncfVar)) {
                domq domqVar2 = this.A;
                Uri data = dootVar.h.getData();
                if (domqVar2.i(dncfVar)) {
                    domqVar2.g.incrementAndGet();
                    elhx elhxVar = new elhx();
                    if (data == null || data.equals(dnmh.a) || data.getPathSegments().isEmpty()) {
                        elhxVar.k(domqVar2.c);
                        elhxVar.k(domqVar2.d);
                        elhz g = elhxVar.g();
                        domqVar2.h.addAndGet(g.size());
                        elhzVar = g;
                    } else {
                        elhxVar.k(domqVar2.c);
                        Set set = (Set) domqVar2.f.get(data.getPathSegments().get(0));
                        if (set != null) {
                            elhxVar.k(set);
                        }
                        elhz g2 = elhxVar.g();
                        if (g2.isEmpty()) {
                            domqVar2.i.incrementAndGet();
                            domq.d("No home app found as receiver of the message, URI=".concat(data.toString()));
                        }
                        domqVar2.h.addAndGet(g2.size());
                        elhzVar = g2;
                    }
                } else {
                    elhzVar = elpp.a;
                }
                elsn listIterator = elhzVar.listIterator();
                while (listIterator.hasNext()) {
                    donu c = c((String) listIterator.next());
                    if (c != null) {
                        if (!z) {
                            r5 |= p(c.b, dootVar);
                        }
                        r5 |= o(c.b, dootVar);
                    }
                }
                if (r5) {
                    return;
                }
                Log.w("WearableService", a.R(dncfVar, dootVar, "Failed to deliver message to ", "; "));
                return;
            }
        }
        if (!o(dncfVar, dootVar) && !(z ? false : p(dncfVar, dootVar))) {
            Log.w("WearableService", a.R(dncfVar, dootVar, "Failed to deliver message to ", "; "));
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

    @Override // defpackage.doug
    public final void lv(auti autiVar, boolean z, boolean z2) {
        autiVar.b();
        autiVar.println(a.aa(fwgv.c(), "Wearable service async onCreate enabled: "));
        autiVar.println("Wearable service is running: " + this.c.get());
        this.T.lv(autiVar, z, z2);
        autiVar.a();
        autiVar.println("EventHandler:");
        autiVar.b();
        this.n.dump(autiVar, "");
        autiVar.a();
        autiVar.println("LiveListenerEventHandler:");
        autiVar.b();
        this.o.dump(autiVar, "");
        autiVar.a();
        autiVar.println("OemCompanionVerifier:");
        autiVar.b();
        domr domrVar = this.C;
        autiVar.println(a.aa(fwgn.d(), "OemCompanionVerifier enabled= "));
        autiVar.println("AllowListed Companions: ");
        autiVar.b();
        for (Map.Entry entry : domrVar.a.w()) {
            autiVar.println("package digest: ".concat(String.valueOf((String) entry.getKey())));
            autiVar.println("signature digest: ".concat(String.valueOf((String) entry.getValue())));
        }
        autiVar.a();
        autiVar.println("Installed Oem Companions: ".concat(String.valueOf(String.valueOf(domrVar.c.values()))));
        autiVar.a();
        autiVar.println("MessageReroutingManager:");
        autiVar.b();
        this.A.lv(autiVar, z, z2);
        autiVar.a();
        autiVar.println("Stubs:");
        autiVar.b();
        for (Map.Entry entry2 : this.h.entrySet()) {
            dots dotsVar = (dots) ((WeakReference) entry2.getValue()).get();
            if (dotsVar != null) {
                autiVar.println(entry2.getKey());
                autiVar.b();
                dotsVar.lv(autiVar, z, z2);
                autiVar.a();
            }
        }
        autiVar.a();
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
                    List<ResolveInfo> queryIntentServices2 = getPackageManager().queryIntentServices(new Intent(strArr[i2], dnmh.a), 0);
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
            donu c = c((String) it3.next());
            if (c != null) {
                boolean z = c.e;
                dncf dncfVar = c.b;
                if (z) {
                    if (Log.isLoggable("WearableService", 2)) {
                        Log.v("WearableService", "ignoring stopped listener: ".concat(String.valueOf(douo.a(dncfVar.b))));
                    }
                } else if (q(i, c)) {
                    hashSet.add(dncfVar);
                }
            }
        }
        for (Map.Entry entry : this.h.entrySet()) {
            dots dotsVar = (dots) ((WeakReference) entry.getValue()).get();
            donu c2 = c(((dncf) entry.getKey()).b);
            if (dotsVar != null && c2 != null && q(i, c2)) {
                hashSet.add((dncf) entry.getKey());
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
            return new bzqb(this, 14, elpp.a, 3, new bzqa() { // from class: donk
                @Override // defpackage.bzqa
                public final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
                    WearableChimeraService wearableChimeraService = WearableChimeraService.this;
                    if (wearableChimeraService.l != null) {
                        wearableChimeraService.i.lock();
                        while (!wearableChimeraService.k) {
                            try {
                                Log.d("WearableService", "onGetService: waiting for onCreate to be completed.");
                                long a2 = fwgv.a.lK().a();
                                if (!wearableChimeraService.j.await(a2, TimeUnit.SECONDS)) {
                                    Log.e("WearableService", a.w(a2, "onGetService: Wearable service onCreate timed out after ", " seconds."));
                                    bzozVar.a(8, null);
                                    new caqj(wearableChimeraService.getApplicationContext().getMainLooper()).post(new Runnable() { // from class: dong
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
                                bzozVar.a(8, null);
                                return;
                            } finally {
                                wearableChimeraService.i.unlock();
                            }
                        }
                    }
                    if (!wearableChimeraService.c.get()) {
                        Log.w("WearableService", "onGetService: Wear is not available on this device.");
                        bzozVar.a(16, null);
                        wearableChimeraService.stopSelf();
                        return;
                    }
                    donu c = wearableChimeraService.c(getServiceRequest.f);
                    if (c == null) {
                        bzozVar.a(8, null);
                        return;
                    }
                    ConcurrentHashMap concurrentHashMap = wearableChimeraService.h;
                    dncf dncfVar = c.b;
                    WeakReference weakReference = (WeakReference) concurrentHashMap.get(dncfVar);
                    dots dotsVar = weakReference != null ? (dots) weakReference.get() : null;
                    if (dotsVar == null) {
                        synchronized (dncfVar) {
                            WeakReference weakReference2 = (WeakReference) concurrentHashMap.get(dncfVar);
                            dots dotsVar2 = weakReference2 != null ? (dots) weakReference2.get() : null;
                            if (dotsVar2 == null) {
                                dots d = wearableChimeraService.d(c, dncfVar, weakReference2);
                                concurrentHashMap.put(dncfVar, new WeakReference(d));
                                dotsVar = d;
                            } else {
                                dotsVar = dotsVar2;
                            }
                        }
                    }
                    bzozVar.c(dotsVar);
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
            if (!fwgv.c()) {
                h();
                k();
                return;
            }
            Log.d("WearableService", "Creating wearable service asynchronously.");
            aupq aupqVar = new aupq("WearableChimeraService", 0);
            this.l = aupqVar;
            aupqVar.start();
            aupp auppVar = new aupp(this.l);
            this.m = auppVar;
            auppVar.post(new Runnable() { // from class: donl
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
        dmct dmctVar;
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
            dlwo.a().b = null;
            this.K = null;
            dlwn.a().b = null;
            this.L = null;
            if (this.r != null) {
                dmnb.a().a.remove(this.r);
                this.r = null;
            }
            if (this.J != null) {
                dnde.m().i.remove(this.J);
            }
            this.J = null;
            if (this.q != null) {
                dnkr.l().d(this.q);
            }
            this.q = null;
            dnls c = dnls.c();
            synchronized (c.h) {
                c.k = null;
            }
            this.H = null;
            if (this.p != null) {
                dnii.m().l.remove(this.p);
            }
            this.p = null;
            if (this.I != null) {
                dnii.m().m.remove(this.I);
            }
            this.I = null;
            dmpp dmppVar = this.X;
            if (dmppVar != null) {
                dmppVar.n = null;
                bsup bsupVar = dmppVar.h;
                if (bsupVar != null && (onAccountsUpdateListener = dmppVar.g) != null) {
                    bsupVar.i(onAccountsUpdateListener);
                }
                dmppVar.b.quitSafely();
                dmppVar.h = null;
                dmppVar.g = null;
                TracingBroadcastReceiver tracingBroadcastReceiver = dmppVar.j;
                if (tracingBroadcastReceiver != null) {
                    dmppVar.i.unregisterReceiver(tracingBroadcastReceiver);
                    dmppVar.j = null;
                }
            }
            if (this.n != null) {
                donq donqVar = this.n;
                donqVar.b = true;
                donqVar.removeCallbacksAndMessages(null);
                donqVar.getLooper().quitSafely();
                WearableChimeraService wearableChimeraService = donqVar.c;
                Iterator it = wearableChimeraService.d.values().iterator();
                while (it.hasNext()) {
                    ((donu) it.next()).b(wearableChimeraService);
                }
            }
            this.n = null;
            if (this.o != null) {
                this.o.getLooper().quitSafely();
            }
            this.o = null;
            dnls.c().l = null;
            dnec dnecVar = this.Q;
            if (dnecVar != null) {
                if (!dnecVar.g.getAndSet(false)) {
                    throw new IllegalStateException("Called stop() on stopped channel manager");
                }
                dnecVar.a.post(new dndr(dnecVar));
                dnecVar.b.f();
                dnecVar.f.d(dnecVar.i);
                this.Q.c(dogr.ORIGIN_CHANNEL_API, null);
                this.R.quitSafely();
                this.S.interrupt();
                this.S.quit();
            }
            domo domoVar = this.T;
            if (domoVar != null) {
                domoVar.c.shutdown();
            }
            BroadcastReceiver broadcastReceiver = this.t;
            if (broadcastReceiver != null) {
                unregisterReceiver(broadcastReceiver);
            }
            dooh doohVar = this.M;
            if (doohVar != null && (dmctVar = this.Z) != null) {
                dmctVar.b.remove(doohVar);
            }
            this.Z = null;
            this.M = null;
            aupq aupqVar = this.l;
            if (aupqVar != null) {
                aupqVar.quitSafely();
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

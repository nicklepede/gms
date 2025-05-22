package com.google.android.gms.nearby.discovery.service;

import android.bluetooth.BluetoothDevice;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.IBinder;
import android.os.Looper;
import android.provider.Settings;
import android.text.TextUtils;
import com.google.android.chimera.Service;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.mdd.FileGroupResponse;
import com.google.android.gms.mdd.MddFile;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import defpackage.aupz;
import defpackage.auub;
import defpackage.ceqm;
import defpackage.chen;
import defpackage.chgq;
import defpackage.chjy;
import defpackage.chjz;
import defpackage.chkb;
import defpackage.chke;
import defpackage.cilw;
import defpackage.ciqa;
import defpackage.ciqb;
import defpackage.ciqv;
import defpackage.ciqw;
import defpackage.ciqy;
import defpackage.cisk;
import defpackage.cizc;
import defpackage.cjaw;
import defpackage.cjgu;
import defpackage.cjuh;
import defpackage.cjxu;
import defpackage.ckbg;
import defpackage.ckbh;
import defpackage.ckbi;
import defpackage.ckbj;
import defpackage.ckbk;
import defpackage.ckbl;
import defpackage.ckbm;
import defpackage.ckbn;
import defpackage.ckby;
import defpackage.ckbz;
import defpackage.ckca;
import defpackage.ckcb;
import defpackage.ckci;
import defpackage.ckcy;
import defpackage.ckgp;
import defpackage.ckgw;
import defpackage.cklo;
import defpackage.cklx;
import defpackage.cklz;
import defpackage.ckrp;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dzng;
import defpackage.dzqt;
import defpackage.dzrf;
import defpackage.ekvl;
import defpackage.elgo;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.ezqc;
import defpackage.ezqi;
import defpackage.ezqj;
import defpackage.ezqw;
import defpackage.ezqz;
import defpackage.ezrw;
import defpackage.ezsy;
import defpackage.fayi;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fizb;
import defpackage.ftem;
import defpackage.ftes;
import defpackage.ftey;
import defpackage.ind;
import defpackage.iri;
import defpackage.itk;
import defpackage.itt;
import defpackage.mmt;
import j$.util.Objects;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class DiscoveryChimeraService extends Service implements chjz {
    private static Executor q;
    private ckby A;
    private Executor C;
    private ezrw D;
    public chjy a;
    public ciqv b;
    public ckci c;
    public ezqc d;
    public ezqw e;
    public ckgw f;
    public ciqa g;
    public ciqb h;
    public ckgp i;
    public cisk j;
    public ckcy k;
    public cjxu l;
    public mmt m;
    public ckbz o;
    public ckbz p;
    private cjgu t;
    private final IntentReceiver r = new IntentReceiver();
    private final GuardedIntentReceiver s = new GuardedIntentReceiver();
    public final Executor n = new aupz(1, 10);
    private final eqgo u = new aupz(1, 10);
    private final ezqj v = new ckbj(this);
    private final ezqj w = new ckbk(this);
    private final ezqj x = new ckbl(this);
    private final ezqj y = new ckbm(this);
    private final ezqj z = new ckbn(this);
    private final Object B = new Object();

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class GuardedIntentReceiver extends TracingBroadcastReceiver {
        public GuardedIntentReceiver() {
            super("nearby");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && cisk.c(context, action)) {
                DiscoveryChimeraService discoveryChimeraService = DiscoveryChimeraService.this;
                discoveryChimeraService.d.f(new ckca(this, intent));
                discoveryChimeraService.g();
            }
        }
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class IntentReceiver extends TracingBroadcastReceiver {
        public IntentReceiver() {
            super("nearby");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && cisk.c(context, action)) {
                DiscoveryChimeraService discoveryChimeraService = DiscoveryChimeraService.this;
                discoveryChimeraService.d.f(new ckcb(this, intent));
                discoveryChimeraService.g();
            }
        }
    }

    public static Intent a(Context context) {
        return new Intent().setClassName(context, "com.google.android.gms.nearby.discovery.service.DiscoveryService");
    }

    public static Intent c(Context context, byte[] bArr) {
        return a(context).setAction("com.google.android.gms.nearby.discovery:ACTION_FAST_PAIR_UNPAIR").putExtra("com.google.android.gms.nearby.discovery.ACCOUNT_KEY", bArr);
    }

    private static Executor i() {
        if (q == null) {
            q = new aupz(1, 10);
        }
        return q;
    }

    private final void j() {
        this.d.h(this.v);
        cklo.c(this);
        g();
    }

    private final void k() {
        this.u.execute(new Runnable() { // from class: ckav
            @Override // java.lang.Runnable
            public final void run() {
                DiscoveryChimeraService discoveryChimeraService = DiscoveryChimeraService.this;
                ezqw ezqwVar = discoveryChimeraService.e;
                boolean z = true;
                if (!ezqwVar.b().getBoolean("notification_settings_beacon", true) && !ezqwVar.h()) {
                    z = false;
                }
                discoveryChimeraService.f(z);
            }
        });
    }

    @Override // defpackage.chjz
    public final chjy b() {
        return this.a;
    }

    public final void d(boolean z) {
        ciqv ciqvVar = this.b;
        if (ciqvVar.f != z) {
            ciqvVar.f = z;
            for (ciqw ciqwVar : ciqvVar.l()) {
                if (ciqwVar.g() == fizb.NEARBY_DEVICE) {
                    ciqwVar.y(z);
                }
            }
        }
        this.c.a();
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, final PrintWriter printWriter, String[] strArr) {
        try {
            this.d.d(new ckbi(this, printWriter));
        } catch (InterruptedException e) {
            printWriter.format("Failed to dump: %s\n", e);
        }
        if (auub.c()) {
            cklz cklzVar = (cklz) chjy.c(this, cklz.class);
            HashMap hashMap = cklzVar.a;
            for (Class cls : hashMap.keySet()) {
                cklx cklxVar = (cklx) hashMap.get(cls);
                if (cklxVar == null || ((Boolean) cklxVar.a.a()).booleanValue()) {
                    cklzVar.h(cls, new itk() { // from class: cklr
                        @Override // defpackage.itk
                        public final void a(Object obj) {
                            ((ckly) obj).e(printWriter);
                        }
                    });
                } else {
                    printWriter.println();
                    itt ittVar = cklxVar.d;
                    if (ittVar != null) {
                        printWriter.println(cls.getSimpleName() + ": " + ((String) ittVar.a()));
                    } else {
                        printWriter.println(String.valueOf(cls.getSimpleName()).concat(": Module disable"));
                    }
                }
            }
        }
    }

    public final void e() {
        List list;
        dhlw d = ((ceqm) this.a.b(ceqm.class)).d("nearby-fast-pair-offline-cache");
        try {
            dhmr.o(d, ftes.a.lK().at(), TimeUnit.MILLISECONDS);
            FileGroupResponse fileGroupResponse = (FileGroupResponse) d.i();
            if (fileGroupResponse == null || (list = fileGroupResponse.c) == null || list.isEmpty()) {
                ciqy.a.g().x("FastPairOffline: MDD response is empty");
                return;
            }
            try {
                byte[] bArr = (byte[]) new dzng(Collections.singletonList((dzrf) this.a.b(dzrf.class))).d(Uri.parse(((MddFile) list.get(0)).b), new dzqt());
                fgri y = fgri.y(cjuh.a, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y);
                cjuh cjuhVar = (cjuh) y;
                chkb chkbVar = ciqy.a;
                chkbVar.f().z("FastPairOffline: Number of the response that will be cached: %s", cjuhVar.b.size());
                cizc cizcVar = (cizc) this.a.b(cizc.class);
                Iterator it = cjuhVar.b.iterator();
                while (it.hasNext()) {
                    cizcVar.g((fayi) it.next(), false);
                }
                chkbVar.d().z("FastPair: finished offline cache populate device number in cache: %s", cizcVar.c.e().size());
            } catch (IOException e) {
                ((eluo) ciqy.a.g().s(e)).x("FastPairOffline: Cache does not populate correctly");
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            ((eluo) ciqy.a.g().s(e2)).x("FastPairOffline: mdd task does not finish");
        }
    }

    public final void f(boolean z) {
        if (ezqz.e(this, chen.f(this), chen.e(this, "DiscoveryChimeraService")) && z) {
            this.d.f(this.x);
            g();
        } else {
            cklo.c(this);
            this.d.f(this.w);
            g();
        }
    }

    public final void g() {
        ezqc ezqcVar = this.d;
        ezqj ezqjVar = this.v;
        ezqcVar.h(ezqjVar);
        long r = ftem.a.lK().r();
        ciqy.a.f().A("Shutdown (stopSelf) service in %d ms", r);
        this.d.g(ezqjVar, r);
    }

    public final synchronized void h() {
        ezqc ezqcVar = this.d;
        ekvl.y(ezqcVar);
        if (ezqcVar.i(this.v)) {
            ciqy.a.f().x("DiscoveryService stopSelf is already scheduled. Ignoring this stop.");
            return;
        }
        ckgp ckgpVar = this.i;
        ekvl.y(ckgpVar);
        cklo.c(ckgpVar.d);
        if (ckgpVar.j.g()) {
            ciqy.a.d().x("FastPair: isDestroyable: Scanner is alive.");
        } else if (ckgpVar.h.m()) {
            ciqy.a.d().x("FastPair: isDestroyable: Event stream is still connected.");
        } else {
            int i = ckgpVar.t.get();
            if (i <= 0) {
                cjaw cjawVar = (cjaw) ((cklz) chjy.c(this, cklz.class)).a(cjaw.class);
                if (cjawVar != null && cjawVar.h.b()) {
                    chkb chkbVar = ciqy.a;
                    ((eluo) chkbVar.d().ai(6679)).x("FastPair: ConnectionSwitchManager is not destroyable due to recent manual connect events");
                    chkbVar.d().x("DiscoveryService: Skip stopSelf(), connection switch manager is not destroyable.");
                    return;
                }
                if (auub.c()) {
                }
                ciqy.a.f().x("DiscoveryService shutdown (stopSelf).");
                stopSelf();
                return;
            }
            ciqy.a.d().z("FastPair: isDestroyable: Sdp request (num=%s) is still pending.", i);
        }
        ciqy.a.d().x("DiscoveryService: Skip stopSelf(), fast pair controller is not destroyable.");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        ciqy.a.f().x("DiscoveryService bound.");
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY".equals(intent.getAction())) {
            if (this.o == null) {
                this.o = new ckbz(this, this.d);
            }
            return this.o;
        }
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE".equals(intent.getAction())) {
            if (this.p == null) {
                this.p = new ckbz(this, this.d);
            }
            return this.p;
        }
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICE_DETAILS_SLICE".equals(intent.getAction())) {
            if (this.A == null) {
                this.A = new ckby(this);
            }
        } else {
            if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_FMD_SERVICE".equals(intent.getAction())) {
                if (this.D == null) {
                    this.D = new ezrw(this);
                }
                return this.D;
            }
            if ("com.google.android.gms.nearby.discovery:ACTION_ACCOUNT_SETTING".equals(intent.getAction())) {
                if (this.A == null) {
                    this.A = new ckby(this);
                }
            } else {
                if (!"com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_TRIANGLE_SWITCH".equals(intent.getAction())) {
                    return null;
                }
                if (this.A == null) {
                    this.A = new ckby(this);
                }
            }
        }
        return this.A;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        chkb chkbVar = ciqy.a;
        chkbVar.d().x("DiscoveryService created");
        chjy chjyVar = new chjy(this);
        this.a = chjyVar;
        chjyVar.h(new cilw());
        this.c = (ckci) chjy.c(this, ckci.class);
        this.i = (ckgp) chjy.c(this, ckgp.class);
        this.t = (cjgu) chjy.c(this, cjgu.class);
        this.j = new cisk(this);
        this.k = new ckcy(this);
        this.l = (cjxu) chjy.c(this, cjxu.class);
        this.b = (ciqv) chjy.c(this, ciqv.class);
        this.e = (ezqw) chjy.c(this, ezqw.class);
        this.d = (ezqc) chjy.c(this, ezqc.class);
        this.f = (ckgw) chjy.c(this, ckgw.class);
        this.g = (ciqa) chjy.c(this, ciqa.class);
        this.h = (ciqb) chjy.c(this, ciqb.class);
        this.i.G = this;
        ciqv ciqvVar = this.b;
        ciqb ciqbVar = this.h;
        ciqvVar.j.e = ciqbVar;
        ciqvVar.b.e = ciqbVar;
        elgo v = cisk.b(this).v();
        if (!v.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            int size = v.size();
            for (int i = 0; i < size; i++) {
                intentFilter.addAction((String) v.get(i));
            }
            ind.b(this, this.r, intentFilter, 2);
        }
        elgo v2 = cisk.a(this).v();
        if (!v2.isEmpty()) {
            IntentFilter intentFilter2 = new IntentFilter();
            Iterator it = v2.iterator();
            while (it.hasNext()) {
                intentFilter2.addAction((String) it.next());
            }
            chke.b(this, this.s, intentFilter2);
        }
        ((cklz) chjy.c(this, cklz.class)).f();
        final ckgp ckgpVar = this.i;
        ckgpVar.y.set(false);
        Context context = ckgpVar.d;
        if (chgq.i(context)) {
            cklo.c(context);
            ckgpVar.b.f(new ezqi("FastPairController::InitializeScanner", new Runnable() { // from class: ckdd
                @Override // java.lang.Runnable
                public final void run() {
                    final ckgp ckgpVar2 = ckgp.this;
                    ckgpVar2.v = new ezrb() { // from class: ckdi
                        @Override // defpackage.ezrb
                        public final void iT(ezra ezraVar, String str, cjux cjuxVar) {
                            if (ftes.bb()) {
                                if (ezraVar.equals(ezra.ADDED) || ezraVar.equals(ezra.REMOVED)) {
                                    ckgp.this.j.e(cjxt.FAST_PAIR_ITEM_CHANGE);
                                }
                            }
                        }
                    };
                    ckgpVar2.c.p(ckgpVar2.v);
                    cjxu cjxuVar = ckgpVar2.j;
                    cjxuVar.c().a(new itt() { // from class: ckdk
                        @Override // defpackage.itt
                        public final Object a() {
                            boolean z = true;
                            if (ftes.bb() && ckgp.this.c.m().isEmpty()) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    });
                    ContentResolver contentResolver = ckgpVar2.d.getContentResolver();
                    if (contentResolver == null) {
                        ciqy.a.g().x("FastPairController: skip register ble observer, resolver not found");
                    } else {
                        if (ckgpVar2.w != null) {
                            ciqy.a.g().x("FastPairController: unregister ble observer first, observer not null");
                            ContentObserver contentObserver = ckgpVar2.w;
                            ekvl.y(contentObserver);
                            contentResolver.unregisterContentObserver(contentObserver);
                        }
                        ckgpVar2.w = new ckfo(ckgpVar2, ckgpVar2.b.a());
                        ciqy.a.d().x("FastPairController: register location ble observer");
                        Uri uriFor = Settings.Global.getUriFor("ble_scan_always_enabled");
                        ContentObserver contentObserver2 = ckgpVar2.w;
                        ekvl.y(contentObserver2);
                        contentResolver.registerContentObserver(uriFor, false, contentObserver2);
                    }
                    cjxuVar.e(cjxt.SERVICE_INITIALIZE);
                }
            }));
        }
        ezqc ezqcVar = ckgpVar.b;
        ezqcVar.f(new ezqi("FastPairControllerOnCreate", new Runnable() { // from class: ckde
            @Override // java.lang.Runnable
            public final void run() {
                final ckgp ckgpVar2 = ckgp.this;
                final Context context2 = ckgpVar2.d;
                bjno b = ckgpVar2.b(context2);
                if (b == null) {
                    ciqy.a.d().x("FastPair: Skip backfill FastPairItem, adapter is null");
                } else {
                    int i2 = elgo.d;
                    elgj elgjVar = new elgj();
                    for (BluetoothDevice bluetoothDevice : cirw.a(b)) {
                        if (ckgpVar2.c.d(bluetoothDevice.getAddress()) == null) {
                            elgjVar.i(bluetoothDevice);
                        }
                    }
                    final elgo g = elgjVar.g();
                    new aupz(1, 9).execute(new Runnable() { // from class: ckdc
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = 0;
                            while (true) {
                                elgo elgoVar = g;
                                if (i3 >= ((elpg) elgoVar).c) {
                                    return;
                                }
                                ckgp ckgpVar3 = ckgp.this;
                                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) elgoVar.get(i3);
                                if (ckgpVar3.L(bluetoothDevice2) && ftey.a.lK().ce()) {
                                    ckgpVar3.b.f(new ckfa(ckgpVar3, bluetoothDevice2));
                                }
                                i3++;
                            }
                        }
                    });
                }
                cjzv.d(context2);
                ckgpVar2.o();
                elhz elhzVar = citf.a;
                if (auub.f()) {
                    Set<BluetoothDevice> a = cirw.a(citf.b(context2));
                    if (!a.isEmpty()) {
                        ciqv ciqvVar2 = (ciqv) chjy.c(context2, ciqv.class);
                        final elgt elgtVar = new elgt();
                        for (BluetoothDevice bluetoothDevice2 : a) {
                            cjux d = ciqvVar2.d(bluetoothDevice2.getAddress());
                            if (d != null && (d.c & 1024) != 0) {
                                elgtVar.i(bluetoothDevice2, d);
                            }
                        }
                        citf.m(new Runnable() { // from class: cisp
                            @Override // java.lang.Runnable
                            public final void run() {
                                elhz elhzVar2 = citf.a;
                                elgx b2 = elgtVar.b();
                                elsn listIterator = b2.keySet().listIterator();
                                while (listIterator.hasNext()) {
                                    BluetoothDevice bluetoothDevice3 = (BluetoothDevice) listIterator.next();
                                    cjux cjuxVar = (cjux) b2.get(bluetoothDevice3);
                                    ekvl.y(cjuxVar);
                                    ckam ckamVar = cjuxVar.o;
                                    if (ckamVar == null) {
                                        ckamVar = ckam.a;
                                    }
                                    Context context3 = context2;
                                    ciqy.a.f().P("FastPair: check bluetooth metadata, %s, %s", ezua.b(eztz.MAC, bluetoothDevice3), ezua.b(eztz.MODEL_ID, ckamVar.s));
                                    citf.n(context3, bluetoothDevice3, ckamVar, 5, cjzu.MAIN);
                                    if (ezql.s(bluetoothDevice3)) {
                                        citf.n(context3, bluetoothDevice3, ckamVar, 7, cjzu.LEFT);
                                        citf.n(context3, bluetoothDevice3, ckamVar, 8, cjzu.RIGHT);
                                        citf.n(context3, bluetoothDevice3, ckamVar, 9, cjzu.CASE);
                                    }
                                }
                            }
                        });
                    }
                }
                if (ftey.s()) {
                    final clbo clboVar = new clbo(context2);
                    if (clboVar.d() != 1) {
                        ciqy.a.f().x("FastPair: backfillHasWatchPaired, ignored due to already set");
                    } else {
                        final List m = ckgpVar2.c.m();
                        new aupz(1, 9).execute(new Runnable() { // from class: ckdy
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z;
                                Iterator it2 = m.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    ckam ckamVar = ((cjux) it2.next()).o;
                                    if (ckamVar == null) {
                                        ckamVar = ckam.a;
                                    }
                                    if (ezqm.s(ckamVar)) {
                                        z = true;
                                        break;
                                    }
                                }
                                clboVar.f(z);
                                ciqy.a.d().B("FastPair: backfillHasWatchPaired, set to %b", Boolean.valueOf(z));
                                if (z) {
                                    final ckgp ckgpVar3 = ckgp.this;
                                    new caqj(Looper.getMainLooper()).post(new Runnable() { // from class: ckei
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ((cklz) chjy.c(ckgp.this.d, cklz.class)).f();
                                        }
                                    });
                                }
                            }
                        });
                    }
                } else {
                    ciqy.a.f().x("FastPair: backfillHasWatchPaired, ignored due to flag off");
                }
                if (ckgpVar2.r != null) {
                    ciqy.a.g().x("FastPairController: unregister display observer first, observer not null");
                    ckgq ckgqVar = ckgpVar2.r;
                    ekvl.y(ckgqVar);
                    ckgqVar.b();
                }
                ckgpVar2.r = new ckgq(context2);
                ckgq ckgqVar2 = ckgpVar2.r;
                ckgqVar2.a = new ckfr(ckgpVar2);
                ekvl.y(ckgqVar2);
                ckgqVar2.a();
            }
        }));
        ckgpVar.k.i(ckgpVar.B);
        ((ezsy) chjy.c(context, ezsy.class)).b(ckgpVar);
        if (ftey.ao()) {
            chkbVar.b().x("FastPairController: GellerSyncDeviceChangeListener registers WatchTransferAccountKeyHandler");
            ((ezsy) chjy.c(context, ezsy.class)).b(ckgpVar.m);
        }
        if (Build.VERSION.SDK_INT >= 26 && ftes.bc() && ftes.br()) {
            ((cklz) chjy.c(context, cklz.class)).h(ckrp.class, new itk() { // from class: ckdf
                /* JADX WARN: Type inference failed for: r0v2, types: [ckdz] */
                @Override // defpackage.itk
                public final void a(Object obj) {
                    ckrp ckrpVar = (ckrp) obj;
                    Objects.requireNonNull(ckgp.this.o);
                    ?? r0 = new Object() { // from class: ckdz
                    };
                    ckrpVar.q = r0;
                    ckrpVar.h.g = r0;
                }
            });
        }
        int i2 = iri.a;
        if (ftey.ak()) {
            ezqcVar.f(new ezqi("FastPairController::removeStaleTwsCaseBonds", new Runnable() { // from class: ckdg
                @Override // java.lang.Runnable
                public final void run() {
                    elhz elhzVar = citf.a;
                    ciqy.a.d().x("FastPairManager: Remove stale tws case bonds");
                    Context context2 = ckgp.this.d;
                    cize cizeVar = (cize) chjy.c(context2, cize.class);
                    ciqv ciqvVar2 = (ciqv) chjy.c(context2, ciqv.class);
                    for (cjuo cjuoVar : cizeVar.b.e()) {
                        if (ciqvVar2.e(cjuoVar.c) == null) {
                            citf.o(context2, cizeVar, cjuoVar.c);
                        }
                    }
                }
            }));
        }
        if (ftem.e() == 0) {
            return;
        }
        this.d.g(new ckbg(this), ftem.e());
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        chkb chkbVar = ciqy.a;
        chkbVar.d().x("FastPairHandler: unregistering intent receivers");
        chke.f(this, this.s);
        chke.f(this, this.r);
        ckby ckbyVar = this.A;
        if (ckbyVar != null) {
            ckbyVar.w();
        }
        chkbVar.d().x("DiscoveryService destroyed");
        final ckgp ckgpVar = this.i;
        ckgpVar.y.set(true);
        if (ftey.aw()) {
            cklo.c(ckgpVar.d);
            ckgpVar.b.f(new ezqi("FastPairController::DestroyScanner", new Runnable() { // from class: ckdq
                @Override // java.lang.Runnable
                public final void run() {
                    ckgp ckgpVar2 = ckgp.this;
                    ezrb ezrbVar = ckgpVar2.v;
                    if (ezrbVar != null) {
                        ckgpVar2.c.v(ezrbVar);
                    }
                    ckgpVar2.j.e(cjxt.SERVICE_DESTROY);
                    ContentResolver contentResolver = ckgpVar2.d.getContentResolver();
                    if (ckgpVar2.w == null || contentResolver == null) {
                        return;
                    }
                    ciqy.a.d().x("FastPairController: unregister location ble observer");
                    ContentObserver contentObserver = ckgpVar2.w;
                    ekvl.y(contentObserver);
                    contentResolver.unregisterContentObserver(contentObserver);
                }
            }));
        }
        ezqc ezqcVar = ckgpVar.b;
        ezqcVar.f(new ezqi("FastPairControllerOnDestroy::EventStream", new Runnable() { // from class: ckdr
            @Override // java.lang.Runnable
            public final void run() {
                ckgp.this.X();
            }
        }));
        ezqcVar.f(new ezqi("FastPairControllerOnDestroy", new Runnable() { // from class: ckds
            @Override // java.lang.Runnable
            public final void run() {
                ckgp ckgpVar2 = ckgp.this;
                if (ckgpVar2.r != null) {
                    ciqy.a.d().x("FastPairController: unregister display observer");
                    ckgq ckgqVar = ckgpVar2.r;
                    ekvl.y(ckgqVar);
                    ckgqVar.b();
                }
            }
        }));
        ckgpVar.k.m(ckgpVar.B);
        Context context = ckgpVar.d;
        ((ezsy) chjy.c(context, ezsy.class)).c(ckgpVar);
        if (ftey.ao()) {
            chkbVar.b().x("FastPairController: GellerSyncDeviceChangeListener unregisters watchTransferAccountKeyHandler");
            ((ezsy) chjy.c(context, ezsy.class)).c(ckgpVar.m);
        }
        int i = iri.a;
        ckgpVar.p.shutdownNow();
        try {
            this.d.d(new ckbh(this));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((eluo) ciqy.a.e().s(e)).x("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
            this.a.g();
        }
        this.u.shutdownNow();
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[Catch: all -> 0x0c26, TRY_LEAVE, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:8:0x0039, B:10:0x003f, B:16:0x0057, B:18:0x0068, B:19:0x0072, B:20:0x0082, B:24:0x0263, B:25:0x0266, B:26:0x0c10, B:27:0x0c1b, B:32:0x026a, B:35:0x0272, B:37:0x027a, B:40:0x027e, B:43:0x0283, B:44:0x02a5, B:45:0x02b5, B:46:0x02ba, B:48:0x02c0, B:50:0x02d8, B:51:0x02e5, B:52:0x02f1, B:54:0x02f9, B:57:0x02fe, B:59:0x030a, B:60:0x0317, B:62:0x033d, B:63:0x033f, B:65:0x034e, B:66:0x0350, B:68:0x0354, B:69:0x0356, B:71:0x0369, B:72:0x036c, B:74:0x0380, B:75:0x0383, B:77:0x039f, B:78:0x03a2, B:79:0x03c4, B:80:0x03d1, B:81:0x03d8, B:82:0x03e9, B:83:0x03fa, B:84:0x040b, B:85:0x041c, B:86:0x0438, B:87:0x0454, B:89:0x0466, B:91:0x0474, B:92:0x047d, B:93:0x047b, B:94:0x048a, B:95:0x048f, B:96:0x049e, B:97:0x04a0, B:104:0x04af, B:108:0x04bb, B:109:0x04bc, B:110:0x04c8, B:112:0x04d5, B:114:0x04dd, B:117:0x04e6, B:118:0x0509, B:119:0x0517, B:120:0x0533, B:121:0x0542, B:123:0x054c, B:126:0x0554, B:128:0x0567, B:129:0x0601, B:130:0x0581, B:133:0x05c2, B:134:0x05b9, B:135:0x05dc, B:136:0x0606, B:138:0x0610, B:139:0x0626, B:140:0x061c, B:141:0x062b, B:143:0x0635, B:144:0x064b, B:145:0x0641, B:146:0x0650, B:148:0x0668, B:151:0x0672, B:153:0x067e, B:155:0x068f, B:156:0x093d, B:157:0x069a, B:163:0x06b3, B:165:0x06d8, B:166:0x06e3, B:168:0x06eb, B:169:0x06f0, B:171:0x06f6, B:172:0x0705, B:175:0x071e, B:177:0x073f, B:180:0x08b4, B:183:0x08bf, B:185:0x08c6, B:189:0x08d7, B:197:0x0755, B:199:0x075d, B:200:0x0767, B:203:0x076e, B:205:0x0784, B:207:0x0788, B:208:0x078a, B:210:0x0790, B:212:0x0796, B:214:0x079a, B:215:0x079c, B:217:0x07b5, B:218:0x07b8, B:220:0x07ce, B:221:0x07d1, B:222:0x07e9, B:224:0x07fd, B:225:0x0800, B:227:0x0827, B:228:0x0860, B:230:0x0866, B:232:0x086c, B:233:0x086f, B:235:0x0890, B:236:0x0899, B:237:0x0895, B:238:0x0831, B:240:0x084f, B:241:0x0852, B:243:0x08a3, B:244:0x0915, B:245:0x0920, B:246:0x0933, B:247:0x0942, B:248:0x0979, B:249:0x09b1, B:251:0x09bb, B:252:0x09e4, B:253:0x09e9, B:254:0x0a0a, B:257:0x0a12, B:259:0x0a1a, B:260:0x0a43, B:261:0x0a63, B:262:0x0a71, B:264:0x0a89, B:267:0x0a92, B:268:0x0ac7, B:269:0x0abe, B:271:0x0ace, B:273:0x0ad4, B:274:0x0afd, B:275:0x0b02, B:277:0x0b0f, B:280:0x0b17, B:282:0x0b1f, B:283:0x0b31, B:284:0x0b36, B:286:0x0b43, B:288:0x0b6b, B:289:0x0b49, B:292:0x0b51, B:294:0x0b59, B:295:0x0b70, B:298:0x0bc2, B:299:0x0ba8, B:301:0x0bae, B:302:0x0bb8, B:303:0x0bc6, B:304:0x0bd1, B:305:0x0bd5, B:310:0x0bf0, B:311:0x0bfc, B:313:0x0c08, B:314:0x0087, B:317:0x0092, B:320:0x009e, B:323:0x00aa, B:326:0x00b6, B:329:0x00c2, B:332:0x00ce, B:335:0x00da, B:338:0x00e6, B:341:0x00f1, B:344:0x00fd, B:347:0x0109, B:350:0x0114, B:353:0x0120, B:356:0x012c, B:359:0x0138, B:362:0x0144, B:365:0x014f, B:368:0x015a, B:371:0x0166, B:374:0x0172, B:377:0x017d, B:380:0x0189, B:383:0x0194, B:386:0x01a0, B:389:0x01ac, B:392:0x01b8, B:395:0x01c4, B:398:0x01d0, B:401:0x01dc, B:404:0x01e8, B:407:0x01f4, B:410:0x0200, B:413:0x020a, B:416:0x0215, B:419:0x0220, B:422:0x022b, B:425:0x0235, B:428:0x0240, B:431:0x024b, B:434:0x0255, B:437:0x0053, B:438:0x001c, B:441:0x0023, B:444:0x0033, B:99:0x04a1, B:101:0x04a5, B:102:0x04ac, B:103:0x04ae), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x08b4 A[Catch: all -> 0x0c26, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:8:0x0039, B:10:0x003f, B:16:0x0057, B:18:0x0068, B:19:0x0072, B:20:0x0082, B:24:0x0263, B:25:0x0266, B:26:0x0c10, B:27:0x0c1b, B:32:0x026a, B:35:0x0272, B:37:0x027a, B:40:0x027e, B:43:0x0283, B:44:0x02a5, B:45:0x02b5, B:46:0x02ba, B:48:0x02c0, B:50:0x02d8, B:51:0x02e5, B:52:0x02f1, B:54:0x02f9, B:57:0x02fe, B:59:0x030a, B:60:0x0317, B:62:0x033d, B:63:0x033f, B:65:0x034e, B:66:0x0350, B:68:0x0354, B:69:0x0356, B:71:0x0369, B:72:0x036c, B:74:0x0380, B:75:0x0383, B:77:0x039f, B:78:0x03a2, B:79:0x03c4, B:80:0x03d1, B:81:0x03d8, B:82:0x03e9, B:83:0x03fa, B:84:0x040b, B:85:0x041c, B:86:0x0438, B:87:0x0454, B:89:0x0466, B:91:0x0474, B:92:0x047d, B:93:0x047b, B:94:0x048a, B:95:0x048f, B:96:0x049e, B:97:0x04a0, B:104:0x04af, B:108:0x04bb, B:109:0x04bc, B:110:0x04c8, B:112:0x04d5, B:114:0x04dd, B:117:0x04e6, B:118:0x0509, B:119:0x0517, B:120:0x0533, B:121:0x0542, B:123:0x054c, B:126:0x0554, B:128:0x0567, B:129:0x0601, B:130:0x0581, B:133:0x05c2, B:134:0x05b9, B:135:0x05dc, B:136:0x0606, B:138:0x0610, B:139:0x0626, B:140:0x061c, B:141:0x062b, B:143:0x0635, B:144:0x064b, B:145:0x0641, B:146:0x0650, B:148:0x0668, B:151:0x0672, B:153:0x067e, B:155:0x068f, B:156:0x093d, B:157:0x069a, B:163:0x06b3, B:165:0x06d8, B:166:0x06e3, B:168:0x06eb, B:169:0x06f0, B:171:0x06f6, B:172:0x0705, B:175:0x071e, B:177:0x073f, B:180:0x08b4, B:183:0x08bf, B:185:0x08c6, B:189:0x08d7, B:197:0x0755, B:199:0x075d, B:200:0x0767, B:203:0x076e, B:205:0x0784, B:207:0x0788, B:208:0x078a, B:210:0x0790, B:212:0x0796, B:214:0x079a, B:215:0x079c, B:217:0x07b5, B:218:0x07b8, B:220:0x07ce, B:221:0x07d1, B:222:0x07e9, B:224:0x07fd, B:225:0x0800, B:227:0x0827, B:228:0x0860, B:230:0x0866, B:232:0x086c, B:233:0x086f, B:235:0x0890, B:236:0x0899, B:237:0x0895, B:238:0x0831, B:240:0x084f, B:241:0x0852, B:243:0x08a3, B:244:0x0915, B:245:0x0920, B:246:0x0933, B:247:0x0942, B:248:0x0979, B:249:0x09b1, B:251:0x09bb, B:252:0x09e4, B:253:0x09e9, B:254:0x0a0a, B:257:0x0a12, B:259:0x0a1a, B:260:0x0a43, B:261:0x0a63, B:262:0x0a71, B:264:0x0a89, B:267:0x0a92, B:268:0x0ac7, B:269:0x0abe, B:271:0x0ace, B:273:0x0ad4, B:274:0x0afd, B:275:0x0b02, B:277:0x0b0f, B:280:0x0b17, B:282:0x0b1f, B:283:0x0b31, B:284:0x0b36, B:286:0x0b43, B:288:0x0b6b, B:289:0x0b49, B:292:0x0b51, B:294:0x0b59, B:295:0x0b70, B:298:0x0bc2, B:299:0x0ba8, B:301:0x0bae, B:302:0x0bb8, B:303:0x0bc6, B:304:0x0bd1, B:305:0x0bd5, B:310:0x0bf0, B:311:0x0bfc, B:313:0x0c08, B:314:0x0087, B:317:0x0092, B:320:0x009e, B:323:0x00aa, B:326:0x00b6, B:329:0x00c2, B:332:0x00ce, B:335:0x00da, B:338:0x00e6, B:341:0x00f1, B:344:0x00fd, B:347:0x0109, B:350:0x0114, B:353:0x0120, B:356:0x012c, B:359:0x0138, B:362:0x0144, B:365:0x014f, B:368:0x015a, B:371:0x0166, B:374:0x0172, B:377:0x017d, B:380:0x0189, B:383:0x0194, B:386:0x01a0, B:389:0x01ac, B:392:0x01b8, B:395:0x01c4, B:398:0x01d0, B:401:0x01dc, B:404:0x01e8, B:407:0x01f4, B:410:0x0200, B:413:0x020a, B:416:0x0215, B:419:0x0220, B:422:0x022b, B:425:0x0235, B:428:0x0240, B:431:0x024b, B:434:0x0255, B:437:0x0053, B:438:0x001c, B:441:0x0023, B:444:0x0033, B:99:0x04a1, B:101:0x04a5, B:102:0x04ac, B:103:0x04ae), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x07fd A[Catch: all -> 0x0c26, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:8:0x0039, B:10:0x003f, B:16:0x0057, B:18:0x0068, B:19:0x0072, B:20:0x0082, B:24:0x0263, B:25:0x0266, B:26:0x0c10, B:27:0x0c1b, B:32:0x026a, B:35:0x0272, B:37:0x027a, B:40:0x027e, B:43:0x0283, B:44:0x02a5, B:45:0x02b5, B:46:0x02ba, B:48:0x02c0, B:50:0x02d8, B:51:0x02e5, B:52:0x02f1, B:54:0x02f9, B:57:0x02fe, B:59:0x030a, B:60:0x0317, B:62:0x033d, B:63:0x033f, B:65:0x034e, B:66:0x0350, B:68:0x0354, B:69:0x0356, B:71:0x0369, B:72:0x036c, B:74:0x0380, B:75:0x0383, B:77:0x039f, B:78:0x03a2, B:79:0x03c4, B:80:0x03d1, B:81:0x03d8, B:82:0x03e9, B:83:0x03fa, B:84:0x040b, B:85:0x041c, B:86:0x0438, B:87:0x0454, B:89:0x0466, B:91:0x0474, B:92:0x047d, B:93:0x047b, B:94:0x048a, B:95:0x048f, B:96:0x049e, B:97:0x04a0, B:104:0x04af, B:108:0x04bb, B:109:0x04bc, B:110:0x04c8, B:112:0x04d5, B:114:0x04dd, B:117:0x04e6, B:118:0x0509, B:119:0x0517, B:120:0x0533, B:121:0x0542, B:123:0x054c, B:126:0x0554, B:128:0x0567, B:129:0x0601, B:130:0x0581, B:133:0x05c2, B:134:0x05b9, B:135:0x05dc, B:136:0x0606, B:138:0x0610, B:139:0x0626, B:140:0x061c, B:141:0x062b, B:143:0x0635, B:144:0x064b, B:145:0x0641, B:146:0x0650, B:148:0x0668, B:151:0x0672, B:153:0x067e, B:155:0x068f, B:156:0x093d, B:157:0x069a, B:163:0x06b3, B:165:0x06d8, B:166:0x06e3, B:168:0x06eb, B:169:0x06f0, B:171:0x06f6, B:172:0x0705, B:175:0x071e, B:177:0x073f, B:180:0x08b4, B:183:0x08bf, B:185:0x08c6, B:189:0x08d7, B:197:0x0755, B:199:0x075d, B:200:0x0767, B:203:0x076e, B:205:0x0784, B:207:0x0788, B:208:0x078a, B:210:0x0790, B:212:0x0796, B:214:0x079a, B:215:0x079c, B:217:0x07b5, B:218:0x07b8, B:220:0x07ce, B:221:0x07d1, B:222:0x07e9, B:224:0x07fd, B:225:0x0800, B:227:0x0827, B:228:0x0860, B:230:0x0866, B:232:0x086c, B:233:0x086f, B:235:0x0890, B:236:0x0899, B:237:0x0895, B:238:0x0831, B:240:0x084f, B:241:0x0852, B:243:0x08a3, B:244:0x0915, B:245:0x0920, B:246:0x0933, B:247:0x0942, B:248:0x0979, B:249:0x09b1, B:251:0x09bb, B:252:0x09e4, B:253:0x09e9, B:254:0x0a0a, B:257:0x0a12, B:259:0x0a1a, B:260:0x0a43, B:261:0x0a63, B:262:0x0a71, B:264:0x0a89, B:267:0x0a92, B:268:0x0ac7, B:269:0x0abe, B:271:0x0ace, B:273:0x0ad4, B:274:0x0afd, B:275:0x0b02, B:277:0x0b0f, B:280:0x0b17, B:282:0x0b1f, B:283:0x0b31, B:284:0x0b36, B:286:0x0b43, B:288:0x0b6b, B:289:0x0b49, B:292:0x0b51, B:294:0x0b59, B:295:0x0b70, B:298:0x0bc2, B:299:0x0ba8, B:301:0x0bae, B:302:0x0bb8, B:303:0x0bc6, B:304:0x0bd1, B:305:0x0bd5, B:310:0x0bf0, B:311:0x0bfc, B:313:0x0c08, B:314:0x0087, B:317:0x0092, B:320:0x009e, B:323:0x00aa, B:326:0x00b6, B:329:0x00c2, B:332:0x00ce, B:335:0x00da, B:338:0x00e6, B:341:0x00f1, B:344:0x00fd, B:347:0x0109, B:350:0x0114, B:353:0x0120, B:356:0x012c, B:359:0x0138, B:362:0x0144, B:365:0x014f, B:368:0x015a, B:371:0x0166, B:374:0x0172, B:377:0x017d, B:380:0x0189, B:383:0x0194, B:386:0x01a0, B:389:0x01ac, B:392:0x01b8, B:395:0x01c4, B:398:0x01d0, B:401:0x01dc, B:404:0x01e8, B:407:0x01f4, B:410:0x0200, B:413:0x020a, B:416:0x0215, B:419:0x0220, B:422:0x022b, B:425:0x0235, B:428:0x0240, B:431:0x024b, B:434:0x0255, B:437:0x0053, B:438:0x001c, B:441:0x0023, B:444:0x0033, B:99:0x04a1, B:101:0x04a5, B:102:0x04ac, B:103:0x04ae), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0827 A[Catch: all -> 0x0c26, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:8:0x0039, B:10:0x003f, B:16:0x0057, B:18:0x0068, B:19:0x0072, B:20:0x0082, B:24:0x0263, B:25:0x0266, B:26:0x0c10, B:27:0x0c1b, B:32:0x026a, B:35:0x0272, B:37:0x027a, B:40:0x027e, B:43:0x0283, B:44:0x02a5, B:45:0x02b5, B:46:0x02ba, B:48:0x02c0, B:50:0x02d8, B:51:0x02e5, B:52:0x02f1, B:54:0x02f9, B:57:0x02fe, B:59:0x030a, B:60:0x0317, B:62:0x033d, B:63:0x033f, B:65:0x034e, B:66:0x0350, B:68:0x0354, B:69:0x0356, B:71:0x0369, B:72:0x036c, B:74:0x0380, B:75:0x0383, B:77:0x039f, B:78:0x03a2, B:79:0x03c4, B:80:0x03d1, B:81:0x03d8, B:82:0x03e9, B:83:0x03fa, B:84:0x040b, B:85:0x041c, B:86:0x0438, B:87:0x0454, B:89:0x0466, B:91:0x0474, B:92:0x047d, B:93:0x047b, B:94:0x048a, B:95:0x048f, B:96:0x049e, B:97:0x04a0, B:104:0x04af, B:108:0x04bb, B:109:0x04bc, B:110:0x04c8, B:112:0x04d5, B:114:0x04dd, B:117:0x04e6, B:118:0x0509, B:119:0x0517, B:120:0x0533, B:121:0x0542, B:123:0x054c, B:126:0x0554, B:128:0x0567, B:129:0x0601, B:130:0x0581, B:133:0x05c2, B:134:0x05b9, B:135:0x05dc, B:136:0x0606, B:138:0x0610, B:139:0x0626, B:140:0x061c, B:141:0x062b, B:143:0x0635, B:144:0x064b, B:145:0x0641, B:146:0x0650, B:148:0x0668, B:151:0x0672, B:153:0x067e, B:155:0x068f, B:156:0x093d, B:157:0x069a, B:163:0x06b3, B:165:0x06d8, B:166:0x06e3, B:168:0x06eb, B:169:0x06f0, B:171:0x06f6, B:172:0x0705, B:175:0x071e, B:177:0x073f, B:180:0x08b4, B:183:0x08bf, B:185:0x08c6, B:189:0x08d7, B:197:0x0755, B:199:0x075d, B:200:0x0767, B:203:0x076e, B:205:0x0784, B:207:0x0788, B:208:0x078a, B:210:0x0790, B:212:0x0796, B:214:0x079a, B:215:0x079c, B:217:0x07b5, B:218:0x07b8, B:220:0x07ce, B:221:0x07d1, B:222:0x07e9, B:224:0x07fd, B:225:0x0800, B:227:0x0827, B:228:0x0860, B:230:0x0866, B:232:0x086c, B:233:0x086f, B:235:0x0890, B:236:0x0899, B:237:0x0895, B:238:0x0831, B:240:0x084f, B:241:0x0852, B:243:0x08a3, B:244:0x0915, B:245:0x0920, B:246:0x0933, B:247:0x0942, B:248:0x0979, B:249:0x09b1, B:251:0x09bb, B:252:0x09e4, B:253:0x09e9, B:254:0x0a0a, B:257:0x0a12, B:259:0x0a1a, B:260:0x0a43, B:261:0x0a63, B:262:0x0a71, B:264:0x0a89, B:267:0x0a92, B:268:0x0ac7, B:269:0x0abe, B:271:0x0ace, B:273:0x0ad4, B:274:0x0afd, B:275:0x0b02, B:277:0x0b0f, B:280:0x0b17, B:282:0x0b1f, B:283:0x0b31, B:284:0x0b36, B:286:0x0b43, B:288:0x0b6b, B:289:0x0b49, B:292:0x0b51, B:294:0x0b59, B:295:0x0b70, B:298:0x0bc2, B:299:0x0ba8, B:301:0x0bae, B:302:0x0bb8, B:303:0x0bc6, B:304:0x0bd1, B:305:0x0bd5, B:310:0x0bf0, B:311:0x0bfc, B:313:0x0c08, B:314:0x0087, B:317:0x0092, B:320:0x009e, B:323:0x00aa, B:326:0x00b6, B:329:0x00c2, B:332:0x00ce, B:335:0x00da, B:338:0x00e6, B:341:0x00f1, B:344:0x00fd, B:347:0x0109, B:350:0x0114, B:353:0x0120, B:356:0x012c, B:359:0x0138, B:362:0x0144, B:365:0x014f, B:368:0x015a, B:371:0x0166, B:374:0x0172, B:377:0x017d, B:380:0x0189, B:383:0x0194, B:386:0x01a0, B:389:0x01ac, B:392:0x01b8, B:395:0x01c4, B:398:0x01d0, B:401:0x01dc, B:404:0x01e8, B:407:0x01f4, B:410:0x0200, B:413:0x020a, B:416:0x0215, B:419:0x0220, B:422:0x022b, B:425:0x0235, B:428:0x0240, B:431:0x024b, B:434:0x0255, B:437:0x0053, B:438:0x001c, B:441:0x0023, B:444:0x0033, B:99:0x04a1, B:101:0x04a5, B:102:0x04ac, B:103:0x04ae), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0890 A[Catch: all -> 0x0c26, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:8:0x0039, B:10:0x003f, B:16:0x0057, B:18:0x0068, B:19:0x0072, B:20:0x0082, B:24:0x0263, B:25:0x0266, B:26:0x0c10, B:27:0x0c1b, B:32:0x026a, B:35:0x0272, B:37:0x027a, B:40:0x027e, B:43:0x0283, B:44:0x02a5, B:45:0x02b5, B:46:0x02ba, B:48:0x02c0, B:50:0x02d8, B:51:0x02e5, B:52:0x02f1, B:54:0x02f9, B:57:0x02fe, B:59:0x030a, B:60:0x0317, B:62:0x033d, B:63:0x033f, B:65:0x034e, B:66:0x0350, B:68:0x0354, B:69:0x0356, B:71:0x0369, B:72:0x036c, B:74:0x0380, B:75:0x0383, B:77:0x039f, B:78:0x03a2, B:79:0x03c4, B:80:0x03d1, B:81:0x03d8, B:82:0x03e9, B:83:0x03fa, B:84:0x040b, B:85:0x041c, B:86:0x0438, B:87:0x0454, B:89:0x0466, B:91:0x0474, B:92:0x047d, B:93:0x047b, B:94:0x048a, B:95:0x048f, B:96:0x049e, B:97:0x04a0, B:104:0x04af, B:108:0x04bb, B:109:0x04bc, B:110:0x04c8, B:112:0x04d5, B:114:0x04dd, B:117:0x04e6, B:118:0x0509, B:119:0x0517, B:120:0x0533, B:121:0x0542, B:123:0x054c, B:126:0x0554, B:128:0x0567, B:129:0x0601, B:130:0x0581, B:133:0x05c2, B:134:0x05b9, B:135:0x05dc, B:136:0x0606, B:138:0x0610, B:139:0x0626, B:140:0x061c, B:141:0x062b, B:143:0x0635, B:144:0x064b, B:145:0x0641, B:146:0x0650, B:148:0x0668, B:151:0x0672, B:153:0x067e, B:155:0x068f, B:156:0x093d, B:157:0x069a, B:163:0x06b3, B:165:0x06d8, B:166:0x06e3, B:168:0x06eb, B:169:0x06f0, B:171:0x06f6, B:172:0x0705, B:175:0x071e, B:177:0x073f, B:180:0x08b4, B:183:0x08bf, B:185:0x08c6, B:189:0x08d7, B:197:0x0755, B:199:0x075d, B:200:0x0767, B:203:0x076e, B:205:0x0784, B:207:0x0788, B:208:0x078a, B:210:0x0790, B:212:0x0796, B:214:0x079a, B:215:0x079c, B:217:0x07b5, B:218:0x07b8, B:220:0x07ce, B:221:0x07d1, B:222:0x07e9, B:224:0x07fd, B:225:0x0800, B:227:0x0827, B:228:0x0860, B:230:0x0866, B:232:0x086c, B:233:0x086f, B:235:0x0890, B:236:0x0899, B:237:0x0895, B:238:0x0831, B:240:0x084f, B:241:0x0852, B:243:0x08a3, B:244:0x0915, B:245:0x0920, B:246:0x0933, B:247:0x0942, B:248:0x0979, B:249:0x09b1, B:251:0x09bb, B:252:0x09e4, B:253:0x09e9, B:254:0x0a0a, B:257:0x0a12, B:259:0x0a1a, B:260:0x0a43, B:261:0x0a63, B:262:0x0a71, B:264:0x0a89, B:267:0x0a92, B:268:0x0ac7, B:269:0x0abe, B:271:0x0ace, B:273:0x0ad4, B:274:0x0afd, B:275:0x0b02, B:277:0x0b0f, B:280:0x0b17, B:282:0x0b1f, B:283:0x0b31, B:284:0x0b36, B:286:0x0b43, B:288:0x0b6b, B:289:0x0b49, B:292:0x0b51, B:294:0x0b59, B:295:0x0b70, B:298:0x0bc2, B:299:0x0ba8, B:301:0x0bae, B:302:0x0bb8, B:303:0x0bc6, B:304:0x0bd1, B:305:0x0bd5, B:310:0x0bf0, B:311:0x0bfc, B:313:0x0c08, B:314:0x0087, B:317:0x0092, B:320:0x009e, B:323:0x00aa, B:326:0x00b6, B:329:0x00c2, B:332:0x00ce, B:335:0x00da, B:338:0x00e6, B:341:0x00f1, B:344:0x00fd, B:347:0x0109, B:350:0x0114, B:353:0x0120, B:356:0x012c, B:359:0x0138, B:362:0x0144, B:365:0x014f, B:368:0x015a, B:371:0x0166, B:374:0x0172, B:377:0x017d, B:380:0x0189, B:383:0x0194, B:386:0x01a0, B:389:0x01ac, B:392:0x01b8, B:395:0x01c4, B:398:0x01d0, B:401:0x01dc, B:404:0x01e8, B:407:0x01f4, B:410:0x0200, B:413:0x020a, B:416:0x0215, B:419:0x0220, B:422:0x022b, B:425:0x0235, B:428:0x0240, B:431:0x024b, B:434:0x0255, B:437:0x0053, B:438:0x001c, B:441:0x0023, B:444:0x0033, B:99:0x04a1, B:101:0x04a5, B:102:0x04ac, B:103:0x04ae), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0895 A[Catch: all -> 0x0c26, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:8:0x0039, B:10:0x003f, B:16:0x0057, B:18:0x0068, B:19:0x0072, B:20:0x0082, B:24:0x0263, B:25:0x0266, B:26:0x0c10, B:27:0x0c1b, B:32:0x026a, B:35:0x0272, B:37:0x027a, B:40:0x027e, B:43:0x0283, B:44:0x02a5, B:45:0x02b5, B:46:0x02ba, B:48:0x02c0, B:50:0x02d8, B:51:0x02e5, B:52:0x02f1, B:54:0x02f9, B:57:0x02fe, B:59:0x030a, B:60:0x0317, B:62:0x033d, B:63:0x033f, B:65:0x034e, B:66:0x0350, B:68:0x0354, B:69:0x0356, B:71:0x0369, B:72:0x036c, B:74:0x0380, B:75:0x0383, B:77:0x039f, B:78:0x03a2, B:79:0x03c4, B:80:0x03d1, B:81:0x03d8, B:82:0x03e9, B:83:0x03fa, B:84:0x040b, B:85:0x041c, B:86:0x0438, B:87:0x0454, B:89:0x0466, B:91:0x0474, B:92:0x047d, B:93:0x047b, B:94:0x048a, B:95:0x048f, B:96:0x049e, B:97:0x04a0, B:104:0x04af, B:108:0x04bb, B:109:0x04bc, B:110:0x04c8, B:112:0x04d5, B:114:0x04dd, B:117:0x04e6, B:118:0x0509, B:119:0x0517, B:120:0x0533, B:121:0x0542, B:123:0x054c, B:126:0x0554, B:128:0x0567, B:129:0x0601, B:130:0x0581, B:133:0x05c2, B:134:0x05b9, B:135:0x05dc, B:136:0x0606, B:138:0x0610, B:139:0x0626, B:140:0x061c, B:141:0x062b, B:143:0x0635, B:144:0x064b, B:145:0x0641, B:146:0x0650, B:148:0x0668, B:151:0x0672, B:153:0x067e, B:155:0x068f, B:156:0x093d, B:157:0x069a, B:163:0x06b3, B:165:0x06d8, B:166:0x06e3, B:168:0x06eb, B:169:0x06f0, B:171:0x06f6, B:172:0x0705, B:175:0x071e, B:177:0x073f, B:180:0x08b4, B:183:0x08bf, B:185:0x08c6, B:189:0x08d7, B:197:0x0755, B:199:0x075d, B:200:0x0767, B:203:0x076e, B:205:0x0784, B:207:0x0788, B:208:0x078a, B:210:0x0790, B:212:0x0796, B:214:0x079a, B:215:0x079c, B:217:0x07b5, B:218:0x07b8, B:220:0x07ce, B:221:0x07d1, B:222:0x07e9, B:224:0x07fd, B:225:0x0800, B:227:0x0827, B:228:0x0860, B:230:0x0866, B:232:0x086c, B:233:0x086f, B:235:0x0890, B:236:0x0899, B:237:0x0895, B:238:0x0831, B:240:0x084f, B:241:0x0852, B:243:0x08a3, B:244:0x0915, B:245:0x0920, B:246:0x0933, B:247:0x0942, B:248:0x0979, B:249:0x09b1, B:251:0x09bb, B:252:0x09e4, B:253:0x09e9, B:254:0x0a0a, B:257:0x0a12, B:259:0x0a1a, B:260:0x0a43, B:261:0x0a63, B:262:0x0a71, B:264:0x0a89, B:267:0x0a92, B:268:0x0ac7, B:269:0x0abe, B:271:0x0ace, B:273:0x0ad4, B:274:0x0afd, B:275:0x0b02, B:277:0x0b0f, B:280:0x0b17, B:282:0x0b1f, B:283:0x0b31, B:284:0x0b36, B:286:0x0b43, B:288:0x0b6b, B:289:0x0b49, B:292:0x0b51, B:294:0x0b59, B:295:0x0b70, B:298:0x0bc2, B:299:0x0ba8, B:301:0x0bae, B:302:0x0bb8, B:303:0x0bc6, B:304:0x0bd1, B:305:0x0bd5, B:310:0x0bf0, B:311:0x0bfc, B:313:0x0c08, B:314:0x0087, B:317:0x0092, B:320:0x009e, B:323:0x00aa, B:326:0x00b6, B:329:0x00c2, B:332:0x00ce, B:335:0x00da, B:338:0x00e6, B:341:0x00f1, B:344:0x00fd, B:347:0x0109, B:350:0x0114, B:353:0x0120, B:356:0x012c, B:359:0x0138, B:362:0x0144, B:365:0x014f, B:368:0x015a, B:371:0x0166, B:374:0x0172, B:377:0x017d, B:380:0x0189, B:383:0x0194, B:386:0x01a0, B:389:0x01ac, B:392:0x01b8, B:395:0x01c4, B:398:0x01d0, B:401:0x01dc, B:404:0x01e8, B:407:0x01f4, B:410:0x0200, B:413:0x020a, B:416:0x0215, B:419:0x0220, B:422:0x022b, B:425:0x0235, B:428:0x0240, B:431:0x024b, B:434:0x0255, B:437:0x0053, B:438:0x001c, B:441:0x0023, B:444:0x0033, B:99:0x04a1, B:101:0x04a5, B:102:0x04ac, B:103:0x04ae), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0831 A[Catch: all -> 0x0c26, TryCatch #0 {, blocks: (B:4:0x0003, B:7:0x000d, B:8:0x0039, B:10:0x003f, B:16:0x0057, B:18:0x0068, B:19:0x0072, B:20:0x0082, B:24:0x0263, B:25:0x0266, B:26:0x0c10, B:27:0x0c1b, B:32:0x026a, B:35:0x0272, B:37:0x027a, B:40:0x027e, B:43:0x0283, B:44:0x02a5, B:45:0x02b5, B:46:0x02ba, B:48:0x02c0, B:50:0x02d8, B:51:0x02e5, B:52:0x02f1, B:54:0x02f9, B:57:0x02fe, B:59:0x030a, B:60:0x0317, B:62:0x033d, B:63:0x033f, B:65:0x034e, B:66:0x0350, B:68:0x0354, B:69:0x0356, B:71:0x0369, B:72:0x036c, B:74:0x0380, B:75:0x0383, B:77:0x039f, B:78:0x03a2, B:79:0x03c4, B:80:0x03d1, B:81:0x03d8, B:82:0x03e9, B:83:0x03fa, B:84:0x040b, B:85:0x041c, B:86:0x0438, B:87:0x0454, B:89:0x0466, B:91:0x0474, B:92:0x047d, B:93:0x047b, B:94:0x048a, B:95:0x048f, B:96:0x049e, B:97:0x04a0, B:104:0x04af, B:108:0x04bb, B:109:0x04bc, B:110:0x04c8, B:112:0x04d5, B:114:0x04dd, B:117:0x04e6, B:118:0x0509, B:119:0x0517, B:120:0x0533, B:121:0x0542, B:123:0x054c, B:126:0x0554, B:128:0x0567, B:129:0x0601, B:130:0x0581, B:133:0x05c2, B:134:0x05b9, B:135:0x05dc, B:136:0x0606, B:138:0x0610, B:139:0x0626, B:140:0x061c, B:141:0x062b, B:143:0x0635, B:144:0x064b, B:145:0x0641, B:146:0x0650, B:148:0x0668, B:151:0x0672, B:153:0x067e, B:155:0x068f, B:156:0x093d, B:157:0x069a, B:163:0x06b3, B:165:0x06d8, B:166:0x06e3, B:168:0x06eb, B:169:0x06f0, B:171:0x06f6, B:172:0x0705, B:175:0x071e, B:177:0x073f, B:180:0x08b4, B:183:0x08bf, B:185:0x08c6, B:189:0x08d7, B:197:0x0755, B:199:0x075d, B:200:0x0767, B:203:0x076e, B:205:0x0784, B:207:0x0788, B:208:0x078a, B:210:0x0790, B:212:0x0796, B:214:0x079a, B:215:0x079c, B:217:0x07b5, B:218:0x07b8, B:220:0x07ce, B:221:0x07d1, B:222:0x07e9, B:224:0x07fd, B:225:0x0800, B:227:0x0827, B:228:0x0860, B:230:0x0866, B:232:0x086c, B:233:0x086f, B:235:0x0890, B:236:0x0899, B:237:0x0895, B:238:0x0831, B:240:0x084f, B:241:0x0852, B:243:0x08a3, B:244:0x0915, B:245:0x0920, B:246:0x0933, B:247:0x0942, B:248:0x0979, B:249:0x09b1, B:251:0x09bb, B:252:0x09e4, B:253:0x09e9, B:254:0x0a0a, B:257:0x0a12, B:259:0x0a1a, B:260:0x0a43, B:261:0x0a63, B:262:0x0a71, B:264:0x0a89, B:267:0x0a92, B:268:0x0ac7, B:269:0x0abe, B:271:0x0ace, B:273:0x0ad4, B:274:0x0afd, B:275:0x0b02, B:277:0x0b0f, B:280:0x0b17, B:282:0x0b1f, B:283:0x0b31, B:284:0x0b36, B:286:0x0b43, B:288:0x0b6b, B:289:0x0b49, B:292:0x0b51, B:294:0x0b59, B:295:0x0b70, B:298:0x0bc2, B:299:0x0ba8, B:301:0x0bae, B:302:0x0bb8, B:303:0x0bc6, B:304:0x0bd1, B:305:0x0bd5, B:310:0x0bf0, B:311:0x0bfc, B:313:0x0c08, B:314:0x0087, B:317:0x0092, B:320:0x009e, B:323:0x00aa, B:326:0x00b6, B:329:0x00c2, B:332:0x00ce, B:335:0x00da, B:338:0x00e6, B:341:0x00f1, B:344:0x00fd, B:347:0x0109, B:350:0x0114, B:353:0x0120, B:356:0x012c, B:359:0x0138, B:362:0x0144, B:365:0x014f, B:368:0x015a, B:371:0x0166, B:374:0x0172, B:377:0x017d, B:380:0x0189, B:383:0x0194, B:386:0x01a0, B:389:0x01ac, B:392:0x01b8, B:395:0x01c4, B:398:0x01d0, B:401:0x01dc, B:404:0x01e8, B:407:0x01f4, B:410:0x0200, B:413:0x020a, B:416:0x0215, B:419:0x0220, B:422:0x022b, B:425:0x0235, B:428:0x0240, B:431:0x024b, B:434:0x0255, B:437:0x0053, B:438:0x001c, B:441:0x0023, B:444:0x0033, B:99:0x04a1, B:101:0x04a5, B:102:0x04ac, B:103:0x04ae), top: B:3:0x0003, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0c22 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0c25 A[RETURN] */
    @Override // com.google.android.chimera.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int onStartCommand(android.content.Intent r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 3366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        ckbz ckbzVar;
        ciqy.a.f().x("DiscoveryService unbound.");
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY".equals(intent.getAction())) {
            ckbz ckbzVar2 = this.o;
            if (ckbzVar2 == null || !ckbzVar2.f()) {
                return false;
            }
            this.o.e();
            return false;
        }
        if (!"com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE".equals(intent.getAction()) || (ckbzVar = this.p) == null || !ckbzVar.f()) {
            return false;
        }
        this.p.e();
        return false;
    }
}

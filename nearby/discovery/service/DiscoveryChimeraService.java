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
import defpackage.asmf;
import defpackage.asqh;
import defpackage.cchs;
import defpackage.cexc;
import defpackage.cezf;
import defpackage.cfcm;
import defpackage.cfcn;
import defpackage.cfcp;
import defpackage.cfcs;
import defpackage.cgdt;
import defpackage.cghx;
import defpackage.cghy;
import defpackage.cgis;
import defpackage.cgit;
import defpackage.cgiv;
import defpackage.cgkh;
import defpackage.cgqz;
import defpackage.cgst;
import defpackage.cgyr;
import defpackage.chmg;
import defpackage.chpt;
import defpackage.chtf;
import defpackage.chtg;
import defpackage.chth;
import defpackage.chti;
import defpackage.chtj;
import defpackage.chtk;
import defpackage.chtl;
import defpackage.chtm;
import defpackage.chtx;
import defpackage.chty;
import defpackage.chtz;
import defpackage.chua;
import defpackage.chuh;
import defpackage.chux;
import defpackage.chyk;
import defpackage.chyr;
import defpackage.cidj;
import defpackage.cids;
import defpackage.cidu;
import defpackage.cijk;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.dxbg;
import defpackage.dxet;
import defpackage.dxff;
import defpackage.eiig;
import defpackage.eitj;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.exbt;
import defpackage.exbz;
import defpackage.exca;
import defpackage.excn;
import defpackage.excq;
import defpackage.exdn;
import defpackage.exep;
import defpackage.eyjw;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fgkd;
import defpackage.fqkr;
import defpackage.fqkx;
import defpackage.fqld;
import defpackage.iln;
import defpackage.ips;
import defpackage.iru;
import defpackage.isd;
import defpackage.kty;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class DiscoveryChimeraService extends Service implements cfcn {
    private static Executor q;
    private chtx A;
    private Executor C;
    private exdn D;
    public cfcm a;
    public cgis b;
    public chuh c;
    public exbt d;
    public excn e;
    public chyr f;
    public cghx g;
    public cghy h;
    public chyk i;
    public cgkh j;
    public chux k;
    public chpt l;
    public kty m;
    public chty o;
    public chty p;
    private cgyr t;
    private final IntentReceiver r = new IntentReceiver();
    private final GuardedIntentReceiver s = new GuardedIntentReceiver();
    public final Executor n = new asmf(1, 10);
    private final ensv u = new asmf(1, 10);
    private final exca v = new chti(this);
    private final exca w = new chtj(this);
    private final exca x = new chtk(this);
    private final exca y = new chtl(this);
    private final exca z = new chtm(this);
    private final Object B = new Object();

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class GuardedIntentReceiver extends TracingBroadcastReceiver {
        public GuardedIntentReceiver() {
            super("nearby");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && cgkh.c(context, action)) {
                DiscoveryChimeraService discoveryChimeraService = DiscoveryChimeraService.this;
                discoveryChimeraService.d.f(new chtz(this, intent));
                discoveryChimeraService.g();
            }
        }
    }

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class IntentReceiver extends TracingBroadcastReceiver {
        public IntentReceiver() {
            super("nearby");
        }

        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action) && cgkh.c(context, action)) {
                DiscoveryChimeraService discoveryChimeraService = DiscoveryChimeraService.this;
                discoveryChimeraService.d.f(new chua(this, intent));
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
            q = new asmf(1, 10);
        }
        return q;
    }

    private final void j() {
        this.d.h(this.v);
        cidj.c(this);
        g();
    }

    private final void k() {
        this.u.execute(new Runnable() { // from class: chsu
            @Override // java.lang.Runnable
            public final void run() {
                DiscoveryChimeraService discoveryChimeraService = DiscoveryChimeraService.this;
                excn excnVar = discoveryChimeraService.e;
                boolean z = true;
                if (!excnVar.b().getBoolean("notification_settings_beacon", true) && !excnVar.h()) {
                    z = false;
                }
                discoveryChimeraService.f(z);
            }
        });
    }

    @Override // defpackage.cfcn
    public final cfcm b() {
        return this.a;
    }

    public final void d(boolean z) {
        cgis cgisVar = this.b;
        if (cgisVar.f != z) {
            cgisVar.f = z;
            for (cgit cgitVar : cgisVar.l()) {
                if (cgitVar.g() == fgkd.NEARBY_DEVICE) {
                    cgitVar.y(z);
                }
            }
        }
        this.c.a();
    }

    @Override // com.google.android.chimera.Service
    protected final void dump(FileDescriptor fileDescriptor, final PrintWriter printWriter, String[] strArr) {
        try {
            this.d.d(new chth(this, printWriter));
        } catch (InterruptedException e) {
            printWriter.format("Failed to dump: %s\n", e);
        }
        if (asqh.c()) {
            cidu ciduVar = (cidu) cfcm.c(this, cidu.class);
            HashMap hashMap = ciduVar.a;
            for (Class cls : hashMap.keySet()) {
                cids cidsVar = (cids) hashMap.get(cls);
                if (cidsVar == null || ((Boolean) cidsVar.a.a()).booleanValue()) {
                    ciduVar.h(cls, new iru() { // from class: cidm
                        @Override // defpackage.iru
                        public final void a(Object obj) {
                            ((cidt) obj).e(printWriter);
                        }
                    });
                } else {
                    printWriter.println();
                    isd isdVar = cidsVar.d;
                    if (isdVar != null) {
                        printWriter.println(cls.getSimpleName() + ": " + ((String) isdVar.a()));
                    } else {
                        printWriter.println(String.valueOf(cls.getSimpleName()).concat(": Module disable"));
                    }
                }
            }
        }
    }

    public final void e() {
        List list;
        dfaq d = ((cchs) this.a.b(cchs.class)).d("nearby-fast-pair-offline-cache");
        try {
            dfbl.o(d, fqkx.a.a().at(), TimeUnit.MILLISECONDS);
            FileGroupResponse fileGroupResponse = (FileGroupResponse) d.i();
            if (fileGroupResponse == null || (list = fileGroupResponse.c) == null || list.isEmpty()) {
                cgiv.a.g().x("FastPairOffline: MDD response is empty");
                return;
            }
            try {
                byte[] bArr = (byte[]) new dxbg(Collections.singletonList((dxff) this.a.b(dxff.class))).d(Uri.parse(((MddFile) list.get(0)).b), new dxet());
                fecp y = fecp.y(chmg.a, bArr, 0, bArr.length, febw.a());
                fecp.M(y);
                chmg chmgVar = (chmg) y;
                cgiv.a.f().z("FastPairOffline: Number of the response that will be cached: %s", chmgVar.b.size());
                cgqz cgqzVar = (cgqz) this.a.b(cgqz.class);
                Iterator it = chmgVar.b.iterator();
                while (it.hasNext()) {
                    cgqzVar.g((eyjw) it.next(), false);
                }
                cgiv.a.d().z("FastPair: finished offline cache populate device number in cache: %s", cgqzVar.c.e().size());
            } catch (IOException e) {
                ((ejhf) cgiv.a.g().s(e)).x("FastPairOffline: Cache does not populate correctly");
            }
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            ((ejhf) cgiv.a.g().s(e2)).x("FastPairOffline: mdd task does not finish");
        }
    }

    public final void f(boolean z) {
        if (excq.e(this, cexc.e(this), cexc.d(this, "DiscoveryChimeraService")) && z) {
            this.d.f(this.x);
            g();
        } else {
            cidj.c(this);
            this.d.f(this.w);
            g();
        }
    }

    public final void g() {
        exbt exbtVar = this.d;
        exca excaVar = this.v;
        exbtVar.h(excaVar);
        long r = fqkr.a.a().r();
        cgiv.a.f().A("Shutdown (stopSelf) service in %d ms", r);
        this.d.g(excaVar, r);
    }

    public final synchronized void h() {
        exbt exbtVar = this.d;
        eiig.x(exbtVar);
        if (exbtVar.i(this.v)) {
            cgiv.a.f().x("DiscoveryService stopSelf is already scheduled. Ignoring this stop.");
            return;
        }
        chyk chykVar = this.i;
        eiig.x(chykVar);
        cidj.c(chykVar.d);
        if (chykVar.j.g()) {
            cgiv.a.d().x("FastPair: isDestroyable: Scanner is alive.");
        } else if (chykVar.h.m()) {
            cgiv.a.d().x("FastPair: isDestroyable: Event stream is still connected.");
        } else {
            int i = chykVar.t.get();
            if (i <= 0) {
                cgst cgstVar = (cgst) ((cidu) cfcm.c(this, cidu.class)).a(cgst.class);
                if (cgstVar != null && cgstVar.h.b()) {
                    cfcp cfcpVar = cgiv.a;
                    ((ejhf) cfcpVar.d().ah(6731)).x("FastPair: ConnectionSwitchManager is not destroyable due to recent manual connect events");
                    cfcpVar.d().x("DiscoveryService: Skip stopSelf(), connection switch manager is not destroyable.");
                    return;
                }
                if (asqh.c()) {
                }
                cgiv.a.f().x("DiscoveryService shutdown (stopSelf).");
                stopSelf();
                return;
            }
            cgiv.a.d().z("FastPair: isDestroyable: Sdp request (num=%s) is still pending.", i);
        }
        cgiv.a.d().x("DiscoveryService: Skip stopSelf(), fast pair controller is not destroyable.");
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        cgiv.a.f().x("DiscoveryService bound.");
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY".equals(intent.getAction())) {
            if (this.o == null) {
                this.o = new chty(this, this.d);
            }
            return this.o;
        }
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE".equals(intent.getAction())) {
            if (this.p == null) {
                this.p = new chty(this, this.d);
            }
            return this.p;
        }
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICE_DETAILS_SLICE".equals(intent.getAction())) {
            if (this.A == null) {
                this.A = new chtx(this);
            }
        } else {
            if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_FMD_SERVICE".equals(intent.getAction())) {
                if (this.D == null) {
                    this.D = new exdn(this);
                }
                return this.D;
            }
            if ("com.google.android.gms.nearby.discovery:ACTION_ACCOUNT_SETTING".equals(intent.getAction())) {
                if (this.A == null) {
                    this.A = new chtx(this);
                }
            } else {
                if (!"com.google.android.gms.nearby.discovery.fastpair.connectionswitch.ACTION_TRIANGLE_SWITCH".equals(intent.getAction())) {
                    return null;
                }
                if (this.A == null) {
                    this.A = new chtx(this);
                }
            }
        }
        return this.A;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        cgiv.a.d().x("DiscoveryService created");
        cfcm cfcmVar = new cfcm(this);
        this.a = cfcmVar;
        cfcmVar.h(new cgdt());
        this.c = (chuh) cfcm.c(this, chuh.class);
        this.i = (chyk) cfcm.c(this, chyk.class);
        this.t = (cgyr) cfcm.c(this, cgyr.class);
        this.j = new cgkh(this);
        this.k = new chux(this);
        this.l = (chpt) cfcm.c(this, chpt.class);
        this.b = (cgis) cfcm.c(this, cgis.class);
        this.e = (excn) cfcm.c(this, excn.class);
        this.d = (exbt) cfcm.c(this, exbt.class);
        this.f = (chyr) cfcm.c(this, chyr.class);
        this.g = (cghx) cfcm.c(this, cghx.class);
        this.h = (cghy) cfcm.c(this, cghy.class);
        this.i.G = this;
        cgis cgisVar = this.b;
        cghy cghyVar = this.h;
        cgisVar.j.e = cghyVar;
        cgisVar.b.e = cghyVar;
        eitj v = cgkh.b(this).v();
        if (!v.isEmpty()) {
            IntentFilter intentFilter = new IntentFilter();
            int size = v.size();
            for (int i = 0; i < size; i++) {
                intentFilter.addAction((String) v.get(i));
            }
            iln.b(this, this.r, intentFilter, 2);
        }
        eitj v2 = cgkh.a(this).v();
        if (!v2.isEmpty()) {
            IntentFilter intentFilter2 = new IntentFilter();
            Iterator it = v2.iterator();
            while (it.hasNext()) {
                intentFilter2.addAction((String) it.next());
            }
            cfcs.b(this, this.s, intentFilter2);
        }
        ((cidu) cfcm.c(this, cidu.class)).f();
        final chyk chykVar = this.i;
        chykVar.y.set(false);
        Context context = chykVar.d;
        if (cezf.i(context)) {
            cidj.c(context);
            chykVar.b.f(new exbz("FastPairController::InitializeScanner", new Runnable() { // from class: chvb
                @Override // java.lang.Runnable
                public final void run() {
                    final chyk chykVar2 = chyk.this;
                    chykVar2.v = new excs() { // from class: chvg
                        @Override // defpackage.excs
                        public final void iE(excr excrVar, String str, chmw chmwVar) {
                            if (fqkx.bb()) {
                                if (excrVar.equals(excr.ADDED) || excrVar.equals(excr.REMOVED)) {
                                    chyk.this.j.e(chps.FAST_PAIR_ITEM_CHANGE);
                                }
                            }
                        }
                    };
                    chykVar2.c.p(chykVar2.v);
                    chpt chptVar = chykVar2.j;
                    chptVar.c().a(new isd() { // from class: chvh
                        @Override // defpackage.isd
                        public final Object a() {
                            boolean z = true;
                            if (fqkx.bb() && chyk.this.c.m().isEmpty()) {
                                z = false;
                            }
                            return Boolean.valueOf(z);
                        }
                    });
                    ContentResolver contentResolver = chykVar2.d.getContentResolver();
                    if (contentResolver == null) {
                        cgiv.a.g().x("FastPairController: skip register ble observer, resolver not found");
                    } else {
                        if (chykVar2.w != null) {
                            cgiv.a.g().x("FastPairController: unregister ble observer first, observer not null");
                            ContentObserver contentObserver = chykVar2.w;
                            eiig.x(contentObserver);
                            contentResolver.unregisterContentObserver(contentObserver);
                        }
                        chykVar2.w = new chxj(chykVar2, chykVar2.b.a());
                        cgiv.a.d().x("FastPairController: register location ble observer");
                        Uri uriFor = Settings.Global.getUriFor("ble_scan_always_enabled");
                        ContentObserver contentObserver2 = chykVar2.w;
                        eiig.x(contentObserver2);
                        contentResolver.registerContentObserver(uriFor, false, contentObserver2);
                    }
                    chptVar.e(chps.SERVICE_INITIALIZE);
                }
            }));
        }
        exbt exbtVar = chykVar.b;
        exbtVar.f(new exbz("FastPairControllerOnCreate", new Runnable() { // from class: chvc
            @Override // java.lang.Runnable
            public final void run() {
                final chyk chykVar2 = chyk.this;
                final Context context2 = chykVar2.d;
                bhiz b = chykVar2.b(context2);
                if (b == null) {
                    cgiv.a.d().x("FastPair: Skip backfill FastPairItem, adapter is null");
                } else {
                    int i2 = eitj.d;
                    eite eiteVar = new eite();
                    for (BluetoothDevice bluetoothDevice : cgjt.a(b)) {
                        if (chykVar2.c.d(bluetoothDevice.getAddress()) == null) {
                            eiteVar.i(bluetoothDevice);
                        }
                    }
                    final eitj g = eiteVar.g();
                    new asmf(1, 9).execute(new Runnable() { // from class: chva
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i3 = 0;
                            while (true) {
                                eitj eitjVar = g;
                                if (i3 >= ((ejcb) eitjVar).c) {
                                    return;
                                }
                                chyk chykVar3 = chyk.this;
                                BluetoothDevice bluetoothDevice2 = (BluetoothDevice) eitjVar.get(i3);
                                if (chykVar3.H(bluetoothDevice2) && fqld.a.a().cc()) {
                                    chykVar3.b.f(new chwv(chykVar3, bluetoothDevice2));
                                }
                                i3++;
                            }
                        }
                    });
                }
                chru.d(context2);
                chykVar2.l();
                eiuu eiuuVar = cglc.a;
                if (asqh.f()) {
                    Set<BluetoothDevice> a = cgjt.a(cglc.b(context2));
                    if (!a.isEmpty()) {
                        cgis cgisVar2 = (cgis) cfcm.c(context2, cgis.class);
                        final eito eitoVar = new eito();
                        for (BluetoothDevice bluetoothDevice2 : a) {
                            chmw d = cgisVar2.d(bluetoothDevice2.getAddress());
                            if (d != null && (d.c & 1024) != 0) {
                                eitoVar.i(bluetoothDevice2, d);
                            }
                        }
                        cglc.m(new Runnable() { // from class: cgkm
                            @Override // java.lang.Runnable
                            public final void run() {
                                eiuu eiuuVar2 = cglc.a;
                                eits b2 = eitoVar.b();
                                ejfg listIterator = b2.keySet().listIterator();
                                while (listIterator.hasNext()) {
                                    BluetoothDevice bluetoothDevice3 = (BluetoothDevice) listIterator.next();
                                    chmw chmwVar = (chmw) b2.get(bluetoothDevice3);
                                    eiig.x(chmwVar);
                                    chsl chslVar = chmwVar.o;
                                    if (chslVar == null) {
                                        chslVar = chsl.a;
                                    }
                                    Context context3 = context2;
                                    cgiv.a.f().P("FastPair: check bluetooth metadata, %s, %s", exfr.b(exfq.MAC, bluetoothDevice3), exfr.b(exfq.MODEL_ID, chslVar.s));
                                    cglc.n(context3, bluetoothDevice3, chslVar, 5, chrt.MAIN);
                                    if (excc.s(bluetoothDevice3)) {
                                        cglc.n(context3, bluetoothDevice3, chslVar, 7, chrt.LEFT);
                                        cglc.n(context3, bluetoothDevice3, chslVar, 8, chrt.RIGHT);
                                        cglc.n(context3, bluetoothDevice3, chslVar, 9, chrt.CASE);
                                    }
                                }
                            }
                        });
                    }
                }
                if (fqld.r()) {
                    final citj citjVar = new citj(context2);
                    if (citjVar.d() != 1) {
                        cgiv.a.f().x("FastPair: backfillHasWatchPaired, ignored due to already set");
                    } else {
                        final List m = chykVar2.c.m();
                        new asmf(1, 9).execute(new Runnable() { // from class: chvv
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean z;
                                Iterator it2 = m.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    chsl chslVar = ((chmw) it2.next()).o;
                                    if (chslVar == null) {
                                        chslVar = chsl.a;
                                    }
                                    if (excd.s(chslVar)) {
                                        z = true;
                                        break;
                                    }
                                }
                                citjVar.f(z);
                                cgiv.a.d().B("FastPair: backfillHasWatchPaired, set to %b", Boolean.valueOf(z));
                                if (z) {
                                    final chyk chykVar3 = chyk.this;
                                    new byhr(Looper.getMainLooper()).post(new Runnable() { // from class: chwf
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            ((cidu) cfcm.c(chyk.this.d, cidu.class)).f();
                                        }
                                    });
                                }
                            }
                        });
                    }
                } else {
                    cgiv.a.f().x("FastPair: backfillHasWatchPaired, ignored due to flag off");
                }
                if (chykVar2.r != null) {
                    cgiv.a.g().x("FastPairController: unregister display observer first, observer not null");
                    chyl chylVar = chykVar2.r;
                    eiig.x(chylVar);
                    chylVar.b();
                }
                chykVar2.r = new chyl(context2);
                chyl chylVar2 = chykVar2.r;
                chylVar2.a = new chxm(chykVar2);
                eiig.x(chylVar2);
                chylVar2.a();
            }
        }));
        chykVar.k.i(chykVar.B);
        ((exep) cfcm.c(context, exep.class)).b(chykVar);
        if (fqld.an()) {
            cgiv.a.b().x("FastPairController: GellerSyncDeviceChangeListener registers WatchTransferAccountKeyHandler");
            ((exep) cfcm.c(context, exep.class)).b(chykVar.m);
        }
        if (Build.VERSION.SDK_INT >= 26 && fqkx.bc() && fqkx.bs()) {
            ((cidu) cfcm.c(context, cidu.class)).h(cijk.class, new iru() { // from class: chvd
                /* JADX WARN: Type inference failed for: r0v2, types: [chvw] */
                @Override // defpackage.iru
                public final void a(Object obj) {
                    cijk cijkVar = (cijk) obj;
                    Objects.requireNonNull(chyk.this.o);
                    ?? r0 = new Object() { // from class: chvw
                    };
                    cijkVar.q = r0;
                    cijkVar.h.g = r0;
                }
            });
        }
        int i2 = ips.a;
        if (fqld.aj()) {
            exbtVar.f(new exbz("FastPairController::removeStaleTwsCaseBonds", new Runnable() { // from class: chve
                @Override // java.lang.Runnable
                public final void run() {
                    eiuu eiuuVar = cglc.a;
                    cgiv.a.d().x("FastPairManager: Remove stale tws case bonds");
                    Context context2 = chyk.this.d;
                    cgrc cgrcVar = (cgrc) cfcm.c(context2, cgrc.class);
                    cgis cgisVar2 = (cgis) cfcm.c(context2, cgis.class);
                    for (chmn chmnVar : cgrcVar.b.e()) {
                        if (cgisVar2.e(chmnVar.c) == null) {
                            cglc.o(context2, cgrcVar, chmnVar.c);
                        }
                    }
                }
            }));
        }
        if (fqkr.e() == 0) {
            return;
        }
        this.d.g(new chtf(this), fqkr.e());
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        cfcp cfcpVar = cgiv.a;
        cfcpVar.d().x("FastPairHandler: unregistering intent receivers");
        cfcs.f(this, this.s);
        cfcs.f(this, this.r);
        chtx chtxVar = this.A;
        if (chtxVar != null) {
            chtxVar.w();
        }
        cgiv.a.d().x("DiscoveryService destroyed");
        final chyk chykVar = this.i;
        chykVar.y.set(true);
        if (fqld.av()) {
            cidj.c(chykVar.d);
            chykVar.b.f(new exbz("FastPairController::DestroyScanner", new Runnable() { // from class: chvo
                @Override // java.lang.Runnable
                public final void run() {
                    chyk chykVar2 = chyk.this;
                    excs excsVar = chykVar2.v;
                    if (excsVar != null) {
                        chykVar2.c.v(excsVar);
                    }
                    chykVar2.j.e(chps.SERVICE_DESTROY);
                    ContentResolver contentResolver = chykVar2.d.getContentResolver();
                    if (chykVar2.w == null || contentResolver == null) {
                        return;
                    }
                    cgiv.a.d().x("FastPairController: unregister location ble observer");
                    ContentObserver contentObserver = chykVar2.w;
                    eiig.x(contentObserver);
                    contentResolver.unregisterContentObserver(contentObserver);
                }
            }));
        }
        exbt exbtVar = chykVar.b;
        exbtVar.f(new exbz("FastPairControllerOnDestroy::EventStream", new Runnable() { // from class: chvp
            @Override // java.lang.Runnable
            public final void run() {
                chyk.this.R();
            }
        }));
        exbtVar.f(new exbz("FastPairControllerOnDestroy", new Runnable() { // from class: chvq
            @Override // java.lang.Runnable
            public final void run() {
                chyk chykVar2 = chyk.this;
                if (chykVar2.r != null) {
                    cgiv.a.d().x("FastPairController: unregister display observer");
                    chyl chylVar = chykVar2.r;
                    eiig.x(chylVar);
                    chylVar.b();
                }
            }
        }));
        chykVar.k.m(chykVar.B);
        Context context = chykVar.d;
        ((exep) cfcm.c(context, exep.class)).c(chykVar);
        if (fqld.an()) {
            cfcpVar.b().x("FastPairController: GellerSyncDeviceChangeListener unregisters watchTransferAccountKeyHandler");
            ((exep) cfcm.c(context, exep.class)).c(chykVar.m);
        }
        int i = ips.a;
        chykVar.p.shutdownNow();
        try {
            this.d.d(new chtg(this));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            ((ejhf) cgiv.a.e().s(e)).x("Attempted to wait for EventLoop to destroy locator, but was interrupted.");
            this.a.g();
        }
        this.u.shutdownNow();
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003f A[Catch: all -> 0x0968, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x000d, B:8:0x0039, B:10:0x003f, B:16:0x0057, B:18:0x0068, B:19:0x0072, B:20:0x0080, B:23:0x025e, B:24:0x0261, B:25:0x0954, B:26:0x095f, B:31:0x0265, B:34:0x026d, B:36:0x0275, B:39:0x0279, B:42:0x027e, B:43:0x02a0, B:44:0x02b0, B:45:0x02b5, B:47:0x02bb, B:49:0x02d3, B:50:0x02e0, B:51:0x02ec, B:53:0x02f4, B:56:0x02f9, B:58:0x0305, B:59:0x0312, B:61:0x0338, B:62:0x033a, B:64:0x0349, B:65:0x034b, B:67:0x034f, B:68:0x0351, B:70:0x0364, B:71:0x0367, B:73:0x037b, B:74:0x037e, B:76:0x039c, B:77:0x039f, B:78:0x03c1, B:79:0x03ce, B:80:0x03d5, B:81:0x03e6, B:82:0x03f7, B:83:0x0408, B:84:0x0419, B:85:0x0435, B:86:0x0451, B:88:0x0463, B:90:0x0471, B:91:0x047a, B:92:0x0478, B:93:0x0487, B:94:0x048c, B:95:0x049b, B:96:0x049d, B:103:0x04ac, B:107:0x04b8, B:108:0x04b9, B:109:0x04c5, B:111:0x04d2, B:113:0x04da, B:116:0x04e3, B:117:0x0506, B:118:0x0514, B:119:0x0530, B:120:0x053f, B:122:0x054a, B:125:0x0552, B:127:0x0565, B:128:0x05f3, B:129:0x057f, B:132:0x05be, B:133:0x05b5, B:134:0x05d1, B:135:0x05f8, B:137:0x0602, B:138:0x0618, B:139:0x060e, B:140:0x061d, B:142:0x0627, B:143:0x063d, B:144:0x0633, B:145:0x0642, B:147:0x065a, B:150:0x0663, B:151:0x067e, B:152:0x0675, B:153:0x0683, B:154:0x06b9, B:155:0x06f1, B:157:0x06fb, B:158:0x0726, B:159:0x072b, B:160:0x074c, B:163:0x0754, B:165:0x075c, B:166:0x0785, B:167:0x07a5, B:168:0x07b3, B:170:0x07cb, B:173:0x07d4, B:174:0x0809, B:175:0x0800, B:177:0x0810, B:179:0x0816, B:180:0x083f, B:181:0x0844, B:183:0x0851, B:186:0x0859, B:188:0x0861, B:189:0x0873, B:190:0x0878, B:192:0x0885, B:194:0x08ad, B:195:0x088b, B:198:0x0893, B:200:0x089b, B:201:0x08b2, B:204:0x0906, B:205:0x08ea, B:207:0x08f0, B:208:0x08fc, B:209:0x090a, B:210:0x0915, B:211:0x0919, B:216:0x0934, B:217:0x0940, B:219:0x094c, B:220:0x0085, B:223:0x0090, B:226:0x009c, B:229:0x00a8, B:232:0x00b4, B:235:0x00c0, B:238:0x00cc, B:241:0x00d8, B:244:0x00e4, B:247:0x00ef, B:250:0x00fb, B:253:0x0107, B:256:0x0112, B:259:0x011d, B:262:0x0129, B:265:0x0135, B:268:0x0141, B:271:0x014c, B:274:0x0157, B:277:0x0163, B:280:0x016f, B:283:0x017a, B:286:0x0186, B:289:0x0191, B:292:0x019d, B:295:0x01a9, B:298:0x01b5, B:301:0x01c1, B:304:0x01cd, B:307:0x01d9, B:310:0x01e5, B:313:0x01f1, B:316:0x01fd, B:319:0x0207, B:322:0x0212, B:325:0x021d, B:328:0x0228, B:331:0x0232, B:334:0x023d, B:337:0x0248, B:340:0x0252, B:343:0x0053, B:344:0x001c, B:347:0x0023, B:350:0x0033, B:98:0x049e, B:100:0x04a2, B:101:0x04a9, B:102:0x04ab), top: B:3:0x0003, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0966 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0967 A[RETURN] */
    @Override // com.google.android.chimera.Service
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized int onStartCommand(android.content.Intent r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 2664
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService.onStartCommand(android.content.Intent, int, int):int");
    }

    @Override // com.google.android.chimera.Service
    public final boolean onUnbind(Intent intent) {
        chty chtyVar;
        cgiv.a.f().x("DiscoveryService unbound.");
        if ("com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_ACTIVITY".equals(intent.getAction())) {
            chty chtyVar2 = this.o;
            if (chtyVar2 == null || !chtyVar2.f()) {
                return false;
            }
            this.o.e();
            return false;
        }
        if (!"com.google.android.gms.nearby.discovery:ACTION_DEVICES_LIST_SLICE".equals(intent.getAction()) || (chtyVar = this.p) == null || !chtyVar.f()) {
            return false;
        }
        this.p.e();
        return false;
    }
}

package com.google.android.gms.thunderbird;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.thunderbird.EmergencyLocationChimeraService;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import com.google.android.gms.thunderbird.worker.ConfigWorker;
import defpackage.aupv;
import defpackage.auqg;
import defpackage.ausn;
import defpackage.cbhs;
import defpackage.dhbu;
import defpackage.dihm;
import defpackage.dikw;
import defpackage.dilr;
import defpackage.dilv;
import defpackage.dilx;
import defpackage.eluo;
import defpackage.eqgp;
import defpackage.fvik;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class EmergencyLocationChimeraService extends Service {
    public static final Object a = new Object();
    public static dhbu b;
    public dihm c;
    public cbhs d;
    public dilv e;
    public final ArrayList f = new ArrayList(1);
    public int g = 0;
    private dhbu h;

    public static void a() {
        synchronized (a) {
            dhbu dhbuVar = b;
            if (dhbuVar != null) {
                dhbuVar.g();
                if (!b.l()) {
                    b = null;
                }
            } else {
                dilr.a(new IllegalStateException("unbalanced release of start service wakelock"));
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        eqgp auqgVar;
        super.onCreate();
        ausn ausnVar = dikw.a;
        this.h = new dhbu(this, 1, "Thunderbird", "Thunderbird", "com.google.android.gms");
        if (fvik.o()) {
            this.h.b();
            auqgVar = new aupv(1, 9);
        } else {
            auqgVar = new auqg(this.h);
        }
        dihm dihmVar = new dihm(this, auqgVar);
        if (this.c == null) {
            this.c = dihmVar;
        }
        if (fvik.I()) {
            cbhs a2 = cbhs.a(this);
            if (this.d == null) {
                this.d = a2;
            }
        }
        this.e = dilv.a(this);
        if (!fvik.z() || Build.VERSION.SDK_INT < 26) {
            return;
        }
        dilx.b(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.c.a.shutdown();
        if (fvik.o()) {
            this.h.g();
        }
        try {
            this.c.a.awaitTermination(100L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
        this.c.a.shutdownNow();
        ArrayList arrayList = this.f;
        if (!arrayList.isEmpty()) {
            dilr.a(new IllegalStateException("service destroyed with outstanding emergencies"));
            arrayList.clear();
        }
        if (this.h.l()) {
            ((eluo) ((eluo) dikw.a.i()).ai((char) 11244)).x("nonfatal failure: service destroyed with held wakelock");
            do {
                this.h.g();
            } while (this.h.l());
        }
        if (fvik.z() && Build.VERSION.SDK_INT >= 26) {
            dilx.c();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        this.c.a.execute(new Runnable() { // from class: digd
            @Override // java.lang.Runnable
            public final void run() {
                char c;
                dinq dimsVar;
                final EmergencyLocationChimeraService emergencyLocationChimeraService = EmergencyLocationChimeraService.this;
                emergencyLocationChimeraService.g = i2;
                EmergencyInfo emergencyInfo = (EmergencyInfo) atzs.b(intent, "thunderbird.intent.extra.EMERGENCY_INFO", EmergencyInfo.CREATOR);
                if (emergencyInfo == null) {
                    if (emergencyLocationChimeraService.f.isEmpty()) {
                        emergencyLocationChimeraService.stopSelf(emergencyLocationChimeraService.g);
                        return;
                    }
                    return;
                }
                ausn ausnVar = dikw.a;
                ((eluo) ((eluo) ausnVar.h()).ai(11246)).B("associated device states: %s", emergencyInfo.b);
                ArrayList b2 = elkk.b(digs.a().i(emergencyLocationChimeraService, emergencyInfo));
                ((eluo) ((eluo) ausnVar.h()).ai(11247)).P("[%s] matches %s", emergencyInfo.a, b2);
                String n = emergencyInfo.n();
                int hashCode = n.hashCode();
                if (hashCode != 82233) {
                    if (hashCode == 2060894 && n.equals("CALL")) {
                        c = 0;
                    }
                    c = 65535;
                } else {
                    if (n.equals("SMS")) {
                        c = 1;
                    }
                    c = 65535;
                }
                if (c == 0) {
                    dimsVar = new dims(emergencyLocationChimeraService.c, emergencyInfo, b2);
                } else {
                    if (c != 1) {
                        throw new IllegalArgumentException(emergencyInfo.n());
                    }
                    dimsVar = new dinv(emergencyLocationChimeraService.c, emergencyInfo, b2);
                }
                ArrayList arrayList = emergencyLocationChimeraService.f;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    dinq dinqVar = (dinq) arrayList.get(i3);
                    if (dinqVar.jY().d == dimsVar.jY().d) {
                        dinqVar.i(dimsVar);
                    }
                }
                arrayList.add(dimsVar);
                aupk.c(eqdl.f(dimsVar.a(), new ekut() { // from class: digc
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        final EmergencyLocationChimeraService emergencyLocationChimeraService2;
                        dinq dinqVar2 = (dinq) obj;
                        Iterator it = dinqVar2.g.iterator();
                        while (true) {
                            emergencyLocationChimeraService2 = EmergencyLocationChimeraService.this;
                            if (!it.hasNext()) {
                                break;
                            }
                            ConfigWorker configWorker = (ConfigWorker) it.next();
                            ekvl.r(configWorker.o(), "hadWork: configWorker.isComplete() must be true");
                            if (!configWorker.n()) {
                                if (Math.random() < fvik.a.lK().b()) {
                                    fgrc v = eniu.a.v();
                                    boolean z = emergencyLocationChimeraService2.e.a;
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    fgri fgriVar = v.b;
                                    eniu eniuVar = (eniu) fgriVar;
                                    eniuVar.b |= 1;
                                    eniuVar.c = z;
                                    boolean z2 = emergencyLocationChimeraService2.e.b;
                                    if (!fgriVar.L()) {
                                        v.U();
                                    }
                                    fgri fgriVar2 = v.b;
                                    eniu eniuVar2 = (eniu) fgriVar2;
                                    eniuVar2.b |= 2;
                                    eniuVar2.d = z2;
                                    boolean z3 = emergencyLocationChimeraService2.e.c;
                                    if (!fgriVar2.L()) {
                                        v.U();
                                    }
                                    fgri fgriVar3 = v.b;
                                    eniu eniuVar3 = (eniu) fgriVar3;
                                    eniuVar3.b |= 4;
                                    eniuVar3.e = z3;
                                    int i4 = emergencyLocationChimeraService2.e.d;
                                    boolean z4 = i4 == 3 || i4 == 2;
                                    if (!fgriVar3.L()) {
                                        v.U();
                                    }
                                    fgri fgriVar4 = v.b;
                                    eniu eniuVar4 = (eniu) fgriVar4;
                                    eniuVar4.b |= 8;
                                    eniuVar4.f = z4;
                                    int i5 = emergencyLocationChimeraService2.e.d;
                                    boolean z5 = i5 == 3 || i5 == 1;
                                    if (!fgriVar4.L()) {
                                        v.U();
                                    }
                                    fgri fgriVar5 = v.b;
                                    eniu eniuVar5 = (eniu) fgriVar5;
                                    eniuVar5.b |= 16;
                                    eniuVar5.g = z5;
                                    boolean z6 = emergencyLocationChimeraService2.e.e;
                                    if (!fgriVar5.L()) {
                                        v.U();
                                    }
                                    fgri fgriVar6 = v.b;
                                    eniu eniuVar6 = (eniu) fgriVar6;
                                    eniuVar6.b |= 32;
                                    eniuVar6.h = z6;
                                    boolean z7 = emergencyLocationChimeraService2.e.f;
                                    if (!fgriVar6.L()) {
                                        v.U();
                                    }
                                    eniu eniuVar7 = (eniu) v.b;
                                    eniuVar7.b |= 64;
                                    eniuVar7.i = z7;
                                    eniu eniuVar8 = (eniu) v.Q();
                                    fgrc v2 = enil.a.v();
                                    if (!v2.b.L()) {
                                        v2.U();
                                    }
                                    enil enilVar = (enil) v2.b;
                                    eniuVar8.getClass();
                                    enilVar.g = eniuVar8;
                                    enilVar.b |= 8;
                                    dinqVar2.k(v2, new ekvm() { // from class: dinl
                                        @Override // defpackage.ekvm
                                        public final boolean a(Object obj2) {
                                            return !((ConfigWorker) obj2).a.g();
                                        }
                                    });
                                    if (((enil) v2.b).f.size() > 0) {
                                        bylb.v().f((enil) v2.Q());
                                        if (dikw.c(new BooleanSupplier() { // from class: dige
                                            @Override // java.util.function.BooleanSupplier
                                            public final boolean getAsBoolean() {
                                                return dikv.b(EmergencyLocationChimeraService.this.c).a().c;
                                            }
                                        })) {
                                            dikv b3 = dikv.b(emergencyLocationChimeraService2.c);
                                            final enil enilVar2 = (enil) v2.Q();
                                            try {
                                                ((eqcy) b3.h(new ekut() { // from class: dijy
                                                    @Override // defpackage.ekut
                                                    public final Object apply(Object obj2) {
                                                        fgrc fgrcVar = (fgrc) obj2;
                                                        int i6 = dikv.b;
                                                        if (!fgrcVar.b.L()) {
                                                            fgrcVar.U();
                                                        }
                                                        enil enilVar3 = enil.this;
                                                        dijv dijvVar = (dijv) fgrcVar.b;
                                                        dijv dijvVar2 = dijv.a;
                                                        enilVar3.getClass();
                                                        dijvVar.b();
                                                        dijvVar.e.add(enilVar3);
                                                        return fgrcVar;
                                                    }
                                                })).u();
                                            } catch (InterruptedException unused) {
                                                Thread.currentThread().interrupt();
                                            } catch (ExecutionException e) {
                                                ((eluo) ((eluo) dikw.a.j()).s(e)).x("failed to add debug log");
                                            }
                                        }
                                    }
                                    fgrc v3 = enil.a.v();
                                    if (!v3.b.L()) {
                                        v3.U();
                                    }
                                    fgri fgriVar7 = v3.b;
                                    enil enilVar3 = (enil) fgriVar7;
                                    eniuVar8.getClass();
                                    enilVar3.g = eniuVar8;
                                    enilVar3.b |= 8;
                                    if (!fgriVar7.L()) {
                                        v3.U();
                                    }
                                    enil enilVar4 = (enil) v3.b;
                                    enilVar4.b |= 1;
                                    enilVar4.c = true;
                                    dinqVar2.k(v3, new ekvm() { // from class: dind
                                        @Override // defpackage.ekvm
                                        public final boolean a(Object obj2) {
                                            return ((ConfigWorker) obj2).a.g();
                                        }
                                    });
                                    if (((enil) v3.b).f.size() > 0) {
                                        bykx.v().f((enil) v3.Q());
                                        ausn ausnVar2 = dikw.a;
                                    }
                                    if (fvik.I()) {
                                        emergencyLocationChimeraService2.d.c(37);
                                    }
                                    if (fvik.a.lK().ap() && !dikw.e(emergencyLocationChimeraService2)) {
                                        ((eluo) ((eluo) dikw.a.j()).ai((char) 11240)).x("ELS activated with !isVoiceCapable");
                                    }
                                }
                            }
                        }
                        ArrayList arrayList2 = emergencyLocationChimeraService2.f;
                        arrayList2.remove(dinqVar2);
                        if (!arrayList2.isEmpty()) {
                            return null;
                        }
                        emergencyLocationChimeraService2.stopSelf(emergencyLocationChimeraService2.g);
                        return null;
                    }
                }, emergencyLocationChimeraService.c.a));
            }
        });
        if (!intent.getBooleanExtra("thunderbird.intent.extra.IS_WAKEFUL", false)) {
            return 2;
        }
        a();
        return 2;
    }
}

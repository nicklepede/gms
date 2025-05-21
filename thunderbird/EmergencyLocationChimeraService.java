package com.google.android.gms.thunderbird;

import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import com.google.android.chimera.Service;
import com.google.android.gms.thunderbird.EmergencyLocationChimeraService;
import com.google.android.gms.thunderbird.state.EmergencyInfo;
import com.google.android.gms.thunderbird.worker.ConfigWorker;
import defpackage.asmb;
import defpackage.asmm;
import defpackage.asot;
import defpackage.byzb;
import defpackage.deqr;
import defpackage.dfwh;
import defpackage.dfzr;
import defpackage.dgam;
import defpackage.dgaq;
import defpackage.dgas;
import defpackage.ejhf;
import defpackage.ensw;
import defpackage.fsnb;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.function.BooleanSupplier;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class EmergencyLocationChimeraService extends Service {
    public static final Object a = new Object();
    public static deqr b;
    public dfwh c;
    public byzb d;
    public dgaq e;
    public final ArrayList f = new ArrayList(1);
    public int g = 0;
    private deqr h;

    public static void a() {
        synchronized (a) {
            deqr deqrVar = b;
            if (deqrVar != null) {
                deqrVar.g();
                if (!b.l()) {
                    b = null;
                }
            } else {
                dgam.a(new IllegalStateException("unbalanced release of start service wakelock"));
            }
        }
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final void onCreate() {
        ensw asmmVar;
        super.onCreate();
        asot asotVar = dfzr.a;
        this.h = new deqr(this, 1, "Thunderbird", "Thunderbird", "com.google.android.gms");
        if (fsnb.o()) {
            this.h.b();
            asmmVar = new asmb(1, 9);
        } else {
            asmmVar = new asmm(this.h);
        }
        dfwh dfwhVar = new dfwh(this, asmmVar);
        if (this.c == null) {
            this.c = dfwhVar;
        }
        if (fsnb.I()) {
            byzb a2 = byzb.a(this);
            if (this.d == null) {
                this.d = a2;
            }
        }
        this.e = dgaq.a(this);
        if (!fsnb.z() || Build.VERSION.SDK_INT < 26) {
            return;
        }
        dgas.b(this);
    }

    @Override // com.google.android.chimera.Service
    public final void onDestroy() {
        this.c.a.shutdown();
        if (fsnb.o()) {
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
            dgam.a(new IllegalStateException("service destroyed with outstanding emergencies"));
            arrayList.clear();
        }
        if (this.h.l()) {
            ((ejhf) ((ejhf) dfzr.a.i()).ah((char) 11241)).x("nonfatal failure: service destroyed with held wakelock");
            do {
                this.h.g();
            } while (this.h.l());
        }
        if (fsnb.z() && Build.VERSION.SDK_INT >= 26) {
            dgas.c();
        }
        super.onDestroy();
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        this.c.a.execute(new Runnable() { // from class: dfuy
            @Override // java.lang.Runnable
            public final void run() {
                char c;
                dgcl dgbnVar;
                final EmergencyLocationChimeraService emergencyLocationChimeraService = EmergencyLocationChimeraService.this;
                emergencyLocationChimeraService.g = i2;
                EmergencyInfo emergencyInfo = (EmergencyInfo) arxd.b(intent, "thunderbird.intent.extra.EMERGENCY_INFO", EmergencyInfo.CREATOR);
                if (emergencyInfo == null) {
                    if (emergencyLocationChimeraService.f.isEmpty()) {
                        emergencyLocationChimeraService.stopSelf(emergencyLocationChimeraService.g);
                        return;
                    }
                    return;
                }
                ((ejhf) ((ejhf) dfzr.a.h()).ah(11243)).B("associated device states: %s", emergencyInfo.b);
                ArrayList b2 = eixf.b(dfvn.a().i(emergencyLocationChimeraService, emergencyInfo));
                ((ejhf) ((ejhf) dfzr.a.h()).ah(11244)).P("[%s] matches %s", emergencyInfo.a, b2);
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
                    dgbnVar = new dgbn(emergencyLocationChimeraService.c, emergencyInfo, b2);
                } else {
                    if (c != 1) {
                        throw new IllegalArgumentException(emergencyInfo.n());
                    }
                    dgbnVar = new dgcq(emergencyLocationChimeraService.c, emergencyInfo, b2);
                }
                ArrayList arrayList = emergencyLocationChimeraService.f;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    dgcl dgclVar = (dgcl) arrayList.get(i3);
                    if (dgclVar.jI().d == dgbnVar.jI().d) {
                        dgclVar.i(dgbnVar);
                    }
                }
                arrayList.add(dgbnVar);
                aslq.c(enps.f(dgbnVar.a(), new eiho() { // from class: dfux
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        final EmergencyLocationChimeraService emergencyLocationChimeraService2;
                        dgcl dgclVar2 = (dgcl) obj;
                        Iterator it = dgclVar2.g.iterator();
                        while (true) {
                            emergencyLocationChimeraService2 = EmergencyLocationChimeraService.this;
                            if (!it.hasNext()) {
                                break;
                            }
                            ConfigWorker configWorker = (ConfigWorker) it.next();
                            eiig.q(configWorker.o(), "hadWork: configWorker.isComplete() must be true");
                            if (!configWorker.n()) {
                                if (Math.random() < fsnb.a.a().b()) {
                                    fecj v = ekvi.a.v();
                                    boolean z = emergencyLocationChimeraService2.e.a;
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    fecp fecpVar = v.b;
                                    ekvi ekviVar = (ekvi) fecpVar;
                                    ekviVar.b |= 1;
                                    ekviVar.c = z;
                                    boolean z2 = emergencyLocationChimeraService2.e.b;
                                    if (!fecpVar.L()) {
                                        v.U();
                                    }
                                    fecp fecpVar2 = v.b;
                                    ekvi ekviVar2 = (ekvi) fecpVar2;
                                    ekviVar2.b |= 2;
                                    ekviVar2.d = z2;
                                    boolean z3 = emergencyLocationChimeraService2.e.c;
                                    if (!fecpVar2.L()) {
                                        v.U();
                                    }
                                    fecp fecpVar3 = v.b;
                                    ekvi ekviVar3 = (ekvi) fecpVar3;
                                    ekviVar3.b |= 4;
                                    ekviVar3.e = z3;
                                    int i4 = emergencyLocationChimeraService2.e.d;
                                    boolean z4 = i4 == 3 || i4 == 2;
                                    if (!fecpVar3.L()) {
                                        v.U();
                                    }
                                    fecp fecpVar4 = v.b;
                                    ekvi ekviVar4 = (ekvi) fecpVar4;
                                    ekviVar4.b |= 8;
                                    ekviVar4.f = z4;
                                    int i5 = emergencyLocationChimeraService2.e.d;
                                    boolean z5 = i5 == 3 || i5 == 1;
                                    if (!fecpVar4.L()) {
                                        v.U();
                                    }
                                    fecp fecpVar5 = v.b;
                                    ekvi ekviVar5 = (ekvi) fecpVar5;
                                    ekviVar5.b |= 16;
                                    ekviVar5.g = z5;
                                    boolean z6 = emergencyLocationChimeraService2.e.e;
                                    if (!fecpVar5.L()) {
                                        v.U();
                                    }
                                    fecp fecpVar6 = v.b;
                                    ekvi ekviVar6 = (ekvi) fecpVar6;
                                    ekviVar6.b |= 32;
                                    ekviVar6.h = z6;
                                    boolean z7 = emergencyLocationChimeraService2.e.f;
                                    if (!fecpVar6.L()) {
                                        v.U();
                                    }
                                    ekvi ekviVar7 = (ekvi) v.b;
                                    ekviVar7.b |= 64;
                                    ekviVar7.i = z7;
                                    ekvi ekviVar8 = (ekvi) v.Q();
                                    fecj v2 = ekuz.a.v();
                                    if (!v2.b.L()) {
                                        v2.U();
                                    }
                                    ekuz ekuzVar = (ekuz) v2.b;
                                    ekviVar8.getClass();
                                    ekuzVar.g = ekviVar8;
                                    ekuzVar.b |= 8;
                                    dgclVar2.k(v2, new eiih() { // from class: dgcg
                                        @Override // defpackage.eiih
                                        public final boolean a(Object obj2) {
                                            return !((ConfigWorker) obj2).a.g();
                                        }
                                    });
                                    if (((ekuz) v2.b).f.size() > 0) {
                                        bwcp.v().f((ekuz) v2.Q());
                                        if (dfzr.c(new BooleanSupplier() { // from class: dfuz
                                            @Override // java.util.function.BooleanSupplier
                                            public final boolean getAsBoolean() {
                                                return dfzq.b(EmergencyLocationChimeraService.this.c).a().c;
                                            }
                                        })) {
                                            dfzq b3 = dfzq.b(emergencyLocationChimeraService2.c);
                                            final ekuz ekuzVar2 = (ekuz) v2.Q();
                                            try {
                                                ((enpf) b3.h(new eiho() { // from class: dfyt
                                                    @Override // defpackage.eiho
                                                    public final Object apply(Object obj2) {
                                                        fecj fecjVar = (fecj) obj2;
                                                        int i6 = dfzq.b;
                                                        if (!fecjVar.b.L()) {
                                                            fecjVar.U();
                                                        }
                                                        ekuz ekuzVar3 = ekuz.this;
                                                        dfyq dfyqVar = (dfyq) fecjVar.b;
                                                        dfyq dfyqVar2 = dfyq.a;
                                                        ekuzVar3.getClass();
                                                        dfyqVar.b();
                                                        dfyqVar.e.add(ekuzVar3);
                                                        return fecjVar;
                                                    }
                                                })).u();
                                            } catch (InterruptedException unused) {
                                                Thread.currentThread().interrupt();
                                            } catch (ExecutionException e) {
                                                ((ejhf) ((ejhf) dfzr.a.j()).s(e)).x("failed to add debug log");
                                            }
                                        }
                                    }
                                    fecj v3 = ekuz.a.v();
                                    if (!v3.b.L()) {
                                        v3.U();
                                    }
                                    fecp fecpVar7 = v3.b;
                                    ekuz ekuzVar3 = (ekuz) fecpVar7;
                                    ekviVar8.getClass();
                                    ekuzVar3.g = ekviVar8;
                                    ekuzVar3.b |= 8;
                                    if (!fecpVar7.L()) {
                                        v3.U();
                                    }
                                    ekuz ekuzVar4 = (ekuz) v3.b;
                                    ekuzVar4.b |= 1;
                                    ekuzVar4.c = true;
                                    dgclVar2.k(v3, new eiih() { // from class: dgby
                                        @Override // defpackage.eiih
                                        public final boolean a(Object obj2) {
                                            return ((ConfigWorker) obj2).a.g();
                                        }
                                    });
                                    if (((ekuz) v3.b).f.size() > 0) {
                                        bwcl.v().f((ekuz) v3.Q());
                                        asot asotVar = dfzr.a;
                                    }
                                    if (fsnb.I()) {
                                        emergencyLocationChimeraService2.d.c(37);
                                    }
                                    if (fsnb.a.a().ap() && !dfzr.e(emergencyLocationChimeraService2)) {
                                        ((ejhf) ((ejhf) dfzr.a.j()).ah((char) 11237)).x("ELS activated with !isVoiceCapable");
                                    }
                                }
                            }
                        }
                        ArrayList arrayList2 = emergencyLocationChimeraService2.f;
                        arrayList2.remove(dgclVar2);
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

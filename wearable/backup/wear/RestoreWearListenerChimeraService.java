package com.google.android.gms.wearable.backup.wear;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.cast.JGCastService;
import com.google.android.gms.wearable.backup.wear.RestoreWearListenerChimeraService;
import defpackage.ajif;
import defpackage.ajik;
import defpackage.ajjm;
import defpackage.ajql;
import defpackage.akbr;
import defpackage.auad;
import defpackage.aupv;
import defpackage.aupz;
import defpackage.ausb;
import defpackage.bsup;
import defpackage.dhlw;
import defpackage.dhmr;
import defpackage.dlwl;
import defpackage.dlxc;
import defpackage.dmeo;
import defpackage.dmeq;
import defpackage.dmfu;
import defpackage.dmfv;
import defpackage.dmfx;
import defpackage.dmgd;
import defpackage.dmgk;
import defpackage.dmiu;
import defpackage.dmiw;
import defpackage.dmmv;
import defpackage.dodb;
import defpackage.dohy;
import defpackage.doiv;
import defpackage.dojy;
import defpackage.dojz;
import defpackage.dokc;
import defpackage.dokk;
import defpackage.dqml;
import defpackage.ekut;
import defpackage.emuw;
import defpackage.emux;
import defpackage.emxa;
import defpackage.emxb;
import defpackage.eqcq;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqgb;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.function.Predicate$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.io.IOException;
import java.util.concurrent.Callable;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class RestoreWearListenerChimeraService extends dmmv {
    public static final auad a = new dlxc("RestoreWearWLS");
    dmfu b;
    dmeo c;

    private final dmfu e() {
        if (this.b == null) {
            Context applicationContext = getApplicationContext();
            dmeq dmeqVar = new dmeq(applicationContext, bsup.b(applicationContext), akbr.a(applicationContext));
            ajif ajifVar = new ajif(applicationContext);
            dmiw dmiwVar = new dmiw(applicationContext);
            dmgk dmgkVar = new dmgk(new ajql(applicationContext));
            dodb dodbVar = new dodb(applicationContext, "wear-restore", new aupv(1, 9));
            auad auadVar = dmiu.a;
            new aupz(1, 9);
            this.b = new dmfu(applicationContext, dmeqVar, ajifVar, dmiwVar, dmgkVar, dodbVar, new dmgd(dlwl.e(applicationContext), new aupv(2, 9)), new aupz(3, 9), new aupv(2, 9), dmeo.a(applicationContext));
        }
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dmmv, defpackage.dlwc
    public final dhlw k(final String str, String str2, byte[] bArr) {
        char c;
        boolean z;
        dokc dokcVar;
        auad auadVar = a;
        auadVar.j("onRequest: nodeId=%s path=%s request=%s", str, str2, bArr);
        switch (str2.hashCode()) {
            case -1941351836:
                if (str2.equals("/restore/get_devices")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1143867298:
                if (str2.equals("/restore/skip_restore")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -935903174:
                if (str2.equals("/restore/restore_ongoing")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -609354046:
                if (str2.equals("/restore/start_key_recovery")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1354843425:
                if (str2.equals("/restore/start_restore")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            try {
                fgri y = fgri.y(dohy.a, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y);
                final dohy dohyVar = (dohy) y;
                final dmfu e = e();
                final String str3 = dohyVar.c;
                eqgb h = eqgb.h(e.g.submit(new Callable() { // from class: dmfa
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        dmeq dmeqVar = dmfu.this.c;
                        Context context = dmeqVar.b;
                        String str4 = str3;
                        Optional a2 = dmfx.a(context, str4);
                        if (a2.isEmpty()) {
                            dmeq.a.m("Invalid account:".concat(String.valueOf(auad.q(str4))), new Object[0]);
                            int i = elgo.d;
                            return elpg.a;
                        }
                        Optional a3 = dmeqVar.a((Account) a2.get());
                        if (a3.isEmpty()) {
                            dmeq.a.m("Can't fetch devices: no valid auth token.", new Object[0]);
                            int i2 = elgo.d;
                            return elpg.a;
                        }
                        dmeq.a.j("Fetching devices for account: ".concat(String.valueOf(auad.q(str4))), new Object[0]);
                        Account account = (Account) a2.get();
                        String str5 = (String) a3.get();
                        fgrc a4 = akbv.a(aura.f(context));
                        if (!a4.b.L()) {
                            a4.U();
                        }
                        ajjf ajjfVar = (ajjf) a4.b;
                        ajjf ajjfVar2 = ajjf.a;
                        str5.getClass();
                        ajjfVar.b |= 16;
                        ajjfVar.f = str5;
                        ajjb ajjbVar = ((ajjf) a4.b).m;
                        if (ajjbVar == null) {
                            ajjbVar = ajjb.a;
                        }
                        fgrc fgrcVar = (fgrc) ajjbVar.iQ(5, null);
                        fgrcVar.X(ajjbVar);
                        if (!fgrcVar.b.L()) {
                            fgrcVar.U();
                        }
                        ajjb ajjbVar2 = (ajjb) fgrcVar.b;
                        ajjbVar2.b |= 32;
                        ajjbVar2.e = false;
                        if (!a4.b.L()) {
                            a4.U();
                        }
                        ajjf ajjfVar3 = (ajjf) a4.b;
                        ajjb ajjbVar3 = (ajjb) fgrcVar.Q();
                        ajjbVar3.getClass();
                        ajjfVar3.m = ajjbVar3;
                        ajjfVar3.b |= 4096;
                        try {
                            ajjp c2 = dmeqVar.c.c(account, a4);
                            akbt.b(c2);
                            Stream filter = Collection.EL.stream(c2.g).filter(new Predicate() { // from class: dmep
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo478negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                @Override // java.util.function.Predicate
                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    ajjm ajjmVar = (ajjm) obj;
                                    auad auadVar2 = dmeq.a;
                                    int a5 = ajjl.a(ajjmVar.j);
                                    if (a5 == 0 || a5 != 2) {
                                        ajik ajikVar = ajjmVar.i;
                                        if (ajikVar == null) {
                                            ajikVar = ajik.a;
                                        }
                                        int i3 = ajikVar.b;
                                        if ((i3 & 16) != 0 && (i3 & 1) != 0) {
                                            ajil ajilVar = ajikVar.c;
                                            if (ajilVar == null) {
                                                ajilVar = ajil.a;
                                            }
                                            if ((ajilVar.b & 4) != 0) {
                                                int i4 = ajikVar.e;
                                                ajil ajilVar2 = ajikVar.c;
                                                if (ajilVar2 == null) {
                                                    ajilVar2 = ajil.a;
                                                }
                                                if (i4 >= ajilVar2.c) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            });
                            int i3 = elgo.d;
                            return (elgo) filter.collect(elcq.a);
                        } catch (akdy | IOException | wjw e2) {
                            dmeq.a.n("Failed to fetch devices.", e2, new Object[0]);
                            int i4 = elgo.d;
                            return elpg.a;
                        }
                    }
                }));
                ekut ekutVar = new ekut() { // from class: dmge
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        elgo elgoVar = (elgo) obj;
                        RestoreWearListenerChimeraService.a.j("get_devices response: %s", (String) Collection.EL.stream(elgoVar).map(new Function() { // from class: dmgg
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo479andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((ajjm) obj2).e;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.joining(", ")));
                        fgrc v = doib.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        doib doibVar = (doib) v.b;
                        fgsa fgsaVar = doibVar.c;
                        if (!fgsaVar.c()) {
                            doibVar.c = fgri.E(fgsaVar);
                        }
                        fgou.E(elgoVar, doibVar.c);
                        return ((doib) v.Q()).r();
                    }
                };
                eqex eqexVar = eqex.a;
                return dqml.a(eqcq.g(eqdl.f(h, ekutVar, eqexVar), Throwable.class, new eqdv() { // from class: dmgf
                    @Override // defpackage.eqdv
                    public final eqgl a(Object obj) {
                        Throwable th = (Throwable) obj;
                        RestoreWearListenerChimeraService.a.n("Failed to complete get_devices", th, new Object[0]);
                        if (!dohy.this.d) {
                            return eqgc.h(th);
                        }
                        fgrc v = doib.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        doib doibVar = (doib) v.b;
                        doibVar.d = 1;
                        doibVar.b = 1 | doibVar.b;
                        return eqgc.i(((doib) v.Q()).r());
                    }
                }, eqexVar));
            } catch (fgsd e2) {
                a.n("Malformed GetDevicesRequest protocol buffer", e2, new Object[0]);
                return null;
            }
        }
        if (c == 1) {
            try {
                fgri y2 = fgri.y(doiv.a, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y2);
                doiv doivVar = (doiv) y2;
                Integer valueOf = (doivVar.b & 4) != 0 ? Integer.valueOf(doivVar.e) : null;
                dmfu e3 = e();
                ajjm ajjmVar = doivVar.c;
                if (ajjmVar == null) {
                    ajjmVar = ajjm.a;
                }
                String str4 = doivVar.d;
                dmfu.a.j("startKeyRecovery: device=".concat(String.valueOf(ajjmVar.e)), new Object[0]);
                String str5 = ajjmVar.k;
                long j = ajjmVar.c;
                ajik ajikVar = ajjmVar.i;
                if (ajikVar == null) {
                    ajikVar = ajik.a;
                }
                auad auadVar2 = KeyRecoveryChimeraActivity.j;
                Intent putExtra = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.KeyRecoveryActivity").putExtra("companion_node_id", str).putExtra("secondary_key_version", str5).putExtra("android_id", j).putExtra("vault", ajikVar.r()).putExtra("account_name", str4).putExtra("minimum_pin_digits", valueOf);
                putExtra.setFlags(805306368);
                e3.b.startActivity(putExtra);
            } catch (fgsd e4) {
                a.n("Malformed KeyRecoveryRequest protocol buffer", e4, new Object[0]);
            }
            return dhmr.d(new byte[0]);
        }
        if (c != 2) {
            if (c != 3) {
                if (c != 4) {
                    auadVar.m("Unsupported request: ".concat(String.valueOf(str2)), new Object[0]);
                    return null;
                }
                boolean z2 = dmfv.a.b;
                auadVar.j("restore_ongoing response: %b", Boolean.valueOf(z2));
                fgrc v = dojy.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                dojy dojyVar = (dojy) v.b;
                dojyVar.b |= 1;
                dojyVar.c = z2;
                return dhmr.d(((dojy) v.Q()).r());
            }
            try {
                fgri y3 = fgri.y(dokk.a, bArr, 0, bArr.length, fgqp.a());
                fgri.M(y3);
                dokk dokkVar = (dokk) y3;
                if (this.c == null) {
                    this.c = dmeo.a(getApplicationContext());
                }
                dmeo dmeoVar = this.c;
                int a2 = emxa.a(dokkVar.c);
                if (a2 == 0) {
                    a2 = 1;
                }
                fgrc v2 = emxb.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                emxb emxbVar = (emxb) v2.b;
                emxbVar.c = a2 - 1;
                emxbVar.b |= 1;
                emxb emxbVar2 = (emxb) v2.Q();
                fgrc d = dmeo.d();
                if (!d.b.L()) {
                    d.U();
                }
                emux emuxVar = (emux) d.b;
                emux emuxVar2 = emux.a;
                emxbVar2.getClass();
                emuxVar.G = emxbVar2;
                emuxVar.b |= JGCastService.FLAG_USE_TDLS;
                dmeoVar.e(d, emuw.CLOUD_RESTORE_SKIP);
            } catch (fgsd e5) {
                a.n("Malformed SkipRestoreRequest protocol buffer", e5, new Object[0]);
            }
            return dhmr.d(new byte[0]);
        }
        try {
            fgri y4 = fgri.y(dojz.a, bArr, 0, bArr.length, fgqp.a());
            fgri.M(y4);
            dojz dojzVar = (dojz) y4;
            final dmfu e6 = e();
            final long j2 = dojzVar.c;
            String str6 = dojzVar.d;
            boolean z3 = dojzVar.e;
            dmfv dmfvVar = dmfv.a;
            synchronized (dmfvVar) {
                synchronized (dmfvVar) {
                    z = dmfvVar.b;
                    dmfvVar.b = true;
                }
                return dhmr.d(dokcVar.r());
            }
            if (z) {
                auad auadVar3 = dmfu.a;
                auadVar3.m("Attempt to start restore, but watch is already restoring", new Object[0]);
                dokcVar = dmfv.a.c;
                if (dokcVar == null) {
                    auadVar3.f("Restore started before but no previous restore response.", new Object[0]);
                    fgrc v3 = dokc.a.v();
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    fgri fgriVar = v3.b;
                    dokc dokcVar2 = (dokc) fgriVar;
                    dokcVar2.b |= 1;
                    dokcVar2.c = false;
                    if (!fgriVar.L()) {
                        v3.U();
                    }
                    dokc dokcVar3 = (dokc) v3.b;
                    dokcVar3.d = 2;
                    dokcVar3.b |= 2;
                    dokcVar = (dokc) v3.Q();
                }
            } else {
                Context context = e6.b;
                final Optional a3 = dmfx.a(context, str6);
                if (a3.isEmpty()) {
                    dmfu.a.f("accountName in start_restore request not found", new Object[0]);
                    e6.a(str);
                    fgrc v4 = dokc.a.v();
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    fgri fgriVar2 = v4.b;
                    dokc dokcVar4 = (dokc) fgriVar2;
                    dokcVar4.b |= 1;
                    dokcVar4.c = false;
                    if (!fgriVar2.L()) {
                        v4.U();
                    }
                    dokc dokcVar5 = (dokc) v4.b;
                    dokcVar5.d = 3;
                    dokcVar5.b |= 2;
                    dokcVar = (dokc) v4.Q();
                    dmfv.a.c = dokcVar;
                } else {
                    auad auadVar4 = dmfu.a;
                    auadVar4.j("Got backup account for restore", new Object[0]);
                    if (!z3 || ausb.d(context)) {
                        e6.g.submit(new Runnable() { // from class: dmfr
                            @Override // java.lang.Runnable
                            public final void run() {
                                dmfu.this.b(str, j2, (Account) a3.get());
                            }
                        });
                        fgrc v5 = dokc.a.v();
                        if (!v5.b.L()) {
                            v5.U();
                        }
                        dokc dokcVar6 = (dokc) v5.b;
                        dokcVar6.b |= 1;
                        dokcVar6.c = true;
                        dokcVar = (dokc) v5.Q();
                        dmfv.a.c = dokcVar;
                    } else {
                        auadVar4.j("Wait for charging.", new Object[0]);
                        RestoreController$ChargingObserver restoreController$ChargingObserver = new RestoreController$ChargingObserver(context, new Runnable() { // from class: dmfq
                            @Override // java.lang.Runnable
                            public final void run() {
                                dmfu.a.j("Watch is charging. Notifying phone.", new Object[0]);
                                dmgd.a.j("sending ready_to_restore request", new Object[0]);
                                dmfu dmfuVar = dmfu.this;
                                final dmgd dmgdVar = dmfuVar.f;
                                final String str7 = str;
                                eqgc.t(eqdl.g(dmgdVar.a("sendReadyToRestoreRequest", new Supplier() { // from class: dmgb
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return dmgd.this.c.bf(str7, "/restore/ready_to_restore", new byte[0]);
                                    }
                                }), new eqdv() { // from class: dmgc
                                    @Override // defpackage.eqdv
                                    public final eqgl a(Object obj) {
                                        byte[] bArr2 = (byte[]) obj;
                                        auad auadVar5 = dmgd.a;
                                        fgri y5 = fgri.y(dojv.a, bArr2, 0, bArr2.length, fgqp.a());
                                        fgri.M(y5);
                                        return eqgc.i((dojv) y5);
                                    }
                                }, dmgdVar.b), new dmfs(dmfuVar, str7, j2, a3), dmfuVar.g);
                            }
                        });
                        restoreController$ChargingObserver.a.registerReceiver(restoreController$ChargingObserver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                        fgrc v6 = dokc.a.v();
                        if (!v6.b.L()) {
                            v6.U();
                        }
                        fgri fgriVar3 = v6.b;
                        dokc dokcVar7 = (dokc) fgriVar3;
                        dokcVar7.b |= 1;
                        dokcVar7.c = false;
                        if (!fgriVar3.L()) {
                            v6.U();
                        }
                        dokc dokcVar8 = (dokc) v6.b;
                        dokcVar8.d = 1;
                        dokcVar8.b |= 2;
                        dokcVar = (dokc) v6.Q();
                        dmfv.a.c = dokcVar;
                    }
                }
            }
            return dhmr.d(dokcVar.r());
        } catch (fgsd e7) {
            a.n("Malformed RestoreRequest protocol buffer", e7, new Object[0]);
            fgrc v7 = dokc.a.v();
            if (!v7.b.L()) {
                v7.U();
            }
            fgri fgriVar4 = v7.b;
            dokc dokcVar9 = (dokc) fgriVar4;
            dokcVar9.b |= 1;
            dokcVar9.c = false;
            if (!fgriVar4.L()) {
                v7.U();
            }
            dokc dokcVar10 = (dokc) v7.b;
            dokcVar10.d = 4;
            dokcVar10.b |= 2;
            return dhmr.d(((dokc) v7.Q()).r());
        }
    }

    @Override // defpackage.dmmv, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        a.m("Stopping service as restore is unsupported.", new Object[0]);
        stopSelf();
    }
}

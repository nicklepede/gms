package com.google.android.gms.wearable.backup.wear;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.cast.JGCastService;
import com.google.android.gms.wearable.backup.wear.RestoreWearListenerChimeraService;
import defpackage.ahhp;
import defpackage.ahhu;
import defpackage.ahiw;
import defpackage.ahpv;
import defpackage.aibb;
import defpackage.arxo;
import defpackage.asmb;
import defpackage.asmf;
import defpackage.asoh;
import defpackage.bqna;
import defpackage.dfaq;
import defpackage.dfbl;
import defpackage.djks;
import defpackage.djlj;
import defpackage.djsv;
import defpackage.djsx;
import defpackage.djub;
import defpackage.djuc;
import defpackage.djue;
import defpackage.djuk;
import defpackage.djur;
import defpackage.djxb;
import defpackage.djxd;
import defpackage.dkbc;
import defpackage.dlrk;
import defpackage.dlwh;
import defpackage.dlxe;
import defpackage.dlyh;
import defpackage.dlyi;
import defpackage.dlyl;
import defpackage.dlyt;
import defpackage.docc;
import defpackage.eiho;
import defpackage.ekhk;
import defpackage.ekhl;
import defpackage.ekjo;
import defpackage.ekjp;
import defpackage.enox;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.ensi;
import defpackage.febw;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fedk;
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

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class RestoreWearListenerChimeraService extends dkbc {
    public static final arxo a = new djlj("RestoreWearWLS");
    djub b;
    djsv c;

    private final djub e() {
        if (this.b == null) {
            Context applicationContext = getApplicationContext();
            djsx djsxVar = new djsx(applicationContext, bqna.b(applicationContext), aibb.a(applicationContext));
            ahhp ahhpVar = new ahhp(applicationContext);
            djxd djxdVar = new djxd(applicationContext);
            djur djurVar = new djur(new ahpv(applicationContext));
            dlrk dlrkVar = new dlrk(applicationContext, "wear-restore", new asmb(1, 9));
            arxo arxoVar = djxb.a;
            new asmf(1, 9);
            this.b = new djub(applicationContext, djsxVar, ahhpVar, djxdVar, djurVar, dlrkVar, new djuk(djks.e(applicationContext), new asmb(2, 9)), new asmf(3, 9), new asmb(2, 9), djsv.a(applicationContext));
        }
        return this.b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.dkbc, defpackage.djkj
    public final dfaq k(final String str, String str2, byte[] bArr) {
        char c;
        boolean z;
        dlyl dlylVar;
        arxo arxoVar = a;
        arxoVar.j("onRequest: nodeId=%s path=%s request=%s", str, str2, bArr);
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
                fecp y = fecp.y(dlwh.a, bArr, 0, bArr.length, febw.a());
                fecp.M(y);
                final dlwh dlwhVar = (dlwh) y;
                final djub e = e();
                final String str3 = dlwhVar.c;
                ensi h = ensi.h(e.g.submit(new Callable() { // from class: djth
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        djsx djsxVar = djub.this.c;
                        Context context = djsxVar.b;
                        String str4 = str3;
                        Optional a2 = djue.a(context, str4);
                        if (a2.isEmpty()) {
                            djsx.a.m("Invalid account:".concat(String.valueOf(arxo.q(str4))), new Object[0]);
                            int i = eitj.d;
                            return ejcb.a;
                        }
                        Optional a3 = djsxVar.a((Account) a2.get());
                        if (a3.isEmpty()) {
                            djsx.a.m("Can't fetch devices: no valid auth token.", new Object[0]);
                            int i2 = eitj.d;
                            return ejcb.a;
                        }
                        djsx.a.j("Fetching devices for account: ".concat(String.valueOf(arxo.q(str4))), new Object[0]);
                        Account account = (Account) a2.get();
                        String str5 = (String) a3.get();
                        fecj a4 = aibf.a(asng.f(context));
                        if (!a4.b.L()) {
                            a4.U();
                        }
                        ahip ahipVar = (ahip) a4.b;
                        ahip ahipVar2 = ahip.a;
                        str5.getClass();
                        ahipVar.b |= 16;
                        ahipVar.f = str5;
                        ahil ahilVar = ((ahip) a4.b).m;
                        if (ahilVar == null) {
                            ahilVar = ahil.a;
                        }
                        fecj fecjVar = (fecj) ahilVar.iB(5, null);
                        fecjVar.X(ahilVar);
                        if (!fecjVar.b.L()) {
                            fecjVar.U();
                        }
                        ahil ahilVar2 = (ahil) fecjVar.b;
                        ahilVar2.b |= 32;
                        ahilVar2.e = false;
                        if (!a4.b.L()) {
                            a4.U();
                        }
                        ahip ahipVar3 = (ahip) a4.b;
                        ahil ahilVar3 = (ahil) fecjVar.Q();
                        ahilVar3.getClass();
                        ahipVar3.m = ahilVar3;
                        ahipVar3.b |= 4096;
                        try {
                            ahiz c2 = djsxVar.c.c(account, a4);
                            aibd.b(c2);
                            Stream filter = Collection.EL.stream(c2.g).filter(new Predicate() { // from class: djsw
                                public final /* synthetic */ Predicate and(Predicate predicate) {
                                    return Predicate$CC.$default$and(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                /* renamed from: negate */
                                public final /* synthetic */ Predicate mo463negate() {
                                    return Predicate$CC.$default$negate(this);
                                }

                                @Override // java.util.function.Predicate
                                public final /* synthetic */ Predicate or(Predicate predicate) {
                                    return Predicate$CC.$default$or(this, predicate);
                                }

                                @Override // java.util.function.Predicate
                                public final boolean test(Object obj) {
                                    ahiw ahiwVar = (ahiw) obj;
                                    arxo arxoVar2 = djsx.a;
                                    int a5 = ahiv.a(ahiwVar.j);
                                    if (a5 == 0 || a5 != 2) {
                                        ahhu ahhuVar = ahiwVar.i;
                                        if (ahhuVar == null) {
                                            ahhuVar = ahhu.a;
                                        }
                                        int i3 = ahhuVar.b;
                                        if ((i3 & 16) != 0 && (i3 & 1) != 0) {
                                            ahhv ahhvVar = ahhuVar.c;
                                            if (ahhvVar == null) {
                                                ahhvVar = ahhv.a;
                                            }
                                            if ((ahhvVar.b & 4) != 0) {
                                                int i4 = ahhuVar.e;
                                                ahhv ahhvVar2 = ahhuVar.c;
                                                if (ahhvVar2 == null) {
                                                    ahhvVar2 = ahhv.a;
                                                }
                                                if (i4 >= ahhvVar2.c) {
                                                    return false;
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                            });
                            int i3 = eitj.d;
                            return (eitj) filter.collect(eipl.a);
                        } catch (aidi | IOException | unx e2) {
                            djsx.a.n("Failed to fetch devices.", e2, new Object[0]);
                            int i4 = eitj.d;
                            return ejcb.a;
                        }
                    }
                }));
                eiho eihoVar = new eiho() { // from class: djul
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        eitj eitjVar = (eitj) obj;
                        RestoreWearListenerChimeraService.a.j("get_devices response: %s", (String) Collection.EL.stream(eitjVar).map(new Function() { // from class: djun
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo464andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj2) {
                                return ((ahiw) obj2).e;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        }).collect(Collectors.joining(", ")));
                        fecj v = dlwk.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        dlwk dlwkVar = (dlwk) v.b;
                        fedh fedhVar = dlwkVar.c;
                        if (!fedhVar.c()) {
                            dlwkVar.c = fecp.E(fedhVar);
                        }
                        feab.E(eitjVar, dlwkVar.c);
                        return ((dlwk) v.Q()).r();
                    }
                };
                enre enreVar = enre.a;
                return docc.a(enox.g(enps.f(h, eihoVar, enreVar), Throwable.class, new enqc() { // from class: djum
                    @Override // defpackage.enqc
                    public final enss a(Object obj) {
                        Throwable th = (Throwable) obj;
                        RestoreWearListenerChimeraService.a.n("Failed to complete get_devices", th, new Object[0]);
                        if (!dlwh.this.d) {
                            return ensj.h(th);
                        }
                        fecj v = dlwk.a.v();
                        if (!v.b.L()) {
                            v.U();
                        }
                        dlwk dlwkVar = (dlwk) v.b;
                        dlwkVar.d = 1;
                        dlwkVar.b = 1 | dlwkVar.b;
                        return ensj.i(((dlwk) v.Q()).r());
                    }
                }, enreVar));
            } catch (fedk e2) {
                a.n("Malformed GetDevicesRequest protocol buffer", e2, new Object[0]);
                return null;
            }
        }
        if (c == 1) {
            try {
                fecp y2 = fecp.y(dlxe.a, bArr, 0, bArr.length, febw.a());
                fecp.M(y2);
                dlxe dlxeVar = (dlxe) y2;
                Integer valueOf = (dlxeVar.b & 4) != 0 ? Integer.valueOf(dlxeVar.e) : null;
                djub e3 = e();
                ahiw ahiwVar = dlxeVar.c;
                if (ahiwVar == null) {
                    ahiwVar = ahiw.a;
                }
                String str4 = dlxeVar.d;
                djub.a.j("startKeyRecovery: device=".concat(String.valueOf(ahiwVar.e)), new Object[0]);
                String str5 = ahiwVar.k;
                long j = ahiwVar.c;
                ahhu ahhuVar = ahiwVar.i;
                if (ahhuVar == null) {
                    ahhuVar = ahhu.a;
                }
                arxo arxoVar2 = KeyRecoveryChimeraActivity.j;
                Intent putExtra = new Intent().setClassName("com.google.android.gms", "com.google.android.gms.wearable.backup.wear.KeyRecoveryActivity").putExtra("companion_node_id", str).putExtra("secondary_key_version", str5).putExtra("android_id", j).putExtra("vault", ahhuVar.r()).putExtra("account_name", str4).putExtra("minimum_pin_digits", valueOf);
                putExtra.setFlags(805306368);
                e3.b.startActivity(putExtra);
            } catch (fedk e4) {
                a.n("Malformed KeyRecoveryRequest protocol buffer", e4, new Object[0]);
            }
            return dfbl.d(new byte[0]);
        }
        if (c != 2) {
            if (c != 3) {
                if (c != 4) {
                    arxoVar.m("Unsupported request: ".concat(String.valueOf(str2)), new Object[0]);
                    return null;
                }
                boolean z2 = djuc.a.b;
                arxoVar.j("restore_ongoing response: %b", Boolean.valueOf(z2));
                fecj v = dlyh.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                dlyh dlyhVar = (dlyh) v.b;
                dlyhVar.b |= 1;
                dlyhVar.c = z2;
                return dfbl.d(((dlyh) v.Q()).r());
            }
            try {
                fecp y3 = fecp.y(dlyt.a, bArr, 0, bArr.length, febw.a());
                fecp.M(y3);
                dlyt dlytVar = (dlyt) y3;
                if (this.c == null) {
                    this.c = djsv.a(getApplicationContext());
                }
                djsv djsvVar = this.c;
                int a2 = ekjo.a(dlytVar.c);
                if (a2 == 0) {
                    a2 = 1;
                }
                fecj v2 = ekjp.a.v();
                if (!v2.b.L()) {
                    v2.U();
                }
                ekjp ekjpVar = (ekjp) v2.b;
                ekjpVar.c = a2 - 1;
                ekjpVar.b |= 1;
                ekjp ekjpVar2 = (ekjp) v2.Q();
                fecj d = djsv.d();
                if (!d.b.L()) {
                    d.U();
                }
                ekhl ekhlVar = (ekhl) d.b;
                ekhl ekhlVar2 = ekhl.a;
                ekjpVar2.getClass();
                ekhlVar.G = ekjpVar2;
                ekhlVar.b |= JGCastService.FLAG_USE_TDLS;
                djsvVar.e(d, ekhk.CLOUD_RESTORE_SKIP);
            } catch (fedk e5) {
                a.n("Malformed SkipRestoreRequest protocol buffer", e5, new Object[0]);
            }
            return dfbl.d(new byte[0]);
        }
        try {
            fecp y4 = fecp.y(dlyi.a, bArr, 0, bArr.length, febw.a());
            fecp.M(y4);
            dlyi dlyiVar = (dlyi) y4;
            final djub e6 = e();
            final long j2 = dlyiVar.c;
            String str6 = dlyiVar.d;
            boolean z3 = dlyiVar.e;
            djuc djucVar = djuc.a;
            synchronized (djucVar) {
                synchronized (djucVar) {
                    z = djucVar.b;
                    djucVar.b = true;
                }
                return dfbl.d(dlylVar.r());
            }
            if (z) {
                arxo arxoVar3 = djub.a;
                arxoVar3.m("Attempt to start restore, but watch is already restoring", new Object[0]);
                dlylVar = djuc.a.c;
                if (dlylVar == null) {
                    arxoVar3.f("Restore started before but no previous restore response.", new Object[0]);
                    fecj v3 = dlyl.a.v();
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    fecp fecpVar = v3.b;
                    dlyl dlylVar2 = (dlyl) fecpVar;
                    dlylVar2.b |= 1;
                    dlylVar2.c = false;
                    if (!fecpVar.L()) {
                        v3.U();
                    }
                    dlyl dlylVar3 = (dlyl) v3.b;
                    dlylVar3.d = 2;
                    dlylVar3.b |= 2;
                    dlylVar = (dlyl) v3.Q();
                }
            } else {
                Context context = e6.b;
                final Optional a3 = djue.a(context, str6);
                if (a3.isEmpty()) {
                    djub.a.f("accountName in start_restore request not found", new Object[0]);
                    e6.a(str);
                    fecj v4 = dlyl.a.v();
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    fecp fecpVar2 = v4.b;
                    dlyl dlylVar4 = (dlyl) fecpVar2;
                    dlylVar4.b |= 1;
                    dlylVar4.c = false;
                    if (!fecpVar2.L()) {
                        v4.U();
                    }
                    dlyl dlylVar5 = (dlyl) v4.b;
                    dlylVar5.d = 3;
                    dlylVar5.b |= 2;
                    dlylVar = (dlyl) v4.Q();
                    djuc.a.c = dlylVar;
                } else {
                    arxo arxoVar4 = djub.a;
                    arxoVar4.j("Got backup account for restore", new Object[0]);
                    if (!z3 || asoh.d(context)) {
                        e6.g.submit(new Runnable() { // from class: djty
                            @Override // java.lang.Runnable
                            public final void run() {
                                djub.this.b(str, j2, (Account) a3.get());
                            }
                        });
                        fecj v5 = dlyl.a.v();
                        if (!v5.b.L()) {
                            v5.U();
                        }
                        dlyl dlylVar6 = (dlyl) v5.b;
                        dlylVar6.b |= 1;
                        dlylVar6.c = true;
                        dlylVar = (dlyl) v5.Q();
                        djuc.a.c = dlylVar;
                    } else {
                        arxoVar4.j("Wait for charging.", new Object[0]);
                        RestoreController$ChargingObserver restoreController$ChargingObserver = new RestoreController$ChargingObserver(context, new Runnable() { // from class: djtx
                            @Override // java.lang.Runnable
                            public final void run() {
                                djub.a.j("Watch is charging. Notifying phone.", new Object[0]);
                                djuk.a.j("sending ready_to_restore request", new Object[0]);
                                djub djubVar = djub.this;
                                final djuk djukVar = djubVar.f;
                                final String str7 = str;
                                ensj.t(enps.g(djukVar.a("sendReadyToRestoreRequest", new Supplier() { // from class: djui
                                    @Override // java.util.function.Supplier
                                    public final Object get() {
                                        return djuk.this.c.bg(str7, "/restore/ready_to_restore", new byte[0]);
                                    }
                                }), new enqc() { // from class: djuj
                                    @Override // defpackage.enqc
                                    public final enss a(Object obj) {
                                        byte[] bArr2 = (byte[]) obj;
                                        arxo arxoVar5 = djuk.a;
                                        fecp y5 = fecp.y(dlye.a, bArr2, 0, bArr2.length, febw.a());
                                        fecp.M(y5);
                                        return ensj.i((dlye) y5);
                                    }
                                }, djukVar.b), new djtz(djubVar, str7, j2, a3), djubVar.g);
                            }
                        });
                        restoreController$ChargingObserver.a.registerReceiver(restoreController$ChargingObserver, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
                        fecj v6 = dlyl.a.v();
                        if (!v6.b.L()) {
                            v6.U();
                        }
                        fecp fecpVar3 = v6.b;
                        dlyl dlylVar7 = (dlyl) fecpVar3;
                        dlylVar7.b |= 1;
                        dlylVar7.c = false;
                        if (!fecpVar3.L()) {
                            v6.U();
                        }
                        dlyl dlylVar8 = (dlyl) v6.b;
                        dlylVar8.d = 1;
                        dlylVar8.b |= 2;
                        dlylVar = (dlyl) v6.Q();
                        djuc.a.c = dlylVar;
                    }
                }
            }
            return dfbl.d(dlylVar.r());
        } catch (fedk e7) {
            a.n("Malformed RestoreRequest protocol buffer", e7, new Object[0]);
            fecj v7 = dlyl.a.v();
            if (!v7.b.L()) {
                v7.U();
            }
            fecp fecpVar4 = v7.b;
            dlyl dlylVar9 = (dlyl) fecpVar4;
            dlylVar9.b |= 1;
            dlylVar9.c = false;
            if (!fecpVar4.L()) {
                v7.U();
            }
            dlyl dlylVar10 = (dlyl) v7.b;
            dlylVar10.d = 4;
            dlylVar10.b |= 2;
            return dfbl.d(((dlyl) v7.Q()).r());
        }
    }

    @Override // defpackage.dkbc, com.google.android.chimera.Service
    public final void onCreate() {
        super.onCreate();
        a.m("Stopping service as restore is unsupported.", new Object[0]);
        stopSelf();
    }
}

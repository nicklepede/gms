package com.google.android.gms.stats.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.apta;
import defpackage.apud;
import defpackage.aqam;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.arho;
import defpackage.arhq;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asot;
import defpackage.asri;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.derv;
import defpackage.desa;
import defpackage.detn;
import defpackage.detx;
import defpackage.dhqe;
import defpackage.dhqf;
import defpackage.eijr;
import defpackage.eitj;
import defpackage.fecj;
import defpackage.fijx;
import defpackage.fikc;
import defpackage.fkba;
import defpackage.fshj;
import defpackage.fsic;
import defpackage.fski;
import defpackage.fuuq;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class DropBoxEntryAddedChimeraService extends TracingIntentService {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class Receiver extends BroadcastReceiver {
        @Override // com.google.android.chimera.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!fski.a.a().s() || detx.a()) {
                eijr eijrVar = bqqe.a;
                if (Objects.equals(intent.getAction(), "android.intent.action.DROPBOX_ENTRY_ADDED")) {
                    bqqa.a(aseu.STATS_DROPBOX_ENTRY_ADDED);
                }
                if (Objects.equals(intent.getAction(), "android.intent.action.DROPBOX_ENTRY_ADDED") && detn.c(context, intent.getStringExtra("tag"))) {
                    bqqa.a(aseu.STATS_DROPBOX_ENTRY_CONSENTED);
                    Intent intent2 = new Intent("com.google.android.gms.stats.ACTION_UPLOAD_DROPBOX_ENTRIES");
                    intent2.setPackage(context.getPackageName());
                    context.startService(intent2);
                }
            }
        }
    }

    static {
        asot.b("DropBoxEntryAddedChiSer", asej.STATS);
    }

    public DropBoxEntryAddedChimeraService() {
        super("DropBoxEntryAddedChimeraService");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        apud apudVar;
        apta aptaVar;
        aqxo aqxoVar;
        if ("com.google.android.gms.stats.ACTION_UPLOAD_DROPBOX_ENTRIES".equals(intent.getAction())) {
            long j = derv.a;
            if (!asri.o().contains("(eng-") && detx.a()) {
                desa desaVar = new desa();
                if (fsic.c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    aqam aqamVar = derv.c;
                    fuuq fuuqVar = new fuuq() { // from class: dern
                        @Override // defpackage.fuuq, defpackage.fuup
                        public final Object a() {
                            long j2 = derv.a;
                            asot asotVar = tvo.a;
                            asee h = fshj.a.a().h();
                            tvo tvoVar = null;
                            if ((!h.b.isEmpty() || fshj.d()) && asqh.a()) {
                                tvoVar = new tvo(this, h);
                            }
                            return eiid.i(tvoVar);
                        }
                    };
                    arho arhoVar = new arho(this);
                    arhq b = arhq.b();
                    long e = fshj.a.a().e();
                    if (e != 0) {
                        if (currentTimeMillis - derv.a < e) {
                            int i = derv.b + 1;
                            derv.b = i;
                            if (i > fshj.a.a().f()) {
                                return;
                            }
                        } else {
                            derv.a = currentTimeMillis;
                            derv.b = 1;
                        }
                    }
                    fuuq fuuqVar2 = aqamVar.a;
                    apta aptaVar2 = new apta(this, null, null);
                    apud apudVar2 = new apud(aptaVar2, "PLATFORM_STATS_COUNTERS", 1024);
                    dhqe dhqeVar = new dhqe();
                    aqxd aqxdVar = dhqf.a;
                    aqxo aqxoVar2 = new aqxo(this, dhqeVar);
                    if (fski.a.a().u()) {
                        eitj b2 = derv.b(this, apudVar2, desaVar, aqxoVar2, currentTimeMillis);
                        apudVar = apudVar2;
                        desa desaVar2 = desaVar;
                        aqxo aqxoVar3 = aqxoVar2;
                        long j2 = currentTimeMillis;
                        int size = b2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            fikc fikcVar = (fikc) b2.get(i2);
                            fuuq fuuqVar3 = fuuqVar;
                            int i3 = i2;
                            derv.c(this, desaVar2, fikcVar, j2, fuuqVar3);
                            arho arhoVar2 = arhoVar;
                            derv.d(this, desaVar2, fikcVar, j2, arhoVar2);
                            long j3 = j2;
                            if (fikcVar != null && fkba.f()) {
                                fikcVar = b.c(fikcVar);
                            }
                            if (fikcVar == null || fikcVar.k.isEmpty()) {
                                aqxoVar = aqxoVar3;
                            } else {
                                fecj fecjVar = (fecj) fikcVar.iB(5, null);
                                fecjVar.X(fikcVar);
                                fijx fijxVar = (fijx) fecjVar;
                                desa desaVar3 = desaVar2;
                                aqxoVar = aqxoVar3;
                                desaVar3.l(this, aqxoVar, aptaVar2, apudVar, fijxVar);
                                desaVar2 = desaVar3;
                            }
                            i2 = i3 + 1;
                            aqxoVar3 = aqxoVar;
                            fuuqVar = fuuqVar3;
                            j2 = j3;
                            arhoVar = arhoVar2;
                        }
                        long j4 = j2;
                        arho arhoVar3 = arhoVar;
                        fuuq fuuqVar4 = fuuqVar;
                        if (b2.isEmpty()) {
                            derv.c(this, desaVar2, null, j4, fuuqVar4);
                            derv.d(this, desaVar2, null, j4, arhoVar3);
                        }
                    } else {
                        fikc a = derv.a(this, apudVar2, desaVar, aqxoVar2, currentTimeMillis);
                        apudVar = apudVar2;
                        derv.c(this, desaVar, a, currentTimeMillis, fuuqVar);
                        derv.d(this, desaVar, a, currentTimeMillis, arhoVar);
                        fikc c = (a == null || !fkba.f()) ? a : b.c(a);
                        if (c != null && !c.k.isEmpty()) {
                            fecj fecjVar2 = (fecj) c.iB(5, null);
                            fecjVar2.X(c);
                            aptaVar = aptaVar2;
                            desaVar.l(this, aqxoVar2, aptaVar, apudVar, (fijx) fecjVar2);
                            apudVar.h();
                            aptaVar.e(10L, TimeUnit.SECONDS);
                        }
                    }
                    aptaVar = aptaVar2;
                    apudVar.h();
                    aptaVar.e(10L, TimeUnit.SECONDS);
                }
            }
        }
    }
}

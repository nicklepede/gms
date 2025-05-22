package com.google.android.gms.stats.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.arvr;
import defpackage.arwu;
import defpackage.asdd;
import defpackage.aszs;
import defpackage.atad;
import defpackage.atkd;
import defpackage.atkf;
import defpackage.auid;
import defpackage.auio;
import defpackage.ausn;
import defpackage.auvc;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.dhcy;
import defpackage.dhdd;
import defpackage.dheq;
import defpackage.dhfa;
import defpackage.dkbk;
import defpackage.dkbl;
import defpackage.ekww;
import defpackage.elgo;
import defpackage.fgrc;
import defpackage.fkzu;
import defpackage.fkzz;
import defpackage.fmri;
import defpackage.fvch;
import defpackage.fvda;
import defpackage.fvfg;
import defpackage.fxqo;
import j$.util.Objects;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class DropBoxEntryAddedChimeraService extends TracingIntentService {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class Receiver extends BroadcastReceiver {
        @Override // com.google.android.chimera.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            if (!fvfg.a.lK().s() || dhfa.a()) {
                ekww ekwwVar = bsxv.a;
                if (Objects.equals(intent.getAction(), "android.intent.action.DROPBOX_ENTRY_ADDED")) {
                    bsxr.a(auio.STATS_DROPBOX_ENTRY_ADDED);
                }
                if (Objects.equals(intent.getAction(), "android.intent.action.DROPBOX_ENTRY_ADDED") && dheq.c(context, intent.getStringExtra("tag"))) {
                    bsxr.a(auio.STATS_DROPBOX_ENTRY_CONSENTED);
                    Intent intent2 = new Intent("com.google.android.gms.stats.ACTION_UPLOAD_DROPBOX_ENTRIES");
                    intent2.setPackage(context.getPackageName());
                    context.startService(intent2);
                }
            }
        }
    }

    static {
        ausn.b("DropBoxEntryAddedChiSer", auid.STATS);
    }

    public DropBoxEntryAddedChimeraService() {
        super("DropBoxEntryAddedChimeraService");
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        arwu arwuVar;
        arvr arvrVar;
        atad atadVar;
        if ("com.google.android.gms.stats.ACTION_UPLOAD_DROPBOX_ENTRIES".equals(intent.getAction())) {
            long j = dhcy.a;
            if (!auvc.o().contains("(eng-") && dhfa.a()) {
                dhdd dhddVar = new dhdd();
                if (fvda.c()) {
                    long currentTimeMillis = System.currentTimeMillis();
                    asdd asddVar = dhcy.c;
                    fxqo fxqoVar = new fxqo() { // from class: dhcq
                        @Override // defpackage.fxqo, defpackage.fxqn
                        public final Object a() {
                            long j2 = dhcy.a;
                            ausn ausnVar = vro.a;
                            auhy h = fvch.a.lK().h();
                            vro vroVar = null;
                            if ((!h.b.isEmpty() || fvch.c()) && auub.a()) {
                                vroVar = new vro(this, h);
                            }
                            return ekvi.i(vroVar);
                        }
                    };
                    atkd atkdVar = new atkd(this);
                    atkf b = atkf.b();
                    fvch fvchVar = fvch.a;
                    long e = fvchVar.lK().e();
                    if (e != 0) {
                        if (currentTimeMillis - dhcy.a < e) {
                            int i = dhcy.b + 1;
                            dhcy.b = i;
                            if (i > fvchVar.lK().f()) {
                                return;
                            }
                        } else {
                            dhcy.a = currentTimeMillis;
                            dhcy.b = 1;
                        }
                    }
                    fxqo fxqoVar2 = asddVar.a;
                    arvr arvrVar2 = new arvr(this, null, null);
                    arwu arwuVar2 = new arwu(arvrVar2, "PLATFORM_STATS_COUNTERS", 1024);
                    dkbk dkbkVar = new dkbk();
                    aszs aszsVar = dkbl.a;
                    atad atadVar2 = new atad(this, dkbkVar);
                    if (fvfg.a.lK().u()) {
                        elgo b2 = dhcy.b(this, arwuVar2, dhddVar, atadVar2, currentTimeMillis);
                        arwuVar = arwuVar2;
                        dhdd dhddVar2 = dhddVar;
                        atad atadVar3 = atadVar2;
                        long j2 = currentTimeMillis;
                        int size = b2.size();
                        int i2 = 0;
                        while (i2 < size) {
                            fkzz fkzzVar = (fkzz) b2.get(i2);
                            fxqo fxqoVar3 = fxqoVar;
                            int i3 = i2;
                            dhcy.c(this, dhddVar2, fkzzVar, j2, fxqoVar3);
                            atkd atkdVar2 = atkdVar;
                            dhcy.d(this, dhddVar2, fkzzVar, j2, atkdVar2);
                            long j3 = j2;
                            if (fkzzVar != null && fmri.f()) {
                                fkzzVar = b.c(fkzzVar);
                            }
                            if (fkzzVar == null || fkzzVar.k.isEmpty()) {
                                atadVar = atadVar3;
                            } else {
                                fgrc fgrcVar = (fgrc) fkzzVar.iQ(5, null);
                                fgrcVar.X(fkzzVar);
                                fkzu fkzuVar = (fkzu) fgrcVar;
                                dhdd dhddVar3 = dhddVar2;
                                atadVar = atadVar3;
                                dhddVar3.l(this, atadVar, arvrVar2, arwuVar, fkzuVar);
                                dhddVar2 = dhddVar3;
                            }
                            i2 = i3 + 1;
                            atadVar3 = atadVar;
                            fxqoVar = fxqoVar3;
                            j2 = j3;
                            atkdVar = atkdVar2;
                        }
                        long j4 = j2;
                        atkd atkdVar3 = atkdVar;
                        fxqo fxqoVar4 = fxqoVar;
                        if (b2.isEmpty()) {
                            dhcy.c(this, dhddVar2, null, j4, fxqoVar4);
                            dhcy.d(this, dhddVar2, null, j4, atkdVar3);
                        }
                    } else {
                        fkzz a = dhcy.a(this, arwuVar2, dhddVar, atadVar2, currentTimeMillis);
                        arwuVar = arwuVar2;
                        dhcy.c(this, dhddVar, a, currentTimeMillis, fxqoVar);
                        dhcy.d(this, dhddVar, a, currentTimeMillis, atkdVar);
                        fkzz c = (a == null || !fmri.f()) ? a : b.c(a);
                        if (c != null && !c.k.isEmpty()) {
                            fgrc fgrcVar2 = (fgrc) c.iQ(5, null);
                            fgrcVar2.X(c);
                            arvrVar = arvrVar2;
                            dhddVar.l(this, atadVar2, arvrVar, arwuVar, (fkzu) fgrcVar2);
                            arwuVar.h();
                            arvrVar.e(10L, TimeUnit.SECONDS);
                        }
                    }
                    arvrVar = arvrVar2;
                    arwuVar.h();
                    arvrVar.e(10L, TimeUnit.SECONDS);
                }
            }
        }
    }
}

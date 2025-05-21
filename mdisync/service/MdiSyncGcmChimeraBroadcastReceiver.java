package com.google.android.gms.mdisync.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.ccqw;
import defpackage.ccri;
import defpackage.ccrj;
import defpackage.ccrk;
import defpackage.ccsm;
import defpackage.dphg;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.eite;
import defpackage.eitj;
import defpackage.ejdg;
import defpackage.ejfg;
import defpackage.enre;
import defpackage.ensa;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fqbt;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MdiSyncGcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private final eijr b;
    private final eijr c;

    public MdiSyncGcmChimeraBroadcastReceiver() {
        this(new eijr() { // from class: ccrl
            @Override // defpackage.eijr
            public final Object a() {
                ccog a = ccog.a();
                return new ccrk(new ejdg(new ccnd((byxs) a.B.a(), new ccns((eijr) a.C.a(), new ccnt((Context) a.d.a(), (dphg) a.E.a())), new asmf(2, 10), (dphg) a.E.a())), (dphg) a.E.a(), (ccqc) a.Q.a());
            }
        }, new eijr() { // from class: ccrm
            @Override // defpackage.eijr
            public final Object a() {
                return ccog.a().c();
            }
        });
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!fqbt.g()) {
            ((dphg) this.c.a()).b().ah(6376).x("Disabled - skipping GCM push notification handling.");
            return;
        }
        ((dphg) this.c.a()).b().ah(6375).x("Received GCM push notification!");
        ccrk ccrkVar = (ccrk) this.b.a();
        if (intent == null) {
            ccrkVar.b.b().ah(6374).x("Skipping push message handling due to null intent...");
            return;
        }
        beginAsync();
        int i = eitj.d;
        eite eiteVar = new eite();
        ejfg listIterator = ((ejdg) ccrkVar.a).listIterator();
        while (listIterator.hasNext()) {
            ccqw ccqwVar = (ccqw) listIterator.next();
            if (ccqwVar.c(intent)) {
                ccsm a = ccqwVar.a();
                enss b = ccqwVar.b(intent);
                eiteVar.i(b);
                ensj.t(b, new ccrj(ccrkVar, a), enre.a);
            }
        }
        final eitj g = eiteVar.g();
        ensa a2 = ensj.a(g);
        Callable callable = new Callable() { // from class: ccrh
            @Override // java.util.concurrent.Callable
            public final Object call() {
                eitj eitjVar = eitj.this;
                int i2 = ((ejcb) eitjVar).c;
                if (i2 > 1) {
                    throw new IllegalArgumentException("Message processed by multiple backends.");
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    ((enss) eitjVar.get(i3)).get();
                }
                return null;
            }
        };
        enre enreVar = enre.a;
        ensj.t(a2.a(callable, enreVar), new ccri(ccrkVar, this), enreVar);
    }

    public MdiSyncGcmChimeraBroadcastReceiver(eijr eijrVar, eijr eijrVar2) {
        this.b = eijrVar;
        this.c = eijy.a(eijrVar2);
    }
}

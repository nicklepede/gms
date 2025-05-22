package com.google.android.gms.mdisync.service;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.cezq;
import defpackage.cfac;
import defpackage.cfad;
import defpackage.cfae;
import defpackage.cfbg;
import defpackage.drrp;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.elgj;
import defpackage.elgo;
import defpackage.elqn;
import defpackage.elsn;
import defpackage.eqex;
import defpackage.eqft;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fsvs;
import java.util.concurrent.Callable;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MdiSyncGcmChimeraBroadcastReceiver extends BroadcastReceiver {
    private final ekww b;
    private final ekww c;

    public MdiSyncGcmChimeraBroadcastReceiver() {
        this(new ekww() { // from class: cfaf
            @Override // defpackage.ekww
            public final Object lK() {
                cexa a = cexa.a();
                return new cfae(new elqn(new cevx((cbgj) a.B.a(), new cewm((ekww) a.C.a(), new cewn((Context) a.d.a(), (drrp) a.E.a())), new aupz(2, 10), (drrp) a.E.a())), (drrp) a.E.a(), (ceyw) a.Q.a());
            }
        }, new ekww() { // from class: cfag
            @Override // defpackage.ekww
            public final Object lK() {
                return cexa.a().c();
            }
        });
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (!fsvs.g()) {
            ((drrp) this.c.lK()).b().ai(6395).x("Disabled - skipping GCM push notification handling.");
            return;
        }
        ((drrp) this.c.lK()).b().ai(6394).x("Received GCM push notification!");
        cfae cfaeVar = (cfae) this.b.lK();
        if (intent == null) {
            cfaeVar.b.b().ai(6393).x("Skipping push message handling due to null intent...");
            return;
        }
        beginAsync();
        int i = elgo.d;
        elgj elgjVar = new elgj();
        elsn listIterator = ((elqn) cfaeVar.a).listIterator();
        while (listIterator.hasNext()) {
            cezq cezqVar = (cezq) listIterator.next();
            if (cezqVar.c(intent)) {
                cfbg a = cezqVar.a();
                eqgl b = cezqVar.b(intent);
                elgjVar.i(b);
                eqgc.t(b, new cfad(cfaeVar, a), eqex.a);
            }
        }
        final elgo g = elgjVar.g();
        eqft a2 = eqgc.a(g);
        Callable callable = new Callable() { // from class: cfab
            @Override // java.util.concurrent.Callable
            public final Object call() {
                elgo elgoVar = elgo.this;
                int i2 = ((elpg) elgoVar).c;
                if (i2 > 1) {
                    throw new IllegalArgumentException("Message processed by multiple backends.");
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    ((eqgl) elgoVar.get(i3)).get();
                }
                return null;
            }
        };
        eqex eqexVar = eqex.a;
        eqgc.t(a2.a(callable, eqexVar), new cfac(cfaeVar, this), eqexVar);
    }

    public MdiSyncGcmChimeraBroadcastReceiver(ekww ekwwVar, ekww ekwwVar2) {
        this.b = ekwwVar;
        this.c = ekxd.a(ekwwVar2);
    }
}

package com.google.android.gms.fitness.service.history;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import defpackage.aupp;
import defpackage.ausn;
import defpackage.bidm;
import defpackage.bien;
import defpackage.bifs;
import defpackage.biky;
import defpackage.biwj;
import defpackage.biwp;
import defpackage.biwr;
import defpackage.bixr;
import defpackage.bjbk;
import defpackage.bzqb;
import defpackage.ekut;
import defpackage.elhz;
import defpackage.elja;
import defpackage.elpp;
import defpackage.eluo;
import defpackage.fqvm;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitHistoryChimeraBroker extends biwr {
    public FitHistoryChimeraBroker() {
        super("com.google.android.gms.fitness.service.history.FitHistoryBroker");
    }

    @Override // defpackage.biwl
    public final /* bridge */ /* synthetic */ biwj b(String str) {
        Set set;
        ExecutorService executorService = this.e;
        aupp auppVar = this.d;
        int g = (int) fqvm.g();
        long f = fqvm.f();
        int h = (int) fqvm.h();
        int d = (int) fqvm.d();
        int e = (int) fqvm.e();
        bien z = this.f.z();
        bidm e2 = this.f.e();
        this.f.a();
        bjbk bjbkVar = new bjbk(this, auppVar, g, f, h, d, e, z, e2);
        biky bikyVar = this.f;
        String G = fqvm.a.lK().G();
        ausn ausnVar = bifs.a;
        try {
            set = elhz.F(elja.j(bifs.b.l(G), new ekut() { // from class: bifr
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    return fkhh.a((String) obj);
                }
            }));
        } catch (IllegalArgumentException e3) {
            ((eluo) ((eluo) ((eluo) bifs.a.i()).s(e3)).ai((char) 4671)).P("Failed to parse DataType names:{%s} provided in flag:{%s}", G, "com.google.android.gms.fitness data_update_notification_allowed_data_types");
            set = elpp.a;
        }
        return new bixr(this, str, executorService, bjbkVar, bikyVar, set);
    }

    @Override // defpackage.biwl
    protected final bzqb c(Context context, biwp biwpVar) {
        return new bzqb(context, 57, d(), 3, biwpVar);
    }

    @Override // defpackage.biwl
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.HistoryApi".equals(intent.getAction());
    }

    @Override // defpackage.biwr, defpackage.biwl, android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (o()) {
            return true;
        }
        stopSelf();
        return true;
    }
}

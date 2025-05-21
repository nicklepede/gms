package com.google.android.gms.fitness.service.history;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import defpackage.aslv;
import defpackage.asot;
import defpackage.bfyw;
import defpackage.bfzx;
import defpackage.bgbc;
import defpackage.bggi;
import defpackage.bgrt;
import defpackage.bgrz;
import defpackage.bgsb;
import defpackage.bgtb;
import defpackage.bgwu;
import defpackage.bxhl;
import defpackage.eiho;
import defpackage.eiuu;
import defpackage.eivv;
import defpackage.ejck;
import defpackage.ejhf;
import defpackage.fodd;
import java.util.Set;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitHistoryChimeraBroker extends bgsb {
    public FitHistoryChimeraBroker() {
        super("com.google.android.gms.fitness.service.history.FitHistoryBroker");
    }

    @Override // defpackage.bgrv
    public final /* bridge */ /* synthetic */ bgrt b(String str) {
        Set set;
        ExecutorService executorService = this.e;
        aslv aslvVar = this.d;
        int g = (int) fodd.g();
        long f = fodd.f();
        int h = (int) fodd.h();
        int d = (int) fodd.d();
        int e = (int) fodd.e();
        bfzx z = this.f.z();
        bfyw e2 = this.f.e();
        this.f.a();
        bgwu bgwuVar = new bgwu(this, aslvVar, g, f, h, d, e, z, e2);
        bggi bggiVar = this.f;
        String G = fodd.a.a().G();
        asot asotVar = bgbc.a;
        try {
            set = eiuu.F(eivv.j(bgbc.b.l(G), new eiho() { // from class: bgbb
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    return fhrk.a((String) obj);
                }
            }));
        } catch (IllegalArgumentException e3) {
            ((ejhf) ((ejhf) ((ejhf) bgbc.a.i()).s(e3)).ah((char) 4661)).P("Failed to parse DataType names:{%s} provided in flag:{%s}", G, "com.google.android.gms.fitness data_update_notification_allowed_data_types");
            set = ejck.a;
        }
        return new bgtb(this, str, executorService, bgwuVar, bggiVar, set);
    }

    @Override // defpackage.bgrv
    protected final bxhl c(Context context, bgrz bgrzVar) {
        return new bxhl(context, 57, d(), 3, bgrzVar);
    }

    @Override // defpackage.bgrv
    protected final boolean h(Intent intent) {
        return "com.google.android.gms.fitness.HistoryApi".equals(intent.getAction());
    }

    @Override // defpackage.bgsb, defpackage.bgrv, android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (o()) {
            return true;
        }
        stopSelf();
        return true;
    }
}

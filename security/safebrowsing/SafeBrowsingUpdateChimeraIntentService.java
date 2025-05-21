package com.google.android.gms.security.safebrowsing;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.arco;
import defpackage.arcy;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.byko;
import defpackage.bykv;
import defpackage.cxyl;
import defpackage.cyrt;
import defpackage.cyxu;
import defpackage.dfbl;
import defpackage.fncn;
import defpackage.fnde;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SafeBrowsingUpdateChimeraIntentService extends IntentOperation {
    public static final long a = TimeUnit.HOURS.toMillis(20);

    public static void a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SafeBrowsingUpdateChimeraIntentService.class, "com.google.android.gms.security.safebrowsing.ACTION_SET_XLB_PERIODIC_UPDATE"));
    }

    private static void b(Context context) {
        aqxo aqxoVar;
        cyxu cyxuVar = new cyxu(context);
        if (System.currentTimeMillis() < Math.max(cyxuVar.d(), cyxuVar.c() + a)) {
            return;
        }
        try {
            aqxd aqxdVar = cxyl.a;
            aqxo aqxoVar2 = new aqxo(context, (boolean[]) null);
            arcy arcyVar = new arcy();
            arcyVar.d = 4202;
            arcyVar.a = new arco() { // from class: cxym
                @Override // defpackage.arco
                public final void d(Object obj, Object obj2) {
                    ((cxyz) ((cxzl) obj).H()).c(new cxyq((dfau) obj2));
                }
            };
            dfbl.o(aqxoVar2.iO(arcyVar.a()), 60L, TimeUnit.SECONDS);
            aqxo aqxoVar3 = new aqxo(context, (float[]) null);
            arcy arcyVar2 = new arcy();
            arcyVar2.d = 4207;
            arcyVar2.a = new arco() { // from class: cxyr
                @Override // defpackage.arco
                public final void d(Object obj, Object obj2) {
                    ((cxyz) ((cxzl) obj).H()).g(new cxys((dfau) obj2));
                }
            };
            dfbl.o(aqxoVar3.iO(arcyVar2.a()), 60L, TimeUnit.SECONDS);
            aqxoVar = new aqxo(context, (boolean[]) null);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            aqxd aqxdVar2 = cxyl.a;
            aqxoVar = new aqxo(context, (boolean[]) null);
        } catch (Throwable th) {
            aqxd aqxdVar3 = cxyl.a;
            new aqxo(context, (boolean[]) null).aw();
            throw th;
        }
        aqxoVar.aw();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.security.safebrowsing.ACTION_XLB_UPDATE".equals(action)) {
            b(this);
            return;
        }
        if ("com.google.android.gms.security.safebrowsing.ACTION_SET_XLB_PERIODIC_UPDATE".equals(action)) {
            if (fncn.k()) {
                byjl a2 = byjl.a(this);
                byko bykoVar = new byko();
                bykoVar.j = cyrt.c(SafeBrowsingUpdateTaskChimeraService.class);
                bykoVar.q("sb_periodic_updater");
                bykoVar.v(2);
                bykoVar.p = true;
                bykoVar.a = bykv.j;
                bykoVar.l(true);
                a2.f(bykoVar.b());
                return;
            }
            long j = a / 1000;
            bykm bykmVar = new bykm();
            bykmVar.j = cyrt.c(SafeBrowsingUpdateTaskChimeraService.class);
            bykmVar.t("sb_periodic_updater");
            bykmVar.p = true;
            bykmVar.v(1);
            bykmVar.y(0, 1);
            bykmVar.x(0, 1);
            if (fnde.i()) {
                bykmVar.j(byki.EVERY_20_HOURS);
            } else {
                bykmVar.a = j;
            }
            byjl a3 = byjl.a(this);
            if (a3 != null) {
                a3.f(bykmVar.b());
            }
        }
    }
}

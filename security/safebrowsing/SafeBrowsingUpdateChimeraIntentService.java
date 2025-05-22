package com.google.android.gms.security.safebrowsing;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aszs;
import defpackage.atad;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.catg;
import defpackage.catn;
import defpackage.daii;
import defpackage.dbbr;
import defpackage.dbhs;
import defpackage.dhmr;
import defpackage.fpum;
import defpackage.fpvd;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SafeBrowsingUpdateChimeraIntentService extends IntentOperation {
    public static final long a = TimeUnit.HOURS.toMillis(20);

    public static void a(Context context) {
        context.startService(IntentOperation.getStartIntent(context, SafeBrowsingUpdateChimeraIntentService.class, "com.google.android.gms.security.safebrowsing.ACTION_SET_XLB_PERIODIC_UPDATE"));
    }

    private static void b(Context context) {
        atad atadVar;
        dbhs dbhsVar = new dbhs(context);
        if (System.currentTimeMillis() < Math.max(dbhsVar.d(), dbhsVar.c() + a)) {
            return;
        }
        try {
            aszs aszsVar = daii.a;
            atad atadVar2 = new atad(context, (boolean[]) null);
            atfn atfnVar = new atfn();
            atfnVar.d = 4202;
            atfnVar.a = new atfd() { // from class: daij
                @Override // defpackage.atfd
                public final void d(Object obj, Object obj2) {
                    ((daiw) ((daji) obj).H()).c(new dain((dhma) obj2));
                }
            };
            dhmr.o(atadVar2.jd(atfnVar.a()), 60L, TimeUnit.SECONDS);
            atad atadVar3 = new atad(context, (float[]) null);
            atfn atfnVar2 = new atfn();
            atfnVar2.d = 4207;
            atfnVar2.a = new atfd() { // from class: daio
                @Override // defpackage.atfd
                public final void d(Object obj, Object obj2) {
                    ((daiw) ((daji) obj).H()).g(new daip((dhma) obj2));
                }
            };
            dhmr.o(atadVar3.jd(atfnVar2.a()), 60L, TimeUnit.SECONDS);
            atadVar = new atad(context, (boolean[]) null);
        } catch (InterruptedException | ExecutionException | TimeoutException unused) {
            aszs aszsVar2 = daii.a;
            atadVar = new atad(context, (boolean[]) null);
        } catch (Throwable th) {
            aszs aszsVar3 = daii.a;
            new atad(context, (boolean[]) null).av();
            throw th;
        }
        atadVar.av();
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
            if (fpum.k()) {
                casd a2 = casd.a(this);
                catg catgVar = new catg();
                catgVar.j = dbbr.c(SafeBrowsingUpdateTaskChimeraService.class);
                catgVar.q("sb_periodic_updater");
                catgVar.v(2);
                catgVar.p = true;
                catgVar.a = catn.j;
                catgVar.l(true);
                a2.f(catgVar.b());
                return;
            }
            long j = a / 1000;
            cate cateVar = new cate();
            cateVar.j = dbbr.c(SafeBrowsingUpdateTaskChimeraService.class);
            cateVar.t("sb_periodic_updater");
            cateVar.p = true;
            cateVar.v(1);
            cateVar.y(0, 1);
            cateVar.x(0, 1);
            if (fpvd.i()) {
                cateVar.j(cata.EVERY_20_HOURS);
            } else {
                cateVar.a = j;
            }
            casd a3 = casd.a(this);
            if (a3 != null) {
                a3.f(cateVar.b());
            }
        }
    }
}

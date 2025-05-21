package com.google.android.gms.semanticlocationhistory.geller;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.geller.GellerCleanupService;
import com.google.android.libraries.geller.portable.Geller;
import defpackage.asej;
import defpackage.asot;
import defpackage.asow;
import defpackage.aspx;
import defpackage.byln;
import defpackage.czin;
import defpackage.czix;
import defpackage.dahq;
import defpackage.eiho;
import defpackage.eiig;
import defpackage.eius;
import defpackage.eiuu;
import defpackage.ejfg;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fegx;
import defpackage.frvr;
import defpackage.frwe;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GellerCleanupService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.geller.GellerCleanupService";
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "GellerCleanup");
    private Geller c;
    private dahq d;

    private final dahq d() {
        if (this.d == null) {
            this.d = new dahq();
        }
        return this.d;
    }

    private final Geller e(Context context) {
        if (this.c == null) {
            int i = aspx.a;
            if (!asow.g(context, "geller_jni_lite_lib")) {
                ((ejhf) ((ejhf) b.j()).ah((char) 10453)).x("loadLibrary failed");
                return null;
            }
            this.c = new Geller(czin.a(context));
        }
        return this.c;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        Context a2 = AppContextProvider.a();
        if (e(a2) == null) {
            return ensj.i(2);
        }
        eius eiusVar = new eius();
        for (Account account : czix.d(a2)) {
            eiusVar.c(account.name);
        }
        eiuu g = eiusVar.g();
        if (frvr.a.a().d()) {
            Geller e = e(a2);
            eiig.x(e);
            e.q(g);
        }
        ejfg listIterator = g.listIterator();
        boolean z = true;
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            try {
                Geller e2 = e(a2);
                eiig.x(e2);
                e2.e(str).get();
                ((ejhf) ((ejhf) b.h()).ah(10455)).x("GellerCleanupService succeeded.");
            } catch (InterruptedException | ExecutionException e3) {
                if (e3 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                ((ejhf) ((ejhf) b.h()).ah((char) 10456)).x("GellerCleanupService failed.");
                z = false;
            }
        }
        Geller geller = this.c;
        if (geller != null) {
            geller.o();
            this.c = null;
        }
        return frwe.d() ? z ? enps.f(d().e("GellerCleanup", false), new eiho() { // from class: daxv
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                String str2 = GellerCleanupService.a;
                return 0;
            }
        }, enre.a) : enps.f(d().g("GellerCleanup", fegx.h(System.currentTimeMillis())), new eiho() { // from class: daxw
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                String str2 = GellerCleanupService.a;
                return 2;
            }
        }, enre.a) : ensj.i(0);
    }
}

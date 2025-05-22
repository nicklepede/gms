package com.google.android.gms.semanticlocationhistory.geller;

import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.geller.GellerCleanupService;
import com.google.android.libraries.geller.portable.Geller;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ausq;
import defpackage.autr;
import defpackage.cauf;
import defpackage.dbsl;
import defpackage.dbsv;
import defpackage.dcry;
import defpackage.ekut;
import defpackage.ekvl;
import defpackage.elhx;
import defpackage.elhz;
import defpackage.elsn;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fgvq;
import defpackage.fuql;
import defpackage.fuqy;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GellerCleanupService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.geller.GellerCleanupService";
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "GellerCleanup");
    private Geller c;
    private dcry d;

    private final dcry d() {
        if (this.d == null) {
            this.d = new dcry();
        }
        return this.d;
    }

    private final Geller e(Context context) {
        if (this.c == null) {
            int i = autr.a;
            if (!ausq.g(context, "geller_jni_lite_lib")) {
                ((eluo) ((eluo) b.j()).ai((char) 10459)).x("loadLibrary failed");
                return null;
            }
            this.c = new Geller(dbsl.a(context));
        }
        return this.c;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        Context a2 = AppContextProvider.a();
        if (e(a2) == null) {
            return eqgc.i(2);
        }
        elhx elhxVar = new elhx();
        for (Account account : dbsv.d(a2)) {
            elhxVar.c(account.name);
        }
        elhz g = elhxVar.g();
        if (fuql.a.lK().d()) {
            Geller e = e(a2);
            ekvl.y(e);
            e.q(g);
        }
        elsn listIterator = g.listIterator();
        boolean z = true;
        while (listIterator.hasNext()) {
            String str = (String) listIterator.next();
            try {
                Geller e2 = e(a2);
                ekvl.y(e2);
                e2.e(str).get();
                ((eluo) ((eluo) b.h()).ai(10461)).x("GellerCleanupService succeeded.");
            } catch (InterruptedException | ExecutionException e3) {
                if (e3 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                ((eluo) ((eluo) b.h()).ai((char) 10462)).x("GellerCleanupService failed.");
                z = false;
            }
        }
        Geller geller = this.c;
        if (geller != null) {
            geller.o();
            this.c = null;
        }
        return fuqy.d() ? z ? eqdl.f(d().e("GellerCleanup", false), new ekut() { // from class: ddid
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                String str2 = GellerCleanupService.a;
                return 0;
            }
        }, eqex.a) : eqdl.f(d().g("GellerCleanup", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: ddie
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                String str2 = GellerCleanupService.a;
                return 2;
            }
        }, eqex.a) : eqgc.i(0);
    }
}

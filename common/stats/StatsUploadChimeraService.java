package com.google.android.gms.common.stats;

import com.google.android.gms.chimera.modules.core.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asej;
import defpackage.asjg;
import defpackage.asjm;
import defpackage.asot;
import defpackage.bry;
import defpackage.byjl;
import defpackage.bykm;
import defpackage.bylf;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.fmsy;
import defpackage.fnbr;
import defpackage.fnde;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class StatsUploadChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("StatsUploadService", asej.CORE);
    private static final Map c;

    static {
        bry bryVar = new bry();
        c = bryVar;
        bryVar.put("primes", new asjg());
    }

    static void d(asjm asjmVar) {
        ((ejhf) b.h()).B("Turn off %s uploading", asjmVar.b());
        byjl.a(AppContextProvider.a()).d(asjmVar.b(), "com.google.android.gms.common.stats.StatsUploadService");
    }

    public static void e() {
        for (asjm asjmVar : c.values()) {
            long a2 = asjmVar.a();
            if (a2 == 0 || !asjmVar.c()) {
                d(asjmVar);
            } else {
                ((ejhf) b.h()).O("Scheduling %s upload every %d secs", asjmVar.b(), a2);
                bykm bykmVar = new bykm();
                bykmVar.j = "com.google.android.gms.common.stats.StatsUploadService";
                bykmVar.y(2, 2);
                bykmVar.x(1, 1);
                bykmVar.i(false);
                bykmVar.p = true;
                bykmVar.t(asjmVar.b());
                if (fnde.a.a().q()) {
                    bykmVar.e(a2, (long) (fnbr.b() * a2), bylf.a);
                } else {
                    bykmVar.a = a2;
                    bykmVar.b = 600L;
                }
                byjl.a(AppContextProvider.a()).f(bykmVar.b());
            }
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        Map map = c;
        String str = bylnVar.a;
        asjm asjmVar = (asjm) map.get(str);
        if (asjmVar == null) {
            ((ejhf) b.j()).B("Could not find StatsUploadTask: %s", str);
            return 2;
        }
        if (!asjmVar.c()) {
            d(asjmVar);
            return 0;
        }
        getApplication();
        asjmVar.d();
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        if (fmsy.c()) {
            return;
        }
        e();
    }
}

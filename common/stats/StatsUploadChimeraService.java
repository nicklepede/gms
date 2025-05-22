package com.google.android.gms.common.stats;

import com.google.android.gms.chimera.modules.core.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.auid;
import defpackage.auna;
import defpackage.aung;
import defpackage.ausn;
import defpackage.bsj;
import defpackage.casd;
import defpackage.cate;
import defpackage.catx;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.fpkw;
import defpackage.fptq;
import defpackage.fpvd;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class StatsUploadChimeraService extends GmsTaskChimeraService {
    public static final /* synthetic */ int a = 0;
    private static final ausn b = ausn.b("StatsUploadService", auid.CORE);
    private static final Map c;

    static {
        bsj bsjVar = new bsj();
        c = bsjVar;
        bsjVar.put("primes", new auna());
    }

    static void d(aung aungVar) {
        ((eluo) b.h()).B("Turn off %s uploading", aungVar.b());
        casd.a(AppContextProvider.a()).d(aungVar.b(), "com.google.android.gms.common.stats.StatsUploadService");
    }

    public static void e() {
        for (aung aungVar : c.values()) {
            long a2 = aungVar.a();
            if (a2 == 0 || !aungVar.c()) {
                d(aungVar);
            } else {
                ((eluo) b.h()).O("Scheduling %s upload every %d secs", aungVar.b(), a2);
                cate cateVar = new cate();
                cateVar.j = "com.google.android.gms.common.stats.StatsUploadService";
                cateVar.y(2, 2);
                cateVar.x(1, 1);
                cateVar.i(false);
                cateVar.p = true;
                cateVar.t(aungVar.b());
                if (fpvd.a.lK().q()) {
                    cateVar.e(a2, (long) (fptq.b() * a2), catx.a);
                } else {
                    cateVar.a = a2;
                    cateVar.b = 600L;
                }
                casd.a(AppContextProvider.a()).f(cateVar.b());
            }
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        Map map = c;
        String str = caufVar.a;
        aung aungVar = (aung) map.get(str);
        if (aungVar == null) {
            ((eluo) b.j()).B("Could not find StatsUploadTask: %s", str);
            return 2;
        }
        if (!aungVar.c()) {
            d(aungVar);
            return 0;
        }
        getApplication();
        aungVar.d();
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        if (fpkw.c()) {
            return;
        }
        e();
    }
}

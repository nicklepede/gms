package com.google.android.gms.common.config;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cate;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.fpse;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PhenotypeCheckinChimeraService extends GmsTaskChimeraService {
    private static final ausn a = ausn.b("phenotype_checkin", auid.CORE);

    public static void d(Context context) {
        casd a2 = casd.a(context);
        cate cateVar = new cate();
        cateVar.a = fpse.a.lK().b();
        cateVar.j = "com.google.android.gms.common.config.PhenotypeCheckinService";
        cateVar.p = true;
        cateVar.y(0, 0);
        cateVar.x(0, 0);
        cateVar.i(false);
        cateVar.v(1);
        cateVar.i(true);
        cateVar.t("phenotype_checkin");
        a2.f(cateVar.b());
    }

    private final void e(Class cls) {
        Intent startIntent = IntentOperation.getStartIntent(this, cls, "com.google.android.gms.phenotype.DAILY_CHECKIN");
        if (startIntent == null) {
            ((eluo) a.i()).B("Failed to get IntentOperation for '%s'", "com.google.android.gms.phenotype.DAILY_CHECKIN");
        } else {
            startService(startIntent);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        e(PhenotypeRegistrationOperation.class);
        e(PhenotypeUpdateOperation.class);
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        d(this);
    }
}

package com.google.android.gms.common.config;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.bykm;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.fnaf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PhenotypeCheckinChimeraService extends GmsTaskChimeraService {
    private static final asot a = asot.b("phenotype_checkin", asej.CORE);

    public static void d(Context context) {
        byjl a2 = byjl.a(context);
        bykm bykmVar = new bykm();
        bykmVar.a = fnaf.a.a().b();
        bykmVar.j = "com.google.android.gms.common.config.PhenotypeCheckinService";
        bykmVar.p = true;
        bykmVar.y(0, 0);
        bykmVar.x(0, 0);
        bykmVar.i(false);
        bykmVar.v(1);
        bykmVar.i(true);
        bykmVar.t("phenotype_checkin");
        a2.f(bykmVar.b());
    }

    private final void e(Class cls) {
        Intent startIntent = IntentOperation.getStartIntent(this, cls, "com.google.android.gms.phenotype.DAILY_CHECKIN");
        if (startIntent == null) {
            ((ejhf) a.i()).B("Failed to get IntentOperation for '%s'", "com.google.android.gms.phenotype.DAILY_CHECKIN");
        } else {
            startService(startIntent);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        e(PhenotypeRegistrationOperation.class);
        e(PhenotypeUpdateOperation.class);
        return 0;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void fR() {
        d(this);
    }
}

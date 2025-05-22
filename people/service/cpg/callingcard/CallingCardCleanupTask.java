package com.google.android.gms.people.service.cpg.callingcard;

import com.google.android.gms.chimera.modules.people.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.catg;
import defpackage.cauf;
import defpackage.cwhj;
import defpackage.eluo;
import defpackage.fttd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class CallingCardCleanupTask extends GmsTaskBoundService {
    private static final ausn a = ausn.b("CallingCardCleanup", auid.PEOPLE);

    public static void d(casd casdVar) {
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 8334)).x("Initializing the service.");
        if (!fttd.k()) {
            ((eluo) ((eluo) ausnVar.h()).ai((char) 8333)).x("Canceling the service.");
            casdVar.d("CallingCardCleanupTask.Periodic", ".people.service.cpg.callingcard.CallingCardCleanupTask");
            return;
        }
        ((eluo) ((eluo) ausnVar.h()).ai((char) 8335)).x("Scheduling the service.");
        catg catgVar = new catg();
        catgVar.w(".people.service.cpg.callingcard.CallingCardCleanupTask");
        catgVar.t("CallingCardCleanupTask.Periodic");
        catgVar.v(2);
        catgVar.l(false);
        catgVar.m((int) fttd.a.lK().b());
        casdVar.f(catgVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 8336)).x("onRunTask");
        ((eluo) ((eluo) ausnVar.h()).ai((char) 8337)).x("Running CallingCardCleanup");
        return (fttd.k() && cwhj.a.b(AppContextProvider.a())) ? 0 : 2;
    }
}

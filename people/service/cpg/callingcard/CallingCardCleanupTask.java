package com.google.android.gms.people.service.cpg.callingcard;

import com.google.android.gms.chimera.modules.people.AppContextProvider;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byko;
import defpackage.byln;
import defpackage.ctyd;
import defpackage.ejhf;
import defpackage.fqzi;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class CallingCardCleanupTask extends GmsTaskBoundService {
    private static final asot a = asot.b("CallingCardCleanup", asej.PEOPLE);

    public static void d(byjl byjlVar) {
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 8381)).x("Initializing the service.");
        if (!fqzi.k()) {
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 8380)).x("Canceling the service.");
            byjlVar.d("CallingCardCleanupTask.Periodic", ".people.service.cpg.callingcard.CallingCardCleanupTask");
            return;
        }
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 8382)).x("Scheduling the service.");
        byko bykoVar = new byko();
        bykoVar.w(".people.service.cpg.callingcard.CallingCardCleanupTask");
        bykoVar.t("CallingCardCleanupTask.Periodic");
        bykoVar.v(2);
        bykoVar.l(false);
        bykoVar.m((int) fqzi.a.a().b());
        byjlVar.f(bykoVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 8383)).x("onRunTask");
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 8384)).x("Running CallingCardCleanup");
        return (fqzi.k() && ctyd.a.b(AppContextProvider.a())) ? 0 : 2;
    }
}

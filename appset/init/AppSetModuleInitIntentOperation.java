package com.google.android.gms.appset.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.appset.tasks.AppSetIdRemovalTaskService;
import com.google.android.gms.appset.tasks.DeveloperGroupIdRefreshTaskService;
import com.google.android.gms.chimera.modules.appset.AppContextProvider;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byki;
import defpackage.bykm;
import defpackage.fkan;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppSetModuleInitIntentOperation extends anya {
    static {
        asot.b("AppSetModuleInit", asej.APP_SET_ID);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        Context a = AppContextProvider.a();
        int i2 = AppSetIdRemovalTaskService.a;
        if (fkan.g()) {
            long i3 = fkan.a.a().i();
            byjl a2 = byjl.a(a);
            bykm bykmVar = new bykm();
            bykmVar.w(AppSetIdRemovalTaskService.class.getName());
            bykmVar.t("appsetid-removal-task");
            bykmVar.j(byki.a(i3));
            bykmVar.y(2, 2);
            bykmVar.x(0, 0);
            a2.f(bykmVar.b());
        }
        Context a3 = AppContextProvider.a();
        int i4 = DeveloperGroupIdRefreshTaskService.b;
        if (fkan.e()) {
            long b = fkan.a.a().b();
            byjl a4 = byjl.a(a3);
            bykm bykmVar2 = new bykm();
            bykmVar2.w(DeveloperGroupIdRefreshTaskService.class.getName());
            bykmVar2.t("developerid-refresh-task");
            bykmVar2.j(byki.a(b));
            bykmVar2.y(2, 2);
            bykmVar2.x(0, 0);
            a4.f(bykmVar2.b());
        }
    }
}

package com.google.android.gms.appset.init;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.appset.tasks.AppSetIdRemovalTaskService;
import com.google.android.gms.appset.tasks.DeveloperGroupIdRefreshTaskService;
import com.google.android.gms.chimera.modules.appset.AppContextProvider;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cata;
import defpackage.cate;
import defpackage.fmqs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppSetModuleInitIntentOperation extends apzs {
    static {
        ausn.b("AppSetModuleInit", auid.APP_SET_ID);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        Context a = AppContextProvider.a();
        int i2 = AppSetIdRemovalTaskService.a;
        if (fmqs.g()) {
            long i3 = fmqs.a.lK().i();
            casd a2 = casd.a(a);
            cate cateVar = new cate();
            cateVar.w(AppSetIdRemovalTaskService.class.getName());
            cateVar.t("appsetid-removal-task");
            cateVar.j(cata.a(i3));
            cateVar.y(2, 2);
            cateVar.x(0, 0);
            a2.f(cateVar.b());
        }
        Context a3 = AppContextProvider.a();
        int i4 = DeveloperGroupIdRefreshTaskService.b;
        if (fmqs.e()) {
            long b = fmqs.a.lK().b();
            casd a4 = casd.a(a3);
            cate cateVar2 = new cate();
            cateVar2.w(DeveloperGroupIdRefreshTaskService.class.getName());
            cateVar2.t("developerid-refresh-task");
            cateVar2.j(cata.a(b));
            cateVar2.y(2, 2);
            cateVar2.x(0, 0);
            a4.f(cateVar2.b());
        }
    }
}

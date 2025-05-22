package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.casd;
import defpackage.catb;
import defpackage.catp;
import defpackage.cauf;
import defpackage.fnuf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneHubInitializationGmsTaskBoundService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    public static void d(Context context) {
        if (!fnuf.L()) {
            casd a2 = casd.a(context);
            catb catbVar = new catb();
            catbVar.w(PhoneHubInitializationGmsTaskBoundService.class.getName());
            catbVar.t("PhoneHubInitialization");
            catbVar.e(fnuf.c(), fnuf.c() + fnuf.a.lK().m());
            catbVar.v(0);
            catbVar.x(0, 0);
            catbVar.g(2);
            a2.f(catbVar.b());
            return;
        }
        casd a3 = casd.a(context);
        catb catbVar2 = new catb();
        catbVar2.w(PhoneHubInitializationGmsTaskBoundService.class.getName());
        catbVar2.t("PhoneHubInitialization");
        catbVar2.e(60L, 120L);
        catbVar2.t = catp.a(0, 60, 3600);
        catbVar2.v(0);
        catbVar2.x(0, 0);
        catbVar2.g(2);
        a3.f(catbVar2.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!fnuf.K()) {
            return 2;
        }
        startService(PhoneHubChimeraService.a(this));
        return fnuf.L() ? 1 : 0;
    }
}

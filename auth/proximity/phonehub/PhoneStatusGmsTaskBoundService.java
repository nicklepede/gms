package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.aewa;
import defpackage.aewb;
import defpackage.auad;
import defpackage.casd;
import defpackage.catb;
import defpackage.cauf;
import defpackage.fnuf;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhoneStatusGmsTaskBoundService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final auad b = new auad("ProximityAuth", "PhoneStatusGmsTaskBoundService");

    public static void d(Context context) {
        casd a2 = casd.a(context);
        catb catbVar = new catb();
        catbVar.w(PhoneStatusGmsTaskBoundService.class.getName());
        catbVar.t("PhoneHubStatusUpdate");
        catbVar.e(fnuf.b(), fnuf.b() + fnuf.a.lK().j());
        catbVar.v(0);
        catbVar.x(0, 0);
        catbVar.g(2);
        a2.f(catbVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!fnuf.C()) {
            b.m("Trying to run task when flag is disabled!", new Object[0]);
            return 2;
        }
        Iterator it = aewb.b().d().iterator();
        while (it.hasNext()) {
            ((aewa) it.next()).n();
        }
        d(getApplicationContext());
        return 0;
    }
}

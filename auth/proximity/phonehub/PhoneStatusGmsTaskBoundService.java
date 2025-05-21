package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.acwa;
import defpackage.acwb;
import defpackage.arxo;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.byln;
import defpackage.flcw;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhoneStatusGmsTaskBoundService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;
    private static final arxo b = new arxo("ProximityAuth", "PhoneStatusGmsTaskBoundService");

    public static void d(Context context) {
        byjl a2 = byjl.a(context);
        bykj bykjVar = new bykj();
        bykjVar.w(PhoneStatusGmsTaskBoundService.class.getName());
        bykjVar.t("PhoneHubStatusUpdate");
        bykjVar.e(flcw.b(), flcw.b() + flcw.a.a().j());
        bykjVar.v(0);
        bykjVar.x(0, 0);
        bykjVar.g(2);
        a2.f(bykjVar.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!flcw.C()) {
            b.m("Trying to run task when flag is disabled!", new Object[0]);
            return 2;
        }
        Iterator it = acwb.b().d().iterator();
        while (it.hasNext()) {
            ((acwa) it.next()).n();
        }
        d(getApplicationContext());
        return 0;
    }
}

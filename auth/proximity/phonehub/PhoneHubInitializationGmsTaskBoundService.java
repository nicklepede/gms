package com.google.android.gms.auth.proximity.phonehub;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.bykx;
import defpackage.byln;
import defpackage.flcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhoneHubInitializationGmsTaskBoundService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    public static void d(Context context) {
        if (!flcw.L()) {
            byjl a2 = byjl.a(context);
            bykj bykjVar = new bykj();
            bykjVar.w(PhoneHubInitializationGmsTaskBoundService.class.getName());
            bykjVar.t("PhoneHubInitialization");
            bykjVar.e(flcw.c(), flcw.c() + flcw.a.a().m());
            bykjVar.v(0);
            bykjVar.x(0, 0);
            bykjVar.g(2);
            a2.f(bykjVar.b());
            return;
        }
        byjl a3 = byjl.a(context);
        bykj bykjVar2 = new bykj();
        bykjVar2.w(PhoneHubInitializationGmsTaskBoundService.class.getName());
        bykjVar2.t("PhoneHubInitialization");
        bykjVar2.e(60L, 120L);
        bykjVar2.t = bykx.a(0, 60, 3600);
        bykjVar2.v(0);
        bykjVar2.x(0, 0);
        bykjVar2.g(2);
        a3.f(bykjVar2.b());
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!flcw.K()) {
            return 2;
        }
        startService(PhoneHubChimeraService.a(this));
        return flcw.L() ? 1 : 0;
    }
}

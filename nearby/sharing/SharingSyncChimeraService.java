package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.byjl;
import defpackage.bykm;
import defpackage.bykn;
import defpackage.byln;
import defpackage.cfcs;
import defpackage.cmfe;
import defpackage.fqmf;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SharingSyncChimeraService extends GmsTaskChimeraService {
    public static void d(Context context) {
        byjl.a(context).d("SharingServerSync", "com.google.android.gms.nearby.sharing.SharingSyncService");
    }

    public static void e(Context context, long j) {
        byjl a = byjl.a(context);
        bykm bykmVar = new bykm();
        bykmVar.j = "com.google.android.gms.nearby.sharing.SharingSyncService";
        bykmVar.x(0, 1);
        bykmVar.y(0, 1);
        bykmVar.t("SharingServerSync");
        bykmVar.a = j;
        bykmVar.b = (long) (j * fqmf.a.a().a());
        bykn b = bykmVar.b();
        try {
            a.d("SharingServerSync", "com.google.android.gms.nearby.sharing.SharingSyncService");
            a.f(b);
            cmfe.a.b().h("Scheduled SharingSyncChimeraService periodic task, period: %s hrs", Long.valueOf(TimeUnit.SECONDS.toHours(j)));
        } catch (IllegalArgumentException e) {
            cmfe.a.e().f(e).p("Failed to schedule server sync task.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        cmfe.a.b().p("SharingSyncChimeraService periodic task firing now.", new Object[0]);
        Intent intent = new Intent("com.google.android.gms.nearby.sharing.SYNC_SERVER");
        intent.setPackage(getPackageName());
        cfcs.d(this, intent);
        return 0;
    }
}

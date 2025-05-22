package com.google.android.gms.nearby.sharing;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.casd;
import defpackage.cate;
import defpackage.catf;
import defpackage.cauf;
import defpackage.chke;
import defpackage.conm;
import defpackage.ftga;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SharingSyncChimeraService extends GmsTaskChimeraService {
    public static void d(Context context) {
        casd.a(context).d("SharingServerSync", "com.google.android.gms.nearby.sharing.SharingSyncService");
    }

    public static void e(Context context, long j) {
        casd a = casd.a(context);
        cate cateVar = new cate();
        cateVar.j = "com.google.android.gms.nearby.sharing.SharingSyncService";
        cateVar.x(0, 1);
        cateVar.y(0, 1);
        cateVar.t("SharingServerSync");
        cateVar.a = j;
        cateVar.b = (long) (j * ftga.a.lK().a());
        catf b = cateVar.b();
        try {
            a.d("SharingServerSync", "com.google.android.gms.nearby.sharing.SharingSyncService");
            a.f(b);
            conm.a.b().h("Scheduled SharingSyncChimeraService periodic task, period: %s hrs", Long.valueOf(TimeUnit.SECONDS.toHours(j)));
        } catch (IllegalArgumentException e) {
            conm.a.e().f(e).p("Failed to schedule server sync task.", new Object[0]);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        conm.a.b().p("SharingSyncChimeraService periodic task firing now.", new Object[0]);
        Intent intent = new Intent("com.google.android.gms.nearby.sharing.SYNC_SERVER");
        intent.setPackage(getPackageName());
        chke.d(this, intent);
        return 0;
    }
}

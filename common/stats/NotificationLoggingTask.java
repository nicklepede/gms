package com.google.android.gms.common.stats;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.abnj$$ExternalSyntheticApiModelOutline0;
import defpackage.asaw;
import defpackage.asbb;
import defpackage.asbn;
import defpackage.asbo;
import defpackage.asbr;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.ejhf;
import defpackage.fmys;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class NotificationLoggingTask extends GmsTaskBoundService {
    private static final asot b = asot.b("NotificationLoggingTask", asej.CORE);
    static final String a = NotificationLoggingTask.class.getName();

    public static boolean d() {
        return fmys.c() && fmys.a.a().c();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        String id;
        String id2;
        if (!d()) {
            ((ejhf) b.j()).x("Unable to run daily task: notification logging flag is disabled.");
            return 2;
        }
        Context applicationContext = getApplicationContext();
        asot asotVar = asaw.a;
        asbo f = asbo.f(applicationContext);
        asaw asawVar = f == null ? null : new asaw(f, new asbb(null, 0));
        if (asawVar == null) {
            ((ejhf) b.j()).x("Unable to run daily task: notification logger is null.");
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            List i = asawVar.b.i();
            if (i == null || i.isEmpty()) {
                ((ejhf) ((ejhf) asaw.a.j()).ah((char) 3211)).x("No notification channels to log in a daily snapshot");
            } else {
                i.size();
                Iterator it = i.iterator();
                while (it.hasNext()) {
                    NotificationChannel m = abnj$$ExternalSyntheticApiModelOutline0.m(it.next());
                    if (asbr.b(m)) {
                        asbn asbnVar = asawVar.c;
                        id2 = m.getId();
                        asbnVar.e(id2);
                    } else {
                        asbn asbnVar2 = asawVar.c;
                        id = m.getId();
                        asbnVar2.f(id);
                    }
                    m.getId();
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (asawVar.b.x()) {
                asawVar.c.e(null);
            } else {
                asawVar.c.f(null);
            }
        }
        return 0;
    }
}

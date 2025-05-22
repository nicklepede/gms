package com.google.android.gms.common.stats;

import android.app.NotificationChannel;
import android.content.Context;
import android.os.Build;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.abnm$$ExternalSyntheticApiModelOutline0;
import defpackage.audl;
import defpackage.audq;
import defpackage.auec;
import defpackage.aued;
import defpackage.aueg;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.eluo;
import defpackage.fpqr;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class NotificationLoggingTask extends GmsTaskBoundService {
    private static final ausn b = ausn.b("NotificationLoggingTask", auid.CORE);
    static final String a = NotificationLoggingTask.class.getName();

    public static boolean d() {
        return fpqr.c() && fpqr.a.lK().c();
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        String id;
        String id2;
        if (!d()) {
            ((eluo) b.j()).x("Unable to run daily task: notification logging flag is disabled.");
            return 2;
        }
        Context applicationContext = getApplicationContext();
        ausn ausnVar = audl.a;
        aued f = aued.f(applicationContext);
        audl audlVar = f == null ? null : new audl(f, new audq(null, 0));
        if (audlVar == null) {
            ((eluo) b.j()).x("Unable to run daily task: notification logger is null.");
            return 2;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            List i = audlVar.b.i();
            if (i == null || i.isEmpty()) {
                ((eluo) ((eluo) audl.a.j()).ai((char) 3215)).x("No notification channels to log in a daily snapshot");
            } else {
                i.size();
                Iterator it = i.iterator();
                while (it.hasNext()) {
                    NotificationChannel m = abnm$$ExternalSyntheticApiModelOutline0.m(it.next());
                    if (aueg.b(m)) {
                        auec auecVar = audlVar.c;
                        id2 = m.getId();
                        auecVar.e(id2);
                    } else {
                        auec auecVar2 = audlVar.c;
                        id = m.getId();
                        auecVar2.f(id);
                    }
                    m.getId();
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            if (audlVar.b.x()) {
                audlVar.c.e(null);
            } else {
                audlVar.c.f(null);
            }
        }
        return 0;
    }
}

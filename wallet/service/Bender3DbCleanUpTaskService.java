package com.google.android.gms.wallet.service;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.wallet.bender3.framework.storage.Bender3Database;
import defpackage.byln;
import defpackage.eehn;
import defpackage.eehx;
import defpackage.eeic;
import defpackage.eeih;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fvaq;
import defpackage.fvbo;
import defpackage.ksa;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class Bender3DbCleanUpTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        Bender3Database a2;
        Context applicationContext = getApplicationContext();
        fvbo.f(applicationContext, "context");
        eehn eehnVar = eehn.a;
        fvbo.f(applicationContext, "context");
        Bender3Database bender3Database = eehn.b;
        if (bender3Database == null) {
            synchronized (eehnVar) {
                bender3Database = eehn.b;
                if (bender3Database == null) {
                    a2 = Bender3Database.l.a(applicationContext, eeih.a);
                    eehn.b = a2;
                    bender3Database = a2;
                }
            }
        }
        eehx x = bender3Database.x();
        final long currentTimeMillis = System.currentTimeMillis();
        ksa.a(((eeic) x).a, false, true, new fvaq() { // from class: eeia
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                kri a3 = ((kqz) obj).a("DELETE FROM sessionTable WHERE expirationTime < ? ");
                try {
                    a3.f(1, currentTimeMillis);
                    a3.k();
                    a3.close();
                    return null;
                } catch (Throwable th) {
                    a3.close();
                    throw th;
                }
            }
        });
        return ensj.i(0);
    }
}

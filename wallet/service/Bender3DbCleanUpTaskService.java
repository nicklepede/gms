package com.google.android.gms.wallet.service;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.wallet.bender3.framework.storage.Bender3Database;
import defpackage.cauf;
import defpackage.eguq;
import defpackage.egva;
import defpackage.egvf;
import defpackage.egvk;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fxwo;
import defpackage.fxxm;
import defpackage.mkv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class Bender3DbCleanUpTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        Bender3Database a2;
        Context applicationContext = getApplicationContext();
        fxxm.f(applicationContext, "context");
        eguq eguqVar = eguq.a;
        fxxm.f(applicationContext, "context");
        Bender3Database bender3Database = eguq.b;
        if (bender3Database == null) {
            synchronized (eguqVar) {
                bender3Database = eguq.b;
                if (bender3Database == null) {
                    a2 = Bender3Database.m.a(applicationContext, egvk.a);
                    eguq.b = a2;
                    bender3Database = a2;
                }
            }
        }
        egva x = bender3Database.x();
        final long currentTimeMillis = System.currentTimeMillis();
        mkv.a(((egvf) x).a, false, true, new fxwo() { // from class: egvd
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                mjx a3 = ((mjo) obj).a("DELETE FROM sessionTable WHERE expirationTime < ? ");
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
        return eqgc.i(0);
    }
}

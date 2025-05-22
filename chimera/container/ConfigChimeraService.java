package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.apzx;
import defpackage.aqas;
import defpackage.aqat;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.cauf;
import defpackage.ekxj;
import defpackage.elgo;
import defpackage.elpg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ConfigChimeraService extends GmsTaskChimeraService {
    public static final ausn a = ausn.b("ChimeraConfigService", auid.CHIMERA);
    private static volatile aqat b = null;

    public static aqat d() {
        aqat aqatVar;
        aqat aqatVar2 = b;
        if (aqatVar2 != null) {
            return aqatVar2;
        }
        synchronized (ConfigChimeraService.class) {
            aqatVar = b;
            if (aqatVar == null) {
                aqatVar = new aqat();
                b = aqatVar;
            }
        }
        return aqatVar;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        int i;
        synchronized (this) {
            apzx d = apzx.d(this);
            Bundle bundle = caufVar.b;
            int i2 = new int[]{1, 2, 3, 4, 5, 6, 7}[bundle == null ? 0 : bundle.getInt("reason", 0)];
            if (bundle != null && bundle.getBoolean("allowRetry", false)) {
                d();
                d.i(0);
            }
            if (!"ChimeraConfigService_OneOffRetry".equals(caufVar.a)) {
                casd.a(this).d("ChimeraConfigService_OneOffRetry", "com.google.android.gms.chimera.container.ConfigService");
            }
            try {
                aqas a2 = aqas.a(this);
                int i3 = elgo.d;
                boolean i4 = a2.i(i2, d, elpg.a, null);
                d().a(this, d);
                i = true != i4 ? 2 : 0;
            } catch (Throwable th) {
                d().a(this, d);
                throw th;
            }
        }
        return i;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final void gf() {
        Intent startIntent = IntentOperation.getStartIntent(this, InitConfigOperation.class, "com.google.android.gms.chimera.container.ACTION_START_PERIODIC_CHECKIN");
        ekxj.e(startIntent);
        startService(startIntent);
    }
}

package com.google.android.gms.chimera.container;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.anyf;
import defpackage.anza;
import defpackage.anzb;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.byln;
import defpackage.eike;
import defpackage.eitj;
import defpackage.ejcb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ConfigChimeraService extends GmsTaskChimeraService {
    public static final asot a = asot.b("ChimeraConfigService", asej.CHIMERA);
    private static volatile anzb b = null;

    public static anzb d() {
        anzb anzbVar;
        anzb anzbVar2 = b;
        if (anzbVar2 != null) {
            return anzbVar2;
        }
        synchronized (ConfigChimeraService.class) {
            anzbVar = b;
            if (anzbVar == null) {
                anzbVar = new anzb();
                b = anzbVar;
            }
        }
        return anzbVar;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        int i;
        synchronized (this) {
            anyf d = anyf.d(this);
            Bundle bundle = bylnVar.b;
            int i2 = new int[]{1, 2, 3, 4, 5, 6, 7}[bundle == null ? 0 : bundle.getInt("reason", 0)];
            if (bundle != null && bundle.getBoolean("allowRetry", false)) {
                d();
                d.i(0);
            }
            if (!"ChimeraConfigService_OneOffRetry".equals(bylnVar.a)) {
                byjl.a(this).d("ChimeraConfigService_OneOffRetry", "com.google.android.gms.chimera.container.ConfigService");
            }
            try {
                anza a2 = anza.a(this);
                int i3 = eitj.d;
                boolean i4 = a2.i(i2, d, ejcb.a, null);
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
    public final void fR() {
        Intent startIntent = IntentOperation.getStartIntent(this, InitConfigOperation.class, "com.google.android.gms.chimera.container.ACTION_START_PERIODIC_CHECKIN");
        eike.e(startIntent);
        startService(startIntent);
    }
}

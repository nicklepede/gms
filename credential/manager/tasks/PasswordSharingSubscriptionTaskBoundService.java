package com.google.android.gms.credential.manager.tasks;

import defpackage.asej;
import defpackage.asot;
import defpackage.avws;
import defpackage.awvx;
import defpackage.byln;
import defpackage.fuyx;
import defpackage.fvbo;
import defpackage.fvgt;
import defpackage.fvid;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class PasswordSharingSubscriptionTaskBoundService extends Pommel_PasswordSharingSubscriptionTaskBoundService {
    public static final asot a = asot.b("PasswordSharingSubscriptionTaskBoundService", asej.CREDENTIAL_MANAGER);
    public avws b;
    public fuyx c;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        fuyx fuyxVar = this.c;
        if (fuyxVar == null) {
            fvbo.j("lowPowerContext");
            fuyxVar = null;
        }
        fvgt.b(fvid.b(fuyxVar), null, null, new awvx(this, null), 3);
        return 0;
    }
}

package com.google.android.gms.credential.manager.tasks;

import defpackage.auid;
import defpackage.ausn;
import defpackage.axsr;
import defpackage.ayzu;
import defpackage.cauf;
import defpackage.fxuv;
import defpackage.fxxm;
import defpackage.fycr;
import defpackage.fyeb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PasswordChangesSubscriptionTaskBoundService extends Pommel_PasswordChangesSubscriptionTaskBoundService {
    public static final ausn a = ausn.b("PasswordChangesSubscriptionTaskBoundService", auid.CREDENTIAL_MANAGER);
    public axsr b;
    public fxuv c;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        fxuv fxuvVar = this.c;
        if (fxuvVar == null) {
            fxxm.j("lowPowerContext");
            fxuvVar = null;
        }
        fycr.b(fyeb.b(fxuvVar), null, null, new ayzu(this, null), 3);
        return 0;
    }
}

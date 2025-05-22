package com.google.android.gms.networktransparency.init;

import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.cubt;
import defpackage.cuck;
import defpackage.eqgl;
import defpackage.fxuv;
import defpackage.fxxm;
import defpackage.fyeb;
import defpackage.fyqe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class NetworkDataUpdateTaskBoundService extends Pommel_NetworkDataUpdateTaskBoundService {
    public static final ausn a = ausn.b("NetworkTransparency", auid.NETWORKTRANSPARENCY);
    public cuck b;
    public fxuv c;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        fxuv fxuvVar = this.c;
        if (fxuvVar == null) {
            fxxm.j("coroutineContext");
            fxuvVar = null;
        }
        return fyqe.d(fyeb.b(fxuvVar), new cubt(this, null));
    }
}

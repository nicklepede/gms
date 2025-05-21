package com.google.android.gms.networktransparency.init;

import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.crso;
import defpackage.crtf;
import defpackage.enss;
import defpackage.fuyx;
import defpackage.fuyy;
import defpackage.fvbo;
import defpackage.fvid;
import defpackage.fvie;
import defpackage.fvug;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class NetworkDataUpdateTaskBoundService extends Pommel_NetworkDataUpdateTaskBoundService {
    public static final asot a = asot.b("NetworkTransparency", asej.NETWORKTRANSPARENCY);
    public crtf b;
    public fuyx c;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        enss b;
        fuyx fuyxVar = this.c;
        if (fuyxVar == null) {
            fvbo.j("coroutineContext");
            fuyxVar = null;
        }
        b = fvug.b(fvid.b(fuyxVar), fuyy.a, fvie.a, new crso(this, null));
        return b;
    }
}

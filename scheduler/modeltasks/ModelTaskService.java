package com.google.android.gms.scheduler.modeltasks;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asot;
import defpackage.bqpn;
import defpackage.byln;
import defpackage.cyeg;
import defpackage.enss;
import defpackage.fuyx;
import defpackage.fuyy;
import defpackage.fvic;
import defpackage.fvid;
import defpackage.fvie;
import defpackage.fvug;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class ModelTaskService extends GmsTaskBoundService {
    public static final /* synthetic */ int b = 0;
    public final asot a;
    private final fvic c;

    public ModelTaskService() {
        fuyx fuyxVar = bqpn.a;
        this.c = fvid.b(bqpn.b);
        this.a = asot.a("ModelTaskService");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        enss b2;
        b2 = fvug.b(this.c, fuyy.a, fvie.a, new cyeg(this, bylnVar, null));
        return b2;
    }
}

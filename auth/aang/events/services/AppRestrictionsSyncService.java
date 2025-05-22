package com.google.android.gms.auth.aang.events.services;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.cbgj;
import defpackage.dtlq;
import defpackage.wsh;
import defpackage.wst;
import defpackage.xid;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AppRestrictionsSyncService extends GmsTaskBoundService {
    private final Executor a = new aupz(1, 9);

    static {
        ausn.c("Auth", auid.GOOGLE_AUTH_AANG, "AppRestrictionsSyncService");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        dtlq a = wsh.a().a(caufVar.a);
        if (((xid) a.a).ordinal() != 1) {
            return 0;
        }
        cbgj c = wsh.c();
        return c.n(c.a(a, new wst(), this.a));
    }
}

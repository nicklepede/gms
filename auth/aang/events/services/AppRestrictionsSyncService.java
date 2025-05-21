package com.google.android.gms.auth.aang.events.services;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.byln;
import defpackage.byxs;
import defpackage.drbi;
import defpackage.uwi;
import defpackage.uwu;
import defpackage.vmc;
import java.util.concurrent.Executor;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AppRestrictionsSyncService extends GmsTaskBoundService {
    private final Executor a = new asmf(1, 9);

    static {
        asot.c("Auth", asej.GOOGLE_AUTH_AANG, "AppRestrictionsSyncService");
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        drbi a = uwi.a().a(bylnVar.a);
        if (((vmc) a.a).ordinal() != 1) {
            return 0;
        }
        byxs c = uwi.c();
        return c.n(c.a(a, new uwu(), this.a));
    }
}

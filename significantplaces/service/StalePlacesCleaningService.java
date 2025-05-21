package com.google.android.gms.significantplaces.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bqpn;
import defpackage.byln;
import defpackage.dcis;
import defpackage.dcit;
import defpackage.ejhf;
import defpackage.enss;
import defpackage.fuyx;
import defpackage.fuyy;
import defpackage.fvid;
import defpackage.fvie;
import defpackage.fvug;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class StalePlacesCleaningService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        enss b;
        try {
            fuyx fuyxVar = bqpn.a;
            b = fvug.b(fvid.b(bqpn.b), fuyy.a, fvie.a, new dcis(this, null));
            b.get();
            return 0;
        } catch (InterruptedException e) {
            ((ejhf) ((ejhf) dcit.a.j()).s(e)).x("Failed to clean up stale places");
            return 2;
        } catch (ExecutionException e2) {
            ((ejhf) ((ejhf) dcit.a.j()).s(e2)).x("Failed to clean up stale places");
            return 2;
        }
    }
}

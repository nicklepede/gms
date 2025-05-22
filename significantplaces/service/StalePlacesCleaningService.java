package com.google.android.gms.significantplaces.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bsxe;
import defpackage.cauf;
import defpackage.desy;
import defpackage.desz;
import defpackage.eluo;
import defpackage.fxuv;
import defpackage.fyeb;
import defpackage.fyqe;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class StalePlacesCleaningService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        try {
            fxuv fxuvVar = bsxe.a;
            fyqe.d(fyeb.b(bsxe.b), new desy(this, null)).get();
            return 0;
        } catch (InterruptedException e) {
            ((eluo) ((eluo) desz.a.j()).s(e)).x("Failed to clean up stale places");
            return 2;
        } catch (ExecutionException e2) {
            ((eluo) ((eluo) desz.a.j()).s(e2)).x("Failed to clean up stale places");
            return 2;
        }
    }
}

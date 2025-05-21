package com.google.android.gms.httpflags.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.blcl;
import defpackage.blco;
import defpackage.byln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class PeriodicTaskGmsTaskBoundService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        int i = blco.a;
        try {
            blcl.a(this);
            blco.a(this);
            return 0;
        } catch (Throwable th) {
            blco.a(this);
            throw th;
        }
    }
}

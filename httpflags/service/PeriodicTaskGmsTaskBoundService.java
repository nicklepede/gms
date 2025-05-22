package com.google.android.gms.httpflags.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.bnjd;
import defpackage.bnjg;
import defpackage.cauf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PeriodicTaskGmsTaskBoundService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        int i = bnjg.a;
        try {
            bnjd.a(this);
            bnjg.a(this);
            return 0;
        } catch (Throwable th) {
            bnjg.a(this);
            throw th;
        }
    }
}

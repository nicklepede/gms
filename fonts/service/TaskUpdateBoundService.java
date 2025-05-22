package com.google.android.gms.fonts.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.cauf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class TaskUpdateBoundService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!caufVar.a.equals("UPDATE")) {
            return 0;
        }
        FontsInitIntentOperation.a(this);
        return 0;
    }
}

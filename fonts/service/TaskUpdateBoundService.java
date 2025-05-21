package com.google.android.gms.fonts.service;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class TaskUpdateBoundService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!bylnVar.a.equals("UPDATE")) {
            return 0;
        }
        FontsInitIntentOperation.a(this);
        return 0;
    }
}

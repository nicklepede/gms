package com.google.android.gms.auth.api.credentials.fido.operations.chromesync;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asqh;
import defpackage.byln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PasskeysCacheUpdateService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!asqh.e()) {
            return 0;
        }
        PasskeysUpdatedIntentOperation.b();
        return 0;
    }
}

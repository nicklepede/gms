package com.google.android.gms.auth.api.credentials.fido.operations.chromesync;

import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auub;
import defpackage.cauf;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PasskeysCacheUpdateService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!auub.e()) {
            return 0;
        }
        PasskeysUpdatedIntentOperation.b();
        return 0;
    }
}

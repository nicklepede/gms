package com.google.android.gms.findmydevice.spot.sync;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bfdp;
import defpackage.bfdr;
import defpackage.byln;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class AccountChangesSyncService extends GmsTaskBoundService {
    private static final asot a = asot.b("AccountChangesSyncSvc", asej.FIND_MY_DEVICE_SPOT);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (!bfdr.b()) {
            ((ejhf) ((ejhf) a.j()).ah((char) 4490)).x("Finder is disabled.");
            return 2;
        }
        Context baseContext = getBaseContext();
        Intent a2 = bfdp.a(baseContext, "com.google.android.gms.findmydevice.spot.locationreporting.AccountChangesListenerIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.ACCOUNT_CHANGE_LISTENER");
        if (a2 == null) {
            ((ejhf) ((ejhf) a.j()).ah((char) 4489)).x("Failed to create account changes listener intent.");
            return 2;
        }
        baseContext.startService(a2);
        return 0;
    }
}

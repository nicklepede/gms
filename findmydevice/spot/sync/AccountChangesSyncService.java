package com.google.android.gms.findmydevice.spot.sync;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bhff;
import defpackage.bhfh;
import defpackage.cauf;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AccountChangesSyncService extends GmsTaskBoundService {
    private static final ausn a = ausn.b("AccountChangesSyncSvc", auid.FIND_MY_DEVICE_SPOT);

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (!bhfh.b()) {
            ((eluo) ((eluo) a.j()).ai((char) 4500)).x("Finder is disabled.");
            return 2;
        }
        Context baseContext = getBaseContext();
        Intent a2 = bhff.a(baseContext, "com.google.android.gms.findmydevice.spot.locationreporting.AccountChangesListenerIntentOperation", "com.google.android.gms.findmydevice.spot.locationreporting.ACCOUNT_CHANGE_LISTENER");
        if (a2 == null) {
            ((eluo) ((eluo) a.j()).ai((char) 4499)).x("Failed to create account changes listener intent.");
            return 2;
        }
        baseContext.startService(a2);
        return 0;
    }
}

package com.google.android.gms.nearby.presence.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byln;
import defpackage.ckmb;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PresenceSyncBoundService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        ((ejhf) ((ejhf) ckmb.a.h()).ah((char) 8244)).x("Presence server sync periodic task firing now.");
        Intent startIntent = IntentOperation.getStartIntent(getApplicationContext(), ServerSyncChimeraBroadcastReceiver.class, "com.google.android.gms.nearby.presence.service.SYNC_SERVER");
        if (startIntent == null) {
            return 0;
        }
        getApplicationContext().startService(startIntent);
        return 0;
    }
}

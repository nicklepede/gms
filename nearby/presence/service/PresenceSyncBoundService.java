package com.google.android.gms.nearby.presence.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.cauf;
import defpackage.cmug;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PresenceSyncBoundService extends GmsTaskBoundService {
    public static final /* synthetic */ int a = 0;

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        ((eluo) ((eluo) cmug.a.h()).ai((char) 8197)).x("Presence server sync periodic task firing now.");
        Intent startIntent = IntentOperation.getStartIntent(getApplicationContext(), ServerSyncChimeraBroadcastReceiver.class, "com.google.android.gms.nearby.presence.service.SYNC_SERVER");
        if (startIntent == null) {
            return 0;
        }
        getApplicationContext().startService(startIntent);
        return 0;
    }
}

package com.google.android.gms.fitness.service.wearable;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fitness.service.wearable.StartWearableSyncIntentOperation;
import defpackage.ausn;
import defpackage.biku;
import defpackage.bikw;
import defpackage.bjev;
import defpackage.dhlk;
import defpackage.dlvy;
import defpackage.dlwe;
import defpackage.ekvl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class StartWearableSyncIntentOperation extends IntentOperation {
    public static final ausn a = bjev.a();
    private biku b;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = bikw.a(this).C();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("sync_source", 0);
        String stringExtra = intent.getStringExtra("account");
        ekvl.q(true);
        dlwe a2 = dlwe.a("/fitness/WearableSync/sync_request");
        dlvy dlvyVar = new dlvy();
        dlvyVar.r("request_time", System.currentTimeMillis());
        dlvyVar.p("request_source", intExtra);
        if (stringExtra != null) {
            dlvyVar.s("request_account", stringExtra);
        }
        a2.a.i(dlvyVar);
        this.b.a().ba(a2.b()).x(new dhlk() { // from class: bizo
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                ausn ausnVar = StartWearableSyncIntentOperation.a;
                if (dhlwVar.m()) {
                    return;
                }
                ((eluo) ((eluo) StartWearableSyncIntentOperation.a.j()).ai((char) 4848)).B("Unable to save to: %s", "/fitness/WearableSync/sync_request");
            }
        });
    }
}

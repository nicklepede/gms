package com.google.android.gms.fitness.service.wearable;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fitness.service.wearable.StartWearableSyncIntentOperation;
import defpackage.asot;
import defpackage.bgge;
import defpackage.bggg;
import defpackage.bhaf;
import defpackage.dfae;
import defpackage.djkf;
import defpackage.djkl;
import defpackage.eiig;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class StartWearableSyncIntentOperation extends IntentOperation {
    public static final asot a = bhaf.a();
    private bgge b;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.b = bggg.a(this).C();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int intExtra = intent.getIntExtra("sync_source", 0);
        String stringExtra = intent.getStringExtra("account");
        eiig.p(true);
        djkl a2 = djkl.a("/fitness/WearableSync/sync_request");
        djkf djkfVar = new djkf();
        djkfVar.r("request_time", System.currentTimeMillis());
        djkfVar.p("request_source", intExtra);
        if (stringExtra != null) {
            djkfVar.s("request_account", stringExtra);
        }
        a2.a.i(djkfVar);
        this.b.a().bb(a2.b()).x(new dfae() { // from class: bguy
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                asot asotVar = StartWearableSyncIntentOperation.a;
                if (dfaqVar.m()) {
                    return;
                }
                ((ejhf) ((ejhf) StartWearableSyncIntentOperation.a.j()).ah((char) 4838)).B("Unable to save to: %s", "/fitness/WearableSync/sync_request");
            }
        });
    }
}

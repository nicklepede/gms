package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.chimera.modules.security.nonwearable.AppContextProvider;
import defpackage.aseu;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.cdaj;
import defpackage.cyrt;
import defpackage.deqh;
import defpackage.deqy;
import defpackage.eijr;
import defpackage.fmse;
import defpackage.jmr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ChromebookRingIntentOperation extends IntentOperation {
    private bqqa a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        eijr eijrVar = bqqe.a;
        this.a = new bqqa();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.mdm.services.ACTION_CHROMEBOOK_RING".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.mdm.services.EXTRA_OPERATION");
            if (!"com.google.android.gms.mdm.services.OPERATION_START_RINGING".equals(stringExtra)) {
                if ("com.google.android.gms.mdm.services.OPERATION_STOP_RINGING".equals(stringExtra)) {
                    RingChimeraService.g(AppContextProvider.a());
                    bqqa.a(aseu.SECURITY__NONWEARABLE_FMD_ACTION_CHROMEBOOK_STOP_RINGING);
                    return;
                }
                return;
            }
            Context a = AppContextProvider.a();
            cdaj.c("Start ringing requested by Chromebook.", new Object[0]);
            Intent j = cyrt.j(a);
            j.putExtra("remote", false);
            j.putExtra("local_origin", "chromebook");
            if (fmse.h()) {
                int i = deqy.c;
                WakefulBroadcastReceiver.startWakefulService(a, j);
            } else {
                int i2 = deqh.b;
                jmr.a(a, j);
            }
            bqqa.a(aseu.SECURITY__NONWEARABLE_FMD_ACTION_CHROMEBOOK_RING);
        }
    }
}

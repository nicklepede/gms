package com.google.android.gms.mdm.services;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.WakefulBroadcastReceiver;
import com.google.android.gms.chimera.modules.security.nonwearable.AppContextProvider;
import defpackage.auio;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.cfjj;
import defpackage.dbbr;
import defpackage.dhbk;
import defpackage.dhcb;
import defpackage.ekww;
import defpackage.fpkc;
import defpackage.jtg;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class ChromebookRingIntentOperation extends IntentOperation {
    private bsxr a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ekww ekwwVar = bsxv.a;
        this.a = new bsxr();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.mdm.services.ACTION_CHROMEBOOK_RING".equals(intent.getAction())) {
            String stringExtra = intent.getStringExtra("com.google.android.gms.mdm.services.EXTRA_OPERATION");
            if (!"com.google.android.gms.mdm.services.OPERATION_START_RINGING".equals(stringExtra)) {
                if ("com.google.android.gms.mdm.services.OPERATION_STOP_RINGING".equals(stringExtra)) {
                    RingChimeraService.g(AppContextProvider.a());
                    bsxr.a(auio.SECURITY__NONWEARABLE_FMD_ACTION_CHROMEBOOK_STOP_RINGING);
                    return;
                }
                return;
            }
            Context a = AppContextProvider.a();
            cfjj.c("Start ringing requested by Chromebook.", new Object[0]);
            Intent j = dbbr.j(a);
            j.putExtra("remote", false);
            j.putExtra("local_origin", "chromebook");
            if (fpkc.i()) {
                int i = dhcb.c;
                WakefulBroadcastReceiver.startWakefulService(a, j);
            } else {
                int i2 = dhbk.b;
                jtg.a(a, j);
            }
            bsxr.a(auio.SECURITY__NONWEARABLE_FMD_ACTION_CHROMEBOOK_RING);
        }
    }
}

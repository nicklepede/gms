package com.google.android.gms.nearby.discovery;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import defpackage.cexc;
import defpackage.excq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class BluetoothDeviceIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (excq.d(this, cexc.e(this))) {
            startService(DiscoveryChimeraService.a(this).setAction(intent.getAction()).putExtras(intent));
        }
    }
}

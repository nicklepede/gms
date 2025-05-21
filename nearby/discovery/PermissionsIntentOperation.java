package com.google.android.gms.nearby.discovery;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import defpackage.cexc;
import defpackage.cgiv;
import defpackage.excq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class PermissionsIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        cgiv.a.f().B("Received permission change event: %s", action);
        if (action != null && excq.d(this, cexc.e(this))) {
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", 10);
                boolean z = true;
                if (intExtra != 10) {
                    if (intExtra == 12) {
                        intExtra = 12;
                    } else {
                        z = false;
                    }
                }
                try {
                    startService(DiscoveryChimeraService.a(this).setAction("android.bluetooth.adapter.action.STATE_CHANGED").putExtra("android.bluetooth.adapter.extra.STATE", intExtra));
                } catch (IllegalStateException | SecurityException e) {
                    cgiv.a.g().B("PermissionsIntentOperation: can't start discovery service %s", e.getMessage());
                }
                if (!z) {
                    return;
                }
            }
            try {
                startService(DiscoveryChimeraService.a(this).setAction("com.google.android.gms.nearby.discovery:ACTION_PERMISSION_CHANGE"));
            } catch (IllegalStateException | SecurityException e2) {
                cgiv.a.g().B("PermissionsIntentOperation: can't start discovery service %s", e2.getMessage());
            }
        }
    }
}

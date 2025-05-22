package com.google.android.gms.nearby.discovery;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import defpackage.chen;
import defpackage.ciqy;
import defpackage.ezqz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class PermissionsIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        ciqy.a.f().B("Received permission change event: %s", action);
        if (action != null && ezqz.d(this, chen.f(this))) {
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
                    ciqy.a.g().B("PermissionsIntentOperation: can't start discovery service %s", e.getMessage());
                }
                if (!z) {
                    return;
                }
            }
            try {
                startService(DiscoveryChimeraService.a(this).setAction("com.google.android.gms.nearby.discovery:ACTION_PERMISSION_CHANGE"));
            } catch (IllegalStateException | SecurityException e2) {
                ciqy.a.g().B("PermissionsIntentOperation: can't start discovery service %s", e2.getMessage());
            }
        }
    }
}

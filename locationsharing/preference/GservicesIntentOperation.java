package com.google.android.gms.locationsharing.preference;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.auio;
import defpackage.aura;
import defpackage.autl;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.ekww;
import defpackage.fspt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GservicesIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            Context baseContext = getBaseContext();
            boolean z = false;
            if (autl.c(baseContext) && fspt.a.lK().m()) {
                z = true;
            }
            String str = LocationSharingSettingInjectorChimeraService.a;
            aura.H(baseContext, "com.google.android.gms.locationsharing.service.LocationSharingSettingInjectorService", z);
            if (z) {
                if (LocationSharingSettingInjectorChimeraService.g == null) {
                    ekww ekwwVar = bsxv.a;
                    LocationSharingSettingInjectorChimeraService.g = new bsxr();
                }
                bsxr.a(auio.LOCATION_SHARING_SETTINGS_VIEW_SHARING_STATUS);
            }
        }
    }
}

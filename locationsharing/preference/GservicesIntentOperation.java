package com.google.android.gms.locationsharing.preference;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.aseu;
import defpackage.asng;
import defpackage.aspr;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.eijr;
import defpackage.fpwa;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GservicesIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.gservices.intent.action.GSERVICES_CHANGED".equals(intent.getAction())) {
            Context baseContext = getBaseContext();
            boolean z = false;
            if (aspr.c(baseContext) && fpwa.a.a().m()) {
                z = true;
            }
            String str = LocationSharingSettingInjectorChimeraService.a;
            asng.H(baseContext, "com.google.android.gms.locationsharing.service.LocationSharingSettingInjectorService", z);
            if (z) {
                if (LocationSharingSettingInjectorChimeraService.g == null) {
                    eijr eijrVar = bqqe.a;
                    LocationSharingSettingInjectorChimeraService.g = new bqqa();
                }
                bqqa.a(aseu.LOCATION_SHARING_SETTINGS_VIEW_SHARING_STATUS);
            }
        }
    }
}

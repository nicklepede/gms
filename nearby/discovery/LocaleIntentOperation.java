package com.google.android.gms.nearby.discovery;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.nearby.discovery.service.DiscoveryChimeraService;
import defpackage.chen;
import defpackage.ciqy;
import defpackage.ezqz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocaleIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ciqy.a.f().B("Received locale change event: %s", intent.getAction());
        if (ezqz.d(this, chen.f(this))) {
            startService(DiscoveryChimeraService.a(this).setAction("com.google.android.gms.nearby.discovery:ACTION_LOCALE_CHANGE"));
        }
    }
}

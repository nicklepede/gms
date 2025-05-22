package com.google.android.gms.growth.watchdog.chimera;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.bmrr;
import defpackage.bnfb;
import defpackage.bnfc;
import defpackage.flni;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class AppInstalledIntentOperation extends IntentOperation {
    bnfb a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bnfc bnfcVar = new bnfc();
        bnfcVar.b(bmrr.a());
        bnfb f = bnfcVar.a().a.f();
        flni.d(f);
        this.a = f;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Uri data;
        if (this.a == null || !"android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || (data = intent.getData()) == null) {
            return;
        }
        this.a.b(data.getSchemeSpecificPart());
    }
}

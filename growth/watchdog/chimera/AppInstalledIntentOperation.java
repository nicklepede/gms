package com.google.android.gms.growth.watchdog.chimera;

import android.content.Intent;
import android.net.Uri;
import com.google.android.chimera.IntentOperation;
import defpackage.bklb;
import defpackage.bkyk;
import defpackage.bkyl;
import defpackage.fixl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AppInstalledIntentOperation extends IntentOperation {
    bkyk a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bkyl bkylVar = new bkyl();
        bkylVar.b(bklb.a());
        bkyk f = bkylVar.a().a.f();
        fixl.d(f);
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

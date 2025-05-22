package com.google.android.gms.clearcut.init;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;
import defpackage.asdb;
import defpackage.aszs;
import defpackage.aura;
import defpackage.cyjh;
import defpackage.cyki;
import defpackage.cykl;
import defpackage.ekvl;
import defpackage.fpse;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ClearcutInitChimeraIntentService extends apzs {
    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        Context applicationContext = getApplicationContext();
        Intent startIntent = IntentOperation.getStartIntent(applicationContext, asdb.class, "android.intent.action.CLEARCUT_MODULE_UPDATE");
        ekvl.y(startIntent);
        applicationContext.startService(startIntent);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        aura.H(this, "com.google.android.gms.clearcut.debug.ClearcutDebugDumpService", true);
        getApplicationContext().startService(new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.clearcut.debug.ClearcutDebugDumpService")));
        if (fpse.b().b.contains("com.google.android.gms.playlog.uploader")) {
            return;
        }
        aszs aszsVar = cyjh.a;
        new cykl(new cyki(this), "com.google.android.gms.playlog.uploader", "direct_boot:com.google.android.gms.playlog.uploader", this).h("");
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        Context applicationContext = getApplicationContext();
        Intent startIntent = IntentOperation.getStartIntent(applicationContext, ClearcutBootCompleteIntentOperation.class, "android.intent.action.CLEARCUT_BOOT_COMPLETED");
        ekvl.y(startIntent);
        applicationContext.startService(startIntent);
    }

    @Override // defpackage.apzs
    protected final void j(Intent intent) {
        Context applicationContext = getApplicationContext();
        Intent startIntent = IntentOperation.getStartIntent(applicationContext, ClearcutBootCompleteIntentOperation.class, "android.intent.action.CLEARCUT_LOCKED_BOOT_COMPLETED");
        ekvl.y(startIntent);
        applicationContext.startService(startIntent);
    }
}

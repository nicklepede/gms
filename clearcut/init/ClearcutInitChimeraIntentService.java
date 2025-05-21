package com.google.android.gms.clearcut.init;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.anya;
import defpackage.aqak;
import defpackage.aqxd;
import defpackage.asng;
import defpackage.cvzk;
import defpackage.cwal;
import defpackage.cwao;
import defpackage.eiig;
import defpackage.fnaf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ClearcutInitChimeraIntentService extends anya {
    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        Context applicationContext = getApplicationContext();
        Intent startIntent = IntentOperation.getStartIntent(applicationContext, aqak.class, "android.intent.action.CLEARCUT_MODULE_UPDATE");
        eiig.x(startIntent);
        applicationContext.startService(startIntent);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        asng.H(this, "com.google.android.gms.clearcut.debug.ClearcutDebugDumpService", true);
        getApplicationContext().startService(new Intent().setComponent(new ComponentName("com.google.android.gms", "com.google.android.gms.clearcut.debug.ClearcutDebugDumpService")));
        if (fnaf.b().b.contains("com.google.android.gms.playlog.uploader")) {
            return;
        }
        aqxd aqxdVar = cvzk.a;
        new cwao(new cwal(this), "com.google.android.gms.playlog.uploader", "direct_boot:com.google.android.gms.playlog.uploader", this).h("");
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        Context applicationContext = getApplicationContext();
        Intent startIntent = IntentOperation.getStartIntent(applicationContext, ClearcutBootCompleteIntentOperation.class, "android.intent.action.CLEARCUT_BOOT_COMPLETED");
        eiig.x(startIntent);
        applicationContext.startService(startIntent);
    }

    @Override // defpackage.anya
    protected final void j(Intent intent) {
        Context applicationContext = getApplicationContext();
        Intent startIntent = IntentOperation.getStartIntent(applicationContext, ClearcutBootCompleteIntentOperation.class, "android.intent.action.CLEARCUT_LOCKED_BOOT_COMPLETED");
        eiig.x(startIntent);
        applicationContext.startService(startIntent);
    }
}

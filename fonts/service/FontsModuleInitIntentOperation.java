package com.google.android.gms.fonts.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.anya;
import defpackage.asng;
import defpackage.bhcm;
import defpackage.eike;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FontsModuleInitIntentOperation extends anya {
    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        bhcm.c("FontsModuleInitOp", "onInitRuntimeState(module update? %s container update? %s)", Boolean.valueOf((i & 4) != 0), Boolean.valueOf((i & 8) != 0));
        asng.H(this, "com.google.android.gms.fonts.provider.FontsProvider", true);
        asng.H(this, "com.google.android.gms.fonts.update.UpdateSchedulerService", true);
        Intent startIntent = IntentOperation.getStartIntent(this, FontsInitIntentOperation.class, "com.google.android.gms.fonts.init.INIT_ACTION");
        eike.e(startIntent);
        startService(startIntent);
    }
}

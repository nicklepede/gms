package com.google.android.gms.fonts.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.apzs;
import defpackage.aura;
import defpackage.bjhc;
import defpackage.ekxj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FontsModuleInitIntentOperation extends apzs {
    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        bjhc.c("FontsModuleInitOp", "onInitRuntimeState(module update? %s container update? %s)", Boolean.valueOf((i & 4) != 0), Boolean.valueOf((i & 8) != 0));
        aura.H(this, "com.google.android.gms.fonts.provider.FontsProvider", true);
        aura.H(this, "com.google.android.gms.fonts.update.UpdateSchedulerService", true);
        Intent startIntent = IntentOperation.getStartIntent(this, FontsInitIntentOperation.class, "com.google.android.gms.fonts.init.INIT_ACTION");
        ekxj.e(startIntent);
        startService(startIntent);
    }
}

package com.google.android.gms.car;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import defpackage.amth;
import defpackage.amzn;
import defpackage.anaa;
import defpackage.ancy;
import defpackage.anoq;
import defpackage.auub;
import defpackage.ekww;
import defpackage.eluq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CarModuleInitIntentOperation extends amzn {
    private static final eluq a = ancy.a("CAR.SERVICE.INIT");

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        if (auub.g()) {
            return;
        }
        ekww ekwwVar = anaa.a;
        if (((ComponentName) ekwwVar.lK()).getPackageName().equals("com.google.android.gms")) {
            anoq.b(this, ((ComponentName) ekwwVar.lK()).getClassName(), true);
        }
        if (intent.getIntExtra(IntentOperation.EXTRA_PREVIOUS_VERSION, Integer.MAX_VALUE) < 10) {
            if (Build.VERSION.SDK_INT < 30) {
                if (anoq.a(this, amth.b.getClassName()) != 1) {
                    return;
                }
            } else if (anoq.a(this, amth.a.getClassName()) != 1 && anoq.a(this, amth.c.getClassName()) != 1) {
                return;
            }
            a.h().ai(1811).x("Resetting night mode");
            int identifier = Resources.getSystem().getIdentifier("config_defaultNightMode", "integer", "android");
            ((UiModeManager) getSystemService("uimode")).setNightMode(identifier != 0 ? Resources.getSystem().getInteger(identifier) : 1);
        }
    }
}

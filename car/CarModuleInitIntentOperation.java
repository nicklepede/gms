package com.google.android.gms.car;

import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import defpackage.akrw;
import defpackage.akyc;
import defpackage.akyp;
import defpackage.albn;
import defpackage.alnf;
import defpackage.asqh;
import defpackage.ejhh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CarModuleInitIntentOperation extends akyc {
    private static final ejhh a = albn.a("CAR.SERVICE.INIT");

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        if (asqh.g()) {
            return;
        }
        if (((ComponentName) akyp.a.a()).getPackageName().equals("com.google.android.gms")) {
            alnf.b(this, ((ComponentName) akyp.a.a()).getClassName(), true);
        }
        if (intent.getIntExtra(IntentOperation.EXTRA_PREVIOUS_VERSION, Integer.MAX_VALUE) < 10) {
            if (Build.VERSION.SDK_INT < 30) {
                if (alnf.a(this, akrw.b.getClassName()) != 1) {
                    return;
                }
            } else if (alnf.a(this, akrw.a.getClassName()) != 1 && alnf.a(this, akrw.c.getClassName()) != 1) {
                return;
            }
            a.h().ah(1807).x("Resetting night mode");
            int identifier = Resources.getSystem().getIdentifier("config_defaultNightMode", "integer", "android");
            ((UiModeManager) getSystemService("uimode")).setNightMode(identifier != 0 ? Resources.getSystem().getInteger(identifier) : 1);
        }
    }
}

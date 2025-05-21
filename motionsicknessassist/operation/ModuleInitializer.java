package com.google.android.gms.motionsicknessassist.operation;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.asot;
import defpackage.cetp;
import defpackage.cetu;
import defpackage.cevj;
import defpackage.ejhf;
import defpackage.fqiw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class ModuleInitializer extends anya {
    private static final asot b = cetu.a("Initializer");
    static final String[] a = {"com.google.android.gms.motionsicknessassist.settings.MotionSicknessSettingsActivity", "com.google.android.gms.motionsicknessassist.settings.MotionSicknessAssistTileService", "com.google.android.gms.motionsicknessassist.service.MotionSicknessAssistService"};

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        cevj cevjVar = new cevj(getApplicationContext());
        boolean d = fqiw.d();
        cetp.a(cevjVar.l(false));
        boolean c = cetp.c(cevjVar.g());
        asot asotVar = b;
        ((ejhf) ((ejhf) asotVar.h()).ah(6445)).T("onInitRuntimeState, isMinSdk=%s, isFeatureFlagEnabled=%s, isDrivingDetectionEnabled=%s", false, Boolean.valueOf(d), Boolean.valueOf(c));
        String[] strArr = a;
        int length = strArr.length;
        for (int i2 = 0; i2 < 3; i2++) {
            asng.M(strArr[i2], 2);
        }
        if (d) {
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 6447)).x("This feature is only available for V+ devices. Exiting");
        } else {
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 6448)).x("Feature flag disabled. Exiting");
        }
    }
}

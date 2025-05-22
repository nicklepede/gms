package com.google.android.gms.time.platformfeedback.intentops;

import android.content.Intent;
import defpackage.apzs;
import defpackage.aura;
import defpackage.dioj;
import defpackage.dxfp;
import defpackage.dxfs;
import defpackage.eluo;
import defpackage.fvir;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class PlatformFeedbackModuleInitIntentOperation extends apzs {
    private static final dxfp a = new dxfs("PlatformFeedbackModuleInitIntentOperation");

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (fvir.c()) {
            aura.K("com.google.android.gms.time.platformfeedback.PlatformFeedbackLaunchActivity", true);
            ((eluo) ((eluo) dioj.a.h()).ai(11393)).P("%s %s enabled", a, new dxfs("com.google.android.gms.time.platformfeedback.PlatformFeedbackLaunchActivity"));
        }
    }
}

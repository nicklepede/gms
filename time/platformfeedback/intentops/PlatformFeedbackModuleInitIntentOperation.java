package com.google.android.gms.time.platformfeedback.intentops;

import android.content.Intent;
import defpackage.anya;
import defpackage.asng;
import defpackage.dgde;
import defpackage.duut;
import defpackage.duuw;
import defpackage.ejhf;
import defpackage.fsnh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class PlatformFeedbackModuleInitIntentOperation extends anya {
    private static final duut a = new duuw("PlatformFeedbackModuleInitIntentOperation");

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (fsnh.c()) {
            asng.K("com.google.android.gms.time.platformfeedback.PlatformFeedbackLaunchActivity", true);
            ((ejhf) ((ejhf) dgde.a.h()).ah(11390)).P("%s %s enabled", a, new duuw("com.google.android.gms.time.platformfeedback.PlatformFeedbackLaunchActivity"));
        }
    }
}

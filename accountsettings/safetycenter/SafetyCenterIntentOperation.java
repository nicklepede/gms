package com.google.android.gms.accountsettings.safetycenter;

import android.content.Intent;
import defpackage.arxo;
import defpackage.fjul;
import defpackage.rtk;
import defpackage.sxg;
import defpackage.szu;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class SafetyCenterIntentOperation extends szu {
    private static final String a = "SafetyCenterIntentOperation";

    static {
        new arxo("AccountSettings", a);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ((sxg) rtk.a(sxg.class, this.d)).h();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fjul.a.a().B();
    }
}

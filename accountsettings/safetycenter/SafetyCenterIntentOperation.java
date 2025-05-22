package com.google.android.gms.accountsettings.safetycenter;

import android.content.Intent;
import defpackage.auad;
import defpackage.fmkm;
import defpackage.tmt;
import defpackage.ute;
import defpackage.uvs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SafetyCenterIntentOperation extends uvs {
    private static final String a = "SafetyCenterIntentOperation";

    static {
        new auad("AccountSettings", a);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        ((ute) tmt.a(ute.class, this.d)).h();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fmkm.a.lK().w();
    }
}

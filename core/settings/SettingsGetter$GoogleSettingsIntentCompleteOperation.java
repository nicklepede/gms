package com.google.android.gms.core.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.anxy;
import defpackage.atsy;
import defpackage.bwph;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SettingsGetter$GoogleSettingsIntentCompleteOperation extends anxy {
    @Override // defpackage.anxy
    public final GoogleSettingsItem b() {
        return null;
    }

    @Override // defpackage.anxy, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction()) && !h(intent, "GmscoreSettingsApiService")) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalArgumentException("Bundle must not be null.");
            }
            if (atsy.c != bwph.a(extras)) {
                ((ejhf) atsy.a.h()).x("not the same list, dropping the intent");
            }
            if (atsy.b != null) {
                atsy.b.countDown();
            }
        }
    }
}

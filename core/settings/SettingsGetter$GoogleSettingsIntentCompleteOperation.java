package com.google.android.gms.core.settings;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.libs.googlesettings.GoogleSettingsItem;
import defpackage.apzq;
import defpackage.avxb;
import defpackage.byxu;
import defpackage.eluo;
import java.util.concurrent.CountDownLatch;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SettingsGetter$GoogleSettingsIntentCompleteOperation extends apzq {
    @Override // defpackage.apzq
    public final GoogleSettingsItem b() {
        return null;
    }

    @Override // defpackage.apzq, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.GOOGLE_SETTINGS_OPERATION".equals(intent.getAction()) && !h(intent, "GmscoreSettingsApiService")) {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                throw new IllegalArgumentException("Bundle must not be null.");
            }
            if (avxb.c != byxu.a(extras)) {
                ((eluo) avxb.a.h()).x("not the same list, dropping the intent");
            }
            CountDownLatch countDownLatch = avxb.b;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}

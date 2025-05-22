package com.google.android.gms.matchstick.intent;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.LocaleList;
import com.google.android.chimera.IntentOperation;
import defpackage.drcx;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MatchstickIntentHandler$LocaleChangeIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        LocaleList locales;
        Context baseContext = getBaseContext();
        if (Build.VERSION.SDK_INT >= 24) {
            locales = baseContext.getResources().getConfiguration().getLocales();
            locales.get(0);
        } else {
            Locale locale = baseContext.getResources().getConfiguration().locale;
        }
        drcx.b(getBaseContext()).h(169);
    }
}

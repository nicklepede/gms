package com.google.android.gms.telephonyspam.base;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.telephonyspam.AppContextProvider;
import defpackage.auid;
import defpackage.ausn;
import defpackage.auua;
import defpackage.casd;
import defpackage.dhox;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SettingsChangedIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("SettingsChangedIntentOp", auid.TELEPHONY_SPAM);
    private static final String b = auua.f("com.google.android.gms.telephonyspam");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || b.equals(action)) && "com.google.android.gms.telephonyspam".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            intent.getAction();
            ((eluo) ((eluo) a.h()).ai((char) 11079)).x("telephonyspam phenotype flag changed");
            ausn ausnVar = dhox.a;
            dhox.c(casd.a(AppContextProvider.a()));
        }
    }
}

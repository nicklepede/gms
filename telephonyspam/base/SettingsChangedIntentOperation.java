package com.google.android.gms.telephonyspam.base;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.telephonyspam.AppContextProvider;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqg;
import defpackage.byjl;
import defpackage.dfdr;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SettingsChangedIntentOperation extends IntentOperation {
    private static final asot a = asot.b("SettingsChangedIntentOp", asej.TELEPHONY_SPAM);
    private static final String b = asqg.f("com.google.android.gms.telephonyspam");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (("com.google.android.gms.phenotype.COMMITTED".equals(action) || b.equals(action)) && "com.google.android.gms.telephonyspam".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            intent.getAction();
            ((ejhf) ((ejhf) a.h()).ah((char) 11076)).x("telephonyspam phenotype flag changed");
            asot asotVar = dfdr.a;
            dfdr.c(byjl.a(AppContextProvider.a()));
        }
    }
}

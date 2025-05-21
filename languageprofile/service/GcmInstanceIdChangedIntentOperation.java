package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import defpackage.asej;
import defpackage.asot;
import defpackage.bqed;
import defpackage.eiid;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmInstanceIdChangedIntentOperation extends IntentOperation {
    private static final asot a = asot.b("GcmInstIdChngdIntentOp", asej.LANGUAGE_PROFILE);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        bqed.a().l();
        eiid a2 = AccountsChangedIntentOperation.a(AppContextProvider.a());
        if (a2.h()) {
            AppContextProvider.a().startService((Intent) a2.c());
        } else {
            ((ejhf) a.i()).x("AccountsChangedIntentOperation could not be fired due to null intent.");
        }
    }
}

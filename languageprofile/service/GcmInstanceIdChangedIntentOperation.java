package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bslt;
import defpackage.ekvi;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GcmInstanceIdChangedIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("GcmInstIdChngdIntentOp", auid.LANGUAGE_PROFILE);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        bslt.a().l();
        ekvi a2 = AccountsChangedIntentOperation.a(AppContextProvider.a());
        if (a2.h()) {
            AppContextProvider.a().startService((Intent) a2.c());
        } else {
            ((eluo) a.i()).x("AccountsChangedIntentOperation could not be fired due to null intent.");
        }
    }
}

package com.google.android.gms.auth.aang.events.intentoperations;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import defpackage.apzb;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.eluo;
import defpackage.fnaw;
import defpackage.fxsr;
import defpackage.fxxm;
import defpackage.xgt;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class PauseModuleUpdatesIntentOperation extends IntentOperation {
    private static final ausn a = ausn.c("Auth", auid.GOOGLE_AUTH_AANG, "PauseModuleUpdatesIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        if (apzb.a() >= 124) {
            if (fnaw.b() <= 0) {
                ((eluo) a.h()).x("Skip pausing module updates because pause duration is no-op.");
                return;
            }
            if (!"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
                ((eluo) a.h()).B("Skip pausing module updates for intent action '%s'.", intent.getAction());
                return;
            }
            List a2 = xgt.a(intent);
            if (a2 != null && a2.size() == 1) {
                String str = ((Account) fxsr.L(a2)).name;
                Account b = auqx.b(this);
                if (fxxm.n(str, b != null ? b.name : null)) {
                    ausn ausnVar = a;
                    ((eluo) ausnVar.h()).x("Requesting to pause module updates.");
                    int b2 = (int) fnaw.b();
                    ModuleManager.get(this).pauseModuleUpdates("KIDS_ONBOARDING_SOURCE", b2);
                    ((eluo) ausnVar.h()).z("Module updates paused for %d seconds.", b2);
                    return;
                }
            }
            ((eluo) a.h()).x("Skip pausing module updates because no supervised account was added to the device.");
        }
    }
}

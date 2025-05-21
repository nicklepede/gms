package com.google.android.gms.auth.aang.events.intentoperations;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.chimera.config.ModuleManager;
import defpackage.anxj;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.ejhf;
import defpackage.fkkh;
import defpackage.fuwt;
import defpackage.fvbo;
import defpackage.vks;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class PauseModuleUpdatesIntentOperation extends IntentOperation {
    private static final asot a = asot.c("Auth", asej.GOOGLE_AUTH_AANG, "PauseModuleUpdatesIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
        if (anxj.a() >= 124) {
            if (fkkh.b() <= 0) {
                ((ejhf) a.h()).x("Skip pausing module updates because pause duration is no-op.");
                return;
            }
            if (!"com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
                ((ejhf) a.h()).B("Skip pausing module updates for intent action '%s'.", intent.getAction());
                return;
            }
            List a2 = vks.a(intent);
            if (a2 != null && a2.size() == 1) {
                String str = ((Account) fuwt.L(a2)).name;
                Account b = asnd.b(this);
                if (fvbo.n(str, b != null ? b.name : null)) {
                    asot asotVar = a;
                    ((ejhf) asotVar.h()).x("Requesting to pause module updates.");
                    int b2 = (int) fkkh.b();
                    ModuleManager.get(this).pauseModuleUpdates("KIDS_ONBOARDING_SOURCE", b2);
                    ((ejhf) asotVar.h()).z("Module updates paused for %d seconds.", b2);
                    return;
                }
            }
            ((ejhf) a.h()).x("Skip pausing module updates because no supervised account was added to the device.");
        }
    }
}

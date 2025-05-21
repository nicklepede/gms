package com.google.android.gms.auth.uiflows.addaccount.onboarding;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.auth.uiflows.addaccount.onboarding.OnboardingChimeraBoundService;
import defpackage.adhd;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asot;
import defpackage.bqpn;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.fuyx;
import defpackage.fvbo;
import defpackage.fvid;
import defpackage.ncn;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class OnboardingChimeraBoundService extends BoundService {
    private static final asot a = asot.c("Auth", asej.GOOGLE_AUTH_AANG, "OnboardingChimeraService");

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        fvbo.f(intent, "intent");
        if (!fvbo.n("com.android.onboarding.task.RUN_ONBOARDING_TASK", intent.getAction())) {
            ((ejhf) a.i()).B("incompatible service action: %s", intent.getAction());
            return null;
        }
        if (!intent.getCategories().contains("auth")) {
            ((ejhf) a.h()).x("intent doesn't contain 'auth' category");
            return null;
        }
        Supplier supplier = new Supplier() { // from class: adhz
            @Override // java.util.function.Supplier
            public final Object get() {
                return OnboardingChimeraBoundService.this.getApplicationContext();
            }
        };
        Set set = adhd.g;
        fuyx fuyxVar = bqpn.a;
        ncn ncnVar = new ncn(supplier, set, fvid.b(bqpn.a));
        eijr eijrVar = bqqe.a;
        bqqa.a(aseu.AUTH_ACCOUNT_BASE_ONBOARDING_SERVICE);
        return ncnVar;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final boolean onUnbind(Intent intent) {
        fvbo.f(intent, "intent");
        ((ejhf) a.h()).B("Unbind to intent %s", intent);
        return false;
    }
}

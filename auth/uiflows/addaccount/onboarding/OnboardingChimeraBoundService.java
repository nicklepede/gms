package com.google.android.gms.auth.uiflows.addaccount.onboarding;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import com.google.android.gms.auth.uiflows.addaccount.onboarding.OnboardingChimeraBoundService;
import defpackage.afhi;
import defpackage.auid;
import defpackage.auio;
import defpackage.ausn;
import defpackage.bsxe;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.fxuv;
import defpackage.fxxm;
import defpackage.fyeb;
import defpackage.ovb;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class OnboardingChimeraBoundService extends BoundService {
    private static final ausn a = ausn.c("Auth", auid.GOOGLE_AUTH_AANG, "OnboardingChimeraService");

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        fxxm.f(intent, "intent");
        if (!fxxm.n("com.android.onboarding.task.RUN_ONBOARDING_TASK", intent.getAction())) {
            ((eluo) a.i()).B("incompatible service action: %s", intent.getAction());
            return null;
        }
        if (!intent.getCategories().contains("auth")) {
            ((eluo) a.h()).x("intent doesn't contain 'auth' category");
            return null;
        }
        Supplier supplier = new Supplier() { // from class: afif
            @Override // java.util.function.Supplier
            public final Object get() {
                return OnboardingChimeraBoundService.this.getApplicationContext();
            }
        };
        Set set = afhi.i;
        fxuv fxuvVar = bsxe.a;
        ovb ovbVar = new ovb(supplier, set, fyeb.b(bsxe.a));
        ekww ekwwVar = bsxv.a;
        bsxr.a(auio.AUTH_ACCOUNT_BASE_ONBOARDING_SERVICE);
        return ovbVar;
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final boolean onUnbind(Intent intent) {
        fxxm.f(intent, "intent");
        ((eluo) a.h()).B("Unbind to intent %s", intent);
        return false;
    }
}

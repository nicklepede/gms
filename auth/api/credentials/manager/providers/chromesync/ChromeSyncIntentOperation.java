package com.google.android.gms.auth.api.credentials.manager.providers.chromesync;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.credentials.base.AppContextProvider;
import defpackage.aacx;
import defpackage.aade;
import defpackage.aadf;
import defpackage.ausn;
import defpackage.bohl;
import defpackage.bolg;
import defpackage.bomo;
import defpackage.bonp;
import defpackage.boqy;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.fnhy;
import defpackage.yei;
import defpackage.yib;
import defpackage.zsi;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ChromeSyncIntentOperation extends IntentOperation {
    private static final ausn a = zsi.a("ChromeSyncIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!"com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || "com.google.android.gms.auth.api.credentials".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            ((Boolean) yib.a.b()).booleanValue();
            AppContextProvider.a();
            fnhy fnhyVar = fnhy.a;
            if (fnhyVar.lK().o()) {
                boqy boqyVar = (boqy) aadf.a.lK();
                aade aadeVar = aade.WEBAUTHN_CREDENTIAL_DATA;
                boqyVar.am(zsi.a(aadf.b(aadeVar)));
                boqyVar.ap(bomo.AUTH_API_CREDENTIALS_PRE_SYNC_PASSKEYS, bonp.a());
                boqyVar.X(aadeVar).a();
            }
            if (fnhyVar.lK().p()) {
                boqy boqyVar2 = (boqy) aadf.a.lK();
                aade aadeVar2 = aade.PASSWORD_DATA;
                boqyVar2.am(zsi.a(aadf.b(aadeVar2)));
                boqyVar2.ap(bomo.AUTH_API_CREDENTIALS_PRE_SYNC_PASSWORDS, bonp.a());
                boqyVar2.X(aadeVar2).a();
            }
            aacx aacxVar = new aacx(this);
            try {
                elgo b = yei.b();
                int i = ((elpg) b).c;
                for (int i2 = 0; i2 < i; i2++) {
                    try {
                        aacxVar.e((bohl) b.get(i2)).get();
                    } catch (InterruptedException | ExecutionException e) {
                        ((eluo) ((eluo) a.i()).s(e)).x("Failed to initialize sync.");
                    }
                }
            } catch (bolg e2) {
                ((eluo) ((eluo) a.i()).s(e2)).x("Failed to get the accounts.");
            }
        }
    }
}

package com.google.android.gms.fido;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.fido.fido2.pollux.CableAuthenticatorChimeraService;
import defpackage.asng;
import defpackage.bazo;
import defpackage.bazq;
import defpackage.bcnj;
import defpackage.fkpj;
import defpackage.fnxh;
import defpackage.fnxz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PhenotypeUpdateIntentOperation extends IntentOperation {
    public static final bcnj a = new bcnj("PhenotypeUpdateIntentOperation");
    static final String[] b = {"com.google.android.gms.fido.fido2.pollux.CableAuthenticatorService", "com.google.android.gms.fido.fido2.ui.PolluxActivity"};

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null || !"com.google.android.gms.phenotype.UPDATE".equals(intent.getAction()) || !"com.google.android.gms.fido".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            a.d("Received invalid intent: %s", intent);
            return;
        }
        if (fnxh.a.a().g()) {
            bazo.d(getApplicationContext(), getPackageName());
        }
        if (fnxz.d()) {
            String[] strArr = b;
            int length = strArr.length;
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                try {
                    if (asng.a(this, str) != 2) {
                        asng.M(str, 2);
                    }
                } catch (IllegalArgumentException unused) {
                    a.h("Unable to disable to component %s", str);
                }
            }
        } else {
            String[] strArr2 = b;
            int length2 = strArr2.length;
            for (int i2 = 0; i2 < 2; i2++) {
                String str2 = strArr2[i2];
                try {
                    if (asng.a(this, str2) != 1) {
                        asng.H(this, str2, true);
                    }
                } catch (IllegalArgumentException unused2) {
                    a.h("Unable to enable to component %s", str2);
                }
            }
            startService(CableAuthenticatorChimeraService.a(this));
        }
        if (fkpj.c()) {
            return;
        }
        ((bazq) bazq.a.b()).a();
    }
}

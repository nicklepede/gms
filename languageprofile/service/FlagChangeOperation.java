package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import defpackage.byjl;
import defpackage.byxs;
import defpackage.eijr;
import defpackage.fpjt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FlagChangeOperation extends IntentOperation {
    private final eijr a;
    private final eijr b;

    public FlagChangeOperation() {
        this.a = new eijr() { // from class: bqda
            @Override // defpackage.eijr
            public final Object a() {
                return byjl.a(AppContextProvider.a());
            }
        };
        this.b = new eijr() { // from class: bqdb
            @Override // defpackage.eijr
            public final Object a() {
                return bqcn.c();
            }
        };
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action;
        char c;
        if (!fpjt.a.a().x() || intent == null || (action = intent.getAction()) == null) {
            return;
        }
        int hashCode = action.hashCode();
        if (hashCode != -2132810491) {
            if (hashCode == -544318258 && action.equals("com.google.android.gms.phenotype.COMMITTED")) {
                c = 1;
            }
            c = 65535;
        } else {
            if (action.equals("com.google.android.gms.phenotype.com.google.android.gms.languageprofile.COMMITTED")) {
                c = 0;
            }
            c = 65535;
        }
        if (c == 0 || (c == 1 && "com.google.android.gms.languageprofile".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")))) {
            LanguageProfileGcmTaskChimeraService.d((byjl) this.a.a(), (byxs) this.b.a());
        }
    }

    FlagChangeOperation(eijr eijrVar, eijr eijrVar2) {
        this.a = eijrVar;
        this.b = eijrVar2;
    }
}

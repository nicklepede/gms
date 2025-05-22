package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import defpackage.casd;
import defpackage.cbgj;
import defpackage.ekww;
import defpackage.fsdk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class FlagChangeOperation extends IntentOperation {
    private final ekww a;
    private final ekww b;

    public FlagChangeOperation() {
        this.a = new ekww() { // from class: bskq
            @Override // defpackage.ekww
            public final Object lK() {
                return casd.a(AppContextProvider.a());
            }
        };
        this.b = new ekww() { // from class: bskr
            @Override // defpackage.ekww
            public final Object lK() {
                return bskd.c();
            }
        };
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action;
        char c;
        if (!fsdk.a.lK().x() || intent == null || (action = intent.getAction()) == null) {
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
            LanguageProfileGcmTaskChimeraService.d((casd) this.a.lK(), (cbgj) this.b.lK());
        }
    }

    FlagChangeOperation(ekww ekwwVar, ekww ekwwVar2) {
        this.a = ekwwVar;
        this.b = ekwwVar2;
    }
}

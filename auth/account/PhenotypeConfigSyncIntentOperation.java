package com.google.android.gms.auth.account;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import defpackage.acok;
import defpackage.atfd;
import defpackage.atfn;
import defpackage.wjo;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PhenotypeConfigSyncIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.gms.auth.account.config.PHENOTYPE_CONFIG_SYNC".equals(action)) {
            Log.i("Auth", String.format(Locale.US, "[PhenotypeConfigSyncIntentOperation] Not handling unknown action:".concat(String.valueOf(action)), new Object[0]));
            return;
        }
        acok acokVar = new acok(this);
        atfn atfnVar = new atfn();
        atfnVar.c = new Feature[]{wjo.e};
        atfnVar.b = false;
        atfnVar.a = new atfd() { // from class: acoh
            @Override // defpackage.atfd
            public final void d(Object obj, Object obj2) {
                int i = acok.a;
                ((acob) ((acog) obj).H()).a(new acoj((dhma) obj2));
            }
        };
        atfnVar.d = 1521;
        acokVar.ji(atfnVar.a());
        Log.i("Auth", String.format(Locale.US, "[PhenotypeConfigSyncIntentOperation] Requested phenotype config sync.", new Object[0]));
    }
}

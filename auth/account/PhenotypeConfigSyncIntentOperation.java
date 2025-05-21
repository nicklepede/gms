package com.google.android.gms.auth.account;

import android.content.Intent;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.common.Feature;
import defpackage.aaok;
import defpackage.arco;
import defpackage.arcy;
import defpackage.unp;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PhenotypeConfigSyncIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        if (!"com.google.android.gms.auth.account.config.PHENOTYPE_CONFIG_SYNC".equals(action)) {
            Log.i("Auth", String.format(Locale.US, "[PhenotypeConfigSyncIntentOperation] Not handling unknown action:".concat(String.valueOf(action)), new Object[0]));
            return;
        }
        aaok aaokVar = new aaok(this);
        arcy arcyVar = new arcy();
        arcyVar.c = new Feature[]{unp.e};
        arcyVar.b = false;
        arcyVar.a = new arco() { // from class: aaoh
            @Override // defpackage.arco
            public final void d(Object obj, Object obj2) {
                int i = aaok.a;
                ((aaob) ((aaog) obj).H()).a(new aaoj((dfau) obj2));
            }
        };
        arcyVar.d = 1521;
        aaokVar.iT(arcyVar.a());
        Log.i("Auth", String.format(Locale.US, "[PhenotypeConfigSyncIntentOperation] Requested phenotype config sync.", new Object[0]));
    }
}

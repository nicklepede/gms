package com.google.android.gms.googleone.escalation.account.service;

import android.content.Intent;
import com.google.android.gms.googleone.escalation.account.service.EscalationAccountsChangedIntentOperation;
import defpackage.ausn;
import defpackage.blnh;
import defpackage.blni;
import defpackage.blnk;
import defpackage.blnw;
import defpackage.eluo;
import defpackage.frnl;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.fxxm;
import defpackage.fybh;
import defpackage.fycr;
import defpackage.fyea;
import defpackage.xgt;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class EscalationAccountsChangedIntentOperation extends blnk {
    public static final /* synthetic */ int b = 0;
    private static final ausn c = ausn.a("EscalationAccountsChangedIntentOperation");
    public blnw a;
    private final fxqu d = new fxre(new fxwd() { // from class: blng
        @Override // defpackage.fxwd
        public final Object a() {
            int i = EscalationAccountsChangedIntentOperation.b;
            fxuv fxuvVar = bsxe.a;
            return fyeb.b(bsxe.b);
        }
    });

    private final fyea c() {
        return (fyea) this.d.a();
    }

    public final blnw a() {
        blnw blnwVar = this.a;
        if (blnwVar != null) {
            return blnwVar;
        }
        fxxm.j("storageCardEligibilityManager");
        return null;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean j;
        fxxm.f(intent, "intent");
        if (frnl.a.lK().a()) {
            j = fybh.j(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE", false);
            if (j) {
                List d = xgt.d(intent);
                if (d.isEmpty()) {
                    ((eluo) c.h()).x("No new removed accounts");
                } else {
                    fycr.b(c(), null, null, new blni(d, this, null), 3);
                }
                Map e = xgt.e(intent);
                if (e.isEmpty()) {
                    ((eluo) c.h()).x("No new renamed accounts");
                } else {
                    fycr.b(c(), null, null, new blnh(e, this, null), 3);
                }
            }
        }
    }
}

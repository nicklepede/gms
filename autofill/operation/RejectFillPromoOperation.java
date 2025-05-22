package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.afty;
import defpackage.agsl;
import defpackage.aihn;
import defpackage.auid;
import defpackage.ausn;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class RejectFillPromoOperation extends IntentOperation {
    private static final ausn a = ausn.b("RejectFillPromoOperation", auid.AUTOFILL);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        aihn j = agsl.a(this).j();
        if (!afty.a.equals(j.z())) {
            ((eluo) ((eluo) a.j()).ai((char) 1025)).x("RejectFillPromoOperation called when already setup");
            return;
        }
        String stringExtra = intent.getStringExtra("fill_promo_rejected_domain_extra");
        if (stringExtra != null) {
            j.ao(stringExtra);
        }
    }
}

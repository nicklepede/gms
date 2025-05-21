package com.google.android.gms.autofill.operation;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.adtr;
import defpackage.aery;
import defpackage.aggx;
import defpackage.asej;
import defpackage.asot;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class RejectFillPromoOperation extends IntentOperation {
    private static final asot a = asot.b("RejectFillPromoOperation", asej.AUTOFILL);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        aggx j = aery.a(this).j();
        if (!adtr.a.equals(j.z())) {
            ((ejhf) ((ejhf) a.j()).ah((char) 1031)).x("RejectFillPromoOperation called when already setup");
            return;
        }
        String stringExtra = intent.getStringExtra("fill_promo_rejected_domain_extra");
        if (stringExtra != null) {
            j.ao(stringExtra);
        }
    }
}

package com.google.android.gms.romanesco.base;

import android.content.Intent;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.cxln;
import defpackage.cxov;
import defpackage.frrr;
import defpackage.frsd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SettingsChangedIntentOperation extends anya {
    static {
        asot.b("ROM_SettingsChangeOp", asej.ROMANESCO);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent, boolean z) {
        if (frsd.a.a().i()) {
            cxln.b(this).a.j();
        }
        if (frrr.d()) {
            cxov.b(getApplicationContext());
        }
    }
}

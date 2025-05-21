package com.google.android.gms.potokens.service.operations;

import android.content.Intent;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.cwqn;
import defpackage.cwqo;
import defpackage.cwqv;
import defpackage.cwrd;
import defpackage.eiig;
import defpackage.frpd;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class PoTokensModuleInitIntentOperation extends anya {
    private cwqn a;

    static {
        asot.b("PoTokensModuleInit", asej.PO_TOKENS);
    }

    public PoTokensModuleInitIntentOperation() {
        this(new cwqo());
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (frpd.c()) {
            if (this.a == null) {
                try {
                    this.a = cwqn.a(this, 0);
                } catch (cwqv | cwrd | IOException | GeneralSecurityException unused) {
                    return;
                }
            }
            this.a.b(0, null);
        }
    }

    public PoTokensModuleInitIntentOperation(cwqn cwqnVar) {
        eiig.x(cwqnVar);
        this.a = cwqnVar;
    }

    public PoTokensModuleInitIntentOperation(cwqo cwqoVar) {
    }
}

package com.google.android.gms.potokens.service.operations;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.czak;
import defpackage.czal;
import defpackage.czas;
import defpackage.czba;
import defpackage.ekvl;
import defpackage.fuji;
import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PoTokensModuleInitIntentOperation extends apzs {
    private czak a;

    static {
        ausn.b("PoTokensModuleInit", auid.PO_TOKENS);
    }

    public PoTokensModuleInitIntentOperation() {
        this(new czal());
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (fuji.c()) {
            if (this.a == null) {
                try {
                    this.a = czak.a(this, 0);
                } catch (czas | czba | IOException | GeneralSecurityException unused) {
                    return;
                }
            }
            this.a.b(0, null);
        }
    }

    public PoTokensModuleInitIntentOperation(czak czakVar) {
        ekvl.y(czakVar);
        this.a = czakVar;
    }

    public PoTokensModuleInitIntentOperation(czal czalVar) {
    }
}

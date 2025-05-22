package com.google.android.gms.auth.aang.impl.deviceaccount;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.atzb;
import defpackage.auad;
import defpackage.fmvu;
import defpackage.fwuc;
import defpackage.wjw;
import defpackage.wtx;
import defpackage.xgt;
import java.io.IOException;
import java.security.KeyStoreException;
import java.util.List;
import org.json.JSONException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AccountAddedIntentOperation extends IntentOperation {
    private static final auad a = new auad("Auth", "AccountAddedIntentOperation");
    private wtx b;

    public AccountAddedIntentOperation() {
        this((wtx) wtx.a.b());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        List a2;
        if (fmvu.a.lK().f()) {
            String action = intent.getAction();
            atzb.s(action);
            if (!action.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE") || (a2 = xgt.a(intent)) == null || a2.isEmpty()) {
                return;
            }
            try {
                a.h("Registering device id after account added", new Object[0]);
                this.b.c(this);
            } catch (fwuc | IOException | KeyStoreException | JSONException | wjw e) {
                a.g("Failed to register device account", e, new Object[0]);
            }
        }
    }

    public AccountAddedIntentOperation(wtx wtxVar) {
        this.b = wtxVar;
    }
}

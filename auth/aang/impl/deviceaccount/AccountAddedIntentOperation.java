package com.google.android.gms.auth.aang.impl.deviceaccount;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.arwm;
import defpackage.arxo;
import defpackage.fkfi;
import defpackage.ftye;
import defpackage.unx;
import defpackage.uxx;
import defpackage.vks;
import java.io.IOException;
import java.security.KeyStoreException;
import java.util.List;
import org.json.JSONException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AccountAddedIntentOperation extends IntentOperation {
    private static final arxo a = new arxo("Auth", "AccountAddedIntentOperation");
    private uxx b;

    public AccountAddedIntentOperation() {
        this((uxx) uxx.a.b());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        List a2;
        if (fkfi.a.a().f()) {
            String action = intent.getAction();
            arwm.s(action);
            if (!action.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE") || (a2 = vks.a(intent)) == null || a2.isEmpty()) {
                return;
            }
            try {
                a.h("Registering device id after account added", new Object[0]);
                this.b.c(this);
            } catch (ftye | IOException | KeyStoreException | JSONException | unx e) {
                a.g("Failed to register device account", e, new Object[0]);
            }
        }
    }

    public AccountAddedIntentOperation(uxx uxxVar) {
        this.b = uxxVar;
    }
}

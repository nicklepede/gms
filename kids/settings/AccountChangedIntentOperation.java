package com.google.android.gms.kids.settings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.brjv;
import defpackage.bzlt;
import defpackage.bzlw;
import defpackage.bzna;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class AccountChangedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            boolean z = !brjv.a().c(this).isEmpty();
            bzlt c = bzna.a(this, "kids_settings", "settings", 0).c();
            c.e("has_supervised_account", z);
            bzlw.f(c);
        }
    }
}

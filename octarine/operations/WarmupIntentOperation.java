package com.google.android.gms.octarine.operations;

import android.accounts.Account;
import android.content.Intent;
import android.webkit.WebSettings;
import com.google.android.chimera.IntentOperation;
import defpackage.auad;
import defpackage.cviz;
import defpackage.fmkp;
import java.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class WarmupIntentOperation extends IntentOperation {
    private final auad a = new auad("Octarine", "WarmupIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Objects.toString(intent);
        String valueOf = String.valueOf(intent);
        auad auadVar = this.a;
        auadVar.d("Warmup intent handled : ".concat(valueOf), new Object[0]);
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("extra.accountName");
        if (stringExtra == null || stringExtra.length() == 0) {
            auadVar.m("Starting WarmupIntentOperation with invalid arguments: missing account", new Object[0]);
            return;
        }
        cviz a = cviz.a.a();
        Account account = new Account(stringExtra, "com.google");
        if (a.g(account)) {
            a.b(account, fmkp.a.lK().a());
        }
        WebSettings.getDefaultUserAgent(this);
    }
}

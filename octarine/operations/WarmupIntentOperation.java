package com.google.android.gms.octarine.operations;

import android.accounts.Account;
import android.content.Intent;
import android.webkit.WebSettings;
import com.google.android.chimera.IntentOperation;
import defpackage.arxo;
import defpackage.cszx;
import defpackage.fjuo;
import defpackage.fvbo;
import java.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class WarmupIntentOperation extends IntentOperation {
    private final arxo a = new arxo("Octarine", "WarmupIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        Objects.toString(intent);
        String valueOf = String.valueOf(intent);
        arxo arxoVar = this.a;
        arxoVar.d("Warmup intent handled : ".concat(valueOf), new Object[0]);
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("extra.accountName");
        if (stringExtra == null || stringExtra.length() == 0) {
            arxoVar.m("Starting WarmupIntentOperation with invalid arguments: missing account", new Object[0]);
            return;
        }
        cszx a = cszx.a.a();
        Account account = new Account(stringExtra, "com.google");
        if (a.g(account)) {
            String a2 = fjuo.a.a().a();
            fvbo.e(a2, "prefetchCookiesUrl(...)");
            a.b(account, a2);
        }
        WebSettings.getDefaultUserAgent(this);
    }
}

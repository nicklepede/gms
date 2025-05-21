package com.google.android.gms.kids.settings;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.bpcf;
import defpackage.bxdd;
import defpackage.bxdg;
import defpackage.bxek;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AccountChangedIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if ("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE".equals(intent.getAction())) {
            boolean z = !bpcf.a().c(this).isEmpty();
            bxdd c = bxek.a(this, "kids_settings", "settings", 0).c();
            c.e("has_supervised_account", z);
            bxdg.f(c);
        }
    }
}

package com.google.android.gms.auth.aang.impl.demoaccount;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.fkeu;
import defpackage.uxg;
import defpackage.vba;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DemoAccountIntentOperation extends IntentOperation {
    static {
        vba.a("DemoAccountIntentOperation");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fkeu.f() && TextUtils.equals(intent.getAction(), "com.google.android.gms.auth.DEMO_ACCOUNT_NOTIFICATION_DISMISSED") && uxg.b()) {
            uxg.a(AppContextProvider.a());
        }
    }
}

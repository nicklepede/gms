package com.google.android.gms.auth.aang.impl.demoaccount;

import android.content.Intent;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import defpackage.fmvg;
import defpackage.wtf;
import defpackage.wxa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DemoAccountIntentOperation extends IntentOperation {
    static {
        wxa.a("DemoAccountIntentOperation");
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (fmvg.f() && TextUtils.equals(intent.getAction(), "com.google.android.gms.auth.DEMO_ACCOUNT_NOTIFICATION_DISMISSED") && wtf.b()) {
            wtf.a(AppContextProvider.a());
        }
    }
}

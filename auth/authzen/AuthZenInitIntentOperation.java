package com.google.android.gms.auth.authzen;

import android.content.Intent;
import defpackage.a;
import defpackage.apzs;
import defpackage.auad;
import defpackage.aura;
import defpackage.ekxj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthZenInitIntentOperation extends apzs {
    private static final auad b = new auad("AuthZenInitIntentOperation");
    private static final String[] a = {"com.google.android.gms.auth.authzen.transaction.secondscreen.SecondScreenGetTokenActivity", "com.google.android.gms.auth.authzen.cryptauth.DialerSecretCodeReceiver", "com.google.android.gms.auth.authzen.AuthzenDeeplinkHandlerActivity"};

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        String[] strArr = a;
        int length = strArr.length;
        for (int i = 0; i < 3; i++) {
            aura.H(this, strArr[i], true);
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        String action = intent.getAction();
        ekxj.e(action);
        b.d(a.n(i, action, "Initializing Authzen, action is ", " ,InitRuntimeState="), new Object[0]);
        GcmReceiverChimeraService.b(this, new Intent(action).putExtra("flags", i));
    }
}

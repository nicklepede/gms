package com.google.android.gms.auth.authzen;

import android.content.Intent;
import defpackage.a;
import defpackage.anya;
import defpackage.arxo;
import defpackage.asng;
import defpackage.eike;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthZenInitIntentOperation extends anya {
    private static final arxo b = new arxo("AuthZenInitIntentOperation");
    private static final String[] a = {"com.google.android.gms.auth.authzen.transaction.secondscreen.SecondScreenGetTokenActivity", "com.google.android.gms.auth.authzen.cryptauth.DialerSecretCodeReceiver", "com.google.android.gms.auth.authzen.AuthzenDeeplinkHandlerActivity"};

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        String[] strArr = a;
        int length = strArr.length;
        for (int i = 0; i < 3; i++) {
            asng.H(this, strArr[i], true);
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        String action = intent.getAction();
        eike.e(action);
        b.d(a.n(i, action, "Initializing Authzen, action is ", " ,InitRuntimeState="), new Object[0]);
        GcmReceiverChimeraService.b(this, new Intent(action).putExtra("flags", i));
    }
}

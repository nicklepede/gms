package com.google.android.gms.fido;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import com.google.android.gms.fido.authenticator.service.AuthenticatorChimeraService;
import com.google.android.gms.fido.fido2.pollux.CableAuthenticatorChimeraService;
import defpackage.a;
import defpackage.aavu;
import defpackage.anya;
import defpackage.asng;
import defpackage.asot;
import defpackage.bazo;
import defpackage.bazq;
import defpackage.bcnj;
import defpackage.fkpj;
import defpackage.fkxu;
import defpackage.fnwy;
import defpackage.fnxz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FidoInitIntentOperation extends anya {
    private static final bcnj a = new bcnj("FidoInitIntentOperation");
    private static final String[] b = {"com.google.android.gms.fido.authenticator.ui.AuthenticatorActivity", "com.google.android.gms.fido.fido2.ui.Fido2FullScreenActivity", "com.google.android.gms.fido.u2f.U2fService", "com.google.android.gms.fido.u2f.ui.AuthenticateActivity"};
    private static final String[] c = {"com.google.android.gms.fido.fido2.pollux.CableAuthenticatorService", "com.google.android.gms.fido.fido2.ui.PolluxActivity"};
    private static final String[] d = {"com.google.android.gms.fido.authenticator.service.cablev2.GcmReceiverService", "com.google.android.gms.fido.authenticator.service.AuthenticatorService"};

    private final void e(String str) {
        try {
            if (asng.a(this, str) == 1) {
                return;
            }
            asng.H(this, str, true);
        } catch (IllegalArgumentException unused) {
            a.h("Unable to enable the component %s", str);
        }
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        a.h(a.j(i, "Initializing Fido module, InitRuntimeState="), new Object[0]);
        String[] strArr = b;
        int length = strArr.length;
        for (int i2 = 0; i2 < 4; i2++) {
            e(strArr[i2]);
        }
        if (fnxz.d()) {
            String[] strArr2 = c;
            int length2 = strArr2.length;
            for (int i3 = 0; i3 < 2; i3++) {
                String str = strArr2[i3];
                try {
                    if (asng.a(this, str) != 2) {
                        asng.M(str, 2);
                    }
                } catch (IllegalArgumentException unused) {
                    a.h("Unable to disable to component %s", str);
                }
            }
        } else {
            String[] strArr3 = c;
            int length3 = strArr3.length;
            for (int i4 = 0; i4 < 2; i4++) {
                e(strArr3[i4]);
            }
            startService(CableAuthenticatorChimeraService.a(this));
        }
        if (fnwy.c()) {
            String[] strArr4 = d;
            int length4 = strArr4.length;
            for (int i5 = 0; i5 < 2; i5++) {
                e(strArr4[i5]);
            }
            asot asotVar = AuthenticatorChimeraService.a;
            startService(new Intent().setClassName(getApplicationContext(), "com.google.android.gms.fido.authenticator.service.AuthenticatorService"));
        }
        if (fkxu.c()) {
            a.d("Listening for identity check toggle.", new Object[0]);
            Bundle bundle = new Bundle();
            bundle.putInt("invocation_reason", 9);
            aavu.d(Settings.Secure.getUriFor("mandatory_biometrics"), bundle);
        }
        if (fkpj.c()) {
            return;
        }
        bazo.d(getApplicationContext(), getPackageName());
        ((bazq) bazq.a.b()).a();
    }
}

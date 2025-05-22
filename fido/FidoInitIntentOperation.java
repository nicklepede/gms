package com.google.android.gms.fido;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import com.google.android.gms.fido.authenticator.service.AuthenticatorChimeraService;
import defpackage.a;
import defpackage.acvu;
import defpackage.apzs;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bddm;
import defpackage.bddo;
import defpackage.beow;
import defpackage.fngi;
import defpackage.fnoz;
import defpackage.fqpa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FidoInitIntentOperation extends apzs {
    private static final beow a = new beow("FidoInitIntentOperation");
    private static final String[] b = {"com.google.android.gms.fido.authenticator.ui.AuthenticatorActivity", "com.google.android.gms.fido.fido2.ui.Fido2FullScreenActivity", "com.google.android.gms.fido.u2f.U2fService", "com.google.android.gms.fido.u2f.ui.AuthenticateActivity"};
    private static final String[] c = {"com.google.android.gms.fido.authenticator.service.cablev2.GcmReceiverService", "com.google.android.gms.fido.authenticator.service.AuthenticatorService"};

    private final void e(String str) {
        try {
            if (aura.a(this, str) == 1) {
                return;
            }
            aura.H(this, str, true);
        } catch (IllegalArgumentException unused) {
            a.h("Unable to enable the component %s", str);
        }
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        beow beowVar = a;
        beowVar.h(a.j(i, "Initializing Fido module, InitRuntimeState="), new Object[0]);
        String[] strArr = b;
        int length = strArr.length;
        for (int i2 = 0; i2 < 4; i2++) {
            e(strArr[i2]);
        }
        if (fqpa.c()) {
            String[] strArr2 = c;
            int length2 = strArr2.length;
            for (int i3 = 0; i3 < 2; i3++) {
                e(strArr2[i3]);
            }
            ausn ausnVar = AuthenticatorChimeraService.a;
            startService(new Intent().setClassName(getApplicationContext(), "com.google.android.gms.fido.authenticator.service.AuthenticatorService"));
        }
        if (fnoz.c()) {
            beowVar.d("Listening for identity check toggle.", new Object[0]);
            Bundle bundle = new Bundle();
            bundle.putInt("invocation_reason", 9);
            acvu.d(Settings.Secure.getUriFor("mandatory_biometrics"), bundle);
        }
        if (fngi.c()) {
            return;
        }
        bddm.d(getApplicationContext(), getPackageName());
        ((bddo) bddo.a.b()).a();
    }
}

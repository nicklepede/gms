package com.google.android.gms.auth.folsom.operation;

import android.content.Intent;
import android.text.TextUtils;
import defpackage.adfo;
import defpackage.adng;
import defpackage.apzs;
import defpackage.aswd;
import defpackage.asxd;
import defpackage.auad;
import defpackage.aura;
import defpackage.fnpo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class FolsomModuleInitIntentOperation extends apzs {
    private static final auad a = adng.a("RecoverableKeyStoreGmsModuleInitIntentOperation");

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        a.d("onInitRuntimeState. intent: %s, flags: %s", intent, Integer.valueOf(i));
        if (fnpo.c()) {
            adfo.e(getApplicationContext(), 4);
            return;
        }
        auad auadVar = adfo.a;
        aswd aswdVar = aswd.a;
        int a2 = asxd.a(this);
        String[] strArr = adfo.b;
        int length = strArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            String str = strArr[i2];
            if (!TextUtils.equals(str, "com.google.android.gms.auth.folsom.service.GcmReceiverService") || a2 >= 12656023) {
                try {
                    if (adfo.d(this, str)) {
                        adfo.a.d("Disabling " + str + ".", new Object[0]);
                        aura.H(this, str, false);
                    } else {
                        adfo.a.d(str + " is already disabled. Ignore.", new Object[0]);
                    }
                } catch (IllegalArgumentException unused) {
                    adfo.a.d("Component " + str + " is not included in the container", new Object[0]);
                }
            } else {
                adfo.a.h(String.valueOf(str).concat(" is not supported. Ignore."), new Object[0]);
            }
        }
    }
}

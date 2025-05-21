package com.google.android.gms.auth.folsom.operation;

import android.content.Intent;
import android.text.TextUtils;
import defpackage.abfo;
import defpackage.abng;
import defpackage.anya;
import defpackage.aqto;
import defpackage.aquo;
import defpackage.arxo;
import defpackage.asng;
import defpackage.fkyh;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class FolsomModuleInitIntentOperation extends anya {
    private static final arxo a = abng.a("RecoverableKeyStoreGmsModuleInitIntentOperation");

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        a.d("onInitRuntimeState. intent: %s, flags: %s", intent, Integer.valueOf(i));
        if (fkyh.c()) {
            abfo.e(getApplicationContext(), 4);
            return;
        }
        arxo arxoVar = abfo.a;
        aqto aqtoVar = aqto.a;
        int a2 = aquo.a(this);
        String[] strArr = abfo.b;
        int length = strArr.length;
        for (int i2 = 0; i2 < 2; i2++) {
            String str = strArr[i2];
            if (!TextUtils.equals(str, "com.google.android.gms.auth.folsom.service.GcmReceiverService") || a2 >= 12656023) {
                try {
                    if (abfo.d(this, str)) {
                        abfo.a.d("Disabling " + str + ".", new Object[0]);
                        asng.H(this, str, false);
                    } else {
                        abfo.a.d(str + " is already disabled. Ignore.", new Object[0]);
                    }
                } catch (IllegalArgumentException unused) {
                    abfo.a.d("Component " + str + " is not included in the container", new Object[0]);
                }
            } else {
                abfo.a.h(String.valueOf(str).concat(" is not supported. Ignore."), new Object[0]);
            }
        }
    }
}

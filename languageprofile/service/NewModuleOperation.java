package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import defpackage.anya;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.bqcn;
import defpackage.byjl;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class NewModuleOperation extends anya {
    private static final asot a = asot.b("NewModuleOp", asej.LANGUAGE_PROFILE);
    private static final String[] b = {"com.google.android.gms.languageprofile.GcmReceiverService", "com.google.android.gms.languageprofile.GcmTaskService"};

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        int i2 = (i & 2) + (i & 1);
        int i3 = i & 4;
        int i4 = i & 8;
        if (i2 + i3 + i4 == 0) {
            return;
        }
        if (i3 + i4 > 0) {
            String[] strArr = b;
            int length = strArr.length;
            for (int i5 = 0; i5 < 2; i5++) {
                String str = strArr[i5];
                ((ejhf) a.h()).B("Enable component: %s", str);
                asng.H(this, str, true);
            }
        }
        if (asng.a(this, "com.google.android.gms.languageprofile.GcmTaskService") == 1) {
            ((ejhf) a.h()).x("Schedule LanguageProfileGcmTaskChimeraService tasks.");
            int i6 = LanguageProfileGcmTaskChimeraService.a;
            LanguageProfileGcmTaskChimeraService.d(byjl.a(AppContextProvider.a()), bqcn.c());
        }
    }
}

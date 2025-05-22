package com.google.android.gms.languageprofile.service;

import android.content.Intent;
import com.google.android.gms.chimera.modules.languageprofile.AppContextProvider;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bskd;
import defpackage.casd;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class NewModuleOperation extends apzs {
    private static final ausn a = ausn.b("NewModuleOp", auid.LANGUAGE_PROFILE);
    private static final String[] b = {"com.google.android.gms.languageprofile.GcmReceiverService", "com.google.android.gms.languageprofile.GcmTaskService"};

    @Override // defpackage.apzs
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
                ((eluo) a.h()).B("Enable component: %s", str);
                aura.H(this, str, true);
            }
        }
        if (aura.a(this, "com.google.android.gms.languageprofile.GcmTaskService") == 1) {
            ((eluo) a.h()).x("Schedule LanguageProfileGcmTaskChimeraService tasks.");
            int i6 = LanguageProfileGcmTaskChimeraService.a;
            LanguageProfileGcmTaskChimeraService.d(casd.a(AppContextProvider.a()), bskd.c());
        }
    }
}

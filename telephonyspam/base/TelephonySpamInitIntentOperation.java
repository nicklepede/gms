package com.google.android.gms.telephonyspam.base;

import android.content.Intent;
import com.google.android.gms.chimera.modules.telephonyspam.AppContextProvider;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.casd;
import defpackage.dhox;
import defpackage.eluo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TelephonySpamInitIntentOperation extends apzs {
    private static final ausn a = ausn.b("TelephonySpamInit", auid.TELEPHONY_SPAM);

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        ((eluo) ((eluo) a.h()).ai((char) 11082)).x("onModuleUpdated TelephonySpam module initialized");
        ausn ausnVar = dhox.a;
        casd a2 = casd.a(AppContextProvider.a());
        ((eluo) ((eluo) dhox.a.h()).ai((char) 11126)).x("scheduleSyncTasks");
        dhox.c(a2);
        dhox.b(a2);
    }

    @Override // defpackage.apzs
    protected final void d(Intent intent) {
        ((eluo) ((eluo) a.h()).ai((char) 11080)).x("On boot completed TelephonySpam module initialized");
        a(intent, true);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
    }
}

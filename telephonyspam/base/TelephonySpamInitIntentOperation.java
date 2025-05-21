package com.google.android.gms.telephonyspam.base;

import android.content.Intent;
import com.google.android.gms.chimera.modules.telephonyspam.AppContextProvider;
import defpackage.anya;
import defpackage.asej;
import defpackage.asot;
import defpackage.byjl;
import defpackage.dfdr;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TelephonySpamInitIntentOperation extends anya {
    private static final asot a = asot.b("TelephonySpamInit", asej.TELEPHONY_SPAM);

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        ((ejhf) ((ejhf) a.h()).ah((char) 11079)).x("onModuleUpdated TelephonySpam module initialized");
        asot asotVar = dfdr.a;
        byjl a2 = byjl.a(AppContextProvider.a());
        ((ejhf) ((ejhf) dfdr.a.h()).ah((char) 11123)).x("scheduleSyncTasks");
        dfdr.c(a2);
        dfdr.b(a2);
    }

    @Override // defpackage.anya
    protected final void d(Intent intent) {
        ((ejhf) ((ejhf) a.h()).ah((char) 11077)).x("On boot completed TelephonySpam module initialized");
        a(intent, true);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
    }
}

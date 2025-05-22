package com.google.android.gms.presencemanager.service;

import android.content.Intent;
import defpackage.apzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.fujv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class PresenceManagerModuleInitIntentOperation extends apzs {
    static {
        ausn.b("PresenceManagerModule", auid.PRESENCE_MANAGER);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (fujv.a.lK().i() || (i & 14) == 0) {
            return;
        }
        int i2 = PresenceManagerChimeraService.a;
        startService(new Intent().setClassName(this, "com.google.android.gms.presencemanager.service.PresenceManagerPresenceReportService"));
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
    }
}

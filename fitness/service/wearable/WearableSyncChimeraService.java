package com.google.android.gms.fitness.service.wearable;

import android.content.Intent;
import defpackage.athw;
import defpackage.ausn;
import defpackage.bjev;
import defpackage.eluo;
import defpackage.etry;
import defpackage.etrz;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class WearableSyncChimeraService extends athw {
    private static final ausn b = bjev.a();

    public WearableSyncChimeraService() {
        super("WearableSyncChimeraService");
    }

    @Override // defpackage.aupn
    protected final void b(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("initialize", false);
        int intExtra = intent.getIntExtra("sync_source", 0);
        eluo eluoVar = (eluo) ((eluo) b.i()).ai(4851);
        Boolean valueOf = Boolean.valueOf(booleanExtra);
        etry etryVar = etry.NO_USER_DATA;
        eluoVar.P("WearableSyncChimeraService called from a non-watch: [initialize=%s, syncSourceNumber=%s]", new etrz(etryVar, valueOf), new etrz(etryVar, Integer.valueOf(intExtra)));
    }
}

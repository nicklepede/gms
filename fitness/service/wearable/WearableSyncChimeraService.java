package com.google.android.gms.fitness.service.wearable;

import android.content.Intent;
import defpackage.arfh;
import defpackage.asot;
import defpackage.bhaf;
import defpackage.ejhf;
import defpackage.erdc;
import defpackage.erdd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class WearableSyncChimeraService extends arfh {
    private static final asot b = bhaf.a();

    public WearableSyncChimeraService() {
        super("WearableSyncChimeraService");
    }

    @Override // defpackage.aslt
    protected final void b(Intent intent) {
        boolean booleanExtra = intent.getBooleanExtra("initialize", false);
        int intExtra = intent.getIntExtra("sync_source", 0);
        ejhf ejhfVar = (ejhf) ((ejhf) b.i()).ah(4841);
        Boolean valueOf = Boolean.valueOf(booleanExtra);
        erdc erdcVar = erdc.NO_USER_DATA;
        ejhfVar.P("WearableSyncChimeraService called from a non-watch: [initialize=%s, syncSourceNumber=%s]", new erdd(erdcVar, valueOf), new erdd(erdcVar, Integer.valueOf(intExtra)));
    }
}

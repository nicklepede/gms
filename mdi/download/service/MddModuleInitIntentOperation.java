package com.google.android.gms.mdi.download.service;

import android.content.Context;
import android.content.Intent;
import defpackage.apzs;
import defpackage.cerq;
import defpackage.cerv;
import defpackage.drtn;
import defpackage.drys;
import defpackage.dstv;
import defpackage.dstx;
import defpackage.dsuk;
import defpackage.dsxd;
import defpackage.ektg;
import defpackage.ekwa;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MddModuleInitIntentOperation extends apzs {
    private static final drtn a = new drys();

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        int i2 = dstx.a;
        int i3 = i & 12;
        Context baseContext = getBaseContext();
        if (i3 <= 0 && (i & 2) <= 0) {
            return;
        }
        MddGcmTaskChimeraService.d();
        dsxd dsxdVar = new dsxd(baseContext);
        int a2 = cerv.a(baseContext);
        drtn drtnVar = a;
        new dsuk(baseContext, dsxdVar, a2, new dstv(drtnVar, ekwa.b), drtnVar, ektg.a);
        cerq.a(baseContext);
    }
}

package com.google.android.gms.mdi.download.service;

import android.content.Context;
import android.content.Intent;
import defpackage.anya;
import defpackage.cciw;
import defpackage.ccjb;
import defpackage.dpje;
import defpackage.dpoj;
import defpackage.dqjn;
import defpackage.dqjp;
import defpackage.dqkc;
import defpackage.dqmv;
import defpackage.eigb;
import defpackage.eiiv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MddModuleInitIntentOperation extends anya {
    private static final dpje a = new dpoj();

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        int i2 = dqjp.a;
        int i3 = i & 12;
        Context baseContext = getBaseContext();
        if (i3 <= 0 && (i & 2) <= 0) {
            return;
        }
        MddGcmTaskChimeraService.d();
        dqmv dqmvVar = new dqmv(baseContext);
        int a2 = ccjb.a(baseContext);
        dpje dpjeVar = a;
        new dqkc(baseContext, dqmvVar, a2, new dqjn(dpjeVar, eiiv.b), dpjeVar, eigb.a);
        cciw.a(baseContext);
    }
}

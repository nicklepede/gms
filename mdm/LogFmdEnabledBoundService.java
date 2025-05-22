package com.google.android.gms.mdm;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.casd;
import defpackage.cauf;
import defpackage.cfbx;
import defpackage.cfcc;
import defpackage.dhlq;
import defpackage.dkbl;
import defpackage.funx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LogFmdEnabledBoundService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        if (funx.l()) {
            cfcc.a(casd.a(this));
            return 2;
        }
        if (!funx.j()) {
            return 2;
        }
        final cfbx cfbxVar = new cfbx(this, dkbl.a(this));
        if (!funx.i()) {
            return 0;
        }
        cfbxVar.b.aK().z(new dhlq() { // from class: cfbw
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                if (((atat) obj).q()) {
                    cfbx cfbxVar2 = cfbx.this;
                    cfcu cfcuVar = cfcw.f;
                    Context context = cfbxVar2.a;
                    boolean booleanValue = cfcuVar.a(context).booleanValue();
                    int i = true != auqx.h(context, context.getPackageName()).isEmpty() ? 2 : 3;
                    bvef v = bvef.v();
                    fgrc v2 = fhto.a.v();
                    fhtn fhtnVar = fhtn.SAMPLED_SETTINGS_SNAPSHOT;
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fhto fhtoVar = (fhto) v2.b;
                    fhtoVar.c = fhtnVar.eM;
                    fhtoVar.b |= 2;
                    fgrc v3 = fhtl.a.v();
                    fhti fhtiVar = fhti.GMS_CORE;
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    fhtl fhtlVar = (fhtl) v3.b;
                    fhtlVar.c = fhtiVar.h;
                    fhtlVar.b = 1 | fhtlVar.b;
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fhto fhtoVar2 = (fhto) v2.b;
                    fhtl fhtlVar2 = (fhtl) v3.Q();
                    fhtlVar2.getClass();
                    fhtoVar2.f = fhtlVar2;
                    fhtoVar2.b |= 16;
                    fgrc v4 = fhtq.a.v();
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    fgri fgriVar = v4.b;
                    fhtq fhtqVar = (fhtq) fgriVar;
                    fhtqVar.b |= 2;
                    fhtqVar.f = booleanValue;
                    if (!fgriVar.L()) {
                        v4.U();
                    }
                    fhtq fhtqVar2 = (fhtq) v4.b;
                    fhtqVar2.g = i - 1;
                    fhtqVar2.b |= 4;
                    String l = Long.toString(aura.e(context));
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    fhtq fhtqVar3 = (fhtq) v4.b;
                    l.getClass();
                    fhtqVar3.c = 2;
                    fhtqVar3.d = l;
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    fhto fhtoVar3 = (fhto) v2.b;
                    fhtq fhtqVar4 = (fhtq) v4.Q();
                    fhtqVar4.getClass();
                    fhtoVar3.g = fhtqVar4;
                    fhtoVar3.b |= 32;
                    v.f((fhto) v2.Q());
                }
            }
        });
        return 0;
    }
}

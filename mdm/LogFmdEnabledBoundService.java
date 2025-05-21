package com.google.android.gms.mdm;

import android.content.Context;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import defpackage.byjl;
import defpackage.byln;
import defpackage.cctd;
import defpackage.ccti;
import defpackage.dfak;
import defpackage.dhqf;
import defpackage.frte;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LogFmdEnabledBoundService extends GmsTaskBoundService {
    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        if (frte.l()) {
            ccti.a(byjl.a(this));
            return 2;
        }
        if (!frte.j()) {
            return 2;
        }
        final cctd cctdVar = new cctd(this, dhqf.a(this));
        if (!frte.i()) {
            return 0;
        }
        cctdVar.b.aL().z(new dfak() { // from class: cctc
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                if (((aqye) obj).r()) {
                    cctd cctdVar2 = cctd.this;
                    ccua ccuaVar = ccuc.f;
                    Context context = cctdVar2.a;
                    boolean booleanValue = ccuaVar.a(context).booleanValue();
                    int i = true != asnd.h(context, context.getPackageName()).isEmpty() ? 2 : 3;
                    bswh v = bswh.v();
                    fecj v2 = ffeq.a.v();
                    ffep ffepVar = ffep.SAMPLED_SETTINGS_SNAPSHOT;
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    ffeq ffeqVar = (ffeq) v2.b;
                    ffeqVar.c = ffepVar.eK;
                    ffeqVar.b |= 2;
                    fecj v3 = ffen.a.v();
                    ffek ffekVar = ffek.GMS_CORE;
                    if (!v3.b.L()) {
                        v3.U();
                    }
                    ffen ffenVar = (ffen) v3.b;
                    ffenVar.c = ffekVar.h;
                    ffenVar.b = 1 | ffenVar.b;
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    ffeq ffeqVar2 = (ffeq) v2.b;
                    ffen ffenVar2 = (ffen) v3.Q();
                    ffenVar2.getClass();
                    ffeqVar2.f = ffenVar2;
                    ffeqVar2.b |= 16;
                    fecj v4 = ffes.a.v();
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    fecp fecpVar = v4.b;
                    ffes ffesVar = (ffes) fecpVar;
                    ffesVar.b |= 2;
                    ffesVar.f = booleanValue;
                    if (!fecpVar.L()) {
                        v4.U();
                    }
                    ffes ffesVar2 = (ffes) v4.b;
                    ffesVar2.g = i - 1;
                    ffesVar2.b |= 4;
                    String l = Long.toString(asng.e(context));
                    if (!v4.b.L()) {
                        v4.U();
                    }
                    ffes ffesVar3 = (ffes) v4.b;
                    l.getClass();
                    ffesVar3.c = 2;
                    ffesVar3.d = l;
                    if (!v2.b.L()) {
                        v2.U();
                    }
                    ffeq ffeqVar3 = (ffeq) v2.b;
                    ffes ffesVar4 = (ffes) v4.Q();
                    ffesVar4.getClass();
                    ffeqVar3.g = ffesVar4;
                    ffeqVar3.b |= 32;
                    v.f((ffeq) v2.Q());
                }
            }
        });
        return 0;
    }
}

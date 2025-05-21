package com.google.android.gms.mdm;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.mdm.PhenotypeFlagsChangedIntentOperation;
import defpackage.aqto;
import defpackage.asej;
import defpackage.asot;
import defpackage.bedy;
import defpackage.ccti;
import defpackage.dvlw;
import defpackage.dvmh;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eiih;
import defpackage.eirn;
import defpackage.eiuu;
import defpackage.ejhf;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class PhenotypeFlagsChangedIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;
    private static final asot b = asot.b("PhenotypeChangedIntOp", asej.SECURITY);
    private static final eiuu c = eiuu.K("com.google.android.gms.security", "com.google.android.gms.findmydevice");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(final Intent intent) {
        eiid c2 = intent != null ? eirn.j(c).c(new eiih() { // from class: cctk
            @Override // defpackage.eiih
            public final boolean a(Object obj) {
                int i = PhenotypeFlagsChangedIntentOperation.a;
                return asqg.f((String) obj).equals(intent.getAction());
            }
        }) : eigb.a;
        if (!c2.h()) {
            ((ejhf) b.j()).B("Unsupported intent: [%s]", intent != null ? intent.getAction() : null);
            return;
        }
        ((ejhf) b.h()).x("New flags committed.");
        dvlw.f(dvmh.a((String) c2.c()));
        ccti.b(aqto.a, new bedy(this), this);
    }
}

package com.google.android.gms.fido.fido2.ui.hybrid;

import defpackage.aca;
import defpackage.ausn;
import defpackage.beka;
import defpackage.bekf;
import defpackage.bekl;
import defpackage.belh;
import defpackage.beou;
import defpackage.beov;
import defpackage.eluo;
import defpackage.fqrs;
import defpackage.ryr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class HybridAuthenticateChimeraActivity extends ryr {
    public static final ausn h = beov.a("HybridAuthenticateChimeraActivity");
    public belh i;
    public bekl j;
    public bekf k;
    private final String l = "fido_test_extra";
    private aca m;
    private beka n;
    private beou o;
    private String p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x060a  */
    /* JADX WARN: Type inference failed for: r2v67, types: [ekvi] */
    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r24) {
        /*
            Method dump skipped, instructions count: 1620
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.ui.hybrid.HybridAuthenticateChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStop() {
        super.onStop();
        if (getIntent().hasExtra("ClientFlowExtra")) {
            return;
        }
        if (!fqrs.a.lK().j() || isFinishing()) {
            final bekl beklVar = this.j;
            ausn ausnVar = bekl.a;
            ((eluo) ausnVar.h()).x("onCancelAuthenticator");
            if (beklVar.c.K != null) {
                beklVar.b.submit(new Runnable() { // from class: bekk
                    @Override // java.lang.Runnable
                    public final void run() {
                        bdza bdzaVar = bekl.this.c.K;
                        ((eluo) bdza.a.h()).x("onCancelAuthenticator invoked");
                        beae beaeVar = bdzaVar.f;
                        if (beaeVar != null) {
                            beaeVar.g(new byte[]{beaq.CTAP2_ERR_OPERATION_DENIED.h}, bdzaVar.g.d);
                            bdzaVar.f.a();
                        }
                    }
                });
            } else {
                ((eluo) ausnVar.j()).x("Cannot cancelAuthenticator as AuthenticatorController is null");
            }
            finish();
        }
    }
}

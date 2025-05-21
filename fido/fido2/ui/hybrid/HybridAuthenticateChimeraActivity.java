package com.google.android.gms.fido.fido2.ui.hybrid;

import defpackage.abv;
import defpackage.asot;
import defpackage.bciq;
import defpackage.bciv;
import defpackage.bcjb;
import defpackage.bcjw;
import defpackage.bcnh;
import defpackage.bcni;
import defpackage.ejhf;
import defpackage.fnzw;
import defpackage.qfn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class HybridAuthenticateChimeraActivity extends qfn {
    public static final asot h = bcni.a("HybridAuthenticateChimeraActivity");
    public bcjw i;
    public bcjb j;
    public bciv k;
    private final String l = "fido_test_extra";
    private abv m;
    private bciq n;
    private bcnh o;
    private String p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05b2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x05e0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05e4  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x060a  */
    /* JADX WARN: Type inference failed for: r2v64, types: [eiid] */
    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStop() {
        super.onStop();
        if (getIntent().hasExtra("ClientFlowExtra")) {
            return;
        }
        if (!fnzw.a.a().k() || isFinishing()) {
            final bcjb bcjbVar = this.j;
            asot asotVar = bcjb.a;
            ((ejhf) asotVar.h()).x("onCancelAuthenticator");
            if (bcjbVar.c.K != null) {
                bcjbVar.b.submit(new Runnable() { // from class: bcja
                    @Override // java.lang.Runnable
                    public final void run() {
                        bbvi bbviVar = bcjb.this.c.K;
                        ((ejhf) bbvi.a.h()).x("onCancelAuthenticator invoked");
                        bbwm bbwmVar = bbviVar.f;
                        if (bbwmVar != null) {
                            bbwmVar.g(new byte[]{bbwy.CTAP2_ERR_OPERATION_DENIED.h}, bbviVar.g.d);
                            bbviVar.f.a();
                        }
                    }
                });
            } else {
                ((ejhf) asotVar.j()).x("Cannot cancelAuthenticator as AuthenticatorController is null");
            }
            finish();
        }
    }
}

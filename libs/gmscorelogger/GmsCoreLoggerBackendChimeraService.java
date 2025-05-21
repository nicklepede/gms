package com.google.android.gms.libs.gmscorelogger;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.gmscorelogger.GmsCoreLoggerBackendChimeraService;
import defpackage.brep;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.eits;
import defpackage.ejck;
import defpackage.fmvs;
import java.security.SecureRandom;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GmsCoreLoggerBackendChimeraService extends bxgd {
    private final eijr a;
    private final eijr b;

    public GmsCoreLoggerBackendChimeraService() {
        super(new int[]{299}, new String[]{"com.google.android.gms.libs.gmscorelogger.service.START"}, ejck.a, 1, 10, (int) fmvs.a.a().n(), (eits) null);
        this.a = eijy.a(new eijr() { // from class: brca
            @Override // defpackage.eijr
            public final Object a() {
                return GmsCoreLoggerBackendChimeraService.this.l();
            }
        });
        this.b = eijy.a(new eijr() { // from class: brcb
            @Override // defpackage.eijr
            public final Object a() {
                asot asotVar = brhz.a;
                brhz brhzVar = new brhz(new SecureRandom(), new brhw(GmsCoreLoggerBackendChimeraService.this));
                try {
                    brhzVar.b.c();
                    return brhzVar;
                } catch (brab e) {
                    ((ejhf) ((ejhf) ((ejhf) brhz.a.j()).s(e)).ah((char) 5409)).x("Failed to clear expired identifiers");
                    return brhzVar;
                }
            }
        });
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        bxgjVar.c(new brep((bxgo) this.a.a(), this.b));
    }
}

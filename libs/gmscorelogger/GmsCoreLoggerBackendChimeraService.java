package com.google.android.gms.libs.gmscorelogger;

import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.libs.gmscorelogger.GmsCoreLoggerBackendChimeraService;
import defpackage.btmg;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.elgx;
import defpackage.elpp;
import defpackage.fpnq;
import java.security.SecureRandom;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GmsCoreLoggerBackendChimeraService extends bzot {
    private final ekww a;
    private final ekww b;

    public GmsCoreLoggerBackendChimeraService() {
        super(new int[]{299}, new String[]{"com.google.android.gms.libs.gmscorelogger.service.START"}, elpp.a, 1, 10, (int) fpnq.a.lK().n(), (elgx) null);
        this.a = ekxd.a(new ekww() { // from class: btjr
            @Override // defpackage.ekww
            public final Object lK() {
                return GmsCoreLoggerBackendChimeraService.this.l();
            }
        });
        this.b = ekxd.a(new ekww() { // from class: btjs
            @Override // defpackage.ekww
            public final Object lK() {
                ausn ausnVar = btpq.a;
                btpq btpqVar = new btpq(new SecureRandom(), new btpn(GmsCoreLoggerBackendChimeraService.this));
                try {
                    btpqVar.b.c();
                    return btpqVar;
                } catch (bths e) {
                    ((eluo) ((eluo) ((eluo) btpq.a.j()).s(e)).ai((char) 5423)).x("Failed to clear expired identifiers");
                    return btpqVar;
                }
            }
        });
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        bzozVar.c(new btmg((bzpe) this.a.lK(), this.b));
    }
}

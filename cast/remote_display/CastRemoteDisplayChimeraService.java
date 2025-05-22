package com.google.android.gms.cast.remote_display;

import android.content.Context;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aoca;
import defpackage.aoji;
import defpackage.apbt;
import defpackage.apbx;
import defpackage.apcj;
import defpackage.apfl;
import defpackage.apfm;
import defpackage.apjh;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.elpp;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastRemoteDisplayChimeraService extends bzot {
    private static final ekww a = ekxd.a(new ekww() { // from class: apje
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(foqb.o());
        }
    });
    private bzpe b;
    private aoca c;
    private apbt d;
    private apbx m;

    public CastRemoteDisplayChimeraService() {
        super(83, "com.google.android.gms.cast.remote_display.service.START", elpp.a, 3, 10);
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (getServiceRequest.d != 83) {
            bzozVar.a(1, null);
            return;
        }
        if (this.d == null) {
            aoca aocaVar = this.c;
            if (aocaVar == null) {
                throw new IllegalStateException("castComponent cannot be null");
            }
            this.d = new apbt(getApplicationContext(), aocaVar.g, this.m);
        }
        Context applicationContext = getApplicationContext();
        bzpe bzpeVar = this.b;
        String str = getServiceRequest.f;
        apbt apbtVar = this.d;
        ekvl.y(apbtVar);
        bzozVar.c(new apjh(applicationContext, bzpeVar, str, apbtVar, getServiceRequest.f, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        aoca a2 = aoca.a(getApplicationContext(), "CastRemoteDisplayService");
        this.c = a2;
        apcj apcjVar = a2.j.a;
        ekvl.y(a2);
        this.b = m(aoji.a());
        ScheduledExecutorService a3 = aoji.a();
        apfm apfmVar = new apfm();
        apfl apflVar = new apfl();
        aoca aocaVar = this.c;
        ekvl.y(aocaVar);
        this.m = new apbx(this, a3, apcjVar, a2.g, apfmVar, apflVar, aocaVar.e, a);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        this.d = null;
        if (this.c != null) {
            aoca.b("CastRemoteDisplayService");
            this.c = null;
        }
        super.onDestroy();
    }
}

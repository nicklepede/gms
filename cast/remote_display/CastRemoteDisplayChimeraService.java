package com.google.android.gms.cast.remote_display;

import android.content.Context;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.amap;
import defpackage.amhy;
import defpackage.anah;
import defpackage.anal;
import defpackage.anax;
import defpackage.andy;
import defpackage.andz;
import defpackage.anhu;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ejck;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastRemoteDisplayChimeraService extends bxgd {
    private static final eijr a = eijy.a(new eijr() { // from class: anhr
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(flyr.o());
        }
    });
    private bxgo b;
    private amap c;
    private anah d;
    private anal m;

    public CastRemoteDisplayChimeraService() {
        super(83, "com.google.android.gms.cast.remote_display.service.START", ejck.a, 3, 10);
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (getServiceRequest.d != 83) {
            bxgjVar.a(1, null);
            return;
        }
        if (this.d == null) {
            amap amapVar = this.c;
            if (amapVar == null) {
                throw new IllegalStateException("castComponent cannot be null");
            }
            this.d = new anah(getApplicationContext(), amapVar.g, this.m);
        }
        Context applicationContext = getApplicationContext();
        bxgo bxgoVar = this.b;
        String str = getServiceRequest.f;
        anah anahVar = this.d;
        eiig.x(anahVar);
        bxgjVar.c(new anhu(applicationContext, bxgoVar, str, anahVar, getServiceRequest.f, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        amap a2 = amap.a(getApplicationContext(), "CastRemoteDisplayService");
        this.c = a2;
        anax anaxVar = a2.j.a;
        eiig.x(a2);
        this.b = m(amhy.a());
        ScheduledExecutorService a3 = amhy.a();
        andz andzVar = new andz();
        andy andyVar = new andy();
        amap amapVar = this.c;
        eiig.x(amapVar);
        this.m = new anal(this, a3, anaxVar, a2.g, andzVar, andyVar, amapVar.e, a);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        this.d = null;
        if (this.c != null) {
            amap.b("CastRemoteDisplayService");
            this.c = null;
        }
        super.onDestroy();
    }
}

package com.google.android.gms.wallet.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.dhkm;
import defpackage.dkvs;
import defpackage.dkww;
import defpackage.dlgu;
import defpackage.dlhr;
import defpackage.dlia;
import defpackage.dlid;
import defpackage.dlij;
import defpackage.dlim;
import defpackage.dlkg;
import defpackage.dlkx;
import defpackage.dlla;
import defpackage.dllj;
import defpackage.dlmz;
import defpackage.dlnf;
import defpackage.dlnr;
import defpackage.dlnt;
import defpackage.dlnu;
import defpackage.dlny;
import defpackage.dlob;
import defpackage.dloe;
import defpackage.dlog;
import defpackage.dloj;
import defpackage.dlol;
import defpackage.efzw;
import defpackage.egcg;
import defpackage.egji;
import defpackage.elgo;
import defpackage.elpp;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PaymentChimeraService extends bzot {
    public static final elgo a = elgo.s("com.google.android.gms.wallet.service.BIND", "com.google.android.gms.wallet.service.ib.IIbService", "com.google.android.gms.wallet.service.ib.UpdatePaymentDetailsService", "org.chromium.intent.action.UPDATE_PAYMENT_DETAILS", "com.google.android.gms.wallet.service.ow.IOwInternalService", "com.google.android.gms.wallet.service.orchestration.IOrchestrationService", "com.google.android.gms.wallet.service.reauth.IReauthService", "com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService");
    private dlnu b;
    private dlny c;
    private dlid d;
    private dllj m;
    private dlol n;
    private egcg o;
    private dkww p;
    private dlhr q;
    private dlkx r;
    private dlim s;
    private dlij t;
    private dlgu u;
    private efzw v;

    public PaymentChimeraService() {
        super(4, "com.google.android.gms.wallet.service.BIND", elpp.a, 3, 9);
        this.b = null;
        this.c = null;
        this.d = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.v = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = null;
    }

    private final synchronized IBinder c() {
        return h().c.getBinder();
    }

    private final synchronized IBinder d() {
        return h().e;
    }

    private final dkww e() {
        if (this.p == null) {
            this.p = new dkww(getApplicationContext());
        }
        return this.p;
    }

    private final dlhr f() {
        if (this.q == null) {
            this.q = new dlhr(getApplicationContext());
        }
        return this.q;
    }

    private final synchronized dlid g() {
        if (this.d == null) {
            dlkg dlkgVar = new dlkg(i());
            getApplicationContext();
            this.d = new dlia(dlkgVar);
        }
        return this.d;
    }

    private final dlij h() {
        if (this.t == null) {
            this.t = new dlij(getApplicationContext());
        }
        return this.t;
    }

    private final dlim i() {
        if (this.s == null) {
            this.s = new dlim(getApplicationContext(), f(), new dhkm(getApplicationContext()), j(), s());
        }
        return this.s;
    }

    private final dlkx j() {
        if (this.r == null) {
            this.r = new dlkx(getApplicationContext(), new dlmz(getApplicationContext(), e(), new dlnr(getApplicationContext(), new dhkm(getApplicationContext())), s()), s());
        }
        return this.r;
    }

    private final synchronized dllj k() {
        if (this.m == null) {
            dlnf dlnfVar = new dlnf(j());
            getApplicationContext();
            this.m = new dlla(dlnfVar);
        }
        return this.m;
    }

    private final synchronized dlnu o() {
        if (this.b == null) {
            Context applicationContext = getApplicationContext();
            dlkx j = j();
            dhkm dhkmVar = new dhkm(getApplicationContext());
            if (this.u == null) {
                this.u = new dlgu();
            }
            dloe dloeVar = new dloe(applicationContext, j, dhkmVar, i(), new bzpe(getApplicationContext(), this.e, this.f), s(), f());
            getApplicationContext();
            this.b = new dlnu(getApplicationContext(), dloeVar);
        }
        return this.b;
    }

    private final synchronized dlny p() {
        if (this.c == null) {
            this.c = new dlnt(getApplicationContext(), new dloj(new dlob(getApplicationContext(), new dlog(getApplicationContext(), e()), f())));
        }
        return this.c;
    }

    private final synchronized dlol q() {
        if (this.n == null) {
            this.n = new dlol(getApplicationContext());
        }
        return this.n;
    }

    private final synchronized egcg r() {
        if (this.o == null) {
            this.o = new egcg(s(), getApplicationContext());
        }
        return this.o;
    }

    private final efzw s() {
        if (this.v == null) {
            this.v = dkvs.a(getApplicationContext());
        }
        return this.v;
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        dlnu o = o();
        if (o != null) {
            bzozVar.c(o);
        } else {
            bzozVar.b(16, null, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final IBinder onBind(Intent intent) {
        char c;
        String action = intent.getAction();
        if (action == null) {
            return null;
        }
        switch (action.hashCode()) {
            case -2082527161:
                if (action.equals("com.google.android.gms.wallet.service.ow.IOwInternalService")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case -2035121334:
                if (action.equals("com.google.android.gms.wallet.service.orchestration.IOrchestrationService")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case -518500345:
                if (action.equals("org.chromium.intent.action.UPDATE_PAYMENT_DETAILS")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case -463047518:
                if (action.equals("com.google.android.gms.wallet.service.ib.IIbService")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -292589407:
                if (action.equals("com.google.android.gms.wallet.service.ib.UpdatePaymentDetailsService")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -233414813:
                if (action.equals("com.google.android.gms.wallet.service.BIND")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -216600674:
                if (action.equals("com.google.android.gms.wallet.service.reauth.IReauthService")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 866839314:
                if (action.equals("com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return super.onBind(intent);
            case 1:
                return g();
            case 2:
                return c();
            case 3:
                return d();
            case 4:
                return p();
            case 5:
                return k();
            case 6:
                return q();
            case 7:
                return r();
            default:
                return null;
        }
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        egji.a(getApplicationContext());
    }
}

package com.google.android.gms.wallet.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.dezg;
import defpackage.dikh;
import defpackage.dill;
import defpackage.divj;
import defpackage.diwg;
import defpackage.diwp;
import defpackage.diws;
import defpackage.diwx;
import defpackage.diyn;
import defpackage.dize;
import defpackage.dizh;
import defpackage.dizq;
import defpackage.djbg;
import defpackage.djbm;
import defpackage.djby;
import defpackage.djca;
import defpackage.djcb;
import defpackage.djcf;
import defpackage.djci;
import defpackage.djcl;
import defpackage.djcn;
import defpackage.djcq;
import defpackage.djcs;
import defpackage.edna;
import defpackage.edpg;
import defpackage.edwh;
import defpackage.eitj;
import defpackage.ejck;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PaymentChimeraService extends bxgd {
    public static final eitj a = eitj.q("com.google.android.gms.wallet.service.BIND", "com.google.android.gms.wallet.service.ib.IIbService", "com.google.android.gms.wallet.service.ow.IOwInternalService", "com.google.android.gms.wallet.service.orchestration.IOrchestrationService", "com.google.android.gms.wallet.service.reauth.IReauthService", "com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService");
    private djcb b;
    private djcf c;
    private diws d;
    private dizq m;
    private djcs n;
    private edpg o;
    private dill p;
    private diwg q;
    private dize r;
    private diwx s;
    private divj t;
    private edna u;

    public PaymentChimeraService() {
        super(4, "com.google.android.gms.wallet.service.BIND", ejck.a, 3, 9);
        this.b = null;
        this.c = null;
        this.d = null;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
        this.u = null;
        this.r = null;
        this.s = null;
        this.t = null;
    }

    private final dill c() {
        if (this.p == null) {
            this.p = new dill(getApplicationContext());
        }
        return this.p;
    }

    private final diwg d() {
        if (this.q == null) {
            this.q = new diwg(getApplicationContext());
        }
        return this.q;
    }

    private final synchronized diws e() {
        if (this.d == null) {
            diyn diynVar = new diyn(f());
            getApplicationContext();
            this.d = new diwp(diynVar);
        }
        return this.d;
    }

    private final diwx f() {
        if (this.s == null) {
            this.s = new diwx(getApplicationContext(), d(), new dezg(getApplicationContext()), g(), p());
        }
        return this.s;
    }

    private final dize g() {
        if (this.r == null) {
            this.r = new dize(getApplicationContext(), new djbg(getApplicationContext(), c(), new djby(getApplicationContext(), new dezg(getApplicationContext())), p()), p());
        }
        return this.r;
    }

    private final synchronized dizq h() {
        if (this.m == null) {
            djbm djbmVar = new djbm(g());
            getApplicationContext();
            this.m = new dizh(djbmVar);
        }
        return this.m;
    }

    private final synchronized djcb i() {
        if (this.b == null) {
            Context applicationContext = getApplicationContext();
            dize g = g();
            dezg dezgVar = new dezg(getApplicationContext());
            if (this.t == null) {
                this.t = new divj();
            }
            djcl djclVar = new djcl(applicationContext, g, dezgVar, f(), new bxgo(getApplicationContext(), this.e, this.f), p(), d());
            getApplicationContext();
            this.b = new djcb(getApplicationContext(), djclVar);
        }
        return this.b;
    }

    private final synchronized djcf j() {
        if (this.c == null) {
            this.c = new djca(getApplicationContext(), new djcq(new djci(getApplicationContext(), new djcn(getApplicationContext(), c()), d())));
        }
        return this.c;
    }

    private final synchronized djcs k() {
        if (this.n == null) {
            this.n = new djcs(getApplicationContext());
        }
        return this.n;
    }

    private final synchronized edpg o() {
        if (this.o == null) {
            this.o = new edpg(p(), getApplicationContext());
        }
        return this.o;
    }

    private final edna p() {
        if (this.u == null) {
            this.u = dikh.a(getApplicationContext());
        }
        return this.u;
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        djcb i = i();
        if (i != null) {
            bxgjVar.c(i);
        } else {
            bxgjVar.b(16, null, null);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final IBinder onBind(Intent intent) {
        char c;
        String action = intent.getAction();
        if (action == null) {
            return null;
        }
        switch (action.hashCode()) {
            case -2082527161:
                if (action.equals("com.google.android.gms.wallet.service.ow.IOwInternalService")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -2035121334:
                if (action.equals("com.google.android.gms.wallet.service.orchestration.IOrchestrationService")) {
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
            case -233414813:
                if (action.equals("com.google.android.gms.wallet.service.BIND")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -216600674:
                if (action.equals("com.google.android.gms.wallet.service.reauth.IReauthService")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 866839314:
                if (action.equals("com.google.android.gms.wallet.bender3.framework.actions.IActionExecutorService")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            return super.onBind(intent);
        }
        if (c == 1) {
            return e();
        }
        if (c == 2) {
            return j();
        }
        if (c == 3) {
            return h();
        }
        if (c == 4) {
            return k();
        }
        if (c != 5) {
            return null;
        }
        return o();
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        edwh.a(getApplicationContext());
    }
}

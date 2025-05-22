package com.google.android.gms.cast.firstparty;

import com.google.android.gms.cast.firstparty.CastFirstPartyChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.aoca;
import defpackage.aoji;
import defpackage.aowa;
import defpackage.apqy;
import defpackage.apre;
import defpackage.auto;
import defpackage.bzot;
import defpackage.bzoz;
import defpackage.bzpe;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.elhz;
import defpackage.elpp;
import defpackage.foqb;
import defpackage.fose;
import defpackage.ltj;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CastFirstPartyChimeraService extends bzot {
    public static final /* synthetic */ int a = 0;
    private static final ekww b = ekxd.a(new ekww() { // from class: aovl
        @Override // defpackage.ekww
        public final Object lK() {
            int i = CastFirstPartyChimeraService.a;
            return elhz.G(fose.a.lK().a().b);
        }
    });
    private final String c;
    private final String d;
    private aoca m;
    private bzpe n;
    private ltj o;
    private apqy p;

    public CastFirstPartyChimeraService() {
        super(new int[]{122, 27}, new String[]{"com.google.android.gms.cast.firstparty.START", "com.google.android.gms.cast_mirroring.service.START"}, elpp.a, 0, 10, 1, null, (elhz) b.lK());
        this.c = foqb.i();
        this.d = foqb.a.lK().j();
    }

    @Override // defpackage.bzot
    protected final void a(bzoz bzozVar, GetServiceRequest getServiceRequest) {
        if (this.m == null) {
            this.m = aoca.a(getApplicationContext(), "CastFirstPartyService");
        }
        aoca aocaVar = this.m;
        String str = getServiceRequest.f;
        int i = getServiceRequest.d;
        if (i != 27) {
            if (i != 122) {
                bzozVar.a(1, null);
                return;
            }
            if (str.equals(this.c) || str.equals("com.google.android.gms.apitest") || str.equals("com.google.cast.test.wifipassword1p") || str.equals("com.google.android.gms") || fose.a.lK().b().b.contains(str)) {
                bzozVar.c(new aowa(getApplicationContext(), this.n, auto.a(getApplicationContext()), aocaVar.f, aocaVar.k, str, getServiceRequest.p));
                return;
            } else {
                bzozVar.a(8, null);
                return;
            }
        }
        if (!foqb.k() && !str.equals(this.c) && !str.equals(this.d) && !str.equals("com.google.android.apps.docs.editors.slides")) {
            bzozVar.a(8, null);
            return;
        }
        if (this.p == null) {
            this.p = apqy.b(getApplicationContext(), aoji.a(), aocaVar.g, aocaVar.m, this.o, aocaVar.e);
        }
        int i2 = getServiceRequest.e;
        bzpe bzpeVar = this.n;
        apqy apqyVar = this.p;
        ekvl.y(apqyVar);
        bzozVar.c(new apre(i2, bzpeVar, apqyVar, getServiceRequest.f, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.rtr
    public final void onCreate() {
        this.n = m(aoji.a());
        this.o = ltj.b(this);
    }

    @Override // defpackage.bzot, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        if (this.p != null) {
            apqy apqyVar = apqy.a;
            synchronized (apqy.class) {
                int i = apqy.b - 1;
                apqy.b = i;
                if (i == 0) {
                    apqy.a = null;
                }
            }
            this.p = null;
        }
        if (this.m != null) {
            aoca.b("CastFirstPartyService");
            this.m = null;
        }
        super.onDestroy();
    }
}

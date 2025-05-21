package com.google.android.gms.cast.firstparty;

import com.google.android.gms.cast.firstparty.CastFirstPartyChimeraService;
import com.google.android.gms.common.internal.GetServiceRequest;
import defpackage.amap;
import defpackage.amhy;
import defpackage.amup;
import defpackage.anpf;
import defpackage.anpl;
import defpackage.aspu;
import defpackage.bxgd;
import defpackage.bxgj;
import defpackage.bxgo;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.eiuu;
import defpackage.ejck;
import defpackage.flyr;
import defpackage.fmat;
import defpackage.kaz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CastFirstPartyChimeraService extends bxgd {
    public static final /* synthetic */ int a = 0;
    private static final eijr b = eijy.a(new eijr() { // from class: amua
        @Override // defpackage.eijr
        public final Object a() {
            int i = CastFirstPartyChimeraService.a;
            return eiuu.G(fmat.a.a().a().b);
        }
    });
    private final String c;
    private final String d;
    private amap m;
    private bxgo n;
    private kaz o;
    private anpf p;

    public CastFirstPartyChimeraService() {
        super(new int[]{122, 27}, new String[]{"com.google.android.gms.cast.firstparty.START", "com.google.android.gms.cast_mirroring.service.START"}, ejck.a, 0, 10, 1, null, (eiuu) b.a());
        this.c = flyr.i();
        this.d = flyr.a.a().j();
    }

    @Override // defpackage.bxgd
    protected final void a(bxgj bxgjVar, GetServiceRequest getServiceRequest) {
        if (this.m == null) {
            this.m = amap.a(getApplicationContext(), "CastFirstPartyService");
        }
        amap amapVar = this.m;
        String str = getServiceRequest.f;
        int i = getServiceRequest.d;
        if (i != 27) {
            if (i != 122) {
                bxgjVar.a(1, null);
                return;
            }
            if (str.equals(this.c) || str.equals("com.google.android.gms.apitest") || str.equals("com.google.cast.test.wifipassword1p") || str.equals("com.google.android.gms") || fmat.a.a().b().b.contains(str)) {
                bxgjVar.c(new amup(getApplicationContext(), this.n, aspu.a(getApplicationContext()), amapVar.f, amapVar.k, str, getServiceRequest.p));
                return;
            } else {
                bxgjVar.a(8, null);
                return;
            }
        }
        if (!flyr.k() && !str.equals(this.c) && !str.equals(this.d) && !str.equals("com.google.android.apps.docs.editors.slides")) {
            bxgjVar.a(8, null);
            return;
        }
        if (this.p == null) {
            this.p = anpf.b(getApplicationContext(), amhy.a(), amapVar.g, amapVar.m, this.o, amapVar.e);
        }
        int i2 = getServiceRequest.e;
        bxgo bxgoVar = this.n;
        anpf anpfVar = this.p;
        eiig.x(anpfVar);
        bxgjVar.c(new anpl(i2, bxgoVar, anpfVar, getServiceRequest.f, getServiceRequest.p));
    }

    @Override // com.google.android.chimera.BoundService, defpackage.qan
    public final void onCreate() {
        this.n = m(amhy.a());
        this.o = kaz.b(this);
    }

    @Override // defpackage.bxgd, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        if (this.p != null) {
            anpf anpfVar = anpf.a;
            synchronized (anpf.class) {
                int i = anpf.b - 1;
                anpf.b = i;
                if (i == 0) {
                    anpf.a = null;
                }
            }
            this.p = null;
        }
        if (this.m != null) {
            amap.b("CastFirstPartyService");
            this.m = null;
        }
        super.onDestroy();
    }
}

package com.google.android.gms.semanticlocationhistory.deidentifieddata.storevisits;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.storevisits.StoreVisitsProcessingService;
import com.google.android.libraries.geller.portable.Geller;
import defpackage.asej;
import defpackage.asot;
import defpackage.asow;
import defpackage.aspx;
import defpackage.byhj;
import defpackage.byhp;
import defpackage.byln;
import defpackage.czin;
import defpackage.czip;
import defpackage.czje;
import defpackage.czjg;
import defpackage.czlk;
import defpackage.czps;
import defpackage.dade;
import defpackage.dadh;
import defpackage.dahq;
import defpackage.danf;
import defpackage.daow;
import defpackage.dayg;
import defpackage.dnus;
import defpackage.dnva;
import defpackage.dnzu;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.eiig;
import defpackage.eitl;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fegx;
import defpackage.feof;
import defpackage.frwe;
import defpackage.frxn;
import defpackage.frxq;
import defpackage.frya;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class StoreVisitsProcessingService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.deidentifieddata.storevisits.StoreVisitsProcessingService";
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "StoreVisits");
    private dade c;
    private dayg d;
    private daow e;
    private czje f;
    private czlk g;
    private Geller h;
    private dahq j;

    private final czje d() {
        if (this.f == null) {
            this.f = new czje();
        }
        return this.f;
    }

    private final czlk e() {
        if (this.g == null) {
            this.g = new czlk(d());
        }
        return this.g;
    }

    private final dahq f() {
        if (this.j == null) {
            this.j = new dahq();
        }
        return this.j;
    }

    private final Geller g(Context context) {
        if (this.h == null) {
            int i = aspx.a;
            if (!asow.g(context, "geller_jni_lite_lib")) {
                ((ejhf) ((ejhf) b.j()).ah((char) 10310)).x("loadLibrary failed");
                return null;
            }
            dnus a2 = czin.a(context);
            if (frya.a.a().e()) {
                a2.h = new dnva(dnzu.c(context.getApplicationContext(), byhj.b.h(1, byhp.LOW_POWER), eiid.j("251661004")));
            }
            this.h = new Geller(a2);
        }
        return this.h;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        d().k("StoreVisitsJobStatus", 5);
        if (!frxn.Q()) {
            d().k("StoreVisitsJobStatus", 6);
            return ensj.i(2);
        }
        d().e("StoreVisitsJobs");
        if (frya.g()) {
            if (e().g().e) {
                d().k("StoreVisitsJobStatus", 3);
                return ensj.i(0);
            }
            if (!e().S()) {
                d().k("StoreVisitsJobStatus", 4);
                return ensj.i(0);
            }
        }
        Context a2 = AppContextProvider.a();
        if (g(a2) == null) {
            d().k("StoreVisitsJobStatus", 7);
            return frwe.d() ? enps.f(f().g("StoreVisitsProcessing", fegx.h(System.currentTimeMillis())), new eiho() { // from class: dang
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    String str = StoreVisitsProcessingService.a;
                    return 2;
                }
            }, enre.a) : ensj.i(2);
        }
        if (this.c == null) {
            this.c = dadh.w(a2);
        }
        dade dadeVar = this.c;
        czlk e = e();
        if (this.d == null) {
            czps czpsVar = new czps(feof.ONDEVICE_AD_EVENTS, d(), frya.a.a().f(), eiid.j(38402), eiid.j(Integer.valueOf(czip.a(a2))));
            Geller g = g(a2);
            eiig.x(g);
            this.d = new dayg(g, czpsVar, a2, d());
        }
        danf danfVar = new danf(a2, dadeVar, e, this.d, d(), czjg.a());
        if (!frya.g()) {
            czje d = d();
            czlk e2 = e();
            if (!frxq.h() ? e2.J() : e2.g().e) {
                d.k("StoreVisitsJobStatus", 3);
            }
            if (!e2.S()) {
                d.k("StoreVisitsJobStatus", 4);
            }
        }
        eitl b2 = danfVar.b();
        b2.z().size();
        if (!b2.C()) {
            try {
                if (this.e == null) {
                    this.e = daow.b();
                }
                this.e.d(b2);
            } catch (LevelDbException e3) {
                d().k("StoreVisitsJobStatus", 2);
                ((ejhf) ((ejhf) ((ejhf) b.j()).s(e3)).ah((char) 10315)).x("Failed to generate de-identified store visits data");
                return frwe.d() ? enps.f(f().g("StoreVisitsProcessing", fegx.h(System.currentTimeMillis())), new eiho() { // from class: danh
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        String str = StoreVisitsProcessingService.a;
                        return 2;
                    }
                }, enre.a) : ensj.i(2);
            }
        }
        Geller geller = this.h;
        if (geller != null) {
            geller.o();
            this.h = null;
        }
        d().k("StoreVisitsJobStatus", 1);
        return frwe.d() ? enps.f(f().e("StoreVisitsProcessing", false), new eiho() { // from class: dani
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                String str = StoreVisitsProcessingService.a;
                return 0;
            }
        }, enre.a) : ensj.i(0);
    }
}

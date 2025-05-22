package com.google.android.gms.semanticlocationhistory.deidentifieddata.storevisits;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.storevisits.StoreVisitsProcessingService;
import com.google.android.libraries.geller.portable.Geller;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ausq;
import defpackage.autr;
import defpackage.caqb;
import defpackage.caqh;
import defpackage.cauf;
import defpackage.dbsl;
import defpackage.dbsn;
import defpackage.dbtc;
import defpackage.dbte;
import defpackage.dbvg;
import defpackage.dbzt;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcry;
import defpackage.dcxn;
import defpackage.dcze;
import defpackage.ddio;
import defpackage.dqfb;
import defpackage.dqfj;
import defpackage.dqkd;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.ekvl;
import defpackage.elgq;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fgvq;
import defpackage.fhcy;
import defpackage.fuqy;
import defpackage.fush;
import defpackage.fusk;
import defpackage.fusu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class StoreVisitsProcessingService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.deidentifieddata.storevisits.StoreVisitsProcessingService";
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "StoreVisits");
    private dcnm c;
    private ddio d;
    private dcze e;
    private dbtc f;
    private dbvg g;
    private Geller h;
    private dcry j;

    private final dbtc d() {
        if (this.f == null) {
            this.f = new dbtc();
        }
        return this.f;
    }

    private final dbvg e() {
        if (this.g == null) {
            this.g = new dbvg(d());
        }
        return this.g;
    }

    private final dcry f() {
        if (this.j == null) {
            this.j = new dcry();
        }
        return this.j;
    }

    private final Geller g(Context context) {
        if (this.h == null) {
            int i = autr.a;
            if (!ausq.g(context, "geller_jni_lite_lib")) {
                ((eluo) ((eluo) b.j()).ai((char) 10316)).x("loadLibrary failed");
                return null;
            }
            dqfb a2 = dbsl.a(context);
            if (fusu.a.lK().f()) {
                a2.h = new dqfj(dqkd.c(context.getApplicationContext(), caqb.b.h(1, caqh.LOW_POWER), ekvi.j("251864004")));
            }
            this.h = new Geller(a2);
        }
        return this.h;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        d().k("StoreVisitsJobStatus", 5);
        if (!fush.Q()) {
            d().k("StoreVisitsJobStatus", 6);
            return eqgc.i(2);
        }
        d().e("StoreVisitsJobs");
        if (fusu.h()) {
            if (e().g().e) {
                d().k("StoreVisitsJobStatus", 3);
                return eqgc.i(0);
            }
            if (!e().S()) {
                d().k("StoreVisitsJobStatus", 4);
                return eqgc.i(0);
            }
        }
        Context a2 = AppContextProvider.a();
        if (g(a2) == null) {
            d().k("StoreVisitsJobStatus", 7);
            return fuqy.d() ? eqdl.f(f().g("StoreVisitsProcessing", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: dcxo
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    String str = StoreVisitsProcessingService.a;
                    return 2;
                }
            }, eqex.a) : eqgc.i(2);
        }
        if (this.c == null) {
            this.c = dcnp.w(a2);
        }
        dcnm dcnmVar = this.c;
        dbvg e = e();
        if (this.d == null) {
            dbzt dbztVar = new dbzt(fhcy.ONDEVICE_AD_EVENTS, d(), fusu.a.lK().g(), ekvi.j(38402), ekvi.j(Integer.valueOf(dbsn.a(a2))));
            Geller g = g(a2);
            ekvl.y(g);
            this.d = new ddio(g, dbztVar, a2, d());
        }
        dcxn dcxnVar = new dcxn(a2, dcnmVar, e, this.d, d(), dbte.a());
        if (!fusu.h()) {
            dbtc d = d();
            dbvg e2 = e();
            if (!fusk.g() ? e2.J() : e2.g().e) {
                d.k("StoreVisitsJobStatus", 3);
            }
            if (!e2.S()) {
                d.k("StoreVisitsJobStatus", 4);
            }
        }
        elgq b2 = dcxnVar.b();
        b2.z().size();
        if (!b2.C()) {
            try {
                if (this.e == null) {
                    this.e = dcze.b();
                }
                this.e.d(b2);
            } catch (LevelDbException e3) {
                d().k("StoreVisitsJobStatus", 2);
                ((eluo) ((eluo) ((eluo) b.j()).s(e3)).ai((char) 10321)).x("Failed to generate de-identified store visits data");
                return fuqy.d() ? eqdl.f(f().g("StoreVisitsProcessing", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: dcxp
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        String str = StoreVisitsProcessingService.a;
                        return 2;
                    }
                }, eqex.a) : eqgc.i(2);
            }
        }
        Geller geller = this.h;
        if (geller != null) {
            geller.o();
            this.h = null;
        }
        d().k("StoreVisitsJobStatus", 1);
        return fuqy.d() ? eqdl.f(f().e("StoreVisitsProcessing", false), new ekut() { // from class: dcxq
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                String str = StoreVisitsProcessingService.a;
                return 0;
            }
        }, eqex.a) : eqgc.i(0);
    }
}

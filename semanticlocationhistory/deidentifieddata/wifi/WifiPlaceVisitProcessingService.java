package com.google.android.gms.semanticlocationhistory.deidentifieddata.wifi;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.wifi.WifiPlaceVisitProcessingService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzbx;
import defpackage.cauf;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dcnm;
import defpackage.dcnp;
import defpackage.dcry;
import defpackage.dcze;
import defpackage.dczf;
import defpackage.ekut;
import defpackage.elgq;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fgvq;
import defpackage.fuqy;
import defpackage.fush;
import defpackage.futv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class WifiPlaceVisitProcessingService extends GmsTaskBoundService {
    private dcnm c;
    private dbtc d;
    private dbvg e;
    private dcze f;
    private dcry g;
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "wifi");
    public static final String a = WifiPlaceVisitProcessingService.class.getName();

    public static boolean d() {
        return fush.Q() && futv.d();
    }

    private final dbtc e() {
        if (this.d == null) {
            this.d = new dbtc();
        }
        return this.d;
    }

    private final dcry f() {
        if (this.g == null) {
            this.g = new dcry();
        }
        return this.g;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        if (!d()) {
            return eqgc.i(2);
        }
        e().e("WifiJobCount");
        Context a2 = AppContextProvider.a();
        if (!bzbx.s(a2)) {
            e().e("WifiJobFailNetworkLocationNotOptIn");
            return eqgc.i(2);
        }
        if (this.c == null) {
            this.c = dcnp.w(a2);
        }
        dcnm dcnmVar = this.c;
        if (this.e == null) {
            this.e = new dbvg(e());
        }
        elgq b2 = new dczf(a2, dcnmVar, this.e, e()).b();
        b2.z().size();
        if (!b2.C()) {
            try {
                if (this.f == null) {
                    this.f = dcze.b();
                }
                this.f.d(b2);
            } catch (LevelDbException e) {
                e().e("WifiJobFailUploadCacheException");
                ((eluo) ((eluo) ((eluo) b.j()).s(e)).ai((char) 10359)).x("Failed to write place visits to cache");
                return fuqy.d() ? eqdl.f(f().g("WifiPlaceVisit", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: dczg
                    @Override // defpackage.ekut
                    public final Object apply(Object obj) {
                        String str = WifiPlaceVisitProcessingService.a;
                        return 2;
                    }
                }, eqex.a) : eqgc.i(2);
            }
        }
        e().e("WifiJobSuccess");
        return fuqy.d() ? eqdl.f(f().e("WifiPlaceVisit", false), new ekut() { // from class: dczh
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                String str = WifiPlaceVisitProcessingService.a;
                return 0;
            }
        }, eqex.a) : eqgc.i(0);
    }
}

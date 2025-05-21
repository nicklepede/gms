package com.google.android.gms.semanticlocationhistory.deidentifieddata.wifi;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.wifi.WifiPlaceVisitProcessingService;
import defpackage.asej;
import defpackage.asot;
import defpackage.bwth;
import defpackage.byln;
import defpackage.czje;
import defpackage.czlk;
import defpackage.dade;
import defpackage.dadh;
import defpackage.dahq;
import defpackage.daow;
import defpackage.daox;
import defpackage.eiho;
import defpackage.eitl;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.fegx;
import defpackage.frwe;
import defpackage.frxn;
import defpackage.frzb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class WifiPlaceVisitProcessingService extends GmsTaskBoundService {
    private dade c;
    private czje d;
    private czlk e;
    private daow f;
    private dahq g;
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "wifi");
    public static final String a = WifiPlaceVisitProcessingService.class.getName();

    public static boolean d() {
        return frxn.Q() && frzb.d();
    }

    private final czje e() {
        if (this.d == null) {
            this.d = new czje();
        }
        return this.d;
    }

    private final dahq f() {
        if (this.g == null) {
            this.g = new dahq();
        }
        return this.g;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        if (!d()) {
            return ensj.i(2);
        }
        e().e("WifiJobCount");
        Context a2 = AppContextProvider.a();
        if (!bwth.r(a2)) {
            e().e("WifiJobFailNetworkLocationNotOptIn");
            return ensj.i(2);
        }
        if (this.c == null) {
            this.c = dadh.w(a2);
        }
        dade dadeVar = this.c;
        if (this.e == null) {
            this.e = new czlk(e());
        }
        eitl b2 = new daox(a2, dadeVar, this.e, e()).b();
        b2.z().size();
        if (!b2.C()) {
            try {
                if (this.f == null) {
                    this.f = daow.b();
                }
                this.f.d(b2);
            } catch (LevelDbException e) {
                e().e("WifiJobFailUploadCacheException");
                ((ejhf) ((ejhf) ((ejhf) b.j()).s(e)).ah((char) 10353)).x("Failed to write place visits to cache");
                return frwe.d() ? enps.f(f().g("WifiPlaceVisit", fegx.h(System.currentTimeMillis())), new eiho() { // from class: daoy
                    @Override // defpackage.eiho
                    public final Object apply(Object obj) {
                        String str = WifiPlaceVisitProcessingService.a;
                        return 2;
                    }
                }, enre.a) : ensj.i(2);
            }
        }
        e().e("WifiJobSuccess");
        return frwe.d() ? enps.f(f().e("WifiPlaceVisit", false), new eiho() { // from class: daoz
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                String str = WifiPlaceVisitProcessingService.a;
                return 0;
            }
        }, enre.a) : ensj.i(0);
    }
}

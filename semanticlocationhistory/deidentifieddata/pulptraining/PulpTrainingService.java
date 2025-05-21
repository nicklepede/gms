package com.google.android.gms.semanticlocationhistory.deidentifieddata.pulptraining;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.pulptraining.PulpTrainingService;
import com.google.android.libraries.geller.portable.Geller;
import defpackage.asej;
import defpackage.asot;
import defpackage.asow;
import defpackage.aspx;
import defpackage.byln;
import defpackage.czin;
import defpackage.czip;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czoy;
import defpackage.czpj;
import defpackage.czps;
import defpackage.dadh;
import defpackage.damq;
import defpackage.dbej;
import defpackage.dnus;
import defpackage.eiho;
import defpackage.eiid;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.feof;
import defpackage.frwz;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class PulpTrainingService extends GmsTaskBoundService {
    public static final asot a = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "PulpTraining");
    public static final String b = PulpTrainingService.class.getName();
    private czje c;

    public final czje d() {
        if (this.c == null) {
            this.c = new czje();
        }
        return this.c;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        czpj czpjVar;
        if (!frwz.d()) {
            return ensj.i(0);
        }
        d().e("PulpTrainingJobStart");
        Context a2 = AppContextProvider.a();
        int i = aspx.a;
        if (asow.g(a2, "geller_jni_lite_lib")) {
            final dnus a3 = czin.a(a2);
            czps czpsVar = new czps(feof.HULK_ONDEVICE_PERSONALIZATION, d(), true, eiid.j(38401), eiid.j(Integer.valueOf(czip.a(a2))));
            Objects.requireNonNull(a3);
            czpjVar = new czpj(new czoy() { // from class: damr
                @Override // defpackage.czoy
                public final Geller a() {
                    return new Geller(dnus.this);
                }
            }, czpsVar, a2, d(), null);
        } else {
            ((ejhf) ((ejhf) a.j()).ah((char) 10291)).x("Failed to load Geller JNI library");
            d().e("PulpTrainingJobLoadJniLibraryFail");
            czpjVar = null;
        }
        return czpjVar == null ? ensj.i(2) : enps.f(new damq(dadh.w(AppContextProvider.a()), new czlk(d()), d(), new dbej(), czpjVar).c(), new eiho() { // from class: dams
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                PulpTrainingService pulpTrainingService = PulpTrainingService.this;
                eitl eitlVar = (eitl) obj;
                pulpTrainingService.d().e("PulpTrainingJobComplete");
                if (eitlVar.C()) {
                    pulpTrainingService.d().e("PulpTrainingJobEmptyOutput");
                    return 0;
                }
                try {
                    daow.b().d(eitlVar);
                    pulpTrainingService.d().e("PulpTrainingJobWriteToCacheSuccess");
                    return 0;
                } catch (LevelDbException e) {
                    ((ejhf) ((ejhf) ((ejhf) PulpTrainingService.a.j()).s(e)).ah((char) 10292)).x("Failed to cache de-identified pulp training data");
                    pulpTrainingService.d().e("PulpTrainingJobWriteToCacheFail");
                    return 2;
                }
            }
        }, enre.a);
    }
}

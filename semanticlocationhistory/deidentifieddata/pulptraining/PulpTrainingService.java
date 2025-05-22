package com.google.android.gms.semanticlocationhistory.deidentifieddata.pulptraining;

import android.content.Context;
import com.google.android.gms.chimera.modules.semanticlocationhistory.AppContextProvider;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.pulptraining.PulpTrainingService;
import com.google.android.libraries.geller.portable.Geller;
import defpackage.auid;
import defpackage.ausn;
import defpackage.ausq;
import defpackage.autr;
import defpackage.cauf;
import defpackage.dbsl;
import defpackage.dbsn;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dbyz;
import defpackage.dbzk;
import defpackage.dbzt;
import defpackage.dcnp;
import defpackage.dcwy;
import defpackage.ddor;
import defpackage.dqfb;
import defpackage.ekut;
import defpackage.ekvi;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.fhcy;
import defpackage.furt;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class PulpTrainingService extends GmsTaskBoundService {
    public static final ausn a = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "PulpTraining");
    public static final String b = PulpTrainingService.class.getName();
    private dbtc c;

    public final dbtc d() {
        if (this.c == null) {
            this.c = new dbtc();
        }
        return this.c;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        dbzk dbzkVar;
        if (!furt.c()) {
            return eqgc.i(0);
        }
        d().e("PulpTrainingJobStart");
        Context a2 = AppContextProvider.a();
        int i = autr.a;
        if (ausq.g(a2, "geller_jni_lite_lib")) {
            final dqfb a3 = dbsl.a(a2);
            dbzt dbztVar = new dbzt(fhcy.HULK_ONDEVICE_PERSONALIZATION, d(), true, ekvi.j(38401), ekvi.j(Integer.valueOf(dbsn.a(a2))));
            Objects.requireNonNull(a3);
            dbzkVar = new dbzk(new dbyz() { // from class: dcwz
                @Override // defpackage.dbyz
                public final Geller a() {
                    return new Geller(dqfb.this);
                }
            }, dbztVar, a2, d(), null);
        } else {
            ((eluo) ((eluo) a.j()).ai((char) 10297)).x("Failed to load Geller JNI library");
            d().e("PulpTrainingJobLoadJniLibraryFail");
            dbzkVar = null;
        }
        return dbzkVar == null ? eqgc.i(2) : eqdl.f(new dcwy(dcnp.w(AppContextProvider.a()), new dbvg(d()), d(), new ddor(), dbzkVar).c(), new ekut() { // from class: dcxa
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                PulpTrainingService pulpTrainingService = PulpTrainingService.this;
                elgq elgqVar = (elgq) obj;
                pulpTrainingService.d().e("PulpTrainingJobComplete");
                if (elgqVar.C()) {
                    pulpTrainingService.d().e("PulpTrainingJobEmptyOutput");
                    return 0;
                }
                try {
                    dcze.b().d(elgqVar);
                    pulpTrainingService.d().e("PulpTrainingJobWriteToCacheSuccess");
                    return 0;
                } catch (LevelDbException e) {
                    ((eluo) ((eluo) ((eluo) PulpTrainingService.a.j()).s(e)).ai((char) 10298)).x("Failed to cache de-identified pulp training data");
                    pulpTrainingService.d().e("PulpTrainingJobWriteToCacheFail");
                    return 2;
                }
            }
        }, eqex.a);
    }
}

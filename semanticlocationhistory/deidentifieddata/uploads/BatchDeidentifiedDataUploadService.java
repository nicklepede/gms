package com.google.android.gms.semanticlocationhistory.deidentifieddata.uploads;

import android.accounts.Account;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.uploads.BatchDeidentifiedDataUploadService;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cauf;
import defpackage.dbtc;
import defpackage.dbvg;
import defpackage.dchc;
import defpackage.dcry;
import defpackage.dcxt;
import defpackage.dcxu;
import defpackage.dcze;
import defpackage.ekut;
import defpackage.elau;
import defpackage.elbl;
import defpackage.elgq;
import defpackage.elsn;
import defpackage.elso;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.eqgc;
import defpackage.eqgl;
import defpackage.etry;
import defpackage.etrz;
import defpackage.fgvq;
import defpackage.fuqb;
import defpackage.fuqy;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public final class BatchDeidentifiedDataUploadService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.deidentifieddata.uploads.BatchDeidentifiedDataUploadService";
    private static final ausn b = ausn.c("LocationHistory", auid.SEMANTIC_LOCATION_HISTORY, "BatchAggUploads");
    private dcze c;
    private dcxt d;
    private dbtc e;
    private dbvg f;
    private dcry g;

    private final dbtc d() {
        if (this.e == null) {
            this.e = new dbtc();
        }
        return this.e;
    }

    private final dcry e() {
        if (this.g == null) {
            this.g = new dcry();
        }
        return this.g;
    }

    private final dcxt f() {
        if (this.d == null) {
            if (this.f == null) {
                this.f = new dbvg(d());
            }
            this.d = new dcxt(this.f, d());
        }
        return this.d;
    }

    private final dcze g() {
        if (this.c == null) {
            this.c = dcze.b();
        }
        return this.c;
    }

    private final eqgl h() {
        return eqdl.f(e().g("BatchDeidentifiedDataUpload", fgvq.h(System.currentTimeMillis())), new ekut() { // from class: dcxr
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                String str = BatchDeidentifiedDataUploadService.a;
                return 2;
            }
        }, eqex.a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final eqgl iB(cauf caufVar) {
        d().e("DeidentifiedUploadJobs");
        try {
            elgq c = g().c();
            if (c == null || c.C()) {
                d().k("DeidentifiedUploadStatus", 6);
            } else {
                fuqb fuqbVar = fuqb.a;
                if (fuqbVar.lK().d()) {
                    elbl elblVar = new elbl();
                    elsn listIterator = c.z().listIterator();
                    int i = 0;
                    while (listIterator.hasNext()) {
                        Account account = (Account) listIterator.next();
                        elso it = c.a(account).iterator();
                        while (it.hasNext()) {
                            elblVar.v(account, (dchc) it.next());
                            i++;
                            if (i == fuqbVar.lK().a()) {
                                if (!f().a(elgq.e(elblVar))) {
                                    return fuqy.d() ? h() : eqgc.i(2);
                                }
                                d().f("DeidentifiedUploadsCount", ((elau) elblVar).b);
                                g().g(elgq.e(elblVar));
                                elblVar.s();
                                i = 0;
                            }
                        }
                    }
                    if (!f().a(elgq.e(elblVar))) {
                        return fuqy.d() ? h() : eqgc.i(2);
                    }
                    d().f("DeidentifiedUploadsCount", ((elau) elblVar).b);
                    g().g(elgq.e(elblVar));
                } else {
                    if (!f().a(c)) {
                        return fuqy.d() ? h() : eqgc.i(2);
                    }
                    d().f("DeidentifiedUploadsCount", c.size);
                    g().g(c);
                }
            }
            return fuqy.d() ? eqdl.f(e().e("BatchDeidentifiedDataUpload", false), new ekut() { // from class: dcxs
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    String str = BatchDeidentifiedDataUploadService.a;
                    return 0;
                }
            }, eqex.a) : eqgc.i(0);
        } catch (LevelDbException e) {
            d().k("DeidentifiedUploadStatus", 4);
            ((eluo) ((eluo) ((eluo) b.j()).s(e)).ai((char) 10325)).B("Error retrieve data to upload from cache: %s", new etrz(etry.NO_USER_DATA, e.getMessage()));
            return fuqy.d() ? h() : eqgc.i(2);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.rtr
    public final void onDestroy() {
        dcxu dcxuVar;
        dcxt dcxtVar = this.d;
        if (dcxtVar != null && (dcxuVar = dcxtVar.a) != null) {
            dcxuVar.a();
        }
        super.onDestroy();
    }
}

package com.google.android.gms.semanticlocationhistory.deidentifieddata.uploads;

import android.accounts.Account;
import com.google.android.gms.leveldb.LevelDbException;
import com.google.android.gms.libs.scheduler.GmsTaskBoundService;
import com.google.android.gms.semanticlocationhistory.deidentifieddata.uploads.BatchDeidentifiedDataUploadService;
import defpackage.asej;
import defpackage.asot;
import defpackage.byln;
import defpackage.czje;
import defpackage.czlk;
import defpackage.czxb;
import defpackage.dahq;
import defpackage.danl;
import defpackage.danm;
import defpackage.daow;
import defpackage.eiho;
import defpackage.einp;
import defpackage.eiog;
import defpackage.eitl;
import defpackage.ejfg;
import defpackage.ejfh;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enre;
import defpackage.ensj;
import defpackage.enss;
import defpackage.erdc;
import defpackage.erdd;
import defpackage.fegx;
import defpackage.frvh;
import defpackage.frwe;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public final class BatchDeidentifiedDataUploadService extends GmsTaskBoundService {
    public static final String a = "com.google.android.gms.semanticlocationhistory.deidentifieddata.uploads.BatchDeidentifiedDataUploadService";
    private static final asot b = asot.c("LocationHistory", asej.SEMANTIC_LOCATION_HISTORY, "BatchAggUploads");
    private daow c;
    private danl d;
    private czje e;
    private czlk f;
    private dahq g;

    private final czje d() {
        if (this.e == null) {
            this.e = new czje();
        }
        return this.e;
    }

    private final dahq e() {
        if (this.g == null) {
            this.g = new dahq();
        }
        return this.g;
    }

    private final danl f() {
        if (this.d == null) {
            if (this.f == null) {
                this.f = new czlk(d());
            }
            this.d = new danl(this.f, d());
        }
        return this.d;
    }

    private final daow g() {
        if (this.c == null) {
            this.c = daow.b();
        }
        return this.c;
    }

    private final enss h() {
        return enps.f(e().g("BatchDeidentifiedDataUpload", fegx.h(System.currentTimeMillis())), new eiho() { // from class: danj
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                String str = BatchDeidentifiedDataUploadService.a;
                return 2;
            }
        }, enre.a);
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final enss im(byln bylnVar) {
        d().e("DeidentifiedUploadJobs");
        try {
            eitl c = g().c();
            if (c == null || c.C()) {
                d().k("DeidentifiedUploadStatus", 6);
            } else if (frvh.a.a().d()) {
                eiog eiogVar = new eiog();
                ejfg listIterator = c.z().listIterator();
                int i = 0;
                while (listIterator.hasNext()) {
                    Account account = (Account) listIterator.next();
                    ejfh it = c.a(account).iterator();
                    while (it.hasNext()) {
                        eiogVar.v(account, (czxb) it.next());
                        i++;
                        if (i == frvh.a.a().a()) {
                            if (!f().a(eitl.e(eiogVar))) {
                                return frwe.d() ? h() : ensj.i(2);
                            }
                            d().f("DeidentifiedUploadsCount", ((einp) eiogVar).b);
                            g().g(eitl.e(eiogVar));
                            eiogVar.s();
                            i = 0;
                        }
                    }
                }
                if (!f().a(eitl.e(eiogVar))) {
                    return frwe.d() ? h() : ensj.i(2);
                }
                d().f("DeidentifiedUploadsCount", ((einp) eiogVar).b);
                g().g(eitl.e(eiogVar));
            } else {
                if (!f().a(c)) {
                    return frwe.d() ? h() : ensj.i(2);
                }
                d().f("DeidentifiedUploadsCount", c.size);
                g().g(c);
            }
            return frwe.d() ? enps.f(e().e("BatchDeidentifiedDataUpload", false), new eiho() { // from class: dank
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    String str = BatchDeidentifiedDataUploadService.a;
                    return 0;
                }
            }, enre.a) : ensj.i(0);
        } catch (LevelDbException e) {
            d().k("DeidentifiedUploadStatus", 4);
            ((ejhf) ((ejhf) ((ejhf) b.j()).s(e)).ah((char) 10319)).B("Error retrieve data to upload from cache: %s", new erdd(erdc.NO_USER_DATA, e.getMessage()));
            return frwe.d() ? h() : ensj.i(2);
        }
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskBoundService, com.google.android.chimera.BoundService, defpackage.qan
    public final void onDestroy() {
        danm danmVar;
        danl danlVar = this.d;
        if (danlVar != null && (danmVar = danlVar.a) != null) {
            danmVar.a();
        }
        super.onDestroy();
    }
}

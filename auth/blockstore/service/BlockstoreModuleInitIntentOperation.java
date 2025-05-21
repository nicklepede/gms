package com.google.android.gms.auth.blockstore.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.blockstore.logging.service.BufferedLogUploadTaskService;
import com.google.android.gms.auth.blockstore.service.cloudsync.CloudSyncBackupTaskService;
import com.google.android.gms.auth.blockstore.service.metrics.LocalStorageUsageLoggingTaskService;
import defpackage.aabn;
import defpackage.aacc;
import defpackage.aaev;
import defpackage.aaew;
import defpackage.aakp;
import defpackage.anya;
import defpackage.asop;
import defpackage.asot;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enps;
import defpackage.enqc;
import defpackage.enre;
import defpackage.enrv;
import defpackage.ensi;
import defpackage.ensj;
import defpackage.fkvs;
import defpackage.fkwa;
import defpackage.fkwd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BlockstoreModuleInitIntentOperation extends anya {
    public static final asot a = aacc.b("BlockstoreModuleInitIntentOperation");
    private final enrv b = new aaev();
    private final enrv c = new aaew();

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        asot asotVar = a;
        ((ejhf) asotVar.h()).B("Container update. Module updated: %b", Boolean.valueOf(z));
        if (!asop.c(fkvs.d())) {
            ((ejhf) asotVar.h()).x("Feature flags are not turned on, skipping operations.");
            return;
        }
        asot asotVar2 = BufferedLogUploadTaskService.a;
        final Bundle bundle = new Bundle();
        ensi h = ensi.h(new aabn().c());
        enqc enqcVar = new enqc() { // from class: aacw
            @Override // defpackage.enqc
            public final enss a(Object obj) {
                aalq aalqVar = (aalq) obj;
                asot asotVar3 = BufferedLogUploadTaskService.a;
                if (aalqVar == aalq.TASK_SCHEDULED) {
                    Bundle bundle2 = bundle;
                    Context context = this;
                    ((ejhf) BufferedLogUploadTaskService.a.h()).x("There is already a buffer flush task scheduled, rescheduling the task.");
                    BufferedLogUploadTaskService.e(context, bundle2);
                }
                return ensm.a;
            }
        };
        enre enreVar = enre.a;
        ensj.t(ensi.h(enps.g(h, enqcVar, enreVar)), this.b, enreVar);
        if (fkwa.e()) {
            CloudSyncBackupTaskService.d(this);
        }
        if (fkwa.g()) {
            ensj.t(ensi.h(aakp.n().c.b(new eiho() { // from class: aakg
                @Override // defpackage.eiho
                public final Object apply(Object obj) {
                    aana aanaVar = (aana) obj;
                    asot asotVar3 = aakp.a;
                    fecj fecjVar = (fecj) aanaVar.iB(5, null);
                    fecjVar.X(aanaVar);
                    aamv aamvVar = aanaVar.j;
                    if (aamvVar == null) {
                        aamvVar = aamv.a;
                    }
                    fecj fecjVar2 = (fecj) aamvVar.iB(5, null);
                    fecjVar2.X(aamvVar);
                    aamv aamvVar2 = aanaVar.j;
                    if (aamvVar2 == null) {
                        aamvVar2 = aamv.a;
                    }
                    aaly aalyVar = aamvVar2.e;
                    if (aalyVar == null) {
                        aalyVar = aaly.a;
                    }
                    fecj fecjVar3 = (fecj) aalyVar.iB(5, null);
                    fecjVar3.X(aalyVar);
                    if (!fecjVar3.b.L()) {
                        fecjVar3.U();
                    }
                    aaly aalyVar2 = (aaly) fecjVar3.b;
                    aalyVar2.b &= -2;
                    aalyVar2.c = 0L;
                    aaly aalyVar3 = (aaly) fecjVar3.Q();
                    if (!fecjVar2.b.L()) {
                        fecjVar2.U();
                    }
                    aamv aamvVar3 = (aamv) fecjVar2.b;
                    aalyVar3.getClass();
                    aamvVar3.e = aalyVar3;
                    aamvVar3.b |= 4;
                    aamv aamvVar4 = (aamv) fecjVar2.Q();
                    if (!fecjVar.b.L()) {
                        fecjVar.U();
                    }
                    aana aanaVar2 = (aana) fecjVar.b;
                    aamvVar4.getClass();
                    aanaVar2.j = aamvVar4;
                    aanaVar2.b |= 32;
                    return (aana) fecjVar.Q();
                }
            }, enreVar)), this.c, enreVar);
        }
        if (fkwd.i()) {
            LocalStorageUsageLoggingTaskService.d(this);
        }
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
    }
}

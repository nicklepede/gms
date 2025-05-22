package com.google.android.gms.auth.blockstore.service;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.blockstore.logging.service.BufferedLogUploadTaskService;
import com.google.android.gms.auth.blockstore.service.cloudsync.CloudSyncBackupTaskService;
import com.google.android.gms.auth.blockstore.service.metrics.LocalStorageUsageLoggingTaskService;
import defpackage.acbn;
import defpackage.accc;
import defpackage.acev;
import defpackage.acew;
import defpackage.ackp;
import defpackage.apzs;
import defpackage.ausj;
import defpackage.ausn;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqdl;
import defpackage.eqdv;
import defpackage.eqex;
import defpackage.eqfo;
import defpackage.eqgb;
import defpackage.eqgc;
import defpackage.fnmw;
import defpackage.fnne;
import defpackage.fnnh;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BlockstoreModuleInitIntentOperation extends apzs {
    public static final ausn a = accc.b("BlockstoreModuleInitIntentOperation");
    private final eqfo b = new acev();
    private final eqfo c = new acew();

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        ausn ausnVar = a;
        ((eluo) ausnVar.h()).B("Container update. Module updated: %b", Boolean.valueOf(z));
        if (!ausj.c(fnmw.d())) {
            ((eluo) ausnVar.h()).x("Feature flags are not turned on, skipping operations.");
            return;
        }
        ausn ausnVar2 = BufferedLogUploadTaskService.a;
        final Bundle bundle = new Bundle();
        eqgb h = eqgb.h(new acbn().c());
        eqdv eqdvVar = new eqdv() { // from class: accw
            @Override // defpackage.eqdv
            public final eqgl a(Object obj) {
                aclq aclqVar = (aclq) obj;
                ausn ausnVar3 = BufferedLogUploadTaskService.a;
                if (aclqVar == aclq.TASK_SCHEDULED) {
                    Bundle bundle2 = bundle;
                    Context context = this;
                    ((eluo) BufferedLogUploadTaskService.a.h()).x("There is already a buffer flush task scheduled, rescheduling the task.");
                    BufferedLogUploadTaskService.e(context, bundle2);
                }
                return eqgf.a;
            }
        };
        eqex eqexVar = eqex.a;
        eqgc.t(eqgb.h(eqdl.g(h, eqdvVar, eqexVar)), this.b, eqexVar);
        if (fnne.e()) {
            CloudSyncBackupTaskService.d(this);
        }
        if (fnne.g()) {
            eqgc.t(eqgb.h(ackp.n().c.b(new ekut() { // from class: ackg
                @Override // defpackage.ekut
                public final Object apply(Object obj) {
                    acna acnaVar = (acna) obj;
                    ausn ausnVar3 = ackp.a;
                    fgrc fgrcVar = (fgrc) acnaVar.iQ(5, null);
                    fgrcVar.X(acnaVar);
                    acmv acmvVar = acnaVar.j;
                    if (acmvVar == null) {
                        acmvVar = acmv.a;
                    }
                    fgrc fgrcVar2 = (fgrc) acmvVar.iQ(5, null);
                    fgrcVar2.X(acmvVar);
                    acmv acmvVar2 = acnaVar.j;
                    if (acmvVar2 == null) {
                        acmvVar2 = acmv.a;
                    }
                    acly aclyVar = acmvVar2.e;
                    if (aclyVar == null) {
                        aclyVar = acly.a;
                    }
                    fgrc fgrcVar3 = (fgrc) aclyVar.iQ(5, null);
                    fgrcVar3.X(aclyVar);
                    if (!fgrcVar3.b.L()) {
                        fgrcVar3.U();
                    }
                    acly aclyVar2 = (acly) fgrcVar3.b;
                    aclyVar2.b &= -2;
                    aclyVar2.c = 0L;
                    acly aclyVar3 = (acly) fgrcVar3.Q();
                    if (!fgrcVar2.b.L()) {
                        fgrcVar2.U();
                    }
                    acmv acmvVar3 = (acmv) fgrcVar2.b;
                    aclyVar3.getClass();
                    acmvVar3.e = aclyVar3;
                    acmvVar3.b |= 4;
                    acmv acmvVar4 = (acmv) fgrcVar2.Q();
                    if (!fgrcVar.b.L()) {
                        fgrcVar.U();
                    }
                    acna acnaVar2 = (acna) fgrcVar.b;
                    acmvVar4.getClass();
                    acnaVar2.j = acmvVar4;
                    acnaVar2.b |= 32;
                    return (acna) fgrcVar.Q();
                }
            }, eqexVar)), this.c, eqexVar);
        }
        if (fnnh.i()) {
            LocalStorageUsageLoggingTaskService.d(this);
        }
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
    }
}

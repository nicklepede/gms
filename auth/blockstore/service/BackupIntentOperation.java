package com.google.android.gms.auth.blockstore.service;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.blockstore.service.cloudsync.CloudSyncBackupTaskService;
import defpackage.accc;
import defpackage.ackp;
import defpackage.aclv;
import defpackage.ausj;
import defpackage.ausn;
import defpackage.casd;
import defpackage.catb;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.eqdl;
import defpackage.eqex;
import defpackage.fnmw;
import defpackage.fnne;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class BackupIntentOperation extends IntentOperation {
    private static final ausn a = accc.b("BackupIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!ausj.c(fnmw.d())) {
            ((eluo) a.h()).x("Feature flags are not turned on, skipping operations.");
            return;
        }
        if (!"com.google.android.gms.backup.ACTION_TRANSPORT_FULL_BACKUP".equals(intent.getAction())) {
            ((eluo) a.h()).x("Not an intent event that Blockstore needs to handle. Skipping.");
            return;
        }
        if (fnne.e()) {
            fnne fnneVar = fnne.a;
            if (fnneVar.lK().i()) {
                try {
                    if (System.currentTimeMillis() - ((aclv) ((eqcy) eqdl.f(ackp.n().c.a(), new ekut() { // from class: acjq
                        @Override // defpackage.ekut
                        public final Object apply(Object obj) {
                            acna acnaVar = (acna) obj;
                            ausn ausnVar = ackp.a;
                            if (acnaVar == null) {
                                ((eluo) ackp.a.i()).x("No block data on device!");
                                return aclv.a;
                            }
                            acmv acmvVar = acnaVar.j;
                            if (acmvVar == null) {
                                acmvVar = acmv.a;
                            }
                            aclv aclvVar = acmvVar.d;
                            return aclvVar == null ? aclv.a : aclvVar;
                        }
                    }, eqex.a)).u()).e < fnneVar.lK().a()) {
                        return;
                    }
                    ausn ausnVar = CloudSyncBackupTaskService.a;
                    UUID randomUUID = UUID.randomUUID();
                    Bundle bundle = new Bundle();
                    bundle.putInt("EXTRA_KEY_BACKUP_TRIGGER", 2);
                    bundle.putString("CLOUDSYNC_BACKUP_SESSION_ID", randomUUID.toString());
                    catb catbVar = new catb();
                    catbVar.e(0L, 1L);
                    catbVar.u = bundle;
                    catbVar.t("CLOUD_BACKUP_ONEOFF");
                    catbVar.w(CloudSyncBackupTaskService.class.getName());
                    catbVar.x(0, 0);
                    catbVar.g(0);
                    casd.a(this).f(catbVar.b());
                } catch (InterruptedException | ExecutionException e) {
                    ((eluo) ((eluo) a.i()).s(e)).x("data store operation failed.");
                }
            }
        }
    }
}

package com.google.android.gms.auth.blockstore.service;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.auth.blockstore.service.cloudsync.CloudSyncBackupTaskService;
import defpackage.aacc;
import defpackage.aakp;
import defpackage.aalv;
import defpackage.asop;
import defpackage.asot;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.enpf;
import defpackage.enps;
import defpackage.enre;
import defpackage.fkvs;
import defpackage.fkwa;
import java.util.UUID;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class BackupIntentOperation extends IntentOperation {
    private static final asot a = aacc.b("BackupIntentOperation");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!asop.c(fkvs.d())) {
            ((ejhf) a.h()).x("Feature flags are not turned on, skipping operations.");
            return;
        }
        if (!"com.google.android.gms.backup.ACTION_TRANSPORT_FULL_BACKUP".equals(intent.getAction())) {
            ((ejhf) a.h()).x("Not an intent event that Blockstore needs to handle. Skipping.");
            return;
        }
        if (fkwa.e()) {
            fkwa fkwaVar = fkwa.a;
            if (fkwaVar.a().i()) {
                try {
                    if (System.currentTimeMillis() - ((aalv) ((enpf) enps.f(aakp.n().c.a(), new eiho() { // from class: aajq
                        @Override // defpackage.eiho
                        public final Object apply(Object obj) {
                            aana aanaVar = (aana) obj;
                            asot asotVar = aakp.a;
                            if (aanaVar == null) {
                                ((ejhf) aakp.a.i()).x("No block data on device!");
                                return aalv.a;
                            }
                            aamv aamvVar = aanaVar.j;
                            if (aamvVar == null) {
                                aamvVar = aamv.a;
                            }
                            aalv aalvVar = aamvVar.d;
                            return aalvVar == null ? aalv.a : aalvVar;
                        }
                    }, enre.a)).u()).e < fkwaVar.a().a()) {
                        return;
                    }
                    asot asotVar = CloudSyncBackupTaskService.a;
                    UUID randomUUID = UUID.randomUUID();
                    Bundle bundle = new Bundle();
                    bundle.putInt("EXTRA_KEY_BACKUP_TRIGGER", 2);
                    bundle.putString("CLOUDSYNC_BACKUP_SESSION_ID", randomUUID.toString());
                    bykj bykjVar = new bykj();
                    bykjVar.e(0L, 1L);
                    bykjVar.u = bundle;
                    bykjVar.t("CLOUD_BACKUP_ONEOFF");
                    bykjVar.w(CloudSyncBackupTaskService.class.getName());
                    bykjVar.x(0, 0);
                    bykjVar.g(0);
                    byjl.a(this).f(bykjVar.b());
                } catch (InterruptedException | ExecutionException e) {
                    ((ejhf) ((ejhf) a.i()).s(e)).x("data store operation failed.");
                }
            }
        }
    }
}

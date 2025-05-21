package com.google.android.gms.backup.g1.module;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.g1.notifications.SettingsCollectionSchedulerChimeraService;
import defpackage.ahwd;
import defpackage.asqg;
import defpackage.byjl;
import defpackage.flmm;
import defpackage.flon;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PhenotypeConfigCommittedIntentOperation extends IntentOperation {
    private static final ahwd a = new ahwd("PhenotypeConfigIO");
    private static final String b = asqg.f("com.google.android.gms.backup");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!flmm.a.a().aA()) {
            a.j("Flag not enabled, returning early", new Object[0]);
            return;
        }
        if (intent == null || !("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || b.equals(intent.getAction()))) {
            a.j("Intent's action does not match", new Object[0]);
        } else if ("com.google.android.gms.backup".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")) && flon.f()) {
            SettingsCollectionSchedulerChimeraService.d(byjl.a(this));
        }
    }
}

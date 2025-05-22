package com.google.android.gms.backup.g1.module;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.g1.notifications.SettingsCollectionSchedulerChimeraService;
import defpackage.ajwt;
import defpackage.auua;
import defpackage.casd;
import defpackage.fodw;
import defpackage.fofx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class PhenotypeConfigCommittedIntentOperation extends IntentOperation {
    private static final ajwt a = new ajwt("PhenotypeConfigIO");
    private static final String b = auua.f("com.google.android.gms.backup");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!fodw.a.lK().aB()) {
            a.j("Flag not enabled, returning early", new Object[0]);
            return;
        }
        if (intent == null || !("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) || b.equals(intent.getAction()))) {
            a.j("Intent's action does not match", new Object[0]);
        } else if ("com.google.android.gms.backup".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME")) && fofx.f()) {
            SettingsCollectionSchedulerChimeraService.d(casd.a(this));
        }
    }
}

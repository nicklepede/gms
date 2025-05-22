package com.google.android.gms.location.persistent;

import android.content.Intent;
import android.location.LocationManager;
import com.google.android.chimera.IntentOperation;
import defpackage.auub;
import defpackage.cbtn;
import defpackage.ccyr;
import defpackage.eauk;
import defpackage.ebqg;
import defpackage.ecxo;
import defpackage.ecyu;
import defpackage.edbk;
import defpackage.eddm;
import defpackage.fsiu;
import defpackage.fsmg;
import defpackage.fspp;
import defpackage.irc;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class LocationPersistentRegistrationIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String a;
        if ("com.google.android.gms.location.persistent.REGISTER".equals(intent.getAction())) {
            if (auub.c() && eauk.e(this)) {
                LocationPersistentChimeraService.a("BlueskyManager", eauk.c(this));
            }
            fsmg.a.lK().c();
            if (fspp.h()) {
                LocationPersistentChimeraService.a("WCollector", new ccyr());
            }
            fsiu fsiuVar = fsiu.a;
            if (fsiuVar.lK().z()) {
                LocationPersistentChimeraService.a("LocationJumpBugreportGenerator", new ebqg());
            }
            if (ecyu.e()) {
                LocationPersistentChimeraService.a("EQMon", new ecxo());
            }
            if (eddm.d()) {
                LocationPersistentChimeraService.a("EAlert", new edbk());
            }
            if (!fsiuVar.lK().C()) {
                if (!fsiu.s() || !fsiu.s() || (a = irc.a((LocationManager) getSystemService("location"))) == null) {
                    return;
                }
                if (!a.contains("MPSS.AT.4") && !a.contains("MPSS.HA") && !a.contains("MPSS.HE") && !a.contains("MPSS.CE")) {
                    return;
                }
            }
            LocationPersistentChimeraService.a("QcomSuplCertBugfix", new cbtn());
        }
    }
}

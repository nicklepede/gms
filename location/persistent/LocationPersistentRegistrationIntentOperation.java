package com.google.android.gms.location.persistent;

import android.content.Intent;
import android.location.LocationManager;
import com.google.android.chimera.IntentOperation;
import defpackage.asqh;
import defpackage.bzkw;
import defpackage.caqb;
import defpackage.dyif;
import defpackage.dzdu;
import defpackage.ealc;
import defpackage.eami;
import defpackage.eaoy;
import defpackage.eara;
import defpackage.fppc;
import defpackage.fpso;
import defpackage.fpvx;
import defpackage.ipm;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class LocationPersistentRegistrationIntentOperation extends IntentOperation {
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String a;
        if ("com.google.android.gms.location.persistent.REGISTER".equals(intent.getAction())) {
            if (asqh.c() && dyif.e(this)) {
                LocationPersistentChimeraService.a("BlueskyManager", dyif.c(this));
            }
            fpso.a.a().c();
            if (fpvx.h()) {
                LocationPersistentChimeraService.a("WCollector", new caqb());
            }
            if (fppc.a.a().z()) {
                LocationPersistentChimeraService.a("LocationJumpBugreportGenerator", new dzdu());
            }
            if (eami.e()) {
                LocationPersistentChimeraService.a("EQMon", new ealc());
            }
            if (eara.d()) {
                LocationPersistentChimeraService.a("EAlert", new eaoy());
            }
            if (!fppc.a.a().C()) {
                if (!fppc.s() || !fppc.s() || (a = ipm.a((LocationManager) getSystemService("location"))) == null) {
                    return;
                }
                if (!a.contains("MPSS.AT.4") && !a.contains("MPSS.HA") && !a.contains("MPSS.HE") && !a.contains("MPSS.CE")) {
                    return;
                }
            }
            LocationPersistentChimeraService.a("QcomSuplCertBugfix", new bzkw());
        }
    }
}

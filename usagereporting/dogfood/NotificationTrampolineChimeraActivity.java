package com.google.android.gms.usagereporting.dogfood;

import android.content.pm.CrossProfileApps;
import android.os.Bundle;
import android.os.UserHandle;
import android.os.UserManager;
import defpackage.agk$$ExternalSyntheticApiModelOutline0;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.asqh;
import defpackage.dhrq;
import defpackage.ejhf;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class NotificationTrampolineChimeraActivity extends qfp {
    private static final asot l = asot.b("NotificationTrampoline", asej.USAGE_REPORTING);
    CrossProfileApps j;
    UserManager k;

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        boolean isManagedProfile;
        super.onCreate(bundle);
        if (asqh.g() && this.j == null) {
            this.j = agk$$ExternalSyntheticApiModelOutline0.m37m(getSystemService(agk$$ExternalSyntheticApiModelOutline0.m()));
        }
        if (asqh.g() && this.k == null) {
            this.k = (UserManager) getSystemService("user");
        }
        if (!asqh.g()) {
            ((ejhf) l.h()).x("Unable to open activity to the right profile.");
            startActivity(asng.i("com.google.android.gms.usagereporting.settings.UsageReportingActivity"));
            return;
        }
        isManagedProfile = this.k.isManagedProfile();
        if (!isManagedProfile) {
            startActivity(asng.i("com.google.android.gms.usagereporting.settings.UsageReportingActivity"));
            return;
        }
        asot asotVar = dhrq.a;
        for (UserHandle userHandle : this.k.getUserProfiles()) {
            if (userHandle.isOwner()) {
                ((ejhf) l.h()).x("Starting activity as owner");
                this.j.startActivity(asng.i("com.google.android.gms.usagereporting.settings.UsageReportingActivity"), userHandle, null);
            }
        }
    }
}

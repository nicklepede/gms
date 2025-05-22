package com.google.android.gms.usagereporting.dogfood;

import android.content.pm.CrossProfileApps;
import android.os.Bundle;
import android.os.UserHandle;
import android.os.UserManager;
import defpackage.agp$$ExternalSyntheticApiModelOutline0;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auub;
import defpackage.dkcw;
import defpackage.eluo;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class NotificationTrampolineChimeraActivity extends ryt {
    private static final ausn l = ausn.b("NotificationTrampoline", auid.USAGE_REPORTING);
    CrossProfileApps j;
    UserManager k;

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        boolean isManagedProfile;
        super.onCreate(bundle);
        if (auub.g() && this.j == null) {
            this.j = agp$$ExternalSyntheticApiModelOutline0.m36m(getSystemService(agp$$ExternalSyntheticApiModelOutline0.m()));
        }
        if (auub.g() && this.k == null) {
            this.k = (UserManager) getSystemService("user");
        }
        if (!auub.g()) {
            ((eluo) l.h()).x("Unable to open activity to the right profile.");
            startActivity(aura.i("com.google.android.gms.usagereporting.settings.UsageReportingActivity"));
            return;
        }
        isManagedProfile = this.k.isManagedProfile();
        if (!isManagedProfile) {
            startActivity(aura.i("com.google.android.gms.usagereporting.settings.UsageReportingActivity"));
            return;
        }
        ausn ausnVar = dkcw.a;
        for (UserHandle userHandle : this.k.getUserProfiles()) {
            if (userHandle.isOwner()) {
                ((eluo) l.h()).x("Starting activity as owner");
                this.j.startActivity(aura.i("com.google.android.gms.usagereporting.settings.UsageReportingActivity"), userHandle, null);
            }
        }
    }
}

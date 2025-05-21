package com.google.android.gms.backup.settings.navroot;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.navroot.BackupSettingsNavRootChimeraActivity;
import defpackage.ajrn;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.kdp;
import defpackage.kdr;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class BackupSettingsNavRootChimeraActivity extends ajrn {
    public final fuuw j = new fuvg(new fvaf() { // from class: ajre
        @Override // defpackage.fvaf
        public final Object a() {
            dg g = BackupSettingsNavRootChimeraActivity.this.getSupportFragmentManager().g(R.id.nav_host_fragment);
            fvbo.d(g, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            return (NavHostFragment) g;
        }
    });
    private final fuuw l = new fuvg(new fvaf() { // from class: ajrf
        @Override // defpackage.fvaf
        public final Object a() {
            return ((NavHostFragment) BackupSettingsNavRootChimeraActivity.this.j.a()).y();
        }
    });

    private final kdr c() {
        return (kdr) this.l.a();
    }

    @Override // defpackage.qgg, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        if (c().r()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.ajrn, defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.BackupSettingsNavGraphTransitionsTheme);
        super.onCreate(bundle);
        setContentView(R.layout.backup_settings_navroot_activity);
        c().i(new kdp() { // from class: ajrd
            @Override // defpackage.kdp
            public final void a(kes kesVar, Bundle bundle2) {
                fvbo.f(kesVar, "destination");
                BackupSettingsNavRootChimeraActivity.this.setTitle(kesVar.f);
            }
        });
    }

    @Override // defpackage.qgg, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onNavigateUp() {
        if (c().r()) {
            return true;
        }
        super.onNavigateUp();
        return true;
    }
}

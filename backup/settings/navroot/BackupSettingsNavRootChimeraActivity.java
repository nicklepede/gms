package com.google.android.gms.backup.settings.navroot;

import android.os.Bundle;
import androidx.navigation.fragment.NavHostFragment;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.navroot.BackupSettingsNavRootChimeraActivity;
import defpackage.alsg;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.lvz;
import defpackage.lwb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class BackupSettingsNavRootChimeraActivity extends alsg {
    public final fxqu j = new fxre(new fxwd() { // from class: alrx
        @Override // defpackage.fxwd
        public final Object a() {
            dg g = BackupSettingsNavRootChimeraActivity.this.getSupportFragmentManager().g(R.id.nav_host_fragment);
            fxxm.d(g, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
            return (NavHostFragment) g;
        }
    });
    private final fxqu l = new fxre(new fxwd() { // from class: alry
        @Override // defpackage.fxwd
        public final Object a() {
            return ((NavHostFragment) BackupSettingsNavRootChimeraActivity.this.j.a()).y();
        }
    });

    private final lwb f() {
        return (lwb) this.l.a();
    }

    @Override // defpackage.rzk, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        if (f().r()) {
            return;
        }
        super.onBackPressed();
    }

    @Override // defpackage.alsg, defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.BackupSettingsNavGraphTransitionsTheme);
        super.onCreate(bundle);
        setContentView(R.layout.backup_settings_navroot_activity);
        f().i(new lvz() { // from class: alrw
            @Override // defpackage.lvz
            public final void a(lxc lxcVar, Bundle bundle2) {
                fxxm.f(lxcVar, "destination");
                BackupSettingsNavRootChimeraActivity.this.setTitle(lxcVar.f);
            }
        });
    }

    @Override // defpackage.rzk, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onNavigateUp() {
        if (f().r()) {
            return true;
        }
        super.onNavigateUp();
        return true;
    }
}

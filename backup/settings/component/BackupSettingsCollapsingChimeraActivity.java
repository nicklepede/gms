package com.google.android.gms.backup.settings.component;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.ajwt;
import defpackage.alll;
import defpackage.almc;
import defpackage.almd;
import defpackage.alzt;
import defpackage.auad;
import defpackage.bp;
import defpackage.dymf;
import defpackage.edxt;
import defpackage.fhql;
import defpackage.fofn;
import defpackage.mej;
import defpackage.mem;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupSettingsCollapsingChimeraActivity extends rzk implements mej, almd, almc {
    private static final auad j = ajwt.a("BackupSettingsCollapsingChimeraActivity");
    private boolean k;

    @Override // defpackage.mej
    public final void a(mem memVar, Preference preference) {
        String str = preference.u;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName(this, "com.google.android.gms.backup.component.BackupSettingsCollapsingActivity");
        if (str != null) {
            intent.putExtra("show_fragment", str);
            intent.putExtra("backup_services_available", false);
        }
        startActivity(intent);
    }

    @Override // defpackage.almc
    public final void f() {
        AppBarLayout gS = gS();
        if (gS != null) {
            gS.l(false);
        }
    }

    @Override // defpackage.almd
    public final void k(boolean z, boolean z2) {
        j.j("Showing opt-in with isMissingDollyConsent: %s isFromTurnOffToggle %s ", Boolean.valueOf(z), Boolean.valueOf(z2));
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Intent intent = getIntent();
        if (intent != null && z2) {
            dymf.d(intent, fhql.BACKUP_SETTINGS_BACKUP_TURN_OFF);
        }
        if (this.k) {
            return;
        }
        startActivityForResult(alll.a(getPackageManager(), z, false, intent), 10005);
        this.k = true;
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        auad auadVar = j;
        auadVar.j("onActivityResult requestCode=%d resultCode=%d launchedFromPromotionalNotification=%b", Integer.valueOf(i), Integer.valueOf(i2), false);
        if (i == 10005) {
            this.k = false;
            if (i2 == 0) {
                onBackPressed();
                return;
            }
            ActionBar actionBar = getActionBar();
            if (actionBar != null) {
                actionBar.show();
            }
            getSupportFragmentManager();
            alzt e = alll.e(getIntent(), intent);
            auadVar.j("Displaying fragment: ".concat(String.valueOf(e.getClass().getSimpleName())), new Object[0]);
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(R.id.content_frame, e, e.getClass().getName());
            bpVar.a();
        }
    }

    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        int i = edxt.a;
        super.onCreate(bundle);
        if (fofn.c()) {
            j.j("Launching BackupSettingsNavRootActivity", new Object[0]);
            startActivity(alll.b());
            finish();
        } else {
            j.j("Launching BackupSettingsActivity", new Object[0]);
            Intent intent = new Intent(getIntent());
            intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.BackupSettingsActivity");
            startActivity(intent);
            finish();
        }
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        alll.d(this.k, bundle);
        super.onSaveInstanceState(bundle);
    }
}

package com.google.android.gms.backup.settings.component;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.ahwd;
import defpackage.ajkt;
import defpackage.ajlk;
import defpackage.ajll;
import defpackage.ajyv;
import defpackage.arxo;
import defpackage.bp;
import defpackage.dwae;
import defpackage.eble;
import defpackage.ffbn;
import defpackage.flod;
import defpackage.kly;
import defpackage.kmb;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupSettingsCollapsingChimeraActivity extends qgg implements kly, ajll, ajlk {
    private static final arxo j = ahwd.a("BackupSettingsCollapsingChimeraActivity");
    private boolean k;

    @Override // defpackage.kly
    public final void a(kmb kmbVar, Preference preference) {
        String str = preference.u;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName(this, "com.google.android.gms.backup.component.BackupSettingsCollapsingActivity");
        if (str != null) {
            intent.putExtra("show_fragment", str);
            intent.putExtra("backup_services_available", false);
        }
        startActivity(intent);
    }

    @Override // defpackage.ajlk
    public final void c() {
        AppBarLayout gC = gC();
        if (gC != null) {
            gC.l(false);
        }
    }

    @Override // defpackage.ajll
    public final void k(boolean z, boolean z2) {
        j.j("Showing opt-in with isMissingDollyConsent: %s isFromTurnOffToggle %s ", Boolean.valueOf(z), Boolean.valueOf(z2));
        ActionBar actionBar = getActionBar();
        if (actionBar != null) {
            actionBar.hide();
        }
        Intent intent = getIntent();
        if (intent != null && z2) {
            dwae.d(intent, ffbn.BACKUP_SETTINGS_BACKUP_TURN_OFF);
        }
        if (this.k) {
            return;
        }
        startActivityForResult(ajkt.a(getPackageManager(), z, false, intent), 10005);
        this.k = true;
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        arxo arxoVar = j;
        arxoVar.j("onActivityResult requestCode=%d resultCode=%d launchedFromPromotionalNotification=%b", Integer.valueOf(i), Integer.valueOf(i2), false);
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
            ajyv e = ajkt.e(getIntent(), intent);
            arxoVar.j("Displaying fragment: ".concat(String.valueOf(e.getClass().getSimpleName())), new Object[0]);
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.z(R.id.content_frame, e, e.getClass().getName());
            bpVar.a();
        }
    }

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        int i = eble.a;
        super.onCreate(bundle);
        if (flod.c()) {
            j.j("Launching BackupSettingsNavRootActivity", new Object[0]);
            startActivity(ajkt.b());
            finish();
        } else {
            j.j("Launching BackupSettingsActivity", new Object[0]);
            Intent intent = new Intent(getIntent());
            intent.setClassName("com.google.android.gms", "com.google.android.gms.backup.component.BackupSettingsActivity");
            startActivity(intent);
            finish();
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        ajkt.d(this.k, bundle);
        super.onSaveInstanceState(bundle);
    }
}

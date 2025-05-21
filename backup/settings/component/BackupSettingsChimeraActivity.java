package com.google.android.gms.backup.settings.component;

import android.accounts.Account;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.preference.Preference;
import com.google.android.gms.R;
import com.google.android.gms.backup.settings.component.BackupSettingsChimeraActivity;
import com.google.android.gms.googlehelp.GoogleHelp;
import defpackage.ahpv;
import defpackage.ahrf;
import defpackage.ahwd;
import defpackage.ajkt;
import defpackage.ajle;
import defpackage.ajll;
import defpackage.ajrc;
import defpackage.ajyv;
import defpackage.arxo;
import defpackage.bipc;
import defpackage.bp;
import defpackage.bqna;
import defpackage.dwae;
import defpackage.ew;
import defpackage.ffbn;
import defpackage.flmm;
import defpackage.flod;
import defpackage.flpt;
import defpackage.flpw;
import defpackage.ig;
import defpackage.kly;
import defpackage.kmb;
import defpackage.qet;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class BackupSettingsChimeraActivity extends qet implements kly, ajll {
    private static final arxo m = ahwd.a("BackupSettingsChimeraActivity");
    public String j;
    public String k;
    public bipc l;
    private boolean n;
    private ew o;
    private boolean p;
    private boolean q;
    private ajrc r;

    private final void l(Intent intent) {
        ajyv e = ajkt.e(getIntent(), intent);
        String L = e.L();
        if (L == null) {
            L = "android_backup";
        }
        this.j = L;
        String K = e.K();
        if (K == null) {
            K = "https://support.google.com/mobile/?p=settings_backup";
        }
        this.k = K;
        m.j("Displaying fragment: ".concat(String.valueOf(e.getClass().getSimpleName())), new Object[0]);
        bp bpVar = new bp(this.o);
        bpVar.z(R.id.main_content, e, e.getClass().getName());
        bpVar.a();
    }

    private final void m(MenuItem menuItem, int i, MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        menuItem.setOnMenuItemClickListener(onMenuItemClickListener);
        menuItem.setIcon(i);
        if (flpw.a.a().c()) {
            menuItem.getIcon().setColorFilter(getColor(R.color.settings_action_bar_icon_color), PorterDuff.Mode.SRC_IN);
        }
        menuItem.setShowAsAction(1);
        menuItem.setVisible(true);
    }

    private static final boolean n(Bundle bundle) {
        return flmm.H() && bundle == null;
    }

    @Override // defpackage.kly
    public final void a(kmb kmbVar, Preference preference) {
        String str = preference.u;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName(this, "com.google.android.gms.backup.component.BackupSettingsActivity");
        if (str != null) {
            intent.putExtra("show_fragment", str);
            intent.putExtra("backup_services_available", this.n);
        }
        startActivity(intent);
    }

    @Override // defpackage.ajll
    public final void k(boolean z, boolean z2) {
        m.j("Showing opt-in with isMissingDollyConsent: %s isFromTurnOffToggle %s ", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (this.q) {
            return;
        }
        Intent a = ajkt.a(getPackageManager(), z, this.n, getIntent());
        if (z2) {
            dwae.d(a, ffbn.BACKUP_SETTINGS_BACKUP_TURN_OFF);
        }
        startActivityForResult(a, 10005);
        this.q = true;
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m.j("onActivityResult requestCode=%d resultCode=%d launchedFromPromotionalNotification=%b", Integer.valueOf(i), Integer.valueOf(i2), Boolean.valueOf(this.p));
        if (i == 10005) {
            this.q = false;
            if (i2 != 0) {
                l(intent);
            } else if (this.p) {
                finishAndRemoveTask();
            } else {
                onBackPressed();
            }
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.BackupSettingsTheme_ActionBar);
        super.onCreate(bundle);
        if (flod.c()) {
            m.j("Launching BackupSettingsNavRootActivity", new Object[0]);
            startActivity(ajkt.b());
            finish();
            return;
        }
        setContentView(R.layout.backup_settings_activity_main);
        ig hy = hy();
        if (hy != null) {
            hy.o(true);
        }
        int i = ajkt.a;
        this.q = bundle != null ? bundle.getBoolean("opt_in_launched") : false;
        this.n = getIntent().getBooleanExtra("backup_services_available", true);
        this.p = ajle.a(getIntent(), "launchedFromPromotionalNotification");
        if (this.o == null) {
            this.o = getSupportFragmentManager();
        }
        this.l = new bipc(this);
        if (this.r == null && flmm.H()) {
            this.r = new ajrc();
        }
        if (ahrf.a()) {
            boolean k = new ahpv(this).k();
            Account[] p = bqna.b(this).p("com.google");
            if (!k || p.length == 0) {
                k(false, false);
                if (n(bundle)) {
                    ajrc.d(dwae.a(getIntent()), true, this.n);
                    return;
                }
                return;
            }
        }
        l(null);
        if (n(bundle)) {
            ajrc.d(dwae.a(getIntent()), false, this.n);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        if (flpt.a.a().d()) {
            m(menu.add(0, 102, 0, R.string.search_label), 2131233477, new MenuItem.OnMenuItemClickListener() { // from class: ajku
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    BackupSettingsChimeraActivity.this.startActivity(new Intent("com.android.settings.action.SETTINGS_SEARCH"));
                    return true;
                }
            });
        }
        m(menu.add(0, 101, 1, R.string.common_list_apps_menu_help_and_feedback), true != flpt.a.a().c() ? R.drawable.quantum_ic_help_vd_theme_24 : 2131233353, new MenuItem.OnMenuItemClickListener() { // from class: ajkv
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                BackupSettingsChimeraActivity backupSettingsChimeraActivity = BackupSettingsChimeraActivity.this;
                if (flpn.c()) {
                    backupSettingsChimeraActivity.j = "android_backup";
                    backupSettingsChimeraActivity.k = "https://support.google.com/mobile/?p=android_backup";
                }
                GoogleHelp googleHelp = new GoogleHelp(backupSettingsChimeraActivity.j);
                googleHelp.b(backupSettingsChimeraActivity.getContainerActivity());
                googleHelp.s = asin.a();
                googleHelp.q = Uri.parse(backupSettingsChimeraActivity.k);
                if (flpn.c()) {
                    googleHelp.R = new ajkw(asoe.l(backupSettingsChimeraActivity));
                    backupSettingsChimeraActivity.l.a(googleHelp.a());
                    return true;
                }
                if (asoe.l(backupSettingsChimeraActivity)) {
                    googleHelp.e(Collections.singletonMap("genie-eng:app_pkg_name", "com.google.android.settings.gphone"));
                } else {
                    googleHelp.e(Collections.singletonMap("genie-eng:app_pkg_name", "com.android.settings"));
                }
                backupSettingsChimeraActivity.startActivity(googleHelp.a());
                return true;
            }
        });
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        ajkt.d(this.q, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        hy().A(charSequence);
    }
}

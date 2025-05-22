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
import defpackage.ajql;
import defpackage.ajrv;
import defpackage.ajwt;
import defpackage.alll;
import defpackage.allw;
import defpackage.almd;
import defpackage.alrv;
import defpackage.alzt;
import defpackage.auad;
import defpackage.bktr;
import defpackage.bp;
import defpackage.bsup;
import defpackage.dymf;
import defpackage.ew;
import defpackage.fhql;
import defpackage.fodw;
import defpackage.fofn;
import defpackage.fohd;
import defpackage.fohg;
import defpackage.ig;
import defpackage.mej;
import defpackage.mem;
import defpackage.rxx;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class BackupSettingsChimeraActivity extends rxx implements mej, almd {
    private static final auad m = ajwt.a("BackupSettingsChimeraActivity");
    public String j;
    public String k;
    public bktr l;
    private boolean n;
    private ew o;
    private boolean p;
    private boolean q;
    private alrv r;

    private final void l(Intent intent) {
        alzt e = alll.e(getIntent(), intent);
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
        if (fohg.a.lK().c()) {
            menuItem.getIcon().setColorFilter(getColor(R.color.settings_action_bar_icon_color), PorterDuff.Mode.SRC_IN);
        }
        menuItem.setShowAsAction(1);
        menuItem.setVisible(true);
    }

    private static final boolean n(Bundle bundle) {
        return fodw.H() && bundle == null;
    }

    @Override // defpackage.mej
    public final void a(mem memVar, Preference preference) {
        String str = preference.u;
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClassName(this, "com.google.android.gms.backup.component.BackupSettingsActivity");
        if (str != null) {
            intent.putExtra("show_fragment", str);
            intent.putExtra("backup_services_available", this.n);
        }
        startActivity(intent);
    }

    @Override // defpackage.almd
    public final void k(boolean z, boolean z2) {
        m.j("Showing opt-in with isMissingDollyConsent: %s isFromTurnOffToggle %s ", Boolean.valueOf(z), Boolean.valueOf(z2));
        if (this.q) {
            return;
        }
        Intent a = alll.a(getPackageManager(), z, this.n, getIntent());
        if (z2) {
            dymf.d(a, fhql.BACKUP_SETTINGS_BACKUP_TURN_OFF);
        }
        startActivityForResult(a, 10005);
        this.q = true;
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
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

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.BackupSettingsTheme_ActionBar);
        super.onCreate(bundle);
        if (fofn.c()) {
            m.j("Launching BackupSettingsNavRootActivity", new Object[0]);
            startActivity(alll.b());
            finish();
            return;
        }
        setContentView(R.layout.backup_settings_activity_main);
        ig hO = hO();
        if (hO != null) {
            hO.o(true);
        }
        int i = alll.a;
        this.q = bundle != null ? bundle.getBoolean("opt_in_launched") : false;
        this.n = getIntent().getBooleanExtra("backup_services_available", true);
        this.p = allw.a(getIntent(), "launchedFromPromotionalNotification");
        if (this.o == null) {
            this.o = getSupportFragmentManager();
        }
        this.l = new bktr(this);
        if (this.r == null && fodw.H()) {
            this.r = new alrv();
        }
        if (ajrv.a()) {
            boolean j = new ajql(this).j();
            Account[] p = bsup.b(this).p("com.google");
            if (!j || p.length == 0) {
                k(false, false);
                if (n(bundle)) {
                    alrv.d(dymf.a(getIntent()), true, this.n);
                    return;
                }
                return;
            }
        }
        l(null);
        if (n(bundle)) {
            alrv.d(dymf.a(getIntent()), false, this.n);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        fohd fohdVar = fohd.a;
        if (fohdVar.lK().d()) {
            m(menu.add(0, 102, 0, R.string.search_label), 2131233543, new MenuItem.OnMenuItemClickListener() { // from class: allm
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    BackupSettingsChimeraActivity.this.startActivity(new Intent("com.android.settings.action.SETTINGS_SEARCH"));
                    return true;
                }
            });
        }
        m(menu.add(0, 101, 1, R.string.common_list_apps_menu_help_and_feedback), true != fohdVar.lK().c() ? R.drawable.quantum_ic_help_vd_theme_24 : 2131233419, new MenuItem.OnMenuItemClickListener() { // from class: alln
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                BackupSettingsChimeraActivity backupSettingsChimeraActivity = BackupSettingsChimeraActivity.this;
                if (fogx.c()) {
                    backupSettingsChimeraActivity.j = "android_backup";
                    backupSettingsChimeraActivity.k = "https://support.google.com/mobile/?p=android_backup";
                }
                GoogleHelp googleHelp = new GoogleHelp(backupSettingsChimeraActivity.j);
                googleHelp.b(backupSettingsChimeraActivity.getContainerActivity());
                googleHelp.s = aumh.a();
                googleHelp.q = Uri.parse(backupSettingsChimeraActivity.k);
                if (fogx.c()) {
                    googleHelp.R = new allo(aury.l(backupSettingsChimeraActivity));
                    backupSettingsChimeraActivity.l.a(googleHelp.a());
                    return true;
                }
                if (aury.l(backupSettingsChimeraActivity)) {
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

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        finish();
        return true;
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        alll.d(this.q, bundle);
        super.onSaveInstanceState(bundle);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        hO().A(charSequence);
    }
}

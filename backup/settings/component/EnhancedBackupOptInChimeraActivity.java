package com.google.android.gms.backup.settings.component;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.backup.common.util.session.ParcelableSession;
import com.google.android.gms.backup.settings.component.EnhancedBackupOptInChimeraActivity;
import defpackage.a;
import defpackage.ajtm;
import defpackage.ajtv;
import defpackage.ajwt;
import defpackage.ajxc;
import defpackage.ajye;
import defpackage.akaq;
import defpackage.akar;
import defpackage.akfg;
import defpackage.akfm;
import defpackage.akfo;
import defpackage.akgb;
import defpackage.allu;
import defpackage.allv;
import defpackage.allw;
import defpackage.alme;
import defpackage.almf;
import defpackage.almu;
import defpackage.alrv;
import defpackage.amay;
import defpackage.ambm;
import defpackage.ambn;
import defpackage.ambq;
import defpackage.ambr;
import defpackage.ambu;
import defpackage.amcc;
import defpackage.amcd;
import defpackage.auad;
import defpackage.aupz;
import defpackage.bp;
import defpackage.dg;
import defpackage.dhlk;
import defpackage.dymf;
import defpackage.efrl;
import defpackage.efwn;
import defpackage.efwo;
import defpackage.ekut;
import defpackage.ekvl;
import defpackage.ekww;
import defpackage.ekxd;
import defpackage.emwi;
import defpackage.euyj;
import defpackage.fhql;
import defpackage.fxxm;
import defpackage.ryt;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class EnhancedBackupOptInChimeraActivity extends ryt implements ambm, alme, amcc, ambq {
    public static final auad j = ajwt.a("EnhancedBackupOptIn");
    private almu A;
    public ExecutorService k;
    public ajtm l;
    public boolean m;
    public boolean n;
    public ajye o;
    public alrv p;
    private boolean s;
    private almf t;
    private akfo v;
    private boolean w;
    private dg x;
    private ajxc y;
    private ParcelableSession z;
    private final ekww q = ekxd.a(new ekww() { // from class: allr
        @Override // defpackage.ekww
        public final Object lK() {
            return Boolean.valueOf(fodd.x());
        }
    });
    private fhql r = fhql.OPT_IN_CALLER_UNSPECIFIED;
    private final ekut u = new ekut() { // from class: alls
        @Override // defpackage.ekut
        public final Object apply(Object obj) {
            Account account = (Account) obj;
            amcd amcdVar = new amcd();
            Bundle bundle = new Bundle();
            ekvl.y(account);
            bundle.putParcelable("account", account);
            amcdVar.setArguments(bundle);
            return amcdVar;
        }
    };

    private final void r(ambn ambnVar) {
        Account account = (Account) getIntent().getParcelableExtra("account");
        if (account != null) {
            ambnVar.L(account);
        }
        n(ambnVar);
    }

    private final void s() {
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.E(ambr.class, ambr.class.getName());
        bpVar.a();
    }

    private final boolean t(Class cls) {
        return getSupportFragmentManager().h(cls.getName()) != null;
    }

    @Override // defpackage.ambm
    public final void a(Account account, Intent intent) {
        if (this.t == null) {
            this.t = new almf();
        }
        almu g = almu.g(this, new ajtv(this), account, intent, false, this.z);
        this.A = g;
        if (t(ambu.class)) {
            s();
            g.b(euyj.T);
        } else {
            alrv.f(5);
            n((dg) this.u.apply(account));
        }
    }

    public final void b() {
        c(null);
    }

    public final void c(PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo) {
        j.j("navigateToBackupSettings: optInFromBackupSettings=%b", Boolean.valueOf(this.s));
        if (!this.s) {
            Intent g = akfg.g(emwi.BBG1_OPT_IN);
            if (photosEnablementSnackbarInfo != null) {
                g.putExtra("photosEnablementSnackbarInfo", photosEnablementSnackbarInfo);
            }
            startActivity(g);
            finishAfterTransition();
            return;
        }
        if (photosEnablementSnackbarInfo != null) {
            Intent intent = new Intent();
            intent.putExtra("photosEnablementSnackbarInfo", photosEnablementSnackbarInfo);
            setResult(-1, intent);
        } else {
            setResult(-1);
        }
        finishAndRemoveTask();
        overridePendingTransition(R.anim.sud_slide_next_in, R.anim.sud_slide_next_out);
    }

    @Override // defpackage.ambq
    public final void f() {
        runOnUiThread(new Runnable() { // from class: allp
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedBackupOptInChimeraActivity.this.l(null);
            }
        });
    }

    @Override // defpackage.alme
    public final void g(final Account account, final PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo) {
        runOnUiThread(new Runnable() { // from class: allt
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedBackupOptInChimeraActivity.this.m(account, photosEnablementSnackbarInfo);
            }
        });
    }

    @Override // defpackage.amcc
    public final void h() {
        almu almuVar = this.A;
        if (almuVar != null) {
            s();
            almuVar.b(euyj.U);
        } else {
            j.m("photosEnablementController null in onPhotosPreludeFragmentContinuePressed. This shouldn't happen.", new Object[0]);
            b();
        }
    }

    @Override // defpackage.amcc
    public final void k(Account account) {
        l(account);
    }

    @Override // defpackage.ambm
    public final void l(Account account) {
        m(account, null);
    }

    @Override // defpackage.ambm
    public final void m(Account account, final PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo) {
        this.y.a(account != null ? account.name : null, ajxc.c, ajxc.b, this.z.c()).x(new dhlk() { // from class: allq
            @Override // defpackage.dhlk
            public final void hH(dhlw dhlwVar) {
                EnhancedBackupOptInChimeraActivity.this.c(photosEnablementSnackbarInfo);
            }
        });
    }

    public final void n(dg dgVar) {
        ekvl.y(dgVar);
        if (t(dgVar.getClass())) {
            return;
        }
        if (this.w) {
            j.d("Activity is paused, preserving fragment %s", dgVar.getClass().getName());
            this.x = dgVar;
            return;
        }
        ParcelableSession parcelableSession = this.z;
        if (parcelableSession != null) {
            Bundle arguments = dgVar.getArguments();
            if (arguments != null) {
                arguments.putParcelable("backup_flow_session", parcelableSession);
            } else {
                Bundle bundle = new Bundle();
                bundle.putParcelable("backup_flow_session", parcelableSession);
                dgVar.setArguments(bundle);
            }
        }
        if (((Boolean) this.q.lK()).booleanValue()) {
            Bundle arguments2 = dgVar.getArguments();
            if (arguments2 != null) {
                arguments2.putInt("opt_in_caller", this.r.v);
            } else {
                Bundle bundle2 = new Bundle();
                bundle2.putInt("opt_in_caller", this.r.v);
                dgVar.setArguments(bundle2);
            }
        }
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.z(R.id.main_content, dgVar, dgVar.getClass().getName());
        bpVar.a();
    }

    public final void o() {
        r(new amay(this.l, this.v, this.m, this.n));
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10004) {
            if (i2 != -1) {
                j.d(a.j(i2, "Adding a new account was cancelled or failed: resultCode="), new Object[0]);
                return;
            }
            if (intent == null) {
                j.m("No intent was returned for add account flow, even though it was successful.", new Object[0]);
                return;
            }
            String stringExtra = intent.getStringExtra("authAccount");
            String stringExtra2 = intent.getStringExtra("accountType");
            auad auadVar = j;
            String q = auad.q(stringExtra);
            if (stringExtra2 == null) {
                stringExtra2 = "null";
            }
            auadVar.d("Account successfully added: name=%s, type=%s", q, stringExtra2);
            p();
        }
    }

    @Override // com.google.android.chimera.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        int i2 = efwn.a;
        if (efrl.v(this) && efrl.z(this)) {
            j.d("Setting sucUsePartnerResource theme attribute to true.", new Object[0]);
            theme.applyStyle(R.style.BcStyleThemeOverlay, true);
        } else {
            j.d("Setting sucUsePartnerResource theme attribute to false.", new Object[0]);
            theme.applyStyle(R.style.HeavyThemeOverlay, true);
        }
        super.onApplyThemeResource(theme, i, z);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        EnhancedBackupOptInChimeraActivity enhancedBackupOptInChimeraActivity;
        j.j("onCreate", new Object[0]);
        String stringExtra = getIntent().getStringExtra("theme");
        efwo d = efwo.d();
        int i = d.a;
        String str = d.b;
        boolean z = d.c;
        efwo efwoVar = new efwo(R.style.SudThemeGlifV3_DayNight, true);
        int i2 = efwn.a;
        setTheme(efwoVar.c(stringExtra, !efrl.v(this)));
        if (efrl.w(this)) {
            setTheme(efwn.a(this));
        }
        super.onCreate(bundle);
        setContentView(R.layout.backup_settings_activity_main);
        this.z = akgb.a(bundle);
        Intent intent = getIntent();
        int i3 = dymf.a;
        fxxm.f(intent, "intent");
        this.s = intent.getBooleanExtra("optInFromBackupSettings", false) || intent.getBooleanExtra("optInFromBackupSettingsWithMissingDollyConsent", false);
        if (((Boolean) this.q.lK()).booleanValue()) {
            this.r = dymf.b(getIntent());
        }
        if (this.k == null) {
            this.k = new aupz(3, 9);
        }
        if (this.v == null) {
            this.v = new akfo(this.k, this);
        }
        if (this.o == null) {
            this.o = ajye.b(getApplicationContext());
        }
        if (this.p == null) {
            this.p = new alrv();
        }
        if (bundle != null) {
            if (this.t == null) {
                this.t = new almf();
            }
            ajtv ajtvVar = new ajtv(this);
            ParcelableSession parcelableSession = this.z;
            Account account = (Account) bundle.getParcelable("photos-enablement-account");
            Intent intent2 = (Intent) bundle.getParcelable("photos-enablement-intent");
            almu almuVar = null;
            if (account == null || intent2 == null) {
                enhancedBackupOptInChimeraActivity = this;
            } else {
                enhancedBackupOptInChimeraActivity = this;
                almuVar = almu.g(enhancedBackupOptInChimeraActivity, ajtvVar, account, intent2, bundle.getBoolean("photos-enablement-attempted"), parcelableSession);
            }
            enhancedBackupOptInChimeraActivity.A = almuVar;
        } else {
            enhancedBackupOptInChimeraActivity = this;
        }
        if (enhancedBackupOptInChimeraActivity.y == null) {
            enhancedBackupOptInChimeraActivity.y = new ajxc(this, new aupz(Integer.MAX_VALUE, 9));
        }
        new akfm(enhancedBackupOptInChimeraActivity.k).b(new allv(this));
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        this.k.shutdown();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        j.j("onPause", new Object[0]);
        super.onPause();
        this.w = true;
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        auad auadVar = j;
        auadVar.j("onResume", new Object[0]);
        super.onResume();
        this.w = false;
        dg dgVar = this.x;
        if (dgVar != null) {
            auadVar.d("Showing queued fragment %s", dgVar.getClass().getName());
            n(this.x);
            this.x = null;
        }
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        almu almuVar = this.A;
        if (almuVar != null) {
            bundle.putParcelable("photos-enablement-account", almuVar.c);
            bundle.putParcelable("photos-enablement-intent", almuVar.h);
            bundle.putBoolean("photos-enablement-attempted", almuVar.j);
        }
        ParcelableSession parcelableSession = this.z;
        if (parcelableSession != null) {
            bundle.putParcelable("backup_flow_session", parcelableSession);
        }
    }

    public final void p() {
        auad auadVar = j;
        auadVar.d("updateScreenToShowOptIn account=".concat(String.valueOf(String.valueOf(getIntent().getParcelableExtra("account")))), new Object[0]);
        if (this.A != null && (t(amcd.class) || t(ambu.class))) {
            auadVar.d("We are in the process of enabling Photos AB, do not change the opt-in fragment. Aborting updateScreenToShowOptIn.", new Object[0]);
            return;
        }
        if (this.s) {
            o();
            return;
        }
        if (allw.a(getIntent(), "showPhotosOptIn")) {
            r(new ambu(this.l, this.v, this.m, this.n));
            return;
        }
        akaq a = akar.a();
        a.c(7);
        this.l.c(new allu(this), a.a());
    }

    public final boolean q() {
        return allw.a(getIntent(), "showPhotosOptIn");
    }
}

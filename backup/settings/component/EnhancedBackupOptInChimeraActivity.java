package com.google.android.gms.backup.settings.component;

import android.accounts.Account;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.R;
import com.google.android.gms.backup.common.util.session.ParcelableSession;
import com.google.android.gms.backup.settings.component.EnhancedBackupOptInChimeraActivity;
import defpackage.a;
import defpackage.ahsw;
import defpackage.ahtf;
import defpackage.ahwd;
import defpackage.ahwm;
import defpackage.ahxo;
import defpackage.aiaa;
import defpackage.aiab;
import defpackage.aieq;
import defpackage.aiew;
import defpackage.aiey;
import defpackage.aifl;
import defpackage.ajlc;
import defpackage.ajld;
import defpackage.ajle;
import defpackage.ajlm;
import defpackage.ajln;
import defpackage.ajmc;
import defpackage.ajrc;
import defpackage.akaa;
import defpackage.akao;
import defpackage.akap;
import defpackage.akas;
import defpackage.akat;
import defpackage.akaw;
import defpackage.akbe;
import defpackage.akbf;
import defpackage.arxo;
import defpackage.asmf;
import defpackage.bp;
import defpackage.dfae;
import defpackage.dg;
import defpackage.dwae;
import defpackage.edeq;
import defpackage.edjs;
import defpackage.edjt;
import defpackage.eiho;
import defpackage.eiig;
import defpackage.eijr;
import defpackage.eijy;
import defpackage.ekiw;
import defpackage.esiu;
import defpackage.ffbn;
import defpackage.fvbo;
import defpackage.qfp;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class EnhancedBackupOptInChimeraActivity extends qfp implements akao, ajlm, akbe, akas {
    public static final arxo j = ahwd.a("EnhancedBackupOptIn");
    private ajmc A;
    public ExecutorService k;
    public ahsw l;
    public boolean m;
    public boolean n;
    public ahxo o;
    public ajrc p;
    private boolean s;
    private ajln t;
    private aiey v;
    private boolean w;
    private dg x;
    private ahwm y;
    private ParcelableSession z;
    private final eijr q = eijy.a(new eijr() { // from class: ajkz
        @Override // defpackage.eijr
        public final Object a() {
            return Boolean.valueOf(fllt.x());
        }
    });
    private ffbn r = ffbn.OPT_IN_CALLER_UNSPECIFIED;
    private final eiho u = new eiho() { // from class: ajla
        @Override // defpackage.eiho
        public final Object apply(Object obj) {
            Account account = (Account) obj;
            akbf akbfVar = new akbf();
            Bundle bundle = new Bundle();
            eiig.x(account);
            bundle.putParcelable("account", account);
            akbfVar.setArguments(bundle);
            return akbfVar;
        }
    };

    private final void r(akap akapVar) {
        Account account = (Account) getIntent().getParcelableExtra("account");
        if (account != null) {
            akapVar.L(account);
        }
        n(akapVar);
    }

    private final void s() {
        bp bpVar = new bp(getSupportFragmentManager());
        bpVar.E(akat.class, akat.class.getName());
        bpVar.a();
    }

    private final boolean t(Class cls) {
        return getSupportFragmentManager().h(cls.getName()) != null;
    }

    @Override // defpackage.akao
    public final void a(Account account, Intent intent) {
        if (this.t == null) {
            this.t = new ajln();
        }
        ajmc g = ajmc.g(this, new ahtf(this), account, intent, false, this.z);
        this.A = g;
        if (t(akaw.class)) {
            s();
            g.b(esiu.T);
        } else {
            ajrc.f(5);
            n((dg) this.u.apply(account));
        }
    }

    public final void b() {
        c(null);
    }

    public final void c(PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo) {
        j.j("navigateToBackupSettings: optInFromBackupSettings=%b", Boolean.valueOf(this.s));
        if (!this.s) {
            Intent g = aieq.g(ekiw.BBG1_OPT_IN);
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

    @Override // defpackage.akas
    public final void f() {
        runOnUiThread(new Runnable() { // from class: ajkx
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedBackupOptInChimeraActivity.this.l(null);
            }
        });
    }

    @Override // defpackage.ajlm
    public final void g(final Account account, final PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo) {
        runOnUiThread(new Runnable() { // from class: ajlb
            @Override // java.lang.Runnable
            public final void run() {
                EnhancedBackupOptInChimeraActivity.this.m(account, photosEnablementSnackbarInfo);
            }
        });
    }

    @Override // defpackage.akbe
    public final void h() {
        ajmc ajmcVar = this.A;
        if (ajmcVar != null) {
            s();
            ajmcVar.b(esiu.U);
        } else {
            j.m("photosEnablementController null in onPhotosPreludeFragmentContinuePressed. This shouldn't happen.", new Object[0]);
            b();
        }
    }

    @Override // defpackage.akbe
    public final void k(Account account) {
        l(account);
    }

    @Override // defpackage.akao
    public final void l(Account account) {
        m(account, null);
    }

    @Override // defpackage.akao
    public final void m(Account account, final PhotosEnablementSnackbarInfo photosEnablementSnackbarInfo) {
        this.y.a(account != null ? account.name : null, ahwm.c, ahwm.b, this.z.c()).x(new dfae() { // from class: ajky
            @Override // defpackage.dfae
            public final void hr(dfaq dfaqVar) {
                EnhancedBackupOptInChimeraActivity.this.c(photosEnablementSnackbarInfo);
            }
        });
    }

    public final void n(dg dgVar) {
        eiig.x(dgVar);
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
        if (((Boolean) this.q.a()).booleanValue()) {
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
        r(new akaa(this.l, this.v, this.m, this.n));
    }

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
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
            arxo arxoVar = j;
            String q = arxo.q(stringExtra);
            if (stringExtra2 == null) {
                stringExtra2 = "null";
            }
            arxoVar.d("Account successfully added: name=%s, type=%s", q, stringExtra2);
            p();
        }
    }

    @Override // com.google.android.chimera.ContextThemeWrapper
    protected final void onApplyThemeResource(Resources.Theme theme, int i, boolean z) {
        int i2 = edjs.a;
        if (edeq.v(this) && edeq.z(this)) {
            j.d("Setting sucUsePartnerResource theme attribute to true.", new Object[0]);
            theme.applyStyle(R.style.BcStyleThemeOverlay, true);
        } else {
            j.d("Setting sucUsePartnerResource theme attribute to false.", new Object[0]);
            theme.applyStyle(R.style.HeavyThemeOverlay, true);
        }
        super.onApplyThemeResource(theme, i, z);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        EnhancedBackupOptInChimeraActivity enhancedBackupOptInChimeraActivity;
        j.j("onCreate", new Object[0]);
        String stringExtra = getIntent().getStringExtra("theme");
        edjt d = edjt.d();
        int i = d.a;
        String str = d.b;
        boolean z = d.c;
        edjt edjtVar = new edjt(R.style.SudThemeGlifV3_DayNight, true);
        int i2 = edjs.a;
        setTheme(edjtVar.c(stringExtra, !edeq.v(this)));
        if (edeq.w(this)) {
            setTheme(edjs.a(this));
        }
        super.onCreate(bundle);
        setContentView(R.layout.backup_settings_activity_main);
        this.z = aifl.a(bundle);
        Intent intent = getIntent();
        int i3 = dwae.a;
        fvbo.f(intent, "intent");
        this.s = intent.getBooleanExtra("optInFromBackupSettings", false) || intent.getBooleanExtra("optInFromBackupSettingsWithMissingDollyConsent", false);
        if (((Boolean) this.q.a()).booleanValue()) {
            this.r = dwae.b(getIntent());
        }
        if (this.k == null) {
            this.k = new asmf(3, 9);
        }
        if (this.v == null) {
            this.v = new aiey(this.k, this);
        }
        if (this.o == null) {
            this.o = ahxo.b(getApplicationContext());
        }
        if (this.p == null) {
            this.p = new ajrc();
        }
        if (bundle != null) {
            if (this.t == null) {
                this.t = new ajln();
            }
            ahtf ahtfVar = new ahtf(this);
            ParcelableSession parcelableSession = this.z;
            Account account = (Account) bundle.getParcelable("photos-enablement-account");
            Intent intent2 = (Intent) bundle.getParcelable("photos-enablement-intent");
            ajmc ajmcVar = null;
            if (account == null || intent2 == null) {
                enhancedBackupOptInChimeraActivity = this;
            } else {
                enhancedBackupOptInChimeraActivity = this;
                ajmcVar = ajmc.g(enhancedBackupOptInChimeraActivity, ahtfVar, account, intent2, bundle.getBoolean("photos-enablement-attempted"), parcelableSession);
            }
            enhancedBackupOptInChimeraActivity.A = ajmcVar;
        } else {
            enhancedBackupOptInChimeraActivity = this;
        }
        if (enhancedBackupOptInChimeraActivity.y == null) {
            enhancedBackupOptInChimeraActivity.y = new ahwm(this, new asmf(Integer.MAX_VALUE, 9));
        }
        new aiew(enhancedBackupOptInChimeraActivity.k).b(new ajld(this));
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        super.onDestroy();
        this.k.shutdown();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        j.j("onPause", new Object[0]);
        super.onPause();
        this.w = true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        arxo arxoVar = j;
        arxoVar.j("onResume", new Object[0]);
        super.onResume();
        this.w = false;
        dg dgVar = this.x;
        if (dgVar != null) {
            arxoVar.d("Showing queued fragment %s", dgVar.getClass().getName());
            n(this.x);
            this.x = null;
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ajmc ajmcVar = this.A;
        if (ajmcVar != null) {
            bundle.putParcelable("photos-enablement-account", ajmcVar.c);
            bundle.putParcelable("photos-enablement-intent", ajmcVar.h);
            bundle.putBoolean("photos-enablement-attempted", ajmcVar.j);
        }
        ParcelableSession parcelableSession = this.z;
        if (parcelableSession != null) {
            bundle.putParcelable("backup_flow_session", parcelableSession);
        }
    }

    public final void p() {
        arxo arxoVar = j;
        arxoVar.d("updateScreenToShowOptIn account=".concat(String.valueOf(String.valueOf(getIntent().getParcelableExtra("account")))), new Object[0]);
        if (this.A != null && (t(akbf.class) || t(akaw.class))) {
            arxoVar.d("We are in the process of enabling Photos AB, do not change the opt-in fragment. Aborting updateScreenToShowOptIn.", new Object[0]);
            return;
        }
        if (this.s) {
            o();
            return;
        }
        if (ajle.a(getIntent(), "showPhotosOptIn")) {
            r(new akaw(this.l, this.v, this.m, this.n));
            return;
        }
        aiaa a = aiab.a();
        a.c(7);
        this.l.c(new ajlc(this), a.a());
    }

    public final boolean q() {
        return ajle.a(getIntent(), "showPhotosOptIn");
    }
}

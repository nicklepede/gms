package com.google.android.gms.constellation.ui;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.gms.R;
import com.google.android.gms.constellation.ui.ConstellationOnDemandConsentV2ChimeraActivity;
import com.google.android.gms.constellation.ui.widget.AccountPickerView;
import com.google.android.gms.constellation.ui.widget.ConsentScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.abt;
import defpackage.abv;
import defpackage.aqsx;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.asmf;
import defpackage.asvx;
import defpackage.asvy;
import defpackage.asvz;
import defpackage.aswa;
import defpackage.aswb;
import defpackage.aszi;
import defpackage.aszo;
import defpackage.aszq;
import defpackage.atkt;
import defpackage.atkx;
import defpackage.atlc;
import defpackage.atle;
import defpackage.atlw;
import defpackage.atlx;
import defpackage.atmb;
import defpackage.atmc;
import defpackage.atmg;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.dfae;
import defpackage.eigb;
import defpackage.eiid;
import defpackage.eiif;
import defpackage.eijr;
import defpackage.eito;
import defpackage.eits;
import defpackage.enva;
import defpackage.enve;
import defpackage.enwb;
import defpackage.enwf;
import defpackage.enwh;
import defpackage.enxf;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fjou;
import defpackage.fmlv;
import defpackage.qet;
import defpackage.ujv;
import defpackage.ukb;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ConstellationOnDemandConsentV2ChimeraActivity extends qet implements atkt {
    private static final eits F;
    private static final eits G;
    public static final arxo j;
    public Button A;
    public Button B;
    public WebView C;
    public ProgressBar D;
    public BottomSheetBehavior E;
    private final asvz H;
    private ujv I;
    private aszq J;
    private boolean K;
    private boolean L;
    private abv M;
    public final ExecutorService k = new asmf(1, 9);
    public final String l;
    public final CountDownLatch m;
    public final UUID n;
    public final atmc o;
    public asvy p;
    public enve q;
    public float r;
    public int s;
    public boolean t;
    public eiid u;
    public ImageView v;
    public View w;
    public ConsentScrollView x;
    public AccountPickerView y;
    public View z;

    static {
        eito eitoVar = new eito();
        eitoVar.i(10, enwb.OD_CONSENT_ACCOUNT_NOT_CAPABLE);
        eitoVar.i(5, enwb.OD_CONSENT_WILL_ANNOY_USER);
        eitoVar.i(3, enwb.OD_CONSENT_ALREADY_CONSENTED);
        eitoVar.i(9, enwb.OD_CONSENT_CALLING_PACKAGE_NOT_ALLOWED);
        eitoVar.i(13, enwb.OD_CONSENT_CONSENT_TIMEOUT);
        eitoVar.i(12, enwb.OD_CONSENT_INVALID_ARGUMENT);
        eitoVar.i(1, enwb.OD_CONSENT_NOT_ENABLED);
        eitoVar.i(11, enwb.OD_CONSENT_NO_CAPABLE_ACCOUNTS);
        eitoVar.i(2, enwb.OD_CONSENT_NO_NETWORK);
        eitoVar.i(14, enwb.OD_CONSENT_UPDATE_FAILED);
        eitoVar.i(0, enwb.OD_CONSENT_CANCELED);
        F = eitoVar.b();
        G = eits.n(13, aszo.CONSENT_TIMEOUT, 14, aszo.UPDATE_FAILED, 0, aszo.CANCELED);
        j = atmg.a("on_demand_consent_v2");
    }

    public ConstellationOnDemandConsentV2ChimeraActivity() {
        asvz a = aswa.a();
        a.c(0);
        this.H = a;
        this.l = Locale.getDefault().toLanguageTag();
        this.m = new CountDownLatch(1);
        UUID randomUUID = UUID.randomUUID();
        this.n = randomUUID;
        this.o = new atmc(randomUUID.toString());
        asvx a2 = asvy.a();
        a2.g("");
        a2.f("");
        this.p = a2.a();
        this.q = enve.a;
        this.r = 0.0f;
        this.s = 0;
        this.t = false;
        this.u = eigb.a;
        this.K = false;
        this.L = false;
    }

    private final void q(int i, boolean z) {
        if ((i == -1 || i == 0 || i == 13 || i == 14) && this.J != null) {
            try {
                aszo aszoVar = (aszo) G.getOrDefault(Integer.valueOf(i), aszo.FAILED);
                if (i == -1) {
                    aszoVar = z ? aszo.CONSENTED : aszo.DECLINED;
                }
                aszq aszqVar = this.J;
                String callingPackage = getCallingPackage();
                asvy asvyVar = this.p;
                aszqVar.f(aszoVar, callingPackage, asvyVar.b, asvyVar.c);
            } catch (atmb e) {
                j.g("Error storing impression", e, new Object[0]);
            }
        }
    }

    public final void a(final boolean z) {
        if (this.I != null) {
            int i = this.s;
            this.s = i + 1;
            String str = this.l;
            String e = fmlv.e();
            String valueOf = String.valueOf(this.p.d.f);
            String str2 = ((Account) this.u.c()).name;
            asvy asvyVar = this.p;
            String str3 = asvyVar.b;
            String str4 = asvyVar.c;
            this.I.b(ukb.a(i, 1, 3, null, Long.valueOf(System.currentTimeMillis()), true != z ? 2 : 1, Bundle.EMPTY, 3, Integer.toString(251661004), e, str, valueOf, null, str2, str3, str4, 0)).x(new dfae() { // from class: atbg
                @Override // defpackage.dfae
                public final void hr(dfaq dfaqVar) {
                    Exception exc = (Exception) eiid.i(dfaqVar.h()).e(new Exception("No exception from SetAsterismConsent"));
                    final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity = ConstellationOnDemandConsentV2ChimeraActivity.this;
                    final boolean z2 = z;
                    if (dfaqVar.m()) {
                        constellationOnDemandConsentV2ChimeraActivity.m.countDown();
                        constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: atbh
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConstellationOnDemandConsentV2ChimeraActivity.this.l(-1, eiid.j(Boolean.valueOf(z2)));
                            }
                        });
                        return;
                    }
                    if (constellationOnDemandConsentV2ChimeraActivity.s < fmlv.a.a().d()) {
                        eiid i2 = eiid.i(dfaqVar.h());
                        if (i2.h()) {
                            try {
                                int parseInt = Integer.parseInt(eiif.b(((Exception) i2.c()).getMessage()).split(":", -1)[0]);
                                if (parseInt != 8) {
                                    switch (parseInt) {
                                    }
                                    return;
                                }
                                ConstellationOnDemandConsentV2ChimeraActivity.j.g("SetConsent failed, retrying. Exception:", exc, new Object[0]);
                                constellationOnDemandConsentV2ChimeraActivity.a(z2);
                                return;
                            } catch (NumberFormatException unused) {
                            }
                        }
                    }
                    ConstellationOnDemandConsentV2ChimeraActivity.j.g("SetConsent failed, can't retry. Exception:", exc, new Object[0]);
                    constellationOnDemandConsentV2ChimeraActivity.m.countDown();
                    constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: atbi
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConstellationOnDemandConsentV2ChimeraActivity.this.l(14, eiid.j(Boolean.valueOf(z2)));
                        }
                    });
                }
            });
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void finish() {
        if (this.u.h()) {
            this.H.b(((Account) this.u.c()).name);
        }
        aswa a = this.H.a();
        enve enveVar = this.q;
        fecj fecjVar = (fecj) enveVar.iB(5, null);
        fecjVar.X(enveVar);
        int i = a.c;
        if (i == -1) {
            int i2 = a.b == fjou.CONSENTED.a() ? 15 : 16;
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            enve enveVar2 = (enve) fecjVar.b;
            enve enveVar3 = enve.a;
            enveVar2.d = Integer.valueOf(enwh.a(i2));
            enveVar2.c = 4;
        } else {
            enwb enwbVar = (enwb) F.getOrDefault(Integer.valueOf(i), enwb.UNKNOWN_ERROR);
            if (!fecjVar.b.L()) {
                fecjVar.U();
            }
            enve enveVar4 = (enve) fecjVar.b;
            enve enveVar5 = enve.a;
            enveVar4.d = Integer.valueOf(enwbVar.a());
            enveVar4.c = 3;
        }
        atlw.a(this).v(this.n, (enve) fecjVar.Q());
        if (!fmlv.j()) {
            q(i, a.b == fjou.CONSENTED.a());
        }
        j.d("Finished with result: %d", Integer.valueOf(i));
        setResult(i, new Intent().putExtra("account_name_key", a.a).putExtra("consent_status_key", a.b));
        super.finish();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final String getCallingPackage() {
        return eiif.b(super.getCallingPackage());
    }

    public final synchronized void k(int i) {
        l(i, eigb.a);
    }

    public final synchronized void l(int i, eiid eiidVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        asvz asvzVar = this.H;
        asvzVar.c(i);
        if (eiidVar.h()) {
            asvzVar.d((((Boolean) eiidVar.c()).booleanValue() ? fjou.CONSENTED : fjou.NO_CONSENT).a());
        }
        finish();
    }

    public final synchronized void m() {
        ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity;
        aqsx c;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!this.K && !this.L && this.M != null) {
                if (fmlv.g()) {
                    atle.d();
                    constellationOnDemandConsentV2ChimeraActivity = this;
                    c = atle.c(this.o, constellationOnDemandConsentV2ChimeraActivity, eiid.j(Integer.valueOf(this.p.d.a())), this.u, eigb.a, eiid.j(this.p.b));
                } else {
                    constellationOnDemandConsentV2ChimeraActivity = this;
                    atle.d();
                    atmc atmcVar = constellationOnDemandConsentV2ChimeraActivity.o;
                    eiid j2 = eiid.j(Integer.valueOf(constellationOnDemandConsentV2ChimeraActivity.p.d.a()));
                    eiid eiidVar = constellationOnDemandConsentV2ChimeraActivity.u;
                    eigb eigbVar = eigb.a;
                    c = atle.c(atmcVar, constellationOnDemandConsentV2ChimeraActivity, j2, eiidVar, eigbVar, eigbVar);
                }
                constellationOnDemandConsentV2ChimeraActivity.M.b(c);
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // defpackage.atkt
    public final void n(boolean z) {
        Button button;
        j.d("onConsentScrolledTo(%b)", Boolean.valueOf(z));
        View view = this.z;
        if (view != null) {
            view.setElevation(z ? 0.0f : this.r);
        }
        Button button2 = this.A;
        if (button2 != null && !button2.isEnabled() && z) {
            this.A.setEnabled(true);
        }
        if (!fmlv.f() || (button = this.B) == null || button.isEnabled() || !z) {
            return;
        }
        this.B.setEnabled(true);
    }

    @Override // defpackage.atkt
    public final void o(boolean z) {
        BottomSheetBehavior bottomSheetBehavior;
        j.d("onResetScrolledTo(%b)", Boolean.valueOf(z));
        View view = this.z;
        if (view != null) {
            view.setElevation(z ? 0.0f : this.r);
        }
        if (z && (bottomSheetBehavior = this.E) != null && bottomSheetBehavior.z == 3) {
            Button button = this.A;
            if (button != null) {
                button.setEnabled(true);
            }
            Button button2 = this.B;
            if (button2 != null) {
                button2.setEnabled(true);
                return;
            }
            return;
        }
        Button button3 = this.A;
        if (button3 != null) {
            button3.setEnabled(false);
        }
        if (fmlv.f()) {
            Button button4 = this.B;
            if (button4 != null) {
                button4.setEnabled(false);
                return;
            }
            return;
        }
        Button button5 = this.B;
        if (button5 != null) {
            button5.setEnabled(true);
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        k(0);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        eijr eijrVar = bqqe.a;
        bqqa.a(aseu.CONSTELLATION_UI_ONDEMAND_CONSENT_V2);
        this.M = registerForActivityResult(new atlc(), new abt() { // from class: atbe
            @Override // defpackage.abt
            public final void jq(Object obj) {
                eiid eiidVar = (eiid) obj;
                if (eiidVar.h()) {
                    final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity = ConstellationOnDemandConsentV2ChimeraActivity.this;
                    if (constellationOnDemandConsentV2ChimeraActivity.y != null) {
                        constellationOnDemandConsentV2ChimeraActivity.u = eiidVar;
                        constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: atbb
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity2 = ConstellationOnDemandConsentV2ChimeraActivity.this;
                                AccountPickerView accountPickerView = constellationOnDemandConsentV2ChimeraActivity2.y;
                                if (accountPickerView != null) {
                                    accountPickerView.a((Account) constellationOnDemandConsentV2ChimeraActivity2.u.c());
                                }
                            }
                        });
                    }
                }
            }
        });
        this.I = new ujv(applicationContext);
        j.d("Parsing params and checking preconditions", new Object[0]);
        Intent intent = getIntent();
        asvx a = asvy.a();
        a.a = eiid.i(intent.getStringExtra("account_name_key"));
        a.g(eiif.b(intent.getStringExtra("consent_variant_key")));
        a.f(eiif.b(intent.getStringExtra("consent_trigger_key")));
        a.e((aswb) aswb.e.getOrDefault(Integer.valueOf(intent.getIntExtra("theme_key", -1)), aswb.AUTOMATIC));
        a.d(intent.getBooleanExtra("override_consented_check_key", false));
        a.b(intent.getBooleanExtra("bypass_annoyance_check_key", false));
        a.c(intent.getLongExtra("consent_timeout_millis_key", 60000L));
        this.p = a.a();
        fecj v = enve.a.v();
        enwf enwfVar = enwf.ON_DEMAND_CONSENT_V2;
        if (!v.b.L()) {
            v.U();
        }
        enve enveVar = (enve) v.b;
        enveVar.e = enwfVar.a();
        enveVar.b |= 1;
        String callingPackage = getCallingPackage();
        if (!v.b.L()) {
            v.U();
        }
        enve enveVar2 = (enve) v.b;
        enveVar2.b |= 2;
        enveVar2.f = callingPackage;
        fecj v2 = enva.a.v();
        String str = this.p.b;
        if (!v2.b.L()) {
            v2.U();
        }
        fecp fecpVar = v2.b;
        enva envaVar = (enva) fecpVar;
        str.getClass();
        envaVar.b |= 16;
        envaVar.g = str;
        String str2 = this.p.c;
        if (!fecpVar.L()) {
            v2.U();
        }
        fecp fecpVar2 = v2.b;
        enva envaVar2 = (enva) fecpVar2;
        str2.getClass();
        envaVar2.b |= 32;
        envaVar2.h = str2;
        if (!fecpVar2.L()) {
            v2.U();
        }
        enva envaVar3 = (enva) v2.b;
        envaVar3.c = enxf.a(3);
        envaVar3.b |= 1;
        if (!v.b.L()) {
            v.U();
        }
        enve enveVar3 = (enve) v.b;
        enva envaVar4 = (enva) v2.Q();
        envaVar4.getClass();
        enveVar3.h = envaVar4;
        enveVar3.b |= 8;
        this.q = (enve) v.Q();
        if (!fmlv.i()) {
            k(1);
            return;
        }
        asvy asvyVar = this.p;
        if (asvyVar != null) {
            eiid eiidVar = asvyVar.a;
            if ((!eiidVar.h() || !eiif.c((String) eiidVar.c())) && !eiif.c(asvyVar.b) && !eiif.c(asvyVar.c) && asvyVar.d != aswb.UNKNOWN && asvyVar.g > 0) {
                if (!fmlv.a.a().f().b.contains(getCallingPackage())) {
                    k(9);
                    return;
                }
                atkx.a(this);
                if (!atkx.b(this)) {
                    k(2);
                    return;
                }
                try {
                    aszi.b();
                    this.J = aszi.c(this, 3);
                    if (!this.p.f || !fmlv.a.a().e().b.contains(getCallingPackage())) {
                        try {
                            if (this.J.a(fmlv.b()) >= fmlv.a.a().c()) {
                                k(5);
                                return;
                            }
                        } catch (atmb e) {
                            j.g("Error accessing impressions", e, new Object[0]);
                            k(6);
                            return;
                        }
                    }
                    this.k.execute(new Runnable() { // from class: atbf
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConstellationOnDemandConsentV2ChimeraActivity.j.d("Finding capable account for account picker", new Object[0]);
                            final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity = ConstellationOnDemandConsentV2ChimeraActivity.this;
                            if (fmlv.g()) {
                                atle.d();
                                atmc atmcVar = constellationOnDemandConsentV2ChimeraActivity.o;
                                asvy asvyVar2 = constellationOnDemandConsentV2ChimeraActivity.p;
                                constellationOnDemandConsentV2ChimeraActivity.u = atle.a(atmcVar, constellationOnDemandConsentV2ChimeraActivity, asvyVar2.a, eiid.j(asvyVar2.b));
                            } else {
                                atle.d();
                                constellationOnDemandConsentV2ChimeraActivity.u = atle.a(constellationOnDemandConsentV2ChimeraActivity.o, constellationOnDemandConsentV2ChimeraActivity, constellationOnDemandConsentV2ChimeraActivity.p.a, eigb.a);
                            }
                            if (!constellationOnDemandConsentV2ChimeraActivity.u.h()) {
                                constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: atat
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity2 = ConstellationOnDemandConsentV2ChimeraActivity.this;
                                        constellationOnDemandConsentV2ChimeraActivity2.k(true != constellationOnDemandConsentV2ChimeraActivity2.p.a.h() ? 11 : 10);
                                    }
                                });
                            } else if (constellationOnDemandConsentV2ChimeraActivity.p.e || aszi.b().a(constellationOnDemandConsentV2ChimeraActivity.getApplicationContext()).h(fjmp.CONSTELLATION) != fjou.CONSENTED) {
                                constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: atav
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        atkt atktVar;
                                        atkt atktVar2;
                                        ConstellationOnDemandConsentV2ChimeraActivity.j.d("Loading content", new Object[0]);
                                        final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity2 = ConstellationOnDemandConsentV2ChimeraActivity.this;
                                        atlw a2 = atlw.a(constellationOnDemandConsentV2ChimeraActivity2);
                                        enve enveVar4 = constellationOnDemandConsentV2ChimeraActivity2.q;
                                        fecj fecjVar = (fecj) enveVar4.iB(5, null);
                                        fecjVar.X(enveVar4);
                                        if (!fecjVar.b.L()) {
                                            fecjVar.U();
                                        }
                                        UUID uuid = constellationOnDemandConsentV2ChimeraActivity2.n;
                                        enve enveVar5 = (enve) fecjVar.b;
                                        enve enveVar6 = enve.a;
                                        enveVar5.d = Integer.valueOf(enwh.a(14));
                                        enveVar5.c = 4;
                                        a2.v(uuid, (enve) fecjVar.Q());
                                        if (fmlv.a.a().p()) {
                                            constellationOnDemandConsentV2ChimeraActivity2.setContentView(R.layout.odcv2_stacked_buttons);
                                        } else {
                                            constellationOnDemandConsentV2ChimeraActivity2.setContentView(R.layout.odcv2);
                                        }
                                        if (Build.VERSION.SDK_INT != 26) {
                                            constellationOnDemandConsentV2ChimeraActivity2.setRequestedOrientation(1);
                                        }
                                        if (constellationOnDemandConsentV2ChimeraActivity2.p.d == aswb.DARK || (constellationOnDemandConsentV2ChimeraActivity2.p.d == aswb.AUTOMATIC && (constellationOnDemandConsentV2ChimeraActivity2.getResources().getConfiguration().uiMode & 48) == 32)) {
                                            constellationOnDemandConsentV2ChimeraActivity2.t = true;
                                            constellationOnDemandConsentV2ChimeraActivity2.hC().q(2);
                                        } else {
                                            constellationOnDemandConsentV2ChimeraActivity2.hC().q(1);
                                        }
                                        constellationOnDemandConsentV2ChimeraActivity2.E = BottomSheetBehavior.v(constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.drawer_scroll_view));
                                        constellationOnDemandConsentV2ChimeraActivity2.E.G(fmlv.c() == -1 ? -1 : (int) (fmlv.c() * constellationOnDemandConsentV2ChimeraActivity2.getResources().getDisplayMetrics().density), false);
                                        constellationOnDemandConsentV2ChimeraActivity2.E.w(new atbl(constellationOnDemandConsentV2ChimeraActivity2));
                                        constellationOnDemandConsentV2ChimeraActivity2.v = (ImageView) constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.drawer_handler);
                                        constellationOnDemandConsentV2ChimeraActivity2.w = constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.drawer_handler_container);
                                        constellationOnDemandConsentV2ChimeraActivity2.w.setOnClickListener(new View.OnClickListener() { // from class: atax
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                BottomSheetBehavior bottomSheetBehavior = ConstellationOnDemandConsentV2ChimeraActivity.this.E;
                                                if (bottomSheetBehavior == null || bottomSheetBehavior.z != 3) {
                                                    return;
                                                }
                                                bottomSheetBehavior.H(4);
                                            }
                                        });
                                        constellationOnDemandConsentV2ChimeraActivity2.D = (ProgressBar) constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.odcv2_progress_circle);
                                        constellationOnDemandConsentV2ChimeraActivity2.r = constellationOnDemandConsentV2ChimeraActivity2.getResources().getDimension(R.dimen.odcv2_consent_buttons_elevation);
                                        constellationOnDemandConsentV2ChimeraActivity2.z = constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.button_container);
                                        constellationOnDemandConsentV2ChimeraActivity2.A = (Button) constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.button_agree);
                                        constellationOnDemandConsentV2ChimeraActivity2.B = (Button) constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.button_no_thanks);
                                        constellationOnDemandConsentV2ChimeraActivity2.y = (AccountPickerView) constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.account_picker);
                                        if (constellationOnDemandConsentV2ChimeraActivity2.u.h()) {
                                            constellationOnDemandConsentV2ChimeraActivity2.y.a((Account) constellationOnDemandConsentV2ChimeraActivity2.u.c());
                                        }
                                        constellationOnDemandConsentV2ChimeraActivity2.C = (WebView) constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.consent_webview);
                                        constellationOnDemandConsentV2ChimeraActivity2.C.setWebViewClient(new atbm(constellationOnDemandConsentV2ChimeraActivity2));
                                        constellationOnDemandConsentV2ChimeraActivity2.C.getSettings().setJavaScriptEnabled(true);
                                        WebView webView = constellationOnDemandConsentV2ChimeraActivity2.C;
                                        Uri.Builder appendQueryParameter = Uri.parse(fmlv.e()).buildUpon().appendQueryParameter("hl", constellationOnDemandConsentV2ChimeraActivity2.l).appendQueryParameter("variantId", constellationOnDemandConsentV2ChimeraActivity2.p.b).appendQueryParameter("trigger", constellationOnDemandConsentV2ChimeraActivity2.p.c);
                                        if (constellationOnDemandConsentV2ChimeraActivity2.t) {
                                            appendQueryParameter.appendQueryParameter("darkMode", "true");
                                        }
                                        webView.loadUrl(appendQueryParameter.build().toString());
                                        constellationOnDemandConsentV2ChimeraActivity2.A.setOnClickListener(new View.OnClickListener() { // from class: atay
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                ConstellationOnDemandConsentV2ChimeraActivity.j.d("User granted consent", new Object[0]);
                                                final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity3 = ConstellationOnDemandConsentV2ChimeraActivity.this;
                                                constellationOnDemandConsentV2ChimeraActivity3.k.execute(new Runnable() { // from class: atbk
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ConstellationOnDemandConsentV2ChimeraActivity.this.p(true);
                                                    }
                                                });
                                            }
                                        });
                                        constellationOnDemandConsentV2ChimeraActivity2.B.setOnClickListener(new View.OnClickListener() { // from class: ataz
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                ConstellationOnDemandConsentV2ChimeraActivity.j.d("User denied consent", new Object[0]);
                                                final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity3 = ConstellationOnDemandConsentV2ChimeraActivity.this;
                                                constellationOnDemandConsentV2ChimeraActivity3.k.execute(new Runnable() { // from class: atbj
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ConstellationOnDemandConsentV2ChimeraActivity.this.p(false);
                                                    }
                                                });
                                            }
                                        });
                                        constellationOnDemandConsentV2ChimeraActivity2.y.b(new Runnable() { // from class: atba
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity3 = ConstellationOnDemandConsentV2ChimeraActivity.this;
                                                constellationOnDemandConsentV2ChimeraActivity3.k.execute(new Runnable() { // from class: ataw
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ConstellationOnDemandConsentV2ChimeraActivity.this.m();
                                                    }
                                                });
                                            }
                                        });
                                        constellationOnDemandConsentV2ChimeraActivity2.x = (ConsentScrollView) constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.consent_scroll_view);
                                        ConsentScrollView consentScrollView = constellationOnDemandConsentV2ChimeraActivity2.x;
                                        consentScrollView.i = constellationOnDemandConsentV2ChimeraActivity2;
                                        if (consentScrollView.j.h() && (atktVar2 = consentScrollView.i) != null) {
                                            atktVar2.n(((Boolean) consentScrollView.j.c()).booleanValue());
                                            consentScrollView.j = eigb.a;
                                        }
                                        if (consentScrollView.k.h() && (atktVar = consentScrollView.i) != null) {
                                            atktVar.o(((Boolean) consentScrollView.k.c()).booleanValue());
                                            consentScrollView.k = eigb.a;
                                        }
                                        constellationOnDemandConsentV2ChimeraActivity2.A.setEnabled(false);
                                        constellationOnDemandConsentV2ChimeraActivity2.B.setEnabled(true);
                                        if (fmlv.f()) {
                                            constellationOnDemandConsentV2ChimeraActivity2.B.setEnabled(false);
                                        }
                                        if (fmlv.a.a().i()) {
                                            constellationOnDemandConsentV2ChimeraActivity2.E.H(3);
                                            constellationOnDemandConsentV2ChimeraActivity2.v.setBackgroundResource(R.drawable.odcv2_caret);
                                        }
                                    }
                                });
                            } else {
                                constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: atau
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConstellationOnDemandConsentV2ChimeraActivity.this.k(3);
                                    }
                                });
                            }
                        }
                    });
                    return;
                } catch (atlx unused) {
                    j.f("Impression storage not enabled", new Object[0]);
                    k(1);
                    return;
                }
            }
        }
        k(12);
    }

    public final synchronized void p(final boolean z) {
        this.K = true;
        runOnUiThread(new Runnable() { // from class: atas
            @Override // java.lang.Runnable
            public final void run() {
                ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity = ConstellationOnDemandConsentV2ChimeraActivity.this;
                Button button = constellationOnDemandConsentV2ChimeraActivity.A;
                if (button != null) {
                    button.setEnabled(false);
                }
                Button button2 = constellationOnDemandConsentV2ChimeraActivity.B;
                if (button2 != null) {
                    button2.setEnabled(false);
                }
                constellationOnDemandConsentV2ChimeraActivity.findViewById(R.id.odcv2_progress_bar).setVisibility(0);
            }
        });
        atlw a = atlw.a(this);
        enve enveVar = this.q;
        fecj fecjVar = (fecj) enveVar.iB(5, null);
        fecjVar.X(enveVar);
        if (!fecjVar.b.L()) {
            fecjVar.U();
        }
        UUID uuid = this.n;
        enve enveVar2 = (enve) fecjVar.b;
        enve enveVar3 = enve.a;
        enveVar2.d = Integer.valueOf(enwh.a(21));
        enveVar2.c = 4;
        a.v(uuid, (enve) fecjVar.Q());
        if (fmlv.j()) {
            q(-1, z);
        }
        a(z);
        try {
            CountDownLatch countDownLatch = this.m;
            countDownLatch.await(this.p.g, TimeUnit.MILLISECONDS);
            if (countDownLatch.getCount() > 0) {
                runOnUiThread(new Runnable() { // from class: atbc
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstellationOnDemandConsentV2ChimeraActivity.this.l(13, eiid.j(Boolean.valueOf(z)));
                    }
                });
            }
        } catch (InterruptedException unused) {
            runOnUiThread(new Runnable() { // from class: atbd
                @Override // java.lang.Runnable
                public final void run() {
                    ConstellationOnDemandConsentV2ChimeraActivity.this.l(14, eiid.j(Boolean.valueOf(z)));
                }
            });
        }
    }
}

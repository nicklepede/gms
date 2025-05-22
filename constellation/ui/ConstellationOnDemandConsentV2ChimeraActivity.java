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
import defpackage.aby;
import defpackage.aca;
import defpackage.asvn;
import defpackage.auad;
import defpackage.auio;
import defpackage.aupz;
import defpackage.auzw;
import defpackage.auzx;
import defpackage.auzy;
import defpackage.auzz;
import defpackage.avaa;
import defpackage.avdl;
import defpackage.avdr;
import defpackage.avdt;
import defpackage.avow;
import defpackage.avpa;
import defpackage.avpf;
import defpackage.avph;
import defpackage.avpz;
import defpackage.avqa;
import defpackage.avqe;
import defpackage.avqf;
import defpackage.avqj;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.dhlk;
import defpackage.ektg;
import defpackage.ekvi;
import defpackage.ekvk;
import defpackage.ekww;
import defpackage.elgt;
import defpackage.elgx;
import defpackage.eqit;
import defpackage.eqix;
import defpackage.eqju;
import defpackage.eqjy;
import defpackage.eqka;
import defpackage.eqky;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fmer;
import defpackage.fpdq;
import defpackage.rxx;
import defpackage.wfu;
import defpackage.wga;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ConstellationOnDemandConsentV2ChimeraActivity extends rxx implements avow {
    private static final elgx F;
    private static final elgx G;
    public static final auad j;
    public Button A;
    public Button B;
    public WebView C;
    public ProgressBar D;
    public BottomSheetBehavior E;
    private final auzy H;
    private wfu I;
    private avdt J;
    private boolean K;
    private boolean L;
    private aca M;
    public final ExecutorService k = new aupz(1, 9);
    public final String l;
    public final CountDownLatch m;
    public final UUID n;
    public final avqf o;
    public auzx p;
    public eqix q;
    public float r;
    public int s;
    public boolean t;
    public ekvi u;
    public ImageView v;
    public View w;
    public ConsentScrollView x;
    public AccountPickerView y;
    public View z;

    static {
        elgt elgtVar = new elgt();
        elgtVar.i(10, eqju.OD_CONSENT_ACCOUNT_NOT_CAPABLE);
        elgtVar.i(5, eqju.OD_CONSENT_WILL_ANNOY_USER);
        elgtVar.i(3, eqju.OD_CONSENT_ALREADY_CONSENTED);
        elgtVar.i(9, eqju.OD_CONSENT_CALLING_PACKAGE_NOT_ALLOWED);
        elgtVar.i(13, eqju.OD_CONSENT_CONSENT_TIMEOUT);
        elgtVar.i(12, eqju.OD_CONSENT_INVALID_ARGUMENT);
        elgtVar.i(1, eqju.OD_CONSENT_NOT_ENABLED);
        elgtVar.i(11, eqju.OD_CONSENT_NO_CAPABLE_ACCOUNTS);
        elgtVar.i(2, eqju.OD_CONSENT_NO_NETWORK);
        elgtVar.i(14, eqju.OD_CONSENT_UPDATE_FAILED);
        elgtVar.i(0, eqju.OD_CONSENT_CANCELED);
        F = elgtVar.b();
        G = elgx.n(13, avdr.CONSENT_TIMEOUT, 14, avdr.UPDATE_FAILED, 0, avdr.CANCELED);
        j = avqj.a("on_demand_consent_v2");
    }

    public ConstellationOnDemandConsentV2ChimeraActivity() {
        auzy a = auzz.a();
        a.c(0);
        this.H = a;
        this.l = Locale.getDefault().toLanguageTag();
        this.m = new CountDownLatch(1);
        UUID randomUUID = UUID.randomUUID();
        this.n = randomUUID;
        this.o = new avqf(randomUUID.toString());
        auzw a2 = auzx.a();
        a2.b = "";
        a2.c = "";
        this.p = a2.a();
        this.q = eqix.a;
        this.r = 0.0f;
        this.s = 0;
        this.t = false;
        this.u = ektg.a;
        this.K = false;
        this.L = false;
    }

    private final void q(int i, boolean z) {
        if ((i == -1 || i == 0 || i == 13 || i == 14) && this.J != null) {
            try {
                avdr avdrVar = (avdr) G.getOrDefault(Integer.valueOf(i), avdr.FAILED);
                if (i == -1) {
                    avdrVar = z ? avdr.CONSENTED : avdr.DECLINED;
                }
                avdt avdtVar = this.J;
                String callingPackage = getCallingPackage();
                auzx auzxVar = this.p;
                avdtVar.f(avdrVar, callingPackage, auzxVar.b, auzxVar.c);
            } catch (avqe e) {
                j.g("Error storing impression", e, new Object[0]);
            }
        }
    }

    public final void a(final boolean z) {
        if (this.I != null) {
            int i = this.s;
            this.s = i + 1;
            String str = this.l;
            String e = fpdq.e();
            String valueOf = String.valueOf(this.p.d.f);
            String str2 = ((Account) this.u.c()).name;
            auzx auzxVar = this.p;
            String str3 = auzxVar.b;
            String str4 = auzxVar.c;
            this.I.b(wga.a(i, 1, 3, null, Long.valueOf(System.currentTimeMillis()), true != z ? 2 : 1, Bundle.EMPTY, 3, Integer.toString(251864004), e, str, valueOf, null, str2, str3, str4, 0)).x(new dhlk() { // from class: avfj
                @Override // defpackage.dhlk
                public final void hH(dhlw dhlwVar) {
                    Exception exc = (Exception) ekvi.i(dhlwVar.h()).e(new Exception("No exception from SetAsterismConsent"));
                    final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity = ConstellationOnDemandConsentV2ChimeraActivity.this;
                    final boolean z2 = z;
                    if (dhlwVar.m()) {
                        constellationOnDemandConsentV2ChimeraActivity.m.countDown();
                        constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: avfk
                            @Override // java.lang.Runnable
                            public final void run() {
                                ConstellationOnDemandConsentV2ChimeraActivity.this.l(-1, ekvi.j(Boolean.valueOf(z2)));
                            }
                        });
                        return;
                    }
                    if (constellationOnDemandConsentV2ChimeraActivity.s < fpdq.a.lK().d()) {
                        ekvi i2 = ekvi.i(dhlwVar.h());
                        if (i2.h()) {
                            try {
                                int parseInt = Integer.parseInt(ekvk.b(((Exception) i2.c()).getMessage()).split(":", -1)[0]);
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
                    constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: avfl
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConstellationOnDemandConsentV2ChimeraActivity.this.l(14, ekvi.j(Boolean.valueOf(z2)));
                        }
                    });
                }
            });
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void finish() {
        if (this.u.h()) {
            this.H.b(((Account) this.u.c()).name);
        }
        auzz a = this.H.a();
        eqix eqixVar = this.q;
        fgrc fgrcVar = (fgrc) eqixVar.iQ(5, null);
        fgrcVar.X(eqixVar);
        int i = a.c;
        if (i == -1) {
            int i2 = a.b == fmer.CONSENTED.a() ? 15 : 16;
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            eqix eqixVar2 = (eqix) fgrcVar.b;
            eqix eqixVar3 = eqix.a;
            eqixVar2.d = Integer.valueOf(eqka.a(i2));
            eqixVar2.c = 4;
        } else {
            eqju eqjuVar = (eqju) F.getOrDefault(Integer.valueOf(i), eqju.UNKNOWN_ERROR);
            if (!fgrcVar.b.L()) {
                fgrcVar.U();
            }
            eqix eqixVar4 = (eqix) fgrcVar.b;
            eqix eqixVar5 = eqix.a;
            eqixVar4.d = Integer.valueOf(eqjuVar.a());
            eqixVar4.c = 3;
        }
        avpz.a(this).v(this.n, (eqix) fgrcVar.Q());
        if (!fpdq.j()) {
            q(i, a.b == fmer.CONSENTED.a());
        }
        j.d("Finished with result: %d", Integer.valueOf(i));
        setResult(i, new Intent().putExtra("account_name_key", a.a).putExtra("consent_status_key", a.b));
        super.finish();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final String getCallingPackage() {
        return ekvk.b(super.getCallingPackage());
    }

    public final synchronized void k(int i) {
        l(i, ektg.a);
    }

    public final synchronized void l(int i, ekvi ekviVar) {
        if (this.L) {
            return;
        }
        this.L = true;
        auzy auzyVar = this.H;
        auzyVar.c(i);
        if (ekviVar.h()) {
            auzyVar.d((((Boolean) ekviVar.c()).booleanValue() ? fmer.CONSENTED : fmer.NO_CONSENT).a());
        }
        finish();
    }

    public final synchronized void m() {
        ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity;
        asvn c;
        try {
        } catch (Throwable th) {
            th = th;
        }
        try {
            if (!this.K && !this.L && this.M != null) {
                if (fpdq.g()) {
                    avph.d();
                    constellationOnDemandConsentV2ChimeraActivity = this;
                    c = avph.c(this.o, constellationOnDemandConsentV2ChimeraActivity, ekvi.j(Integer.valueOf(this.p.d.a())), this.u, ektg.a, ekvi.j(this.p.b));
                } else {
                    constellationOnDemandConsentV2ChimeraActivity = this;
                    avph.d();
                    avqf avqfVar = constellationOnDemandConsentV2ChimeraActivity.o;
                    ekvi j2 = ekvi.j(Integer.valueOf(constellationOnDemandConsentV2ChimeraActivity.p.d.a()));
                    ekvi ekviVar = constellationOnDemandConsentV2ChimeraActivity.u;
                    ektg ektgVar = ektg.a;
                    c = avph.c(avqfVar, constellationOnDemandConsentV2ChimeraActivity, j2, ekviVar, ektgVar, ektgVar);
                }
                constellationOnDemandConsentV2ChimeraActivity.M.b(c);
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    @Override // defpackage.avow
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
        if (!fpdq.f() || (button = this.B) == null || button.isEnabled() || !z) {
            return;
        }
        this.B.setEnabled(true);
    }

    @Override // defpackage.avow
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
        if (fpdq.f()) {
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

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        k(0);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Context applicationContext = getApplicationContext();
        ekww ekwwVar = bsxv.a;
        bsxr.a(auio.CONSTELLATION_UI_ONDEMAND_CONSENT_V2);
        this.M = registerForActivityResult(new avpf(), new aby() { // from class: avfh
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ekvi ekviVar = (ekvi) obj;
                if (ekviVar.h()) {
                    final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity = ConstellationOnDemandConsentV2ChimeraActivity.this;
                    if (constellationOnDemandConsentV2ChimeraActivity.y != null) {
                        constellationOnDemandConsentV2ChimeraActivity.u = ekviVar;
                        constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: avfe
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
        this.I = new wfu(applicationContext);
        j.d("Parsing params and checking preconditions", new Object[0]);
        Intent intent = getIntent();
        auzw a = auzx.a();
        a.a = ekvi.i(intent.getStringExtra("account_name_key"));
        a.b = ekvk.b(intent.getStringExtra("consent_variant_key"));
        a.c = ekvk.b(intent.getStringExtra("consent_trigger_key"));
        a.e((avaa) avaa.e.getOrDefault(Integer.valueOf(intent.getIntExtra("theme_key", -1)), avaa.AUTOMATIC));
        a.d(intent.getBooleanExtra("override_consented_check_key", false));
        a.b(intent.getBooleanExtra("bypass_annoyance_check_key", false));
        a.c(intent.getLongExtra("consent_timeout_millis_key", 60000L));
        this.p = a.a();
        fgrc v = eqix.a.v();
        eqjy eqjyVar = eqjy.ON_DEMAND_CONSENT_V2;
        if (!v.b.L()) {
            v.U();
        }
        eqix eqixVar = (eqix) v.b;
        eqixVar.e = eqjyVar.a();
        eqixVar.b |= 1;
        String callingPackage = getCallingPackage();
        if (!v.b.L()) {
            v.U();
        }
        eqix eqixVar2 = (eqix) v.b;
        eqixVar2.b |= 2;
        eqixVar2.f = callingPackage;
        fgrc v2 = eqit.a.v();
        String str = this.p.b;
        if (!v2.b.L()) {
            v2.U();
        }
        fgri fgriVar = v2.b;
        eqit eqitVar = (eqit) fgriVar;
        str.getClass();
        eqitVar.b |= 16;
        eqitVar.g = str;
        String str2 = this.p.c;
        if (!fgriVar.L()) {
            v2.U();
        }
        fgri fgriVar2 = v2.b;
        eqit eqitVar2 = (eqit) fgriVar2;
        str2.getClass();
        eqitVar2.b |= 32;
        eqitVar2.h = str2;
        if (!fgriVar2.L()) {
            v2.U();
        }
        eqit eqitVar3 = (eqit) v2.b;
        eqitVar3.c = eqky.a(3);
        eqitVar3.b |= 1;
        if (!v.b.L()) {
            v.U();
        }
        eqix eqixVar3 = (eqix) v.b;
        eqit eqitVar4 = (eqit) v2.Q();
        eqitVar4.getClass();
        eqixVar3.h = eqitVar4;
        eqixVar3.b |= 8;
        this.q = (eqix) v.Q();
        if (!fpdq.i()) {
            k(1);
            return;
        }
        auzx auzxVar = this.p;
        if (auzxVar != null) {
            ekvi ekviVar = auzxVar.a;
            if ((!ekviVar.h() || !ekvk.c((String) ekviVar.c())) && !ekvk.c(auzxVar.b) && !ekvk.c(auzxVar.c) && auzxVar.d != avaa.UNKNOWN && auzxVar.g > 0) {
                if (!fpdq.a.lK().f().b.contains(getCallingPackage())) {
                    k(9);
                    return;
                }
                avpa.a(this);
                if (!avpa.b(this)) {
                    k(2);
                    return;
                }
                try {
                    avdl.b();
                    this.J = avdl.c(this, 3);
                    if (!this.p.f || !fpdq.a.lK().e().b.contains(getCallingPackage())) {
                        try {
                            if (this.J.a(fpdq.b()) >= fpdq.a.lK().c()) {
                                k(5);
                                return;
                            }
                        } catch (avqe e) {
                            j.g("Error accessing impressions", e, new Object[0]);
                            k(6);
                            return;
                        }
                    }
                    this.k.execute(new Runnable() { // from class: avfi
                        @Override // java.lang.Runnable
                        public final void run() {
                            ConstellationOnDemandConsentV2ChimeraActivity.j.d("Finding capable account for account picker", new Object[0]);
                            final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity = ConstellationOnDemandConsentV2ChimeraActivity.this;
                            if (fpdq.g()) {
                                avph.d();
                                avqf avqfVar = constellationOnDemandConsentV2ChimeraActivity.o;
                                auzx auzxVar2 = constellationOnDemandConsentV2ChimeraActivity.p;
                                constellationOnDemandConsentV2ChimeraActivity.u = avph.a(avqfVar, constellationOnDemandConsentV2ChimeraActivity, auzxVar2.a, ekvi.j(auzxVar2.b));
                            } else {
                                avph.d();
                                constellationOnDemandConsentV2ChimeraActivity.u = avph.a(constellationOnDemandConsentV2ChimeraActivity.o, constellationOnDemandConsentV2ChimeraActivity, constellationOnDemandConsentV2ChimeraActivity.p.a, ektg.a);
                            }
                            if (!constellationOnDemandConsentV2ChimeraActivity.u.h()) {
                                constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: avew
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity2 = ConstellationOnDemandConsentV2ChimeraActivity.this;
                                        constellationOnDemandConsentV2ChimeraActivity2.k(true != constellationOnDemandConsentV2ChimeraActivity2.p.a.h() ? 11 : 10);
                                    }
                                });
                            } else if (constellationOnDemandConsentV2ChimeraActivity.p.e || avdl.b().a(constellationOnDemandConsentV2ChimeraActivity.getApplicationContext()).h(fmcm.CONSTELLATION) != fmer.CONSENTED) {
                                constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: avey
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        avow avowVar;
                                        avow avowVar2;
                                        ConstellationOnDemandConsentV2ChimeraActivity.j.d("Loading content", new Object[0]);
                                        final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity2 = ConstellationOnDemandConsentV2ChimeraActivity.this;
                                        avpz a2 = avpz.a(constellationOnDemandConsentV2ChimeraActivity2);
                                        eqix eqixVar4 = constellationOnDemandConsentV2ChimeraActivity2.q;
                                        fgrc fgrcVar = (fgrc) eqixVar4.iQ(5, null);
                                        fgrcVar.X(eqixVar4);
                                        if (!fgrcVar.b.L()) {
                                            fgrcVar.U();
                                        }
                                        UUID uuid = constellationOnDemandConsentV2ChimeraActivity2.n;
                                        eqix eqixVar5 = (eqix) fgrcVar.b;
                                        eqix eqixVar6 = eqix.a;
                                        eqixVar5.d = Integer.valueOf(eqka.a(14));
                                        eqixVar5.c = 4;
                                        a2.v(uuid, (eqix) fgrcVar.Q());
                                        fpdq fpdqVar = fpdq.a;
                                        if (fpdqVar.lK().p()) {
                                            constellationOnDemandConsentV2ChimeraActivity2.setContentView(R.layout.odcv2_stacked_buttons);
                                        } else {
                                            constellationOnDemandConsentV2ChimeraActivity2.setContentView(R.layout.odcv2);
                                        }
                                        if (Build.VERSION.SDK_INT != 26) {
                                            constellationOnDemandConsentV2ChimeraActivity2.setRequestedOrientation(1);
                                        }
                                        if (constellationOnDemandConsentV2ChimeraActivity2.p.d == avaa.DARK || (constellationOnDemandConsentV2ChimeraActivity2.p.d == avaa.AUTOMATIC && (constellationOnDemandConsentV2ChimeraActivity2.getResources().getConfiguration().uiMode & 48) == 32)) {
                                            constellationOnDemandConsentV2ChimeraActivity2.t = true;
                                            constellationOnDemandConsentV2ChimeraActivity2.hS().q(2);
                                        } else {
                                            constellationOnDemandConsentV2ChimeraActivity2.hS().q(1);
                                        }
                                        constellationOnDemandConsentV2ChimeraActivity2.E = BottomSheetBehavior.v(constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.drawer_scroll_view));
                                        constellationOnDemandConsentV2ChimeraActivity2.E.G(fpdq.c() == -1 ? -1 : (int) (fpdq.c() * constellationOnDemandConsentV2ChimeraActivity2.getResources().getDisplayMetrics().density), false);
                                        constellationOnDemandConsentV2ChimeraActivity2.E.w(new avfo(constellationOnDemandConsentV2ChimeraActivity2));
                                        constellationOnDemandConsentV2ChimeraActivity2.v = (ImageView) constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.drawer_handler);
                                        constellationOnDemandConsentV2ChimeraActivity2.w = constellationOnDemandConsentV2ChimeraActivity2.findViewById(R.id.drawer_handler_container);
                                        constellationOnDemandConsentV2ChimeraActivity2.w.setOnClickListener(new View.OnClickListener() { // from class: avfa
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
                                        constellationOnDemandConsentV2ChimeraActivity2.C.setWebViewClient(new avfp(constellationOnDemandConsentV2ChimeraActivity2));
                                        constellationOnDemandConsentV2ChimeraActivity2.C.getSettings().setJavaScriptEnabled(true);
                                        WebView webView = constellationOnDemandConsentV2ChimeraActivity2.C;
                                        Uri.Builder appendQueryParameter = Uri.parse(fpdq.e()).buildUpon().appendQueryParameter("hl", constellationOnDemandConsentV2ChimeraActivity2.l).appendQueryParameter("variantId", constellationOnDemandConsentV2ChimeraActivity2.p.b).appendQueryParameter("trigger", constellationOnDemandConsentV2ChimeraActivity2.p.c);
                                        if (constellationOnDemandConsentV2ChimeraActivity2.t) {
                                            appendQueryParameter.appendQueryParameter("darkMode", "true");
                                        }
                                        webView.loadUrl(appendQueryParameter.build().toString());
                                        constellationOnDemandConsentV2ChimeraActivity2.A.setOnClickListener(new View.OnClickListener() { // from class: avfb
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                ConstellationOnDemandConsentV2ChimeraActivity.j.d("User granted consent", new Object[0]);
                                                final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity3 = ConstellationOnDemandConsentV2ChimeraActivity.this;
                                                constellationOnDemandConsentV2ChimeraActivity3.k.execute(new Runnable() { // from class: avfn
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ConstellationOnDemandConsentV2ChimeraActivity.this.p(true);
                                                    }
                                                });
                                            }
                                        });
                                        constellationOnDemandConsentV2ChimeraActivity2.B.setOnClickListener(new View.OnClickListener() { // from class: avfc
                                            @Override // android.view.View.OnClickListener
                                            public final void onClick(View view) {
                                                ConstellationOnDemandConsentV2ChimeraActivity.j.d("User denied consent", new Object[0]);
                                                final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity3 = ConstellationOnDemandConsentV2ChimeraActivity.this;
                                                constellationOnDemandConsentV2ChimeraActivity3.k.execute(new Runnable() { // from class: avfm
                                                    @Override // java.lang.Runnable
                                                    public final void run() {
                                                        ConstellationOnDemandConsentV2ChimeraActivity.this.p(false);
                                                    }
                                                });
                                            }
                                        });
                                        constellationOnDemandConsentV2ChimeraActivity2.y.b(new Runnable() { // from class: avfd
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                final ConstellationOnDemandConsentV2ChimeraActivity constellationOnDemandConsentV2ChimeraActivity3 = ConstellationOnDemandConsentV2ChimeraActivity.this;
                                                constellationOnDemandConsentV2ChimeraActivity3.k.execute(new Runnable() { // from class: avez
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
                                        if (consentScrollView.j.h() && (avowVar2 = consentScrollView.i) != null) {
                                            avowVar2.n(((Boolean) consentScrollView.j.c()).booleanValue());
                                            consentScrollView.j = ektg.a;
                                        }
                                        if (consentScrollView.k.h() && (avowVar = consentScrollView.i) != null) {
                                            avowVar.o(((Boolean) consentScrollView.k.c()).booleanValue());
                                            consentScrollView.k = ektg.a;
                                        }
                                        constellationOnDemandConsentV2ChimeraActivity2.A.setEnabled(false);
                                        constellationOnDemandConsentV2ChimeraActivity2.B.setEnabled(true);
                                        if (fpdq.f()) {
                                            constellationOnDemandConsentV2ChimeraActivity2.B.setEnabled(false);
                                        }
                                        if (fpdqVar.lK().i()) {
                                            constellationOnDemandConsentV2ChimeraActivity2.E.H(3);
                                            constellationOnDemandConsentV2ChimeraActivity2.v.setBackgroundResource(R.drawable.odcv2_caret);
                                        }
                                    }
                                });
                            } else {
                                constellationOnDemandConsentV2ChimeraActivity.runOnUiThread(new Runnable() { // from class: avex
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ConstellationOnDemandConsentV2ChimeraActivity.this.k(3);
                                    }
                                });
                            }
                        }
                    });
                    return;
                } catch (avqa unused) {
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
        runOnUiThread(new Runnable() { // from class: avev
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
        avpz a = avpz.a(this);
        eqix eqixVar = this.q;
        fgrc fgrcVar = (fgrc) eqixVar.iQ(5, null);
        fgrcVar.X(eqixVar);
        if (!fgrcVar.b.L()) {
            fgrcVar.U();
        }
        UUID uuid = this.n;
        eqix eqixVar2 = (eqix) fgrcVar.b;
        eqix eqixVar3 = eqix.a;
        eqixVar2.d = Integer.valueOf(eqka.a(21));
        eqixVar2.c = 4;
        a.v(uuid, (eqix) fgrcVar.Q());
        if (fpdq.j()) {
            q(-1, z);
        }
        a(z);
        try {
            CountDownLatch countDownLatch = this.m;
            countDownLatch.await(this.p.g, TimeUnit.MILLISECONDS);
            if (countDownLatch.getCount() > 0) {
                runOnUiThread(new Runnable() { // from class: avff
                    @Override // java.lang.Runnable
                    public final void run() {
                        ConstellationOnDemandConsentV2ChimeraActivity.this.l(13, ekvi.j(Boolean.valueOf(z)));
                    }
                });
            }
        } catch (InterruptedException unused) {
            runOnUiThread(new Runnable() { // from class: avfg
                @Override // java.lang.Runnable
                public final void run() {
                    ConstellationOnDemandConsentV2ChimeraActivity.this.l(14, ekvi.j(Boolean.valueOf(z)));
                }
            });
        }
    }
}

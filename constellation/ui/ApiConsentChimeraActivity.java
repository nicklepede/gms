package com.google.android.gms.constellation.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.arxo;
import defpackage.aseu;
import defpackage.asmb;
import defpackage.asmf;
import defpackage.asqh;
import defpackage.asvp;
import defpackage.aszy;
import defpackage.ataa;
import defpackage.atab;
import defpackage.atad;
import defpackage.ataf;
import defpackage.atai;
import defpackage.ataj;
import defpackage.atkx;
import defpackage.atlf;
import defpackage.atlw;
import defpackage.atmc;
import defpackage.atmg;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.byhr;
import defpackage.eijj;
import defpackage.eijr;
import defpackage.enwd;
import defpackage.fjou;
import defpackage.fmlc;
import defpackage.qfp;
import defpackage.ujv;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ApiConsentChimeraActivity extends qfp {
    public static final arxo j = atmg.a("jibe_terms_of_services");
    public View A;
    public int B;
    public String C;
    public String D;
    public String E;
    public ujv R;
    private String T;
    private View U;
    private Button V;
    private Button W;
    public Context q;
    public String r;
    public atmc s;
    public UUID t;
    public atlw w;
    public atlf x;
    public ProgressBar y;
    public WebView z;
    public final CountDownLatch k = new CountDownLatch(2);
    public final CountDownLatch l = new CountDownLatch(1);
    public final Handler m = new byhr();
    private final Executor S = new asmf(1, 9);
    public final asmb n = new asmb(1, 9);
    public final Intent o = new Intent();
    public final Object p = new Object();
    public enwd u = enwd.TOS_CONSENT_EVENT_CANCELED;
    public boolean v = false;
    private boolean X = false;
    private boolean Y = false;
    public boolean F = false;
    public boolean G = false;
    private boolean Z = false;
    public boolean H = false;
    public boolean I = false;
    public boolean J = false;
    public boolean K = false;
    public boolean L = false;
    public boolean M = false;
    public boolean N = false;
    public boolean O = false;
    private long aa = 400;
    public long P = 200;
    public fjou Q = fjou.UNKNOWN;

    public final String a() {
        Uri.Builder buildUpon = Uri.parse(this.r).buildUpon();
        String languageTag = Locale.getDefault().toLanguageTag();
        this.C = languageTag;
        buildUpon.appendQueryParameter("locale", languageTag);
        buildUpon.appendQueryParameter("hl", this.C);
        if (this.Y) {
            this.D = "p_dark";
        } else {
            this.D = asqh.e() ? "p_light" : "o";
        }
        buildUpon.appendQueryParameter("theme", this.D);
        if (!TextUtils.isEmpty(this.T) && this.T.length() >= 6) {
            String substring = this.T.substring(0, 6);
            this.E = substring;
            buildUpon.appendQueryParameter("imsi_prefix", substring);
        }
        return buildUpon.build().toString();
    }

    public final void b(boolean z) {
        if (!c()) {
            synchronized (this.p) {
                this.u = enwd.TOS_CONSENT_EVENT_NO_NETWORK_AT_SET_CONSENT;
            }
            return;
        }
        this.y.setVisibility(0);
        try {
            this.S.execute(new atai(this, z));
        } catch (RejectedExecutionException e) {
            j.g("Couldn't start SetConsentTask in background", e, new Object[0]);
            synchronized (this.p) {
                this.u = enwd.TOS_CONSENT_EVENT_FAILED;
                finish();
            }
        }
    }

    protected final boolean c() {
        atkx.a(this);
        return atkx.b(this);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final void finish() {
        enwd enwdVar;
        synchronized (this.p) {
            if (this.v) {
                return;
            }
            int i = 1;
            this.v = true;
            if (fmlc.a.a().l()) {
                synchronized (this.p) {
                    enwd enwdVar2 = this.u;
                    if (enwdVar2 != enwd.TOS_CONSENT_EVENT_DISABLED && enwdVar2 != enwd.TOS_CONSENT_EVENT_WRONG_CALLER && enwdVar2 != enwd.TOS_CONSENT_EVENT_ANNOYING && enwdVar2 != enwd.TOS_CONSENT_EVENT_FAILED && enwdVar2 != enwd.TOS_CONSENT_EVENT_CONSENT_CHECK_TIMEOUT && (!this.I || this.l.getCount() == 0 || (enwdVar = this.u) == enwd.TOS_CONSENT_EVENT_NO_NETWORK || enwdVar == enwd.TOS_CONSENT_EVENT_INVALID_TOS_URL)) {
                        asvp.h();
                        Context context = this.q;
                        UUID uuid = this.t;
                        enwd enwdVar3 = this.u;
                        String callingPackage = getCallingPackage();
                        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.CACHE_EXTERNAL_CONSENT_ACTIVITY_STATE");
                        startIntent.putExtra("eventmanager.session_id", uuid.toString());
                        startIntent.putExtra("eventmanager.external_consent_activity_state", enwdVar3.a());
                        startIntent.putExtra("eventmanager.calling_package_key", callingPackage);
                        context.startService(startIntent);
                    }
                }
            }
            synchronized (this.p) {
                this.w.o(this.s, this.u);
                switch (this.u.ordinal()) {
                    case 77:
                    case 90:
                    case 98:
                        i = -1;
                        break;
                    case 78:
                    case 91:
                        break;
                    case 79:
                    case 87:
                    case 93:
                    case 94:
                    case 95:
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_PERSON_NAME /* 96 */:
                    default:
                        i = 0;
                        break;
                    case AndroidInputTypeSignal.TYPE_TEXT_VARIATION_LONG_MESSAGE /* 80 */:
                        i = 2;
                        break;
                    case 81:
                        i = 3;
                        break;
                    case 82:
                    case 89:
                        i = 6;
                        break;
                    case 83:
                    case 92:
                        i = 4;
                        break;
                    case 84:
                        i = 7;
                        break;
                    case 85:
                    case 88:
                        i = 8;
                        break;
                    case 86:
                        i = 5;
                        break;
                    case 97:
                        i = 9;
                        break;
                }
                setResult(i, this.o);
                super.finish();
            }
        }
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        WebView webView = this.z;
        if (webView == null || !webView.canGoBack()) {
            finish();
        } else {
            this.z.goBack();
        }
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.q = getApplicationContext();
        this.B = 0;
        fmlc fmlcVar = fmlc.a;
        this.X = fmlcVar.a().u();
        fmlc fmlcVar2 = fmlc.a;
        this.r = fmlcVar2.a().j();
        this.H = fmlcVar2.a().s();
        this.aa = fmlcVar2.a().g();
        this.P = fmlcVar2.a().f();
        this.I = fmlcVar2.a().n();
        this.J = fmlcVar2.a().r();
        this.K = fmlcVar2.a().q();
        this.O = getIntent().getBooleanExtra("unfreeze_user", false);
        eijr eijrVar = bqqe.a;
        bqqa.a(aseu.CONSTELLATION_UI_RCS_CONSENT);
        boolean booleanExtra = getIntent().getBooleanExtra("user_triggered", false);
        if (!fmlcVar.a().k() || (!booleanExtra && !this.O)) {
            this.L = fmlcVar2.a().o();
            this.M = fmlcVar2.a().m();
        }
        if (asqh.e()) {
            this.Y = getIntent().getBooleanExtra("dark_theme", false);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setSystemUiVisibility(256);
        if (this.Y) {
            getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.external_consent_context_color_dark_theme)));
        }
        this.w = atlw.a(this.q);
        this.t = UUID.randomUUID();
        atmc atmcVar = new atmc(this.t.toString());
        this.s = atmcVar;
        this.w.o(atmcVar, enwd.TOS_CONSENT_EVENT_INVOKED);
        synchronized (this.p) {
            if (fmlc.d()) {
                if (new HashSet(eijj.e(',').n(fmlcVar.a().i())).contains(getCallingPackage())) {
                    if (this.I || this.M) {
                        try {
                            this.S.execute(new ataa(this));
                        } catch (RejectedExecutionException e) {
                            j.g("Couldn't start cached consent check", e, new Object[0]);
                            synchronized (this.p) {
                                this.u = enwd.TOS_CONSENT_EVENT_FAILED;
                                finish();
                                return;
                            }
                        }
                    }
                    synchronized (this.p) {
                        if (!c()) {
                            this.u = enwd.TOS_CONSENT_EVENT_NO_NETWORK;
                        } else {
                            if (!TextUtils.isEmpty(this.r)) {
                                if (!this.X) {
                                    setContentView(R.layout.asterism_client_consent);
                                } else if (fmlc.a.a().w()) {
                                    setContentView(R.layout.asterism_client_consent_simplified);
                                } else {
                                    setContentView(R.layout.asterism_client_consent_centered);
                                }
                                this.R = new ujv(this.q);
                                this.y = (ProgressBar) findViewById(R.id.c11n_tos_progress_bar);
                                this.z = (WebView) findViewById(R.id.c11n_tos_webview);
                                this.U = findViewById(R.id.c11n_tos_container);
                                this.A = findViewById(R.id.c11n_buttons_container);
                                this.W = (Button) findViewById(R.id.c11n_tos_button_agree);
                                this.V = (Button) findViewById(R.id.c11n_tos_button_no_thanks);
                                if (this.Y) {
                                    GradientDrawable gradientDrawable = (GradientDrawable) this.U.getBackground();
                                    gradientDrawable.mutate();
                                    gradientDrawable.setColor(getResources().getColor(R.color.external_consent_background_color_dark_theme));
                                    ColorDrawable colorDrawable = (ColorDrawable) this.A.getBackground();
                                    colorDrawable.mutate();
                                    colorDrawable.setColor(getResources().getColor(R.color.external_consent_background_color_dark_theme));
                                    this.z.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.external_consent_background_color_dark_theme)));
                                    this.y.setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.external_consent_background_color_dark_theme)));
                                    if (this.X) {
                                        this.W.setTextColor(getResources().getColor(R.color.external_consent_centered_button_text_color_dark_theme));
                                        this.V.setTextColor(getResources().getColor(R.color.external_consent_buttonless_text_color_dark_theme));
                                    } else {
                                        findViewById(R.id.c11n_tos_button_divider_box).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.external_consent_background_color_dark_theme)));
                                        findViewById(R.id.c11n_tos_button_divider).setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.external_consent_button_divider_color_dark_theme)));
                                    }
                                }
                                this.z.getSettings().setJavaScriptEnabled(true);
                                this.z.setWebViewClient(new ataj(this));
                                this.T = getIntent().getStringExtra("IMSI");
                                this.A.setVisibility(4);
                                this.z.setVisibility(4);
                                this.y.setVisibility(8);
                                this.V.setOnClickListener(new atab(this, false));
                                this.W.setOnClickListener(new atab(this, true));
                                asvp.h();
                                asvp.a(this, this.t, new ataf(this, this.m));
                                return;
                            }
                            this.u = enwd.TOS_CONSENT_EVENT_INVALID_TOS_URL;
                        }
                        finish();
                        return;
                    }
                }
                this.u = enwd.TOS_CONSENT_EVENT_WRONG_CALLER;
            } else {
                this.u = enwd.TOS_CONSENT_EVENT_DISABLED;
            }
            finish();
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onDestroy() {
        this.n.shutdown();
        super.onDestroy();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onStart() {
        super.onStart();
        if (!this.Z) {
            this.Z = true;
            try {
                this.S.execute(new atad(this));
            } catch (RejectedExecutionException e) {
                j.g("Couldn't start background task", e, new Object[0]);
                synchronized (this.p) {
                    this.u = enwd.TOS_CONSENT_EVENT_FAILED;
                    finish();
                }
            }
        }
        this.n.schedule(new aszy(this, this.m), this.aa, TimeUnit.MILLISECONDS);
        this.z.loadUrl(a());
    }
}

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
import defpackage.auad;
import defpackage.auio;
import defpackage.aupv;
import defpackage.aupz;
import defpackage.auub;
import defpackage.auzl;
import defpackage.aveb;
import defpackage.aved;
import defpackage.avee;
import defpackage.aveg;
import defpackage.avei;
import defpackage.avel;
import defpackage.avem;
import defpackage.avpa;
import defpackage.avpi;
import defpackage.avpz;
import defpackage.avqf;
import defpackage.avqj;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.caqj;
import defpackage.ekwo;
import defpackage.ekww;
import defpackage.eqjw;
import defpackage.fmer;
import defpackage.fpct;
import defpackage.ryt;
import defpackage.wfu;
import java.util.HashSet;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ApiConsentChimeraActivity extends ryt {
    public static final auad j = avqj.a("jibe_terms_of_services");
    public View A;
    public int B;
    public String C;
    public String D;
    public String E;
    public wfu R;
    private String T;
    private View U;
    private Button V;
    private Button W;
    public Context q;
    public String r;
    public avqf s;
    public UUID t;
    public avpz w;
    public avpi x;
    public ProgressBar y;
    public WebView z;
    public final CountDownLatch k = new CountDownLatch(2);
    public final CountDownLatch l = new CountDownLatch(1);
    public final Handler m = new caqj();
    private final Executor S = new aupz(1, 9);
    public final aupv n = new aupv(1, 9);
    public final Intent o = new Intent();
    public final Object p = new Object();
    public eqjw u = eqjw.TOS_CONSENT_EVENT_CANCELED;
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
    public fmer Q = fmer.UNKNOWN;

    public final String a() {
        Uri.Builder buildUpon = Uri.parse(this.r).buildUpon();
        String languageTag = Locale.getDefault().toLanguageTag();
        this.C = languageTag;
        buildUpon.appendQueryParameter("locale", languageTag);
        buildUpon.appendQueryParameter("hl", this.C);
        if (this.Y) {
            this.D = "p_dark";
        } else {
            this.D = auub.e() ? "p_light" : "o";
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
                this.u = eqjw.TOS_CONSENT_EVENT_NO_NETWORK_AT_SET_CONSENT;
            }
            return;
        }
        this.y.setVisibility(0);
        try {
            this.S.execute(new avel(this, z));
        } catch (RejectedExecutionException e) {
            j.g("Couldn't start SetConsentTask in background", e, new Object[0]);
            synchronized (this.p) {
                this.u = eqjw.TOS_CONSENT_EVENT_FAILED;
                finish();
            }
        }
    }

    protected final boolean c() {
        avpa.a(this);
        return avpa.b(this);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final void finish() {
        eqjw eqjwVar;
        synchronized (this.p) {
            if (this.v) {
                return;
            }
            int i = 1;
            this.v = true;
            if (fpct.a.lK().l()) {
                synchronized (this.p) {
                    eqjw eqjwVar2 = this.u;
                    if (eqjwVar2 != eqjw.TOS_CONSENT_EVENT_DISABLED && eqjwVar2 != eqjw.TOS_CONSENT_EVENT_WRONG_CALLER && eqjwVar2 != eqjw.TOS_CONSENT_EVENT_ANNOYING && eqjwVar2 != eqjw.TOS_CONSENT_EVENT_FAILED && eqjwVar2 != eqjw.TOS_CONSENT_EVENT_CONSENT_CHECK_TIMEOUT && (!this.I || this.l.getCount() == 0 || (eqjwVar = this.u) == eqjw.TOS_CONSENT_EVENT_NO_NETWORK || eqjwVar == eqjw.TOS_CONSENT_EVENT_INVALID_TOS_URL)) {
                        auzl.h();
                        Context context = this.q;
                        UUID uuid = this.t;
                        eqjw eqjwVar3 = this.u;
                        String callingPackage = getCallingPackage();
                        Intent startIntent = IntentOperation.getStartIntent(context, "com.google.android.gms.constellation.EventManager", "com.google.android.gms.constellation.eventmanager.CACHE_EXTERNAL_CONSENT_ACTIVITY_STATE");
                        startIntent.putExtra("eventmanager.session_id", uuid.toString());
                        startIntent.putExtra("eventmanager.external_consent_activity_state", eqjwVar3.a());
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

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        WebView webView = this.z;
        if (webView == null || !webView.canGoBack()) {
            finish();
        } else {
            this.z.goBack();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.q = getApplicationContext();
        this.B = 0;
        fpct fpctVar = fpct.a;
        this.X = fpctVar.lK().u();
        this.r = fpctVar.lK().j();
        this.H = fpctVar.lK().s();
        this.aa = fpctVar.lK().g();
        this.P = fpctVar.lK().f();
        this.I = fpctVar.lK().n();
        this.J = fpctVar.lK().r();
        this.K = fpctVar.lK().q();
        this.O = getIntent().getBooleanExtra("unfreeze_user", false);
        ekww ekwwVar = bsxv.a;
        bsxr.a(auio.CONSTELLATION_UI_RCS_CONSENT);
        boolean booleanExtra = getIntent().getBooleanExtra("user_triggered", false);
        if (!fpctVar.lK().k() || (!booleanExtra && !this.O)) {
            this.L = fpctVar.lK().o();
            this.M = fpctVar.lK().m();
        }
        if (auub.e()) {
            this.Y = getIntent().getBooleanExtra("dark_theme", false);
        }
        requestWindowFeature(1);
        getWindow().getDecorView().setSystemUiVisibility(256);
        if (this.Y) {
            getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.external_consent_context_color_dark_theme)));
        }
        this.w = avpz.a(this.q);
        this.t = UUID.randomUUID();
        avqf avqfVar = new avqf(this.t.toString());
        this.s = avqfVar;
        this.w.o(avqfVar, eqjw.TOS_CONSENT_EVENT_INVOKED);
        synchronized (this.p) {
            if (fpct.d()) {
                if (new HashSet(ekwo.e(',').n(fpctVar.lK().i())).contains(getCallingPackage())) {
                    if (this.I || this.M) {
                        try {
                            this.S.execute(new aved(this));
                        } catch (RejectedExecutionException e) {
                            j.g("Couldn't start cached consent check", e, new Object[0]);
                            synchronized (this.p) {
                                this.u = eqjw.TOS_CONSENT_EVENT_FAILED;
                                finish();
                                return;
                            }
                        }
                    }
                    synchronized (this.p) {
                        if (!c()) {
                            this.u = eqjw.TOS_CONSENT_EVENT_NO_NETWORK;
                        } else {
                            if (!TextUtils.isEmpty(this.r)) {
                                if (!this.X) {
                                    setContentView(R.layout.asterism_client_consent);
                                } else if (fpct.a.lK().w()) {
                                    setContentView(R.layout.asterism_client_consent_simplified);
                                } else {
                                    setContentView(R.layout.asterism_client_consent_centered);
                                }
                                this.R = new wfu(this.q);
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
                                this.z.setWebViewClient(new avem(this));
                                this.T = getIntent().getStringExtra("IMSI");
                                this.A.setVisibility(4);
                                this.z.setVisibility(4);
                                this.y.setVisibility(8);
                                this.V.setOnClickListener(new avee(this, false));
                                this.W.setOnClickListener(new avee(this, true));
                                auzl.h();
                                auzl.a(this, this.t, new avei(this, this.m));
                                return;
                            }
                            this.u = eqjw.TOS_CONSENT_EVENT_INVALID_TOS_URL;
                        }
                        finish();
                        return;
                    }
                }
                this.u = eqjw.TOS_CONSENT_EVENT_WRONG_CALLER;
            } else {
                this.u = eqjw.TOS_CONSENT_EVENT_DISABLED;
            }
            finish();
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        this.n.shutdown();
        super.onDestroy();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onStart() {
        super.onStart();
        if (!this.Z) {
            this.Z = true;
            try {
                this.S.execute(new aveg(this));
            } catch (RejectedExecutionException e) {
                j.g("Couldn't start background task", e, new Object[0]);
                synchronized (this.p) {
                    this.u = eqjw.TOS_CONSENT_EVENT_FAILED;
                    finish();
                }
            }
        }
        this.n.schedule(new aveb(this, this.m), this.aa, TimeUnit.MILLISECONDS);
        this.z.loadUrl(a());
    }
}

package com.google.android.gms.credential.manager;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.activity.result.ActivityResult;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.gms.R;
import com.google.android.gms.credential.manager.PasswordManagerChimeraActivity;
import com.google.android.gms.credential.manager.screens.HomeScreenNavigationBundle$StartScreen;
import defpackage.aby;
import defpackage.aca;
import defpackage.acr;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.avxw;
import defpackage.avxz;
import defpackage.avyf;
import defpackage.axhz;
import defpackage.axie;
import defpackage.axif;
import defpackage.axlk;
import defpackage.axoh;
import defpackage.axov;
import defpackage.axpu;
import defpackage.axqj;
import defpackage.axrc;
import defpackage.axrd;
import defpackage.ayky;
import defpackage.ayla;
import defpackage.azcb;
import defpackage.azcc;
import defpackage.azcv;
import defpackage.elhz;
import defpackage.eluo;
import defpackage.fpza;
import defpackage.fxqz;
import defpackage.fxxm;
import defpackage.fycr;
import defpackage.irj;
import defpackage.iuz;
import defpackage.ivv;
import defpackage.iwe;
import defpackage.jvm;
import defpackage.jvr;
import defpackage.jvs;
import defpackage.jxl;
import defpackage.jxw;
import j$.util.Objects;
import java.io.Serializable;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class PasswordManagerChimeraActivity extends avxz {
    public static final ausn j = ausn.b("PasswordManagerActivity", auid.CREDENTIAL_MANAGER);
    public axpu k;
    public aca l;
    public axrd m;
    public avyf n;
    private axoh p;
    private ayla q;
    private axif r;

    static {
        elhz.K("PWMHomeScreenFragment", "PWMPickerScreenFragment");
    }

    public final void a(String str, Bundle bundle) {
        azcb azcbVar;
        avyf avyfVar = this.n;
        fxxm.f(str, "<set-?>");
        avyfVar.a = str;
        final jxw jxwVar = new jxw(this);
        Intent intent = getIntent();
        fxxm.f(intent, "intent");
        fxxm.f(intent, "intent");
        if (intent.hasExtra("pwm.DataFieldNames.startForTwoFields")) {
            azcbVar = azcb.b;
        } else {
            fxxm.f(intent, "intent");
            if (intent.hasExtra("pwm.DataFieldNames.detailsScreenAsStartScreen") && intent.hasExtra("pwm.DataFieldNames.deepLinkToSignonRealm") && intent.getBooleanExtra("pwm.DataFieldNames.detailsScreenAsStartScreen", false)) {
                azcbVar = azcb.c;
            } else {
                fxxm.f(intent, "intent");
                if (intent.hasExtra("pwm.DataFieldNames.deepLinkToPasswordCheckup")) {
                    azcbVar = azcb.d;
                } else {
                    fxxm.f(intent, "intent");
                    if (intent.hasExtra("pwm.DataFieldNames.deepLinkToPasskeyWizard")) {
                        azcbVar = azcb.f;
                    } else {
                        fxxm.f(intent, "intent");
                        azcbVar = intent.hasExtra("pwm.DataFieldNames.startAutomotiveActivity") ? azcb.e : azcb.a;
                    }
                }
            }
        }
        final axqj axqjVar = (axqj) jxwVar.a(axqj.class);
        Intent intent2 = getIntent();
        fxxm.f(intent2, "intent");
        String stringExtra = intent2.getStringExtra("utm_source");
        String stringExtra2 = intent2.getStringExtra("utm_medium");
        String stringExtra3 = intent2.getStringExtra("utm_campaign");
        azcc azccVar = (stringExtra == null && stringExtra2 == null && stringExtra3 == null) ? null : new azcc(stringExtra, stringExtra2, stringExtra3);
        if (azccVar != null) {
            fxxm.f(azcbVar, "startUpType");
            axhz axhzVar = axqjVar.a;
            fxxm.f(azcbVar, "startUpType");
            axhzVar.a(azcbVar);
            axhzVar.f = azccVar.a;
            axhzVar.g = azccVar.b;
            axhzVar.h = azccVar.c;
        } else {
            fxxm.f(azcbVar, "startUpType");
            axqjVar.a.a(azcbVar);
        }
        axoh axohVar = (axoh) jxwVar.a(axoh.class);
        this.p = axohVar;
        jvr jvrVar = axohVar.b;
        Objects.requireNonNull(axqjVar);
        jvrVar.g(this, new jvs() { // from class: avxm
            @Override // defpackage.jvs
            public final void a(Object obj) {
                axhz axhzVar2 = axqj.this.a;
                String str2 = (String) obj;
                if (axhzVar2.d || ekvk.c(str2)) {
                    return;
                }
                axhzVar2.c(euwz.PWM_SEARCH);
                axhzVar2.d = true;
            }
        });
        axpu axpuVar = (axpu) jxwVar.a(axpu.class);
        this.k = axpuVar;
        axpuVar.b.g(this, new jvs() { // from class: avxp
            @Override // defpackage.jvs
            public final void a(Object obj) {
                PasswordManagerChimeraActivity.this.l.b(new acj((PendingIntent) obj).a());
            }
        });
        if (fpza.d()) {
            ((axlk) jxwVar.a(axlk.class)).b.g(this, new jvs() { // from class: avxq
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity.this.m.b(axrc.ERROR_SCREEN);
                }
            });
        } else {
            ((axlk) jxwVar.a(axlk.class)).a.g(this, new jvs() { // from class: avxr
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        PasswordManagerChimeraActivity.this.m.b(axrc.ERROR_SCREEN);
                    }
                }
            });
        }
        if (fpza.d()) {
            axov axovVar = (axov) jxwVar.a(axov.class);
            axovVar.b(azcbVar);
            axovVar.r.g(this, new jvs() { // from class: avxo
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    ((eluo) ((eluo) PasswordManagerChimeraActivity.j.h()).ai((char) 3327)).x("The passwords manager could not load the required data on startup and therefore exciting.");
                    PasswordManagerChimeraActivity.this.finish();
                }
            });
            if (bundle == null) {
                this.m.d(axrc.LOADING_SCREEN, true, irj.a(new fxqz("deep_link_to_details_screen_sign_on_realm_tag", getIntent().getStringExtra("pwm.DataFieldNames.deepLinkToSignonRealm"))));
            }
        } else {
            axov axovVar2 = (axov) jxwVar.a(axov.class);
            axovVar2.b(azcbVar);
            final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.main_swipe_refresh_layout);
            jvm jvmVar = axovVar2.l;
            Objects.requireNonNull(swipeRefreshLayout);
            jvmVar.g(this, new jvs() { // from class: avxs
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    SwipeRefreshLayout.this.k(((Boolean) obj).booleanValue());
                }
            });
            axovVar2.m.g(this, new jvs() { // from class: avxt
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity.this.l(axrc.HOME_SCREEN, aypo.a(HomeScreenNavigationBundle$StartScreen.a));
                }
            });
            axovVar2.n.g(this, new jvs() { // from class: avxu
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity.this.k(axrc.PICKER_SCREEN);
                }
            });
            axovVar2.o.g(this, new jvs() { // from class: avxv
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity passwordManagerChimeraActivity = PasswordManagerChimeraActivity.this;
                    if (((axjz) jxwVar.a(axjz.class)).c(passwordManagerChimeraActivity.getIntent().getStringExtra("pwm.DataFieldNames.deepLinkToSignonRealm"))) {
                        passwordManagerChimeraActivity.l(axrc.REAUTH_SCREEN, ayka.a(axrc.DETAIL_SCREEN, aynd.a(false)));
                        return;
                    }
                    ((eluo) ((eluo) PasswordManagerChimeraActivity.j.h()).ai((char) 3329)).x("Unable to navigate to details screen, finish current activity.");
                    passwordManagerChimeraActivity.setResult(0);
                    passwordManagerChimeraActivity.finish();
                }
            });
            axovVar2.p.g(this, new jvs() { // from class: avxi
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity.this.l(axrc.HOME_SCREEN, aypo.a(HomeScreenNavigationBundle$StartScreen.b));
                }
            });
            axovVar2.r.g(this, new jvs() { // from class: avxj
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    ((eluo) ((eluo) PasswordManagerChimeraActivity.j.h()).ai((char) 3328)).x("StartupViewModel requires to finish current activity.");
                    PasswordManagerChimeraActivity.this.finish();
                }
            });
            axovVar2.q.g(this, new jvs() { // from class: avxk
                @Override // defpackage.jvs
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity.this.k(axrc.PASSKEY_WIZARD_SCREEN);
                }
            });
        }
        this.q = (ayla) jxwVar.a(ayla.class);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ayky aykyVar = this.q.a;
        if (aykyVar.b()) {
            aykyVar.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void k(axrc axrcVar) {
        this.m.c(axrcVar, true);
    }

    public final void l(axrc axrcVar, Bundle bundle) {
        this.m.d(axrcVar, true, bundle);
    }

    @Override // defpackage.avxz, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(final Bundle bundle) {
        LinearLayout linearLayout;
        super.onCreate(bundle);
        setTheme(R.style.PwmAppTheme);
        if (fpza.d()) {
            setContentView(R.layout.pwm_activity);
        } else {
            setContentView(R.layout.pwm_activity_old);
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.main_swipe_refresh_layout);
            swipeRefreshLayout.setEnabled(false);
            azcv.b(swipeRefreshLayout);
        }
        if (new Intent("android.app.action.SET_NEW_PASSWORD").resolveActivity(getPackageManager()) == null) {
            ((eluo) ((eluo) j.h()).ai((char) 3331)).x("Need to start password manager in browser, finish current activity, launch password manager in browser.");
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://passwords.google.com")));
            finish();
            return;
        }
        this.l = registerForActivityResult(new acr(), new aby() { // from class: avxn
            @Override // defpackage.aby
            public final void jF(Object obj) {
                ekvi ekviVar;
                ActivityResult activityResult = (ActivityResult) obj;
                int i = activityResult.a;
                axpu axpuVar = PasswordManagerChimeraActivity.this.k;
                if (i != 0) {
                    ekviVar = ektg.a;
                } else {
                    Intent intent = activityResult.b;
                    if (intent == null || !"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intent.getAction())) {
                        ekviVar = ektg.a;
                    } else {
                        Serializable serializableExtra = intent.getSerializableExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION");
                        ekviVar = !(serializableExtra instanceof IntentSender.SendIntentException) ? ektg.a : ekvi.j((IntentSender.SendIntentException) serializableExtra);
                    }
                }
                axhd axhdVar = axpuVar.a;
                dhma dhmaVar = axhdVar.b;
                if (dhmaVar == null) {
                    ((eluo) axhd.a.j()).x("Could not report back result of successful resolution.");
                    return;
                }
                if (i == -1) {
                    dhmaVar.b(null);
                } else if (ekviVar.h()) {
                    dhmaVar.a(new axhc((Throwable) ekviVar.c()));
                } else {
                    dhmaVar.a(new axhc());
                }
                axhdVar.b = null;
            }
        });
        getSupportFragmentManager().q(new avxw(this));
        if (fpza.a.lK().e() && fpza.d() && (linearLayout = (LinearLayout) findViewById(R.id.main_container)) != null) {
            iuz iuzVar = new iuz() { // from class: avxl
                @Override // defpackage.iuz
                public final ixt eB(View view, ixt ixtVar) {
                    ausn ausnVar = PasswordManagerChimeraActivity.j;
                    ioo f = ixtVar.f(647);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.leftMargin = f.b;
                    marginLayoutParams.topMargin = f.c;
                    marginLayoutParams.rightMargin = f.d;
                    marginLayoutParams.bottomMargin = f.e;
                    view.setLayoutParams(marginLayoutParams);
                    return ixt.a;
                }
            };
            int[] iArr = iwe.a;
            ivv.k(linearLayout, iuzVar);
        }
        axif axifVar = (axif) new jxw(this).a(axif.class);
        this.r = axifVar;
        String str = (String) axifVar.a.d("account_name_key");
        if (str != null) {
            a(str, bundle);
            return;
        }
        axif axifVar2 = this.r;
        String stringExtra = getIntent().getStringExtra("pwm.DataFieldNames.accountName");
        List h = auqx.h(this, getPackageName());
        if (!axifVar2.b.getAndSet(true)) {
            fycr.b(jxl.a(axifVar2), null, null, new axie(axifVar2, stringExtra, h, null), 3);
        }
        this.r.d.g(this, new jvs() { // from class: avxh
            @Override // defpackage.jvs
            public final void a(Object obj) {
                PasswordManagerChimeraActivity.this.a((String) obj, bundle);
            }
        });
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ((eluo) ((eluo) j.h()).ai((char) 3330)).x("New intent received, finish current activity, launch activity for the new intent.");
        startActivity(intent);
        finish();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        requestVisibleBehind(true);
    }
}

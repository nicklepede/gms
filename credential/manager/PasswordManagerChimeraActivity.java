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
import defpackage.abt;
import defpackage.abv;
import defpackage.acm;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.attt;
import defpackage.attw;
import defpackage.atuc;
import defpackage.avea;
import defpackage.avef;
import defpackage.aveg;
import defpackage.avhl;
import defpackage.avki;
import defpackage.avkw;
import defpackage.avlv;
import defpackage.avmj;
import defpackage.avnc;
import defpackage.avnd;
import defpackage.awgy;
import defpackage.awha;
import defpackage.awyb;
import defpackage.awyc;
import defpackage.awyv;
import defpackage.eiuu;
import defpackage.ejhf;
import defpackage.fnha;
import defpackage.fuvb;
import defpackage.fvbo;
import defpackage.fvgt;
import defpackage.ipt;
import defpackage.itj;
import defpackage.iuf;
import defpackage.iuo;
import defpackage.jox;
import defpackage.jpc;
import defpackage.jpd;
import defpackage.jqw;
import defpackage.jrh;
import j$.util.Objects;
import java.io.Serializable;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class PasswordManagerChimeraActivity extends attw {
    public static final asot j = asot.b("PasswordManagerActivity", asej.CREDENTIAL_MANAGER);
    public avlv k;
    public abv l;
    public avnd m;
    public atuc n;
    private avki p;
    private awha q;
    private aveg r;

    static {
        eiuu.K("PWMHomeScreenFragment", "PWMPickerScreenFragment");
    }

    public final void a(String str, Bundle bundle) {
        awyb awybVar;
        atuc atucVar = this.n;
        fvbo.f(str, "<set-?>");
        atucVar.a = str;
        final jrh jrhVar = new jrh(this);
        Intent intent = getIntent();
        fvbo.f(intent, "intent");
        fvbo.f(intent, "intent");
        if (intent.hasExtra("pwm.DataFieldNames.startForTwoFields")) {
            awybVar = awyb.b;
        } else {
            fvbo.f(intent, "intent");
            if (intent.hasExtra("pwm.DataFieldNames.detailsScreenAsStartScreen") && intent.hasExtra("pwm.DataFieldNames.deepLinkToSignonRealm") && intent.getBooleanExtra("pwm.DataFieldNames.detailsScreenAsStartScreen", false)) {
                awybVar = awyb.c;
            } else {
                fvbo.f(intent, "intent");
                if (intent.hasExtra("pwm.DataFieldNames.deepLinkToPasswordCheckup")) {
                    awybVar = awyb.d;
                } else {
                    fvbo.f(intent, "intent");
                    if (intent.hasExtra("pwm.DataFieldNames.deepLinkToPasskeyWizard")) {
                        awybVar = awyb.f;
                    } else {
                        fvbo.f(intent, "intent");
                        awybVar = intent.hasExtra("pwm.DataFieldNames.startAutomotiveActivity") ? awyb.e : awyb.a;
                    }
                }
            }
        }
        final avmj avmjVar = (avmj) jrhVar.a(avmj.class);
        Intent intent2 = getIntent();
        fvbo.f(intent2, "intent");
        String stringExtra = intent2.getStringExtra("utm_source");
        String stringExtra2 = intent2.getStringExtra("utm_medium");
        String stringExtra3 = intent2.getStringExtra("utm_campaign");
        awyc awycVar = (stringExtra == null && stringExtra2 == null && stringExtra3 == null) ? null : new awyc(stringExtra, stringExtra2, stringExtra3);
        if (awycVar != null) {
            fvbo.f(awybVar, "startUpType");
            avea aveaVar = avmjVar.a;
            fvbo.f(awybVar, "startUpType");
            aveaVar.a(awybVar);
            aveaVar.f = awycVar.a;
            aveaVar.g = awycVar.b;
            aveaVar.h = awycVar.c;
        } else {
            fvbo.f(awybVar, "startUpType");
            avmjVar.a.a(awybVar);
        }
        avki avkiVar = (avki) jrhVar.a(avki.class);
        this.p = avkiVar;
        jpc jpcVar = avkiVar.b;
        Objects.requireNonNull(avmjVar);
        jpcVar.g(this, new jpd() { // from class: attj
            @Override // defpackage.jpd
            public final void a(Object obj) {
                avea aveaVar2 = avmj.this.a;
                String str2 = (String) obj;
                if (aveaVar2.d || eiif.c(str2)) {
                    return;
                }
                aveaVar2.c(eshk.PWM_SEARCH);
                aveaVar2.d = true;
            }
        });
        avlv avlvVar = (avlv) jrhVar.a(avlv.class);
        this.k = avlvVar;
        avlvVar.b.g(this, new jpd() { // from class: attm
            @Override // defpackage.jpd
            public final void a(Object obj) {
                PasswordManagerChimeraActivity.this.l.b(new ace((PendingIntent) obj).a());
            }
        });
        if (fnha.d()) {
            ((avhl) jrhVar.a(avhl.class)).b.g(this, new jpd() { // from class: attn
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity.this.m.b(avnc.ERROR_SCREEN);
                }
            });
        } else {
            ((avhl) jrhVar.a(avhl.class)).a.g(this, new jpd() { // from class: atto
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    if (((Boolean) obj).booleanValue()) {
                        PasswordManagerChimeraActivity.this.m.b(avnc.ERROR_SCREEN);
                    }
                }
            });
        }
        if (fnha.d()) {
            avkw avkwVar = (avkw) jrhVar.a(avkw.class);
            avkwVar.b(awybVar);
            avkwVar.r.g(this, new jpd() { // from class: attl
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    ((ejhf) ((ejhf) PasswordManagerChimeraActivity.j.h()).ah((char) 3323)).x("The passwords manager could not load the required data on startup and therefore exciting.");
                    PasswordManagerChimeraActivity.this.finish();
                }
            });
            if (bundle == null) {
                this.m.d(avnc.LOADING_SCREEN, true, ipt.a(new fuvb("deep_link_to_details_screen_sign_on_realm_tag", getIntent().getStringExtra("pwm.DataFieldNames.deepLinkToSignonRealm"))));
            }
        } else {
            avkw avkwVar2 = (avkw) jrhVar.a(avkw.class);
            avkwVar2.b(awybVar);
            final SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.main_swipe_refresh_layout);
            jox joxVar = avkwVar2.l;
            Objects.requireNonNull(swipeRefreshLayout);
            joxVar.g(this, new jpd() { // from class: attp
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    SwipeRefreshLayout.this.k(((Boolean) obj).booleanValue());
                }
            });
            avkwVar2.m.g(this, new jpd() { // from class: attq
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity.this.l(avnc.HOME_SCREEN, awlo.a(HomeScreenNavigationBundle$StartScreen.a));
                }
            });
            avkwVar2.n.g(this, new jpd() { // from class: attr
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity.this.k(avnc.PICKER_SCREEN);
                }
            });
            avkwVar2.o.g(this, new jpd() { // from class: atts
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity passwordManagerChimeraActivity = PasswordManagerChimeraActivity.this;
                    if (((avga) jrhVar.a(avga.class)).c(passwordManagerChimeraActivity.getIntent().getStringExtra("pwm.DataFieldNames.deepLinkToSignonRealm"))) {
                        passwordManagerChimeraActivity.l(avnc.REAUTH_SCREEN, awga.a(avnc.DETAIL_SCREEN, awjd.a(false)));
                        return;
                    }
                    ((ejhf) ((ejhf) PasswordManagerChimeraActivity.j.h()).ah((char) 3325)).x("Unable to navigate to details screen, finish current activity.");
                    passwordManagerChimeraActivity.setResult(0);
                    passwordManagerChimeraActivity.finish();
                }
            });
            avkwVar2.p.g(this, new jpd() { // from class: attf
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity.this.l(avnc.HOME_SCREEN, awlo.a(HomeScreenNavigationBundle$StartScreen.b));
                }
            });
            avkwVar2.r.g(this, new jpd() { // from class: attg
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    ((ejhf) ((ejhf) PasswordManagerChimeraActivity.j.h()).ah((char) 3324)).x("StartupViewModel requires to finish current activity.");
                    PasswordManagerChimeraActivity.this.finish();
                }
            });
            avkwVar2.q.g(this, new jpd() { // from class: atth
                @Override // defpackage.jpd
                public final void a(Object obj) {
                    PasswordManagerChimeraActivity.this.k(avnc.PASSKEY_WIZARD_SCREEN);
                }
            });
        }
        this.q = (awha) jrhVar.a(awha.class);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        awgy awgyVar = this.q.a;
        if (awgyVar.b()) {
            awgyVar.a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public final void k(avnc avncVar) {
        this.m.c(avncVar, true);
    }

    public final void l(avnc avncVar, Bundle bundle) {
        this.m.d(avncVar, true, bundle);
    }

    @Override // defpackage.attw, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(final Bundle bundle) {
        LinearLayout linearLayout;
        super.onCreate(bundle);
        setTheme(R.style.PwmAppTheme);
        if (fnha.d()) {
            setContentView(R.layout.pwm_activity);
        } else {
            setContentView(R.layout.pwm_activity_old);
            SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.main_swipe_refresh_layout);
            swipeRefreshLayout.setEnabled(false);
            awyv.b(swipeRefreshLayout);
        }
        if (new Intent("android.app.action.SET_NEW_PASSWORD").resolveActivity(getPackageManager()) == null) {
            ((ejhf) ((ejhf) j.h()).ah((char) 3327)).x("Need to start password manager in browser, finish current activity, launch password manager in browser.");
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://passwords.google.com")));
            finish();
            return;
        }
        this.l = registerForActivityResult(new acm(), new abt() { // from class: attk
            @Override // defpackage.abt
            public final void jq(Object obj) {
                eiid eiidVar;
                ActivityResult activityResult = (ActivityResult) obj;
                int i = activityResult.a;
                avlv avlvVar = PasswordManagerChimeraActivity.this.k;
                if (i != 0) {
                    eiidVar = eigb.a;
                } else {
                    Intent intent = activityResult.b;
                    if (intent == null || !"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(intent.getAction())) {
                        eiidVar = eigb.a;
                    } else {
                        Serializable serializableExtra = intent.getSerializableExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION");
                        eiidVar = !(serializableExtra instanceof IntentSender.SendIntentException) ? eigb.a : eiid.j((IntentSender.SendIntentException) serializableExtra);
                    }
                }
                avde avdeVar = avlvVar.a;
                dfau dfauVar = avdeVar.b;
                if (dfauVar == null) {
                    ((ejhf) avde.a.j()).x("Could not report back result of successful resolution.");
                    return;
                }
                if (i == -1) {
                    dfauVar.b(null);
                } else if (eiidVar.h()) {
                    dfauVar.a(new avdd((Throwable) eiidVar.c()));
                } else {
                    dfauVar.a(new avdd());
                }
                avdeVar.b = null;
            }
        });
        getSupportFragmentManager().q(new attt(this));
        if (fnha.a.a().e() && fnha.d() && (linearLayout = (LinearLayout) findViewById(R.id.main_container)) != null) {
            itj itjVar = new itj() { // from class: atti
                @Override // defpackage.itj
                public final iwd eB(View view, iwd iwdVar) {
                    asot asotVar = PasswordManagerChimeraActivity.j;
                    imx f = iwdVar.f(647);
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.leftMargin = f.b;
                    marginLayoutParams.topMargin = f.c;
                    marginLayoutParams.rightMargin = f.d;
                    marginLayoutParams.bottomMargin = f.e;
                    view.setLayoutParams(marginLayoutParams);
                    return iwd.a;
                }
            };
            int[] iArr = iuo.a;
            iuf.k(linearLayout, itjVar);
        }
        aveg avegVar = (aveg) new jrh(this).a(aveg.class);
        this.r = avegVar;
        String str = (String) avegVar.a.d("account_name_key");
        if (str != null) {
            a(str, bundle);
            return;
        }
        aveg avegVar2 = this.r;
        String stringExtra = getIntent().getStringExtra("pwm.DataFieldNames.accountName");
        List h = asnd.h(this, getPackageName());
        if (!avegVar2.b.getAndSet(true)) {
            fvgt.b(jqw.a(avegVar2), null, null, new avef(avegVar2, stringExtra, h, null), 3);
        }
        this.r.d.g(this, new jpd() { // from class: atte
            @Override // defpackage.jpd
            public final void a(Object obj) {
                PasswordManagerChimeraActivity.this.a((String) obj, bundle);
            }
        });
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        ((ejhf) ((ejhf) j.h()).ah((char) 3326)).x("New intent received, finish current activity, launch activity for the new intent.");
        startActivity(intent);
        finish();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        requestVisibleBehind(true);
    }
}

package com.google.android.gms.mobiledataplan.ui;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.google.android.gms.R;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.mobiledataplan.consent.ConsentAgreementText;
import com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity;
import defpackage.atzb;
import defpackage.atzs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bp;
import defpackage.cgls;
import defpackage.cglz;
import defpackage.cgow;
import defpackage.cgqg;
import defpackage.cgql;
import defpackage.cgqx;
import defpackage.cgqz;
import defpackage.cgru;
import defpackage.cgrx;
import defpackage.cgsc;
import defpackage.cgse;
import defpackage.cgsf;
import defpackage.cgsg;
import defpackage.cgtp;
import defpackage.cgur;
import defpackage.cgzh;
import defpackage.cgzi;
import defpackage.cgzp;
import defpackage.dg;
import defpackage.eluo;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fhvs;
import defpackage.fszt;
import defpackage.ftat;
import defpackage.ftax;
import defpackage.ftbz;
import defpackage.ftch;
import defpackage.ig;
import defpackage.ind;
import defpackage.iri;
import defpackage.jxw;
import defpackage.nsz;
import defpackage.ntf;
import defpackage.rxx;
import defpackage.ryt;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class MobileDataPlanDetailChimeraActivity extends rxx {
    public static final ausn j = ausn.b("MobileDataPlan", auid.MOBILE_DATA_PLAN);

    @Deprecated
    public Button k;

    @Deprecated
    public Button l;

    @Deprecated
    public ConsentWebView m;
    public cgzh o;
    public cgql q;
    public cgqx r;

    @Deprecated
    private ConsentAgreementText s;

    @Deprecated
    private boolean t = true;
    public boolean n = false;
    private final cgzi u = new cgzi();
    public int p = 0;

    public static void a(dg dgVar, ryt rytVar) {
        rytVar.getOnBackPressedDispatcher().b(dgVar, new cgse(rytVar));
    }

    public static void k(dg dgVar, ryt rytVar) {
        rytVar.getOnBackPressedDispatcher().b(dgVar, new cgsg(rytVar));
    }

    public static void l(ryt rytVar, Bundle bundle, String str) {
        nsz nszVar = (nsz) Optional.of(Integer.valueOf(bundle.getInt("success_action"))).map(new Function() { // from class: cgsb
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo479andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                ausn ausnVar = MobileDataPlanDetailChimeraActivity.j;
                return nsz.b(((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(nsz.SUCCESS_ACTION_TYPE_UNSPECIFIED);
        Optional ofNullable = Optional.ofNullable(bundle.getString("success_action_url"));
        Optional ofNullable2 = Optional.ofNullable(bundle.getString("success_action_playstore_id"));
        cgls.c().r(fhvs.ESIM_SUCCESS_ACTION, str, cgzh.c(bundle, "plan_segment_id"), cgzh.c(bundle, "plan_subsegment_id"), bundle.getLong("esim_carrier_id"));
        try {
            int ordinal = nszVar.ordinal();
            if (ordinal == 1) {
                q(rytVar);
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    ((eluo) j.j()).x("No success action available for eSIM flow!");
                    rytVar.finishAffinity();
                    return;
                } else if (ofNullable2.isPresent()) {
                    rytVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", (String) ofNullable2.get()).build()));
                    rytVar.finishAffinity();
                    return;
                }
            }
            if (ofNullable.isEmpty()) {
                ((eluo) j.j()).x("No success URL available for eSIM flow!");
            } else {
                rytVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) ofNullable.get())));
                rytVar.finishAffinity();
            }
        } catch (ActivityNotFoundException e) {
            ((eluo) ((eluo) j.j()).s(e)).x("Failed to perform eSIM success action!");
        }
    }

    public static void m(dg dgVar, ryt rytVar, Bundle bundle) {
        rytVar.getOnBackPressedDispatcher().b(dgVar, new cgsf(rytVar, bundle));
    }

    public static void q(final ryt rytVar) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            ((eluo) j.j()).x("eSIM tried to return to main UI on a different thread.");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.mobiledataplan.ui.SETTING");
        intent.addFlags(335577088);
        intent.setClassName(rytVar, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
        if (ftax.Q()) {
            ((eluo) j.h()).x("eSIM returning to main UI.");
            rytVar.startActivity(intent);
            rytVar.finishAffinity();
            return;
        }
        ind.b(rytVar, new TracingBroadcastReceiver(rytVar) { // from class: com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity.2
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jP(Context context, Intent intent2) {
                ausn ausnVar = MobileDataPlanDetailChimeraActivity.j;
                ((eluo) ausnVar.h()).B("Received eSIM package %s", intent2.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"));
                if (Objects.equals(intent2.getAction(), "com.google.android.gms.phenotype.COMMITTED") && Objects.equals(intent2.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.mobile_data_plan")) {
                    ((eluo) ausnVar.h()).B("Received phenotype update for eSIM activation, showing MDP: %s", Boolean.valueOf(ftax.Q()));
                    if (ftax.Q()) {
                        ((eluo) ausnVar.h()).x("eSIM returning to main UI.");
                        Intent intent3 = new Intent("com.google.android.gms.mobiledataplan.ui.SETTING");
                        intent3.addFlags(335577088);
                        ryt rytVar2 = rytVar;
                        intent3.setClassName(rytVar2, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
                        rytVar2.startActivity(intent3);
                        rytVar2.finishAffinity();
                    }
                }
            }
        }, new IntentFilter("com.google.android.gms.phenotype.COMMITTED"), 4);
        cgqz cgqzVar = new cgqz();
        Bundle bundle = new Bundle();
        bundle.putString("ui_option_key", "start_mpd");
        cgqzVar.setArguments(bundle);
        bp bpVar = new bp(rytVar.getSupportFragmentManager());
        bpVar.F(R.id.container, cgqzVar);
        bpVar.a();
        rytVar.getSupportFragmentManager().an();
    }

    public static void r(ryt rytVar, Bundle bundle) {
        rytVar.getSupportFragmentManager().au(null, 1);
        if (bundle.getBoolean("COMBINED_PLAN_OFFERS_PAGE")) {
            cgqx cgqxVar = new cgqx();
            bp bpVar = new bp(rytVar.getSupportFragmentManager());
            bpVar.F(R.id.container, cgqxVar);
            bpVar.a();
            return;
        }
        cgql cgqlVar = new cgql();
        bp bpVar2 = new bp(rytVar.getSupportFragmentManager());
        bpVar2.B();
        bpVar2.F(R.id.container, cgqlVar);
        bpVar2.d();
    }

    public final void n(boolean z) {
        if (TextUtils.isEmpty(this.s.d)) {
            this.k.setText(R.string.consent_agree_button_text);
        } else {
            this.k.setText(this.s.d);
        }
        this.k.setOnClickListener(new View.OnClickListener() { // from class: cgry
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity = MobileDataPlanDetailChimeraActivity.this;
                cgls.c().Q(30, mobileDataPlanDetailChimeraActivity.k.getText().toString(), cgur.f(view), fhvs.CLICK_CONSENT_AGREE, System.currentTimeMillis(), Integer.valueOf(mobileDataPlanDetailChimeraActivity.p));
                mobileDataPlanDetailChimeraActivity.o(true);
            }
        });
        boolean z2 = true;
        if (!z && (!this.m.canScrollVertically(-1) || !this.t)) {
            z2 = false;
        }
        cgls.c().Q(z2 ? 49 : 48, this.k.getText().toString(), cgur.f(this.m), z2 ? fhvs.CONSENT_BUTTON_CHANGED : fhvs.CONSENT_SHOWS_AGREE_ON_LOAD, System.currentTimeMillis(), Integer.valueOf(this.p));
    }

    public final void o(boolean z) {
        setResult(true != z ? 0 : -1);
        finish();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (ftbz.a.lK().z()) {
            int i = cgzp.a;
            int i2 = iri.a;
        }
        if (ftch.f()) {
            setContentView(R.layout.detail_activity);
            if (bundle != null) {
                return;
            }
            if (Objects.equals(getIntent().getAction(), "com.google.android.gms.mobiledataplan.ui.SETTINGS") || Objects.equals(getIntent().getAction(), "com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY")) {
                this.o = (cgzh) new jxw(this, this.u).a(cgzh.class);
                cgtp cgtpVar = new cgtp();
                cgtpVar.b = this;
                cgtpVar.c = getIntent();
                cgtpVar.ag = cgtpVar.c.getIntExtra("EventFlowId", cgls.a());
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.t(R.id.container, cgtpVar);
                bpVar.a();
            } else if (ftbz.m() && Objects.equals(getIntent().getAction(), "com.google.android.gms.mobiledataplan.ui.ESIM")) {
                this.o = (cgzh) new jxw(this, this.u).a(cgzh.class);
                p();
            } else {
                cgru cgruVar = new cgru(this, getIntent());
                bp bpVar2 = new bp(getSupportFragmentManager());
                bpVar2.t(R.id.container, cgruVar);
                bpVar2.a();
            }
            new cglz().m();
            return;
        }
        if (ftat.e()) {
            this.p = getIntent().getIntExtra("EventFlowId", cgls.a());
        }
        if (fszt.a.lK().j()) {
            Intent intent = getIntent();
            String stringExtra = intent == null ? null : intent.getStringExtra("ComeFrom");
            if (stringExtra == null) {
                ComponentName callingActivity = getCallingActivity();
                if (callingActivity != null) {
                    stringExtra = callingActivity.flattenToString();
                } else {
                    Uri referrer = getReferrer();
                    if (referrer != null) {
                        stringExtra = referrer.toString();
                    }
                }
                cgls.c().Q(39, stringExtra, "R.layout.consent_activity", fhvs.ENTER_CONSENT_UI_OTHERS, System.currentTimeMillis(), Integer.valueOf(this.p));
            } else if (stringExtra.equals("com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity")) {
                cgls.c().Q(38, stringExtra, "R.layout.consent_activity", fhvs.ENTER_CONSENT_UI_VIA_MDP, System.currentTimeMillis(), Integer.valueOf(this.p));
            } else {
                cgls.c().Q(39, stringExtra, "R.layout.consent_activity", fhvs.ENTER_CONSENT_UI_OTHERS, System.currentTimeMillis(), Integer.valueOf(this.p));
            }
        }
        setContentView(R.layout.consent_fragment);
        hO().h();
        this.k = (Button) findViewById(R.id.agree_button);
        this.l = (Button) findViewById(R.id.decline_button);
        this.m = (ConsentWebView) findViewById(R.id.consent_html_view);
        ConsentAgreementText consentAgreementText = (ConsentAgreementText) atzs.b(getIntent(), "AgreementText", ConsentAgreementText.CREATOR);
        this.s = consentAgreementText;
        if (consentAgreementText == null) {
            ((eluo) j.j()).x("MobileDataPlanDetailChimeraActivity receives null consent agreement text");
            setResult(0);
            finish();
        }
        this.m.b(this.s);
        this.m.b = new cgsc(this);
        if (TextUtils.isEmpty(this.s.f)) {
            this.t = false;
            n(false);
        } else {
            this.k.setText(this.s.f);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: cgrv
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity = MobileDataPlanDetailChimeraActivity.this;
                    cgls.c().Q(29, mobileDataPlanDetailChimeraActivity.k.getText().toString(), cgur.f(view), fhvs.CLICK_CONSENT_CONTINUE, System.currentTimeMillis(), Integer.valueOf(mobileDataPlanDetailChimeraActivity.p));
                    if (mobileDataPlanDetailChimeraActivity.m.pageDown(false)) {
                        return;
                    }
                    mobileDataPlanDetailChimeraActivity.n(true);
                }
            });
        }
        if (!TextUtils.isEmpty(this.s.e)) {
            this.l.setText(this.s.e);
        }
        this.l.setOnClickListener(new View.OnClickListener() { // from class: cgrw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity = MobileDataPlanDetailChimeraActivity.this;
                cgls.c().Q(28, mobileDataPlanDetailChimeraActivity.l.getText().toString(), cgur.f(view), fhvs.CLICK_CONSENT_DECLINE, System.currentTimeMillis(), Integer.valueOf(mobileDataPlanDetailChimeraActivity.p));
                mobileDataPlanDetailChimeraActivity.o(false);
            }
        });
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        ((eluo) j.h()).x("MobileDataPlanDetailChimeraActivity Destroy eSIM ");
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fe A[Catch: NullPointerException -> 0x02ef, TRY_LEAVE, TryCatch #0 {NullPointerException -> 0x02ef, blocks: (B:4:0x001c, B:19:0x0065, B:21:0x0092, B:22:0x0094, B:26:0x009e, B:29:0x00b5, B:31:0x00c8, B:33:0x00df, B:34:0x00e1, B:35:0x00e5, B:36:0x00e8, B:37:0x00f9, B:39:0x0106, B:40:0x010b, B:42:0x0109, B:43:0x00ed, B:44:0x00f0, B:45:0x00f3, B:46:0x00f6, B:47:0x010f, B:49:0x014e, B:50:0x0151, B:53:0x018d, B:55:0x01ba, B:56:0x01bc, B:60:0x01c6, B:62:0x01d9, B:63:0x01e7, B:65:0x01fa, B:67:0x01fe, B:76:0x02ae, B:79:0x02da, B:69:0x021a, B:71:0x0229, B:73:0x0238, B:75:0x02a9), top: B:3:0x001c, inners: #1 }] */
    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onNewIntent(android.content.Intent r11) {
        /*
            Method dump skipped, instructions count: 806
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity.onNewIntent(android.content.Intent):void");
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            cgls.c().Q(43, "consentActivity", null, fhvs.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), Integer.valueOf(this.p));
        }
    }

    public final void p() {
        if (ftbz.m()) {
            ig hO = hO();
            if (hO != null) {
                hO.s(false);
            }
            setTheme(R.style.Theme_MobileDataPlan_DefaultGoogleMaterial);
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.container, new cgqz());
            bpVar.a();
            getSupportFragmentManager().an();
            try {
                Bundle extras = getIntent().getExtras();
                atzb.s(extras);
                this.q = new cgql();
                String string = extras.getString("ESIM_SESSION_ID");
                atzb.s(string);
                String string2 = extras.getString("ESIM_SERVICE_HOST");
                atzb.s(string2);
                long j2 = extras.getLong("esim_carrier_id");
                atzb.w(j2);
                Optional ofNullable = Optional.ofNullable(extras.getBundle("esim_entry_tags"));
                this.o.h(string, string2, extras);
                this.o.j(fhvs.ESIM_CARRIER_INFO_REQUEST, 0L);
                final cgow r = this.o.r(false);
                String languageTag = cgzp.g(this).toLanguageTag();
                final cgrx cgrxVar = new cgrx(this, extras);
                final fgrc v = ntf.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fgri fgriVar = v.b;
                ((ntf) fgriVar).b = j2;
                if (!fgriVar.L()) {
                    v.U();
                }
                fgri fgriVar2 = v.b;
                ((ntf) fgriVar2).d = string;
                if (!fgriVar2.L()) {
                    v.U();
                }
                ntf ntfVar = (ntf) v.b;
                languageTag.getClass();
                ntfVar.c = languageTag;
                if (ofNullable.isPresent()) {
                    for (final String str : ((Bundle) ofNullable.get()).keySet()) {
                        Optional.ofNullable(((Bundle) ofNullable.get()).getString(str)).ifPresent(new Consumer() { // from class: cgoc
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void u(Object obj) {
                                String str2 = (String) obj;
                                int i = cgow.f;
                                fgrc v2 = ntj.a.v();
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                String str3 = str;
                                fgri fgriVar3 = v2.b;
                                str3.getClass();
                                ((ntj) fgriVar3).b = str3;
                                if (!fgriVar3.L()) {
                                    v2.U();
                                }
                                fgrc fgrcVar = fgrc.this;
                                ntj ntjVar = (ntj) v2.b;
                                str2.getClass();
                                ntjVar.c = str2;
                                if (!fgrcVar.b.L()) {
                                    fgrcVar.U();
                                }
                                ntf ntfVar2 = (ntf) fgrcVar.b;
                                ntj ntjVar2 = (ntj) v2.Q();
                                ntf ntfVar3 = ntf.a;
                                ntjVar2.getClass();
                                fgsa fgsaVar = ntfVar2.e;
                                if (!fgsaVar.c()) {
                                    ntfVar2.e = fgri.E(fgsaVar);
                                }
                                ntfVar2.e.add(ntjVar2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                }
                r.b.execute(new Runnable() { // from class: cgod
                    /* JADX WARN: Code restructure failed: missing block: B:105:0x0391, code lost:
                    
                        if (defpackage.cgqs.x(r6, r8).isEmpty() != false) goto L288;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e9, code lost:
                    
                        if (defpackage.cgzn.a() == false) goto L102;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x027d  */
                    @Override // java.lang.Runnable
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void run() {
                        /*
                            Method dump skipped, instructions count: 1528
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgod.run():void");
                    }
                });
            } catch (IllegalArgumentException | NullPointerException e) {
                ((eluo) ((eluo) j.j()).s(e)).x("No session id or carrier id passed into eSIM flow");
                cgqg.A(this, new Bundle(), fhvs.ESIM_START_ERROR, this.o.b);
            }
        }
    }
}

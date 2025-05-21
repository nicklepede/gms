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
import defpackage.arwm;
import defpackage.arxd;
import defpackage.asej;
import defpackage.asot;
import defpackage.bp;
import defpackage.cecl;
import defpackage.cecs;
import defpackage.cefp;
import defpackage.cegz;
import defpackage.cehe;
import defpackage.cehq;
import defpackage.cehs;
import defpackage.cein;
import defpackage.ceiq;
import defpackage.ceiv;
import defpackage.ceix;
import defpackage.ceiy;
import defpackage.ceiz;
import defpackage.ceki;
import defpackage.celk;
import defpackage.ceqa;
import defpackage.ceqb;
import defpackage.ceqi;
import defpackage.dg;
import defpackage.ejhf;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.ffgu;
import defpackage.fqgb;
import defpackage.fqhb;
import defpackage.fqhf;
import defpackage.fqih;
import defpackage.fqip;
import defpackage.ig;
import defpackage.iln;
import defpackage.ips;
import defpackage.jrh;
import defpackage.mar;
import defpackage.max;
import defpackage.qet;
import defpackage.qfp;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class MobileDataPlanDetailChimeraActivity extends qet {
    public static final asot j = asot.b("MobileDataPlan", asej.MOBILE_DATA_PLAN);

    @Deprecated
    public Button k;

    @Deprecated
    public Button l;

    @Deprecated
    public ConsentWebView m;
    public ceqa o;
    public cehe q;
    public cehq r;

    @Deprecated
    private ConsentAgreementText s;

    @Deprecated
    private boolean t = true;
    public boolean n = false;
    private final ceqb u = new ceqb();
    public int p = 0;

    public static void a(dg dgVar, qfp qfpVar) {
        qfpVar.getOnBackPressedDispatcher().b(dgVar, new ceix(qfpVar));
    }

    public static void k(dg dgVar, qfp qfpVar) {
        qfpVar.getOnBackPressedDispatcher().b(dgVar, new ceiz(qfpVar));
    }

    public static void l(qfp qfpVar, Bundle bundle, String str) {
        mar marVar = (mar) Optional.of(Integer.valueOf(bundle.getInt("success_action"))).map(new Function() { // from class: ceiu
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo464andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                asot asotVar = MobileDataPlanDetailChimeraActivity.j;
                return mar.b(((Integer) obj).intValue());
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).orElse(mar.SUCCESS_ACTION_TYPE_UNSPECIFIED);
        Optional ofNullable = Optional.ofNullable(bundle.getString("success_action_url"));
        Optional ofNullable2 = Optional.ofNullable(bundle.getString("success_action_playstore_id"));
        cecl.c().r(ffgu.ESIM_SUCCESS_ACTION, str, ceqa.c(bundle, "plan_segment_id"), ceqa.c(bundle, "plan_subsegment_id"), bundle.getLong("esim_carrier_id"));
        try {
            int ordinal = marVar.ordinal();
            if (ordinal == 1) {
                q(qfpVar);
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    ((ejhf) j.j()).x("No success action available for eSIM flow!");
                    qfpVar.finishAffinity();
                    return;
                } else if (ofNullable2.isPresent()) {
                    qfpVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details").buildUpon().appendQueryParameter("id", (String) ofNullable2.get()).build()));
                    qfpVar.finishAffinity();
                    return;
                }
            }
            if (ofNullable.isEmpty()) {
                ((ejhf) j.j()).x("No success URL available for eSIM flow!");
            } else {
                qfpVar.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) ofNullable.get())));
                qfpVar.finishAffinity();
            }
        } catch (ActivityNotFoundException e) {
            ((ejhf) ((ejhf) j.j()).s(e)).x("Failed to perform eSIM success action!");
        }
    }

    public static void m(dg dgVar, qfp qfpVar, Bundle bundle) {
        qfpVar.getOnBackPressedDispatcher().b(dgVar, new ceiy(qfpVar, bundle));
    }

    public static void q(final qfp qfpVar) {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            ((ejhf) j.j()).x("eSIM tried to return to main UI on a different thread.");
            return;
        }
        Intent intent = new Intent("com.google.android.gms.mobiledataplan.ui.SETTING");
        intent.addFlags(335577088);
        intent.setClassName(qfpVar, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
        if (fqhf.S()) {
            ((ejhf) j.h()).x("eSIM returning to main UI.");
            qfpVar.startActivity(intent);
            qfpVar.finishAffinity();
            return;
        }
        iln.b(qfpVar, new TracingBroadcastReceiver(qfpVar) { // from class: com.google.android.gms.mobiledataplan.ui.MobileDataPlanDetailChimeraActivity.2
            @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
            public final void jz(Context context, Intent intent2) {
                ((ejhf) MobileDataPlanDetailChimeraActivity.j.h()).B("Received eSIM package %s", intent2.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"));
                if (Objects.equals(intent2.getAction(), "com.google.android.gms.phenotype.COMMITTED") && Objects.equals(intent2.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"), "com.google.android.gms.mobile_data_plan")) {
                    asot asotVar = MobileDataPlanDetailChimeraActivity.j;
                    ((ejhf) asotVar.h()).B("Received phenotype update for eSIM activation, showing MDP: %s", Boolean.valueOf(fqhf.S()));
                    if (fqhf.S()) {
                        ((ejhf) asotVar.h()).x("eSIM returning to main UI.");
                        Intent intent3 = new Intent("com.google.android.gms.mobiledataplan.ui.SETTING");
                        intent3.addFlags(335577088);
                        qfp qfpVar2 = qfpVar;
                        intent3.setClassName(qfpVar2, "com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity");
                        qfpVar2.startActivity(intent3);
                        qfpVar2.finishAffinity();
                    }
                }
            }
        }, new IntentFilter("com.google.android.gms.phenotype.COMMITTED"), 4);
        cehs cehsVar = new cehs();
        Bundle bundle = new Bundle();
        bundle.putString("ui_option_key", "start_mpd");
        cehsVar.setArguments(bundle);
        bp bpVar = new bp(qfpVar.getSupportFragmentManager());
        bpVar.F(R.id.container, cehsVar);
        bpVar.a();
        qfpVar.getSupportFragmentManager().an();
    }

    public static void r(qfp qfpVar, Bundle bundle) {
        qfpVar.getSupportFragmentManager().au(null, 1);
        if (bundle.getBoolean("COMBINED_PLAN_OFFERS_PAGE")) {
            cehq cehqVar = new cehq();
            bp bpVar = new bp(qfpVar.getSupportFragmentManager());
            bpVar.F(R.id.container, cehqVar);
            bpVar.a();
            return;
        }
        cehe ceheVar = new cehe();
        bp bpVar2 = new bp(qfpVar.getSupportFragmentManager());
        bpVar2.B();
        bpVar2.F(R.id.container, ceheVar);
        bpVar2.d();
    }

    public final void n(boolean z) {
        if (TextUtils.isEmpty(this.s.d)) {
            this.k.setText(R.string.consent_agree_button_text);
        } else {
            this.k.setText(this.s.d);
        }
        this.k.setOnClickListener(new View.OnClickListener() { // from class: ceir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity = MobileDataPlanDetailChimeraActivity.this;
                cecl.c().Q(30, mobileDataPlanDetailChimeraActivity.k.getText().toString(), celk.f(view), ffgu.CLICK_CONSENT_AGREE, System.currentTimeMillis(), Integer.valueOf(mobileDataPlanDetailChimeraActivity.p));
                mobileDataPlanDetailChimeraActivity.o(true);
            }
        });
        boolean z2 = true;
        if (!z && (!this.m.canScrollVertically(-1) || !this.t)) {
            z2 = false;
        }
        cecl.c().Q(z2 ? 49 : 48, this.k.getText().toString(), celk.f(this.m), z2 ? ffgu.CONSENT_BUTTON_CHANGED : ffgu.CONSENT_SHOWS_AGREE_ON_LOAD, System.currentTimeMillis(), Integer.valueOf(this.p));
    }

    public final void o(boolean z) {
        setResult(true != z ? 0 : -1);
        finish();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (fqih.a.a().A()) {
            int i = ceqi.a;
            int i2 = ips.a;
        }
        if (fqip.f()) {
            setContentView(R.layout.detail_activity);
            if (bundle != null) {
                return;
            }
            if (Objects.equals(getIntent().getAction(), "com.google.android.gms.mobiledataplan.ui.SETTINGS") || Objects.equals(getIntent().getAction(), "com.google.android.gms.mobiledataplan.NOTIFICATION_TO_ACTIVITY")) {
                this.o = (ceqa) new jrh(this, this.u).a(ceqa.class);
                ceki cekiVar = new ceki();
                cekiVar.b = this;
                cekiVar.c = getIntent();
                cekiVar.ag = cekiVar.c.getIntExtra("EventFlowId", cecl.a());
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.t(R.id.container, cekiVar);
                bpVar.a();
            } else if (fqih.m() && Objects.equals(getIntent().getAction(), "com.google.android.gms.mobiledataplan.ui.ESIM")) {
                this.o = (ceqa) new jrh(this, this.u).a(ceqa.class);
                p();
            } else {
                cein ceinVar = new cein(this, getIntent());
                bp bpVar2 = new bp(getSupportFragmentManager());
                bpVar2.t(R.id.container, ceinVar);
                bpVar2.a();
            }
            new cecs().m();
            return;
        }
        if (fqhb.e()) {
            this.p = getIntent().getIntExtra("EventFlowId", cecl.a());
        }
        if (fqgb.a.a().j()) {
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
                cecl.c().Q(39, stringExtra, "R.layout.consent_activity", ffgu.ENTER_CONSENT_UI_OTHERS, System.currentTimeMillis(), Integer.valueOf(this.p));
            } else if (stringExtra.equals("com.google.android.gms/com.google.android.gms.mobiledataplan.ui.MobileDataPlanSettingsActivity")) {
                cecl.c().Q(38, stringExtra, "R.layout.consent_activity", ffgu.ENTER_CONSENT_UI_VIA_MDP, System.currentTimeMillis(), Integer.valueOf(this.p));
            } else {
                cecl.c().Q(39, stringExtra, "R.layout.consent_activity", ffgu.ENTER_CONSENT_UI_OTHERS, System.currentTimeMillis(), Integer.valueOf(this.p));
            }
        }
        setContentView(R.layout.consent_fragment);
        hy().h();
        this.k = (Button) findViewById(R.id.agree_button);
        this.l = (Button) findViewById(R.id.decline_button);
        this.m = (ConsentWebView) findViewById(R.id.consent_html_view);
        ConsentAgreementText consentAgreementText = (ConsentAgreementText) arxd.b(getIntent(), "AgreementText", ConsentAgreementText.CREATOR);
        this.s = consentAgreementText;
        if (consentAgreementText == null) {
            ((ejhf) j.j()).x("MobileDataPlanDetailChimeraActivity receives null consent agreement text");
            setResult(0);
            finish();
        }
        this.m.b(this.s);
        this.m.b = new ceiv(this);
        if (TextUtils.isEmpty(this.s.f)) {
            this.t = false;
            n(false);
        } else {
            this.k.setText(this.s.f);
            this.k.setOnClickListener(new View.OnClickListener() { // from class: ceio
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity = MobileDataPlanDetailChimeraActivity.this;
                    cecl.c().Q(29, mobileDataPlanDetailChimeraActivity.k.getText().toString(), celk.f(view), ffgu.CLICK_CONSENT_CONTINUE, System.currentTimeMillis(), Integer.valueOf(mobileDataPlanDetailChimeraActivity.p));
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
        this.l.setOnClickListener(new View.OnClickListener() { // from class: ceip
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MobileDataPlanDetailChimeraActivity mobileDataPlanDetailChimeraActivity = MobileDataPlanDetailChimeraActivity.this;
                cecl.c().Q(28, mobileDataPlanDetailChimeraActivity.l.getText().toString(), celk.f(view), ffgu.CLICK_CONSENT_DECLINE, System.currentTimeMillis(), Integer.valueOf(mobileDataPlanDetailChimeraActivity.p));
                mobileDataPlanDetailChimeraActivity.o(false);
            }
        });
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        ((ejhf) j.h()).x("MobileDataPlanDetailChimeraActivity Destroy eSIM ");
        super.onDestroy();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fe A[Catch: NullPointerException -> 0x02ef, TRY_LEAVE, TryCatch #0 {NullPointerException -> 0x02ef, blocks: (B:4:0x001c, B:19:0x0065, B:21:0x0092, B:22:0x0094, B:26:0x009e, B:29:0x00b5, B:31:0x00c8, B:33:0x00df, B:34:0x00e1, B:35:0x00e5, B:36:0x00e8, B:37:0x00f9, B:39:0x0106, B:40:0x010b, B:42:0x0109, B:43:0x00ed, B:44:0x00f0, B:45:0x00f3, B:46:0x00f6, B:47:0x010f, B:49:0x014e, B:50:0x0151, B:53:0x018d, B:55:0x01ba, B:56:0x01bc, B:60:0x01c6, B:62:0x01d9, B:63:0x01e7, B:65:0x01fa, B:67:0x01fe, B:76:0x02ae, B:79:0x02da, B:69:0x021a, B:71:0x0229, B:73:0x0238, B:75:0x02a9), top: B:3:0x001c, inners: #1 }] */
    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            cecl.c().Q(43, "consentActivity", null, ffgu.FINISH_UI_AFTER_USER_TRIGGER, System.currentTimeMillis(), Integer.valueOf(this.p));
        }
    }

    public final void p() {
        if (fqih.m()) {
            ig hy = hy();
            if (hy != null) {
                hy.s(false);
            }
            setTheme(R.style.Theme_MobileDataPlan_DefaultGoogleMaterial);
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.container, new cehs());
            bpVar.a();
            getSupportFragmentManager().an();
            try {
                Bundle extras = getIntent().getExtras();
                arwm.s(extras);
                this.q = new cehe();
                String string = extras.getString("ESIM_SESSION_ID");
                arwm.s(string);
                String string2 = extras.getString("ESIM_SERVICE_HOST");
                arwm.s(string2);
                long j2 = extras.getLong("esim_carrier_id");
                arwm.w(j2);
                Optional ofNullable = Optional.ofNullable(extras.getBundle("esim_entry_tags"));
                this.o.h(string, string2, extras);
                this.o.j(ffgu.ESIM_CARRIER_INFO_REQUEST, 0L);
                final cefp r = this.o.r(false);
                String languageTag = ceqi.g(this).toLanguageTag();
                final ceiq ceiqVar = new ceiq(this, extras);
                final fecj v = max.a.v();
                if (!v.b.L()) {
                    v.U();
                }
                fecp fecpVar = v.b;
                ((max) fecpVar).b = j2;
                if (!fecpVar.L()) {
                    v.U();
                }
                fecp fecpVar2 = v.b;
                ((max) fecpVar2).d = string;
                if (!fecpVar2.L()) {
                    v.U();
                }
                max maxVar = (max) v.b;
                languageTag.getClass();
                maxVar.c = languageTag;
                if (ofNullable.isPresent()) {
                    for (final String str : ((Bundle) ofNullable.get()).keySet()) {
                        Optional.ofNullable(((Bundle) ofNullable.get()).getString(str)).ifPresent(new Consumer() { // from class: ceev
                            @Override // java.util.function.Consumer
                            /* renamed from: accept */
                            public final void q(Object obj) {
                                String str2 = (String) obj;
                                int i = cefp.f;
                                fecj v2 = mbb.a.v();
                                if (!v2.b.L()) {
                                    v2.U();
                                }
                                String str3 = str;
                                fecp fecpVar3 = v2.b;
                                str3.getClass();
                                ((mbb) fecpVar3).b = str3;
                                if (!fecpVar3.L()) {
                                    v2.U();
                                }
                                fecj fecjVar = fecj.this;
                                mbb mbbVar = (mbb) v2.b;
                                str2.getClass();
                                mbbVar.c = str2;
                                if (!fecjVar.b.L()) {
                                    fecjVar.U();
                                }
                                max maxVar2 = (max) fecjVar.b;
                                mbb mbbVar2 = (mbb) v2.Q();
                                max maxVar3 = max.a;
                                mbbVar2.getClass();
                                fedh fedhVar = maxVar2.e;
                                if (!fedhVar.c()) {
                                    maxVar2.e = fecp.E(fedhVar);
                                }
                                maxVar2.e.add(mbbVar2);
                            }

                            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                                return Consumer$CC.$default$andThen(this, consumer);
                            }
                        });
                    }
                }
                r.b.execute(new Runnable() { // from class: ceew
                    /* JADX WARN: Code restructure failed: missing block: B:105:0x0391, code lost:
                    
                        if (defpackage.cehl.x(r6, r8).isEmpty() != false) goto L288;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e9, code lost:
                    
                        if (defpackage.ceqg.a() == false) goto L102;
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
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceew.run():void");
                    }
                });
            } catch (IllegalArgumentException | NullPointerException e) {
                ((ejhf) ((ejhf) j.j()).s(e)).x("No session id or carrier id passed into eSIM flow");
                cegz.A(this, new Bundle(), ffgu.ESIM_START_ERROR, this.o.b);
            }
        }
    }
}

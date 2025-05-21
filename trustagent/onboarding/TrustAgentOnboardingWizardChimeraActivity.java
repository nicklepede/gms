package com.google.android.gms.trustagent.onboarding;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.common.ui.LinkSpan;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.trustagent.onboarding.TrustAgentOnboardingWizardChimeraActivity;
import com.google.android.setupdesign.GlifLayout;
import defpackage.asej;
import defpackage.asot;
import defpackage.dgmn;
import defpackage.edeq;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.edfs;
import defpackage.edjs;
import defpackage.ejhf;
import defpackage.ig;
import defpackage.ips;
import defpackage.juc;
import defpackage.qfp;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TrustAgentOnboardingWizardChimeraActivity extends dgmn {
    public static final asot l = asot.b("TrustAgent", asej.TRUSTAGENT);
    private static final IntentFilter n = new IntentFilter("com.google.android.setupwizard.LINK_SPAN_CLICKED");
    final BroadcastReceiver m = new TracingBroadcastReceiver() { // from class: com.google.android.gms.trustagent.onboarding.TrustAgentOnboardingWizardChimeraActivity.1
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            TrustAgentOnboardingWizardChimeraActivity trustAgentOnboardingWizardChimeraActivity = TrustAgentOnboardingWizardChimeraActivity.this;
            if (!trustAgentOnboardingWizardChimeraActivity.isFinishing() && Objects.equals(intent.getStringExtra("id"), "trustagent_learn_more")) {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/mobile/?p=personal_unlocking"));
                intent2.putExtra("com.android.browser.application_id", trustAgentOnboardingWizardChimeraActivity.getPackageName());
                try {
                    trustAgentOnboardingWizardChimeraActivity.startActivity(intent2);
                } catch (ActivityNotFoundException e) {
                    ((ejhf) ((ejhf) ((ejhf) TrustAgentOnboardingWizardChimeraActivity.l.i()).s(e)).ah((char) 11640)).B("Actvity was not found for intent, %s", intent2);
                }
            }
        }
    };
    private Intent o;
    private Context p;
    private edfs q;

    public static void k(qfp qfpVar) {
        Intent intent = new Intent();
        intent.setClassName(qfpVar, "com.google.android.gms.trustagent.TrustAgentOnboardingWizardActivity");
        try {
            qfpVar.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((ejhf) ((ejhf) ((ejhf) l.i()).s(e)).ah((char) 11642)).B("Cannot find %s.", intent.getComponent());
        }
    }

    @Override // defpackage.dgmn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.o = (Intent) bundle.getParcelable("intent");
        } else {
            this.o = getIntent();
        }
        Context a = AppContextProvider.a();
        this.p = a;
        int i = edjs.a;
        boolean v = edeq.v(a);
        int i2 = ips.a;
        if (v) {
            setTheme(R.style.SudThemeGlifV3_DayNight);
        } else {
            setTheme(R.style.SudThemeGlifV3_Light);
        }
        boolean w = edeq.w(this);
        int a2 = edjs.a(this);
        if (w && a2 != 0) {
            setTheme(a2);
        }
        setContentView(R.layout.trust_agent_onboarding_wizard_activity);
        ig hy = hy();
        if (hy != null) {
            hy.h();
        }
        GlifLayout glifLayout = (GlifLayout) findViewById(R.id.trust_agent_onboarding_activity);
        TextView textView = (TextView) findViewById(R.id.trust_agent_onboarding_text_body);
        glifLayout.H(R.string.trust_agent_onboarding_text_title);
        textView.setText(R.string.trust_agent_onboarding_smartlock_text_body);
        LinkSpan.a(textView, "trustagent_learn_more");
        edfr edfrVar = new edfr(this);
        edfrVar.c = 5;
        this.q = edfrVar.a();
        ((edfq) glifLayout.q(edfq.class)).b(this.q);
        m();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        juc.a(this).d(this.m);
        super.onPause();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        juc.a(this).c(this.m, n);
        this.q.e(this, R.string.trust_agent_button_got_it);
        this.q.f = new View.OnClickListener() { // from class: dgpi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent();
                TrustAgentOnboardingWizardChimeraActivity trustAgentOnboardingWizardChimeraActivity = TrustAgentOnboardingWizardChimeraActivity.this;
                intent.setClassName(trustAgentOnboardingWizardChimeraActivity, "com.google.android.gms.trustagent.GoogleTrustAgentPersonalUnlockingSettings");
                trustAgentOnboardingWizardChimeraActivity.startActivity(intent);
                trustAgentOnboardingWizardChimeraActivity.finish();
                trustAgentOnboardingWizardChimeraActivity.finish();
            }
        };
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("intent", this.o);
        super.onSaveInstanceState(bundle);
    }
}

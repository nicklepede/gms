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
import defpackage.auid;
import defpackage.ausn;
import defpackage.dixs;
import defpackage.efrl;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.efsn;
import defpackage.efwn;
import defpackage.eluo;
import defpackage.ig;
import defpackage.iri;
import defpackage.kar;
import defpackage.ryt;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class TrustAgentOnboardingWizardChimeraActivity extends dixs {
    public static final ausn l = ausn.b("TrustAgent", auid.TRUSTAGENT);
    private static final IntentFilter n = new IntentFilter("com.google.android.setupwizard.LINK_SPAN_CLICKED");
    final BroadcastReceiver m = new TracingBroadcastReceiver() { // from class: com.google.android.gms.trustagent.onboarding.TrustAgentOnboardingWizardChimeraActivity.1
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            TrustAgentOnboardingWizardChimeraActivity trustAgentOnboardingWizardChimeraActivity = TrustAgentOnboardingWizardChimeraActivity.this;
            if (!trustAgentOnboardingWizardChimeraActivity.isFinishing() && Objects.equals(intent.getStringExtra("id"), "trustagent_learn_more")) {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/mobile/?p=personal_unlocking"));
                intent2.putExtra("com.android.browser.application_id", trustAgentOnboardingWizardChimeraActivity.getPackageName());
                try {
                    trustAgentOnboardingWizardChimeraActivity.startActivity(intent2);
                } catch (ActivityNotFoundException e) {
                    ((eluo) ((eluo) ((eluo) TrustAgentOnboardingWizardChimeraActivity.l.i()).s(e)).ai((char) 11643)).B("Actvity was not found for intent, %s", intent2);
                }
            }
        }
    };
    private Intent o;
    private Context p;
    private efsn q;

    public static void k(ryt rytVar) {
        Intent intent = new Intent();
        intent.setClassName(rytVar, "com.google.android.gms.trustagent.TrustAgentOnboardingWizardActivity");
        try {
            rytVar.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((eluo) ((eluo) ((eluo) l.i()).s(e)).ai((char) 11645)).B("Cannot find %s.", intent.getComponent());
        }
    }

    @Override // defpackage.dixs, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.o = (Intent) bundle.getParcelable("intent");
        } else {
            this.o = getIntent();
        }
        Context a = AppContextProvider.a();
        this.p = a;
        int i = efwn.a;
        boolean v = efrl.v(a);
        int i2 = iri.a;
        if (v) {
            setTheme(R.style.SudThemeGlifV3_DayNight);
        } else {
            setTheme(R.style.SudThemeGlifV3_Light);
        }
        boolean w = efrl.w(this);
        int a2 = efwn.a(this);
        if (w && a2 != 0) {
            setTheme(a2);
        }
        setContentView(R.layout.trust_agent_onboarding_wizard_activity);
        ig hO = hO();
        if (hO != null) {
            hO.h();
        }
        GlifLayout glifLayout = (GlifLayout) findViewById(R.id.trust_agent_onboarding_activity);
        TextView textView = (TextView) findViewById(R.id.trust_agent_onboarding_text_body);
        glifLayout.H(R.string.trust_agent_onboarding_text_title);
        textView.setText(R.string.trust_agent_onboarding_smartlock_text_body);
        LinkSpan.a(textView, "trustagent_learn_more");
        efsm efsmVar = new efsm(this);
        efsmVar.c = 5;
        this.q = efsmVar.a();
        ((efsl) glifLayout.q(efsl.class)).b(this.q);
        m();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        kar.a(this).d(this.m);
        super.onPause();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        kar.a(this).c(this.m, n);
        this.q.e(this, R.string.trust_agent_button_got_it);
        this.q.f = new View.OnClickListener() { // from class: djan
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

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("intent", this.o);
        super.onSaveInstanceState(bundle);
    }
}

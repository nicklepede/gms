package com.google.android.gms.trustagent.onboarding;

import android.app.KeyguardManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.common.ui.LinkSpan;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import defpackage.abt;
import defpackage.abv;
import defpackage.acl;
import defpackage.asej;
import defpackage.asot;
import defpackage.asqh;
import defpackage.dgmb;
import defpackage.dgmd;
import defpackage.dgmn;
import defpackage.dgpa;
import defpackage.dgpb;
import defpackage.dgpc;
import defpackage.dgpd;
import defpackage.dgpe;
import defpackage.dgpf;
import defpackage.dgpg;
import defpackage.dgph;
import defpackage.ejhf;
import defpackage.jti;
import defpackage.juc;
import defpackage.qfp;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class TrustAgentOnboardingChimeraActivity extends dgmn implements dgmb, abt {
    public static final asot l = asot.b("TrustAgent", asej.TRUSTAGENT);
    private static final IntentFilter s = new IntentFilter("com.google.android.setupwizard.LINK_SPAN_CLICKED");
    private abv A;
    public boolean n;
    public Context o;
    public Intent p;
    public boolean q;
    private Intent v;
    private dgpb w;
    private TextView x;
    private Button y;
    private LinearLayout z;
    final BroadcastReceiver m = new TracingBroadcastReceiver() { // from class: com.google.android.gms.trustagent.onboarding.TrustAgentOnboardingChimeraActivity.1
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jz(Context context, Intent intent) {
            TrustAgentOnboardingChimeraActivity trustAgentOnboardingChimeraActivity = TrustAgentOnboardingChimeraActivity.this;
            if (!trustAgentOnboardingChimeraActivity.isFinishing() && Objects.equals(intent.getStringExtra("id"), "trustagent_learn_more")) {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://support.google.com/mobile/?p=personal_unlocking"));
                intent2.putExtra("com.android.browser.application_id", trustAgentOnboardingChimeraActivity.getPackageName());
                try {
                    trustAgentOnboardingChimeraActivity.startActivity(intent2);
                } catch (ActivityNotFoundException e) {
                    ((ejhf) ((ejhf) ((ejhf) TrustAgentOnboardingChimeraActivity.l.i()).s(e)).ah((char) 11634)).B("Actvity was not found for intent, %s", intent2);
                }
            }
        }
    };
    private final dgph t = new dgph(this);
    private final dgmd u = dgmd.a();
    public int r = 0;

    public static void o(qfp qfpVar) {
        Intent intent = new Intent();
        intent.setClassName(qfpVar, "com.google.android.gms.trustagent.TrustAgentOnboardingActivity");
        try {
            qfpVar.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            ((ejhf) ((ejhf) ((ejhf) l.i()).s(e)).ah((char) 11639)).B("Cannot find %s.", intent.getComponent());
        }
    }

    private final void q() {
        this.u.e("trust_agent_onboarding_shown_key", true);
    }

    @Override // defpackage.abt
    public final /* bridge */ /* synthetic */ void jq(Object obj) {
        ActivityResult activityResult = (ActivityResult) obj;
        int i = activityResult.a;
        if (activityResult.b != null && this.r == 1 && i == 1) {
            this.p.putExtra("extra_check_started", true);
            startActivity(this.p);
            finish();
        }
    }

    public final abv k() {
        abv abvVar = this.A;
        return abvVar != null ? abvVar : registerForActivityResult(new acl(), this);
    }

    @Override // defpackage.dgmb
    public final void l() {
        q();
    }

    public final void n() {
        if (this.p == null) {
            this.x.setVisibility(8);
            findViewById(R.id.trust_agent_onboarding_divider).setVisibility(8);
            findViewById(R.id.trust_agent_onboarding_divider).setVisibility(8);
            this.y.setText(R.string.trust_agent_button_got_it);
            this.y.setOnClickListener(new dgpg(this));
            return;
        }
        boolean isDeviceSecure = ((KeyguardManager) getSystemService("keyguard")).isDeviceSecure();
        this.q = isDeviceSecure;
        if (!isDeviceSecure) {
            this.x.setText(this.w.d());
        } else {
            if (!this.n) {
                this.x.setText(String.format("%s. %s", getString(R.string.trust_agent_smartlock_disabled_title), getString(R.string.trust_agent_smartlock_disabled_detail)));
                this.y.setText(R.string.trust_agent_button_got_it);
                this.y.setOnClickListener(new dgpe(this));
                return;
            }
            this.x.setText(this.w.a());
        }
        this.y.setText(this.w.b());
        this.y.setOnClickListener(new dgpf(this));
    }

    @Override // defpackage.dgmn, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.v = (Intent) bundle.getParcelable("intent");
        } else {
            this.v = getIntent();
        }
        this.o = AppContextProvider.a();
        dgmd dgmdVar = this.u;
        dgmdVar.h(this);
        if (dgmdVar.k()) {
            q();
        }
        if (asqh.f()) {
            getOnBackPressedDispatcher().b(this, new dgpd(this));
        }
        hy().o(true);
        hy().t(0.0f);
        setContentView(R.layout.trust_agent_onboarding_activity);
        TextView textView = (TextView) findViewById(R.id.trust_agent_onboarding_text_title);
        TextView textView2 = (TextView) findViewById(R.id.trust_agent_onboarding_text_body);
        this.x = (TextView) findViewById(R.id.trust_agent_onboarding_text_screenlock);
        this.y = (Button) findViewById(R.id.trust_agent_onboarding_got_it_button);
        this.z = (LinearLayout) findViewById(R.id.trust_agent_onboarding_spinner);
        String stringExtra = this.v.getStringExtra("extra_intent_to_start");
        dgpb dgpcVar = stringExtra != null ? (stringExtra.hashCode() == 1549989476 && stringExtra.equals("OnboardingSmartLockComponent")) ? new dgpc() : new dgpa() : new dgpa();
        this.w = dgpcVar;
        textView.setText(dgpcVar.c());
        this.w.f();
        textView2.setText(R.string.trust_agent_onboarding_smartlock_text_body);
        LinkSpan.a(textView2, "trustagent_learn_more");
        this.p = this.w.e(this.o);
        this.A = k();
    }

    @Override // defpackage.dgmn, defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        super.onDestroy();
        this.u.i(this);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return false;
        }
        getOnBackPressedDispatcher().c();
        return true;
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        juc.a(this).d(this.m);
        super.onPause();
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        juc.a(this).c(this.m, s);
        this.q = ((KeyguardManager) getSystemService("keyguard")).isDeviceSecure();
        this.n = false;
        Intent intent = this.p;
        if (intent != null) {
            intent.putExtra("extra_intent_from", String.format("<from>%s</from><target>%s</target>", this.v.getStringExtra("extra_intent_from"), this.v.getStringExtra("extra_intent_to_start")));
            if (this.q) {
                if (jti.a(this).b(0) == null) {
                    jti.a(this).c(0, new Bundle(), this.t);
                } else {
                    jti.a(this).d(0, new Bundle(), this.t);
                }
                p(true);
            }
        }
        n();
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putParcelable("intent", this.v);
        super.onSaveInstanceState(bundle);
    }

    public final void p(boolean z) {
        if (z) {
            this.z.setVisibility(0);
            this.x.setVisibility(8);
            this.y.setVisibility(8);
        } else {
            this.z.setVisibility(8);
            this.x.setVisibility(0);
            this.y.setVisibility(0);
        }
    }
}

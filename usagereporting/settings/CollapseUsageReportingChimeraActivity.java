package com.google.android.gms.usagereporting.settings;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import com.android.settingslib.widget.MainSwitchPreference;
import com.google.android.gms.R;
import com.google.android.gms.usagereporting.UsageReportingOptInOptions;
import com.google.android.gms.usagereporting.settings.CollapseUsageReportingChimeraActivity;
import defpackage.aqxd;
import defpackage.aqxo;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bp;
import defpackage.bqqa;
import defpackage.bqqe;
import defpackage.cwwi;
import defpackage.dfah;
import defpackage.dhqe;
import defpackage.dhqf;
import defpackage.dhrq;
import defpackage.dhsa;
import defpackage.dhse;
import defpackage.dhsf;
import defpackage.dhsg;
import defpackage.dhsj;
import defpackage.dhsk;
import defpackage.dhsl;
import defpackage.dhsm;
import defpackage.dhso;
import defpackage.dhsp;
import defpackage.eijr;
import defpackage.ejhf;
import defpackage.ensv;
import defpackage.fssc;
import defpackage.fssf;
import defpackage.ngk;
import defpackage.qgg;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CollapseUsageReportingChimeraActivity extends qgg implements ngk {
    public static final asot j = asot.b("CollapseUsageReportingChimeraActivity", asej.USAGE_REPORTING);
    dhsj k;
    public dhsg l;
    public bqqa m;
    private final ensv n = new asmf(1, 9);
    private boolean o;
    private aqxo p;

    @Override // defpackage.ngk
    public final void fb(CompoundButton compoundButton, boolean z) {
        aseu aseuVar;
        ((ejhf) j.h()).x("set checkbox optin options");
        this.p.aN(new UsageReportingOptInOptions(true != z ? 2 : 1)).y(new dfah() { // from class: dhsd
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                ((ejhf) ((ejhf) CollapseUsageReportingChimeraActivity.j.i()).s(exc)).x("Unable to set opt-in options");
            }
        });
        if (z) {
            aseuVar = aseu.USAGEREPORTING_CHECKBOX_OPT_IN;
        } else {
            aqxd aqxdVar = cwwi.a;
            new aqxo((Context) this, (short[]) null).ar();
            aseuVar = aseu.USAGEREPORTING_CHECKBOX_OPT_OUT;
        }
        bqqa.a(aseuVar);
    }

    @Override // defpackage.qgg, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        MainSwitchPreference J;
        super.onCreate(bundle);
        eijr eijrVar = bqqe.a;
        this.m = new bqqa();
        setTitle(getString(R.string.common_usage_and_diagnostics));
        if (fssc.a.a().j()) {
            this.k = new dhse();
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.content_frame, (dhse) this.k);
            bpVar.d();
        } else {
            this.k = new dhsf();
            bp bpVar2 = new bp(getSupportFragmentManager());
            bpVar2.F(R.id.content_frame, (dhsf) this.k);
            bpVar2.d();
        }
        dhsa.e();
        this.o = !dhrq.g();
        dhqe dhqeVar = new dhqe();
        aqxd aqxdVar = dhqf.a;
        this.p = new aqxo(this, dhqeVar);
        fssc.e();
        fssc.e();
        this.l = new dhsg(this);
        if (this.o || (J = this.k.J()) == null) {
            return;
        }
        J.ah(this);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStart() {
        dhsp dhslVar;
        super.onStart();
        asot asotVar = dhrq.a;
        boolean e = dhrq.e(this);
        MainSwitchPreference J = this.k.J();
        if (J != null) {
            J.k(e);
        }
        boolean z = !this.o;
        MainSwitchPreference J2 = this.k.J();
        if (J2 != null) {
            J2.H(z);
        }
        FooterPreferenceWithLink K = this.k.K();
        if (K == null) {
            return;
        }
        dhsg dhsgVar = this.l;
        if (dhsgVar.b()) {
            dhslVar = new dhso(dhsgVar.b);
        } else if (dhsgVar.a()) {
            dhslVar = new dhsm(dhsgVar.b);
        } else {
            boolean h = fssf.h();
            Context context = dhsgVar.b;
            dhslVar = h ? new dhsl(context) : new dhsk(context);
        }
        K.S(dhslVar.a());
        K.o(getString(R.string.usage_reporting_learn_more_description));
        K.af(getString(R.string.usage_reporting_learn_more_description));
        K.l(new View.OnClickListener() { // from class: dhsc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                CollapseUsageReportingChimeraActivity collapseUsageReportingChimeraActivity = CollapseUsageReportingChimeraActivity.this;
                dhsg dhsgVar2 = collapseUsageReportingChimeraActivity.l;
                collapseUsageReportingChimeraActivity.startActivity(intent.setData((dhsgVar2.a() || dhsgVar2.b()) ? dhsg.a : dmoe.a(dhsgVar2.b)));
                bqqa.a(aseu.USAGEREPORTING_ON_CLICK_LEARN_MORE);
            }
        });
    }
}

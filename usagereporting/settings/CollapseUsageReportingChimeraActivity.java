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
import defpackage.aszs;
import defpackage.atad;
import defpackage.auid;
import defpackage.auio;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bp;
import defpackage.bsxr;
import defpackage.bsxv;
import defpackage.czgg;
import defpackage.dhln;
import defpackage.dkbk;
import defpackage.dkbl;
import defpackage.dkcw;
import defpackage.dkdi;
import defpackage.dkdm;
import defpackage.dkdn;
import defpackage.dkdo;
import defpackage.dkdr;
import defpackage.dkds;
import defpackage.dkdt;
import defpackage.dkdu;
import defpackage.dkdw;
import defpackage.dkdx;
import defpackage.ekww;
import defpackage.eluo;
import defpackage.eqgo;
import defpackage.fvns;
import defpackage.fvnv;
import defpackage.ozl;
import defpackage.rzk;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CollapseUsageReportingChimeraActivity extends rzk implements ozl {
    public static final ausn j = ausn.b("CollapseUsageReportingChimeraActivity", auid.USAGE_REPORTING);
    dkdr k;
    public dkdo l;
    public bsxr m;
    private final eqgo n = new aupz(1, 9);
    private boolean o;
    private atad p;

    @Override // defpackage.ozl
    public final void fo(CompoundButton compoundButton, boolean z) {
        auio auioVar;
        ((eluo) j.h()).x("set checkbox optin options");
        this.p.aM(new UsageReportingOptInOptions(true != z ? 2 : 1)).y(new dhln() { // from class: dkdl
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ((eluo) ((eluo) CollapseUsageReportingChimeraActivity.j.i()).s(exc)).x("Unable to set opt-in options");
            }
        });
        if (z) {
            auioVar = auio.USAGEREPORTING_CHECKBOX_OPT_IN;
        } else {
            aszs aszsVar = czgg.a;
            new atad((Context) this, (short[]) null).aq();
            auioVar = auio.USAGEREPORTING_CHECKBOX_OPT_OUT;
        }
        bsxr.a(auioVar);
    }

    @Override // defpackage.rzk, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        MainSwitchPreference J;
        super.onCreate(bundle);
        ekww ekwwVar = bsxv.a;
        this.m = new bsxr();
        setTitle(getString(R.string.common_usage_and_diagnostics));
        if (fvns.a.lK().j()) {
            this.k = new dkdm();
            bp bpVar = new bp(getSupportFragmentManager());
            bpVar.F(R.id.content_frame, (dkdm) this.k);
            bpVar.d();
        } else {
            this.k = new dkdn();
            bp bpVar2 = new bp(getSupportFragmentManager());
            bpVar2.F(R.id.content_frame, (dkdn) this.k);
            bpVar2.d();
        }
        dkdi.e();
        this.o = !dkcw.g();
        dkbk dkbkVar = new dkbk();
        aszs aszsVar = dkbl.a;
        this.p = new atad(this, dkbkVar);
        fvns.e();
        fvns.e();
        this.l = new dkdo(this);
        if (this.o || (J = this.k.J()) == null) {
            return;
        }
        J.ah(this);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStart() {
        dkdx dkdtVar;
        super.onStart();
        ausn ausnVar = dkcw.a;
        boolean e = dkcw.e(this);
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
        dkdo dkdoVar = this.l;
        if (dkdoVar.b()) {
            dkdtVar = new dkdw(dkdoVar.b);
        } else if (dkdoVar.a()) {
            dkdtVar = new dkdu(dkdoVar.b);
        } else {
            boolean h = fvnv.h();
            Context context = dkdoVar.b;
            dkdtVar = h ? new dkdt(context) : new dkds(context);
        }
        K.S(dkdtVar.a());
        K.o(getString(R.string.usage_reporting_learn_more_description));
        K.af(getString(R.string.usage_reporting_learn_more_description));
        K.l(new View.OnClickListener() { // from class: dkdk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Intent intent = new Intent("android.intent.action.VIEW");
                CollapseUsageReportingChimeraActivity collapseUsageReportingChimeraActivity = CollapseUsageReportingChimeraActivity.this;
                dkdo dkdoVar2 = collapseUsageReportingChimeraActivity.l;
                collapseUsageReportingChimeraActivity.startActivity(intent.setData((dkdoVar2.a() || dkdoVar2.b()) ? dkdo.a : dozs.a(dkdoVar2.b)));
                bsxr.a(auio.USAGEREPORTING_ON_CLICK_LEARN_MORE);
            }
        });
    }
}

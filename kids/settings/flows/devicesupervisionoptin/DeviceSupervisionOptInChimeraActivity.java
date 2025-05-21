package com.google.android.gms.kids.settings.flows.devicesupervisionoptin;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.asej;
import defpackage.asot;
import defpackage.bp;
import defpackage.bpyl;
import defpackage.bqak;
import defpackage.edeq;
import defpackage.edjs;
import defpackage.edjt;
import defpackage.ejhf;
import defpackage.eurf;
import defpackage.eurh;
import defpackage.fpiu;
import defpackage.fuvb;
import defpackage.fvbo;
import defpackage.ipt;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class DeviceSupervisionOptInChimeraActivity extends qet {
    private static final asot j = asot.b("DeviceSupervisionOptInChimeraActivity", asej.KIDS);

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        int a;
        super.onCreate(bundle);
        setTheme(R.style.Theme_GoogleMaterial3_DayNight);
        if (fpiu.a.a().n()) {
            setTheme(edjs.b(this));
            edjs.d();
        } else {
            setTheme(new edjt(R.style.SudThemeGlifV3_DayNight, true).a(getIntent()));
            int i = edjs.a;
            if (edeq.w(this) && (a = edjs.a(this)) != 0) {
                setTheme(a);
            }
        }
        if (bundle == null) {
            Intent intent = getIntent();
            eurf eurfVar = eurf.UNKNOWN_ENTRY_POINT;
            int intExtra = intent.getIntExtra("entry_point", eurfVar.h);
            if (fvbo.n(getIntent().getStringExtra("destination"), "accounts_removal")) {
                ((ejhf) j.h()).x("Accounts Removal fragment initiated");
                String stringExtra = getIntent().getStringExtra("selected_account");
                String stringExtra2 = getIntent().getStringExtra("session_id");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                bpyl bpylVar = new bpyl();
                bpylVar.setArguments(stringExtra != null ? ipt.a(new fuvb("selected_account", stringExtra), new fuvb("session_id", stringExtra2)) : new Bundle());
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.F(android.R.id.content, bpylVar);
                bpVar.a();
                return;
            }
            asot asotVar = bqak.a;
            eurh eurhVar = eurh.DEVICE_SUPERVISION_OPT_IN;
            eurf b = eurf.b(intExtra);
            if (b != null) {
                eurfVar = b;
            }
            fvbo.f(eurhVar, "flowType");
            fvbo.f(eurfVar, "entryPoint");
            bqak bqakVar = new bqak();
            bqakVar.setArguments(ipt.a(new fuvb("flow_type", Integer.valueOf(eurhVar.Y)), new fuvb("entry_point", Integer.valueOf(eurfVar.h))));
            bp bpVar2 = new bp(getSupportFragmentManager());
            bpVar2.F(android.R.id.content, bqakVar);
            bpVar2.w("fragment");
            bpVar2.a();
        }
    }
}

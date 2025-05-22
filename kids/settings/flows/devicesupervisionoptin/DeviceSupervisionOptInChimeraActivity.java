package com.google.android.gms.kids.settings.flows.devicesupervisionoptin;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.R;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bp;
import defpackage.bsgb;
import defpackage.bsia;
import defpackage.efrl;
import defpackage.efwn;
import defpackage.efwo;
import defpackage.eluo;
import defpackage.exgy;
import defpackage.exha;
import defpackage.fsck;
import defpackage.fxqz;
import defpackage.fxxm;
import defpackage.irj;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class DeviceSupervisionOptInChimeraActivity extends rxx {
    private static final ausn j = ausn.b("DeviceSupervisionOptInChimeraActivity", auid.KIDS);

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        int a;
        super.onCreate(bundle);
        setTheme(R.style.Theme_GoogleMaterial3_DayNight);
        if (fsck.f()) {
            setTheme(efwn.b(this));
            efwn.d();
        } else {
            setTheme(new efwo(R.style.SudThemeGlifV3_DayNight, true).a(getIntent()));
            int i = efwn.a;
            if (efrl.w(this) && (a = efwn.a(this)) != 0) {
                setTheme(a);
            }
        }
        if (bundle == null) {
            Intent intent = getIntent();
            exgy exgyVar = exgy.UNKNOWN_ENTRY_POINT;
            int intExtra = intent.getIntExtra("entry_point", exgyVar.i);
            if (fxxm.n(getIntent().getStringExtra("destination"), "accounts_removal")) {
                ((eluo) j.h()).x("Accounts Removal fragment initiated");
                String stringExtra = getIntent().getStringExtra("selected_account");
                String stringExtra2 = getIntent().getStringExtra("session_id");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                bsgb bsgbVar = new bsgb();
                bsgbVar.setArguments(stringExtra != null ? irj.a(new fxqz("selected_account", stringExtra), new fxqz("session_id", stringExtra2)) : new Bundle());
                bp bpVar = new bp(getSupportFragmentManager());
                bpVar.F(android.R.id.content, bsgbVar);
                bpVar.a();
                return;
            }
            ausn ausnVar = bsia.a;
            exha exhaVar = exha.DEVICE_SUPERVISION_OPT_IN;
            exgy b = exgy.b(intExtra);
            if (b != null) {
                exgyVar = b;
            }
            fxxm.f(exhaVar, "flowType");
            fxxm.f(exgyVar, "entryPoint");
            bsia bsiaVar = new bsia();
            bsiaVar.setArguments(irj.a(new fxqz("flow_type", Integer.valueOf(exhaVar.Z)), new fxqz("entry_point", Integer.valueOf(exgyVar.i))));
            bp bpVar2 = new bp(getSupportFragmentManager());
            bpVar2.F(android.R.id.content, bsiaVar);
            bpVar2.w("fragment");
            bpVar2.a();
        }
    }
}

package com.google.android.gms.auth.uiflows.addaccount;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.widget.Button;
import com.google.android.gms.R;
import com.google.android.gms.chimera.modules.auth.account.base.AppContextProvider;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.SetupWizardLayout;
import com.google.android.setupdesign.view.NavigationBar;
import defpackage.acno;
import defpackage.acpt;
import defpackage.afeo;
import defpackage.afep;
import defpackage.afeq;
import defpackage.afer;
import defpackage.afes;
import defpackage.afet;
import defpackage.afln;
import defpackage.atmg;
import defpackage.atmh;
import defpackage.atmr;
import defpackage.atmu;
import defpackage.aurp;
import defpackage.auub;
import defpackage.bp;
import defpackage.caqj;
import defpackage.dhlw;
import defpackage.dxyi;
import defpackage.efsl;
import defpackage.efsm;
import defpackage.efwt;
import defpackage.fmtw;
import defpackage.xbw;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class DmSetScreenlockChimeraActivity extends afln implements efwt, atmg {
    public static final acno h = new acno("account");
    atmh i;
    private final acpt j = new acpt(AppContextProvider.a());
    private final afeo k = afeo.a();

    @Override // defpackage.efwt
    public final void gH() {
        k();
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "DmSetScreenlockActivity";
    }

    @Override // defpackage.efwt
    public final void jM() {
        startActivityForResult(new Intent(true != auub.a() ? "android.app.action.SET_NEW_PASSWORD" : "android.app.action.SET_NEW_PARENT_PROFILE_PASSWORD"), 1);
    }

    public final void k() {
        atmh atmhVar = this.i;
        if (atmhVar != null) {
            atmhVar.dismissAllowingStateLoss();
        }
        this.i = atmh.y(getString(R.string.auth_device_management_screenlock_skip_message), getString(R.string.auth_common_switch_accounts), getString(R.string.auth_common_go_back), false);
        bp bpVar = new bp(gY());
        bpVar.v(this.i, "skip dialog");
        bpVar.b();
    }

    @Override // defpackage.atmg
    public final void n(atmh atmhVar, int i) {
        if (i == 1 && this.i == atmhVar) {
            gT(1, null);
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            gT(-1, null);
        }
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        k();
    }

    @Override // defpackage.afln, defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new caqj();
        if (((KeyguardManager) getSystemService("keyguard")).isDeviceSecure()) {
            dxyi dxyiVar = xbw.a;
            afeo afeoVar = this.k;
            synchronized (afeoVar.c) {
                aurp aurpVar = afeoVar.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = afeoVar.a;
                if (j != -1 && elapsedRealtime <= j + 30000) {
                }
                afeoVar.a = elapsedRealtime;
                dhlw g = this.j.g(9, Arrays.asList("authzen", "PublicKey"), "ForceRegistration", (Account) getIntent().getParcelableExtra(h.a), null);
                g.z(new afet());
                g.a(new afes());
                g.y(new afer());
            }
            gT(2, null);
        }
        atmu f = atmu.f(this, atmr.i(t().a) ? fmtw.d() ? R.layout.auth_device_management_screenlock_glif_v2 : R.layout.auth_device_management_screenlock_glif : R.layout.auth_device_management_screenlock);
        setContentView(f.a());
        String string = getString(R.string.common_skip);
        String string2 = getString(R.string.common_next);
        if (f.a() instanceof SetupWizardLayout) {
            NavigationBar t = ((SetupWizardLayout) f.a()).t();
            t.a(this);
            Button button = t.b;
            button.setCompoundDrawables(null, null, null, null);
            Button button2 = t.a;
            button.setText(string);
            button.setContentDescription(string);
            button2.setText(string2);
            button2.setContentDescription(string2);
        } else {
            efsl efslVar = (efsl) ((GlifLayout) f.a().findViewById(R.id.setup_wizard_layout)).q(efsl.class);
            efsm efsmVar = new efsm(this);
            efsmVar.b(R.string.common_next);
            efsmVar.b = new afep(this);
            efsmVar.c = 5;
            efsmVar.d = R.style.SudGlifButton_Primary;
            efslVar.b(efsmVar.a());
            efsm efsmVar2 = new efsm(this);
            efsmVar2.b(R.string.common_skip);
            efsmVar2.b = new afeq(this);
            efsmVar2.c = 7;
            efsmVar2.d = R.style.SudGlifButton_Secondary;
            efslVar.c(efsmVar2.a());
        }
        setTitle(((Account) s().a(h)).name);
        f.c(getTitle());
        atmr.e(f.a());
        this.i = (atmh) gY().h("skip dialog");
    }
}

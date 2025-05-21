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
import defpackage.aano;
import defpackage.aapt;
import defpackage.adem;
import defpackage.aden;
import defpackage.adeo;
import defpackage.adep;
import defpackage.adeq;
import defpackage.ader;
import defpackage.adlg;
import defpackage.arjr;
import defpackage.arjs;
import defpackage.arkc;
import defpackage.arkf;
import defpackage.asnv;
import defpackage.asqh;
import defpackage.bp;
import defpackage.byhr;
import defpackage.dfaq;
import defpackage.dvni;
import defpackage.edfq;
import defpackage.edfr;
import defpackage.edjy;
import defpackage.fkdk;
import defpackage.vfv;
import java.util.Arrays;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class DmSetScreenlockChimeraActivity extends adlg implements edjy, arjr {
    public static final aano h = new aano("account");
    arjs i;
    private final aapt j = new aapt(AppContextProvider.a());
    private final adem k = adem.a();

    @Override // defpackage.adkg
    protected final String gG() {
        return "DmSetScreenlockActivity";
    }

    @Override // defpackage.edjy
    public final void gs() {
        k();
    }

    @Override // defpackage.edjy
    public final void jw() {
        startActivityForResult(new Intent(true != asqh.a() ? "android.app.action.SET_NEW_PASSWORD" : "android.app.action.SET_NEW_PARENT_PROFILE_PASSWORD"), 1);
    }

    public final void k() {
        arjs arjsVar = this.i;
        if (arjsVar != null) {
            arjsVar.dismissAllowingStateLoss();
        }
        this.i = arjs.y(getString(R.string.auth_device_management_screenlock_skip_message), getString(R.string.auth_common_switch_accounts), getString(R.string.auth_common_go_back), false);
        bp bpVar = new bp(gI());
        bpVar.v(this.i, "skip dialog");
        bpVar.b();
    }

    @Override // defpackage.arjr
    public final void n(arjs arjsVar, int i) {
        if (i == 1 && this.i == arjsVar) {
            gD(1, null);
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            gD(-1, null);
        }
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        k();
    }

    @Override // defpackage.adlg, defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        new byhr();
        if (((KeyguardManager) getSystemService("keyguard")).isDeviceSecure()) {
            dvni dvniVar = vfv.a;
            adem ademVar = this.k;
            synchronized (ademVar.c) {
                asnv asnvVar = ademVar.b;
                long elapsedRealtime = SystemClock.elapsedRealtime();
                long j = ademVar.a;
                if (j != -1 && elapsedRealtime <= j + 30000) {
                }
                ademVar.a = elapsedRealtime;
                dfaq g = this.j.g(9, Arrays.asList("authzen", "PublicKey"), "ForceRegistration", (Account) getIntent().getParcelableExtra(h.a), null);
                g.z(new ader());
                g.a(new adeq());
                g.y(new adep());
            }
            gD(2, null);
        }
        arkf f = arkf.f(this, arkc.i(t().a) ? fkdk.d() ? R.layout.auth_device_management_screenlock_glif_v2 : R.layout.auth_device_management_screenlock_glif : R.layout.auth_device_management_screenlock);
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
            edfq edfqVar = (edfq) ((GlifLayout) f.a().findViewById(R.id.setup_wizard_layout)).q(edfq.class);
            edfr edfrVar = new edfr(this);
            edfrVar.b(R.string.common_next);
            edfrVar.b = new aden(this);
            edfrVar.c = 5;
            edfrVar.d = R.style.SudGlifButton_Primary;
            edfqVar.b(edfrVar.a());
            edfr edfrVar2 = new edfr(this);
            edfrVar2.b(R.string.common_skip);
            edfrVar2.b = new adeo(this);
            edfrVar2.c = 7;
            edfrVar2.d = R.style.SudGlifButton_Secondary;
            edfqVar.c(edfrVar2.a());
        }
        setTitle(((Account) s().a(h)).name);
        f.c(getTitle());
        arkc.e(f.a());
        this.i = (arjs) gI().h("skip dialog");
    }
}

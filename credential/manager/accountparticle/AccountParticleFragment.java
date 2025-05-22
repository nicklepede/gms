package com.google.android.gms.credential.manager.accountparticle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.R;
import com.google.android.gms.credential.manager.accountparticle.AccountParticleFragment;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import defpackage.avym;
import defpackage.avyn;
import defpackage.avyo;
import defpackage.avyp;
import defpackage.avyq;
import defpackage.avys;
import defpackage.avyt;
import defpackage.axih;
import defpackage.azda;
import defpackage.dg;
import defpackage.dvzi;
import defpackage.dwbh;
import defpackage.dwcc;
import defpackage.dwjd;
import defpackage.fxqu;
import defpackage.fxwd;
import defpackage.fxwo;
import defpackage.fxxg;
import defpackage.fxxm;
import defpackage.fxya;
import defpackage.juq;
import defpackage.jxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class AccountParticleFragment extends avys {
    public azda a;
    public avyt ag;
    private final fxqu ah;
    public dwjd b;
    public dwbh c;
    public dvzi d;

    public AccountParticleFragment() {
        int i = fxya.a;
        this.ah = new jxm(new fxxg(axih.class), new avyo(this), new avyq(this), new avyp(this));
    }

    public static final void z(dg dgVar, Runnable runnable) {
        ((Activity) dgVar.requireContext()).runOnUiThread(runnable);
    }

    @Override // defpackage.dg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        juq lifecycle = getLifecycle();
        dwjd dwjdVar = this.b;
        if (dwjdVar == null) {
            fxxm.j("accountsModelUpdater");
            dwjdVar = null;
        }
        lifecycle.b(dwjdVar);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fxxm.f(layoutInflater, "layoutInflater");
        avyt avytVar = this.ag;
        dwbh dwbhVar = null;
        if (avytVar == null) {
            fxxm.j("accountMenuManagerFactory");
            avytVar = null;
        }
        this.c = avytVar.a(new fxwd() { // from class: avyi
            @Override // defpackage.fxwd
            public final Object a() {
                AccountParticleFragment.this.x().a("pwm.constant.LocalAccount");
                return fxrq.a;
            }
        });
        this.d = new avym(this);
        View inflate = layoutInflater.inflate(R.layout.pwm_selected_account_disc, viewGroup, false);
        SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) inflate.findViewById(R.id.pwm_selected_account_disc);
        dwbh dwbhVar2 = this.c;
        if (dwbhVar2 == null) {
            fxxm.j("accountMenuManager");
        } else {
            dwbhVar = dwbhVar2;
        }
        dwcc.a(this, dwbhVar, selectedAccountDisc);
        fxxm.e(inflate, "apply(...)");
        x().b.g(getViewLifecycleOwner(), new avyn(new fxwo() { // from class: avyj
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                String str = (String) obj;
                fxxm.f(str, "newAccountName");
                azda azdaVar = AccountParticleFragment.this.a;
                if (azdaVar == null) {
                    fxxm.j("accountSwitcher");
                    azdaVar = null;
                }
                azdaVar.a(str);
                return fxrq.a;
            }
        }));
        return inflate;
    }

    @Override // defpackage.dg
    public final void onPause() {
        super.onPause();
        dwbh dwbhVar = this.c;
        if (dwbhVar == null) {
            fxxm.j("accountMenuManager");
            dwbhVar = null;
        }
        dwbhVar.b.d(y());
    }

    @Override // defpackage.dg
    public final void onResume() {
        super.onResume();
        dwbh dwbhVar = this.c;
        dwbh dwbhVar2 = null;
        if (dwbhVar == null) {
            fxxm.j("accountMenuManager");
            dwbhVar = null;
        }
        dwbhVar.b.c(y());
        dvzi y = y();
        dwbh dwbhVar3 = this.c;
        if (dwbhVar3 == null) {
            fxxm.j("accountMenuManager");
        } else {
            dwbhVar2 = dwbhVar3;
        }
        y.a(dwbhVar2.b.b());
    }

    public final axih x() {
        return (axih) this.ah.a();
    }

    public final dvzi y() {
        dvzi dvziVar = this.d;
        if (dvziVar != null) {
            return dvziVar;
        }
        fxxm.j("accountSelectedObserver");
        return null;
    }
}

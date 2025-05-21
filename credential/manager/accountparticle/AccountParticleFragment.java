package com.google.android.gms.credential.manager.accountparticle;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.chimera.android.Activity;
import com.google.android.gms.R;
import com.google.android.gms.credential.manager.accountparticle.AccountParticleFragment;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import defpackage.atuj;
import defpackage.atuk;
import defpackage.atul;
import defpackage.atum;
import defpackage.atun;
import defpackage.atup;
import defpackage.atuq;
import defpackage.avei;
import defpackage.awza;
import defpackage.dg;
import defpackage.dtow;
import defpackage.dtqv;
import defpackage.dtrq;
import defpackage.dtyr;
import defpackage.fuuw;
import defpackage.fvaf;
import defpackage.fvaq;
import defpackage.fvbi;
import defpackage.fvbo;
import defpackage.fvcc;
import defpackage.job;
import defpackage.jqx;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class AccountParticleFragment extends atup {
    public awza a;
    public atuq ag;
    private final fuuw ah;
    public dtyr b;
    public dtqv c;
    public dtow d;

    public AccountParticleFragment() {
        int i = fvcc.a;
        this.ah = new jqx(new fvbi(avei.class), new atul(this), new atun(this), new atum(this));
    }

    public static final void z(dg dgVar, Runnable runnable) {
        ((Activity) dgVar.requireContext()).runOnUiThread(runnable);
    }

    @Override // defpackage.dg
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        job lifecycle = getLifecycle();
        dtyr dtyrVar = this.b;
        if (dtyrVar == null) {
            fvbo.j("accountsModelUpdater");
            dtyrVar = null;
        }
        lifecycle.b(dtyrVar);
    }

    @Override // defpackage.dg
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        fvbo.f(layoutInflater, "layoutInflater");
        atuq atuqVar = this.ag;
        dtqv dtqvVar = null;
        if (atuqVar == null) {
            fvbo.j("accountMenuManagerFactory");
            atuqVar = null;
        }
        this.c = atuqVar.a(new fvaf() { // from class: atuf
            @Override // defpackage.fvaf
            public final Object a() {
                AccountParticleFragment.this.x().a("pwm.constant.LocalAccount");
                return fuvs.a;
            }
        });
        this.d = new atuj(this);
        View inflate = layoutInflater.inflate(R.layout.pwm_selected_account_disc, viewGroup, false);
        SelectedAccountDisc selectedAccountDisc = (SelectedAccountDisc) inflate.findViewById(R.id.pwm_selected_account_disc);
        dtqv dtqvVar2 = this.c;
        if (dtqvVar2 == null) {
            fvbo.j("accountMenuManager");
        } else {
            dtqvVar = dtqvVar2;
        }
        dtrq.a(this, dtqvVar, selectedAccountDisc);
        fvbo.e(inflate, "apply(...)");
        x().b.g(getViewLifecycleOwner(), new atuk(new fvaq() { // from class: atug
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                String str = (String) obj;
                fvbo.f(str, "newAccountName");
                awza awzaVar = AccountParticleFragment.this.a;
                if (awzaVar == null) {
                    fvbo.j("accountSwitcher");
                    awzaVar = null;
                }
                awzaVar.a(str);
                return fuvs.a;
            }
        }));
        return inflate;
    }

    @Override // defpackage.dg
    public final void onPause() {
        super.onPause();
        dtqv dtqvVar = this.c;
        if (dtqvVar == null) {
            fvbo.j("accountMenuManager");
            dtqvVar = null;
        }
        dtqvVar.b.d(y());
    }

    @Override // defpackage.dg
    public final void onResume() {
        super.onResume();
        dtqv dtqvVar = this.c;
        dtqv dtqvVar2 = null;
        if (dtqvVar == null) {
            fvbo.j("accountMenuManager");
            dtqvVar = null;
        }
        dtqvVar.b.c(y());
        dtow y = y();
        dtqv dtqvVar3 = this.c;
        if (dtqvVar3 == null) {
            fvbo.j("accountMenuManager");
        } else {
            dtqvVar2 = dtqvVar3;
        }
        y.a(dtqvVar2.b.b());
    }

    public final avei x() {
        return (avei) this.ah.a();
    }

    public final dtow y() {
        dtow dtowVar = this.d;
        if (dtowVar != null) {
            return dtowVar;
        }
        fvbo.j("accountSelectedObserver");
        return null;
    }
}

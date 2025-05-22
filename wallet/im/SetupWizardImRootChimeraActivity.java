package com.google.android.gms.wallet.im;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.gms.wallet.setupwizard.WalletGlifLayout;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import com.google.android.wallet.clientlog.LogContext;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import defpackage.atzb;
import defpackage.dkys;
import defpackage.dlcx;
import defpackage.dldc;
import defpackage.dlqr;
import defpackage.efvb;
import defpackage.ehqn;
import defpackage.eicc;
import defpackage.eijr;
import defpackage.ekmu;
import defpackage.eknk;
import defpackage.ekrf;
import defpackage.ekrh;
import defpackage.ekrp;
import defpackage.fgtg;
import defpackage.fvyq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SetupWizardImRootChimeraActivity extends ImRootChimeraActivity implements dkys {
    WalletGlifLayout n;
    private ekmu o;

    @Override // defpackage.dkqk, defpackage.dkys
    public final void C(Bundle bundle) {
        bundle.putBoolean("savedSpinnerState", P());
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity, defpackage.dkqk, defpackage.dkys
    public final void L(boolean z) {
        WalletGlifLayout walletGlifLayout = this.n;
        if (walletGlifLayout != null) {
            walletGlifLayout.K(z);
        }
    }

    @Override // defpackage.dkqk, defpackage.dkys
    public final boolean P() {
        WalletGlifLayout walletGlifLayout = this.n;
        return walletGlifLayout != null && walletGlifLayout.N();
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity
    protected final int Z() {
        return R.layout.wallet_activity_setupwizard_instrument_manager;
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity
    protected final dlcx ac() {
        if (this.h == null) {
            BuyFlowConfig l = l();
            String str = this.a;
            byte[] bArr = this.i;
            boolean z = this.j;
            boolean z2 = this.k;
            LogContext logContext = this.b;
            atzb.m(bArr != null, "InstrumentManager parameters must not be null.");
            dldc dldcVar = new dldc();
            Bundle bY = dlqr.bY(l, str, logContext);
            bY.putByteArray("instrumentManagerParams", bArr);
            bY.putBoolean("isDialog", z);
            bY.putBoolean("showCancelButton", z2);
            dldcVar.setArguments(bY);
            return dldcVar;
        }
        BuyFlowConfig l2 = l();
        String str2 = this.a;
        ekrp ekrpVar = this.h;
        boolean z3 = this.j;
        boolean z4 = this.k;
        LogContext logContext2 = this.b;
        boolean z5 = this.l;
        boolean z6 = this.m;
        atzb.m(ekrpVar != null, "ActionToken must not be null.");
        ekrf ekrfVar = ekrpVar.d;
        if (ekrfVar == null) {
            ekrfVar = ekrf.a;
        }
        atzb.m((ekrfVar.b & 2) != 0, "ActionToken must have a ResponseContext.");
        dldc dldcVar2 = new dldc();
        Bundle bY2 = dlqr.bY(l2, str2, logContext2);
        ehqn.j(bY2, "actionToken", ekrpVar);
        bY2.putBoolean("isDialog", z3);
        bY2.putBoolean("showCancelButton", z4);
        bY2.putBoolean("showTitleInHeader", z5);
        bY2.putBoolean("showHeaderSeparator", z6);
        dldcVar2.setArguments(bY2);
        return dldcVar2;
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity
    protected final void ae() {
        Drawable ar;
        String string;
        ImageView b;
        WalletGlifLayout walletGlifLayout = (WalletGlifLayout) findViewById(R.id.setup_wizard_layout);
        this.n = walletGlifLayout;
        if (walletGlifLayout != null) {
            ekmu ekmuVar = this.o;
            if (ekmuVar != null) {
                ar = ImageWithCaptionView.j(ekmuVar, this);
                string = this.o.k;
            } else {
                ar = eijr.ar(this);
                ar.setTintList(this.n.n);
                string = getResources().getString(R.string.wallet_activity_default_title);
            }
            this.n.I(ar);
            if (fvyq.e() && (b = ((efvb) this.n.q(efvb.class)).b()) != null) {
                b.setContentDescription(string);
            }
            this.n.b(getTitle());
        }
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity
    protected final boolean af(ekrh ekrhVar) {
        if (fvyq.a.lK().h()) {
            return false;
        }
        return super.af(ekrhVar);
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity, defpackage.dkqk
    protected final Intent i() {
        Intent i = super.i();
        eicc.g(i, eicc.i(getIntent()));
        return i;
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity, defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        this.l = false;
        this.m = false;
        Intent intent = getIntent();
        super.onCreate(bundle);
        if (intent.hasExtra("com.google.android.gms.wallet.im.SetupWizardImRootChimeraActivity.EXTRA_GLIF_ICON")) {
            this.o = (ekmu) ehqn.b(intent, "com.google.android.gms.wallet.im.SetupWizardImRootChimeraActivity.EXTRA_GLIF_ICON", (fgtg) ekmu.a.iQ(7, null));
            ae();
        }
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity, defpackage.rhf, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        WalletGlifLayout walletGlifLayout = this.n;
        if (walletGlifLayout != null) {
            walletGlifLayout.b(charSequence);
        }
    }

    @Override // defpackage.dkqk, defpackage.dkys
    public final void s(Bundle bundle) {
        L(bundle.getBoolean("savedSpinnerState"));
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity
    protected final void ad() {
    }

    @Override // defpackage.dkqk, defpackage.dkys
    public final void I(String str) {
    }

    @Override // defpackage.dkqk, defpackage.dkys
    public final void G(eknk eknkVar, boolean z) {
    }
}

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
import defpackage.arwm;
import defpackage.dinh;
import defpackage.dirm;
import defpackage.dirr;
import defpackage.djey;
import defpackage.edig;
import defpackage.efdk;
import defpackage.efoz;
import defpackage.efwo;
import defpackage.ehzo;
import defpackage.eiae;
import defpackage.eidz;
import defpackage.eieb;
import defpackage.eiej;
import defpackage.feen;
import defpackage.ftcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SetupWizardImRootChimeraActivity extends ImRootChimeraActivity implements dinh {
    WalletGlifLayout n;
    private ehzo o;

    @Override // defpackage.diez, defpackage.dinh
    public final void C(Bundle bundle) {
        bundle.putBoolean("savedSpinnerState", P());
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity, defpackage.diez, defpackage.dinh
    public final void L(boolean z) {
        WalletGlifLayout walletGlifLayout = this.n;
        if (walletGlifLayout != null) {
            walletGlifLayout.K(z);
        }
    }

    @Override // defpackage.diez, defpackage.dinh
    public final boolean P() {
        WalletGlifLayout walletGlifLayout = this.n;
        return walletGlifLayout != null && walletGlifLayout.N();
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity
    protected final int Z() {
        return R.layout.wallet_activity_setupwizard_instrument_manager;
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity
    protected final dirm ac() {
        if (this.h == null) {
            BuyFlowConfig l = l();
            String str = this.a;
            byte[] bArr = this.i;
            boolean z = this.j;
            boolean z2 = this.k;
            LogContext logContext = this.b;
            arwm.m(bArr != null, "InstrumentManager parameters must not be null.");
            dirr dirrVar = new dirr();
            Bundle bZ = djey.bZ(l, str, logContext);
            bZ.putByteArray("instrumentManagerParams", bArr);
            bZ.putBoolean("isDialog", z);
            bZ.putBoolean("showCancelButton", z2);
            dirrVar.setArguments(bZ);
            return dirrVar;
        }
        BuyFlowConfig l2 = l();
        String str2 = this.a;
        eiej eiejVar = this.h;
        boolean z3 = this.j;
        boolean z4 = this.k;
        LogContext logContext2 = this.b;
        boolean z5 = this.l;
        boolean z6 = this.m;
        arwm.m(eiejVar != null, "ActionToken must not be null.");
        eidz eidzVar = eiejVar.d;
        if (eidzVar == null) {
            eidzVar = eidz.a;
        }
        arwm.m((eidzVar.b & 2) != 0, "ActionToken must have a ResponseContext.");
        dirr dirrVar2 = new dirr();
        Bundle bZ2 = djey.bZ(l2, str2, logContext2);
        efdk.j(bZ2, "actionToken", eiejVar);
        bZ2.putBoolean("isDialog", z3);
        bZ2.putBoolean("showCancelButton", z4);
        bZ2.putBoolean("showTitleInHeader", z5);
        bZ2.putBoolean("showHeaderSeparator", z6);
        dirrVar2.setArguments(bZ2);
        return dirrVar2;
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity
    protected final void ae() {
        Drawable ar;
        String string;
        ImageView b;
        WalletGlifLayout walletGlifLayout = (WalletGlifLayout) findViewById(R.id.setup_wizard_layout);
        this.n = walletGlifLayout;
        if (walletGlifLayout != null) {
            ehzo ehzoVar = this.o;
            if (ehzoVar != null) {
                ar = ImageWithCaptionView.j(ehzoVar, this);
                string = this.o.k;
            } else {
                ar = efwo.ar(this);
                ar.setTintList(this.n.n);
                string = getResources().getString(R.string.wallet_activity_default_title);
            }
            this.n.I(ar);
            if (ftcw.e() && (b = ((edig) this.n.q(edig.class)).b()) != null) {
                b.setContentDescription(string);
            }
            this.n.b(getTitle());
        }
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity
    protected final boolean af(eieb eiebVar) {
        if (ftcw.a.a().h()) {
            return false;
        }
        return super.af(eiebVar);
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity, defpackage.diez
    protected final Intent i() {
        Intent i = super.i();
        efoz.g(i, efoz.i(getIntent()));
        return i;
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity, defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        this.l = false;
        this.m = false;
        Intent intent = getIntent();
        super.onCreate(bundle);
        if (intent.hasExtra("com.google.android.gms.wallet.im.SetupWizardImRootChimeraActivity.EXTRA_GLIF_ICON")) {
            this.o = (ehzo) efdk.b(intent, "com.google.android.gms.wallet.im.SetupWizardImRootChimeraActivity.EXTRA_GLIF_ICON", (feen) ehzo.a.iB(7, null));
            ae();
        }
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity, defpackage.pob, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        WalletGlifLayout walletGlifLayout = this.n;
        if (walletGlifLayout != null) {
            walletGlifLayout.b(charSequence);
        }
    }

    @Override // defpackage.diez, defpackage.dinh
    public final void s(Bundle bundle) {
        L(bundle.getBoolean("savedSpinnerState"));
    }

    @Override // com.google.android.gms.wallet.im.ImRootChimeraActivity
    protected final void ad() {
    }

    @Override // defpackage.diez, defpackage.dinh
    public final void I(String str) {
    }

    @Override // defpackage.diez, defpackage.dinh
    public final void G(eiae eiaeVar, boolean z) {
    }
}

package com.google.android.gms.wallet.setupwizard;

import android.accounts.Account;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.R;
import defpackage.dkqk;
import defpackage.dlov;
import defpackage.ehqn;
import defpackage.eicc;
import defpackage.eknk;
import defpackage.fdft;
import defpackage.fvyq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PaymentsSetupWizardChimeraActivity extends dkqk {
    protected Account h;
    protected fdft i;
    protected String j;
    protected WalletGlifLayout k;
    protected int l;

    @Override // defpackage.dkqk, defpackage.dkys
    public final void C(Bundle bundle) {
        bundle.putBoolean("savedSpinnerState", P());
    }

    @Override // defpackage.dkqk, defpackage.dkys
    public final void L(boolean z) {
        WalletGlifLayout walletGlifLayout = this.k;
        if (walletGlifLayout != null) {
            walletGlifLayout.K(z);
        }
    }

    @Override // defpackage.dkqk, defpackage.dkys
    public final boolean P() {
        WalletGlifLayout walletGlifLayout = this.k;
        return walletGlifLayout != null && walletGlifLayout.N();
    }

    protected dlov Z() {
        return dlov.ac(l(), this.a, this.i, this.j, false, this.l, this.b);
    }

    protected final String aa() {
        return eicc.i(getIntent());
    }

    public final void ab(Drawable drawable) {
        this.k.I(drawable);
    }

    public final void ac(String str) {
        View o = this.k.o(R.id.sud_layout_icon);
        if (o != null) {
            if (!fvyq.e() || TextUtils.isEmpty(str)) {
                o.setContentDescription(null);
                o.setImportantForAccessibility(2);
            } else {
                o.setContentDescription(str);
                o.setImportantForAccessibility(1);
            }
        }
    }

    @Override // defpackage.dkqk, defpackage.efzb
    public final Account ll() {
        return this.h;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0 A[LOOP:1: B:61:0x0098->B:68:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9 A[SYNTHETIC] */
    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r20) {
        /*
            Method dump skipped, instructions count: 569
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.setupwizard.PaymentsSetupWizardChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.dkqk, defpackage.rhf, defpackage.rxc, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("account", this.h);
        ehqn.j(bundle, "initializeResponse", this.i);
    }

    @Override // defpackage.rhf, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        WalletGlifLayout walletGlifLayout = this.k;
        if (walletGlifLayout != null) {
            walletGlifLayout.b(charSequence);
        }
    }

    @Override // defpackage.dkqk, defpackage.dkys
    public final void s(Bundle bundle) {
        L(bundle.getBoolean("savedSpinnerState"));
    }

    @Override // defpackage.dkqk, defpackage.dkys
    public final void I(String str) {
    }

    @Override // defpackage.dkqk, defpackage.dkys
    public final void G(eknk eknkVar, boolean z) {
    }
}

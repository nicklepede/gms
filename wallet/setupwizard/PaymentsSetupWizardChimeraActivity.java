package com.google.android.gms.wallet.setupwizard;

import android.accounts.Account;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.R;
import defpackage.diez;
import defpackage.djdc;
import defpackage.efdk;
import defpackage.efoz;
import defpackage.eiae;
import defpackage.fare;
import defpackage.ftcw;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PaymentsSetupWizardChimeraActivity extends diez {
    protected Account h;
    protected fare i;
    protected String j;
    protected WalletGlifLayout k;
    protected int l;

    @Override // defpackage.diez, defpackage.dinh
    public final void C(Bundle bundle) {
        bundle.putBoolean("savedSpinnerState", P());
    }

    @Override // defpackage.diez, defpackage.dinh
    public final void L(boolean z) {
        WalletGlifLayout walletGlifLayout = this.k;
        if (walletGlifLayout != null) {
            walletGlifLayout.K(z);
        }
    }

    @Override // defpackage.diez, defpackage.dinh
    public final boolean P() {
        WalletGlifLayout walletGlifLayout = this.k;
        return walletGlifLayout != null && walletGlifLayout.N();
    }

    protected djdc Z() {
        return djdc.ac(l(), this.a, this.i, this.j, false, this.l, this.b);
    }

    protected final String aa() {
        return efoz.i(getIntent());
    }

    public final void ab(Drawable drawable) {
        this.k.I(drawable);
    }

    public final void ac(String str) {
        View o = this.k.o(R.id.sud_layout_icon);
        if (o != null) {
            if (!ftcw.e() || TextUtils.isEmpty(str)) {
                o.setContentDescription(null);
                o.setImportantForAccessibility(2);
            } else {
                o.setContentDescription(str);
                o.setImportantForAccessibility(1);
            }
        }
    }

    @Override // defpackage.diez, defpackage.edmf
    public final Account kW() {
        return this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e0 A[LOOP:1: B:61:0x0098->B:68:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [feeg, java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v4 */
    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r19) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.setupwizard.PaymentsSetupWizardChimeraActivity.onCreate(android.os.Bundle):void");
    }

    @Override // defpackage.diez, defpackage.pob, defpackage.qdy, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("account", this.h);
        efdk.j(bundle, "initializeResponse", this.i);
    }

    @Override // defpackage.pob, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        WalletGlifLayout walletGlifLayout = this.k;
        if (walletGlifLayout != null) {
            walletGlifLayout.b(charSequence);
        }
    }

    @Override // defpackage.diez, defpackage.dinh
    public final void s(Bundle bundle) {
        L(bundle.getBoolean("savedSpinnerState"));
    }

    @Override // defpackage.diez, defpackage.dinh
    public final void I(String str) {
    }

    @Override // defpackage.diez, defpackage.dinh
    public final void G(eiae eiaeVar, boolean z) {
    }
}

package com.google.android.gms.auth.uiflows.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupdesign.SetupWizardLayout;
import defpackage.acnd;
import defpackage.acne;
import defpackage.acnh;
import defpackage.afkx;
import defpackage.efsu;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class SetupWizardAuthAccountLayout extends SetupWizardLayout implements acne, acnh {
    public SetupWizardAuthAccountLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.acne
    public final void a(boolean z) {
        t().b.setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.acne
    public final void d(acnd acndVar) {
        t().a(new afkx(acndVar));
    }

    @Override // defpackage.acne
    public final void e(CharSequence charSequence) {
        ((TextView) findViewById(R.id.message)).setText(charSequence);
    }

    @Override // defpackage.acne
    public final void f() {
        t().a.setEnabled(false);
    }

    @Override // defpackage.acne
    public final void g() {
        v(true);
    }

    @Override // defpackage.acnh
    public final void h(Window window, Context context) {
        ((efsu) q(efsu.class)).b(window, context);
    }

    @Override // defpackage.acnh
    public final void i(Window window) {
        efsu.c(window);
    }

    @Override // defpackage.acnh
    public final void j(Window window) {
        i(window);
    }

    public SetupWizardAuthAccountLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SetupWizardAuthAccountLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.auth_setup_wizard_auth_account_layout, this);
    }

    @Override // defpackage.acne
    public final /* synthetic */ void c(int i) {
    }
}

package com.google.android.gms.auth.uiflows.common;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupdesign.SetupWizardLayout;
import defpackage.aand;
import defpackage.aane;
import defpackage.aanh;
import defpackage.adkq;
import defpackage.edfz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class SetupWizardAuthAccountLayout extends SetupWizardLayout implements aane, aanh {
    public SetupWizardAuthAccountLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.aane
    public final void a(boolean z) {
        t().b.setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.aane
    public final void d(aand aandVar) {
        t().a(new adkq(aandVar));
    }

    @Override // defpackage.aane
    public final void e(CharSequence charSequence) {
        ((TextView) findViewById(R.id.message)).setText(charSequence);
    }

    @Override // defpackage.aane
    public final void f() {
        t().a.setEnabled(false);
    }

    @Override // defpackage.aane
    public final void g() {
        v(true);
    }

    @Override // defpackage.aanh
    public final void h(Window window, Context context) {
        ((edfz) q(edfz.class)).b(window, context);
    }

    @Override // defpackage.aanh
    public final void i(Window window) {
        edfz.c(window);
    }

    @Override // defpackage.aanh
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

    @Override // defpackage.aane
    public final /* synthetic */ void c(int i) {
    }
}

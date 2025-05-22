package com.google.android.gms.wallet.setupwizard;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLoadingLayout;
import defpackage.dlop;
import defpackage.dlox;
import defpackage.efsl;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class WalletGlifLayout extends GlifLoadingLayout {
    private dlox f;

    public WalletGlifLayout(Context context) {
        super(context, 0, 0);
        g(null, R.attr.sudLayoutTheme);
    }

    private final void g(AttributeSet attributeSet, int i) {
        dlox dloxVar = new dlox(this, attributeSet, i);
        this.f = dloxVar;
        s(efsl.class, dloxVar);
    }

    public final void c() {
        super.onFinishInflate();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        dlop dlopVar;
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(getClass().getClassLoader());
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        dlox dloxVar = this.f;
        if (dloxVar == null || (dlopVar = dloxVar.c) == null) {
            return;
        }
        dlopVar.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        dlop dlopVar;
        dlox dloxVar = this.f;
        Parcelable bundle = (dloxVar == null || (dlopVar = dloxVar.c) == null) ? new Bundle() : dlopVar.onSaveInstanceState();
        ((Bundle) bundle).putParcelable("superSavedInstanceState", super.onSaveInstanceState());
        return bundle;
    }

    public WalletGlifLayout(Context context, int i) {
        super(context, i, 0);
        g(null, R.attr.sudLayoutTheme);
    }

    public WalletGlifLayout(Context context, int i, int i2) {
        super(context, i, i2);
        g(null, R.attr.sudLayoutTheme);
    }

    public WalletGlifLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        g(attributeSet, R.attr.sudLayoutTheme);
    }

    public WalletGlifLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        g(attributeSet, i);
    }
}

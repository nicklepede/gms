package com.google.android.gms.wallet.setupwizard;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLoadingLayout;
import defpackage.djcw;
import defpackage.djde;
import defpackage.edfq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class WalletGlifLayout extends GlifLoadingLayout {
    private djde f;

    public WalletGlifLayout(Context context) {
        super(context, 0, 0);
        g(null, R.attr.sudLayoutTheme);
    }

    private final void g(AttributeSet attributeSet, int i) {
        djde djdeVar = new djde(this, attributeSet, i);
        this.f = djdeVar;
        s(edfq.class, djdeVar);
    }

    public final void c() {
        super.onFinishInflate();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        djcw djcwVar;
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        bundle.setClassLoader(getClass().getClassLoader());
        super.onRestoreInstanceState(bundle.getParcelable("superSavedInstanceState"));
        djde djdeVar = this.f;
        if (djdeVar == null || (djcwVar = djdeVar.c) == null) {
            return;
        }
        djcwVar.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        djcw djcwVar;
        djde djdeVar = this.f;
        Parcelable bundle = (djdeVar == null || (djcwVar = djdeVar.c) == null) ? new Bundle() : djcwVar.onSaveInstanceState();
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

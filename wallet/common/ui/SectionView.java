package com.google.android.gms.wallet.common.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.efwo;
import defpackage.efze;
import defpackage.efzj;
import defpackage.efzk;
import defpackage.efzl;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class SectionView extends LinearLayout implements View.OnClickListener, efzl, efze, efzj {
    public View a;
    public ViewGroup b;
    public View c;
    public View d;
    public final efzk e;

    public SectionView(Context context) {
        super(context);
        this.e = new efzk();
    }

    @Override // defpackage.efzj
    public final void G() {
        efwo.C(getRootView());
        efwo.ai(getContext(), this);
    }

    @Override // defpackage.efze
    public final void b() {
        boolean z = this.e.c;
        this.a.setVisibility(true != z ? 0 : 8);
        int i = true != z ? 8 : 0;
        this.b.setVisibility(i);
        this.c.setVisibility(i);
    }

    @Override // defpackage.efzl
    public final efzk ld() {
        return this.e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        efzk efzkVar = this.e;
        if (!efzkVar.c) {
            efzkVar.m(true);
            return;
        }
        efwo.C(getRootView());
        efwo.ai(getContext(), this);
        efzkVar.l(true);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
        this.e.q(bundle.getParcelable("expandedInstanceState"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putParcelable("expandedInstanceState", this.e.b());
        return bundle;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.c.setEnabled(z);
        efwo.N(this.c, z);
        this.a.setEnabled(z);
        efwo.N(this.a, z);
        this.d.setEnabled(z);
    }

    public SectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new efzk();
    }

    public SectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new efzk();
    }

    @Override // defpackage.efze
    public final void c() {
    }
}

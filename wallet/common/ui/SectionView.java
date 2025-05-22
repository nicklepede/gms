package com.google.android.gms.wallet.common.ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import defpackage.eijr;
import defpackage.eimh;
import defpackage.eimm;
import defpackage.eimn;
import defpackage.eimo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class SectionView extends LinearLayout implements View.OnClickListener, eimo, eimh, eimm {
    public View a;
    public ViewGroup b;
    public View c;
    public View d;
    public final eimn e;

    public SectionView(Context context) {
        super(context);
        this.e = new eimn();
    }

    @Override // defpackage.eimm
    public final void G() {
        eijr.C(getRootView());
        eijr.ai(getContext(), this);
    }

    @Override // defpackage.eimh
    public final void b() {
        boolean z = this.e.c;
        this.a.setVisibility(true != z ? 0 : 8);
        int i = true != z ? 8 : 0;
        this.b.setVisibility(i);
        this.c.setVisibility(i);
    }

    @Override // defpackage.eimo
    public final eimn ls() {
        return this.e;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        eimn eimnVar = this.e;
        if (!eimnVar.c) {
            eimnVar.m(true);
            return;
        }
        eijr.C(getRootView());
        eijr.ai(getContext(), this);
        eimnVar.l(true);
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
        eijr.N(this.c, z);
        this.a.setEnabled(z);
        eijr.N(this.a, z);
        this.d.setEnabled(z);
    }

    public SectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = new eimn();
    }

    public SectionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new eimn();
    }

    @Override // defpackage.eimh
    public final void c() {
    }
}

package com.google.android.gms.wallet.common.ui;

import android.R;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.chimera.android.Activity;
import defpackage.dkxb;
import defpackage.eijr;
import defpackage.iwe;
import defpackage.msl;
import defpackage.mte;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CollapsibleCardContentsView extends LinearLayout implements View.OnClickListener {
    public Activity a;
    mte b;
    msl c;
    public boolean d;
    public FrameLayout e;
    public LinearLayout f;
    public CardHeaderView g;
    public int h;

    public CollapsibleCardContentsView(Context context) {
        super(context);
        this.h = 1;
    }

    private final mte b() {
        View findViewById;
        if (this.b == null && (findViewById = this.a.findViewById(R.id.content)) != null) {
            this.b = new mte();
            msl mslVar = new msl((ViewGroup) findViewById);
            this.c = mslVar;
            mslVar.b = new dkxb(this);
            this.b.d(mslVar, eijr.s());
        }
        return this.b;
    }

    public final void a(boolean z) {
        CardHeaderView cardHeaderView = this.g;
        if (cardHeaderView != null) {
            cardHeaderView.h = this.d;
            cardHeaderView.d(z);
            this.e.setContentDescription(this.g.a());
            CardHeaderView cardHeaderView2 = this.g;
            int[] iArr = iwe.a;
            cardHeaderView2.setImportantForAccessibility(2);
        }
        this.f.setVisibility(true != this.d ? 8 : 0);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.d = !this.d;
        CardHeaderView cardHeaderView = this.g;
        if (cardHeaderView != null) {
            cardHeaderView.requestFocus();
        }
        if (!eijr.S(this.a) || b() == null) {
            a(false);
        } else {
            b().e(this.c);
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.e = (FrameLayout) findViewById(com.google.android.gms.R.id.collapsed_card_container);
        LinearLayout linearLayout = (LinearLayout) findViewById(com.google.android.gms.R.id.expanded_card_container);
        this.f = linearLayout;
        linearLayout.setTag(com.google.android.gms.R.id.summary_expander_transition_name, "expandedField");
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
        int i = this.h;
        if (i == 2 || i == 4) {
            this.d = bundle.getBoolean("expandedState");
            a(false);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putBoolean("expandedState", this.d);
        return bundle;
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        this.e.setEnabled(z);
    }

    public CollapsibleCardContentsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = 1;
    }

    public CollapsibleCardContentsView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = 1;
    }
}

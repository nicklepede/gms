package com.google.android.gms.wallet.common.ui;

import android.content.Context;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import defpackage.efwh;
import defpackage.efwo;
import defpackage.ehqo;
import defpackage.eias;
import defpackage.iuf;
import defpackage.iuo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CardHeaderView extends LinearLayout implements View.OnClickListener {
    TextView a;
    TextView b;
    public LinearLayout c;
    public LinearLayout d;
    public ImageView e;
    public TransitionDrawable f;
    public ImageWithCaptionView g;
    boolean h;
    public boolean i;
    public ehqo j;
    public efwh k;
    public String l;
    public String m;

    public CardHeaderView(Context context) {
        super(context);
        this.h = true;
    }

    public final CharSequence a() {
        return this.h ? this.l : this.m;
    }

    public final void b(String str) {
        efwo.E(this.a, str);
    }

    public final void c(boolean z) {
        if (!this.i) {
            this.e.setVisibility(8);
            return;
        }
        this.e.setVisibility(0);
        this.e.setContentDescription(a());
        int i = true == z ? 400 : 0;
        if (this.h) {
            this.f.reverseTransition(i);
        } else {
            this.f.startTransition(i);
        }
    }

    public final void d(boolean z) {
        this.d.setVisibility(true != this.h ? 8 : 0);
        this.c.setVisibility(true != this.h ? 0 : 8);
        c(z);
        ehqo ehqoVar = this.j;
        if (ehqoVar != null) {
            b(this.h ? ehqoVar.c == 2 ? (String) ehqoVar.d : "" : ehqoVar.h);
            efwo.E(this.b, this.h ? this.j.f : this.j.i);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        efwh efwhVar;
        if (view != this.g || (efwhVar = this.k) == null) {
            return;
        }
        eias eiasVar = this.j.j;
        if (eiasVar == null) {
            eiasVar = eias.a;
        }
        efwhVar.co(eiasVar);
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        TextView textView = (TextView) findViewById(R.id.title);
        this.a = textView;
        int[] iArr = iuo.a;
        iuf.l(textView, "excludeViewFromChangeBounds");
        this.a.setTag(R.id.summary_expander_transition_name, "summaryField");
        TextView textView2 = (TextView) findViewById(R.id.subtitle);
        this.b = textView2;
        textView2.setTag(R.id.summary_expander_transition_name, "summaryField");
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.collapsed_image_container);
        this.c = linearLayout;
        linearLayout.setTag(R.id.summary_expander_transition_name, "summaryField");
        LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.expanded_image_container);
        this.d = linearLayout2;
        linearLayout2.setTag(R.id.summary_expander_transition_name, "summaryField");
        this.e = (ImageView) findViewById(R.id.expand_collapse_icon);
        ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) findViewById(R.id.tooltip_view);
        this.g = imageWithCaptionView;
        imageWithCaptionView.c(efwo.al(getContext(), 105, -1));
        this.g.setOnClickListener(this);
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        efwo.N(this, z);
    }

    public CardHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.h = true;
    }

    public CardHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.h = true;
    }
}

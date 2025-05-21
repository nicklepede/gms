package com.google.android.gms.accountsettings.mg.poc.ui.card.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.AdviceOverflowCardView;
import com.google.android.material.card.MaterialCardView;
import defpackage.bqnj;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.fvbo;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdviceOverflowCardView extends ConstraintLayout {
    public final fuuw h;
    public final fuuw i;
    private final fuuw j;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceOverflowCardView(Context context) {
        this(context, null, 0, 0, 14, null);
        fvbo.f(context, "context");
    }

    private final MaterialCardView g() {
        Object a = this.j.a();
        fvbo.e(a, "getValue(...)");
        return (MaterialCardView) a;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        g().r(bqnj.e(getContext(), g().n.d.M().getDefaultColor()));
        g().setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceOverflowCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceOverflowCardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdviceOverflowCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fvbo.f(context, "context");
        this.j = new fuvg(new fvaf() { // from class: scm
            @Override // defpackage.fvaf
            public final Object a() {
                return (MaterialCardView) AdviceOverflowCardView.this.findViewById(R.id.cardView);
            }
        });
        this.h = new fuvg(new fvaf() { // from class: scn
            @Override // defpackage.fvaf
            public final Object a() {
                return (TextView) AdviceOverflowCardView.this.findViewById(R.id.showAllTitle);
            }
        });
        this.i = new fuvg(new fvaf() { // from class: sco
            @Override // defpackage.fvaf
            public final Object a() {
                return (TextView) AdviceOverflowCardView.this.findViewById(R.id.overflowCount);
            }
        });
    }

    public /* synthetic */ AdviceOverflowCardView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}

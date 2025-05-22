package com.google.android.gms.accountsettings.mg.poc.ui.card.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.AdviceOverflowCardView;
import com.google.android.material.card.MaterialCardView;
import defpackage.bsuy;
import defpackage.fmkm;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.fxxm;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdviceOverflowCardView extends ConstraintLayout {
    private final fxqu h;
    private final fxqu i;
    private final fxqu j;
    private final fxqu k;
    private final fxqu l;
    private final fxqu m;
    private final fxqu n;
    private final fxqu o;
    private final fxqu p;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceOverflowCardView(Context context) {
        this(context, null, 0, 0, 14, null);
        fxxm.f(context, "context");
    }

    public final float g() {
        return ((Number) this.p.a()).floatValue();
    }

    public final float h() {
        return ((Number) this.o.a()).floatValue();
    }

    public final View i() {
        Object a = this.i.a();
        fxxm.e(a, "getValue(...)");
        return (View) a;
    }

    public final View j() {
        Object a = this.h.a();
        fxxm.e(a, "getValue(...)");
        return (View) a;
    }

    public final ImageView k() {
        Object a = this.n.a();
        fxxm.e(a, "getValue(...)");
        return (ImageView) a;
    }

    public final TextView l() {
        return (TextView) this.l.a();
    }

    public final TextView m() {
        Object a = this.k.a();
        fxxm.e(a, "getValue(...)");
        return (TextView) a;
    }

    public final TextView n() {
        Object a = this.m.a();
        fxxm.e(a, "getValue(...)");
        return (TextView) a;
    }

    public final MaterialCardView o() {
        Object a = this.j.a();
        fxxm.e(a, "getValue(...)");
        return (MaterialCardView) a;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        if (!fmkm.h()) {
            o().s(bsuy.d(getContext(), o().m.d.N().getDefaultColor()));
        }
        o().setOnClickListener(onClickListener);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceOverflowCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceOverflowCardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdviceOverflowCardView(final Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fxxm.f(context, "context");
        this.h = new fxre(new fxwd() { // from class: twc
            @Override // defpackage.fxwd
            public final Object a() {
                return AdviceOverflowCardView.this.findViewById(R.id.spaceTop);
            }
        });
        this.i = new fxre(new fxwd() { // from class: twd
            @Override // defpackage.fxwd
            public final Object a() {
                return AdviceOverflowCardView.this.findViewById(R.id.spaceBottom);
            }
        });
        this.j = new fxre(new fxwd() { // from class: twe
            @Override // defpackage.fxwd
            public final Object a() {
                return (MaterialCardView) AdviceOverflowCardView.this.findViewById(R.id.cardView);
            }
        });
        this.k = new fxre(new fxwd() { // from class: twf
            @Override // defpackage.fxwd
            public final Object a() {
                return (TextView) AdviceOverflowCardView.this.findViewById(R.id.expandTitle);
            }
        });
        this.l = new fxre(new fxwd() { // from class: twg
            @Override // defpackage.fxwd
            public final Object a() {
                return (TextView) AdviceOverflowCardView.this.findViewById(R.id.collapseTitle);
            }
        });
        this.m = new fxre(new fxwd() { // from class: twh
            @Override // defpackage.fxwd
            public final Object a() {
                return (TextView) AdviceOverflowCardView.this.findViewById(R.id.overflowCount);
            }
        });
        this.n = new fxre(new fxwd() { // from class: twi
            @Override // defpackage.fxwd
            public final Object a() {
                return (ImageView) AdviceOverflowCardView.this.findViewById(R.id.caretIcon);
            }
        });
        this.o = new fxre(new fxwd() { // from class: twj
            @Override // defpackage.fxwd
            public final Object a() {
                return Float.valueOf(ucp.b(4, context));
            }
        });
        this.p = new fxre(new fxwd() { // from class: twk
            @Override // defpackage.fxwd
            public final Object a() {
                return Float.valueOf(ucp.b(20, context));
            }
        });
    }

    public /* synthetic */ AdviceOverflowCardView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}

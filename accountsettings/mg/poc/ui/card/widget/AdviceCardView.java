package com.google.android.gms.accountsettings.mg.poc.ui.card.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.AdviceCardView;
import com.google.android.gms.accountsettings.mg.poc.ui.common.FadeInImageView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import defpackage.etgk;
import defpackage.fjul;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.fvbo;
import defpackage.iii;
import defpackage.sii;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class AdviceCardView extends ConstraintLayout {
    private final fuuw A;
    private final fuuw B;
    private final fuuw C;
    private final fuuw D;
    private final fuuw E;
    public final AttributeSet h;
    public final fuuw i;
    public final fuuw j;
    public boolean k;
    public etgk l;
    public boolean m;
    private final fuuw n;
    private final fuuw o;
    private final fuuw p;
    private final fuuw q;
    private final fuuw r;
    private final fuuw s;
    private final fuuw t;
    private final fuuw u;
    private final fuuw v;
    private final fuuw w;
    private final fuuw x;
    private final fuuw y;
    private final fuuw z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceCardView(Context context) {
        this(context, null, 0, 0, 14, null);
        fvbo.f(context, "context");
    }

    public final void A() {
        ViewGroup.LayoutParams layoutParams = i().getLayoutParams();
        fvbo.d(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        iii iiiVar = (iii) layoutParams;
        if (!this.k || (fjul.c() && !this.m)) {
            iiiVar.H = 0.5f;
        } else {
            iiiVar.H = 0.0f;
        }
        i().setLayoutParams(iiiVar);
    }

    public final void B() {
        k().measure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.as_advice_card_buttons_max_width), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(k().getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
        int measuredWidth = (k().getMeasuredWidth() - k().getPaddingLeft()) - k().getPaddingRight();
        u().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, JGCastService.FLAG_USE_TDLS), View.MeasureSpec.makeMeasureSpec(u().getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
        w().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, JGCastService.FLAG_USE_TDLS), View.MeasureSpec.makeMeasureSpec(u().getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
        v().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, JGCastService.FLAG_USE_TDLS), View.MeasureSpec.makeMeasureSpec(v().getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
        if (u().getMeasuredWidth() + w().getMeasuredWidth() + v().getMeasuredWidth() >= measuredWidth * 0.9f) {
            k().setOrientation(1);
            k().removeView(v());
            k().addView(v());
        } else {
            k().setOrientation(0);
            k().removeView(v());
            k().addView(v(), 0);
        }
    }

    public final View g() {
        Object a = this.w.a();
        fvbo.e(a, "getValue(...)");
        return (View) a;
    }

    public final View h() {
        Object a = this.v.a();
        fvbo.e(a, "getValue(...)");
        return (View) a;
    }

    public final FrameLayout i() {
        Object a = this.p.a();
        fvbo.e(a, "getValue(...)");
        return (FrameLayout) a;
    }

    public final ImageView j() {
        Object a = this.r.a();
        fvbo.e(a, "getValue(...)");
        return (ImageView) a;
    }

    public final LinearLayout k() {
        Object a = this.C.a();
        fvbo.e(a, "getValue(...)");
        return (LinearLayout) a;
    }

    public final LinearLayout l() {
        Object a = this.q.a();
        fvbo.e(a, "getValue(...)");
        return (LinearLayout) a;
    }

    public final ProgressBar m() {
        Object a = this.y.a();
        fvbo.e(a, "getValue(...)");
        return (ProgressBar) a;
    }

    public final Space n() {
        return (Space) this.D.a();
    }

    public final TextView o() {
        Object a = this.t.a();
        fvbo.e(a, "getValue(...)");
        return (TextView) a;
    }

    public final TextView p() {
        Object a = this.u.a();
        fvbo.e(a, "getValue(...)");
        return (TextView) a;
    }

    public final TextView q() {
        Object a = this.E.a();
        fvbo.e(a, "getValue(...)");
        return (TextView) a;
    }

    public final TextView r() {
        Object a = this.x.a();
        fvbo.e(a, "getValue(...)");
        return (TextView) a;
    }

    public final TextView s() {
        Object a = this.s.a();
        fvbo.e(a, "getValue(...)");
        return (TextView) a;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        x().setEnabled(onClickListener != null);
        x().setOnClickListener(onClickListener);
    }

    public final FadeInImageView t() {
        Object a = this.o.a();
        fvbo.e(a, "getValue(...)");
        return (FadeInImageView) a;
    }

    public final MaterialButton u() {
        Object a = this.A.a();
        fvbo.e(a, "getValue(...)");
        return (MaterialButton) a;
    }

    public final MaterialButton v() {
        Object a = this.z.a();
        fvbo.e(a, "getValue(...)");
        return (MaterialButton) a;
    }

    public final MaterialButton w() {
        Object a = this.B.a();
        fvbo.e(a, "getValue(...)");
        return (MaterialButton) a;
    }

    public final MaterialCardView x() {
        Object a = this.n.a();
        fvbo.e(a, "getValue(...)");
        return (MaterialCardView) a;
    }

    public final void y(String str, View.OnClickListener onClickListener) {
        fvbo.f(str, "text");
        if (this.k) {
            v().setVisibility(0);
        } else {
            v().setVisibility(8);
        }
        v().setText(str);
        v().setOnClickListener(onClickListener);
        B();
        if (fjul.c()) {
            this.m = true;
            A();
            z();
        }
    }

    public final void z() {
        ViewGroup.LayoutParams layoutParams = l().getLayoutParams();
        fvbo.d(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        iii iiiVar = (iii) layoutParams;
        if (!this.k || (fjul.c() && !this.m)) {
            j().setImageResource(this.m ? R.drawable.quantum_ic_keyboard_arrow_down_vd_theme_24 : sii.s(getContext()) ? R.drawable.quantum_ic_keyboard_arrow_left_vd_theme_24 : R.drawable.quantum_ic_keyboard_arrow_right_vd_theme_24);
            iiiVar.H = 0.5f;
            l().setVisibility(0);
            Space n = n();
            if (n != null) {
                n.setVisibility(0);
            }
        } else {
            iiiVar.H = 0.0f;
            l().setVisibility(8);
            Space n2 = n();
            if (n2 != null) {
                n2.setVisibility(8);
            }
        }
        l().setLayoutParams(iiiVar);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceCardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdviceCardView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fvbo.f(context, "context");
        this.h = attributeSet;
        this.n = new fuvg(new fvaf() { // from class: sbj
            @Override // defpackage.fvaf
            public final Object a() {
                return (MaterialCardView) AdviceCardView.this.findViewById(R.id.cardView);
            }
        });
        this.i = new fuvg(new fvaf() { // from class: sbk
            @Override // defpackage.fvaf
            public final Object a() {
                return (ViewGroup) AdviceCardView.this.findViewById(R.id.contentContainer);
            }
        });
        this.o = new fuvg(new fvaf() { // from class: sbm
            @Override // defpackage.fvaf
            public final Object a() {
                return (FadeInImageView) AdviceCardView.this.findViewById(R.id.adviceIcon);
            }
        });
        this.p = new fuvg(new fvaf() { // from class: sbn
            @Override // defpackage.fvaf
            public final Object a() {
                return (FrameLayout) AdviceCardView.this.findViewById(R.id.iconContainer);
            }
        });
        this.q = new fuvg(new fvaf() { // from class: sbo
            @Override // defpackage.fvaf
            public final Object a() {
                return (LinearLayout) AdviceCardView.this.findViewById(R.id.caretContainer);
            }
        });
        this.r = new fuvg(new fvaf() { // from class: sbp
            @Override // defpackage.fvaf
            public final Object a() {
                return (ImageView) AdviceCardView.this.findViewById(R.id.caretIcon);
            }
        });
        this.s = new fuvg(new fvaf() { // from class: sbq
            @Override // defpackage.fvaf
            public final Object a() {
                return (TextView) AdviceCardView.this.findViewById(R.id.adviceTitle);
            }
        });
        this.t = new fuvg(new fvaf() { // from class: sbr
            @Override // defpackage.fvaf
            public final Object a() {
                return (TextView) AdviceCardView.this.findViewById(R.id.collapsedDescription);
            }
        });
        this.u = new fuvg(new fvaf() { // from class: sbt
            @Override // defpackage.fvaf
            public final Object a() {
                return (TextView) AdviceCardView.this.findViewById(R.id.expandedDescription);
            }
        });
        this.v = new fuvg(new fvaf() { // from class: sbu
            @Override // defpackage.fvaf
            public final Object a() {
                return AdviceCardView.this.findViewById(R.id.progressContainer);
            }
        });
        this.w = new fuvg(new fvaf() { // from class: sbs
            @Override // defpackage.fvaf
            public final Object a() {
                return AdviceCardView.this.findViewById(R.id.descriptionContainer);
            }
        });
        this.x = new fuvg(new fvaf() { // from class: sbv
            @Override // defpackage.fvaf
            public final Object a() {
                return (TextView) AdviceCardView.this.findViewById(R.id.adviceProgressLabel);
            }
        });
        this.y = new fuvg(new fvaf() { // from class: sbw
            @Override // defpackage.fvaf
            public final Object a() {
                return (ProgressBar) AdviceCardView.this.findViewById(R.id.adviceProgressBar);
            }
        });
        this.z = new fuvg(new fvaf() { // from class: sbx
            @Override // defpackage.fvaf
            public final Object a() {
                return (MaterialButton) AdviceCardView.this.findViewById(R.id.secondaryButton);
            }
        });
        this.A = new fuvg(new fvaf() { // from class: sby
            @Override // defpackage.fvaf
            public final Object a() {
                return (MaterialButton) AdviceCardView.this.findViewById(R.id.buttonPrimaryButton);
            }
        });
        this.B = new fuvg(new fvaf() { // from class: sbz
            @Override // defpackage.fvaf
            public final Object a() {
                return (MaterialButton) AdviceCardView.this.findViewById(R.id.textPrimaryButton);
            }
        });
        this.C = new fuvg(new fvaf() { // from class: sca
            @Override // defpackage.fvaf
            public final Object a() {
                return (LinearLayout) AdviceCardView.this.findViewById(R.id.buttonsContainer);
            }
        });
        this.D = new fuvg(new fvaf() { // from class: scb
            @Override // defpackage.fvaf
            public final Object a() {
                return (Space) AdviceCardView.this.findViewById(R.id.caretContainerSpacer);
            }
        });
        this.E = new fuvg(new fvaf() { // from class: scc
            @Override // defpackage.fvaf
            public final Object a() {
                return (TextView) AdviceCardView.this.findViewById(R.id.hintText);
            }
        });
        this.j = new fuvg(new fvaf() { // from class: sbl
            @Override // defpackage.fvaf
            public final Object a() {
                lam lamVar = new lam();
                lamVar.R(0);
                lamVar.N(300L);
                lamVar.P(new kzj(2));
                kzh kzhVar = new kzh();
                kzhVar.c = new OvershootInterpolator();
                AdviceCardView adviceCardView = AdviceCardView.this;
                kzhVar.E(adviceCardView.i());
                kzhVar.E(adviceCardView.l());
                lamVar.P(kzhVar);
                kzh kzhVar2 = new kzh();
                kzhVar2.F(adviceCardView.l());
                kzhVar2.F(adviceCardView.i());
                kzhVar2.F(adviceCardView.g());
                kzhVar2.F(adviceCardView.m());
                Object a = adviceCardView.i.a();
                fvbo.e(a, "getValue(...)");
                kzhVar2.F((ViewGroup) a);
                kzhVar2.F(adviceCardView.k());
                lamVar.P(kzhVar2);
                lamVar.P(new kzj(1));
                return lamVar;
            }
        });
    }

    public /* synthetic */ AdviceCardView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}

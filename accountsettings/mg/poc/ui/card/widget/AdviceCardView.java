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
import com.google.android.material.progressindicator.LinearProgressIndicator;
import defpackage.evwc;
import defpackage.fmkm;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.fxxm;
import defpackage.ijy;
import defpackage.ucp;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class AdviceCardView extends ConstraintLayout {
    private final fxqu A;
    private final fxqu B;
    private final fxqu C;
    private final fxqu D;
    private final fxqu E;
    private final fxqu F;
    private final fxqu G;
    private final fxqu H;
    public final AttributeSet h;
    public final fxqu i;
    public final fxqu j;
    public boolean k;
    public evwc l;
    public boolean m;
    private final fxqu n;
    private final fxqu o;
    private final fxqu p;
    private final fxqu q;
    private final fxqu r;
    private final fxqu s;
    private final fxqu t;
    private final fxqu u;
    private final fxqu v;
    private final fxqu w;
    private final fxqu x;
    private final fxqu y;
    private final fxqu z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceCardView(Context context) {
        this(context, null, 0, 0, 14, null);
        fxxm.f(context, "context");
    }

    public final LinearProgressIndicator A() {
        return (LinearProgressIndicator) this.z.a();
    }

    public final void B(String str, View.OnClickListener onClickListener) {
        fxxm.f(str, "text");
        if (this.k) {
            x().setVisibility(0);
        } else {
            x().setVisibility(8);
        }
        x().setText(str);
        x().setOnClickListener(onClickListener);
        E();
        if (fmkm.c()) {
            this.m = true;
            D();
            C();
        }
    }

    public final void C() {
        ViewGroup.LayoutParams layoutParams = n().getLayoutParams();
        fxxm.d(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ijy ijyVar = (ijy) layoutParams;
        if (!this.k || (fmkm.c() && !this.m)) {
            l().setImageResource(this.m ? R.drawable.quantum_ic_keyboard_arrow_down_vd_theme_24 : ucp.s(getContext()) ? R.drawable.quantum_ic_keyboard_arrow_left_vd_theme_24 : R.drawable.quantum_ic_keyboard_arrow_right_vd_theme_24);
            ijyVar.H = 0.5f;
            n().setVisibility(0);
            Space p = p();
            if (p != null) {
                p.setVisibility(0);
            }
        } else {
            ijyVar.H = 0.0f;
            n().setVisibility(8);
            Space p2 = p();
            if (p2 != null) {
                p2.setVisibility(8);
            }
        }
        n().setLayoutParams(ijyVar);
    }

    public final void D() {
        ViewGroup.LayoutParams layoutParams = k().getLayoutParams();
        fxxm.d(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ijy ijyVar = (ijy) layoutParams;
        if (!this.k || (fmkm.c() && !this.m)) {
            ijyVar.H = 0.5f;
        } else {
            ijyVar.H = 0.0f;
        }
        k().setLayoutParams(ijyVar);
    }

    public final void E() {
        m().measure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(R.dimen.as_advice_card_buttons_max_width), JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(m().getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
        int measuredWidth = (m().getMeasuredWidth() - m().getPaddingLeft()) - m().getPaddingRight();
        w().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, JGCastService.FLAG_USE_TDLS), View.MeasureSpec.makeMeasureSpec(w().getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
        y().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, JGCastService.FLAG_USE_TDLS), View.MeasureSpec.makeMeasureSpec(w().getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
        x().measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, JGCastService.FLAG_USE_TDLS), View.MeasureSpec.makeMeasureSpec(x().getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
        if (w().getMeasuredWidth() + y().getMeasuredWidth() + x().getMeasuredWidth() >= measuredWidth * 0.9f) {
            m().setOrientation(1);
            m().removeView(x());
            m().addView(x());
        } else {
            m().setOrientation(0);
            m().removeView(x());
            m().addView(x(), 0);
        }
    }

    public final float g() {
        return ((Number) this.H.a()).floatValue();
    }

    public final float h() {
        return ((Number) this.G.a()).floatValue();
    }

    public final View i() {
        Object a = this.w.a();
        fxxm.e(a, "getValue(...)");
        return (View) a;
    }

    public final View j() {
        Object a = this.v.a();
        fxxm.e(a, "getValue(...)");
        return (View) a;
    }

    public final FrameLayout k() {
        Object a = this.p.a();
        fxxm.e(a, "getValue(...)");
        return (FrameLayout) a;
    }

    public final ImageView l() {
        Object a = this.r.a();
        fxxm.e(a, "getValue(...)");
        return (ImageView) a;
    }

    public final LinearLayout m() {
        Object a = this.D.a();
        fxxm.e(a, "getValue(...)");
        return (LinearLayout) a;
    }

    public final LinearLayout n() {
        Object a = this.q.a();
        fxxm.e(a, "getValue(...)");
        return (LinearLayout) a;
    }

    public final ProgressBar o() {
        return (ProgressBar) this.y.a();
    }

    public final Space p() {
        return (Space) this.E.a();
    }

    public final TextView q() {
        Object a = this.t.a();
        fxxm.e(a, "getValue(...)");
        return (TextView) a;
    }

    public final TextView r() {
        Object a = this.u.a();
        fxxm.e(a, "getValue(...)");
        return (TextView) a;
    }

    public final TextView s() {
        Object a = this.F.a();
        fxxm.e(a, "getValue(...)");
        return (TextView) a;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        z().setEnabled(onClickListener != null);
        z().setOnClickListener(onClickListener);
    }

    public final TextView t() {
        Object a = this.x.a();
        fxxm.e(a, "getValue(...)");
        return (TextView) a;
    }

    public final TextView u() {
        Object a = this.s.a();
        fxxm.e(a, "getValue(...)");
        return (TextView) a;
    }

    public final FadeInImageView v() {
        Object a = this.o.a();
        fxxm.e(a, "getValue(...)");
        return (FadeInImageView) a;
    }

    public final MaterialButton w() {
        Object a = this.B.a();
        fxxm.e(a, "getValue(...)");
        return (MaterialButton) a;
    }

    public final MaterialButton x() {
        Object a = this.A.a();
        fxxm.e(a, "getValue(...)");
        return (MaterialButton) a;
    }

    public final MaterialButton y() {
        Object a = this.C.a();
        fxxm.e(a, "getValue(...)");
        return (MaterialButton) a;
    }

    public final MaterialCardView z() {
        Object a = this.n.a();
        fxxm.e(a, "getValue(...)");
        return (MaterialCardView) a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AdviceCardView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdviceCardView(final Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        fxxm.f(context, "context");
        this.h = attributeSet;
        this.n = new fxre(new fxwd() { // from class: tuw
            @Override // defpackage.fxwd
            public final Object a() {
                return (MaterialCardView) AdviceCardView.this.findViewById(R.id.cardView);
            }
        });
        this.i = new fxre(new fxwd() { // from class: tuy
            @Override // defpackage.fxwd
            public final Object a() {
                return (ViewGroup) AdviceCardView.this.findViewById(R.id.contentContainer);
            }
        });
        this.o = new fxre(new fxwd() { // from class: tvc
            @Override // defpackage.fxwd
            public final Object a() {
                return (FadeInImageView) AdviceCardView.this.findViewById(R.id.adviceIcon);
            }
        });
        this.p = new fxre(new fxwd() { // from class: tvd
            @Override // defpackage.fxwd
            public final Object a() {
                return (FrameLayout) AdviceCardView.this.findViewById(R.id.iconContainer);
            }
        });
        this.q = new fxre(new fxwd() { // from class: tve
            @Override // defpackage.fxwd
            public final Object a() {
                return (LinearLayout) AdviceCardView.this.findViewById(R.id.caretContainer);
            }
        });
        this.r = new fxre(new fxwd() { // from class: tvf
            @Override // defpackage.fxwd
            public final Object a() {
                return (ImageView) AdviceCardView.this.findViewById(R.id.caretIcon);
            }
        });
        this.s = new fxre(new fxwd() { // from class: tvg
            @Override // defpackage.fxwd
            public final Object a() {
                return (TextView) AdviceCardView.this.findViewById(R.id.adviceTitle);
            }
        });
        this.t = new fxre(new fxwd() { // from class: tvi
            @Override // defpackage.fxwd
            public final Object a() {
                return (TextView) AdviceCardView.this.findViewById(R.id.collapsedDescription);
            }
        });
        this.u = new fxre(new fxwd() { // from class: tvj
            @Override // defpackage.fxwd
            public final Object a() {
                return (TextView) AdviceCardView.this.findViewById(R.id.expandedDescription);
            }
        });
        this.v = new fxre(new fxwd() { // from class: tvk
            @Override // defpackage.fxwd
            public final Object a() {
                return AdviceCardView.this.findViewById(R.id.progressContainer);
            }
        });
        this.w = new fxre(new fxwd() { // from class: tvh
            @Override // defpackage.fxwd
            public final Object a() {
                return AdviceCardView.this.findViewById(R.id.descriptionContainer);
            }
        });
        this.x = new fxre(new fxwd() { // from class: tvl
            @Override // defpackage.fxwd
            public final Object a() {
                return (TextView) AdviceCardView.this.findViewById(R.id.adviceProgressLabel);
            }
        });
        this.y = new fxre(new fxwd() { // from class: tvm
            @Override // defpackage.fxwd
            public final Object a() {
                return (ProgressBar) AdviceCardView.this.findViewById(R.id.adviceProgressBar);
            }
        });
        this.z = new fxre(new fxwd() { // from class: tvn
            @Override // defpackage.fxwd
            public final Object a() {
                return (LinearProgressIndicator) AdviceCardView.this.findViewById(R.id.linearProgressIndicator);
            }
        });
        this.A = new fxre(new fxwd() { // from class: tvo
            @Override // defpackage.fxwd
            public final Object a() {
                return (MaterialButton) AdviceCardView.this.findViewById(R.id.secondaryButton);
            }
        });
        this.B = new fxre(new fxwd() { // from class: tvp
            @Override // defpackage.fxwd
            public final Object a() {
                return (MaterialButton) AdviceCardView.this.findViewById(R.id.buttonPrimaryButton);
            }
        });
        this.C = new fxre(new fxwd() { // from class: tvq
            @Override // defpackage.fxwd
            public final Object a() {
                return (MaterialButton) AdviceCardView.this.findViewById(R.id.textPrimaryButton);
            }
        });
        this.D = new fxre(new fxwd() { // from class: tvr
            @Override // defpackage.fxwd
            public final Object a() {
                return (LinearLayout) AdviceCardView.this.findViewById(R.id.buttonsContainer);
            }
        });
        this.E = new fxre(new fxwd() { // from class: tvs
            @Override // defpackage.fxwd
            public final Object a() {
                return (Space) AdviceCardView.this.findViewById(R.id.caretContainerSpacer);
            }
        });
        this.F = new fxre(new fxwd() { // from class: tux
            @Override // defpackage.fxwd
            public final Object a() {
                return (TextView) AdviceCardView.this.findViewById(R.id.hintText);
            }
        });
        this.G = new fxre(new fxwd() { // from class: tuz
            @Override // defpackage.fxwd
            public final Object a() {
                return Float.valueOf(ucp.b(4, context));
            }
        });
        this.H = new fxre(new fxwd() { // from class: tva
            @Override // defpackage.fxwd
            public final Object a() {
                return Float.valueOf(ucp.b(20, context));
            }
        });
        this.j = new fxre(new fxwd() { // from class: tvb
            @Override // defpackage.fxwd
            public final Object a() {
                mth mthVar = new mth();
                mthVar.R(0);
                mthVar.N(300L);
                mthVar.P(new mse(2));
                msc mscVar = new msc();
                mscVar.c = new OvershootInterpolator();
                AdviceCardView adviceCardView = AdviceCardView.this;
                mscVar.E(adviceCardView.k());
                mscVar.E(adviceCardView.n());
                mthVar.P(mscVar);
                msc mscVar2 = new msc();
                mscVar2.F(adviceCardView.n());
                mscVar2.F(adviceCardView.k());
                mscVar2.F(adviceCardView.i());
                ProgressBar o = adviceCardView.o();
                if (o != null) {
                    mscVar2.F(o);
                }
                LinearProgressIndicator A = adviceCardView.A();
                if (A != null) {
                    mscVar2.F(A);
                }
                Object a = adviceCardView.i.a();
                fxxm.e(a, "getValue(...)");
                mscVar2.F((ViewGroup) a);
                mscVar2.F(adviceCardView.m());
                mthVar.P(mscVar2);
                mthVar.P(new mse(1));
                return mthVar;
            }
        });
    }

    public /* synthetic */ AdviceCardView(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }
}

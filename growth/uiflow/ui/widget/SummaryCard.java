package com.google.android.gms.growth.uiflow.ui.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.R;
import com.google.android.gms.growth.uiflow.ui.widget.SummaryCard;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import defpackage.bkkt;
import defpackage.bkvz;
import defpackage.bkxl;
import defpackage.bkxm;
import defpackage.fuuw;
import defpackage.fuvg;
import defpackage.fvaf;
import defpackage.fvaq;
import defpackage.fvbo;
import defpackage.iio;
import defpackage.iit;
import defpackage.rpq;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SummaryCard extends MaterialCardView implements bkvz {
    public static final /* synthetic */ int m = 0;
    private final fuuw A;
    private final fuuw B;
    private final fuuw C;
    private final fuuw D;
    public ConstraintLayout g;
    public iit h;
    public int i;
    public boolean j;
    public boolean k;
    public final fuuw l;
    private final Context p;
    private final AttributeSet q;
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
    public SummaryCard(Context context) {
        this(context, null, 0, 6, null);
        fvbo.f(context, "context");
    }

    private final int u() {
        return ((Number) this.D.a()).intValue();
    }

    public final int f() {
        return ((Number) this.u.a()).intValue();
    }

    public final int g() {
        return ((Number) this.v.a()).intValue();
    }

    public final View h() {
        return (View) this.z.a();
    }

    public final ScrollView i() {
        return (ScrollView) this.w.a();
    }

    public final TextView j() {
        return (TextView) this.B.a();
    }

    public final TextView k() {
        return (TextView) this.x.a();
    }

    public final MaterialButton l() {
        return (MaterialButton) this.C.a();
    }

    public final MaterialButton m() {
        return (MaterialButton) this.y.a();
    }

    public final void n(boolean z) {
        if (z) {
            bkxl.g(i(), true != this.k ? 300L : 400L);
        }
        this.k = !this.k;
        ConstraintLayout constraintLayout = this.g;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            fvbo.j("constraintLayout");
            constraintLayout = null;
        }
        fvaq fvaqVar = new fvaq() { // from class: bktr
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
                fvbo.f(layoutParams, "$this$modifyLayoutParams");
                SummaryCard summaryCard = SummaryCard.this;
                layoutParams.height = summaryCard.k ? summaryCard.i : -2;
                return fuvs.a;
            }
        };
        fvbo.f(constraintLayout, "<this>");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        fvbo.c(layoutParams);
        fvaqVar.a(layoutParams);
        constraintLayout.setLayoutParams(layoutParams);
        if (this.k) {
            iit iitVar = this.h;
            if (iitVar == null) {
                fvbo.j("collapsedConstraints");
                iitVar = null;
            }
            ConstraintLayout constraintLayout3 = this.g;
            if (constraintLayout3 == null) {
                fvbo.j("constraintLayout");
            } else {
                constraintLayout2 = constraintLayout3;
            }
            iitVar.c(constraintLayout2);
            m().setContentDescription(this.p.getString(R.string.expand));
            m().u(R.drawable.quantum_gm_ic_expand_more_vd_theme_24);
            k().setEllipsize(TextUtils.TruncateAt.END);
        } else {
            iit iitVar2 = bkxl.j(this) ? (iit) this.r.a() : (iit) this.s.a();
            ConstraintLayout constraintLayout4 = this.g;
            if (constraintLayout4 == null) {
                fvbo.j("constraintLayout");
                constraintLayout4 = null;
            }
            iitVar2.c(constraintLayout4);
            m().setContentDescription(this.p.getString(R.string.collapse));
            m().u(R.drawable.quantum_gm_ic_expand_less_vd_theme_24);
            k().setEllipsize(null);
            if (bkxl.i(this)) {
                bkxl.f(this, new fvaq() { // from class: bkts
                    @Override // defpackage.fvaq
                    public final Object a(Object obj) {
                        final View view = (View) obj;
                        fvbo.f(view, "$this$addOnGlobalLayoutListener");
                        ConstraintLayout constraintLayout5 = SummaryCard.this.g;
                        if (constraintLayout5 == null) {
                            fvbo.j("constraintLayout");
                            constraintLayout5 = null;
                        }
                        bkxm.c(constraintLayout5, new fvaq() { // from class: bkum
                            @Override // defpackage.fvaq
                            public final Object a(Object obj2) {
                                iit iitVar3 = (iit) obj2;
                                int i = SummaryCard.m;
                                fvbo.f(iitVar3, "$this$modifyConstraints");
                                bkxm.b(iitVar3, R.id.uiflow_summary_card_expanded_media_container, view.getHeight());
                                return fuvs.a;
                            }
                        });
                        return fuvs.a;
                    }
                });
            }
        }
        int i = true != this.k ? 0 : 8;
        h().setVisibility(i);
        ((View) this.A.a()).setVisibility(i);
        j().setVisibility(i);
        if (this.k || !o()) {
            return;
        }
        l().setVisibility(0);
    }

    public final boolean o() {
        return ((Boolean) this.t.a()).booleanValue();
    }

    public final iit p(fvaq fvaqVar) {
        iit iitVar = new iit();
        iit iitVar2 = this.h;
        if (iitVar2 == null) {
            fvbo.j("collapsedConstraints");
            iitVar2 = null;
        }
        HashMap hashMap = iitVar.b;
        hashMap.clear();
        HashMap hashMap2 = iitVar2.b;
        for (Integer num : hashMap2.keySet()) {
            iio iioVar = (iio) hashMap2.get(num);
            if (iioVar != null) {
                hashMap.put(num, iioVar.clone());
            }
        }
        iitVar.d(R.id.uiflow_summary_card_expanded_media, 3);
        iitVar.d(R.id.uiflow_summary_card_expanded_media, 4);
        iitVar.d(R.id.uiflow_summary_card_expanded_media, 6);
        iitVar.d(R.id.uiflow_summary_card_expanded_media, 7);
        iitVar.d(R.id.uiflow_summary_card_media, 6);
        iitVar.g(R.id.uiflow_summary_card_media, 7, 0, 6);
        bkxm.b(iitVar, R.id.uiflow_summary_card_title, -2);
        iitVar.d(R.id.uiflow_summary_card_expand_button, 4);
        int g = g();
        iitVar.h(R.id.uiflow_summary_card_title, 3, 0, 3, g + g);
        iitVar.h(R.id.uiflow_summary_card_expand_button, 3, 0, 3, g());
        iitVar.h(R.id.uiflow_summary_card_title, 6, R.id.uiflow_summary_card_expanded_media_container, 7, f());
        iitVar.h(R.id.uiflow_summary_card_expanded_body, 6, R.id.uiflow_summary_card_expanded_media_container, 7, f());
        iitVar.h(R.id.uiflow_summary_card_feature_disclaimer, 6, R.id.uiflow_summary_card_expanded_media_container, 7, f());
        iitVar.g(R.id.uiflow_summary_card_cta, 6, R.id.uiflow_summary_card_expanded_media_container, 7);
        if (o()) {
            iitVar.h(R.id.uiflow_summary_card_cta, 3, u(), 4, g());
            iitVar.h(R.id.uiflow_summary_card_cta, 4, 0, 4, g());
        } else {
            int u = u();
            int g2 = g();
            iitVar.h(u, 4, 0, 4, g2 + g2);
        }
        fvaqVar.a(iitVar);
        return iitVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SummaryCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fvbo.f(context, "context");
        this.p = context;
        this.q = attributeSet;
        this.k = true;
        bkxl.f(this, new fvaq() { // from class: bktt
            @Override // defpackage.fvaq
            public final Object a(Object obj) {
                View view = (View) obj;
                fvbo.f(view, "$this$addOnGlobalLayoutListener");
                final SummaryCard summaryCard = SummaryCard.this;
                bkxl.f(view, new fvaq() { // from class: bkul
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
                    
                        if (r5.intValue() <= 0) goto L17;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
                    @Override // defpackage.fvaq
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a(java.lang.Object r8) {
                        /*
                            r7 = this;
                            android.view.View r8 = (android.view.View) r8
                            java.lang.String r0 = "$this$addOnGlobalLayoutListener"
                            defpackage.fvbo.f(r8, r0)
                            com.google.android.gms.growth.uiflow.ui.widget.SummaryCard r8 = com.google.android.gms.growth.uiflow.ui.widget.SummaryCard.this
                            int r0 = r8.getHeight()
                            r8.i = r0
                            r0 = 2131432992(0x7f0b1620, float:1.8487757E38)
                            android.view.View r0 = r8.findViewById(r0)
                            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
                            r8.g = r0
                            boolean r0 = defpackage.bkxl.i(r8)
                            java.lang.String r1 = "constraintLayout"
                            r2 = 0
                            if (r0 == 0) goto L33
                            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.g
                            if (r0 != 0) goto L2b
                            defpackage.fvbo.j(r1)
                            r0 = r2
                        L2b:
                            bkuo r3 = new bkuo
                            r3.<init>()
                            defpackage.bkxm.c(r0, r3)
                        L33:
                            android.view.View r0 = r8.h()
                            r3 = 2131433488(0x7f0b1810, float:1.8488763E38)
                            android.view.View r0 = r0.findViewById(r3)
                            android.widget.ImageView r0 = (android.widget.ImageView) r0
                            if (r0 == 0) goto L47
                            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
                            r0.setScaleType(r3)
                        L47:
                            boolean r0 = r8.o()
                            java.lang.String r3 = "<this>"
                            java.lang.String r4 = "<get-title>(...)"
                            if (r0 == 0) goto L9c
                            android.widget.TextView r0 = r8.k()
                            defpackage.fvbo.e(r0, r4)
                            defpackage.fvbo.f(r0, r3)
                            android.text.Layout r0 = r0.getLayout()
                            if (r0 == 0) goto L6f
                            int r5 = r0.getLineCount()
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                            int r6 = r5.intValue()
                            if (r6 > 0) goto L70
                        L6f:
                            r5 = r2
                        L70:
                            if (r5 == 0) goto L7f
                            int r5 = r5.intValue()
                            int r5 = r5 + (-1)
                            int r0 = r0.getEllipsisCount(r5)
                            if (r0 <= 0) goto L7f
                            goto L9c
                        L7f:
                            android.widget.TextView r0 = r8.k()
                            int r0 = r0.getLineHeight()
                            android.widget.TextView r5 = r8.k()
                            int r5 = r5.getHeight()
                            if (r0 > r5) goto L9c
                            android.widget.TextView r0 = r8.k()
                            r3 = 8388659(0x800033, float:1.1755015E-38)
                            r0.setGravity(r3)
                            goto Lcf
                        L9c:
                            android.widget.TextView r0 = r8.k()
                            r5 = 8388627(0x800013, float:1.175497E-38)
                            r0.setGravity(r5)
                            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.g
                            if (r0 != 0) goto Lae
                            defpackage.fvbo.j(r1)
                            r0 = r2
                        Lae:
                            bkur r5 = new bkur
                            r5.<init>()
                            defpackage.bkxm.c(r0, r5)
                            android.widget.TextView r0 = r8.k()
                            defpackage.fvbo.e(r0, r4)
                            bkus r4 = new bkus
                            r4.<init>()
                            defpackage.fvbo.f(r0, r3)
                            android.view.ViewGroup$MarginLayoutParams r3 = defpackage.bkxn.a(r0)
                            r4.a(r3)
                            r0.setLayoutParams(r3)
                        Lcf:
                            com.google.android.material.button.MaterialButton r0 = r8.m()
                            java.lang.String r3 = "<get-expandButton>(...)"
                            defpackage.fvbo.e(r0, r3)
                            bkup r3 = new bkup
                            r3.<init>()
                            defpackage.bkvt.b(r0, r3)
                            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.g
                            if (r0 != 0) goto Le8
                            defpackage.fvbo.j(r1)
                            goto Le9
                        Le8:
                            r2 = r0
                        Le9:
                            iit r0 = defpackage.bkxm.a(r2)
                            r8.h = r0
                            bkuq r0 = new bkuq
                            r0.<init>()
                            defpackage.bkxl.f(r8, r0)
                            fuvs r8 = defpackage.fuvs.a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkul.a(java.lang.Object):java.lang.Object");
                    }
                });
                return fuvs.a;
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: bkub
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SummaryCard.this.m().performClick();
            }
        });
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpq.q, 0, 0);
        this.j = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.r = new fuvg(new fvaf() { // from class: bkuc
            @Override // defpackage.fvaf
            public final Object a() {
                final SummaryCard summaryCard = SummaryCard.this;
                return summaryCard.p(new fvaq() { // from class: bkuk
                    @Override // defpackage.fvaq
                    public final Object a(Object obj) {
                        iit iitVar = (iit) obj;
                        fvbo.f(iitVar, "$this$buildExpandedConstraints");
                        iitVar.g(R.id.uiflow_summary_card_expanded_media_container, 3, 0, 3);
                        iitVar.g(R.id.uiflow_summary_card_expanded_media_container, 6, 0, 6);
                        iitVar.g(R.id.uiflow_summary_card_expanded_media_container, 7, 0, 7);
                        SummaryCard summaryCard2 = SummaryCard.this;
                        bkxm.d(iitVar, summaryCard2.getWidth());
                        TypedValue typedValue = new TypedValue();
                        summaryCard2.getContext().getTheme().resolveAttribute(R.attr.cardLottieRatioConstraintsHeight, typedValue, true);
                        iitVar.m(R.id.uiflow_summary_card_expanded_media_container, typedValue.string.toString());
                        int g = summaryCard2.g();
                        iitVar.h(R.id.uiflow_summary_card_title, 3, R.id.uiflow_summary_card_expanded_media_container, 4, g + g);
                        iitVar.h(R.id.uiflow_summary_card_expand_button, 3, R.id.uiflow_summary_card_expanded_media_container, 4, summaryCard2.g());
                        iitVar.h(R.id.uiflow_summary_card_title, 6, 0, 6, summaryCard2.f());
                        iitVar.h(R.id.uiflow_summary_card_expanded_body, 6, 0, 6, summaryCard2.f());
                        iitVar.h(R.id.uiflow_summary_card_feature_disclaimer, 6, 0, 6, summaryCard2.f());
                        iitVar.g(R.id.uiflow_summary_card_cta, 6, 0, 6);
                        return fuvs.a;
                    }
                });
            }
        });
        this.s = new fuvg(new fvaf() { // from class: bkud
            @Override // defpackage.fvaf
            public final Object a() {
                final SummaryCard summaryCard = SummaryCard.this;
                return summaryCard.p(new fvaq() { // from class: bkun
                    @Override // defpackage.fvaq
                    public final Object a(Object obj) {
                        iit iitVar = (iit) obj;
                        fvbo.f(iitVar, "$this$buildExpandedConstraints");
                        SummaryCard summaryCard2 = SummaryCard.this;
                        double height = summaryCard2.i().getHeight();
                        iitVar.g(R.id.uiflow_summary_card_expanded_media_container, 3, 0, 3);
                        iitVar.g(R.id.uiflow_summary_card_expanded_media_container, 6, 0, 6);
                        bkxm.d(iitVar, (int) (height * 0.5d));
                        int g = summaryCard2.g();
                        iitVar.h(R.id.uiflow_summary_card_title, 3, 0, 3, g + g);
                        iitVar.h(R.id.uiflow_summary_card_expand_button, 3, 0, 3, summaryCard2.g());
                        iitVar.h(R.id.uiflow_summary_card_title, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard2.f());
                        iitVar.h(R.id.uiflow_summary_card_expanded_body, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard2.f());
                        iitVar.h(R.id.uiflow_summary_card_feature_disclaimer, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard2.f());
                        iitVar.h(R.id.uiflow_summary_card_cta, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard2.f());
                        return fuvs.a;
                    }
                });
            }
        });
        this.t = new fuvg(new fvaf() { // from class: bkue
            @Override // defpackage.fvaf
            public final Object a() {
                return Boolean.valueOf(SummaryCard.this.l().getVisibility() == 0);
            }
        });
        this.u = new fuvg(new fvaf() { // from class: bkuf
            @Override // defpackage.fvaf
            public final Object a() {
                iit iitVar = SummaryCard.this.h;
                if (iitVar == null) {
                    fvbo.j("collapsedConstraints");
                    iitVar = null;
                }
                return Integer.valueOf(iitVar.o().d.M);
            }
        });
        this.v = new fuvg(new fvaf() { // from class: bkug
            @Override // defpackage.fvaf
            public final Object a() {
                iit iitVar = SummaryCard.this.h;
                if (iitVar == null) {
                    fvbo.j("collapsedConstraints");
                    iitVar = null;
                }
                return Integer.valueOf(iitVar.o().d.J);
            }
        });
        this.w = new fuvg(new fvaf() { // from class: bkuh
            @Override // defpackage.fvaf
            public final Object a() {
                Iterator a = bkxl.e(SummaryCard.this).a();
                while (a.hasNext()) {
                    Object next = a.next();
                    if (((View) next) instanceof ScrollView) {
                        fvbo.d(next, "null cannot be cast to non-null type android.widget.ScrollView");
                        return (ScrollView) next;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.l = new fuvg(new fvaf() { // from class: bkui
            @Override // defpackage.fvaf
            public final Object a() {
                fvem fvemVar = new fvem(new fven(bkxl.e(SummaryCard.this), new fvaq() { // from class: bktp
                    @Override // defpackage.fvaq
                    public final Object a(Object obj) {
                        int i2 = SummaryCard.m;
                        fvbo.f((View) obj, "it");
                        return Boolean.valueOf(!(r2 instanceof ScrollView));
                    }
                }));
                int i2 = 0;
                while (fvemVar.hasNext()) {
                    i2 += ((View) fvemVar.next()).getTop();
                }
                return Integer.valueOf(i2);
            }
        });
        this.x = new fuvg(new fvaf() { // from class: bkuj
            @Override // defpackage.fvaf
            public final Object a() {
                return (TextView) SummaryCard.this.findViewById(R.id.uiflow_summary_card_title);
            }
        });
        this.y = new fuvg(new fvaf() { // from class: bktu
            @Override // defpackage.fvaf
            public final Object a() {
                return (MaterialButton) SummaryCard.this.findViewById(R.id.uiflow_summary_card_expand_button);
            }
        });
        this.z = new fuvg(new fvaf() { // from class: bktv
            @Override // defpackage.fvaf
            public final Object a() {
                return SummaryCard.this.findViewById(R.id.uiflow_summary_card_expanded_media);
            }
        });
        this.A = new fuvg(new fvaf() { // from class: bktw
            @Override // defpackage.fvaf
            public final Object a() {
                return SummaryCard.this.findViewById(R.id.uiflow_summary_card_expanded_body);
            }
        });
        this.B = new fuvg(new fvaf() { // from class: bktx
            @Override // defpackage.fvaf
            public final Object a() {
                return (TextView) SummaryCard.this.findViewById(R.id.uiflow_summary_card_feature_disclaimer);
            }
        });
        this.C = new fuvg(new fvaf() { // from class: bkty
            @Override // defpackage.fvaf
            public final Object a() {
                return (MaterialButton) SummaryCard.this.findViewById(R.id.uiflow_summary_card_cta);
            }
        });
        this.D = new fuvg(new fvaf() { // from class: bktz
            @Override // defpackage.fvaf
            public final Object a() {
                CharSequence text = SummaryCard.this.j().getText();
                fvbo.e(text, "getText(...)");
                return Integer.valueOf(true != fvfj.y(text) ? R.id.uiflow_summary_card_feature_disclaimer : R.id.uiflow_summary_card_expanded_body);
            }
        });
    }

    public /* synthetic */ SummaryCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // defpackage.bkvz
    public final void a(bkkt bkktVar) {
    }
}

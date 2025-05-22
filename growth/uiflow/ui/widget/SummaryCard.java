package com.google.android.gms.growth.uiflow.ui.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.R;
import com.google.android.gms.growth.uiflow.ui.widget.SummaryCard;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.card.MaterialCardView;
import defpackage.bmrj;
import defpackage.bncp;
import defpackage.bnec;
import defpackage.fxqu;
import defpackage.fxre;
import defpackage.fxwd;
import defpackage.fxwo;
import defpackage.fxxm;
import defpackage.ikj;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class SummaryCard extends MaterialCardView implements bncp {
    public static final /* synthetic */ int l = 0;
    private final fxqu A;
    private final fxqu B;
    public ConstraintLayout g;
    public ikj h;
    public int i;
    public boolean j;
    public final fxqu k;
    private final Context o;
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
    public SummaryCard(Context context) {
        this(context, null, 0, 6, null);
        fxxm.f(context, "context");
    }

    public final int f() {
        return ((Number) this.B.a()).intValue();
    }

    public final int h() {
        return ((Number) this.s.a()).intValue();
    }

    public final int i() {
        return ((Number) this.t.a()).intValue();
    }

    public final View j() {
        return (View) this.x.a();
    }

    public final ScrollView k() {
        return (ScrollView) this.u.a();
    }

    public final TextView l() {
        return (TextView) this.z.a();
    }

    public final TextView m() {
        return (TextView) this.v.a();
    }

    public final MaterialButton n() {
        return (MaterialButton) this.A.a();
    }

    public final MaterialButton o() {
        return (MaterialButton) this.w.a();
    }

    public final void p(boolean z) {
        if (z) {
            bnec.h(k(), true != this.j ? 300L : 400L);
        }
        this.j = !this.j;
        ConstraintLayout constraintLayout = this.g;
        ConstraintLayout constraintLayout2 = null;
        if (constraintLayout == null) {
            fxxm.j("constraintLayout");
            constraintLayout = null;
        }
        fxwo fxwoVar = new fxwo() { // from class: bnbi
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                ViewGroup.LayoutParams layoutParams = (ViewGroup.LayoutParams) obj;
                fxxm.f(layoutParams, "$this$modifyLayoutParams");
                SummaryCard summaryCard = SummaryCard.this;
                layoutParams.height = summaryCard.j ? summaryCard.i : -2;
                return fxrq.a;
            }
        };
        fxxm.f(constraintLayout, "<this>");
        ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
        fxxm.c(layoutParams);
        fxwoVar.a(layoutParams);
        constraintLayout.setLayoutParams(layoutParams);
        if (this.j) {
            ikj ikjVar = this.h;
            if (ikjVar == null) {
                fxxm.j("collapsedConstraints");
                ikjVar = null;
            }
            ConstraintLayout constraintLayout3 = this.g;
            if (constraintLayout3 == null) {
                fxxm.j("constraintLayout");
            } else {
                constraintLayout2 = constraintLayout3;
            }
            ikjVar.c(constraintLayout2);
            o().setContentDescription(this.o.getString(R.string.expand));
            o().w(R.drawable.quantum_gm_ic_expand_more_vd_theme_24);
            m().setEllipsize(TextUtils.TruncateAt.END);
        } else {
            ikj ikjVar2 = bnec.k(this) ? (ikj) this.p.a() : (ikj) this.q.a();
            ConstraintLayout constraintLayout4 = this.g;
            if (constraintLayout4 == null) {
                fxxm.j("constraintLayout");
                constraintLayout4 = null;
            }
            ikjVar2.c(constraintLayout4);
            o().setContentDescription(this.o.getString(R.string.collapse));
            o().w(R.drawable.quantum_gm_ic_expand_less_vd_theme_24);
            m().setEllipsize(null);
            if (bnec.j(this)) {
                bnec.g(this, new fxwo() { // from class: bnaj
                    @Override // defpackage.fxwo
                    public final Object a(Object obj) {
                        final View view = (View) obj;
                        fxxm.f(view, "$this$addOnGlobalLayoutListener");
                        ConstraintLayout constraintLayout5 = SummaryCard.this.g;
                        if (constraintLayout5 == null) {
                            fxxm.j("constraintLayout");
                            constraintLayout5 = null;
                        }
                        bned.c(constraintLayout5, new fxwo() { // from class: bnbh
                            @Override // defpackage.fxwo
                            public final Object a(Object obj2) {
                                ikj ikjVar3 = (ikj) obj2;
                                int i = SummaryCard.l;
                                fxxm.f(ikjVar3, "$this$modifyConstraints");
                                bned.b(ikjVar3, R.id.uiflow_summary_card_expanded_media_container, view.getHeight());
                                return fxrq.a;
                            }
                        });
                        return fxrq.a;
                    }
                });
            }
        }
        int i = true != this.j ? 0 : 8;
        j().setVisibility(i);
        ((View) this.y.a()).setVisibility(i);
        l().setVisibility(i);
        if (this.j || !q()) {
            return;
        }
        n().setVisibility(0);
    }

    public final boolean q() {
        return ((Boolean) this.r.a()).booleanValue();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SummaryCard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SummaryCard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fxxm.f(context, "context");
        this.o = context;
        this.j = true;
        LayoutInflater.from(context).inflate(R.layout.uiflow_summary_card_expandable_contents, (ViewGroup) this, true);
        bnec.g(this, new fxwo() { // from class: bnak
            @Override // defpackage.fxwo
            public final Object a(Object obj) {
                View view = (View) obj;
                fxxm.f(view, "$this$addOnGlobalLayoutListener");
                final SummaryCard summaryCard = SummaryCard.this;
                bnec.g(view, new fxwo() { // from class: bnat
                    /* JADX WARN: Code restructure failed: missing block: B:15:0x006d, code lost:
                    
                        if (r5.intValue() <= 0) goto L17;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:24:0x00e4  */
                    /* JADX WARN: Removed duplicated region for block: B:28:0x00e8  */
                    @Override // defpackage.fxwo
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object a(java.lang.Object r8) {
                        /*
                            r7 = this;
                            android.view.View r8 = (android.view.View) r8
                            java.lang.String r0 = "$this$addOnGlobalLayoutListener"
                            defpackage.fxxm.f(r8, r0)
                            com.google.android.gms.growth.uiflow.ui.widget.SummaryCard r8 = com.google.android.gms.growth.uiflow.ui.widget.SummaryCard.this
                            int r0 = r8.getHeight()
                            r8.i = r0
                            r0 = 2131433032(0x7f0b1648, float:1.8487838E38)
                            android.view.View r0 = r8.findViewById(r0)
                            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
                            r8.g = r0
                            boolean r0 = defpackage.bnec.j(r8)
                            java.lang.String r1 = "constraintLayout"
                            r2 = 0
                            if (r0 == 0) goto L33
                            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.g
                            if (r0 != 0) goto L2b
                            defpackage.fxxm.j(r1)
                            r0 = r2
                        L2b:
                            bnbb r3 = new bnbb
                            r3.<init>()
                            defpackage.bned.c(r0, r3)
                        L33:
                            android.view.View r0 = r8.j()
                            r3 = 2131433529(0x7f0b1839, float:1.8488846E38)
                            android.view.View r0 = r0.findViewById(r3)
                            android.widget.ImageView r0 = (android.widget.ImageView) r0
                            if (r0 == 0) goto L47
                            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
                            r0.setScaleType(r3)
                        L47:
                            boolean r0 = r8.q()
                            java.lang.String r3 = "<this>"
                            java.lang.String r4 = "<get-title>(...)"
                            if (r0 == 0) goto L9c
                            android.widget.TextView r0 = r8.m()
                            defpackage.fxxm.e(r0, r4)
                            defpackage.fxxm.f(r0, r3)
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
                            android.widget.TextView r0 = r8.m()
                            int r0 = r0.getLineHeight()
                            android.widget.TextView r5 = r8.m()
                            int r5 = r5.getHeight()
                            if (r0 > r5) goto L9c
                            android.widget.TextView r0 = r8.m()
                            r3 = 8388659(0x800033, float:1.1755015E-38)
                            r0.setGravity(r3)
                            goto Lcf
                        L9c:
                            android.widget.TextView r0 = r8.m()
                            r5 = 8388627(0x800013, float:1.175497E-38)
                            r0.setGravity(r5)
                            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.g
                            if (r0 != 0) goto Lae
                            defpackage.fxxm.j(r1)
                            r0 = r2
                        Lae:
                            bnbe r5 = new bnbe
                            r5.<init>()
                            defpackage.bned.c(r0, r5)
                            android.widget.TextView r0 = r8.m()
                            defpackage.fxxm.e(r0, r4)
                            bnbf r4 = new bnbf
                            r4.<init>()
                            defpackage.fxxm.f(r0, r3)
                            android.view.ViewGroup$MarginLayoutParams r3 = defpackage.bnee.a(r0)
                            r4.a(r3)
                            r0.setLayoutParams(r3)
                        Lcf:
                            com.google.android.material.button.MaterialButton r0 = r8.o()
                            java.lang.String r3 = "<get-expandButton>(...)"
                            defpackage.fxxm.e(r0, r3)
                            bnbc r3 = new bnbc
                            r3.<init>()
                            defpackage.bncj.b(r0, r3)
                            androidx.constraintlayout.widget.ConstraintLayout r0 = r8.g
                            if (r0 != 0) goto Le8
                            defpackage.fxxm.j(r1)
                            goto Le9
                        Le8:
                            r2 = r0
                        Le9:
                            ikj r0 = defpackage.bned.a(r2)
                            r8.h = r0
                            bnbd r0 = new bnbd
                            r0.<init>()
                            defpackage.bnec.g(r8, r0)
                            fxrq r8 = defpackage.fxrq.a
                            return r8
                        */
                        throw new UnsupportedOperationException("Method not decompiled: defpackage.bnat.a(java.lang.Object):java.lang.Object");
                    }
                });
                return fxrq.a;
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: bnar
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SummaryCard.this.o().performClick();
            }
        });
        this.p = new fxre(new fxwd() { // from class: bnas
            @Override // defpackage.fxwd
            public final Object a() {
                ikj ikjVar = new ikj();
                SummaryCard summaryCard = SummaryCard.this;
                ikj ikjVar2 = summaryCard.h;
                if (ikjVar2 == null) {
                    fxxm.j("collapsedConstraints");
                    ikjVar2 = null;
                }
                ikjVar.f(ikjVar2);
                bned.d(ikjVar);
                ikjVar.d(R.id.uiflow_summary_card_media, 6);
                ikjVar.h(R.id.uiflow_summary_card_media, 7, 0, 6);
                bned.b(ikjVar, R.id.uiflow_summary_card_title, -2);
                ikjVar.d(R.id.uiflow_summary_card_expand_button, 4);
                int i2 = summaryCard.i();
                ikjVar.i(R.id.uiflow_summary_card_title, 3, 0, 3, i2 + i2);
                ikjVar.i(R.id.uiflow_summary_card_expand_button, 3, 0, 3, summaryCard.i());
                ikjVar.i(R.id.uiflow_summary_card_title, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard.h());
                ikjVar.i(R.id.uiflow_summary_card_expanded_body, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard.h());
                ikjVar.i(R.id.uiflow_summary_card_feature_disclaimer, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard.h());
                ikjVar.h(R.id.uiflow_summary_card_cta, 6, R.id.uiflow_summary_card_expanded_media_container, 7);
                if (summaryCard.q()) {
                    ikjVar.i(R.id.uiflow_summary_card_cta, 3, summaryCard.f(), 4, summaryCard.i());
                    ikjVar.i(R.id.uiflow_summary_card_cta, 4, 0, 4, summaryCard.i());
                } else {
                    int f = summaryCard.f();
                    int i3 = summaryCard.i();
                    ikjVar.i(f, 4, 0, 4, i3 + i3);
                }
                ikjVar.h(R.id.uiflow_summary_card_expanded_media_container, 3, 0, 3);
                ikjVar.h(R.id.uiflow_summary_card_expanded_media_container, 6, 0, 6);
                ikjVar.h(R.id.uiflow_summary_card_expanded_media_container, 7, 0, 7);
                bned.e(ikjVar, summaryCard.getWidth());
                TypedValue typedValue = new TypedValue();
                summaryCard.getContext().getTheme().resolveAttribute(R.attr.cardLottieRatioConstraintsHeight, typedValue, true);
                ikjVar.n(R.id.uiflow_summary_card_expanded_media_container, typedValue.string.toString());
                int i4 = summaryCard.i();
                ikjVar.i(R.id.uiflow_summary_card_title, 3, R.id.uiflow_summary_card_expanded_media_container, 4, i4 + i4);
                ikjVar.i(R.id.uiflow_summary_card_expand_button, 3, R.id.uiflow_summary_card_expanded_media_container, 4, summaryCard.i());
                ikjVar.i(R.id.uiflow_summary_card_title, 6, 0, 6, summaryCard.h());
                ikjVar.i(R.id.uiflow_summary_card_expanded_body, 6, 0, 6, summaryCard.h());
                ikjVar.i(R.id.uiflow_summary_card_feature_disclaimer, 6, 0, 6, summaryCard.h());
                ikjVar.h(R.id.uiflow_summary_card_cta, 6, 0, 6);
                return ikjVar;
            }
        });
        this.q = new fxre(new fxwd() { // from class: bnau
            @Override // defpackage.fxwd
            public final Object a() {
                ikj ikjVar = new ikj();
                SummaryCard summaryCard = SummaryCard.this;
                ikj ikjVar2 = summaryCard.h;
                if (ikjVar2 == null) {
                    fxxm.j("collapsedConstraints");
                    ikjVar2 = null;
                }
                ikjVar.f(ikjVar2);
                bned.d(ikjVar);
                ikjVar.d(R.id.uiflow_summary_card_media, 6);
                ikjVar.h(R.id.uiflow_summary_card_media, 7, 0, 6);
                bned.b(ikjVar, R.id.uiflow_summary_card_title, -2);
                ikjVar.d(R.id.uiflow_summary_card_expand_button, 4);
                int i2 = summaryCard.i();
                ikjVar.i(R.id.uiflow_summary_card_title, 3, 0, 3, i2 + i2);
                ikjVar.i(R.id.uiflow_summary_card_expand_button, 3, 0, 3, summaryCard.i());
                ikjVar.i(R.id.uiflow_summary_card_title, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard.h());
                ikjVar.i(R.id.uiflow_summary_card_expanded_body, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard.h());
                ikjVar.i(R.id.uiflow_summary_card_feature_disclaimer, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard.h());
                ikjVar.h(R.id.uiflow_summary_card_cta, 6, R.id.uiflow_summary_card_expanded_media_container, 7);
                if (summaryCard.q()) {
                    ikjVar.i(R.id.uiflow_summary_card_cta, 3, summaryCard.f(), 4, summaryCard.i());
                    ikjVar.i(R.id.uiflow_summary_card_cta, 4, 0, 4, summaryCard.i());
                } else {
                    int f = summaryCard.f();
                    int i3 = summaryCard.i();
                    ikjVar.i(f, 4, 0, 4, i3 + i3);
                }
                double height = summaryCard.k().getHeight();
                ikjVar.h(R.id.uiflow_summary_card_expanded_media_container, 3, 0, 3);
                ikjVar.h(R.id.uiflow_summary_card_expanded_media_container, 6, 0, 6);
                bned.e(ikjVar, (int) (height * 0.5d));
                int i4 = summaryCard.i();
                ikjVar.i(R.id.uiflow_summary_card_title, 3, 0, 3, i4 + i4);
                ikjVar.i(R.id.uiflow_summary_card_expand_button, 3, 0, 3, summaryCard.i());
                ikjVar.i(R.id.uiflow_summary_card_title, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard.h());
                ikjVar.i(R.id.uiflow_summary_card_expanded_body, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard.h());
                ikjVar.i(R.id.uiflow_summary_card_feature_disclaimer, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard.h());
                ikjVar.i(R.id.uiflow_summary_card_cta, 6, R.id.uiflow_summary_card_expanded_media_container, 7, summaryCard.h());
                return ikjVar;
            }
        });
        this.r = new fxre(new fxwd() { // from class: bnav
            @Override // defpackage.fxwd
            public final Object a() {
                return Boolean.valueOf(SummaryCard.this.n().getVisibility() == 0);
            }
        });
        this.s = new fxre(new fxwd() { // from class: bnaw
            @Override // defpackage.fxwd
            public final Object a() {
                ikj ikjVar = SummaryCard.this.h;
                if (ikjVar == null) {
                    fxxm.j("collapsedConstraints");
                    ikjVar = null;
                }
                return Integer.valueOf(ikjVar.p().d.M);
            }
        });
        this.t = new fxre(new fxwd() { // from class: bnax
            @Override // defpackage.fxwd
            public final Object a() {
                ikj ikjVar = SummaryCard.this.h;
                if (ikjVar == null) {
                    fxxm.j("collapsedConstraints");
                    ikjVar = null;
                }
                return Integer.valueOf(ikjVar.p().d.J);
            }
        });
        this.u = new fxre(new fxwd() { // from class: bnay
            @Override // defpackage.fxwd
            public final Object a() {
                Iterator a = bnec.f(SummaryCard.this).a();
                while (a.hasNext()) {
                    Object next = a.next();
                    if (((View) next) instanceof ScrollView) {
                        fxxm.d(next, "null cannot be cast to non-null type android.widget.ScrollView");
                        return (ScrollView) next;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.k = new fxre(new fxwd() { // from class: bnaz
            @Override // defpackage.fxwd
            public final Object a() {
                fyak fyakVar = new fyak(new fyal(bnec.f(SummaryCard.this), new fxwo() { // from class: bnbg
                    @Override // defpackage.fxwo
                    public final Object a(Object obj) {
                        int i2 = SummaryCard.l;
                        fxxm.f((View) obj, "it");
                        return Boolean.valueOf(!(r2 instanceof ScrollView));
                    }
                }));
                int i2 = 0;
                while (fyakVar.hasNext()) {
                    i2 += ((View) fyakVar.next()).getTop();
                }
                return Integer.valueOf(i2);
            }
        });
        this.v = new fxre(new fxwd() { // from class: bnba
            @Override // defpackage.fxwd
            public final Object a() {
                return (TextView) SummaryCard.this.findViewById(R.id.uiflow_summary_card_title);
            }
        });
        this.w = new fxre(new fxwd() { // from class: bnal
            @Override // defpackage.fxwd
            public final Object a() {
                return (MaterialButton) SummaryCard.this.findViewById(R.id.uiflow_summary_card_expand_button);
            }
        });
        this.x = new fxre(new fxwd() { // from class: bnam
            @Override // defpackage.fxwd
            public final Object a() {
                return SummaryCard.this.findViewById(R.id.uiflow_summary_card_expanded_media);
            }
        });
        this.y = new fxre(new fxwd() { // from class: bnan
            @Override // defpackage.fxwd
            public final Object a() {
                return SummaryCard.this.findViewById(R.id.uiflow_summary_card_expanded_body);
            }
        });
        this.z = new fxre(new fxwd() { // from class: bnao
            @Override // defpackage.fxwd
            public final Object a() {
                return (TextView) SummaryCard.this.findViewById(R.id.uiflow_summary_card_feature_disclaimer);
            }
        });
        this.A = new fxre(new fxwd() { // from class: bnap
            @Override // defpackage.fxwd
            public final Object a() {
                return (MaterialButton) SummaryCard.this.findViewById(R.id.uiflow_summary_card_cta);
            }
        });
        this.B = new fxre(new fxwd() { // from class: bnaq
            @Override // defpackage.fxwd
            public final Object a() {
                CharSequence text = SummaryCard.this.l().getText();
                fxxm.e(text, "getText(...)");
                return Integer.valueOf(true != fybh.y(text) ? R.id.uiflow_summary_card_feature_disclaimer : R.id.uiflow_summary_card_expanded_body);
            }
        });
    }

    public /* synthetic */ SummaryCard(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // defpackage.bncp
    public final void g(bmrj bmrjVar) {
    }
}

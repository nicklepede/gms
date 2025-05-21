package com.google.android.gms.constellation.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.constellation.ui.widget.ConsentScrollView;
import defpackage.arxo;
import defpackage.atkt;
import defpackage.atmg;
import defpackage.eigb;
import defpackage.eiid;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ConsentScrollView extends NestedScrollView {
    public static final arxo h = atmg.a("consent_scroll_view");
    public atkt i;
    public eiid j;
    public eiid k;
    private boolean l;
    private View m;

    public ConsentScrollView(Context context) {
        super(context);
        this.l = false;
        eigb eigbVar = eigb.a;
        this.j = eigbVar;
        this.k = eigbVar;
    }

    public final int A() {
        View view = this.m;
        if (view != null) {
            return view.getBottom() - (getHeight() + getScrollY());
        }
        return 0;
    }

    public final void B() {
        if (this.m != null) {
            int A = A();
            arxo arxoVar = h;
            arxoVar.d("Diff: %d, Bottom: %d, Height: %d, Scroll: %d", Integer.valueOf(A), Integer.valueOf(this.m.getBottom()), Integer.valueOf(getHeight()), Integer.valueOf(getScrollY()));
            arxoVar.d("IsConsentScrollOnBottom: %b", Boolean.valueOf(this.l));
            boolean z = A() <= 0;
            boolean z2 = this.l;
            if (z != z2) {
                boolean z3 = true ^ z2;
                this.l = z3;
                atkt atktVar = this.i;
                if (atktVar != null) {
                    atktVar.n(z3);
                } else {
                    arxoVar.d("Listener is null, caching toggle event", new Object[0]);
                    this.j = eiid.j(Boolean.valueOf(z3));
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(getChildCount() - 1);
        this.m = childAt;
        childAt.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: atks
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = i4 - i2;
                if (i9 == i8 - i6 || i9 <= 0) {
                    return;
                }
                ConsentScrollView consentScrollView = ConsentScrollView.this;
                boolean z = consentScrollView.A() <= 0;
                atkt atktVar = consentScrollView.i;
                if (atktVar != null) {
                    atktVar.o(z);
                } else {
                    ConsentScrollView.h.d("Listener is null, caching toggle event", new Object[0]);
                    consentScrollView.k = eiid.j(Boolean.valueOf(z));
                }
            }
        });
    }

    @Override // androidx.core.widget.NestedScrollView, android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        B();
    }

    public ConsentScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.l = false;
        eigb eigbVar = eigb.a;
        this.j = eigbVar;
        this.k = eigbVar;
    }

    public ConsentScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = false;
        eigb eigbVar = eigb.a;
        this.j = eigbVar;
        this.k = eigbVar;
    }
}

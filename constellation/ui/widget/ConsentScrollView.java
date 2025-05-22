package com.google.android.gms.constellation.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.google.android.gms.constellation.ui.widget.ConsentScrollView;
import defpackage.auad;
import defpackage.avow;
import defpackage.avqj;
import defpackage.ektg;
import defpackage.ekvi;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class ConsentScrollView extends NestedScrollView {
    public static final auad h = avqj.a("consent_scroll_view");
    public avow i;
    public ekvi j;
    public ekvi k;
    private boolean l;
    private View m;

    public ConsentScrollView(Context context) {
        super(context);
        this.l = false;
        ektg ektgVar = ektg.a;
        this.j = ektgVar;
        this.k = ektgVar;
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
            auad auadVar = h;
            auadVar.d("Diff: %d, Bottom: %d, Height: %d, Scroll: %d", Integer.valueOf(A), Integer.valueOf(this.m.getBottom()), Integer.valueOf(getHeight()), Integer.valueOf(getScrollY()));
            auadVar.d("IsConsentScrollOnBottom: %b", Boolean.valueOf(this.l));
            boolean z = A() <= 0;
            boolean z2 = this.l;
            if (z != z2) {
                boolean z3 = true ^ z2;
                this.l = z3;
                avow avowVar = this.i;
                if (avowVar != null) {
                    avowVar.n(z3);
                } else {
                    auadVar.d("Listener is null, caching toggle event", new Object[0]);
                    this.j = ekvi.j(Boolean.valueOf(z3));
                }
            }
        }
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        View childAt = getChildAt(getChildCount() - 1);
        this.m = childAt;
        childAt.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: avov
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                int i9 = i4 - i2;
                if (i9 == i8 - i6 || i9 <= 0) {
                    return;
                }
                ConsentScrollView consentScrollView = ConsentScrollView.this;
                boolean z = consentScrollView.A() <= 0;
                avow avowVar = consentScrollView.i;
                if (avowVar != null) {
                    avowVar.o(z);
                } else {
                    ConsentScrollView.h.d("Listener is null, caching toggle event", new Object[0]);
                    consentScrollView.k = ekvi.j(Boolean.valueOf(z));
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
        ektg ektgVar = ektg.a;
        this.j = ektgVar;
        this.k = ektgVar;
    }

    public ConsentScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.l = false;
        ektg ektgVar = ektg.a;
        this.j = ektgVar;
        this.k = ektgVar;
    }
}

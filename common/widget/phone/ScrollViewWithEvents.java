package com.google.android.gms.common.widget.phone;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class ScrollViewWithEvents extends ScrollView implements ViewTreeObserver.OnGlobalLayoutListener {
    public boolean a;

    public ScrollViewWithEvents(Context context) {
        super(context);
    }

    private final void b(int i) {
        boolean a = a(i);
        if (a != this.a) {
            this.a = a;
        }
    }

    public final boolean a(int i) {
        return getChildAt(getChildCount() + (-1)).getBottom() - (i + getHeight()) <= 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnGlobalLayoutListener(this);
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeGlobalOnLayoutListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        b(getScrollY());
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        if (i2 == i4) {
            return;
        }
        if (this.a || i2 > i4) {
            b(i2);
        }
    }

    public ScrollViewWithEvents(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ScrollViewWithEvents(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

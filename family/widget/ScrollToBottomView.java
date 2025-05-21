package com.google.android.gms.family.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ScrollView;
import com.google.android.gms.R;
import defpackage.badk;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ScrollToBottomView extends ScrollView {
    public badk a;

    public ScrollToBottomView(Context context) {
        this(context, null, 0);
    }

    private final void a() {
        badk badkVar;
        if (getChildAt(getChildCount() - 1).getBottom() - (getHeight() + getScrollY()) >= getResources().getDimension(R.dimen.fm_create_bottom_margin) || (badkVar = this.a) == null) {
            return;
        }
        badkVar.y();
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        a();
    }

    @Override // android.view.View
    protected final void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a();
    }

    public ScrollToBottomView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrollToBottomView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

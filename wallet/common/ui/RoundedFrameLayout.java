package com.google.android.gms.wallet.common.ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import defpackage.rpq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class RoundedFrameLayout extends FrameLayout {
    private Path a;
    private final int b;

    public RoundedFrameLayout(Context context) {
        super(context);
        this.b = a(context, null);
    }

    private static int a(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return 0;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpq.n);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    @Override // android.view.ViewGroup
    protected final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.a == null) {
            Path path = new Path();
            this.a = path;
            RectF rectF = new RectF(canvas.getClipBounds());
            float f = this.b;
            path.addRoundRect(rectF, f, f, Path.Direction.CW);
        }
        canvas.clipPath(this.a);
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.a = null;
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = a(context, attributeSet);
    }

    public RoundedFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = a(context, attributeSet);
    }
}

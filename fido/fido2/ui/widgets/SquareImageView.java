package com.google.android.gms.fido.fido2.ui.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.imageview.ShapeableImageView;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class SquareImageView extends ShapeableImageView {
    public SquareImageView(Context context) {
        super(context);
    }

    @Override // com.google.android.material.imageview.ShapeableImageView, android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getSize(i) <= View.MeasureSpec.getSize(i2)) {
            super.onMeasure(i, i);
        } else {
            super.onMeasure(i2, i2);
        }
    }

    public SquareImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public SquareImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
    }
}

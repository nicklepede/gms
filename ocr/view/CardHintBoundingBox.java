package com.google.android.gms.ocr.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import com.google.android.gms.R;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class CardHintBoundingBox extends BoundingBox {
    private final int a;
    private final Path b;
    private final Path c;
    private final Path d;
    private final Path e;

    public CardHintBoundingBox(Context context) {
        this(context, null);
    }

    @Override // com.google.android.gms.ocr.view.BoundingBox
    protected final void a(Rect rect) {
        super.a(rect);
        int i = this.a / 2;
        rect.left = Math.max(i, rect.left);
        rect.right = Math.max(i, rect.right);
        rect.top = Math.max(i, rect.top);
        rect.bottom = Math.max(i, rect.bottom);
    }

    @Override // com.google.android.gms.ocr.view.BoundingBox
    protected final void b(Rect rect, RectF rectF, RectF rectF2, RectF rectF3, RectF rectF4, float f) {
        Path path = this.b;
        path.reset();
        path.addArc(rectF4, 135.0f, 45.0f);
        path.lineTo(rect.left, rect.top + f);
        path.arcTo(rectF, 180.0f, 45.0f);
        Path path2 = this.c;
        path2.reset();
        path2.addArc(rectF, 225.0f, 45.0f);
        path2.lineTo(rect.right - f, rect.top);
        path2.arcTo(rectF2, 270.0f, 45.0f);
        Path path3 = this.d;
        path3.reset();
        path3.addArc(rectF2, 315.0f, 45.0f);
        path3.lineTo(rect.right, rect.bottom - f);
        path3.arcTo(rectF3, 0.0f, 45.0f);
        Path path4 = this.e;
        path4.reset();
        path4.addArc(rectF3, 45.0f, 45.0f);
        path4.lineTo(rect.right - f, rect.bottom);
        path4.arcTo(rectF4, 90.0f, 45.0f);
    }

    @Override // com.google.android.gms.ocr.view.BoundingBox, android.view.View
    protected final void onDraw(Canvas canvas) {
        if (d()) {
            super.onDraw(canvas);
        }
    }

    public CardHintBoundingBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CardHintBoundingBox(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Path();
        this.c = new Path();
        this.d = new Path();
        this.e = new Path();
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.ocr_edge_detection_hint_line_width);
        this.a = dimensionPixelSize;
        e(getResources().getColor(R.color.ocr_edge_detection_hint_stroke), dimensionPixelSize);
    }
}

package com.google.android.gms.ocr.camera;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.cast.JGCastService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class CameraPreviewLayout extends FrameLayout {
    public Rect a;

    public CameraPreviewLayout(Context context) {
        super(context);
    }

    public final void a(Rect rect) {
        this.a = rect;
        requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.a == null) {
            super.onLayout(z, i, i2, i3, i4);
            return;
        }
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).layout(this.a.left, this.a.top, this.a.right, this.a.bottom);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.a == null || View.MeasureSpec.getMode(i) != 1073741824 || View.MeasureSpec.getMode(i2) != 1073741824) {
            super.onMeasure(i, i2);
            return;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.a.width(), JGCastService.FLAG_PRIVATE_DISPLAY);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.a.height(), JGCastService.FLAG_PRIVATE_DISPLAY);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec2);
        }
    }

    public CameraPreviewLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CameraPreviewLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

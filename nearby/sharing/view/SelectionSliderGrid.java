package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.cast.JGCastService;
import defpackage.auub;
import defpackage.ctxe;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SelectionSliderGrid extends ViewGroup {
    public float a;
    private final RectF b;
    private final RectF c;
    private final RectF d;
    private Path e;

    public SelectionSliderGrid(Context context) {
        super(context);
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        this.a = 0.0f;
    }

    private final Path b(RectF rectF) {
        Path path = new Path();
        float f = this.a;
        path.addRoundRect(rectF, f, f, Path.Direction.CW);
        return path;
    }

    public final void a(int i, int i2) {
        if (ctxe.a(getContext())) {
            int i3 = i2 - i;
            int measuredWidth = i + getMeasuredWidth();
            i2 = (i2 + getMeasuredWidth()) - i3;
            i = measuredWidth - i3;
        }
        RectF rectF = this.c;
        float f = i;
        float f2 = i2;
        if (rectF.left == f && rectF.right == f2 && rectF.bottom == getMeasuredHeight()) {
            return;
        }
        this.b.set(0.0f, 0.0f, f, getMeasuredHeight());
        rectF.set(f, 0.0f, f2, getMeasuredHeight());
        this.e = b(rectF);
        this.d.set(f2, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        invalidate();
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        canvas.save();
        if (auub.c()) {
            canvas.clipOutPath(this.e);
        } else {
            canvas.clipRect(this.b);
        }
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (this.b.intersects(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom()) && !childAt.isSelected()) {
                canvas.translate(childAt.getLeft(), childAt.getTop());
                childAt.draw(canvas);
                canvas.translate(-childAt.getLeft(), -childAt.getTop());
            }
        }
        canvas.restore();
        canvas.save();
        canvas.clipPath(this.e);
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt2 = getChildAt(i2);
            if (this.c.intersects(childAt2.getLeft(), childAt2.getTop(), childAt2.getRight(), childAt2.getBottom()) && childAt2.isSelected()) {
                canvas.translate(childAt2.getLeft(), childAt2.getTop());
                childAt2.draw(canvas);
                canvas.translate(-childAt2.getLeft(), -childAt2.getTop());
            }
        }
        canvas.restore();
        canvas.save();
        if (auub.c()) {
            canvas.clipOutPath(this.e);
        } else {
            canvas.clipRect(this.d);
        }
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt3 = getChildAt(i3);
            if (this.d.intersects(childAt3.getLeft(), childAt3.getTop(), childAt3.getRight(), childAt3.getBottom()) && !childAt3.isSelected()) {
                canvas.translate(childAt3.getLeft(), childAt3.getTop());
                childAt3.draw(canvas);
                canvas.translate(-childAt3.getLeft(), -childAt3.getTop());
            }
        }
        canvas.restore();
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = (i3 - i) - getPaddingRight();
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int i5 = 0;
        int i6 = paddingLeft;
        int i7 = i6;
        int i8 = 0;
        while (i8 < getChildCount()) {
            View childAt = ctxe.a(getContext()) ? getChildAt((getChildCount() - 1) - i8) : getChildAt(i8);
            int i9 = true != childAt.isSelected() ? i7 : i6;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (marginLayoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
            }
            int i10 = (paddingRight - paddingLeft) / i5;
            int i11 = i9 + marginLayoutParams.leftMargin;
            int i12 = marginLayoutParams.topMargin;
            childAt.layout(i11, i12, (i11 + i10) - marginLayoutParams.rightMargin, ((paddingBottom - paddingTop) + i12) - marginLayoutParams.bottomMargin);
            if (childAt.isSelected()) {
                i6 += i10;
            } else {
                i7 += i10;
            }
            i8++;
            i5 = 0;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
        RectF rectF = this.b;
        rectF.set(rectF.left, rectF.top, rectF.right, getMeasuredHeight());
        RectF rectF2 = this.c;
        rectF2.set(rectF2.left, rectF2.top, rectF2.right, getMeasuredHeight());
        this.e = b(rectF2);
        RectF rectF3 = this.d;
        rectF3.set(rectF3.left, rectF3.top, getMeasuredWidth(), getMeasuredHeight());
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int measuredHeight = getMeasuredHeight() - getPaddingBottom();
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) childAt.getLayoutParams();
            if (marginLayoutParams == null) {
                marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
            }
            int i4 = marginLayoutParams.leftMargin;
            int i5 = marginLayoutParams.topMargin;
            childAt.measure(View.MeasureSpec.makeMeasureSpec(((((measuredWidth - paddingLeft) / 0) + i4) - marginLayoutParams.rightMargin) - i4, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec((((measuredHeight - paddingTop) + i5) - marginLayoutParams.bottomMargin) - i5, JGCastService.FLAG_PRIVATE_DISPLAY));
        }
    }

    @Override // android.view.ViewGroup
    protected final /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ViewGroup.MarginLayoutParams(layoutParams);
    }

    public SelectionSliderGrid(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        this.a = 0.0f;
    }

    public SelectionSliderGrid(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new RectF();
        this.c = new RectF();
        this.d = new RectF();
        this.e = new Path();
        this.a = 0.0f;
    }
}

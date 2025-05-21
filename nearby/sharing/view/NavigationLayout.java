package com.google.android.gms.nearby.sharing.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.cast.JGCastService;
import defpackage.a;
import defpackage.clzc;
import defpackage.crog;
import defpackage.croh;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class NavigationLayout extends ViewGroup implements Iterable {
    public Drawable a;
    public int b;
    public boolean c;
    public int d;
    private int e;
    private boolean f;
    private boolean g;

    public NavigationLayout(Context context) {
        super(context);
        this.d = 1;
        this.f = false;
        this.g = true;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f = true;
        }
    }

    public static int c(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        throw new IllegalStateException(a.j(i, "Invalid navStyle "));
    }

    private final void d(int i, int i2, int i3, int i4) {
        boolean z = this.f;
        int i5 = true != z ? 1 : -1;
        int i6 = true != z ? i4 : i3;
        for (int i7 = 0; i7 < (i4 - i3) + 1; i7++) {
            int i8 = i6 - (i5 * i7);
            View childAt = getChildAt(i8);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                croh crohVar = (croh) childAt.getLayoutParams();
                int i9 = (i - crohVar.rightMargin) - measuredWidth;
                childAt.layout(i9, crohVar.topMargin + i2, i, measuredHeight + i2);
                int i10 = i9 - crohVar.leftMargin;
                if (a(i8)) {
                    i10 -= this.b;
                }
                i = i10;
            }
        }
    }

    private final void e(int i, int i2, int i3, int i4) {
        boolean z = this.f;
        int i5 = true != z ? 1 : -1;
        int i6 = true != z ? i3 : i4;
        for (int i7 = 0; i7 < (i4 - i3) + 1; i7++) {
            int i8 = (i5 * i7) + i6;
            View childAt = getChildAt(i8);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                croh crohVar = (croh) childAt.getLayoutParams();
                int i9 = i + crohVar.leftMargin;
                if (a(i8)) {
                    i9 += this.b;
                }
                i2 += crohVar.topMargin;
                childAt.layout(i9, i2, i9 + measuredWidth, measuredHeight + i2);
                i = i9 + measuredWidth + crohVar.rightMargin;
            }
        }
    }

    protected final boolean a(int i) {
        if (this.g) {
            View childAt = getChildAt(i);
            croh crohVar = (croh) childAt.getLayoutParams();
            return this.f ? crohVar.a == 2 && childAt.getVisibility() == 0 : crohVar.a == 1 && childAt.getVisibility() == 0;
        }
        while (true) {
            i--;
            if (i < 0) {
                return false;
            }
            View childAt2 = getChildAt(i);
            if (childAt2 != null && childAt2.getVisibility() != 8) {
                return b();
            }
        }
    }

    public final boolean b() {
        return this.c && this.a != null;
    }

    @Override // android.view.ViewGroup
    protected final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof croh;
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new croh();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new croh(getContext(), attributeSet);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new crog(this);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        if (this.a == null) {
            return;
        }
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt != null && childAt.getVisibility() != 8 && a(i)) {
                croh crohVar = (croh) childAt.getLayoutParams();
                int right = this.f ? childAt.getRight() + crohVar.rightMargin : (childAt.getLeft() - crohVar.leftMargin) - this.b;
                Drawable drawable = this.a;
                if (drawable != null) {
                    drawable.setBounds(right, getPaddingTop() + this.e, this.b + right, (getHeight() - getPaddingBottom()) - this.e);
                    this.a.draw(canvas);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5 = this.d;
        int i6 = i5 - 1;
        if (i5 == 0) {
            throw null;
        }
        int i7 = 0;
        if (i6 == 0) {
            int i8 = i3 - i;
            if (!this.g) {
                int paddingLeft = getPaddingLeft();
                int paddingRight = i8 - getPaddingRight();
                int paddingTop = getPaddingTop();
                int childCount = getChildCount() - 1;
                int i9 = childCount / 2;
                int i10 = i9 + 1;
                if (this.f) {
                    e(paddingLeft, paddingTop, i10, childCount);
                    d(paddingRight, paddingTop, 0, i9);
                    return;
                } else {
                    e(paddingLeft, paddingTop, 0, i9);
                    d(paddingRight, paddingTop, i10, childCount);
                    return;
                }
            }
            int paddingLeft2 = getPaddingLeft();
            int paddingRight2 = i8 - getPaddingRight();
            int paddingTop2 = getPaddingTop();
            int childCount2 = getChildCount() - 1;
            while (i7 <= childCount2) {
                if (((croh) getChildAt(i7).getLayoutParams()).a == 1) {
                    if (this.f) {
                        e(paddingLeft2, paddingTop2, i7, i7);
                    } else {
                        d(paddingRight2, paddingTop2, i7, i7);
                    }
                } else if (this.f) {
                    d(paddingRight2, paddingTop2, i7, i7);
                } else {
                    e(paddingLeft2, paddingTop2, i7, i7);
                }
                i7++;
            }
            return;
        }
        if (i6 == 1) {
            if (this.f) {
                d((i3 - i) - getPaddingRight(), getPaddingTop(), 0, getChildCount() - 1);
                return;
            } else {
                e(getPaddingLeft(), getPaddingTop(), 0, getChildCount() - 1);
                return;
            }
        }
        if (i6 == 2) {
            if (this.f) {
                e(getPaddingLeft(), getPaddingTop(), 0, getChildCount() - 1);
                return;
            } else {
                d((i3 - i) - getPaddingRight(), getPaddingTop(), 0, getChildCount() - 1);
                return;
            }
        }
        if (i6 != 3) {
            return;
        }
        if (!this.g) {
            e(getPaddingLeft(), getPaddingTop(), 0, getChildCount() - 1);
            return;
        }
        int i11 = i3 - i;
        int paddingLeft3 = getPaddingLeft();
        int paddingRight3 = i11 - getPaddingRight();
        int paddingTop3 = getPaddingTop();
        int childCount3 = getChildCount() - 1;
        while (i7 <= childCount3) {
            int i12 = ((paddingRight3 - paddingLeft3) / 2) + paddingLeft3;
            if (((croh) getChildAt(i7).getLayoutParams()).a == 1) {
                if (this.f) {
                    d(i12, paddingTop3, i7, i7);
                } else {
                    e(i12, paddingTop3, i7, i7);
                }
            } else if (this.f) {
                e(i12, paddingTop3, i7, i7);
            } else {
                d(i12, paddingTop3, i7, i7);
            }
            i7++;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3;
        if (this.d == 4) {
            int size = View.MeasureSpec.getSize(i);
            int childCount = getChildCount();
            int paddingTop = getPaddingTop() + getPaddingBottom();
            if (this.g) {
                i3 = 2;
            } else {
                i3 = childCount;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt == null || childAt.getVisibility() == 8) {
                        i3--;
                    }
                }
            }
            int paddingLeft = (((size - getPaddingLeft()) - getPaddingRight()) - (this.b * (i3 - 1))) / i3;
            int i5 = paddingTop;
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt2 = getChildAt(i6);
                if (childAt2 != null && childAt2.getVisibility() != 8) {
                    croh crohVar = (croh) childAt2.getLayoutParams();
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, JGCastService.FLAG_PRIVATE_DISPLAY), i2);
                    i5 = Math.max(i5, childAt2.getMeasuredHeight() + crohVar.topMargin + crohVar.bottomMargin);
                }
            }
            setMeasuredDimension(resolveSize(size, i), resolveSize(i5 + paddingTop, i2));
            return;
        }
        if (this.g) {
            int paddingLeft2 = getPaddingLeft() + getPaddingRight() + this.b;
            int childCount2 = getChildCount();
            int paddingTop2 = getPaddingTop() + getPaddingBottom();
            int i7 = paddingTop2;
            for (int i8 = 0; i8 < childCount2; i8++) {
                View childAt3 = getChildAt(i8);
                if (childAt3 != null && childAt3.getVisibility() != 8) {
                    croh crohVar2 = (croh) childAt3.getLayoutParams();
                    measureChildWithMargins(childAt3, i, paddingLeft2, i2, paddingTop2);
                    i7 = Math.max(i7, childAt3.getMeasuredHeight() + crohVar2.topMargin + crohVar2.bottomMargin);
                }
            }
            setMeasuredDimension(resolveSize(paddingLeft2, i), resolveSize(i7 + paddingTop2, i2));
            return;
        }
        int paddingLeft3 = getPaddingLeft() + getPaddingRight();
        int paddingTop3 = getPaddingTop() + getPaddingBottom();
        int childCount3 = getChildCount();
        int i9 = paddingTop3;
        for (int i10 = 0; i10 < childCount3; i10++) {
            View childAt4 = getChildAt(i10);
            if (childAt4 != null && childAt4.getVisibility() != 8) {
                if (a(i10)) {
                    paddingLeft3 += this.b;
                }
                croh crohVar3 = (croh) childAt4.getLayoutParams();
                measureChildWithMargins(childAt4, i, paddingLeft3, i2, paddingTop3);
                paddingLeft3 += childAt4.getMeasuredWidth() + crohVar3.leftMargin + crohVar3.rightMargin;
                i9 = Math.max(i9, childAt4.getMeasuredHeight() + crohVar3.topMargin + crohVar3.bottomMargin);
            }
        }
        setMeasuredDimension(resolveSize(paddingLeft3, i), resolveSize(i9 + paddingTop3, i2));
    }

    @Override // android.view.ViewGroup
    protected final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof croh ? new croh((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new croh((ViewGroup.MarginLayoutParams) layoutParams) : new croh(layoutParams);
    }

    public NavigationLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = 1;
        this.f = false;
        this.g = true;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f = true;
        }
    }

    public NavigationLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public NavigationLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = 1;
        this.f = false;
        this.g = true;
        if (getResources().getConfiguration().getLayoutDirection() == 1) {
            this.f = true;
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, clzc.b, i, 0);
            int i3 = obtainStyledAttributes.getInt(2, 0);
            if (i3 >= 0) {
                this.d = c(i3);
            }
            Drawable drawable = obtainStyledAttributes.getDrawable(0);
            if (drawable != null) {
                this.c = true;
                this.a = drawable;
                this.b = drawable.getIntrinsicWidth();
                setWillNotDraw(false);
                this.e = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            }
            obtainStyledAttributes.recycle();
        }
    }
}

package com.google.android.gms.growth.ui.widget.pageindicator;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import defpackage.bkpi;
import defpackage.bkpj;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class PageIndicator extends ViewGroup {
    public final ArrayList a;
    public bkpj b;
    public boolean c;
    private final int d;
    private final int e;
    private final int f;
    private int g;
    private int h;
    private final Runnable i;

    public PageIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.g = -1;
        this.h = -1;
        this.i = new bkpi(this);
        int dimension = (int) context.getResources().getDimension(R.dimen.qs_page_indicator_width);
        this.d = dimension;
        this.e = (int) context.getResources().getDimension(R.dimen.qs_page_indicator_height);
        this.f = (int) (dimension * 0.4f);
        setLayerType(1, null);
    }

    private static int d(boolean z, boolean z2, boolean z3) {
        int i;
        int i2;
        if (z) {
            if (z2) {
                i = R.drawable.minor_b_c_animation;
                i2 = R.drawable.major_b_a_animation;
            } else {
                i = R.drawable.minor_b_a_animation;
                i2 = R.drawable.major_b_c_animation;
            }
        } else if (z2) {
            i = R.drawable.minor_c_b_animation;
            i2 = R.drawable.major_a_b_animation;
        } else {
            i = R.drawable.minor_a_b_animation;
            i2 = R.drawable.major_c_b_animation;
        }
        return true != z3 ? i : i2;
    }

    private final void e(ImageView imageView, int i) {
        AnimatedVectorDrawable animatedVectorDrawable = (AnimatedVectorDrawable) getContext().getDrawable(i);
        imageView.setImageDrawable(animatedVectorDrawable);
        animatedVectorDrawable.start();
        postDelayed(this.i, 250L);
    }

    private final void f(int i) {
        int childCount = getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            ImageView imageView = (ImageView) getChildAt(i2);
            imageView.setTranslationX(0.0f);
            imageView.setImageResource(i2 == i ? R.drawable.major_a_b : R.drawable.minor_a_b);
            imageView.setAlpha(1.0f);
            i2++;
        }
    }

    public final void a(float f) {
        ArrayList arrayList = this.a;
        int i = this.g;
        if (!arrayList.isEmpty()) {
            i = ((Integer) arrayList.get(arrayList.size() - 1)).intValue();
        }
        int i2 = (int) f;
        int i3 = (f != ((float) i2) ? 1 : 0) | (i2 + i2);
        if (i3 == i) {
            return;
        }
        if (this.c) {
            arrayList.add(Integer.valueOf(i3));
        } else {
            c(i3);
        }
    }

    public final void b(int i) {
        if (this.h == i) {
            return;
        }
        this.h = i;
        if (this.c) {
            Log.w("PageIndicator", "setNumPages during animation");
        }
        while (i < getChildCount()) {
            removeViewAt(getChildCount() - 1);
        }
        while (i > getChildCount()) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.minor_a_b);
            addView(imageView, new ViewGroup.LayoutParams(this.d, this.e));
        }
        f(this.g >> 1);
    }

    public final void c(int i) {
        int i2 = i >> 1;
        if (Math.abs(this.g - i) == 1) {
            int i3 = this.g;
            int i4 = i3 >> 1;
            f(i4);
            int i5 = i3 & 1;
            boolean z = i5 == 0 ? i3 < i : i3 > i;
            int min = Math.min(i4, i2);
            int max = Math.max(i4, i2);
            if (max == min) {
                max++;
            }
            ImageView imageView = (ImageView) getChildAt(min);
            ImageView imageView2 = (ImageView) getChildAt(max);
            if (imageView != null && imageView2 != null) {
                boolean z2 = 1 == i5;
                imageView2.setTranslationX(imageView.getX() - imageView2.getX());
                e(imageView, d(z2, z, false));
                imageView.setAlpha(1.0f);
                e(imageView2, d(z2, z, true));
                imageView2.setAlpha(1.0f);
                this.c = true;
            }
        } else {
            f(i2);
        }
        this.g = i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        if (childCount == 0) {
            return;
        }
        setRotationY(getLayoutDirection() == 1 ? 180.0f : 0.0f);
        int i5 = 0;
        while (i5 < childCount) {
            int i6 = this.d;
            int i7 = i5 + 1;
            int i8 = (i6 - this.f) * i7;
            getChildAt(i5).layout(i8, 0, i6 + i8, this.e);
            i5 = i7;
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int childCount = getChildCount();
        if (childCount == 0) {
            super.onMeasure(i, i2);
            return;
        }
        int i3 = this.d;
        int i4 = this.e;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, JGCastService.FLAG_PRIVATE_DISPLAY);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, JGCastService.FLAG_PRIVATE_DISPLAY);
        for (int i5 = 0; i5 < childCount; i5++) {
            getChildAt(i5).measure(makeMeasureSpec, makeMeasureSpec2);
        }
        int i6 = this.f;
        setMeasuredDimension(((i3 - i6) * (childCount + 1)) + i6, i4);
    }
}

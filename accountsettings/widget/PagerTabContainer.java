package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.R;
import defpackage.bqnj;
import defpackage.ecaa;
import defpackage.fjul;
import defpackage.rsv;
import defpackage.sii;
import defpackage.taj;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PagerTabContainer extends FrameLayout {
    public final PagerTabLayout a;
    private final ImageView b;
    private final float c;
    private final float d;
    private boolean e;
    private int f;

    public PagerTabContainer(Context context) {
        this(context, null);
    }

    public final void a(int i) {
        if (!this.e || getChildCount() <= 0) {
            this.b.setAlpha(0.0f);
            return;
        }
        float f = i;
        PagerTabLayout pagerTabLayout = this.a;
        int measuredWidth = pagerTabLayout.getChildAt(0).getMeasuredWidth() - pagerTabLayout.getMeasuredWidth();
        float f2 = this.c;
        float f3 = this.d;
        float f4 = f2 + f3;
        if (sii.s(getContext())) {
            float f5 = measuredWidth;
            if (f >= f5 - f2) {
                this.b.setAlpha(1.0f);
            } else {
                float f6 = f5 - f4;
                if (f < f6) {
                    this.b.setAlpha(0.0f);
                    if (this.f == 2) {
                        this.e = false;
                    }
                } else {
                    this.b.setAlpha((f - f6) / f3);
                }
            }
        } else if (f <= f2) {
            this.b.setAlpha(1.0f);
        } else if (f > f4) {
            this.b.setAlpha(0.0f);
            if (this.f == 2) {
                this.e = false;
            }
        } else {
            this.b.setAlpha((f4 - f) / f3);
        }
        this.b.setVisibility(true != (sii.s(getContext()) ? pagerTabLayout.canScrollHorizontally(-1) : pagerTabLayout.canScrollHorizontally(1)) ? 8 : 0);
    }

    public final void b(int i) {
        this.a.setBackgroundColor(i);
        GradientDrawable gradientDrawable = new GradientDrawable(sii.s(getContext()) ? GradientDrawable.Orientation.RIGHT_LEFT : GradientDrawable.Orientation.LEFT_RIGHT, new int[]{bqnj.b(i, 0.0f), bqnj.b(i, 0.6f), bqnj.b(i, 0.9f)});
        gradientDrawable.setGradientType(0);
        this.b.setImageDrawable(gradientDrawable);
    }

    public final void c(int i) {
        this.e = true;
        this.f = i;
        a(this.a.getScrollX());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            PagerTabLayout pagerTabLayout = this.a;
            if (pagerTabLayout.getChildAt(0) == null) {
                return;
            }
            int paddingLeft = ((i3 - i) - getPaddingLeft()) - getLeftPaddingOffset();
            int measuredWidth = pagerTabLayout.getChildAt(0).getMeasuredWidth();
            if (rsv.d) {
                ViewGroup.LayoutParams layoutParams = pagerTabLayout.getLayoutParams();
                pagerTabLayout.p(0);
                if (measuredWidth < paddingLeft) {
                    pagerTabLayout.o(1);
                    layoutParams.width = -1;
                } else {
                    pagerTabLayout.o(0);
                    layoutParams.width = -2;
                }
                pagerTabLayout.setLayoutParams(layoutParams);
            } else if (measuredWidth < paddingLeft && pagerTabLayout.z != 1) {
                pagerTabLayout.p(1);
                pagerTabLayout.o(1);
                ViewGroup.LayoutParams layoutParams2 = pagerTabLayout.getLayoutParams();
                layoutParams2.width = -1;
                pagerTabLayout.setLayoutParams(layoutParams2);
            } else if (measuredWidth >= paddingLeft && pagerTabLayout.z != 0) {
                pagerTabLayout.p(0);
                pagerTabLayout.o(0);
                ViewGroup.LayoutParams layoutParams3 = pagerTabLayout.getLayoutParams();
                layoutParams3.width = -2;
                pagerTabLayout.setLayoutParams(layoutParams3);
            }
            ImageView imageView = this.b;
            ViewGroup.LayoutParams layoutParams4 = imageView.getLayoutParams();
            if (rsv.d) {
                layoutParams4.width = paddingLeft / pagerTabLayout.c();
            } else {
                layoutParams4.width = paddingLeft / 6;
            }
            layoutParams4.height = pagerTabLayout.getHeight();
            imageView.setLayoutParams(layoutParams4);
        }
    }

    public PagerTabContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagerTabContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = context.getResources().getDimensionPixelSize(R.dimen.as_tabs_overlay_fade_distance);
        float dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.as_tabs_horizontal_padding);
        this.c = dimensionPixelSize + dimensionPixelSize;
        LayoutInflater.from(context).inflate(R.layout.as_pager_tab_container, this);
        PagerTabLayout pagerTabLayout = (PagerTabLayout) findViewById(R.id.tab_layout);
        this.a = pagerTabLayout;
        pagerTabLayout.b = new taj(this);
        if (fjul.q()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.colorOnSurfaceVariant, R.attr.colorPrimary});
            int color = obtainStyledAttributes.getColor(0, 0);
            int color2 = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            ColorStateList colorStateList = new ColorStateList(new int[][]{new int[]{android.R.attr.state_selected}, new int[0]}, new int[]{color2, color});
            if (pagerTabLayout.n != colorStateList) {
                pagerTabLayout.n = colorStateList;
                int size = pagerTabLayout.d.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((ecaa) pagerTabLayout.d.get(i2)).b();
                }
            }
        }
        this.b = (ImageView) findViewById(R.id.overlay_end);
    }
}

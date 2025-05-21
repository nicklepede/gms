package com.google.android.gms.wearable.backup.wear.lockscreenbc25.pin;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.ImageView;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.lockscreenbc25.pin.PinPadDot;
import defpackage.djxz;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PinPadDot extends ImageView {
    private final int a;
    private final int b;
    private final int c;
    private final float d;
    private final int e;
    private final PathInterpolator f;
    private final PathInterpolator g;
    private final PathInterpolator h;
    private final PathInterpolator i;
    private final PathInterpolator j;
    private final PathInterpolator k;

    public PinPadDot(Context context) {
        this(context, null);
    }

    private final Animator a(int i, int i2, int i3, PathInterpolator pathInterpolator) {
        ValueAnimator ofArgb = ValueAnimator.ofArgb(i, i2);
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: djxt
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinPadDot.this.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_IN);
            }
        });
        ofArgb.setDuration(i3);
        ofArgb.setInterpolator(pathInterpolator);
        return ofArgb;
    }

    private final Animator b(float f, float f2, int i, PathInterpolator pathInterpolator) {
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, f, f2), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f, f2));
        ofPropertyValuesHolder.setDuration(i);
        ofPropertyValuesHolder.setInterpolator(pathInterpolator);
        return ofPropertyValuesHolder;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
        int i = this.e;
        marginLayoutParams.setMargins(i, 0, i, 0);
        setLayoutParams(marginLayoutParams);
    }

    public PinPadDot(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PinPadDot(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public PinPadDot(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, djxz.a, R.attr.wearableLockPinDotStyle, 0);
        int color = obtainStyledAttributes.getColor(1, 0);
        this.a = color;
        int color2 = obtainStyledAttributes.getColor(2, color);
        this.b = color2;
        int color3 = obtainStyledAttributes.getColor(0, color);
        this.c = color3;
        setColorFilter(color, PorterDuff.Mode.SRC_IN);
        Resources resources = context.getResources();
        float dimension = resources.getDimension(R.dimen.pin_dot_initial_size) * (1.0f / resources.getDimension(R.dimen.pin_dot_size));
        this.d = dimension;
        setScaleX(dimension);
        setScaleY(dimension);
        this.e = resources.getDimensionPixelSize(R.dimen.pin_dot_margin_horizontal);
        PathInterpolator pathInterpolator = new PathInterpolator(0.08f, 1.0f, 0.33f, 1.0f);
        this.f = pathInterpolator;
        PathInterpolator pathInterpolator2 = new PathInterpolator(0.33f, 1.33f, 0.33f, 1.0f);
        this.g = pathInterpolator2;
        PathInterpolator pathInterpolator3 = new PathInterpolator(0.31f, 0.94f, 0.34f, 1.0f);
        this.h = pathInterpolator3;
        PathInterpolator pathInterpolator4 = new PathInterpolator(0.31f, 0.94f, 0.34f, 1.0f);
        this.i = pathInterpolator4;
        PathInterpolator pathInterpolator5 = new PathInterpolator(0.27f, 1.06f, 0.18f, 1.0f);
        this.j = pathInterpolator5;
        PathInterpolator pathInterpolator6 = new PathInterpolator(0.27f, 1.06f, 0.18f, 1.0f);
        this.k = pathInterpolator6;
        Animator b = b(1.0f, 1.25f, 250, pathInterpolator4);
        Animator a = a(color3, color2, 250, pathInterpolator3);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(a, b);
        Animator b2 = b(1.25f, dimension, 750, pathInterpolator6);
        Animator a2 = a(color2, color, 150, pathInterpolator5);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(a2, b2);
        new AnimatorSet().playSequentially(animatorSet, animatorSet2);
        AnimatorSet animatorSet3 = new AnimatorSet();
        ValueAnimator ofArgb = ValueAnimator.ofArgb(color, color3);
        ofArgb.setInterpolator(pathInterpolator);
        ofArgb.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: djxs
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinPadDot.this.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_IN);
            }
        });
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, dimension, 1.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, dimension, 1.0f));
        ofPropertyValuesHolder.setInterpolator(pathInterpolator2);
        animatorSet3.playTogether(ofArgb, ofPropertyValuesHolder);
        animatorSet3.setDuration(250L);
        AnimatorSet animatorSet4 = new AnimatorSet();
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(color3, color);
        ofArgb2.setInterpolator(pathInterpolator);
        ofArgb2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: djxr
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                PinPadDot.this.setColorFilter(((Integer) valueAnimator.getAnimatedValue()).intValue(), PorterDuff.Mode.SRC_IN);
            }
        });
        ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(this, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 1.0f, dimension), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 1.0f, dimension));
        ofPropertyValuesHolder2.setInterpolator(pathInterpolator2);
        animatorSet4.playTogether(ofArgb2, ofPropertyValuesHolder2);
        animatorSet4.setDuration(250L);
        obtainStyledAttributes.recycle();
    }
}

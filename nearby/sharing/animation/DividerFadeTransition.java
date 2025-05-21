package com.google.android.gms.nearby.sharing.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.gms.nearby.sharing.animation.DividerFadeTransition;
import defpackage.clzc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class DividerFadeTransition extends Transition {
    public static final /* synthetic */ int a = 0;
    private static final String[] b = {"com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha"};
    private int c;

    public DividerFadeTransition(Context context) {
        this(context, null);
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        int i = this.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha", 255);
        } else {
            if (i2 != 1) {
                return;
            }
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha", 0);
        }
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        int i = this.c;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha", 0);
        } else {
            if (i2 != 1) {
                return;
            }
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha", 255);
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        final Drawable dividerDrawable;
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues.view;
        if (!(view instanceof LinearLayout) || (dividerDrawable = ((LinearLayout) view).getDividerDrawable()) == null) {
            return null;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(dividerDrawable, "alpha", ((Integer) transitionValues.values.get("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha")).intValue(), ((Integer) transitionValues2.values.get("com.google.android.gms.nearby.sharing.animation:DividerFadeTransition:alpha")).intValue());
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cmdm
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                int i = DividerFadeTransition.a;
                dividerDrawable.invalidateSelf();
            }
        });
        return ofInt;
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return b;
    }

    public DividerFadeTransition(Context context, AttributeSet attributeSet) {
        this.c = 2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, clzc.a, 0, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                this.c = new int[]{1, 2}[obtainStyledAttributes.getInt(0, 0)];
            }
            obtainStyledAttributes.recycle();
        }
    }
}

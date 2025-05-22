package com.google.android.gms.nearby.sharing.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.R;
import defpackage.cohk;
import defpackage.colv;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class FadeTransition extends Transition {
    public static final /* synthetic */ int b = 0;
    private static final String[] c = {"com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha"};
    public int a;

    public FadeTransition(Context context) {
        this(context, null);
    }

    public static boolean a(View view) {
        Boolean bool = (Boolean) view.getTag(R.id.root);
        if (bool != null && bool.booleanValue()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z = false;
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            z = z || a(viewGroup.getChildAt(i));
        }
        return z;
    }

    private static boolean b(View view) {
        if (view.getParent() == null || !(view.getParent() instanceof View)) {
            return false;
        }
        View view2 = (View) view.getParent();
        if (view2.getId() == R.id.root) {
            return true;
        }
        return b(view2);
    }

    @Override // android.transition.Transition
    public final void captureEndValues(TransitionValues transitionValues) {
        int i = this.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha", Float.valueOf(1.0f));
        } else {
            if (i2 != 1) {
                return;
            }
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha", Float.valueOf(0.0f));
        }
    }

    @Override // android.transition.Transition
    public final void captureStartValues(TransitionValues transitionValues) {
        int i = this.a;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        if (i2 == 0) {
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha", Float.valueOf(0.0f));
        } else {
            if (i2 != 1) {
                return;
            }
            transitionValues.values.put("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha", Float.valueOf(1.0f));
        }
    }

    @Override // android.transition.Transition
    public final Animator createAnimator(ViewGroup viewGroup, TransitionValues transitionValues, TransitionValues transitionValues2) {
        if (transitionValues == null || transitionValues2 == null) {
            return null;
        }
        View view = transitionValues.view;
        if (view.getTransitionName() != null || !b(view)) {
            return null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", ((Float) transitionValues.values.get("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha")).floatValue(), ((Float) transitionValues2.values.get("com.google.android.gms.nearby.sharing.animation:FadeTransition:alpha")).floatValue());
        ofFloat.addListener(new colv(this, view));
        return ofFloat;
    }

    @Override // android.transition.Transition
    public final String[] getTransitionProperties() {
        return c;
    }

    public FadeTransition(Context context, AttributeSet attributeSet) {
        this.a = 2;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cohk.a, 0, 0);
            if (obtainStyledAttributes.hasValue(0)) {
                this.a = new int[]{1, 2}[obtainStyledAttributes.getInt(0, 0)];
            }
            obtainStyledAttributes.recycle();
        }
    }
}

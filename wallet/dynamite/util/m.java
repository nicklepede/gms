package com.google.android.gms.wallet.dynamite.util;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public final class m {
    public static AnimatorSet a(View view, View view2, int i) {
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f);
        ofFloat.setDuration(750L);
        ofFloat.addListener(new g(view, view2));
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "alpha", 1.0f);
        ofFloat2.setDuration(750L);
        ofFloat2.addListener(new h(view2));
        animatorSet.play(ofFloat).before(ofFloat2).after(i);
        view2.setAlpha(0.0f);
        return animatorSet;
    }
}

package com.google.android.gms.wallet.dynamite.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
final class i extends AnimatorListenerAdapter {
    final /* synthetic */ Runnable a;

    public i(Runnable runnable) {
        this.a = runnable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.run();
    }
}

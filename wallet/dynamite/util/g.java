package com.google.android.gms.wallet.dynamite.util;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
final class g extends AnimatorListenerAdapter {
    final /* synthetic */ View a;
    final /* synthetic */ View b;

    public g(View view, View view2) {
        this.a = view;
        this.b = view2;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.a.setVisibility(8);
        this.b.setVisibility(0);
    }
}

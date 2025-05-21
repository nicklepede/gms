package com.google.android.gms.wallet.dynamite.util;

import android.animation.ObjectAnimator;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import j$.time.Duration;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class j implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ View a;
    final /* synthetic */ View b;
    final /* synthetic */ Duration c;
    final /* synthetic */ Duration d;
    final /* synthetic */ Runnable e;

    public j(View view, View view2, Duration duration, Duration duration2, Runnable runnable) {
        this.a = view;
        this.b = view2;
        this.c = duration;
        this.d = duration2;
        this.e = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.a;
        view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        View view2 = this.b;
        int[] iArr = new int[2];
        view2.getLocationOnScreen(iArr);
        int width = iArr[0] + (view2.getWidth() / 2);
        int height = iArr[1] + (view2.getHeight() / 2);
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr2);
        int width2 = iArr2[0] + (view.getWidth() / 2);
        int height2 = iArr2[1] + (view.getHeight() / 2);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view2, "translationX", width2 - width);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view2, "translationY", height2 - height);
        Duration duration = this.d;
        long millis = this.c.toMillis();
        long millis2 = duration.toMillis();
        ofFloat.setDuration(millis);
        ofFloat2.setDuration(millis);
        ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat2.setInterpolator(new AccelerateDecelerateInterpolator());
        ofFloat.setStartDelay(millis2);
        ofFloat2.setStartDelay(millis2);
        ofFloat.addListener(new i(this.e));
        ofFloat.start();
        ofFloat2.start();
    }
}

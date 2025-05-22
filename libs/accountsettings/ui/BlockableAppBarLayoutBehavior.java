package com.google.android.gms.libs.accountsettings.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class BlockableAppBarLayoutBehavior extends AppBarLayout.Behavior {
    public boolean a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockableAppBarLayoutBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fxxm.f(context, "context");
        this.a = true;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: gc */
    public final boolean i(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, View view2, int i, int i2) {
        fxxm.f(appBarLayout, "child");
        fxxm.f(view, "target");
        fxxm.f(view2, "nestedScrollable");
        return this.a && super.i(coordinatorLayout, appBarLayout, view, view2, i, i2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, defpackage.iks
    public final /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        return i(coordinatorLayout, (AppBarLayout) view, view2, view3, i, i2);
    }

    @Override // defpackage.edty, defpackage.iks
    public final /* bridge */ /* synthetic */ boolean j(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        fxxm.f(appBarLayout, "child");
        fxxm.f(motionEvent, "motionEvent");
        return this.a && super.j(coordinatorLayout, appBarLayout, motionEvent);
    }
}

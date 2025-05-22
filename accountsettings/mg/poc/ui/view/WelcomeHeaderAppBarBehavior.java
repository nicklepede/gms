package com.google.android.gms.accountsettings.mg.poc.ui.view;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.google.android.apps.common.proguard.UsedByReflection;
import com.google.android.gms.accountsettings.mg.poc.ui.card.widget.CardDeckView;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@UsedByReflection
/* loaded from: classes2.dex */
public final class WelcomeHeaderAppBarBehavior extends AppBarLayout.Behavior {
    public WelcomeHeaderAppBarBehavior(Context context, AttributeSet attributeSet) {
        fxxm.f(context, "context");
    }

    public static final Bundle u(AppBarLayout appBarLayout) {
        fxxm.f(appBarLayout, "appBarLayout");
        Bundle bundle = new Bundle();
        bundle.putBoolean("KEY_LIFTED", appBarLayout.f);
        return bundle;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, defpackage.iks
    public final /* bridge */ /* synthetic */ void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        c(coordinatorLayout, (AppBarLayout) view, view2, i, i2, i3, i4, i5, iArr);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, defpackage.iks
    public final /* bridge */ /* synthetic */ void d(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        d(coordinatorLayout, (AppBarLayout) view, parcelable);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, defpackage.iks
    public final /* bridge */ /* synthetic */ Parcelable r(View view) {
        return u((AppBarLayout) view);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: s */
    public final void c(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        fxxm.f(appBarLayout, "appBarLayout");
        fxxm.f(view, "target");
        fxxm.f(iArr, "consumed");
        super.c(coordinatorLayout, appBarLayout, view, i, i2, i3, i4, i5, iArr);
        if ((view instanceof CardDeckView) || (view instanceof SwipeRefreshLayout)) {
            boolean z = true;
            if (i2 <= 0 && i4 < 0) {
                z = false;
            }
            appBarLayout.u(z);
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: t */
    public final void d(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, Parcelable parcelable) {
        fxxm.f(appBarLayout, "appBarLayout");
        super.d(coordinatorLayout, appBarLayout, parcelable);
        boolean z = ((Bundle) parcelable).getBoolean("KEY_LIFTED", false);
        appBarLayout.u(z);
        appBarLayout.l(!z);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ Parcelable r(AppBarLayout appBarLayout) {
        return u(appBarLayout);
    }
}

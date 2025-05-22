package com.google.android.gms.accountsettings.mg.poc.ui.viewpager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;
import defpackage.fxxm;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class LockableViewPager extends ViewPager {
    public boolean h;
    public boolean i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LockableViewPager(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        fxxm.f(context, "context");
    }

    @Override // androidx.viewpager.widget.ViewPager
    public final void i(int i) {
        if (this.i) {
            j(i, false);
        } else {
            super.i(i);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.h && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.h && super.onTouchEvent(motionEvent);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LockableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        fxxm.f(context, "context");
        this.h = true;
    }

    public /* synthetic */ LockableViewPager(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}

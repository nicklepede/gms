package com.google.android.gms.growth.uiflow.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.gms.R;
import defpackage.bksf;
import defpackage.bkwk;
import defpackage.fvbo;
import defpackage.tk;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class ViewPagerExtended extends FrameLayout {
    public final ViewPager2 a;
    public bksf b;
    private final boolean c;
    private float d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewPagerExtended(Context context) {
        this(context, null, 0, 6, null);
        fvbo.f(context, "context");
    }

    public final int a() {
        return this.a.b;
    }

    public final void b(int i, boolean z) {
        this.a.f(i, z);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float f;
        float x;
        fvbo.f(motionEvent, "event");
        ViewPager2 viewPager2 = this.a;
        tk c = viewPager2.c();
        Integer valueOf = c != null ? Integer.valueOf(c.a()) : null;
        bksf bksfVar = this.b;
        if (valueOf == null || bksfVar == null || viewPager2.b != valueOf.intValue() - 1) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.d = motionEvent.getX();
        } else if (action == 1) {
            if (this.c) {
                f = motionEvent.getX();
                x = this.d;
            } else {
                f = this.d;
                x = motionEvent.getX();
            }
            if (f - x < 0.0f) {
                bksfVar.a.f(bksfVar.b);
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewPagerExtended(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        fvbo.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ViewPagerExtended(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fvbo.f(context, "context");
        this.c = bkwk.a(context);
        View.inflate(context, R.layout.view_pager_carousel, this);
        View findViewById = findViewById(R.id.view_pager_carousel);
        fvbo.e(findViewById, "findViewById(...)");
        this.a = (ViewPager2) findViewById;
    }

    public /* synthetic */ ViewPagerExtended(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}

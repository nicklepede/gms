package com.google.android.gms.nearby.sharing.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.nearby.sharing.view.SelectionSlider;
import defpackage.auqz;
import defpackage.aura;
import defpackage.auub;
import defpackage.cohk;
import defpackage.ctxe;
import defpackage.ctxx;
import defpackage.ctxy;
import defpackage.jpp;
import defpackage.jpr;
import defpackage.jpt;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SelectionSlider extends FrameLayout {
    public ImageView a;
    public SelectionSliderGrid b;
    public int c;
    public boolean d;
    private LinearLayout e;
    private int f;
    private int g;
    private int h;
    private float i;
    private VelocityTracker j;
    private float k;
    private boolean l;

    public SelectionSlider(Context context) {
        super(context);
        new ArrayList();
        this.i = 1.0f;
        this.d = false;
        e(context, null);
    }

    private final int c() {
        if (ctxe.a(getContext())) {
            return (-getMeasuredWidth()) / 0;
        }
        getMeasuredWidth();
        int i = 0 / 0;
        return 0;
    }

    private final void d(float f) {
        int width = getWidth() - this.a.getWidth();
        int i = 0;
        if (ctxe.a(getContext())) {
            i = -width;
            width = 0;
        }
        jpt jptVar = new jpt(this.a, jpr.a);
        jptVar.h = f;
        jptVar.s.a = -16.8f;
        jptVar.o = i;
        jptVar.n = width;
        jpp jppVar = new jpp() { // from class: ctxw
            @Override // defpackage.jpp
            public final void a() {
                SelectionSlider selectionSlider = SelectionSlider.this;
                selectionSlider.b.a((int) selectionSlider.a.getTranslationX(), ((int) selectionSlider.a.getTranslationX()) + selectionSlider.a.getWidth());
            }
        };
        if (jptVar.m) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        ArrayList arrayList = jptVar.r;
        if (!arrayList.contains(jppVar)) {
            arrayList.add(jppVar);
        }
        ctxx ctxxVar = new ctxx(this);
        ArrayList arrayList2 = jptVar.q;
        if (!arrayList2.contains(ctxxVar)) {
            arrayList2.add(ctxxVar);
        }
        jptVar.d();
    }

    private final void e(Context context, AttributeSet attributeSet) {
        float ambiguousGestureMultiplier;
        float scaledAmbiguousGestureMultiplier;
        LayoutInflater.from(context).inflate(R.layout.sharing_view_selection_slider, this);
        this.e = (LinearLayout) findViewById(R.id.sharing_visibility_slider_linear);
        this.b = (SelectionSliderGrid) findViewById(R.id.sharing_visibility_slider_grid);
        this.a = (ImageView) findViewById(R.id.sharing_visibility_window);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.f = viewConfiguration.getScaledMinimumFlingVelocity();
        this.g = viewConfiguration.getScaledMaximumFlingVelocity();
        this.h = viewConfiguration.getScaledTouchSlop();
        if (auub.g()) {
            scaledAmbiguousGestureMultiplier = viewConfiguration.getScaledAmbiguousGestureMultiplier();
            this.i = scaledAmbiguousGestureMultiplier;
        } else if (auub.f()) {
            ambiguousGestureMultiplier = ViewConfiguration.getAmbiguousGestureMultiplier();
            this.i = ambiguousGestureMultiplier;
        }
        this.a.addOnLayoutChangeListener(new ctxy(this));
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, cohk.d);
            if (obtainStyledAttributes.hasValue(0)) {
                this.a.setImageResource(obtainStyledAttributes.getResourceId(0, 0));
            }
            this.b.a = obtainStyledAttributes.getDimension(1, 0.0f);
            obtainStyledAttributes.recycle();
        }
    }

    private final void f(boolean z) {
        int c = c();
        if (ctxe.a(getContext())) {
            c += (-getMeasuredWidth()) + this.a.getMeasuredWidth();
        }
        float f = c;
        if (z && this.a.isLaidOut()) {
            this.d = true;
            this.a.animate().translationX(f).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ctxu
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    SelectionSlider selectionSlider = SelectionSlider.this;
                    selectionSlider.b.a((int) selectionSlider.a.getTranslationX(), ((int) selectionSlider.a.getTranslationX()) + selectionSlider.a.getWidth());
                }
            }).withEndAction(new Runnable() { // from class: ctxv
                @Override // java.lang.Runnable
                public final void run() {
                    SelectionSlider.this.d = false;
                }
            });
        } else {
            this.a.animate().cancel();
            this.a.setTranslationX(f);
            this.b.a(c, this.a.getWidth() + c);
            this.d = false;
        }
    }

    private final void g(View view, boolean z) {
        if (view != this) {
            view.setEnabled(z);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                g(viewGroup.getChildAt(i), z);
            }
        }
    }

    public final void a() {
        int width = (this.c + (this.a.getWidth() / 2)) / this.a.getWidth();
        if (ctxe.a(getContext())) {
            width = (-width) - 1;
        }
        Math.min(Math.max(width, 0), -1);
    }

    public final void b() {
        Context context = getContext();
        auqz auqzVar = aura.a;
        if (((AccessibilityManager) context.getSystemService("accessibility")).isEnabled()) {
            this.b.getChildAt(0).sendAccessibilityEvent(8);
        }
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || motionEvent.getAction() != 0 || motionEvent.getX() <= c() || motionEvent.getX() >= c() + this.a.getWidth()) {
            return false;
        }
        this.k = motionEvent.getX();
        this.l = true;
        if (this.j == null) {
            this.j = VelocityTracker.obtain();
        }
        this.j.addMovement(motionEvent);
        this.c = c();
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean z = this.d;
        int i3 = this.a.getLayoutParams().width;
        this.a.getLayoutParams().width = -1;
        int i4 = this.a.getLayoutParams().width;
        if (i3 != i4) {
            this.a.measure(View.MeasureSpec.makeMeasureSpec(i4, JGCastService.FLAG_PRIVATE_DISPLAY), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), JGCastService.FLAG_PRIVATE_DISPLAY));
            this.a.requestLayout();
            invalidate();
        }
        f(z);
        int i5 = 0;
        while (i5 < this.e.getChildCount()) {
            this.e.getChildAt(i5).setSelected(i5 == 0);
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.sharing.view.SelectionSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        g(this, z);
    }

    public SelectionSlider(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        new ArrayList();
        this.i = 1.0f;
        this.d = false;
        e(context, attributeSet);
    }

    public SelectionSlider(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        new ArrayList();
        this.i = 1.0f;
        this.d = false;
        e(context, attributeSet);
    }
}

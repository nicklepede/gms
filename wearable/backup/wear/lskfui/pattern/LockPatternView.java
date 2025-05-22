package com.google.android.gms.wearable.backup.wear.lskfui.pattern;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Shader;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.gms.R;
import com.google.android.gms.wearable.backup.wear.lskfui.pattern.LockPatternView;
import defpackage.dmjz;
import defpackage.dmka;
import defpackage.dmkb;
import defpackage.dmkd;
import defpackage.dmke;
import defpackage.tiy;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LockPatternView extends View {
    private int A;
    private int B;
    private int C;
    private int D;
    private int E;
    private boolean F;
    private final Interpolator G;
    private final Interpolator H;
    private final dmkd I;
    public final boolean[][] a;
    public boolean b;
    public boolean c;
    public float d;
    private final dmkb[][] e;
    private final int f;
    private final int g;
    private final float h;
    private final int i;
    private final Paint j;
    private final Paint k;
    private final ArrayList l;
    private float m;
    private float n;
    private long[] o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private float t;
    private float u;
    private final LinearGradient v;
    private final Path w;
    private final Rect x;
    private final Rect y;
    private int z;

    public LockPatternView(Context context) {
        this(context, null);
    }

    private final dmka e(float f, float f2) {
        dmka dmkaVar;
        dmka c = c(f, f2);
        dmka dmkaVar2 = null;
        if (c == null || this.a[c.a][c.b]) {
            c = null;
        }
        if (c == null) {
            return null;
        }
        ArrayList arrayList = this.l;
        if (arrayList.isEmpty()) {
            dmkaVar = null;
        } else {
            dmka dmkaVar3 = (dmka) arrayList.get(arrayList.size() - 1);
            int i = c.a;
            int i2 = dmkaVar3.a;
            int i3 = i - i2;
            int i4 = c.b;
            int i5 = dmkaVar3.b;
            int i6 = i4 - i5;
            if (Math.abs(i3) == 2 && Math.abs(i6) != 1) {
                i2 += i3 > 0 ? 1 : -1;
            }
            if (Math.abs(i6) == 2 && Math.abs(i3) != 1) {
                i5 += i6 > 0 ? 1 : -1;
            }
            dmkaVar = dmkaVar3;
            dmkaVar2 = dmka.a(i2, i5);
        }
        if (dmkaVar2 != null && !this.a[dmkaVar2.a][dmkaVar2.b]) {
            f(dmkaVar2);
            if (this.F) {
                m(dmkaVar2);
            }
        }
        if (this.F && dmkaVar != null) {
            m(dmkaVar);
        }
        f(c);
        if (this.r) {
            performHapticFeedback(1, 3);
        }
        return c;
    }

    private final void f(dmka dmkaVar) {
        this.a[dmkaVar.a][dmkaVar.b] = true;
        this.l.add(dmkaVar);
        if (!this.q) {
            l(dmkaVar, true);
        }
        this.I.b();
    }

    private final void g() {
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                this.a[i][i2] = false;
                this.o[(i2 * 3) + i] = 0;
            }
        }
    }

    private final void h() {
        j(R.string.wearable_lockscreen_access_pattern_cleared);
    }

    private final void i() {
        j(R.string.wearable_lockscreen_access_pattern_start);
    }

    private final void j(int i) {
        announceForAccessibility(getContext().getString(i));
    }

    private final void k(boolean z) {
        this.c = z;
        this.I.b();
    }

    private final void l(dmka dmkaVar, boolean z) {
        dmkb[][] dmkbVarArr = this.e;
        int i = dmkaVar.a;
        dmkb[] dmkbVarArr2 = dmkbVarArr[i];
        int i2 = dmkaVar.b;
        final dmkb dmkbVar = dmkbVarArr2[i2];
        Animator animator = dmkbVar.g;
        if (animator != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dmjy
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                LockPatternView.this.invalidate();
            }
        });
        ofFloat.setStartDelay(0L);
        ofFloat.setDuration(250L);
        AnimatorSet.Builder play = animatorSet.play(ofFloat);
        final float f = this.m;
        final float f2 = this.n;
        final float a = a(i2);
        final float b = b(i);
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: dmjv
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f3 = 1.0f - floatValue;
                float f4 = a * floatValue;
                dmkb dmkbVar2 = dmkbVar;
                dmkbVar2.e = (f * f3) + f4;
                dmkbVar2.f = (f3 * f2) + (floatValue * b);
                LockPatternView.this.invalidate();
            }
        });
        Interpolator interpolator = this.G;
        ofFloat2.setInterpolator(interpolator);
        ofFloat2.setDuration(50L);
        AnimatorSet.Builder with = play.with(ofFloat2);
        int i3 = this.f;
        int i4 = this.g;
        if (i3 != i4) {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener() { // from class: dmjw
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    dmkbVar.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    LockPatternView.this.invalidate();
                }
            };
            float f3 = i3 / 2.0f;
            float f4 = i4 / 2.0f;
            ValueAnimator ofFloat3 = ValueAnimator.ofFloat(f3, f4);
            ofFloat3.addUpdateListener(animatorUpdateListener);
            ofFloat3.setInterpolator(this.H);
            ofFloat3.setDuration(96L);
            ValueAnimator ofFloat4 = ValueAnimator.ofFloat(f4, f3);
            ofFloat4.addUpdateListener(animatorUpdateListener);
            ofFloat4.setInterpolator(interpolator);
            ofFloat4.setDuration(192L);
            AnimatorSet animatorSet2 = new AnimatorSet();
            animatorSet2.playSequentially(ofFloat3, ofFloat4);
            with.with(animatorSet2);
        }
        if (this.D != this.E) {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener2 = new ValueAnimator.AnimatorUpdateListener() { // from class: dmjx
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    dmkbVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    LockPatternView.this.invalidate();
                }
            };
            ValueAnimator ofFloat5 = ValueAnimator.ofFloat(0.0f, 1.0f);
            ValueAnimator ofFloat6 = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat5.addUpdateListener(animatorUpdateListener2);
            ofFloat6.addUpdateListener(animatorUpdateListener2);
            ofFloat5.setInterpolator(interpolator);
            ofFloat6.setInterpolator(this.H);
            ofFloat5.setDuration(50L);
            ofFloat6.setDuration(50L);
            AnimatorSet animatorSet3 = new AnimatorSet();
            if (this.F) {
                if (true != z) {
                    ofFloat5 = ofFloat6;
                }
                animatorSet3.play(ofFloat5);
            } else {
                animatorSet3.play(ofFloat6).after(150L).after(ofFloat5);
            }
            with.with(animatorSet3);
        }
        animatorSet.addListener(new dmjz(this, dmkbVar));
        dmkbVar.g = animatorSet;
        animatorSet.start();
    }

    private final void m(dmka dmkaVar) {
        l(dmkaVar, false);
    }

    private static final int n(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        return mode != Integer.MIN_VALUE ? mode != 0 ? size : i2 : Math.max(size, i2);
    }

    public final float a(int i) {
        float paddingLeft = getPaddingLeft();
        float f = this.t;
        return paddingLeft + (i * f) + (f / 2.0f);
    }

    public final float b(int i) {
        float paddingTop = getPaddingTop();
        float f = this.u;
        return paddingTop + (i * f) + (f / 2.0f);
    }

    public final dmka c(float f, float f2) {
        float f3 = this.d;
        float f4 = f3 * f3;
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                float b = b(i);
                float a = f - a(i2);
                float f5 = f2 - b;
                if ((a * a) + (f5 * f5) < f4) {
                    return dmka.a(i, i2);
                }
            }
        }
        return null;
    }

    public final void d() {
        this.l.clear();
        g();
        this.p = 0;
        invalidate();
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (r8 != Integer.MIN_VALUE) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        if (r1 == false) goto L20;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final boolean dispatchHoverEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            dmkd r0 = r7.I
            android.view.accessibility.AccessibilityManager r1 = r0.h
            boolean r2 = super.dispatchHoverEvent(r8)
            boolean r3 = r1.isEnabled()
            r4 = 0
            if (r3 == 0) goto L5b
            boolean r1 = r1.isTouchExplorationEnabled()
            if (r1 != 0) goto L16
            goto L5b
        L16:
            int r1 = r8.getAction()
            r3 = 7
            r5 = 1
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 == r3) goto L32
            r3 = 9
            if (r1 == r3) goto L32
            r8 = 10
            if (r1 == r8) goto L29
            goto L5b
        L29:
            int r8 = r0.l
            if (r8 == r6) goto L5b
            r0.f(r6)
        L30:
            r4 = r5
            goto L5b
        L32:
            float r1 = r8.getX()
            float r8 = r8.getY()
            com.google.android.gms.wearable.backup.wear.lskfui.pattern.LockPatternView r3 = r0.m
            dmka r8 = r3.c(r1, r8)
            if (r8 != 0) goto L44
        L42:
            r8 = r6
            goto L55
        L44:
            boolean[][] r1 = r3.a
            int r3 = r8.b
            int r8 = r8.a
            r1 = r1[r8]
            boolean r1 = r1[r3]
            int r8 = r8 * 3
            int r8 = r8 + r3
            int r8 = r8 + r5
            if (r1 != 0) goto L55
            goto L42
        L55:
            r0.f(r8)
            if (r8 == r6) goto L5b
            goto L30
        L5b:
            r8 = r2 | r4
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.backup.wear.lskfui.pattern.LockPatternView.dispatchHoverEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x00f5, code lost:
    
        if (r3 != Float.MIN_VALUE) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0237  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDraw(android.graphics.Canvas r27) {
        /*
            Method dump skipped, instructions count: 601
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wearable.backup.wear.lskfui.pattern.LockPatternView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        if (((AccessibilityManager) getContext().getSystemService(AccessibilityManager.class)).isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action == 7) {
                motionEvent.setAction(2);
            } else if (action == 9) {
                motionEvent.setAction(0);
            } else if (action == 10) {
                motionEvent.setAction(1);
            }
            onTouchEvent(motionEvent);
            motionEvent.setAction(action);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        int n = n(i, suggestedMinimumWidth);
        int n2 = n(i2, suggestedMinimumHeight);
        int i3 = this.z;
        if (i3 == 0) {
            n = Math.min(n, n2);
            n2 = n;
        } else if (i3 != 1) {
            n = Math.min(n, n2);
        } else {
            n2 = Math.min(n, n2);
        }
        setMeasuredDimension(n, n2);
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        ArrayList<dmka> arrayList;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        byte[] bytes = savedState.a.getBytes();
        if (bytes == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            for (byte b : bytes) {
                byte b2 = (byte) (b - 49);
                arrayList2.add(dmka.a(b2 / 3, b2 % 3));
            }
            arrayList = arrayList2;
        }
        ArrayList arrayList3 = this.l;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        g();
        for (dmka dmkaVar : arrayList) {
            this.a[dmkaVar.a][dmkaVar.b] = true;
        }
        this.p = 0;
        invalidate();
        this.p = savedState.b;
        this.b = savedState.c;
        this.q = savedState.d;
        this.r = savedState.e;
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        byte[] bArr;
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        ArrayList arrayList = this.l;
        if (arrayList == null) {
            bArr = new byte[0];
        } else {
            int size = arrayList.size();
            byte[] bArr2 = new byte[size];
            for (int i = 0; i < size; i++) {
                dmka dmkaVar = (dmka) arrayList.get(i);
                bArr2[i] = (byte) ((dmkaVar.a * 3) + dmkaVar.b + 49);
            }
            bArr = bArr2;
        }
        return new SavedState(onSaveInstanceState, new String(bArr), this.p, this.b, this.q, this.r);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.t = ((i - getPaddingLeft()) - getPaddingRight()) / 3.0f;
        this.u = ((i2 - getPaddingTop()) - getPaddingBottom()) / 3.0f;
        this.I.b();
        this.d = Math.min(this.u / 2.0f, this.t / 2.0f) * this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1, types: [int] */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v9 */
    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int i = 0;
        if (!this.b || !isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 0) {
            d();
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            dmka e = e(x, y);
            if (e != null) {
                k(true);
                this.p = 0;
                i();
            } else if (this.c) {
                k(false);
                h();
            }
            if (e != null) {
                float a = a(e.b);
                float b = b(e.a);
                float f = this.t / 2.0f;
                float f2 = this.u / 2.0f;
                invalidate((int) (a - f), (int) (b - f2), (int) (a + f), (int) (b + f2));
            }
            this.m = x;
            this.n = y;
            return true;
        }
        float f3 = 0.0f;
        if (action == 1) {
            ArrayList arrayList = this.l;
            if (!arrayList.isEmpty()) {
                k(false);
                for (int i2 = 0; i2 < 3; i2++) {
                    for (int i3 = 0; i3 < 3; i3++) {
                        dmkb dmkbVar = this.e[i2][i3];
                        Animator animator = dmkbVar.g;
                        if (animator != null) {
                            animator.cancel();
                            dmkbVar.g = null;
                            dmkbVar.a = this.f / 2.0f;
                            dmkbVar.d = 0.0f;
                            dmkbVar.e = Float.MIN_VALUE;
                            dmkbVar.f = Float.MIN_VALUE;
                        }
                    }
                }
                if (this.F) {
                    m((dmka) arrayList.get(arrayList.size() - 1));
                }
                j(R.string.wearable_lockscreen_access_pattern_detected);
                if (this.s) {
                    g();
                    this.p = 0;
                }
                invalidate();
            }
            return true;
        }
        if (action != 2) {
            if (action != 3) {
                return false;
            }
            if (this.c) {
                k(false);
                d();
                h();
            }
            return true;
        }
        int i4 = this.i;
        int historySize = motionEvent.getHistorySize();
        Rect rect = this.y;
        rect.setEmpty();
        boolean z3 = false;
        while (i < historySize + 1) {
            float historicalX = i < historySize ? motionEvent.getHistoricalX(i) : motionEvent.getX();
            float historicalY = i < historySize ? motionEvent.getHistoricalY(i) : motionEvent.getY();
            dmka e2 = e(historicalX, historicalY);
            ArrayList arrayList2 = this.l;
            int size = arrayList2.size();
            ?? r13 = size;
            r13 = size;
            if (e2 != null && size == z2) {
                k(z2);
                i();
                r13 = z2;
            }
            float abs = Math.abs(historicalX - this.m);
            float abs2 = Math.abs(historicalY - this.n);
            if (abs > f3 || abs2 > f3) {
                z3 = z2;
            }
            if (!this.c || r13 <= 0) {
                z = z2;
            } else {
                float f4 = i4;
                dmka dmkaVar = (dmka) arrayList2.get(r13 - 1);
                float a2 = a(dmkaVar.b);
                float b2 = b(dmkaVar.a);
                float min = Math.min(a2, historicalX) - f4;
                float max = Math.max(a2, historicalX) + f4;
                float min2 = Math.min(b2, historicalY) - f4;
                float max2 = Math.max(b2, historicalY) + f4;
                if (e2 != null) {
                    float f5 = this.t * 0.5f;
                    float f6 = this.u * 0.5f;
                    z = z2;
                    float a3 = a(e2.b);
                    float b3 = b(e2.a);
                    min = Math.min(a3 - f5, min);
                    max = Math.max(a3 + f5, max);
                    min2 = Math.min(b3 - f6, min2);
                    max2 = Math.max(b3 + f6, max2);
                } else {
                    z = z2;
                }
                rect.union(Math.round(min), Math.round(min2), Math.round(max), Math.round(max2));
            }
            i++;
            z2 = z;
            f3 = 0.0f;
        }
        boolean z4 = z2;
        this.m = motionEvent.getX();
        this.n = motionEvent.getY();
        if (z3) {
            Rect rect2 = this.x;
            rect2.union(rect);
            invalidate(rect2);
            rect2.set(rect);
        }
        return z4;
    }

    public LockPatternView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.j = paint;
        Paint paint2 = new Paint();
        this.k = paint2;
        this.l = new ArrayList(9);
        this.a = (boolean[][]) Array.newInstance((Class<?>) Boolean.TYPE, 3, 3);
        this.m = -1.0f;
        this.n = -1.0f;
        this.o = new long[9];
        this.p = 0;
        this.b = true;
        this.q = false;
        this.r = true;
        this.c = false;
        this.s = true;
        this.w = new Path();
        this.x = new Rect();
        this.y = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, tiy.i, R.attr.wearableLockPatternStyle, 0);
        String string = obtainStyledAttributes.getString(0);
        if (Objects.equals(string, "square")) {
            this.z = 0;
        } else if (Objects.equals(string, "lock_width")) {
            this.z = 1;
        } else if (Objects.equals(string, "lock_height")) {
            this.z = 2;
        } else {
            this.z = 0;
        }
        setClickable(true);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        this.A = obtainStyledAttributes.getColor(6, 0);
        this.B = obtainStyledAttributes.getColor(3, 0);
        this.C = obtainStyledAttributes.getColor(7, 0);
        int color = obtainStyledAttributes.getColor(2, this.A);
        this.D = color;
        this.E = obtainStyledAttributes.getColor(1, color);
        this.F = obtainStyledAttributes.getBoolean(4, false);
        int color2 = obtainStyledAttributes.getColor(5, this.A);
        paint2.setColor(color2);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeJoin(Paint.Join.ROUND);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.wearable_lock_pattern_dot_line_width);
        this.i = dimensionPixelSize;
        paint2.setStrokeWidth(dimensionPixelSize);
        this.f = getResources().getDimensionPixelSize(R.dimen.wearable_lock_pattern_dot_size);
        this.g = getResources().getDimensionPixelSize(R.dimen.wearable_lock_pattern_dot_size_activated);
        TypedValue typedValue = new TypedValue();
        getResources().getValue(R.dimen.wearable_lock_pattern_dot_hit_factor, typedValue, true);
        this.h = Math.max(Math.min(typedValue.getFloat(), 1.0f), 0.2f);
        paint.setAntiAlias(true);
        paint.setDither(true);
        this.e = (dmkb[][]) Array.newInstance((Class<?>) dmkb.class, 3, 3);
        for (int i = 0; i < 3; i++) {
            for (int i2 = 0; i2 < 3; i2++) {
                dmkb[][] dmkbVarArr = this.e;
                dmkbVarArr[i][i2] = new dmkb();
                dmkbVarArr[i][i2].a = this.f / 2.0f;
            }
        }
        this.G = AnimationUtils.loadInterpolator(context, android.R.interpolator.fast_out_slow_in);
        this.H = AnimationUtils.loadInterpolator(context, android.R.interpolator.linear_out_slow_in);
        dmkd dmkdVar = new dmkd(this, this);
        this.I = dmkdVar;
        setAccessibilityDelegate(dmkdVar);
        this.v = new LinearGradient((-r1) / 2.0f, 0.0f, getResources().getDimensionPixelSize(R.dimen.wearable_lock_pattern_fade_away_gradient_width) / 2.0f, 0.0f, 0, color2, Shader.TileMode.CLAMP);
        obtainStyledAttributes.recycle();
    }

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator CREATOR = new dmke();
        public final String a;
        public final int b;
        public final boolean c;
        public final boolean d;
        public final boolean e;

        public SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readString();
            this.b = parcel.readInt();
            this.c = ((Boolean) parcel.readValue(null)).booleanValue();
            this.d = ((Boolean) parcel.readValue(null)).booleanValue();
            this.e = ((Boolean) parcel.readValue(null)).booleanValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.a);
            parcel.writeInt(this.b);
            parcel.writeValue(Boolean.valueOf(this.c));
            parcel.writeValue(Boolean.valueOf(this.d));
            parcel.writeValue(Boolean.valueOf(this.e));
        }

        public SavedState(Parcelable parcelable, String str, int i, boolean z, boolean z2, boolean z3) {
            super(parcelable);
            this.a = str;
            this.b = i;
            this.c = z;
            this.d = z2;
            this.e = z3;
        }
    }
}

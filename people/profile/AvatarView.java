package com.google.android.gms.people.profile;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import defpackage.cugb;
import defpackage.cugc;
import defpackage.cugd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class AvatarView extends View implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener, ScaleGestureDetector.OnScaleGestureListener {
    private static boolean r;
    private static int s;
    private static boolean t;
    private static Paint u;
    private static Paint v;
    private static int w;
    private float A;
    private long B;
    private final RectF C;
    private final RectF D;
    private final RectF E;
    private final float[] F;
    public Drawable a;
    public Matrix b;
    public final Matrix c;
    public final Rect d;
    float e;
    GestureDetector f;
    ScaleGestureDetector g;
    View.OnClickListener h;
    boolean i;
    boolean j;
    boolean k;
    cugb l;
    public float m;
    boolean n;
    float o;
    cugd p;
    cugc q;
    private final Matrix x;
    private final int y;
    private boolean z;

    public AvatarView(Context context) {
        super(context);
        this.c = new Matrix();
        this.x = new Matrix();
        this.y = -1;
        this.d = new Rect();
        this.C = new RectF();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new float[9];
        g();
    }

    private final float f() {
        Matrix matrix = this.c;
        float[] fArr = this.F;
        matrix.getValues(fArr);
        return fArr[0];
    }

    private final void g() {
        Context context = getContext();
        if (!r) {
            r = true;
            Resources resources = context.getApplicationContext().getResources();
            w = resources.getColor(R.color.people_avatar_preview_background);
            s = resources.getDimensionPixelSize(R.dimen.people_avatar_preview_profile_width);
            Paint paint = new Paint();
            u = paint;
            paint.setAntiAlias(true);
            u.setColor(resources.getColor(R.color.people_avatar_preview_crop_dim));
            u.setStyle(Paint.Style.FILL);
            Paint paint2 = new Paint();
            v = paint2;
            paint2.setAntiAlias(true);
            v.setColor(resources.getColor(R.color.people_avatar_preview_crop_highlight));
            v.setStyle(Paint.Style.STROKE);
            v.setStrokeWidth(resources.getDimension(R.dimen.people_avatar_preview_stroke_width));
            t = context.getPackageManager().hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
        }
        this.f = new GestureDetector(context, this, null, true ^ t);
        this.g = new ScaleGestureDetector(context, this);
        this.l = new cugb(this);
        this.p = new cugd(this);
        this.q = new cugc(this);
        setContentDescription(getResources().getString(R.string.people_avatar_cropper));
    }

    private final void h(float f) {
        if (this.a == null) {
            setContentDescription(getResources().getString(R.string.people_avatar_cropper));
        } else if (Math.abs(this.m - f) < 5.0E-8f) {
            setContentDescription(getResources().getString(R.string.people_avatar_view_description_max_crop_updated));
        } else {
            setContentDescription(getResources().getString(R.string.people_avatar_cropper));
        }
    }

    public final void a() {
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.a = null;
    }

    public final void b(boolean z) {
        h(this.m);
        Drawable drawable = this.a;
        if (drawable == null || !this.z) {
            return;
        }
        this.a.setBounds(0, 0, drawable.getIntrinsicWidth(), this.a.getIntrinsicHeight());
        if (z || (this.m == 0.0f && this.a != null && this.z)) {
            int intrinsicWidth = this.a.getIntrinsicWidth();
            int intrinsicHeight = this.a.getIntrinsicHeight();
            Rect rect = this.d;
            int i = rect.right - rect.left;
            int i2 = rect.bottom - rect.top;
            RectF rectF = this.C;
            float f = intrinsicWidth;
            float f2 = intrinsicHeight;
            rectF.set(0.0f, 0.0f, f, f2);
            float f3 = f2 / f;
            this.e = f3;
            float f4 = i2;
            float f5 = i;
            if (f3 > f4 / f5) {
                this.D.set(rect.left, r7 - r0, rect.right, ((rect.top + rect.bottom) / 2) + (Math.round(f5 * this.e) / 2));
            } else {
                this.D.set(r0 - r7, rect.top, ((rect.right + rect.left) / 2) + (Math.round(f4 / this.e) / 2), rect.bottom);
            }
            Matrix matrix = this.c;
            matrix.setRectToRect(rectF, this.D, Matrix.ScaleToFit.CENTER);
            this.x.set(matrix);
            float f6 = f();
            this.m = f6;
            this.A = Math.max(f6 + f6, Math.min(f6 * 8.0f, 8.0f));
        }
        this.b = this.c;
    }

    public final void c(float f, float f2, float f3) {
        int width = getWidth() / 2;
        float height = getHeight() / 2;
        Matrix matrix = this.c;
        matrix.postRotate(0.0f, width, height);
        float min = Math.min(Math.max(f, this.m), this.A);
        float f4 = min / f();
        matrix.postScale(f4, f4, f2, f3);
        d();
        matrix.postRotate(0.0f, getWidth() / 2, getHeight() / 2);
        h(min);
        invalidate();
    }

    public final void d() {
        RectF rectF = this.E;
        rectF.set(this.C);
        Matrix matrix = this.c;
        matrix.mapRect(rectF);
        Rect rect = this.d;
        float f = rect.left;
        float f2 = rect.right;
        float f3 = rectF.left;
        float f4 = rectF.right;
        float f5 = f2 - f;
        float f6 = 0.0f;
        float f7 = f4 - f3 < f5 ? f + ((f5 - (f4 + f3)) / 2.0f) : f3 > f ? f - f3 : f4 < f2 ? f2 - f4 : 0.0f;
        float f8 = rect.top;
        float f9 = rect.bottom;
        float f10 = rectF.top;
        float f11 = rectF.bottom;
        float f12 = f9 - f8;
        if (f11 - f10 < f12) {
            f6 = f8 + ((f12 - (f11 + f10)) / 2.0f);
        } else if (f10 > f8) {
            f6 = f8 - f10;
        } else if (f11 < f9) {
            f6 = f9 - f11;
        }
        if (Math.abs(f7) <= 20.0f && Math.abs(f6) <= 20.0f) {
            matrix.postTranslate(f7, f6);
            invalidate();
            return;
        }
        cugc cugcVar = this.q;
        if (cugcVar.e) {
            return;
        }
        cugcVar.d = -1L;
        cugcVar.b = f7;
        cugcVar.c = f6;
        cugcVar.f = false;
        cugcVar.e = true;
        cugcVar.a.postDelayed(cugcVar, 250L);
    }

    public final boolean e(float f, float f2) {
        RectF rectF = this.E;
        rectF.set(this.C);
        Matrix matrix = this.c;
        matrix.mapRect(rectF);
        Rect rect = this.d;
        float f3 = rect.left;
        float f4 = rect.right;
        float f5 = rectF.left;
        float f6 = rectF.right;
        float max = Math.max(f3 - rectF.right, Math.min(f4 - rectF.left, f));
        float f7 = rect.top;
        float f8 = rect.bottom;
        float f9 = rectF.top;
        float f10 = rectF.bottom;
        float max2 = Math.max(f7 - rectF.bottom, Math.min(f8 - rectF.top, f2));
        matrix.postTranslate(max, max2);
        invalidate();
        return max == f && max2 == f2;
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == this.a) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
    }

    @Override // android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setVisible(false, false);
        }
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        if (this.i) {
            if (!this.j) {
                float f = f();
                float min = Math.min(this.A, Math.max(this.m, 1.5f * f));
                cugb cugbVar = this.l;
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (!cugbVar.i) {
                    cugbVar.b = x;
                    cugbVar.c = y;
                    cugbVar.e = min;
                    cugbVar.h = System.currentTimeMillis();
                    cugbVar.f = f;
                    float f2 = cugbVar.e;
                    cugbVar.d = f2 > f;
                    cugbVar.g = (f2 - f) / 300.0f;
                    cugbVar.i = true;
                    cugbVar.j = false;
                    cugbVar.a.post(cugbVar);
                }
            }
            this.j = false;
        }
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        if (!this.i) {
            return true;
        }
        this.p.a();
        this.q.a();
        return true;
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(w);
        if (this.a == null) {
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        Matrix matrix = this.b;
        if (matrix != null) {
            canvas.concat(matrix);
        }
        this.a.draw(canvas);
        canvas.restoreToCount(saveCount);
        RectF rectF = this.E;
        rectF.set(this.a.getBounds());
        Matrix matrix2 = this.b;
        if (matrix2 != null) {
            matrix2.mapRect(rectF);
        }
        int saveCount2 = canvas.getSaveCount();
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), u);
        canvas.save();
        Rect rect = this.d;
        canvas.clipRect(rect);
        Matrix matrix3 = this.b;
        if (matrix3 != null) {
            canvas.concat(matrix3);
        }
        this.a.draw(canvas);
        canvas.restoreToCount(saveCount2);
        canvas.drawRect(rect, v);
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.i) {
            if (!this.n) {
                cugd cugdVar = this.p;
                if (!cugdVar.e) {
                    cugdVar.d = -1L;
                    cugdVar.b = f;
                    cugdVar.c = f2;
                    cugdVar.f = false;
                    cugdVar.e = true;
                    cugdVar.a.post(cugdVar);
                }
            }
            this.n = false;
        }
        return true;
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.z = true;
        int width = getWidth();
        int height = getHeight();
        int min = Math.min(s, Math.min(width, height));
        int i5 = min;
        int i6 = (width - min) / 2;
        int i7 = (height - i5) / 2;
        this.d.set(i6, i7, min + i6, i5 + i7);
        b(z);
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        if (this.y == -1) {
            super.onMeasure(i, i2);
        } else {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(0, JGCastService.FLAG_USE_TDLS));
            setMeasuredDimension(getMeasuredWidth(), 0);
        }
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        float scaleFactor = scaleGestureDetector.getScaleFactor() - 1.0f;
        if ((scaleFactor < 0.0f && this.o > 0.0f) || (scaleFactor > 0.0f && this.o < 0.0f)) {
            this.o = 0.0f;
        }
        float f = this.o + scaleFactor;
        this.o = f;
        if (!this.i || Math.abs(f) <= 0.04f) {
            return true;
        }
        this.k = false;
        c(f() * scaleGestureDetector.getScaleFactor(), scaleGestureDetector.getFocusX(), scaleGestureDetector.getFocusY());
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        if (this.i) {
            this.l.a();
            this.k = true;
            this.o = 0.0f;
        }
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        if (this.i && this.k) {
            this.j = true;
            this.c.set(this.x);
            invalidate();
        }
        this.n = true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (Math.abs(motionEvent2.getEventTime() - this.B) <= 400 || !this.i) {
            return true;
        }
        e(-f, -f2);
        return true;
    }

    @Override // android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        View.OnClickListener onClickListener = this.h;
        if (onClickListener != null && !this.k) {
            onClickListener.onClick(this);
        }
        this.k = false;
        return true;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = this.g;
        if (scaleGestureDetector != null && this.f != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
            this.f.onTouchEvent(motionEvent);
            if (motionEvent.getActionMasked() == 6) {
                if (motionEvent.getPointerCount() == 2) {
                    this.B = motionEvent.getEventTime();
                } else if (motionEvent.getPointerCount() == 1) {
                    this.B = 0L;
                }
            }
            int action = motionEvent.getAction();
            if ((action == 1 || action == 3) && !this.p.e) {
                d();
            }
        }
        return true;
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
    }

    @Override // android.view.View
    public final void setVisibility(int i) {
        super.setVisibility(i);
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setVisible(i == 0, false);
        }
    }

    @Override // android.view.View
    protected final boolean verifyDrawable(Drawable drawable) {
        return this.a == drawable || super.verifyDrawable(drawable);
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Matrix();
        this.x = new Matrix();
        this.y = -1;
        this.d = new Rect();
        this.C = new RectF();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new float[9];
        g();
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Matrix();
        this.x = new Matrix();
        this.y = -1;
        this.d = new Rect();
        this.C = new RectF();
        this.D = new RectF();
        this.E = new RectF();
        this.F = new float[9];
        g();
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }
}

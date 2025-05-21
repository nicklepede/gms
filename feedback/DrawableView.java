package com.google.android.gms.feedback;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.R;
import defpackage.fnnl;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class DrawableView extends View {
    public Paint a;
    public Bitmap b;
    public Canvas c;
    public Paint d;
    public Bitmap e;
    public ArrayList f;
    public ArrayList g;
    public ArrayList h;
    public int i;
    private Path j;
    private float k;
    private float l;

    public DrawableView(Context context) {
        super(context);
        b();
    }

    private final void b() {
        this.a = new Paint(4);
        this.j = new Path();
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        this.d.setDither(true);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeJoin(Paint.Join.ROUND);
        this.d.setStrokeCap(Paint.Cap.ROUND);
        int dimension = (int) getResources().getDimension(R.dimen.gf_paint_stroke_width);
        this.i = dimension;
        this.d.setStrokeWidth(dimension);
        this.d.setColor((int) fnnl.g());
        this.d.setAlpha((int) fnnl.f());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        this.f = arrayList;
        this.g = arrayList2;
        this.h = arrayList3;
    }

    public final void a(int i, int i2) {
        this.d.setColor(i);
        this.d.setAlpha(i2);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Bitmap bitmap = this.b;
        if (bitmap == null) {
            return;
        }
        canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.a);
        canvas.drawPath(this.j, this.d);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int action = motionEvent.getAction();
        if (action == 0) {
            this.j.reset();
            this.j.moveTo(x, y);
            this.k = x;
            this.l = y;
            invalidate();
        } else if (action == 1) {
            this.j.lineTo(this.k, this.l);
            if (!this.c.quickReject(this.j, Canvas.EdgeType.BW)) {
                this.c.drawPath(this.j, this.d);
                Path path = new Path(this.j);
                int color = this.d.getColor();
                int alpha = this.d.getAlpha();
                this.f.add(path);
                this.g.add(Integer.valueOf(color));
                this.h.add(Integer.valueOf(alpha));
            }
            this.j.reset();
            invalidate();
            performClick();
        } else if (action == 2) {
            float abs = Math.abs(x - this.k);
            float abs2 = Math.abs(y - this.l);
            if (abs >= fnnl.k() || abs2 >= fnnl.k()) {
                Path path2 = this.j;
                float f = this.k;
                float f2 = this.l;
                path2.quadTo(f, f2, (x + f) / 2.0f, (y + f2) / 2.0f);
                this.k = x;
                this.l = y;
            }
            invalidate();
        }
        return true;
    }

    @Override // android.view.View
    public final boolean performClick() {
        super.performClick();
        return true;
    }

    public DrawableView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public DrawableView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        b();
    }
}

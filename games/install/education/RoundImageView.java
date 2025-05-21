package com.google.android.gms.games.install.education;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import defpackage.bhog;
import defpackage.iln;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class RoundImageView extends AppCompatImageView {
    private Drawable a;
    private Paint b;
    private Bitmap c;
    private Canvas d;
    private BitmapShader e;
    private Paint f;
    private int g;

    public RoundImageView(Context context) {
        super(context);
    }

    private final void a(Drawable drawable) {
        this.a = drawable;
        invalidate();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Canvas canvas2 = this.d;
        if (canvas2 == null) {
            return;
        }
        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
        int width = getWidth();
        int height = getHeight();
        Drawable drawable = this.a;
        if (drawable != null) {
            drawable.setBounds(0, 0, width, height);
            this.a.draw(this.d);
        }
        super.onDraw(this.d);
        this.b.setShader(this.e);
        int paddingLeft = (width - getPaddingLeft()) - getPaddingRight();
        int paddingTop = (height - getPaddingTop()) - getPaddingBottom();
        int min = Math.min(paddingLeft, paddingTop) / 2;
        float paddingLeft2 = getPaddingLeft() + (paddingLeft / 2);
        float paddingTop2 = getPaddingTop() + (paddingTop / 2);
        canvas.drawCircle(paddingLeft2, paddingTop2, min, this.b);
        if (this.f != null) {
            canvas.drawCircle(paddingLeft2, paddingTop2, Math.round(r2 - (this.g / 2.0f)), this.f);
        }
    }

    @Override // android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        BitmapShader bitmapShader;
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            this.b = new Paint(1);
            int width = getWidth();
            int height = getHeight();
            Bitmap bitmap = this.c;
            if ((bitmap != null && width == bitmap.getWidth() && height == this.c.getHeight()) || width == 0 || height == 0) {
                return;
            }
            try {
                this.c = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                this.d = new Canvas(this.c);
                bitmapShader = new BitmapShader(this.c, Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
            } catch (IllegalArgumentException unused) {
                bitmapShader = null;
                this.d = null;
            }
            this.e = bitmapShader;
        }
    }

    @Override // android.view.View
    public final void setBackground(Drawable drawable) {
        a(drawable);
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        a(new ColorDrawable(i));
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.view.View
    public final void setBackgroundDrawable(Drawable drawable) {
        a(drawable);
    }

    @Override // android.support.v7.widget.AppCompatImageView, android.view.View
    public final void setBackgroundResource(int i) {
        a(getResources().getDrawable(i));
    }

    public RoundImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int resourceId;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, bhog.a, 0, 0);
        try {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(1, 0);
            this.g = dimensionPixelSize;
            if (dimensionPixelSize > 0) {
                ColorStateList colorStateList = (!obtainStyledAttributes.hasValue(0) || (resourceId = obtainStyledAttributes.getResourceId(0, 0)) == 0 || (colorStateList = iln.d(context, resourceId)) == null) ? obtainStyledAttributes.getColorStateList(0) : colorStateList;
                if (colorStateList != null) {
                    Paint paint = new Paint(1);
                    this.f = paint;
                    paint.setColor(colorStateList.getDefaultColor());
                    this.f.setStrokeWidth(this.g);
                    this.f.setStyle(Paint.Style.STROKE);
                }
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }
}

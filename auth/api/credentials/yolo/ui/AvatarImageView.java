package com.google.android.gms.auth.api.credentials.yolo.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import defpackage.assc;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AvatarImageView extends assc {
    private Paint g;

    public AvatarImageView(Context context) {
        super(context);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        Paint paint = this.g;
        if (paint != null) {
            canvas.drawOval(new RectF(0.0f, 0.0f, getWidth(), getHeight()), paint);
        } else {
            super.onDraw(canvas);
        }
    }

    @Override // android.widget.ImageView
    public final void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(null);
        if (bitmap == null) {
            this.g = null;
            return;
        }
        BitmapShader bitmapShader = new BitmapShader(Bitmap.createScaledBitmap(bitmap, getWidth(), getHeight(), false), Shader.TileMode.CLAMP, Shader.TileMode.CLAMP);
        Paint paint = new Paint();
        this.g = paint;
        paint.setAntiAlias(true);
        this.g.setShader(bitmapShader);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

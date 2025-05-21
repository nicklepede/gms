package com.google.android.gms.smartdevice.setup.ui.views;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CircularImageView extends ImageView {
    public CircularImageView(Context context) {
        super(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0047  */
    @Override // android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onDraw(android.graphics.Canvas r7) {
        /*
            r6 = this;
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            android.graphics.Paint$Style r1 = android.graphics.Paint.Style.FILL
            r0.setStyle(r1)
            r1 = 1
            r0.setAntiAlias(r1)
            android.graphics.drawable.Drawable r1 = r6.getDrawable()
            r2 = 0
            if (r1 != 0) goto L17
        L15:
            r3 = r2
            goto L38
        L17:
            int r3 = r6.getWidth()
            int r4 = r6.getHeight()
            if (r3 <= 0) goto L15
            if (r4 <= 0) goto L15
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r3 = android.graphics.Bitmap.createBitmap(r3, r4, r5)
            android.graphics.Canvas r4 = new android.graphics.Canvas
            r4.<init>(r3)
            android.graphics.Matrix r5 = r6.getImageMatrix()
            r4.concat(r5)
            r1.draw(r4)
        L38:
            if (r3 == 0) goto L47
            android.graphics.BitmapShader r1 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r2 = android.graphics.Shader.TileMode.CLAMP
            android.graphics.Shader$TileMode r4 = android.graphics.Shader.TileMode.CLAMP
            r1.<init>(r3, r2, r4)
            r0.setShader(r1)
            goto L4a
        L47:
            r0.setShader(r2)
        L4a:
            int r1 = r6.getWidth()
            int r2 = r6.getHeight()
            int r1 = java.lang.Math.min(r1, r2)
            float r1 = (float) r1
            int r2 = r6.getWidth()
            float r2 = (float) r2
            int r3 = r6.getHeight()
            float r3 = (float) r3
            r4 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r4
            float r3 = r3 / r4
            float r1 = r1 / r4
            r7.drawCircle(r2, r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.smartdevice.setup.ui.views.CircularImageView.onDraw(android.graphics.Canvas):void");
    }

    public CircularImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public CircularImageView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}

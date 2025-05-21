package com.google.android.gms.smartdevice.quickstart.qr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.arxo;
import defpackage.ddvx;
import defpackage.denq;
import defpackage.dmxr;
import defpackage.dmxs;
import defpackage.dmxu;
import defpackage.fsdd;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class QrCodeView extends View {
    private static final arxo b = new denq(new String[]{"QrCodeView"});
    public String a;
    private final int c;
    private final dmxs d;

    public QrCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dmxr dmxrVar = new dmxr();
        dmxrVar.a = 0;
        dmxrVar.b = 0;
        this.d = dmxrVar.a(context);
        this.c = ddvx.m(context);
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        String str = this.a;
        if (str != null) {
            try {
                Bitmap a = this.d.a(str, getWidth());
                canvas.save();
                float width = (int) ((getWidth() - a.getWidth()) / 2.0f);
                canvas.translate(width, width);
                canvas.drawBitmap(a, 0.0f, 0.0f, (Paint) null);
                canvas.restore();
            } catch (dmxu e) {
                b.g("Failed to render QR code: ", e, new Object[0]);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int min = Math.min(fsdd.a.a().h() ? Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)) : getContext().getResources().getConfiguration().orientation == 2 ? View.MeasureSpec.getSize(i2) : View.MeasureSpec.getSize(i), this.c);
        setMeasuredDimension(min, min);
    }
}

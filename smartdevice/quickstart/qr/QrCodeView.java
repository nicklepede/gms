package com.google.android.gms.smartdevice.quickstart.qr;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import defpackage.auad;
import defpackage.dghc;
import defpackage.dgyt;
import defpackage.dpjf;
import defpackage.dpjg;
import defpackage.dpji;
import defpackage.fuya;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class QrCodeView extends View {
    private static final auad b = new dgyt(new String[]{"QrCodeView"});
    public String a;
    private final int c;
    private final dpjg d;

    public QrCodeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dpjf dpjfVar = new dpjf();
        dpjfVar.a = 0;
        dpjfVar.b = 0;
        this.d = dpjfVar.a(context);
        this.c = dghc.m(context);
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
            } catch (dpji e) {
                b.g("Failed to render QR code: ", e, new Object[0]);
            }
        }
    }

    @Override // android.view.View
    protected final void onMeasure(int i, int i2) {
        int min = Math.min(fuya.a.lK().h() ? Math.min(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2)) : getContext().getResources().getConfiguration().orientation == 2 ? View.MeasureSpec.getSize(i2) : View.MeasureSpec.getSize(i), this.c);
        setMeasuredDimension(min, min);
    }
}

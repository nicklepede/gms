package com.google.android.gms.credential.manager.util;

import android.R;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.credential.manager.util.FadeInImageView;
import defpackage.aupv;
import defpackage.aupz;
import defpackage.awvd;
import defpackage.awvf;
import defpackage.awvk;
import defpackage.azby;
import defpackage.azcm;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FadeInImageView extends azcm {
    public String a;
    public awvk b;

    public FadeInImageView(Context context) {
        super(context);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    public final void a(final String str) {
        this.a = str;
        final azby azbyVar = new azby(this);
        dhlw a = this.b.a.a(new aupv(1, 9), new aupz(Integer.MAX_VALUE, 9), awvf.a(str), new awvd() { // from class: awvj
            @Override // defpackage.awvd
            public final Object a(byte[] bArr, int i) {
                return BitmapFactory.decodeByteArray(bArr, 0, i);
            }
        });
        a.z(new dhlq() { // from class: azbw
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                awve awveVar = (awve) obj;
                Bitmap bitmap = (Bitmap) awveVar.a;
                boolean z = awveVar.b;
                FadeInImageView fadeInImageView = azby.this.a;
                if (str.equals(fadeInImageView.a)) {
                    if (z) {
                        fadeInImageView.setImageBitmap(bitmap);
                        return;
                    }
                    TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{new ColorDrawable(fadeInImageView.getContext().getColor(R.color.transparent)), new BitmapDrawable(fadeInImageView.getContext().getResources(), bitmap)});
                    transitionDrawable.setCrossFadeEnabled(true);
                    fadeInImageView.setImageDrawable(transitionDrawable);
                    transitionDrawable.startTransition(500);
                }
            }
        });
        a.y(new dhln() { // from class: azbx
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                azby.this.a.setImageResource(com.google.android.gms.R.drawable.quantum_ic_chrome_product_vd_theme_24);
            }
        });
    }

    public FadeInImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FadeInImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}

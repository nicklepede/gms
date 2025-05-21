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
import defpackage.asmb;
import defpackage.asmf;
import defpackage.aurd;
import defpackage.aurf;
import defpackage.aurk;
import defpackage.awxy;
import defpackage.awym;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class FadeInImageView extends awym {
    public String a;
    public aurk b;

    public FadeInImageView(Context context) {
        super(context);
        setScaleType(ImageView.ScaleType.FIT_CENTER);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
    }

    public final void a(final String str) {
        this.a = str;
        final awxy awxyVar = new awxy(this);
        dfaq a = this.b.a.a(new asmb(1, 9), new asmf(Integer.MAX_VALUE, 9), aurf.a(str), new aurd() { // from class: aurj
            @Override // defpackage.aurd
            public final Object a(byte[] bArr, int i) {
                return BitmapFactory.decodeByteArray(bArr, 0, i);
            }
        });
        a.z(new dfak() { // from class: awxw
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                aure aureVar = (aure) obj;
                Bitmap bitmap = (Bitmap) aureVar.a;
                boolean z = aureVar.b;
                FadeInImageView fadeInImageView = awxy.this.a;
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
        a.y(new dfah() { // from class: awxx
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                awxy.this.a.setImageResource(com.google.android.gms.R.drawable.quantum_ic_chrome_product_vd_theme_24);
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

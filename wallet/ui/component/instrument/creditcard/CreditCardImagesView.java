package com.google.android.gms.wallet.ui.component.instrument.creditcard;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import defpackage.djgr;
import defpackage.efdi;
import defpackage.eflq;
import defpackage.efwo;
import defpackage.ehtm;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class CreditCardImagesView extends RelativeLayout {
    public ImageView[] a;
    public djgr b;
    public boolean c;
    String d;
    private boolean e;
    private eflq f;
    private ArrayList g;

    public CreditCardImagesView(Context context) {
        super(context);
        this.e = true;
        this.c = true;
        this.d = "";
        this.g = new ArrayList();
    }

    public final eflq a() {
        if (this.f == null) {
            this.f = eflq.c();
        }
        return this.f;
    }

    public final void b(ArrayList arrayList) {
        this.g = arrayList;
        if (this.e) {
            return;
        }
        djgr djgrVar = this.b;
        ImageView[] imageViewArr = djgrVar.a;
        float left = imageViewArr[0].getLeft();
        int i = 0;
        for (int i2 = 0; i2 < imageViewArr.length; i2++) {
            ImageView imageView = imageViewArr[i2];
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    djgrVar.a(i2, false);
                    djgrVar.d[i2] = -1;
                    break;
                }
                if (efdi.j((ehtm) arrayList.get(i3), (ehtm) imageView.getTag())) {
                    djgrVar.a(i2, true);
                    if (!efwo.S(imageView.getContext()) || Float.compare(imageView.getAlpha(), 0.0f) == 0) {
                        imageView.clearAnimation();
                        imageView.setX(left);
                    } else if (djgrVar.d[i2] != i || djgrVar.c) {
                        imageView.animate().x(left);
                    }
                    djgrVar.d[i2] = i;
                    left = djgrVar.b ? left - imageView.getWidth() : left + imageView.getWidth();
                    i++;
                } else {
                    i3++;
                }
            }
        }
        djgrVar.c = false;
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (!this.e || this.b == null) {
            return;
        }
        this.e = false;
        b(this.g);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        this.d = bundle.getString("cardNumber");
        this.f = eflq.e(bundle);
        super.onRestoreInstanceState(bundle.getParcelable("parentState"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putString("cardNumber", this.d);
        eflq eflqVar = this.f;
        if (eflqVar != null) {
            eflqVar.h(bundle);
        }
        return bundle;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        djgr djgrVar = this.b;
        if (djgrVar != null) {
            djgrVar.c = true;
            b(this.g);
        }
    }

    public CreditCardImagesView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.e = true;
        this.c = true;
        this.d = "";
        this.g = new ArrayList();
    }

    public CreditCardImagesView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = true;
        this.c = true;
        this.d = "";
        this.g = new ArrayList();
    }
}

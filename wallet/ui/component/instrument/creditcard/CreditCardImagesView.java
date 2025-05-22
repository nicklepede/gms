package com.google.android.gms.wallet.ui.component.instrument.creditcard;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import defpackage.dlsk;
import defpackage.ehql;
import defpackage.ehyt;
import defpackage.eijr;
import defpackage.ekgs;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class CreditCardImagesView extends RelativeLayout {
    public ImageView[] a;
    public dlsk b;
    public boolean c;
    String d;
    private boolean e;
    private ehyt f;
    private ArrayList g;

    public CreditCardImagesView(Context context) {
        super(context);
        this.e = true;
        this.c = true;
        this.d = "";
        this.g = new ArrayList();
    }

    public final ehyt a() {
        if (this.f == null) {
            this.f = ehyt.c();
        }
        return this.f;
    }

    public final void b(ArrayList arrayList) {
        this.g = arrayList;
        if (this.e) {
            return;
        }
        dlsk dlskVar = this.b;
        ImageView[] imageViewArr = dlskVar.a;
        float left = imageViewArr[0].getLeft();
        int i = 0;
        for (int i2 = 0; i2 < imageViewArr.length; i2++) {
            ImageView imageView = imageViewArr[i2];
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    dlskVar.a(i2, false);
                    dlskVar.d[i2] = -1;
                    break;
                }
                if (ehql.j((ekgs) arrayList.get(i3), (ekgs) imageView.getTag())) {
                    dlskVar.a(i2, true);
                    if (!eijr.S(imageView.getContext()) || Float.compare(imageView.getAlpha(), 0.0f) == 0) {
                        imageView.clearAnimation();
                        imageView.setX(left);
                    } else if (dlskVar.d[i2] != i || dlskVar.c) {
                        imageView.animate().x(left);
                    }
                    dlskVar.d[i2] = i;
                    left = dlskVar.b ? left - imageView.getWidth() : left + imageView.getWidth();
                    i++;
                } else {
                    i3++;
                }
            }
        }
        dlskVar.c = false;
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
        this.f = ehyt.e(bundle);
        super.onRestoreInstanceState(bundle.getParcelable("parentState"));
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("parentState", super.onSaveInstanceState());
        bundle.putString("cardNumber", this.d);
        ehyt ehytVar = this.f;
        if (ehytVar != null) {
            ehytVar.h(bundle);
        }
        return bundle;
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        dlsk dlskVar = this.b;
        if (dlskVar != null) {
            dlskVar.c = true;
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

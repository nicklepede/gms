package com.google.android.gms.wallet.ui.component.pageheader;

import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import com.google.android.wallet.ui.common.InfoMessageView;
import defpackage.dkyr;
import defpackage.dlpu;
import defpackage.dlte;
import defpackage.eijr;
import defpackage.ekil;
import defpackage.ekin;
import defpackage.ekip;
import defpackage.ekiq;
import defpackage.ekmu;
import defpackage.ekmx;
import defpackage.eknr;
import defpackage.ie;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class PageHeaderView extends FrameLayout implements ViewTreeObserver.OnScrollChangedListener {
    public dlpu a;
    public ImageWithCaptionView b;
    public ImageWithCaptionView c;
    public final int[] d;
    public final int[] e;
    private RelativeLayout f;

    public PageHeaderView(Context context) {
        super(context);
        this.d = new int[2];
        this.e = new int[2];
    }

    public static String a(ekiq ekiqVar) {
        if ((ekiqVar.b & 4) == 0) {
            return ekiqVar.f;
        }
        ekmx ekmxVar = ekiqVar.e;
        if (ekmxVar == null) {
            ekmxVar = ekmx.a;
        }
        return ekmxVar.f;
    }

    private final void d(ekiq ekiqVar, boolean z, boolean z2) {
        ekmx ekmxVar;
        setVisibility(0);
        LayoutInflater.from(getContext()).inflate(R.layout.wallet_view_top_image_header, (ViewGroup) this, true);
        this.b = (ImageWithCaptionView) findViewById(R.id.header_image);
        if ((ekiqVar.b & 32) != 0) {
            ImageWithCaptionView imageWithCaptionView = this.b;
            ekmu ekmuVar = ekiqVar.h;
            if (ekmuVar == null) {
                ekmuVar = ekmu.a;
            }
            imageWithCaptionView.o(ekmuVar, dkyr.o(getContext()));
        } else {
            this.b.setVisibility(8);
        }
        InfoMessageView infoMessageView = (InfoMessageView) findViewById(R.id.header_title_message);
        TextView textView = (TextView) findViewById(R.id.header_title);
        ekmx ekmxVar2 = null;
        if (z) {
            if ((ekiqVar.b & 4) != 0) {
                ekmxVar = ekiqVar.e;
                if (ekmxVar == null) {
                    ekmxVar = ekmx.a;
                }
            } else {
                ekmxVar = null;
            }
            infoMessageView.p(ekmxVar);
            eijr.E(textView, ekiqVar.f);
        } else {
            infoMessageView.setVisibility(8);
            textView.setVisibility(8);
        }
        InfoMessageView infoMessageView2 = (InfoMessageView) findViewById(R.id.header_subtitle);
        if (z) {
            if ((ekiqVar.b & 16) != 0 && (ekmxVar2 = ekiqVar.g) == null) {
                ekmxVar2 = ekmx.a;
            }
            infoMessageView2.p(ekmxVar2);
            if ((ekiqVar.b & 16) != 0) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) infoMessageView2.getLayoutParams();
                int dimension = (int) getResources().getDimension(R.dimen.wallet_top_image_page_header_subtitle_top_bottom_margin);
                int dimension2 = (int) getResources().getDimension(R.dimen.wallet_top_image_page_header_small_top_bottom_margin);
                ekmx ekmxVar3 = ekiqVar.g;
                if (ekmxVar3 == null) {
                    ekmxVar3 = ekmx.a;
                }
                int a = eknr.a(ekmxVar3.o);
                if (a != 0 && a == 4) {
                    layoutParams.topMargin = dimension2;
                    layoutParams.bottomMargin = dimension;
                } else {
                    layoutParams.topMargin = dimension;
                    layoutParams.bottomMargin = dimension2;
                }
                infoMessageView2.setLayoutParams(layoutParams);
            }
        } else {
            infoMessageView2.setVisibility(8);
        }
        View findViewById = findViewById(R.id.im_header_separator);
        int a2 = ekip.a(ekiqVar.i);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 1) {
            findViewById.setVisibility(0);
            return;
        }
        if (i == 2) {
            findViewById.setVisibility(8);
        } else if (z2) {
            findViewById.setVisibility(0);
        } else {
            findViewById.setVisibility(8);
        }
    }

    public final void b(ekiq ekiqVar) {
        c(ekiqVar, true, true);
    }

    public final void c(ekiq ekiqVar, boolean z, boolean z2) {
        int a;
        removeAllViews();
        int a2 = ekin.a(ekiqVar.d);
        if (a2 == 0) {
            a2 = 1;
        }
        int i = a2 - 1;
        if (i == 0 || i == 1) {
            setVisibility(8);
            this.a.J(true);
            this.a.setTitle(a(ekiqVar));
            return;
        }
        if (i == 2) {
            this.a.J(false);
            d(ekiqVar, z, z2);
            return;
        }
        this.a.J(true);
        ekmu ekmuVar = null;
        this.a.setTitle(null);
        d(ekiqVar, z, z2);
        if (this.b.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            layoutParams.topMargin = 0;
            this.b.setLayoutParams(layoutParams);
        }
        if (ekiqVar.j.size() <= 0 || (a = ekil.a(ekiqVar.j.d(0))) == 0 || a != 2) {
            return;
        }
        RelativeLayout relativeLayout = (RelativeLayout) LayoutInflater.from(getContext()).inflate(R.layout.wallet_view_action_bar_with_image, (ViewGroup) null);
        this.f = relativeLayout;
        ImageWithCaptionView imageWithCaptionView = (ImageWithCaptionView) relativeLayout.findViewById(R.id.image);
        this.c = imageWithCaptionView;
        if ((ekiqVar.b & 32) != 0 && (ekmuVar = ekiqVar.h) == null) {
            ekmuVar = ekmu.a;
        }
        imageWithCaptionView.o(ekmuVar, dkyr.o(getContext()));
        this.a.W();
        TypedValue typedValue = new TypedValue();
        this.a.E(this.f, new ie(-1, getContext().getTheme().resolveAttribute(android.R.attr.actionBarSize, typedValue, true) ? TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics()) : getResources().getDimensionPixelSize(R.dimen.wallet_action_bar_default_height)));
        this.c.post(new dlte(this));
        getViewTreeObserver().addOnScrollChangedListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        this.b.getLocationOnScreen(this.e);
        int[] iArr = this.d;
        if (iArr[0] == 0) {
            this.c.getLocationOnScreen(iArr);
        }
        this.c.setTranslationY(Math.max(0, r1[1] - iArr[1]));
    }

    @Override // android.view.View
    public final void setEnabled(boolean z) {
        super.setEnabled(z);
        eijr.N(this, z);
    }

    public PageHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new int[2];
        this.e = new int[2];
    }

    public PageHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = new int[2];
        this.e = new int[2];
    }

    public PageHeaderView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.d = new int[2];
        this.e = new int[2];
    }
}

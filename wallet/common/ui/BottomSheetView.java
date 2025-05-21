package com.google.android.gms.wallet.common.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.wallet.ui.common.FocusedViewToTopScrollView;
import defpackage.dilb;
import defpackage.dilc;
import defpackage.dilo;
import defpackage.dils;
import defpackage.ding;
import defpackage.emdq;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class BottomSheetView extends FrameLayout implements View.OnLayoutChangeListener, dilb {
    static int a;
    public static int b;
    public boolean c;
    public boolean d;
    boolean e;
    public double f;
    public FrameLayout g;
    public FocusedViewToTopScrollView h;
    public BottomSheetBehavior i;
    View j;
    public dils k;
    int l;

    public BottomSheetView(Context context) {
        super(context);
        this.c = false;
        this.d = false;
        this.e = false;
        this.l = 1;
        this.f = 0.0d;
        g(context);
    }

    private final void g(Context context) {
        LayoutInflater from = LayoutInflater.from(context);
        int[] iArr = {R.attr.colorBackground, com.google.android.gms.R.attr.bottomSheetCornerRadius};
        Arrays.sort(iArr);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int color = obtainStyledAttributes.getColor(Arrays.binarySearch(iArr, R.attr.colorBackground), -1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(Arrays.binarySearch(iArr, com.google.android.gms.R.attr.bottomSheetCornerRadius), 0);
        obtainStyledAttributes.recycle();
        a = ding.j(context).y;
        FocusedViewToTopScrollView focusedViewToTopScrollView = new FocusedViewToTopScrollView(context);
        this.h = focusedViewToTopScrollView;
        focusedViewToTopScrollView.setId(com.google.android.gms.R.id.content_scroll_view);
        this.h.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.h.setFillViewport(true);
        this.h.m(true);
        FocusedViewToTopScrollView focusedViewToTopScrollView2 = this.h;
        focusedViewToTopScrollView2.r = this.e;
        focusedViewToTopScrollView2.setVerticalScrollBarEnabled(false);
        this.h.setHorizontalScrollBarEnabled(false);
        this.h.setSmoothScrollingEnabled(false);
        addView(this.h);
        FrameLayout frameLayout = new FrameLayout(context);
        this.g = frameLayout;
        frameLayout.setId(com.google.android.gms.R.id.popover_content_holder);
        this.g.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        this.g.setBackgroundColor(color);
        this.h.addView(this.g);
        if (dimensionPixelSize > 0) {
            this.g.setOutlineProvider(new dilo(this, dimensionPixelSize));
            this.g.setClipToOutline(true);
        }
        View inflate = from.inflate((XmlPullParser) getResources().getLayout(com.google.android.gms.R.layout.wallet_view_progress_spinner), (ViewGroup) this, false);
        this.j = inflate;
        inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(this.j);
        addOnLayoutChangeListener(this);
    }

    public final void a() {
        this.c = true;
        this.h.r = this.e;
        this.i.H(3);
        b();
    }

    @Override // defpackage.dilb
    public final void aq(Bundle bundle) {
        if (TextUtils.equals(dilc.b(bundle), "verticallyCenterSpinner")) {
            e();
        }
    }

    public final void b() {
        this.i.F(a);
        this.i.E(false);
        dils dilsVar = this.k;
        if (dilsVar != null) {
            dilsVar.ag();
        }
        this.g.setOutlineProvider(null);
        this.g.setClipToOutline(false);
    }

    public final void c(boolean z) {
        this.h.m(z);
    }

    public final void d(boolean z) {
        this.e = z;
        if (this.i.z == 3) {
            this.h.r = z;
        }
    }

    public final void e() {
        this.j.getLayoutParams().height = b - getTop();
        this.j.requestLayout();
    }

    public final void f(int i) {
        this.l = i;
        this.d = true;
        BottomSheetBehavior bottomSheetBehavior = this.i;
        bottomSheetBehavior.x = true;
        bottomSheetBehavior.E(true);
        dils dilsVar = this.k;
        if (dilsVar != null) {
            dilsVar.al(i);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        removeOnLayoutChangeListener(this);
        int height = getHeight();
        b = height;
        if (this.c) {
            this.i.F(a);
        } else {
            double d = this.f;
            if (d == 0.0d) {
                this.i.F(-1);
            } else {
                this.i.F((int) (height * d));
            }
        }
        post(dilc.a(this, "verticallyCenterSpinner"));
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        int i = bundle.getInt("bottomSheetState");
        if (i == 3) {
            a();
        } else {
            this.i.H(i);
        }
        this.l = emdq.a(bundle.getInt("popoverExitAction"));
        super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        bundle.putInt("bottomSheetState", this.c ? 3 : this.i.z);
        int i = this.l;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        bundle.putInt("popoverExitAction", i2);
        return bundle;
    }

    public BottomSheetView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = false;
        this.d = false;
        this.e = false;
        this.l = 1;
        this.f = 0.0d;
        g(context);
    }

    public BottomSheetView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = false;
        this.d = false;
        this.e = false;
        this.l = 1;
        this.f = 0.0d;
        g(context);
    }
}

package com.google.android.gms.wallet.common.ui;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.google.android.chimera.Activity;
import com.google.android.gms.wallet.ui.common.WalletExitResult;
import com.google.android.gms.wallet.ui.component.lineitem.LineItemBundleView;
import defpackage.dils;
import defpackage.dilt;
import defpackage.dilu;
import defpackage.dilv;
import defpackage.dilw;
import defpackage.dimb;
import defpackage.ding;
import defpackage.emdq;
import defpackage.fsxy;
import defpackage.rpq;
import java.util.Locale;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class PopoverView extends FrameLayout {
    public boolean A;
    public int B;
    public ViewOutlineProvider C;
    public ViewOutlineProvider D;
    public boolean E;
    public int F;
    private int G;
    private int H;
    private int I;
    public View a;
    public FrameLayout b;
    public FrameLayout c;
    LinearLayout d;
    public dimb e;
    public dils f;
    public View g;
    public View h;
    public View i;
    public View j;
    public View k;
    public LinearLayout l;
    public int m;
    public boolean n;
    public int o;
    public WalletExitResult p;
    public boolean q;
    public float r;
    public boolean s;
    public boolean t;
    public boolean u;
    public boolean v;
    public double w;
    public double x;
    public int y;
    public int z;

    public PopoverView(Context context) {
        super(context);
        this.n = true;
        this.o = 0;
        this.F = 1;
        this.p = null;
        this.r = 0.0f;
        this.s = true;
        this.t = true;
        this.u = false;
        this.v = true;
        this.y = 0;
        this.z = 0;
        this.A = false;
        this.B = 0;
        this.E = true;
        q(context, null);
    }

    public static void c(Activity activity) {
        activity.getWindow().setStatusBarColor(activity.getResources().getColor(R.color.black));
    }

    private final void q(Context context, AttributeSet attributeSet) {
        View view;
        Window window;
        LayoutInflater from = LayoutInflater.from(context);
        int i = ding.j(context).y;
        float f = i;
        this.w = 0.67d;
        this.x = 0.3d;
        boolean f2 = fsxy.a.a().f();
        this.A = f2;
        if (f2) {
            this.B = getResources().getDimensionPixelSize(com.google.android.gms.R.dimen.wallet_popover_corner_radius);
            this.C = new dilv(this);
            this.D = new dilw(this);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, rpq.v);
        this.H = obtainStyledAttributes.getColor(2, context.getResources().getColor(R.color.white));
        this.I = obtainStyledAttributes.getColor(1, context.getResources().getColor(R.color.transparent));
        this.s = obtainStyledAttributes.getBoolean(4, this.s);
        this.E = obtainStyledAttributes.getBoolean(0, this.E);
        this.t = obtainStyledAttributes.getBoolean(6, this.t);
        this.z = obtainStyledAttributes.getDimensionPixelOffset(3, this.z);
        this.y = obtainStyledAttributes.getDimensionPixelOffset(8, this.y);
        this.o = obtainStyledAttributes.getInt(7, this.o);
        this.G = obtainStyledAttributes.getResourceId(5, 0);
        obtainStyledAttributes.recycle();
        if ((getContext() instanceof Activity) && (window = ((Activity) getContext()).getWindow()) != null) {
            this.g = window.findViewById(com.google.android.gms.R.id.action_bar_container);
        }
        TypedValue typedValue = new TypedValue();
        View view2 = this.g;
        if (view2 != null && view2.getVisibility() == 0 && getContext().getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true)) {
            this.m = TypedValue.complexToDimensionPixelSize(typedValue.data, getResources().getDisplayMetrics());
        } else {
            this.m = 0;
        }
        dimb dimbVar = new dimb(context, this);
        this.e = dimbVar;
        dimbVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        this.d = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 2.0f));
        this.d.setOrientation(1);
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.l = linearLayout2;
        linearLayout2.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        this.l.setOrientation(0);
        View view3 = new View(context);
        this.a = view3;
        view3.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 49;
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        frameLayout.setId(com.google.android.gms.R.id.popover_content_holder);
        this.b.setLayoutParams(layoutParams);
        this.b.setMinimumHeight(i);
        this.b.setBackgroundColor(this.H);
        int i2 = this.G;
        if (i2 != 0) {
            this.k = from.inflate(i2, (ViewGroup) this, false);
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 49;
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.c = frameLayout2;
        frameLayout2.setLayoutParams(layoutParams2);
        this.c.setVisibility(4);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, this.m);
        layoutParams3.gravity = 49;
        View view4 = new View(context);
        this.j = view4;
        view4.setBackgroundColor(this.I);
        this.j.setLayoutParams(layoutParams3);
        this.j.setVisibility(4);
        this.l.addView(this.d);
        this.d.addView(this.a);
        this.d.addView(this.b);
        this.e.addView(this.l);
        addView(this.e);
        View view5 = this.k;
        if (view5 != null) {
            addView(view5);
        }
        addView(this.j);
        k();
        this.j.setPivotY(this.m);
        if (this.E && (view = this.g) != null) {
            view.setAlpha(0.0f);
        }
        View view6 = this.k;
        if (view6 != null) {
            view6.setTranslationY(f);
        }
        this.c.setTranslationY(f);
    }

    public final int a() {
        return this.a.getHeight() - this.m;
    }

    public final int b() {
        return Math.max(0, this.a.getHeight() - getHeight());
    }

    public final void d(WalletExitResult walletExitResult) {
        this.p = walletExitResult;
        this.q = true;
        dimb dimbVar = this.e;
        dimbVar.g = false;
        if (dimbVar.h || dimbVar.getScrollY() > b()) {
            this.e.a();
        } else {
            this.e.c();
        }
    }

    public final void e(boolean z) {
        dimb dimbVar = this.e;
        if (dimbVar.k || dimbVar.l || dimbVar.h) {
            return;
        }
        dimbVar.k = true;
        f(z);
    }

    public final void f(boolean z) {
        dimb dimbVar = this.e;
        dilu diluVar = new dilu(this, z);
        int i = dimb.n;
        dimbVar.d(diluVar);
    }

    public final void g(int i) {
        TypedValue typedValue = new TypedValue();
        getContext().getTheme().resolveAttribute(i, typedValue, true);
        int i2 = typedValue.data;
        this.I = i2;
        View view = this.j;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    public final void h(boolean z) {
        this.v = z;
        dimb dimbVar = this.e;
        if (dimbVar != null) {
            boolean z2 = false;
            if (z && this.n) {
                z2 = true;
            }
            dimbVar.m(z2);
        }
    }

    public final void i(View view) {
        this.i = view;
        l();
    }

    public final void j(double d, double d2) {
        if (d > 0.0d) {
            this.w = d;
        }
        if (d2 > 0.0d) {
            this.x = d2;
        }
    }

    public final void k() {
        FrameLayout frameLayout = this.c;
        if (frameLayout == null) {
            return;
        }
        if (frameLayout.getParent() instanceof ViewGroup) {
            ((ViewGroup) this.c.getParent()).removeView(this.c);
        }
        int i = this.o;
        if (i == 0) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.gravity = 49;
            this.c.setLayoutParams(layoutParams);
            addView(this.c);
        } else {
            if (i != 1) {
                throw new IllegalArgumentException(String.format(Locale.US, "Unexpected StickyStyle %d", Integer.valueOf(this.o)));
            }
            this.c.setLayoutParams(new LinearLayout.LayoutParams(0, -1, 1.0f));
            this.l.addView(this.c, 0);
        }
        if (this.h == null) {
            dimb dimbVar = this.e;
            int i2 = dimb.n;
            dimbVar.b();
        } else {
            dimb dimbVar2 = this.e;
            int i3 = dimb.n;
            dimbVar2.e();
        }
    }

    public final void l() {
        View view = this.i;
        if (true != (view instanceof LineItemBundleView)) {
            view = null;
        }
        this.c.removeAllViews();
        if (!this.n || view == null) {
            this.h = null;
            dimb dimbVar = this.e;
            int i = dimb.n;
            dimbVar.b();
            return;
        }
        int i2 = this.o;
        LineItemBundleView lineItemBundleView = (LineItemBundleView) view;
        lineItemBundleView.k = i2;
        LineItemBundleView lineItemBundleView2 = new LineItemBundleView(lineItemBundleView.getContext(), i2);
        lineItemBundleView2.a(lineItemBundleView.g);
        this.h = lineItemBundleView2;
        if (this.o == 1) {
            lineItemBundleView2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        }
        this.c.addView(this.h);
        dimb dimbVar2 = this.e;
        int i3 = dimb.n;
        dimbVar2.e();
        this.e.h();
    }

    public final boolean m() {
        View view = this.g;
        return view != null && this.m > 0 && view.getVisibility() == 0;
    }

    public final boolean n() {
        return (this.i == null || this.h == null) ? false : true;
    }

    public final boolean o() {
        return this.e.l;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.k;
        if (view == null || !(view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.k.getLayoutParams();
        if (this.o == 1) {
            marginLayoutParams.setMarginStart(this.c.getWidth());
        } else {
            marginLayoutParams.setMarginStart(0);
        }
        this.k.setLayoutParams(marginLayoutParams);
        requestLayout();
    }

    @Override // android.view.View
    protected final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof Bundle)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("superInstanceState"));
        this.e.k = bundle.getBoolean("pendingFullScreenState");
        this.e.l = bundle.getBoolean("fullScreenState");
        this.e.g = bundle.getBoolean("notifiedOffscreen");
        this.e.d = true;
        this.F = emdq.a(bundle.getInt("popoverExitAction"));
        this.q = bundle.getBoolean("programmaticDismiss");
        this.p = (WalletExitResult) bundle.getParcelable("popoverExitResult");
    }

    @Override // android.view.View
    protected final Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superInstanceState", super.onSaveInstanceState());
        dimb dimbVar = this.e;
        boolean z = true;
        if (!dimbVar.k && !dimbVar.l) {
            z = false;
        }
        bundle.putBoolean("pendingFullScreenState", z);
        bundle.putBoolean("fullScreenState", this.e.l);
        bundle.putBoolean("notifiedOffscreen", this.e.g);
        int i = this.F;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        bundle.putInt("popoverExitAction", i2);
        bundle.putBoolean("programmaticDismiss", this.q);
        WalletExitResult walletExitResult = this.p;
        if (walletExitResult != null) {
            bundle.putParcelable("popoverExitResult", walletExitResult);
        }
        return bundle;
    }

    public final void p(int i) {
        this.F = i;
        this.q = true;
        dimb dimbVar = this.e;
        dimbVar.g = false;
        if (dimbVar.h || dimbVar.getScrollY() > b()) {
            this.e.a();
        } else {
            this.e.c();
        }
    }

    @Override // android.view.View
    public final void scrollTo(int i, int i2) {
        dimb dimbVar = this.e;
        dilt diltVar = new dilt(this, i, i2);
        int i3 = dimb.n;
        dimbVar.d(diltVar);
    }

    public PopoverView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.n = true;
        this.o = 0;
        this.F = 1;
        this.p = null;
        this.r = 0.0f;
        this.s = true;
        this.t = true;
        this.u = false;
        this.v = true;
        this.y = 0;
        this.z = 0;
        this.A = false;
        this.B = 0;
        this.E = true;
        q(context, attributeSet);
    }

    public PopoverView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.n = true;
        this.o = 0;
        this.F = 1;
        this.p = null;
        this.r = 0.0f;
        this.s = true;
        this.t = true;
        this.u = false;
        this.v = true;
        this.y = 0;
        this.z = 0;
        this.A = false;
        this.B = 0;
        this.E = true;
        q(context, attributeSet);
    }

    public PopoverView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.n = true;
        this.o = 0;
        this.F = 1;
        this.p = null;
        this.r = 0.0f;
        this.s = true;
        this.t = true;
        this.u = false;
        this.v = true;
        this.y = 0;
        this.z = 0;
        this.A = false;
        this.B = 0;
        this.E = true;
        q(context, attributeSet);
    }
}

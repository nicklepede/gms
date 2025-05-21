package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.libraries.material.productlockup.ProductLockupView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.acn;
import defpackage.bqnc;
import defpackage.bqni;
import defpackage.bqnj;
import defpackage.ebhf;
import defpackage.eiid;
import defpackage.fjul;
import defpackage.iuo;
import defpackage.rrk;
import defpackage.shy;
import defpackage.shz;
import defpackage.spi;
import defpackage.sqg;
import defpackage.swy;
import defpackage.sxe;
import defpackage.tam;
import defpackage.tan;
import defpackage.wp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class ProductLockupToolbar extends MaterialToolbar implements ebhf {
    public bqni A;
    public final ActionMenuView B;
    public View C;
    public shy D;
    public spi E;
    private final ProductLockupView H;
    private View I;
    private shz J;
    private int K;
    private int L;

    public ProductLockupToolbar(Context context) {
        this(context, null, R.attr.toolbarStyle);
    }

    @Override // defpackage.ebha
    public final void K(AppBarLayout appBarLayout, int i) {
        View view;
        if (this.L == i) {
            return;
        }
        this.L = i;
        int f = appBarLayout.f();
        float abs = Math.abs(i);
        float f2 = 1.0f;
        if (f > 0 && i <= 0) {
            f2 = abs / f;
        }
        ActionMenuView actionMenuView = this.B;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) actionMenuView.getLayoutParams();
        if (marginLayoutParams == null || (view = this.C) == null) {
            return;
        }
        marginLayoutParams.setMarginEnd((int) (view.getWidth() * f2));
        actionMenuView.setLayoutParams(marginLayoutParams);
        this.C.setPivotX(r3.getWidth() * 0.8f);
        this.C.setPivotY(r3.getHeight() / 2.0f);
        this.C.setScaleX(f2);
        this.C.setScaleY(f2);
        this.C.setAlpha(f2);
        this.C.setVisibility(f2 == 0.0f ? 8 : 0);
    }

    public final void L(String str) {
        View view = this.C;
        if (view == null) {
            return;
        }
        iuo.q(view, new tam(str));
    }

    public final void M(eiid eiidVar) {
        shz shzVar = this.J;
        if (shzVar == null) {
            return;
        }
        shzVar.a(eiidVar);
        if (this.C != null) {
            if (eiidVar.h()) {
                this.C.setContentDescription(getContext().getString(R.string.common_account_identity_a11y_description, ((sxe) eiidVar.c()).c, ((sxe) eiidVar.c()).b));
                this.C.setImportantForAccessibility(1);
            } else {
                this.C.setContentDescription("");
                this.C.setImportantForAccessibility(2);
            }
        }
    }

    public final void N(int i) {
        this.H.setVisibility(i);
        O();
    }

    public final void O() {
        Menu g = this.B.g();
        this.K = 0;
        if (g.size() != 0) {
            if (g.size() > 1) {
                ProductLockupView productLockupView = this.H;
                if (productLockupView.getVisibility() == 0) {
                    Resources resources = getResources();
                    int i = productLockupView.d;
                    productLockupView.e(2);
                    int i2 = resources.getDisplayMetrics().widthPixels;
                    productLockupView.measure(View.MeasureSpec.makeMeasureSpec(i2, 0), View.MeasureSpec.makeMeasureSpec(resources.getDisplayMetrics().heightPixels, 0));
                    int measuredWidth = productLockupView.getMeasuredWidth();
                    productLockupView.e(i);
                    int dimensionPixelSize = (i2 - resources.getDimensionPixelSize(R.dimen.as_close_button_size)) - resources.getDimensionPixelSize(R.dimen.as_collapsed_avatar_touch_view_size);
                    int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.as_action_menu_item_size);
                    requestLayout();
                    if (measuredWidth >= dimensionPixelSize - (dimensionPixelSize2 + dimensionPixelSize2)) {
                        this.K = 1;
                        for (int i3 = 0; i3 < g.size(); i3++) {
                            g.getItem(i3).setShowAsAction(0);
                        }
                    }
                }
            }
            this.K = g.size() == 1 ? 1 : 2;
            if (g.getItem(0).getIcon() != null) {
                g.getItem(0).setShowAsAction(1);
                if (g.size() == 2 && g.getItem(1).getIcon() != null) {
                    g.getItem(1).setShowAsAction(1);
                }
            }
            if (g.size() > 2) {
                for (int i4 = 1; i4 < g.size(); i4++) {
                    g.getItem(i4).setShowAsAction(0);
                }
            }
        }
        ProductLockupView productLockupView2 = this.H;
        wp wpVar = (wp) productLockupView2.getLayoutParams();
        Resources resources2 = getResources();
        if (sqg.b(getContext())) {
            wpVar.a = 8388627;
        } else if (resources2.getDisplayMetrics().widthPixels <= resources2.getDimensionPixelSize(R.dimen.as_centered_logo_minimum_screen_width)) {
            wpVar.a = 8388627;
        } else {
            wpVar.a = 17;
        }
        productLockupView2.setLayoutParams(wpVar);
        requestLayout();
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ProductLockupView productLockupView = this.H;
        if (productLockupView.getVisibility() != 0) {
            return;
        }
        Resources resources = getResources();
        int max = Math.max(1, this.K) * resources.getDimensionPixelSize(R.dimen.as_action_menu_item_size);
        int size = ((View.MeasureSpec.getSize(i) - resources.getDimensionPixelSize(R.dimen.as_close_button_size)) - resources.getDimensionPixelSize(R.dimen.as_collapsed_avatar_touch_view_size)) - max;
        productLockupView.measure(View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_USE_TDLS), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), JGCastService.FLAG_USE_TDLS));
        View view = this.I;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_USE_TDLS), View.MeasureSpec.makeMeasureSpec(max + resources.getDimensionPixelSize(R.dimen.abc_action_button_min_width_material), JGCastService.FLAG_USE_TDLS));
        }
    }

    public ProductLockupToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public ProductLockupToolbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.L = -1;
        ((tan) rrk.a(tan.class, context)).f(this);
        if (this.q != 0) {
            this.q = 0;
            if (e() != null) {
                requestLayout();
            }
        }
        context.getTheme().obtainStyledAttributes(attributeSet, swy.d, 0, 0).recycle();
        LayoutInflater.from(new acn(context, true != bqnc.d() ? R.style.AsThemeLightOverlay : R.style.AsThemeDarkOverlay)).inflate(true != fjul.j() ? R.layout.as_product_lockup_toolbar1 : R.layout.as_product_lockup_toolbar, (ViewGroup) this, true);
        ProductLockupView productLockupView = (ProductLockupView) findViewById(R.id.mg_lockup);
        this.H = productLockupView;
        this.B = (ActionMenuView) findViewById(R.id.custom_menu);
        productLockupView.e(0);
        productLockupView.d(bqnj.a(context, R.attr.asProductNameColor, R.color.google_grey700));
        this.C = findViewById(R.id.account_particle_disc_container);
        this.I = findViewById(R.id.toolbar_menu_container);
        if (this.D != null) {
            if (fjul.j()) {
                this.J = new shz(((SelectedAccountDisc) findViewById(R.id.selected_account_disc)).b, this.D.a, true);
            } else {
                this.J = this.D.a((AccountParticleDisc) findViewById(R.id.account_particle_disc), true);
            }
        }
        if (bqnc.d()) {
            productLockupView.a(2);
        } else {
            this.A = new bqni(productLockupView, bqnj.a(getContext(), R.attr.asProductNameColor, R.color.google_grey700), bqnj.a(getContext(), R.attr.colorOnSurface, R.color.google_grey700));
        }
    }
}

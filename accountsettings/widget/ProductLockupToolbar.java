package com.google.android.gms.accountsettings.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.ActionMenuView;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.cast.JGCastService;
import com.google.android.gms.R;
import com.google.android.gms.accountsettings.widget.ProductLockupToolbar;
import com.google.android.libraries.material.productlockup.ProductLockupView;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.accountmenu.SelectedAccountDisc;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import defpackage.acs;
import defpackage.bsur;
import defpackage.bsux;
import defpackage.bsuy;
import defpackage.edts;
import defpackage.ekvi;
import defpackage.evug;
import defpackage.evwc;
import defpackage.evwn;
import defpackage.fmkm;
import defpackage.iwe;
import defpackage.tkt;
import defpackage.tnw;
import defpackage.ucf;
import defpackage.ucg;
import defpackage.uck;
import defpackage.ulh;
import defpackage.usw;
import defpackage.utc;
import defpackage.uwl;
import defpackage.uwm;
import defpackage.uwn;
import defpackage.wu;
import java.util.Iterator;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class ProductLockupToolbar extends MaterialToolbar implements edts {
    public final ProductLockupView A;
    public uwn B;
    public ucf C;
    private bsux D;
    private final ActionMenuView E;
    private View F;
    private View G;
    private ucg J;
    private int K;
    private int L;

    public ProductLockupToolbar(Context context) {
        this(context, null, R.attr.toolbarStyle);
    }

    private final void T() {
        View view;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.E.getLayoutParams();
        if (marginLayoutParams == null || (view = this.G) == null) {
            return;
        }
        marginLayoutParams.setMarginEnd(view.getVisibility() == 0 ? (int) getResources().getDimension(R.dimen.abc_action_button_min_width_material) : 0);
    }

    private final void U() {
        Menu g = this.E.g();
        this.K = 0;
        if (g.size() != 0) {
            if (g.size() > 1) {
                ProductLockupView productLockupView = this.A;
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
        ProductLockupView productLockupView2 = this.A;
        wu wuVar = (wu) productLockupView2.getLayoutParams();
        Resources resources2 = getResources();
        if (fmkm.h() || ulh.b(getContext())) {
            wuVar.a = 8388627;
        } else if (resources2.getDisplayMetrics().widthPixels <= resources2.getDimensionPixelSize(R.dimen.as_centered_logo_minimum_screen_width)) {
            wuVar.a = 8388627;
        } else {
            wuVar.a = 17;
        }
        productLockupView2.setLayoutParams(wuVar);
        requestLayout();
    }

    public final void K() {
        View view = this.G;
        if (view != null) {
            view.setVisibility(8);
        }
        if (fmkm.h()) {
            T();
        }
    }

    public final void L(String str) {
        View view = this.G;
        if (view == null) {
            return;
        }
        iwe.q(view, new uwl(str));
    }

    public final void M(ekvi ekviVar) {
        ucg ucgVar = this.J;
        if (ucgVar == null) {
            return;
        }
        ucgVar.a(ekviVar);
        if (this.G != null) {
            if (ekviVar.h()) {
                this.G.setContentDescription(getContext().getString(R.string.common_account_identity_a11y_description, ((utc) ekviVar.c()).c, ((utc) ekviVar.c()).b));
                this.G.setImportantForAccessibility(1);
            } else {
                this.G.setContentDescription("");
                this.G.setImportantForAccessibility(2);
            }
        }
    }

    public final void N(View.OnClickListener onClickListener) {
        View view = this.G;
        if (view == null) {
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    public final void O(List list) {
        Menu g = this.E.g();
        g.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            final evug evugVar = (evug) it.next();
            MenuItem add = g.add(evugVar.c);
            if ((evugVar.b & 4) != 0) {
                Context context = getContext();
                evwc evwcVar = evugVar.d;
                if (evwcVar == null) {
                    evwcVar = evwc.a;
                }
                Drawable c = uck.c(context, evwcVar);
                if (c != null) {
                    add.setIcon(c);
                }
            }
            evwn evwnVar = evugVar.e;
            if (evwnVar == null) {
                evwnVar = evwn.a;
            }
            if (tnw.c(evwnVar)) {
                add.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: uwk
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        uwn uwnVar = ProductLockupToolbar.this.B;
                        if (uwnVar == null) {
                            return false;
                        }
                        uwnVar.a(evugVar);
                        return true;
                    }
                });
            }
        }
        U();
    }

    public final void P(int i) {
        this.A.setVisibility(i);
        U();
    }

    public final void Q() {
        View view = this.G;
        if (view != null) {
            view.setVisibility(0);
        }
        if (fmkm.h()) {
            T();
        }
    }

    public final void R(boolean z, boolean z2) {
        bsux bsuxVar = this.D;
        if (bsuxVar != null) {
            bsuxVar.a(z, z2);
        }
    }

    @Override // defpackage.edtn
    public final void a(AppBarLayout appBarLayout, int i) {
        View view;
        if (fmkm.h() || this.L == i) {
            return;
        }
        this.L = i;
        int f = appBarLayout.f();
        float abs = Math.abs(i);
        float f2 = 1.0f;
        if (f > 0 && i <= 0) {
            f2 = abs / f;
        }
        ActionMenuView actionMenuView = this.E;
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) actionMenuView.getLayoutParams();
        if (marginLayoutParams == null || (view = this.G) == null) {
            return;
        }
        marginLayoutParams.setMarginEnd((int) (view.getWidth() * f2));
        actionMenuView.setLayoutParams(marginLayoutParams);
        this.G.setPivotX(r3.getWidth() * 0.8f);
        this.G.setPivotY(r3.getHeight() / 2.0f);
        this.G.setScaleX(f2);
        this.G.setScaleY(f2);
        this.G.setAlpha(f2);
        this.G.setVisibility(f2 == 0.0f ? 8 : 0);
    }

    @Override // android.support.v7.widget.Toolbar, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ProductLockupView productLockupView = this.A;
        if (productLockupView.getVisibility() != 0) {
            return;
        }
        Resources resources = getResources();
        int max = Math.max(1, this.K) * resources.getDimensionPixelSize(R.dimen.as_action_menu_item_size);
        int size = ((View.MeasureSpec.getSize(i) - resources.getDimensionPixelSize(R.dimen.as_close_button_size)) - resources.getDimensionPixelSize(R.dimen.as_collapsed_avatar_touch_view_size)) - max;
        productLockupView.measure(View.MeasureSpec.makeMeasureSpec(size, JGCastService.FLAG_USE_TDLS), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), JGCastService.FLAG_USE_TDLS));
        View view = this.F;
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
        ((uwm) tkt.a(uwm.class, context)).f(this);
        if (this.q != 0) {
            this.q = 0;
            if (e() != null) {
                requestLayout();
            }
        }
        context.getTheme().obtainStyledAttributes(attributeSet, usw.d, 0, 0).recycle();
        LayoutInflater.from(new acs(context, true != bsur.d() ? R.style.AsThemeLightOverlay : R.style.AsThemeDarkOverlay)).inflate(true != fmkm.i() ? R.layout.as_product_lockup_toolbar1 : R.layout.as_product_lockup_toolbar, (ViewGroup) this, true);
        ProductLockupView productLockupView = (ProductLockupView) findViewById(R.id.mg_lockup);
        this.A = productLockupView;
        this.E = (ActionMenuView) findViewById(R.id.custom_menu);
        productLockupView.e(0);
        productLockupView.d(bsuy.a(context, R.attr.asProductNameColor, R.color.google_grey700));
        this.G = findViewById(R.id.account_particle_disc_container);
        this.F = findViewById(R.id.toolbar_menu_container);
        if (this.C != null) {
            if (fmkm.i()) {
                this.J = new ucg(((SelectedAccountDisc) findViewById(R.id.selected_account_disc)).b, this.C.a, true);
            } else {
                this.J = this.C.a((AccountParticleDisc) findViewById(R.id.account_particle_disc), true);
            }
        }
        if (fmkm.h()) {
            if (bsur.d()) {
                productLockupView.a(2);
                return;
            } else {
                productLockupView.a(1);
                productLockupView.d(bsuy.a(getContext(), R.attr.colorOnSurface, R.color.google_grey700));
                return;
            }
        }
        if (bsur.d()) {
            productLockupView.a(2);
        } else {
            this.D = new bsux(productLockupView, bsuy.a(getContext(), R.attr.asProductNameColor, R.color.google_grey700), bsuy.a(getContext(), R.attr.colorOnSurface, R.color.google_grey700));
        }
    }
}

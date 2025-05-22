package com.google.android.gms.wallet.ui.component.lineitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.wallet.ui.common.FifeNetworkImageView;
import com.google.android.wallet.ui.common.ImageWithCaptionView;
import defpackage.a;
import defpackage.dkyr;
import defpackage.dlqh;
import defpackage.dlqi;
import defpackage.dltc;
import defpackage.eiho;
import defpackage.eijr;
import defpackage.ekir;
import defpackage.ekiu;
import defpackage.ekiv;
import defpackage.ekmu;
import defpackage.tiy;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class LineItemBundleView extends FrameLayout implements View.OnClickListener, dlqh, eiho {
    public LineItemView a;
    LinearLayout b;
    LinearLayout c;
    View d;
    public ImageWithCaptionView e;
    View f;
    public ekir g;
    boolean h;
    Paint i;
    Drawable j;
    public int k;
    public dltc l;
    private TextView m;
    private ViewGroup n;
    private boolean o;
    private int p;
    private int q;
    private Paint r;
    private int s;
    private int t;
    private boolean u;
    private int v;
    private boolean w;
    private float x;

    public LineItemBundleView(Context context) {
        super(context);
        this.u = false;
        this.k = 0;
        d(context);
    }

    private final void k(boolean z) {
        int i = 0;
        if (this.u) {
            this.b.setVisibility(0);
            this.d.setVisibility(8);
            this.c.setVisibility(8);
            this.f.setVisibility(0);
            if (z) {
                this.b.requestFocus();
                return;
            }
            return;
        }
        this.b.setVisibility(8);
        this.d.setVisibility(true != m() ? 8 : 0);
        this.c.setVisibility(true != l() ? 8 : 0);
        View view = this.f;
        if (h() && n()) {
            i = 8;
        }
        view.setVisibility(i);
    }

    private final boolean l() {
        ekir ekirVar = this.g;
        return ekirVar != null && ekirVar.e.size() > 0;
    }

    private final boolean m() {
        ekir ekirVar = this.g;
        return ekirVar != null && ekirVar.f.size() > 0;
    }

    private final boolean n() {
        return m() || l();
    }

    private static final Paint o(Context context, int i) {
        Paint paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.WalletLineItemBundle, tiy.t);
        int color = obtainStyledAttributes.getColor(i, android.R.color.transparent);
        if (color != 17170445) {
            paint = new Paint(1);
            paint.setColor(color);
            paint.setStyle(Paint.Style.FILL);
        } else {
            paint = null;
        }
        obtainStyledAttributes.recycle();
        return paint;
    }

    @Override // defpackage.dlqh
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((ekir) obj) != null;
    }

    public final void c(int i) {
        int left;
        int left2;
        if (this.x > 0.0f && i() && this.o) {
            if (this.e.getWidth() == 0) {
                this.v = i;
                ((FifeNetworkImageView) this.e).b = this;
                return;
            }
            float f = i / this.x;
            if (f > 1.0f) {
                f = 1.0f;
            }
            this.e.setAlpha(1.0f - f);
            if (getLayoutDirection() == 1) {
                left = this.a.getRight();
                left2 = this.e.getRight();
            } else {
                left = this.a.getLeft();
                left2 = this.e.getLeft();
            }
            this.n.setTranslationX(-r3);
            this.a.a.setTranslationX((int) ((left - left2) * f));
        }
    }

    protected final void d(Context context) {
        View inflate;
        LayoutInflater from = LayoutInflater.from(context);
        if (this.w) {
            int i = this.k;
            if (i == 0) {
                inflate = from.inflate(R.layout.wallet_view_line_item_bundle, (ViewGroup) this, true);
            } else {
                if (i != 1) {
                    throw new IllegalArgumentException(a.j(i, "Unknown StickyStyle: "));
                }
                inflate = from.inflate(R.layout.wallet_view_landscape_line_item_bundle, (ViewGroup) this, true);
            }
        } else {
            inflate = from.inflate(R.layout.wallet_view_line_item_bundle, (ViewGroup) this, true);
        }
        this.a = (LineItemView) inflate.findViewById(R.id.line_item_bundle_hero);
        this.n = (ViewGroup) inflate.findViewById(R.id.line_item_bundle_hero_container);
        this.b = (LinearLayout) inflate.findViewById(R.id.line_item_bundle_expanded_items);
        this.c = (LinearLayout) inflate.findViewById(R.id.line_item_bundle_collapsed_items);
        View findViewById = inflate.findViewById(R.id.line_item_bundle_expand_button);
        this.d = findViewById;
        this.m = (TextView) findViewById.findViewById(R.id.line_item_bundle_expand_button_text);
        this.e = (ImageWithCaptionView) inflate.findViewById(R.id.line_item_bundle_image);
        this.f = inflate.findViewById(R.id.line_item_bundle_spacer);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{R.attr.attrWalletShouldAnimateHeroImage});
        this.o = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
        this.d.setOnClickListener(this);
        k(false);
        eijr.M((ImageView) inflate.findViewById(R.id.line_item_bundle_expand_button_image), eijr.h(getContext(), android.R.attr.textColorSecondary));
    }

    @Override // defpackage.dlqh
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void a(ekir ekirVar) {
        this.g = ekirVar;
        g(ekirVar, this.h);
    }

    public final void f(boolean z, boolean z2, boolean z3) {
        boolean m = z & m();
        if (m != this.u || z2) {
            this.u = m;
            k(z3);
            j();
        }
    }

    protected final void g(ekir ekirVar, boolean z) {
        Paint paint;
        Context context = getContext();
        LineItemView lineItemView = this.a;
        ekiv ekivVar = ekirVar.d;
        if (ekivVar == null) {
            ekivVar = ekiv.a;
        }
        boolean z2 = false;
        if (lineItemView.b(ekivVar)) {
            lineItemView.setVisibility(0);
            lineItemView.a(ekivVar);
        } else {
            lineItemView.setVisibility(8);
        }
        ImageWithCaptionView imageWithCaptionView = this.e;
        ekiv ekivVar2 = ekirVar.d;
        if (ekivVar2 == null) {
            ekivVar2 = ekiv.a;
        }
        ekmu ekmuVar = ekivVar2.h;
        if (ekmuVar == null) {
            ekmuVar = ekmu.a;
        }
        dkyr.y(imageWithCaptionView, ekmuVar, context);
        Paint paint2 = null;
        if (h()) {
            int[] iArr = tiy.a;
            paint = o(context, 0);
        } else {
            paint = null;
        }
        this.r = paint;
        if (this.w) {
            this.b.setVisibility(8);
            this.c.setVisibility(8);
            this.d.setVisibility(8);
            this.i = null;
            this.f.setVisibility(8);
            this.j = context.getResources().getDrawable(R.drawable.wallet_header_shadow);
            this.t = context.getResources().getDimensionPixelSize(R.dimen.wallet_header_shadow_height);
            dkyr.T(this.a.a, this);
            this.x = context.getResources().getDimension(R.dimen.wallet_line_item_bundle_animation_scroll_distance);
        } else {
            dlqi.a(context, this.b, ekirVar.f, LineItemView.class);
            dlqi.a(context, this.c, ekirVar.e, LineItemView.class);
            this.m.setText(ekirVar.h);
            if (h()) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.WalletLineItemBundle, tiy.t);
                boolean z3 = obtainStyledAttributes.getBoolean(1, false);
                obtainStyledAttributes.recycle();
                if (z3) {
                    TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(new int[]{android.R.attr.dividerHorizontal});
                    this.j = obtainStyledAttributes2.getDrawable(0);
                    this.t = context.getResources().getDimensionPixelSize(R.dimen.wallet_dialog_divider_height);
                    obtainStyledAttributes2.recycle();
                }
            }
            if (n() && !z) {
                Iterator it = ekirVar.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        int[] iArr2 = tiy.a;
                        paint2 = o(context, 2);
                        break;
                    } else {
                        int a = ekiu.a(((ekiv) it.next()).g);
                        if (a != 0 && a == 7) {
                            break;
                        }
                    }
                }
            }
            this.i = paint2;
            f(!ekirVar.g, true, false);
        }
        if (this.r == null && this.i == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    public final boolean h() {
        ekir ekirVar = this.g;
        return (ekirVar == null || (ekirVar.b & 2) == 0) ? false : true;
    }

    public final boolean i() {
        if (!h()) {
            return false;
        }
        ekiv ekivVar = this.g.d;
        if (ekivVar == null) {
            ekivVar = ekiv.a;
        }
        return (ekivVar.b & 8) != 0;
    }

    public final void j() {
        dltc dltcVar = this.l;
        if (dltcVar != null) {
            dltcVar.c = this.u;
        }
    }

    @Override // defpackage.eiho
    public final void lq() {
        c(this.v);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (view == this.d) {
            f(!this.u, false, true);
        }
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        Canvas canvas2;
        int i;
        int i2;
        int i3;
        int i4;
        Paint paint = this.i;
        if (paint == null || (i3 = this.p) <= 0 || (i4 = this.q) <= 0) {
            canvas2 = canvas;
        } else {
            float f = i3;
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, f, i4, paint);
        }
        Paint paint2 = this.r;
        if (paint2 != null && (i = this.p) > 0 && (i2 = this.s) > 0) {
            canvas2.drawRect(0.0f, 0.0f, i, i2, paint2);
            Drawable drawable = this.j;
            if (drawable != null) {
                drawable.draw(canvas2);
            }
        }
        super.onDraw(canvas2);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        LineItemView lineItemView = this.a;
        if (lineItemView == null || lineItemView.getVisibility() != 0) {
            this.s = 0;
            i5 = 0;
        } else {
            i5 = this.a.getBottom();
            this.s = i5;
        }
        Drawable drawable = this.j;
        if (drawable != null) {
            drawable.setBounds(0, i5, this.p, this.t + i5);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.j == null || this.t <= 0) {
            return;
        }
        setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight() + this.t);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.p = i;
        this.q = i2;
    }

    public LineItemBundleView(Context context, int i) {
        super(context);
        this.u = false;
        this.w = true;
        this.k = i;
        d(context);
    }
}

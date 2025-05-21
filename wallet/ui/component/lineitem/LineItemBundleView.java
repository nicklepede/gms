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
import defpackage.ding;
import defpackage.djeo;
import defpackage.djep;
import defpackage.djhj;
import defpackage.eful;
import defpackage.efwo;
import defpackage.ehvl;
import defpackage.ehvo;
import defpackage.ehvp;
import defpackage.ehzo;
import defpackage.rpq;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public class LineItemBundleView extends FrameLayout implements View.OnClickListener, djeo, eful {
    public LineItemView a;
    LinearLayout b;
    LinearLayout c;
    View d;
    public ImageWithCaptionView e;
    View f;
    public ehvl g;
    boolean h;
    Paint i;
    Drawable j;
    public int k;
    public djhj l;
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
        ehvl ehvlVar = this.g;
        return ehvlVar != null && ehvlVar.e.size() > 0;
    }

    private final boolean m() {
        ehvl ehvlVar = this.g;
        return ehvlVar != null && ehvlVar.f.size() > 0;
    }

    private final boolean n() {
        return m() || l();
    }

    private static final Paint o(Context context, int i) {
        Paint paint;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.WalletLineItemBundle, rpq.u);
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

    @Override // defpackage.djeo
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        return ((ehvl) obj) != null;
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
        efwo.M((ImageView) inflate.findViewById(R.id.line_item_bundle_expand_button_image), efwo.h(getContext(), android.R.attr.textColorSecondary));
    }

    @Override // defpackage.djeo
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void a(ehvl ehvlVar) {
        this.g = ehvlVar;
        g(ehvlVar, this.h);
    }

    public final void f(boolean z, boolean z2, boolean z3) {
        boolean m = z & m();
        if (m != this.u || z2) {
            this.u = m;
            k(z3);
            j();
        }
    }

    protected final void g(ehvl ehvlVar, boolean z) {
        Paint paint;
        Context context = getContext();
        LineItemView lineItemView = this.a;
        ehvp ehvpVar = ehvlVar.d;
        if (ehvpVar == null) {
            ehvpVar = ehvp.a;
        }
        boolean z2 = false;
        if (lineItemView.b(ehvpVar)) {
            lineItemView.setVisibility(0);
            lineItemView.a(ehvpVar);
        } else {
            lineItemView.setVisibility(8);
        }
        ImageWithCaptionView imageWithCaptionView = this.e;
        ehvp ehvpVar2 = ehvlVar.d;
        if (ehvpVar2 == null) {
            ehvpVar2 = ehvp.a;
        }
        ehzo ehzoVar = ehvpVar2.h;
        if (ehzoVar == null) {
            ehzoVar = ehzo.a;
        }
        ding.y(imageWithCaptionView, ehzoVar, context);
        Paint paint2 = null;
        if (h()) {
            int[] iArr = rpq.a;
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
            ding.T(this.a.a, this);
            this.x = context.getResources().getDimension(R.dimen.wallet_line_item_bundle_animation_scroll_distance);
        } else {
            djep.a(context, this.b, ehvlVar.f, LineItemView.class);
            djep.a(context, this.c, ehvlVar.e, LineItemView.class);
            this.m.setText(ehvlVar.h);
            if (h()) {
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(R.style.WalletLineItemBundle, rpq.u);
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
                Iterator it = ehvlVar.f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        int[] iArr2 = rpq.a;
                        paint2 = o(context, 2);
                        break;
                    } else {
                        int a = ehvo.a(((ehvp) it.next()).g);
                        if (a != 0 && a == 7) {
                            break;
                        }
                    }
                }
            }
            this.i = paint2;
            f(!ehvlVar.g, true, false);
        }
        if (this.r == null && this.i == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    public final boolean h() {
        ehvl ehvlVar = this.g;
        return (ehvlVar == null || (ehvlVar.b & 2) == 0) ? false : true;
    }

    public final boolean i() {
        if (!h()) {
            return false;
        }
        ehvp ehvpVar = this.g.d;
        if (ehvpVar == null) {
            ehvpVar = ehvp.a;
        }
        return (ehvpVar.b & 8) != 0;
    }

    public final void j() {
        djhj djhjVar = this.l;
        if (djhjVar != null) {
            djhjVar.c = this.u;
        }
    }

    @Override // defpackage.eful
    public final void lb() {
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

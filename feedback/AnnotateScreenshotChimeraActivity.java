package com.google.android.gms.feedback;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.gms.R;
import defpackage.asej;
import defpackage.asot;
import defpackage.bafg;
import defpackage.bafh;
import defpackage.bafi;
import defpackage.bafj;
import defpackage.bafk;
import defpackage.bafl;
import defpackage.bafm;
import defpackage.bajp;
import defpackage.baol;
import defpackage.bivr;
import defpackage.bivs;
import defpackage.byhr;
import defpackage.fnnl;
import defpackage.fnpd;
import defpackage.fnpv;
import defpackage.fnrr;
import defpackage.fnte;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class AnnotateScreenshotChimeraActivity extends qfp {
    public DrawableView j;
    boolean k;
    private View l;
    private View m;
    private View n;
    private View o;
    private View p;
    private View q;
    private View r;
    private View s;
    private View t;
    private View u;
    private FrameLayout v;
    private int w;
    private int x;
    private int y;

    static {
        asot.b("gf_AnnotateScreenshot", asej.FEEDBACK);
    }

    private final void h(ImageView imageView) {
        bivr.q(imageView, this, bivs.a(this, R.attr.ghf_greyIconColor));
    }

    public final void a() {
        baol.e(this.j.e);
        finish();
    }

    public final void b(Bitmap bitmap) {
        int width = bitmap.getWidth();
        this.j.getLayoutParams().width = width;
        Rect rect = new Rect();
        getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
        this.w = rect.top + this.q.getHeight() + ((ViewGroup.MarginLayoutParams) this.v.getLayoutParams()).topMargin;
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.x = (displayMetrics.widthPixels - width) / 2;
        this.v.getLayoutParams().width = width;
        this.v.setLeft(this.x);
        this.v.setRight(displayMetrics.widthPixels - this.x);
        DrawableView drawableView = this.j;
        if (fnpv.a.a().a()) {
            drawableView.b = bitmap.isMutable() ? bitmap : bitmap.copy(bitmap.getConfig(), true);
        } else {
            drawableView.b = bitmap;
        }
        drawableView.e = bitmap.copy(bitmap.getConfig(), true);
        drawableView.c = new Canvas(drawableView.b);
        drawableView.c.drawBitmap(drawableView.b, 0.0f, 0.0f, drawableView.a);
        if (fnte.a.a().a()) {
            this.j.invalidate();
        }
        this.k = true;
    }

    public final void c() {
        ((LinearLayout) this.p).removeAllViews();
    }

    public final void f() {
        if (!fnrr.c() && bivs.d(this, R.attr.gf_isInDarkMode)) {
            findViewById(R.id.gf_select_blackout_view).setBackground(getDrawable(R.drawable.gf_circle_drawable_blackout_without_stroke));
        }
        this.j.a((int) fnnl.d(), (int) fnnl.c());
        View view = this.n;
        int i = this.y;
        view.setPadding(i, i, i, i);
        this.o.setPadding(0, 0, 0, 0);
    }

    public final void g() {
        if (!fnrr.c() && bivs.d(this, R.attr.gf_isInDarkMode)) {
            findViewById(R.id.gf_select_blackout_view).setBackground(getDrawable(R.drawable.gf_circle_drawable_blackout_with_stroke));
        }
        this.j.a((int) fnnl.g(), (int) fnnl.f());
        View view = this.o;
        int i = this.y;
        view.setPadding(i, i, i, i);
        this.n.setPadding(0, 0, 0, 0);
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!(baol.f() ? baol.d().c() : FeedbackChimeraActivity.W())) {
            finish();
            return;
        }
        bajp c = baol.c();
        if (c == null) {
            setTheme(R.style.gf_DayNightActivityStyle);
        } else {
            ErrorReport b = c.b();
            if (b == null) {
                setTheme(R.style.gf_DayNightActivityStyle);
            } else {
                bivs.b(this, b, R.style.gf_LightActivityStyle, R.style.gf_DarkActivityStyle, R.style.gf_DayNightActivityStyle);
            }
        }
        if (fnpd.c() && getPackageManager().hasSystemFeature("android.software.communal_mode")) {
            getWindow().addFlags(524416);
        }
        setContentView(R.layout.annotate_screenshot_ui);
        this.j = (DrawableView) findViewById(R.id.gf_drawable_view);
        this.l = findViewById(R.id.gf_blackout_layout_container);
        this.m = findViewById(R.id.gf_highlight_layout_container);
        this.n = findViewById(R.id.gf_blackout_layout);
        this.o = findViewById(R.id.gf_highlight_layout);
        this.p = findViewById(R.id.gf_info_text_layout);
        this.q = findViewById(R.id.gf_menu_layout);
        this.r = findViewById(R.id.gf_close_view);
        this.s = findViewById(R.id.gf_undo_view);
        this.t = findViewById(R.id.gf_done_view);
        this.u = findViewById(R.id.gf_got_it_text_view);
        this.v = (FrameLayout) findViewById(R.id.gf_contain_drawable);
        this.y = (int) getResources().getDimension(R.dimen.gf_selected_border_padding);
        h((ImageView) this.r);
        h((ImageView) this.s);
        h((ImageView) this.t);
        if (fnrr.c()) {
            View findViewById = findViewById(R.id.gf_select_highlight_view);
            findViewById.setBackground(bivr.b(findViewById.getBackground(), this, (int) fnnl.g()));
            View findViewById2 = findViewById(R.id.gf_select_blackout_view);
            findViewById2.setBackground(bivr.b(findViewById2.getBackground(), this, (int) fnnl.d()));
        }
        this.l.setOnClickListener(new bafg(this));
        this.r.setOnClickListener(new bafh(this));
        this.m.setOnClickListener(new bafi(this));
        this.s.setOnClickListener(new bafj(this));
        this.t.setOnClickListener(new bafk(this));
        this.u.setOnClickListener(new bafl(this));
        new byhr(Looper.getMainLooper()).postDelayed(new bafm(this), fnnl.a.a().i());
        if (baol.h()) {
            setRequestedOrientation(1);
        } else {
            setRequestedOrientation(0);
        }
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyDown(i, keyEvent);
        }
        a();
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.setLocation(motionEvent.getX() - this.x, motionEvent.getY() - this.w);
        this.j.onTouchEvent(motionEvent);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r6.g != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (com.google.android.gms.feedback.FeedbackChimeraActivity.q != false) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    @Override // com.google.android.chimera.android.Activity, defpackage.qaj, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onWindowFocusChanged(boolean r6) {
        /*
            r5 = this;
            boolean r6 = r5.k
            if (r6 != 0) goto Laf
            boolean r6 = defpackage.fomv.c()
            boolean r6 = defpackage.bivk.b(r6)
            if (r6 != 0) goto Lf
            goto L4a
        Lf:
            android.content.res.Resources r6 = r5.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            boolean r0 = defpackage.baol.h()
            if (r0 == 0) goto L24
            int r0 = r6.heightPixels
            int r6 = r6.widthPixels
            if (r0 > r6) goto L4a
            goto L2b
        L24:
            int r0 = r6.widthPixels
            int r6 = r6.heightPixels
            if (r0 <= r6) goto L2b
            goto L4a
        L2b:
            boolean r6 = defpackage.baol.f()
            if (r6 == 0) goto L40
            bamz r6 = defpackage.baol.d()
            boolean r0 = r6.c()
            if (r0 == 0) goto L54
            boolean r6 = r6.g
            if (r6 == 0) goto L54
            goto L4a
        L40:
            boolean r6 = com.google.android.gms.feedback.FeedbackChimeraActivity.W()
            if (r6 == 0) goto L54
            boolean r6 = com.google.android.gms.feedback.FeedbackChimeraActivity.q
            if (r6 == 0) goto L54
        L4a:
            android.graphics.Bitmap r6 = defpackage.baol.a()
            if (r6 == 0) goto Laf
            r5.b(r6)
            return
        L54:
            bajp r6 = defpackage.baol.c()
            com.google.android.gms.googlehelp.feedback.Screenshot r6 = r6.g
            bajp r0 = defpackage.baol.c()
            com.google.android.gms.feedback.ErrorReport r0 = r0.b()
            byte[] r1 = r0.v
            if (r1 != 0) goto L6b
            int r0 = r6.b
            int r6 = r6.c
            goto L72
        L6b:
            int r6 = r0.x
            int r0 = r0.w
            r4 = r0
            r0 = r6
            r6 = r4
        L72:
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            android.view.Window r2 = r5.getWindow()
            android.view.View r2 = r2.getDecorView()
            r2.getWindowVisibleDisplayFrame(r1)
            android.content.res.Resources r2 = r5.getResources()
            r3 = 0
            android.util.Pair r6 = defpackage.bajx.a(r2, r1, r0, r6, r3)
            bafn r0 = new bafn
            java.lang.Object r1 = r6.first
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            java.lang.Object r6 = r6.second
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            r0.<init>(r5, r1, r6)
            asmf r6 = new asmf
            r1 = 2147483647(0x7fffffff, float:NaN)
            r2 = 9
            r6.<init>(r1, r2)
            java.lang.Void[] r1 = new java.lang.Void[r3]
            r0.executeOnExecutor(r6, r1)
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.feedback.AnnotateScreenshotChimeraActivity.onWindowFocusChanged(boolean):void");
    }
}

package com.google.android.gms.instantapps.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import com.google.android.gms.R;
import defpackage.aqxd;
import defpackage.bodp;
import defpackage.bodr;
import defpackage.boem;
import defpackage.boeo;
import defpackage.bolt;
import defpackage.bolu;
import defpackage.bolv;
import defpackage.bolw;
import defpackage.bomj;
import defpackage.bomk;
import defpackage.bomm;
import defpackage.bomp;
import defpackage.bomq;
import defpackage.bp;
import defpackage.brbu;
import defpackage.dfaq;
import defpackage.ew;
import defpackage.qet;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class OptInChimeraActivity extends qet {
    public ScrollView j;
    public View k;
    public Button l;
    public Button m;
    public bomm n;
    public ew o;
    boeo p;
    public boem q;
    long r;
    private View s;
    private View t;

    public final void a() {
        p(new bolt());
    }

    public final void k() {
        bomm bommVar = this.n;
        if (bommVar.f >= 3) {
            return;
        }
        bommVar.f = 3;
        View view = bommVar.e;
        float translationY = view.getTranslationY();
        View view2 = bommVar.d;
        bommVar.a(ObjectAnimator.ofFloat(view, "translationY", translationY, view.getHeight()), ObjectAnimator.ofFloat(view2, "alpha", view2.getAlpha(), 0.0f), new bomk(bommVar));
    }

    public final void l(String str) {
        boem boemVar = this.q;
        if (boemVar != null) {
            boemVar.b(str);
        }
    }

    public final void m(int i) {
        bomp bompVar = new bomp();
        Bundle bundle = new Bundle();
        bundle.putInt("failureReason", i);
        Log.w("SetupFailureFragment", String.format("Instant Apps setup failure: %d", Integer.valueOf(i)));
        bundle.putParcelable("browserIntent", null);
        bompVar.setArguments(bundle);
        p(bompVar);
    }

    public final void n() {
        setResult(2);
        k();
    }

    public final void o() {
        setResult(0);
        k();
    }

    @Override // defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onBackPressed() {
        this.q.b("OptInActivity.onBackPressed");
        n();
    }

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_OptIn);
        super.onCreate(bundle);
        if (bundle != null && bundle.getBoolean("stateExising", false)) {
            finish();
            return;
        }
        getApplicationContext();
        boeo boeoVar = new boeo();
        this.p = boeoVar;
        boeoVar.c("OptInActivity.onCreate").a();
        setContentView(R.layout.setup_activity);
        View findViewById = findViewById(R.id.empty_space);
        this.s = findViewById;
        findViewById.setOnClickListener(new bolu(this));
        View findViewById2 = findViewById(R.id.bottom_sheet);
        this.t = findViewById2;
        findViewById2.setClickable(true);
        this.j = (ScrollView) findViewById(R.id.scroll_view);
        this.k = findViewById(R.id.content_wrapper);
        this.l = (Button) findViewById(R.id.confirm_button);
        this.m = (Button) findViewById(R.id.cancel_button);
        int dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.opt_in_button_height);
        this.l.setHeight(this.l.getPaddingTop() + this.l.getPaddingBottom() + dimensionPixelSize);
        this.m.setHeight(dimensionPixelSize + this.m.getPaddingTop() + this.m.getPaddingBottom());
        this.n = new bomm(this, this.s, this.t);
        if (this.o == null) {
            this.o = getSupportFragmentManager();
        }
        s(false);
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        boem boemVar = this.q;
        if (boemVar != null) {
            this.r = boemVar.a();
            if (isFinishing()) {
                this.q.b("OptInActivity.foregroundTime");
                brbu brbuVar = this.p.a;
                if (brbuVar != null) {
                    brbuVar.i();
                }
            }
        }
        super.onPause();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        long j = bundle != null ? bundle.getLong("stateOptInTotalVisibleMillis", 0L) : 0L;
        this.r = j;
        if (j != 0) {
            this.q = this.p.a(j);
        }
    }

    @Override // defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onResume() {
        super.onResume();
        boeo boeoVar = this.p;
        if (boeoVar != null) {
            this.q = boeoVar.a(this.r);
        }
    }

    @Override // defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("stateOptInTotalVisibleMillis", this.r);
        bundle.putBoolean("stateExising", bomm.a.contains(Integer.valueOf(this.n.f)));
        super.onSaveInstanceState(bundle);
    }

    public final void p(bomq bomqVar) {
        ew ewVar = this.o;
        if (ewVar.z) {
            return;
        }
        bp bpVar = new bp(ewVar);
        bpVar.F(R.id.content_wrapper, bomqVar);
        bpVar.b();
        this.o.an();
        bomm bommVar = this.n;
        if (bommVar.f != 0) {
            return;
        }
        bommVar.e.getViewTreeObserver().addOnGlobalLayoutListener(new bomj(bommVar));
    }

    public final void q(int i, View.OnClickListener onClickListener) {
        this.m.setVisibility(0);
        this.m.setText(i);
        this.m.setOnClickListener(onClickListener);
    }

    public final void r(int i, View.OnClickListener onClickListener) {
        this.l.setVisibility(0);
        this.l.setText(i);
        this.l.setOnClickListener(onClickListener);
    }

    public final void s(boolean z) {
        Activity containerActivity = getContainerActivity();
        aqxd aqxdVar = bodp.a;
        dfaq c = new bodr(containerActivity).c();
        c.y(new bolw(this));
        c.z(new bolv(this, z));
    }

    public final void t(Throwable th) {
        Log.e("OptInChimeraActivity", "Exception: ", th);
        m(2);
    }
}

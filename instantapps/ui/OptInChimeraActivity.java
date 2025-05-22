package com.google.android.gms.instantapps.ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;
import com.google.android.gms.R;
import defpackage.aszs;
import defpackage.bp;
import defpackage.bqlf;
import defpackage.bqlh;
import defpackage.bqmc;
import defpackage.bqme;
import defpackage.bqtj;
import defpackage.bqtk;
import defpackage.bqtl;
import defpackage.bqtm;
import defpackage.bqtz;
import defpackage.bqua;
import defpackage.bquc;
import defpackage.bquf;
import defpackage.bqug;
import defpackage.btjl;
import defpackage.dhlw;
import defpackage.ew;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class OptInChimeraActivity extends rxx {
    public ScrollView j;
    public View k;
    public Button l;
    public Button m;
    public bquc n;
    public ew o;
    bqme p;
    public bqmc q;
    long r;
    private View s;
    private View t;

    public final void a() {
        p(new bqtj());
    }

    public final void k() {
        bquc bqucVar = this.n;
        if (bqucVar.f >= 3) {
            return;
        }
        bqucVar.f = 3;
        View view = bqucVar.e;
        float translationY = view.getTranslationY();
        View view2 = bqucVar.d;
        bqucVar.a(ObjectAnimator.ofFloat(view, "translationY", translationY, view.getHeight()), ObjectAnimator.ofFloat(view2, "alpha", view2.getAlpha(), 0.0f), new bqua(bqucVar));
    }

    public final void l(String str) {
        bqmc bqmcVar = this.q;
        if (bqmcVar != null) {
            bqmcVar.b(str);
        }
    }

    public final void m(int i) {
        bquf bqufVar = new bquf();
        Bundle bundle = new Bundle();
        bundle.putInt("failureReason", i);
        Log.w("SetupFailureFragment", String.format("Instant Apps setup failure: %d", Integer.valueOf(i)));
        bundle.putParcelable("browserIntent", null);
        bqufVar.setArguments(bundle);
        p(bqufVar);
    }

    public final void n() {
        setResult(2);
        k();
    }

    public final void o() {
        setResult(0);
        k();
    }

    @Override // defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onBackPressed() {
        this.q.b("OptInActivity.onBackPressed");
        n();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        setTheme(R.style.Theme_OptIn);
        super.onCreate(bundle);
        if (bundle != null && bundle.getBoolean("stateExising", false)) {
            finish();
            return;
        }
        getApplicationContext();
        bqme bqmeVar = new bqme();
        this.p = bqmeVar;
        bqmeVar.c("OptInActivity.onCreate").a();
        setContentView(R.layout.setup_activity);
        View findViewById = findViewById(R.id.empty_space);
        this.s = findViewById;
        findViewById.setOnClickListener(new bqtk(this));
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
        this.n = new bquc(this, this.s, this.t);
        if (this.o == null) {
            this.o = getSupportFragmentManager();
        }
        s(false);
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        bqmc bqmcVar = this.q;
        if (bqmcVar != null) {
            this.r = bqmcVar.a();
            if (isFinishing()) {
                this.q.b("OptInActivity.foregroundTime");
                btjl btjlVar = this.p.a;
                if (btjlVar != null) {
                    btjlVar.i();
                }
            }
        }
        super.onPause();
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        long j = bundle != null ? bundle.getLong("stateOptInTotalVisibleMillis", 0L) : 0L;
        this.r = j;
        if (j != 0) {
            this.q = this.p.a(j);
        }
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        bqme bqmeVar = this.p;
        if (bqmeVar != null) {
            this.q = bqmeVar.a(this.r);
        }
    }

    @Override // defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putLong("stateOptInTotalVisibleMillis", this.r);
        bundle.putBoolean("stateExising", bquc.a.contains(Integer.valueOf(this.n.f)));
        super.onSaveInstanceState(bundle);
    }

    public final void p(bqug bqugVar) {
        ew ewVar = this.o;
        if (ewVar.z) {
            return;
        }
        bp bpVar = new bp(ewVar);
        bpVar.F(R.id.content_wrapper, bqugVar);
        bpVar.b();
        this.o.an();
        bquc bqucVar = this.n;
        if (bqucVar.f != 0) {
            return;
        }
        bqucVar.e.getViewTreeObserver().addOnGlobalLayoutListener(new bqtz(bqucVar));
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
        aszs aszsVar = bqlf.a;
        dhlw c = new bqlh(containerActivity).c();
        c.y(new bqtm(this));
        c.z(new bqtl(this, z));
    }

    public final void t(Throwable th) {
        Log.e("OptInChimeraActivity", "Exception: ", th);
        m(2);
    }
}

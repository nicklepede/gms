package com.google.android.gms.gcm;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.widget.SearchView;
import android.text.TextUtils;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.chimera.ContextThemeWrapper;
import com.google.android.gms.R;
import com.google.android.gms.gcm.GcmChimeraDiagnostics;
import defpackage.aupz;
import defpackage.bkad;
import defpackage.bkby;
import defpackage.bkbz;
import defpackage.bkcx;
import defpackage.bkde;
import defpackage.caqj;
import defpackage.ekti;
import defpackage.ekvl;
import defpackage.eqgo;
import defpackage.frbt;
import defpackage.ig;
import defpackage.iuz;
import defpackage.ivv;
import defpackage.iwe;
import defpackage.rxx;
import java.util.List;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class GcmChimeraDiagnostics extends rxx implements View.OnClickListener {
    public static final Handler j = new caqj();
    boolean l;
    private TextView m;
    private Button n;
    private MenuItem o;
    private TextView p;
    private SearchView q;
    private bkcx r;
    private String s;
    private List t;
    private Runnable v;
    boolean k = false;
    private final eqgo u = new aupz(1, 10);

    private final void o() {
        this.n.setText(true != this.k ? "Events" : "Status");
        this.m.setVisibility(true != this.k ? 0 : 8);
        this.p.setVisibility(true != this.k ? 8 : 0);
        supportInvalidateOptionsMenu();
    }

    public final synchronized void a() {
        this.t = this.r.c();
        runOnUiThread(new Runnable() { // from class: bkbx
            @Override // java.lang.Runnable
            public final void run() {
                GcmChimeraDiagnostics.this.m();
            }
        });
    }

    public final synchronized void k() {
        this.s = this.l ? this.r.a() : this.r.b();
        runOnUiThread(new Runnable() { // from class: bkbt
            @Override // java.lang.Runnable
            public final void run() {
                GcmChimeraDiagnostics.this.n();
            }
        });
    }

    public final void l() {
        if (this.k) {
            return;
        }
        this.u.execute(new Runnable() { // from class: bkbu
            @Override // java.lang.Runnable
            public final void run() {
                GcmChimeraDiagnostics.this.k();
            }
        });
    }

    public final synchronized void m() {
        StringBuilder sb = new StringBuilder();
        if (this.t != null) {
            String c = TextUtils.isEmpty(this.q.c()) ? null : ekti.c(this.q.c().toString());
            List<String> list = this.t;
            ekvl.y(list);
            for (String str : list) {
                if (c == null || ekti.c(str).contains(c)) {
                    sb.append(str);
                    sb.append("\n");
                }
            }
        }
        this.p.setText(sb.toString());
    }

    public final synchronized void n() {
        this.m.setText(this.s);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (!this.k) {
            this.u.execute(new Runnable() { // from class: bkbw
                @Override // java.lang.Runnable
                public final void run() {
                    GcmChimeraDiagnostics.this.a();
                }
            });
        }
        this.k = !this.k;
        o();
        l();
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bkad.i(getApplicationContext());
        if (bkad.d() != 0) {
            finish();
            return;
        }
        if (this.r == null) {
            bkcx bkcxVar = new bkcx(this);
            this.r = bkcxVar;
            Intent intent = new Intent("com.google.android.gms.gcm.GCM_SERVICE_DIAGNOSTICS");
            intent.setPackage("com.google.android.gms");
            Bundle bundle2 = new Bundle();
            bundle2.putBinder("callback", new bkde(bkcxVar));
            intent.putExtras(bundle2);
            bkcxVar.a.sendBroadcast(intent);
        }
        setTheme(R.style.Theme_AppCompat_DayNight_DarkActionBar);
        ig hO = hO();
        if (hO != null) {
            hO.r(false);
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        if (frbt.a.lK().al()) {
            iuz iuzVar = new iuz() { // from class: bkbv
                @Override // defpackage.iuz
                public final ixt eB(View view, ixt ixtVar) {
                    Handler handler = GcmChimeraDiagnostics.j;
                    ioo f = ixtVar.f(519);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = f.c;
                        marginLayoutParams.leftMargin = f.b;
                        marginLayoutParams.bottomMargin = f.e;
                        marginLayoutParams.rightMargin = f.d;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    return ixt.a;
                }
            };
            int[] iArr = iwe.a;
            ivv.k(linearLayout, iuzVar);
        }
        if (hO != null) {
            hO.A("FCM Diagnostics");
        }
        LinearLayout linearLayout2 = new LinearLayout(this);
        Button button = new Button(this);
        button.setText("Events");
        linearLayout2.addView(button);
        button.setOnClickListener(this);
        this.n = button;
        linearLayout.addView(linearLayout2);
        TextView textView = new TextView(this);
        this.m = textView;
        textView.setMinLines(20);
        this.m.setMovementMethod(new ScrollingMovementMethod());
        linearLayout.addView(this.m);
        SearchView searchView = new SearchView(new ContextThemeWrapper(this, R.style.ThemeOverlay_AppCompat_Dark_ActionBar));
        this.q = searchView;
        searchView.p = new bkby(this);
        TextView textView2 = new TextView(this);
        this.p = textView2;
        textView2.setMinLines(20);
        this.p.setMovementMethod(new ScrollingMovementMethod());
        linearLayout.addView(this.p);
        o();
        this.l = true;
        setContentView(linearLayout);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        MenuItem add = menu.add("Advanced view");
        this.o = add;
        add.setCheckable(true);
        if (this.k) {
            MenuItem add2 = menu.add(android.R.string.search_go);
            add2.setIcon(android.R.drawable.ic_menu_search);
            add2.setActionView(this.q);
            add2.setShowAsActionFlags(9);
        }
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == this.o) {
            this.l = !this.l;
            l();
        }
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItem = this.o;
        if (menuItem != null) {
            menuItem.setChecked(!this.l);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStart() {
        super.onStart();
        bkbz bkbzVar = new bkbz(this);
        this.v = bkbzVar;
        bkbzVar.run();
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onStop() {
        super.onStop();
        Handler handler = j;
        Runnable runnable = this.v;
        ekvl.y(runnable);
        handler.removeCallbacks(runnable);
    }
}

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
import defpackage.asmf;
import defpackage.bhvo;
import defpackage.bhxj;
import defpackage.bhxk;
import defpackage.bhyi;
import defpackage.bhyp;
import defpackage.byhr;
import defpackage.eigd;
import defpackage.eiig;
import defpackage.ensv;
import defpackage.fojc;
import defpackage.ig;
import defpackage.itj;
import defpackage.iuf;
import defpackage.iuo;
import defpackage.qet;
import java.util.List;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class GcmChimeraDiagnostics extends qet implements View.OnClickListener {
    public static final Handler j = new byhr();
    boolean l;
    private TextView m;
    private Button n;
    private MenuItem o;
    private TextView p;
    private SearchView q;
    private bhyi r;
    private String s;
    private List t;
    private Runnable v;
    boolean k = false;
    private final ensv u = new asmf(1, 10);

    private final void o() {
        this.n.setText(true != this.k ? "Events" : "Status");
        this.m.setVisibility(true != this.k ? 0 : 8);
        this.p.setVisibility(true != this.k ? 8 : 0);
        supportInvalidateOptionsMenu();
    }

    public final synchronized void a() {
        this.t = this.r.c();
        runOnUiThread(new Runnable() { // from class: bhxi
            @Override // java.lang.Runnable
            public final void run() {
                GcmChimeraDiagnostics.this.m();
            }
        });
    }

    public final synchronized void k() {
        this.s = this.l ? this.r.a() : this.r.b();
        runOnUiThread(new Runnable() { // from class: bhxe
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
        this.u.execute(new Runnable() { // from class: bhxf
            @Override // java.lang.Runnable
            public final void run() {
                GcmChimeraDiagnostics.this.k();
            }
        });
    }

    public final synchronized void m() {
        StringBuilder sb = new StringBuilder();
        if (this.t != null) {
            String c = TextUtils.isEmpty(this.q.c()) ? null : eigd.c(this.q.c().toString());
            List<String> list = this.t;
            eiig.x(list);
            for (String str : list) {
                if (c == null || eigd.c(str).contains(c)) {
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
            this.u.execute(new Runnable() { // from class: bhxh
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

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        bhvo.i(getApplicationContext());
        if (bhvo.d() != 0) {
            finish();
            return;
        }
        if (this.r == null) {
            bhyi bhyiVar = new bhyi(this);
            this.r = bhyiVar;
            Intent intent = new Intent("com.google.android.gms.gcm.GCM_SERVICE_DIAGNOSTICS");
            intent.setPackage("com.google.android.gms");
            Bundle bundle2 = new Bundle();
            bundle2.putBinder("callback", new bhyp(bhyiVar));
            intent.putExtras(bundle2);
            bhyiVar.a.sendBroadcast(intent);
        }
        setTheme(R.style.Theme_AppCompat_DayNight_DarkActionBar);
        ig hy = hy();
        if (hy != null) {
            hy.r(false);
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        if (fojc.a.a().al()) {
            itj itjVar = new itj() { // from class: bhxg
                @Override // defpackage.itj
                public final iwd eB(View view, iwd iwdVar) {
                    Handler handler = GcmChimeraDiagnostics.j;
                    imx f = iwdVar.f(519);
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        marginLayoutParams.topMargin = f.c;
                        marginLayoutParams.leftMargin = f.b;
                        marginLayoutParams.bottomMargin = f.e;
                        marginLayoutParams.rightMargin = f.d;
                        view.setLayoutParams(marginLayoutParams);
                    }
                    return iwd.a;
                }
            };
            int[] iArr = iuo.a;
            iuf.k(linearLayout, itjVar);
        }
        if (hy != null) {
            hy.A("FCM Diagnostics");
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
        searchView.p = new bhxj(this);
        TextView textView2 = new TextView(this);
        this.p = textView2;
        textView2.setMinLines(20);
        this.p.setMovementMethod(new ScrollingMovementMethod());
        linearLayout.addView(this.p);
        o();
        this.l = true;
        setContentView(linearLayout);
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == this.o) {
            this.l = !this.l;
            l();
        }
        return true;
    }

    @Override // com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onPrepareOptionsMenu(Menu menu) {
        MenuItem menuItem = this.o;
        if (menuItem != null) {
            menuItem.setChecked(!this.l);
        }
        return super.onPrepareOptionsMenu(menu);
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStart() {
        super.onStart();
        bhxk bhxkVar = new bhxk(this);
        this.v = bhxkVar;
        bhxkVar.run();
    }

    @Override // defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onStop() {
        super.onStop();
        Handler handler = j;
        Runnable runnable = this.v;
        eiig.x(runnable);
        handler.removeCallbacks(runnable);
    }
}

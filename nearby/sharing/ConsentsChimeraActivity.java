package com.google.android.gms.nearby.sharing;

import android.accounts.Account;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.transition.TransitionManager;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.R;
import com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver;
import com.google.android.gms.nearby.sharing.ConsentsChimeraActivity;
import com.google.android.gms.nearby.sharing.view.NavigationLayout;
import defpackage.chke;
import defpackage.cnuu;
import defpackage.coks;
import defpackage.colp;
import defpackage.conm;
import defpackage.coog;
import defpackage.cpay;
import defpackage.ctuq;
import defpackage.dhln;
import defpackage.dhlq;
import defpackage.dhlw;
import defpackage.famh;
import defpackage.fans;
import defpackage.fauu;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.ftga;
import defpackage.ftgf;
import defpackage.ind;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class ConsentsChimeraActivity extends cnuu {
    public TextView A;
    public TextView B;
    public Button C;
    public Button D;
    public Button E;
    private ImageView G;
    private TextView H;
    public ProgressBar w;
    public View x;
    public TextView y;
    public TextView z;
    public int F = 3;
    private final BroadcastReceiver I = new TracingBroadcastReceiver() { // from class: com.google.android.gms.nearby.sharing.ConsentsChimeraActivity.1
        @Override // com.google.android.gms.libs.punchclock.tracing.TracingBroadcastReceiver
        public final void jP(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                boolean z = false;
                if (connectivityManager == null) {
                    conm.a.e().p("Failed to get connectivity manager.", new Object[0]);
                    return;
                }
                NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
                NetworkInfo networkInfo2 = connectivityManager.getNetworkInfo(0);
                if (networkInfo != null && networkInfo.isConnected()) {
                    z = true;
                }
                if ((networkInfo2 == null || !networkInfo2.isConnected()) && !z) {
                    return;
                }
                ConsentsChimeraActivity.this.u();
            }
        }
    };

    @Override // defpackage.cnuu
    protected final fauu l() {
        return fauu.USE_CASE_NEARBY_SHARE;
    }

    @Override // defpackage.cnuu
    protected final String m() {
        return "com.google.android.gms.nearby.sharing.ConsentsActivity";
    }

    @Override // defpackage.cnuu, defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!ftga.be()) {
            finish();
            return;
        }
        if (ftgf.d().isEmpty() && coog.a(this) == null) {
            setTitle(getString(R.string.sharing_product_name_v3));
        } else {
            setTitle(getString(R.string.sharing_product_name));
        }
        setContentView(R.layout.sharing_activity_consents);
        findViewById(R.id.toolbar_wrapper).setVisibility(8);
        this.w = (ProgressBar) findViewById(R.id.consents_text_loading_progress_bar);
        this.x = findViewById(R.id.account_info);
        this.G = (ImageView) findViewById(R.id.account_icon);
        this.H = (TextView) findViewById(R.id.account_email);
        this.y = (TextView) findViewById(R.id.account_full_name);
        findViewById(R.id.consents_introduction).setVisibility(8);
        this.z = (TextView) findViewById(R.id.device_contacts_title);
        this.A = (TextView) findViewById(R.id.device_contacts_description);
        this.B = (TextView) findViewById(R.id.device_contacts_footer);
        NavigationLayout navigationLayout = (NavigationLayout) findViewById(R.id.nav_bar);
        o(navigationLayout);
        this.C = (Button) navigationLayout.findViewById(R.id.skip_button);
        this.D = (Button) navigationLayout.findViewById(R.id.negative_button);
        this.E = (Button) navigationLayout.findViewById(R.id.positive_button);
        this.C.setOnClickListener(new View.OnClickListener() { // from class: cnvk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsentsChimeraActivity.this.t();
            }
        });
        this.D.setOnClickListener(new View.OnClickListener() { // from class: cnvn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsentsChimeraActivity.this.t();
            }
        });
        this.E.setOnClickListener(new View.OnClickListener() { // from class: cnvo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final ConsentsChimeraActivity consentsChimeraActivity = ConsentsChimeraActivity.this;
                Account a = consentsChimeraActivity.a();
                if (a == null) {
                    conm.a.b().p("Unable to enable device contacts: account is null.", new Object[0]);
                    consentsChimeraActivity.v();
                }
                dhlw b = cpay.a(consentsChimeraActivity).b(a);
                b.z(new dhlq() { // from class: cnvs
                    @Override // defpackage.dhlq
                    public final void gC(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        ConsentsChimeraActivity consentsChimeraActivity2 = ConsentsChimeraActivity.this;
                        if (!booleanValue) {
                            consentsChimeraActivity2.F = 4;
                            conm.a.e().p("Unable to enable device contacts.", new Object[0]);
                            consentsChimeraActivity2.w();
                        } else {
                            conm.a.b().p("Successfully enabled device contacts.", new Object[0]);
                            consentsChimeraActivity2.setResult(-1);
                            consentsChimeraActivity2.F = 2;
                            consentsChimeraActivity2.finishAfterTransition();
                        }
                    }
                });
                b.y(new dhln() { // from class: cnvt
                    @Override // defpackage.dhln
                    public final void gB(Exception exc) {
                        ConsentsChimeraActivity consentsChimeraActivity2 = ConsentsChimeraActivity.this;
                        consentsChimeraActivity2.F = 4;
                        conm.a.e().f(exc).p("Unable to enable device contacts.", new Object[0]);
                        consentsChimeraActivity2.w();
                    }
                });
            }
        });
    }

    @Override // defpackage.cnuu, defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        super.onDestroy();
        int i = this.F;
        fgrc L = colp.L(43);
        fgrc v = famh.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fgri fgriVar = v.b;
        famh famhVar = (famh) fgriVar;
        famhVar.c = 2;
        famhVar.b |= 1;
        if (!fgriVar.L()) {
            v.U();
        }
        famh famhVar2 = (famh) v.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        famhVar2.d = i2;
        famhVar2.b |= 2;
        famh famhVar3 = (famh) v.Q();
        if (!L.b.L()) {
            L.U();
        }
        fans fansVar = (fans) L.b;
        fans fansVar2 = fans.a;
        famhVar3.getClass();
        fansVar.P = famhVar3;
        fansVar.c |= 8192;
        p(new coks((fans) L.Q()));
    }

    @Override // defpackage.cnuu, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        t();
        return true;
    }

    @Override // defpackage.cnuu, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onPause() {
        super.onPause();
        chke.f(this, this.I);
    }

    @Override // defpackage.cnuu, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onResume() {
        super.onResume();
        ind.b(this, this.I, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
    }

    @Override // defpackage.cnuu
    protected final void r() {
        u();
    }

    public final void t() {
        setResult(0);
        Account a = a();
        if (a != null) {
            this.k.G(a, 1);
        }
        finishAfterTransition();
    }

    public final void u() {
        Account a = a();
        if (a == null) {
            conm.a.e().p("Unable to enable device contacts: account is null.", new Object[0]);
            v();
            return;
        }
        this.H.setText(a.name);
        dhlw c = ctuq.c(this, a);
        final ImageView imageView = this.G;
        Objects.requireNonNull(imageView);
        c.z(new dhlq() { // from class: cnvu
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                imageView.setImageBitmap((Bitmap) obj);
            }
        });
        c.y(new dhln() { // from class: cnvv
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                conm.a.b().f(exc).p("Failed to get account icon.", new Object[0]);
            }
        });
        dhlw d = ctuq.d(a);
        d.z(new dhlq() { // from class: cnvl
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                ConsentsChimeraActivity.this.y.setText(((ctup) obj).a);
            }
        });
        d.y(new dhln() { // from class: cnvm
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                conm.a.b().f(exc).p("Failed to get the account name.", new Object[0]);
            }
        });
        dhlw c2 = cpay.a(this).c(a);
        c2.z(new dhlq() { // from class: cnvp
            @Override // defpackage.dhlq
            public final void gC(Object obj) {
                ConsentsChimeraActivity consentsChimeraActivity = ConsentsChimeraActivity.this;
                cpar cparVar = (cpar) obj;
                if (!((cnuu) consentsChimeraActivity).s) {
                    TransitionManager.beginDelayedTransition((ViewGroup) consentsChimeraActivity.findViewById(android.R.id.content));
                }
                consentsChimeraActivity.w.setVisibility(8);
                consentsChimeraActivity.z.setText(cparVar.a);
                cnvw cnvwVar = new cnvw(consentsChimeraActivity, cparVar);
                String str = cparVar.b;
                SpannableString spannableString = new SpannableString(str + " " + consentsChimeraActivity.getString(R.string.sharing_consents_link_learn_more));
                spannableString.setSpan(cnvwVar, str.length() + 1, spannableString.length(), 33);
                consentsChimeraActivity.A.setText(spannableString);
                consentsChimeraActivity.A.setMovementMethod(LinkMovementMethod.getInstance());
                consentsChimeraActivity.B.setText(cparVar.c);
                consentsChimeraActivity.D.setText(cparVar.f);
                consentsChimeraActivity.E.setText(cparVar.e);
                consentsChimeraActivity.C.setVisibility(8);
                consentsChimeraActivity.x.setVisibility(0);
                consentsChimeraActivity.z.setVisibility(0);
                consentsChimeraActivity.A.setVisibility(0);
                consentsChimeraActivity.B.setVisibility(0);
                consentsChimeraActivity.D.setVisibility(0);
                consentsChimeraActivity.E.setVisibility(0);
            }
        });
        c2.y(new dhln() { // from class: cnvq
            @Override // defpackage.dhln
            public final void gB(Exception exc) {
                ConsentsChimeraActivity.this.w();
            }
        });
    }

    public final void v() {
        Toast.makeText(this, getResources().getString(R.string.sharing_consents_toast_no_account_error), 0).show();
    }

    public final void w() {
        Toast.makeText(this, getResources().getString(R.string.sharing_consents_toast_no_network_error), 0).show();
    }
}

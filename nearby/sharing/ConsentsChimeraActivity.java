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
import defpackage.cfcs;
import defpackage.clmm;
import defpackage.cmck;
import defpackage.cmdh;
import defpackage.cmfe;
import defpackage.cmfy;
import defpackage.cmsq;
import defpackage.crll;
import defpackage.dfah;
import defpackage.dfak;
import defpackage.dfaq;
import defpackage.exxv;
import defpackage.exzg;
import defpackage.eygi;
import defpackage.fecj;
import defpackage.fecp;
import defpackage.fqmf;
import defpackage.fqmk;
import defpackage.iln;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class ConsentsChimeraActivity extends clmm {
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
        public final void jz(Context context, Intent intent) {
            String action = intent.getAction();
            if (action != null && action.equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
                boolean z = false;
                if (connectivityManager == null) {
                    cmfe.a.e().p("Failed to get connectivity manager.", new Object[0]);
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

    @Override // defpackage.clmm
    protected final eygi l() {
        return eygi.USE_CASE_NEARBY_SHARE;
    }

    @Override // defpackage.clmm
    protected final String m() {
        return "com.google.android.gms.nearby.sharing.ConsentsActivity";
    }

    @Override // defpackage.clmm, defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!fqmf.bd()) {
            finish();
            return;
        }
        if (fqmk.d().isEmpty() && cmfy.a(this) == null) {
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
        this.C.setOnClickListener(new View.OnClickListener() { // from class: clnc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsentsChimeraActivity.this.t();
            }
        });
        this.D.setOnClickListener(new View.OnClickListener() { // from class: clnf
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConsentsChimeraActivity.this.t();
            }
        });
        this.E.setOnClickListener(new View.OnClickListener() { // from class: clng
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                final ConsentsChimeraActivity consentsChimeraActivity = ConsentsChimeraActivity.this;
                Account a = consentsChimeraActivity.a();
                if (a == null) {
                    cmfe.a.b().p("Unable to enable device contacts: account is null.", new Object[0]);
                    consentsChimeraActivity.v();
                }
                dfaq b = cmsq.a(consentsChimeraActivity).b(a);
                b.z(new dfak() { // from class: clnk
                    @Override // defpackage.dfak
                    public final void gn(Object obj) {
                        boolean booleanValue = ((Boolean) obj).booleanValue();
                        ConsentsChimeraActivity consentsChimeraActivity2 = ConsentsChimeraActivity.this;
                        if (!booleanValue) {
                            consentsChimeraActivity2.F = 4;
                            cmfe.a.e().p("Unable to enable device contacts.", new Object[0]);
                            consentsChimeraActivity2.w();
                        } else {
                            cmfe.a.b().p("Successfully enabled device contacts.", new Object[0]);
                            consentsChimeraActivity2.setResult(-1);
                            consentsChimeraActivity2.F = 2;
                            consentsChimeraActivity2.finishAfterTransition();
                        }
                    }
                });
                b.y(new dfah() { // from class: clnl
                    @Override // defpackage.dfah
                    public final void gm(Exception exc) {
                        ConsentsChimeraActivity consentsChimeraActivity2 = ConsentsChimeraActivity.this;
                        consentsChimeraActivity2.F = 4;
                        cmfe.a.e().f(exc).p("Unable to enable device contacts.", new Object[0]);
                        consentsChimeraActivity2.w();
                    }
                });
            }
        });
    }

    @Override // defpackage.clmm, defpackage.qet, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        super.onDestroy();
        int i = this.F;
        fecj L = cmdh.L(43);
        fecj v = exxv.a.v();
        if (!v.b.L()) {
            v.U();
        }
        fecp fecpVar = v.b;
        exxv exxvVar = (exxv) fecpVar;
        exxvVar.c = 2;
        exxvVar.b |= 1;
        if (!fecpVar.L()) {
            v.U();
        }
        exxv exxvVar2 = (exxv) v.b;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        }
        exxvVar2.d = i2;
        exxvVar2.b |= 2;
        exxv exxvVar3 = (exxv) v.Q();
        if (!L.b.L()) {
            L.U();
        }
        exzg exzgVar = (exzg) L.b;
        exzg exzgVar2 = exzg.a;
        exxvVar3.getClass();
        exzgVar.P = exxvVar3;
        exzgVar.c |= 8192;
        p(new cmck((exzg) L.Q()));
    }

    @Override // defpackage.clmm, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        t();
        return true;
    }

    @Override // defpackage.clmm, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onPause() {
        super.onPause();
        cfcs.f(this, this.I);
    }

    @Override // defpackage.clmm, defpackage.qfw, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onResume() {
        super.onResume();
        iln.b(this, this.I, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
    }

    @Override // defpackage.clmm
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
            cmfe.a.e().p("Unable to enable device contacts: account is null.", new Object[0]);
            v();
            return;
        }
        this.H.setText(a.name);
        dfaq c = crll.c(this, a);
        final ImageView imageView = this.G;
        Objects.requireNonNull(imageView);
        c.z(new dfak() { // from class: clnm
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                imageView.setImageBitmap((Bitmap) obj);
            }
        });
        c.y(new dfah() { // from class: clnn
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                cmfe.a.b().f(exc).p("Failed to get account icon.", new Object[0]);
            }
        });
        dfaq d = crll.d(a);
        d.z(new dfak() { // from class: clnd
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                ConsentsChimeraActivity.this.y.setText(((crlk) obj).a);
            }
        });
        d.y(new dfah() { // from class: clne
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
                cmfe.a.b().f(exc).p("Failed to get the account name.", new Object[0]);
            }
        });
        dfaq c2 = cmsq.a(this).c(a);
        c2.z(new dfak() { // from class: clnh
            @Override // defpackage.dfak
            public final void gn(Object obj) {
                ConsentsChimeraActivity consentsChimeraActivity = ConsentsChimeraActivity.this;
                cmsj cmsjVar = (cmsj) obj;
                if (!((clmm) consentsChimeraActivity).s) {
                    TransitionManager.beginDelayedTransition((ViewGroup) consentsChimeraActivity.findViewById(android.R.id.content));
                }
                consentsChimeraActivity.w.setVisibility(8);
                consentsChimeraActivity.z.setText(cmsjVar.a);
                clno clnoVar = new clno(consentsChimeraActivity, cmsjVar);
                String str = cmsjVar.b;
                SpannableString spannableString = new SpannableString(str + " " + consentsChimeraActivity.getString(R.string.sharing_consents_link_learn_more));
                spannableString.setSpan(clnoVar, str.length() + 1, spannableString.length(), 33);
                consentsChimeraActivity.A.setText(spannableString);
                consentsChimeraActivity.A.setMovementMethod(LinkMovementMethod.getInstance());
                consentsChimeraActivity.B.setText(cmsjVar.c);
                consentsChimeraActivity.D.setText(cmsjVar.f);
                consentsChimeraActivity.E.setText(cmsjVar.e);
                consentsChimeraActivity.C.setVisibility(8);
                consentsChimeraActivity.x.setVisibility(0);
                consentsChimeraActivity.z.setVisibility(0);
                consentsChimeraActivity.A.setVisibility(0);
                consentsChimeraActivity.B.setVisibility(0);
                consentsChimeraActivity.D.setVisibility(0);
                consentsChimeraActivity.E.setVisibility(0);
            }
        });
        c2.y(new dfah() { // from class: clni
            @Override // defpackage.dfah
            public final void gm(Exception exc) {
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

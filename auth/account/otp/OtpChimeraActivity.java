package com.google.android.gms.auth.account.otp;

import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.google.android.chimera.Activity;
import com.google.android.gms.R;
import com.google.android.gms.auth.aang.GoogleAccount;
import com.google.android.gms.auth.account.otp.OtpChimeraActivity;
import com.google.android.gms.googlehelp.GoogleHelp;
import defpackage.armu;
import defpackage.arwm;
import defpackage.asej;
import defpackage.asin;
import defpackage.asmf;
import defpackage.asot;
import defpackage.asqh;
import defpackage.assa;
import defpackage.assb;
import defpackage.bipc;
import defpackage.eijx;
import defpackage.eitj;
import defpackage.fkdo;
import defpackage.fkkn;
import defpackage.ips;
import defpackage.qex;
import defpackage.uqw;
import defpackage.vky;
import defpackage.vle;
import defpackage.vlh;
import defpackage.vlm;
import defpackage.vln;
import defpackage.vlo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class OtpChimeraActivity extends qex implements vlo {
    public assb h;
    public vlh i;
    public String j;
    public boolean k;
    public uqw l;
    private View m;
    private View n;
    private View o;
    private View p;
    private TextView q;
    private TextView r;
    private boolean s;
    private ExecutorService t;

    static {
        asot.b("OtpActivity", asej.AUTH_ACCOUNT_DATA);
    }

    private static String o(String str) {
        arwm.b(str.length() == 10);
        return str.substring(0, 4) + " " + str.substring(4, 7) + " " + str.substring(7);
    }

    private final void p(final TextView textView) {
        if (fkkn.a.a().a() && asqh.f()) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: vlb
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ClipboardManager clipboardManager = (ClipboardManager) OtpChimeraActivity.this.getSystemService("clipboard");
                    ClipData newPlainText = ClipData.newPlainText(null, textView.getText());
                    PersistableBundle persistableBundle = new PersistableBundle();
                    persistableBundle.putBoolean("android.content.extra.IS_SENSITIVE", true);
                    newPlainText.getDescription().setExtras(persistableBundle);
                    clipboardManager.setPrimaryClip(newPlainText);
                }
            });
        }
    }

    private final void q() {
        this.t.execute(new Runnable() { // from class: vld
            @Override // java.lang.Runnable
            public final void run() {
                final ArrayList arrayList = new ArrayList();
                final OtpChimeraActivity otpChimeraActivity = OtpChimeraActivity.this;
                eitj e = otpChimeraActivity.l.e("com.google");
                int size = e.size();
                for (int i = 0; i < size; i++) {
                    Account b = uqw.b((GoogleAccount) e.get(i));
                    if (!eiif.c(otpChimeraActivity.l.i(b))) {
                        arrayList.add(b);
                    }
                }
                otpChimeraActivity.runOnUiThread(new Runnable() { // from class: vlc
                    @Override // java.lang.Runnable
                    public final void run() {
                        OtpChimeraActivity.this.j(arrayList);
                    }
                });
            }
        });
    }

    private final void r(View view) {
        this.m.setVisibility(8);
        this.n.setVisibility(8);
        this.o.setVisibility(8);
        this.p.setVisibility(8);
        view.setVisibility(0);
    }

    public final void j(List list) {
        this.s = true;
        this.i = new vlh(this, new vln(new vky(this), new vlm(this)));
        if (fkdo.k()) {
            assa assaVar = new assa(jB());
            assaVar.a = getTitle();
            assaVar.d = eitj.i(list);
            this.h = assaVar.a();
        } else {
            assa assaVar2 = new assa(jB());
            assaVar2.a = getTitle();
            this.h = assaVar2.a();
        }
        assb assbVar = this.h;
        assbVar.d = new vle(this);
        if (assbVar.getCount() == 0) {
            r(this.o);
        } else {
            this.j = this.h.d();
            this.i.a(this.h.d(), this.k);
        }
    }

    @Override // defpackage.vlo
    public final void k(String str, String str2) {
        if (str.length() != 10 || str2.length() != 10) {
            l();
            return;
        }
        this.q.setText("\u202d".concat(o(str)));
        this.r.setText("\u202d".concat(o(str2)));
        r(this.n);
    }

    @Override // defpackage.vlo
    public final void l() {
        r(this.p);
    }

    @Override // defpackage.vlo
    public final void m() {
        r(this.m);
    }

    @Override // defpackage.vlo
    public final void n(String str) {
        if (str.length() == 8) {
            str.substring(0, 4);
            str.substring(4);
        }
        throw null;
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i, intent);
        if (i != 0 || i2 != -1) {
            onBackPressed();
            return;
        }
        this.k = true;
        if (fkdo.k()) {
            q();
        } else {
            j(null);
        }
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        assb assbVar = this.h;
        assbVar.b = getTitle();
        assbVar.notifyDataSetChanged();
    }

    @Override // defpackage.qex, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(8192);
        this.k = false;
        setTheme(R.style.IdentityWhiteAppTheme);
        setContentView(R.layout.ten_digit_otp_dialog);
        this.q = (TextView) findViewById(R.id.otp_code1);
        this.r = (TextView) findViewById(R.id.otp_code2);
        p(this.q);
        p(this.r);
        this.m = findViewById(R.id.otp_wheel);
        this.n = findViewById(R.id.otp_results);
        this.p = findViewById(R.id.otp_error);
        this.o = findViewById(R.id.otp_no_accounts_available);
        int i = ips.a;
        jB().o(true);
        this.l = (uqw) uqw.a.b();
        this.t = new asmf(1, 9);
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        if (keyguardManager.isDeviceSecure()) {
            startActivityForResult(keyguardManager.createConfirmDeviceCredentialIntent(null, null), 0);
        } else if (fkdo.k()) {
            q();
        } else {
            j(null);
        }
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.otp_dialog, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        if (menuItem.getItemId() != R.id.auth_otp_help_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        String str = (String) ((eijx) armu.d).a;
        GoogleHelp googleHelp = new GoogleHelp("android_security");
        googleHelp.b(this);
        googleHelp.s = asin.a();
        googleHelp.q = Uri.parse(str);
        new bipc((Activity) this).a(googleHelp.a());
        return true;
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onPause() {
        super.onPause();
        if (this.s) {
            onBackPressed();
        }
        super.onPause();
    }
}

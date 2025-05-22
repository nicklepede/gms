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
import defpackage.atpj;
import defpackage.atzb;
import defpackage.auid;
import defpackage.aumh;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.auub;
import defpackage.auvu;
import defpackage.auvv;
import defpackage.bktr;
import defpackage.ekxc;
import defpackage.elgo;
import defpackage.fmua;
import defpackage.fnbc;
import defpackage.iri;
import defpackage.ryb;
import defpackage.wmv;
import defpackage.xgz;
import defpackage.xhf;
import defpackage.xhi;
import defpackage.xhn;
import defpackage.xho;
import defpackage.xhp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class OtpChimeraActivity extends ryb implements xhp {
    public auvv h;
    public xhi i;
    public String j;
    public boolean k;
    public wmv l;
    private View m;
    private View n;
    private View o;
    private View p;
    private TextView q;
    private TextView r;
    private boolean s;
    private ExecutorService t;

    static {
        ausn.b("OtpActivity", auid.AUTH_ACCOUNT_DATA);
    }

    private static String o(String str) {
        atzb.b(str.length() == 10);
        return str.substring(0, 4) + " " + str.substring(4, 7) + " " + str.substring(7);
    }

    private final void p(final TextView textView) {
        if (fnbc.a.lK().a() && auub.f()) {
            textView.setOnClickListener(new View.OnClickListener() { // from class: xhc
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
        this.t.execute(new Runnable() { // from class: xhe
            @Override // java.lang.Runnable
            public final void run() {
                final ArrayList arrayList = new ArrayList();
                final OtpChimeraActivity otpChimeraActivity = OtpChimeraActivity.this;
                elgo e = otpChimeraActivity.l.e("com.google");
                int size = e.size();
                for (int i = 0; i < size; i++) {
                    Account b = wmv.b((GoogleAccount) e.get(i));
                    if (!ekvk.c(otpChimeraActivity.l.i(b))) {
                        arrayList.add(b);
                    }
                }
                otpChimeraActivity.runOnUiThread(new Runnable() { // from class: xhd
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
        this.i = new xhi(this, new xho(new xgz(this), new xhn(this)));
        if (fmua.k()) {
            auvu auvuVar = new auvu(jR());
            auvuVar.a = getTitle();
            auvuVar.d = elgo.i(list);
            this.h = auvuVar.a();
        } else {
            auvu auvuVar2 = new auvu(jR());
            auvuVar2.a = getTitle();
            this.h = auvuVar2.a();
        }
        auvv auvvVar = this.h;
        auvvVar.d = new xhf(this);
        if (auvvVar.getCount() == 0) {
            r(this.o);
        } else {
            this.j = this.h.d();
            this.i.a(this.h.d(), this.k);
        }
    }

    @Override // defpackage.xhp
    public final void k(String str, String str2) {
        if (str.length() != 10 || str2.length() != 10) {
            l();
            return;
        }
        this.q.setText("\u202d".concat(o(str)));
        this.r.setText("\u202d".concat(o(str2)));
        r(this.n);
    }

    @Override // defpackage.xhp
    public final void l() {
        r(this.p);
    }

    @Override // defpackage.xhp
    public final void m() {
        r(this.m);
    }

    @Override // defpackage.xhp
    public final void n(String str) {
        if (str.length() == 8) {
            str.substring(0, 4);
            str.substring(4);
        }
        throw null;
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i, intent);
        if (i != 0 || i2 != -1) {
            onBackPressed();
            return;
        }
        this.k = true;
        if (fmua.k()) {
            q();
        } else {
            j(null);
        }
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        auvv auvvVar = this.h;
        auvvVar.b = getTitle();
        auvvVar.notifyDataSetChanged();
    }

    @Override // defpackage.ryb, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
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
        int i = iri.a;
        jR().o(true);
        this.l = (wmv) wmv.a.b();
        this.t = new aupz(1, 9);
        KeyguardManager keyguardManager = (KeyguardManager) getSystemService("keyguard");
        if (keyguardManager.isDeviceSecure()) {
            startActivityForResult(keyguardManager.createConfirmDeviceCredentialIntent(null, null), 0);
        } else if (fmua.k()) {
            q();
        } else {
            j(null);
        }
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.otp_dialog, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
            return true;
        }
        if (menuItem.getItemId() != R.id.auth_otp_help_item) {
            return super.onOptionsItemSelected(menuItem);
        }
        String str = (String) ((ekxc) atpj.d).a;
        GoogleHelp googleHelp = new GoogleHelp("android_security");
        googleHelp.b(this);
        googleHelp.s = aumh.a();
        googleHelp.q = Uri.parse(str);
        new bktr((Activity) this).a(googleHelp.a());
        return true;
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onPause() {
        super.onPause();
        if (this.s) {
            onBackPressed();
        }
        super.onPause();
    }
}

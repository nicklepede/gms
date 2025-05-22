package com.google.android.gms.auth.frp;

import android.accounts.Account;
import android.accounts.AccountManagerCallback;
import android.accounts.AccountManagerFuture;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemProperties;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;
import defpackage.adoi;
import defpackage.adoj;
import defpackage.afkn;
import defpackage.auad;
import defpackage.aupp;
import defpackage.aupq;
import defpackage.bsup;
import defpackage.dxyi;
import defpackage.efwo;
import defpackage.fmtw;
import defpackage.fnbr;
import defpackage.xbw;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class PreFactoryResetChimeraActivity extends afkn implements AccountManagerCallback {
    private static final auad l = new auad("Auth", "PreFactoryResetChimeraActivity");
    Account h = null;
    boolean i = true;
    aupq j;
    bsup k;

    final void b() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // defpackage.afkn
    protected final String gW() {
        return "PreFactoryResetChimeraActivity";
    }

    @Override // defpackage.afkn
    protected final void gX() {
        String str = SystemProperties.get("setupwizard.theme", "glif_v3_light");
        efwo d = efwo.d();
        int i = d.a;
        String str2 = d.b;
        boolean z = d.c;
        int c = new efwo(R.style.SudThemeGlifV3_Light, false).c(str, false);
        efwo d2 = efwo.d();
        int i2 = d2.a;
        String str3 = d2.b;
        boolean z2 = d2.c;
        setTheme(new efwo(c, false).a(getIntent()));
    }

    @Override // defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            b();
        }
    }

    public void onCheckCredClicked(View view) {
        this.i = ((CheckBox) view).isChecked();
    }

    public void onContinue(View view) {
        if (this.i) {
            this.k.v(this.h, new Bundle(), null, this, new aupp(this.j));
        } else {
            b();
        }
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        dxyi dxyiVar = xbw.a;
        if (!fnbr.a.lK().a()) {
            b();
            return;
        }
        bsup b = bsup.b(this);
        this.k = b;
        Account[] p = b.p("com.google");
        if (p == null || p.length == 0) {
            b();
            return;
        }
        this.h = p[0];
        this.j = new aupq("PreFactoryResetChimerActivityHandler", 9);
        if (fmtw.d()) {
            setContentView(R.layout.pre_factory_reset_activity_v2);
            textView = ((GlifLayout) findViewById(R.id.pre_frp_glif)).y();
        } else {
            setContentView(R.layout.pre_factory_reset_activity);
            textView = (TextView) findViewById(R.id.pre_frp_text);
        }
        String str = this.h.name == null ? "" : this.h.name;
        String string = getString(R.string.auth_pre_wipe_credential_desc_text_filler);
        String string2 = getString(R.string.auth_pre_wipe_credential_desc_text, new Object[]{str, string});
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string2);
        adoi adoiVar = new adoi(this);
        spannableStringBuilder.setSpan(new adoj(), string2.indexOf(str), string2.indexOf(str) + str.length(), 33);
        spannableStringBuilder.setSpan(adoiVar, string2.indexOf(string), string2.indexOf(string) + string.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        CheckBox checkBox = (CheckBox) findViewById(R.id.check_cred);
        this.i = checkBox.isChecked();
        checkBox.setText(getString(R.string.auth_pre_wipe_credential_check_text, new Object[]{this.h.name}));
    }

    @Override // defpackage.afkn, defpackage.ryr, defpackage.rtq, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onDestroy() {
        super.onDestroy();
        aupq aupqVar = this.j;
        if (aupqVar != null) {
            aupqVar.quitSafely();
        }
    }

    @Override // android.accounts.AccountManagerCallback
    public final void run(AccountManagerFuture accountManagerFuture) {
        try {
            startActivityForResult((Intent) ((Bundle) accountManagerFuture.getResult()).getParcelable("intent"), 3);
        } catch (Exception e) {
            l.n("Canceled account confirmation, do nothing", e, new Object[0]);
        }
    }
}

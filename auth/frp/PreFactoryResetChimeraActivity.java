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
import defpackage.aboi;
import defpackage.aboj;
import defpackage.adkg;
import defpackage.arxo;
import defpackage.aslv;
import defpackage.aslw;
import defpackage.bqna;
import defpackage.dvni;
import defpackage.edjt;
import defpackage.fkdk;
import defpackage.fklc;
import defpackage.vfv;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class PreFactoryResetChimeraActivity extends adkg implements AccountManagerCallback {
    private static final arxo l = new arxo("Auth", "PreFactoryResetChimeraActivity");
    Account h = null;
    boolean i = true;
    aslw j;
    bqna k;

    final void b() {
        setResult(-1, new Intent());
        finish();
    }

    @Override // defpackage.adkg
    protected final String gG() {
        return "PreFactoryResetChimeraActivity";
    }

    @Override // defpackage.adkg
    protected final void gH() {
        String str = SystemProperties.get("setupwizard.theme", "glif_v3_light");
        edjt d = edjt.d();
        int i = d.a;
        String str2 = d.b;
        boolean z = d.c;
        int c = new edjt(R.style.SudThemeGlifV3_Light, false).c(str, false);
        edjt d2 = edjt.d();
        int i2 = d2.a;
        String str3 = d2.b;
        boolean z2 = d2.c;
        setTheme(new edjt(c, false).a(getIntent()));
    }

    @Override // defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
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
            this.k.v(this.h, new Bundle(), null, this, new aslv(this.j));
        } else {
            b();
        }
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onCreate(Bundle bundle) {
        TextView textView;
        super.onCreate(bundle);
        dvni dvniVar = vfv.a;
        if (!fklc.a.a().a()) {
            b();
            return;
        }
        bqna b = bqna.b(this);
        this.k = b;
        Account[] p = b.p("com.google");
        if (p == null || p.length == 0) {
            b();
            return;
        }
        this.h = p[0];
        this.j = new aslw("PreFactoryResetChimerActivityHandler", 9);
        if (fkdk.d()) {
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
        aboi aboiVar = new aboi(this);
        spannableStringBuilder.setSpan(new aboj(), string2.indexOf(str), string2.indexOf(str) + str.length(), 33);
        spannableStringBuilder.setSpan(aboiVar, string2.indexOf(string), string2.indexOf(string) + string.length(), 33);
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        CheckBox checkBox = (CheckBox) findViewById(R.id.check_cred);
        this.i = checkBox.isChecked();
        checkBox.setText(getString(R.string.auth_pre_wipe_credential_check_text, new Object[]{this.h.name}));
    }

    @Override // defpackage.adkg, defpackage.qfn, defpackage.qam, com.google.android.chimera.android.Activity, defpackage.qaj
    public final void onDestroy() {
        super.onDestroy();
        aslw aslwVar = this.j;
        if (aslwVar != null) {
            aslwVar.quitSafely();
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

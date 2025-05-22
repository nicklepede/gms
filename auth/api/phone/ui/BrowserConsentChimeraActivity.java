package com.google.android.gms.auth.api.phone.ui;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.gms.R;
import defpackage.abmb;
import defpackage.abmv;
import defpackage.abmw;
import defpackage.abmx;
import defpackage.abnn;
import defpackage.abns;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auwr;
import defpackage.edwd;
import defpackage.eluo;
import defpackage.rxx;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class BrowserConsentChimeraActivity extends rxx {
    private static final ausn o = ausn.a("BrowserConsentChimeraActivity");
    public abns j;
    public Context k;
    public String l;
    public abmb m;
    edwd n;

    private final boolean k(String str) {
        if (TextUtils.isEmpty(str)) {
            ((eluo) o.h()).x("Not from startActivityForResult(). This calling is invalid.");
            return false;
        }
        if (abnn.d(this.k, str)) {
            return true;
        }
        ((eluo) o.h()).x("Caller is not current default browser. This calling is invalid.");
        return false;
    }

    public final void a() {
        this.m.c();
        setResult(0);
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.k = getApplicationContext();
        this.j = new abns();
        String q = aura.q(this);
        if (!k(q)) {
            this.j.k(this.k, abns.r(q, 10));
            finish();
            return;
        }
        this.l = q;
        this.j.k(this.k, abns.r(q, 0));
        this.m = new abmb(this.k);
        edwd edwdVar = new edwd(this, R.style.BottomSheetDialogTheme);
        this.n = edwdVar;
        edwdVar.setCanceledOnTouchOutside(false);
        edwd edwdVar2 = this.n;
        String str = this.l;
        View inflate = getLayoutInflater().inflate(R.layout.sms_user_consent_fragment, (ViewGroup) null);
        TextView textView = (TextView) inflate.findViewById(R.id.consent_description);
        try {
            String charSequence = auwr.b(this.k).h(str).toString();
            if (!TextUtils.isEmpty(charSequence)) {
                str = charSequence;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        String string = getString(R.string.sms_code_browser_consent_title, new Object[]{str});
        SpannableString spannableString = new SpannableString(string);
        int indexOf = string.indexOf(str);
        spannableString.setSpan(new StyleSpan(1), indexOf, str.length() + indexOf, 33);
        textView.setText(spannableString);
        ((TextView) inflate.findViewById(R.id.matched_sms)).setText(getString(R.string.sms_code_autofill_consent_message_for_settings_under_autofill_subcategory));
        ((Button) inflate.findViewById(R.id.negative_button)).setOnClickListener(new abmw(this));
        ((Button) inflate.findViewById(R.id.positive_button)).setOnClickListener(new abmx(this));
        edwdVar2.setContentView(inflate);
        this.n.setOnCancelListener(new abmv(this));
        this.n.show();
    }

    @Override // defpackage.rxx, defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onDestroy() {
        super.onDestroy();
        edwd edwdVar = this.n;
        if (edwdVar == null || !edwdVar.isShowing()) {
            return;
        }
        this.n.dismiss();
    }

    @Override // defpackage.rza, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onResume() {
        super.onResume();
        if (k(aura.q(this))) {
            return;
        }
        finish();
    }
}
